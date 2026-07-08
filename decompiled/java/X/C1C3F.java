package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3F, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3F extends Message<C1C3F, C1C3H> {
    public static final ProtoAdapter<C1C3F> ADAPTER = new ProtoAdapter<C1C3F>() { // from class: X.1C3G
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C3F decode(ProtoReader protoReader) {
            C1C3H c1c3h = new C1C3H();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1c3h.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1c3h.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1c3h.LIZLLL.add(C2272721DxW.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c3h.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C3F c1c3f) {
            C1C3F c1c3f2 = c1c3f;
            return C2272721DxW.ADAPTER.asRepeated().encodedSizeWithTag(1, c1c3f2.streaks) + ProtoAdapter.INT64.encodedSizeWithTag(2, c1c3f2.timestamp_millis) + c1c3f2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C3F redact(C1C3F c1c3f) {
            C1C3H c1c3hNewBuilder = c1c3f.newBuilder();
            C1516540pZE.LJIIIZ(c1c3hNewBuilder.LIZLLL, C2272721DxW.ADAPTER);
            c1c3hNewBuilder.clearUnknownFields();
            return c1c3hNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C3F c1c3f) {
            C1C3F c1c3f2 = c1c3f;
            C2272721DxW.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c1c3f2.streaks);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c1c3f2.timestamp_millis);
            protoWriter.writeBytes(c1c3f2.unknownFields());
        }
    };
    public static final Long DEFAULT_TIMESTAMP_MILLIS = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streak.impl.api.idl.StreakValue#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C2272721DxW> streaks;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long timestamp_millis;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.streaks.hashCode()) * 37;
        Long l = this.timestamp_millis;
        int iHashCode2 = iHashCode + (l != null ? l.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1C3H newBuilder() {
        C1C3H c1c3h = new C1C3H();
        c1c3h.LIZLLL = C1516540pZE.LIZJ("streaks", this.streaks);
        c1c3h.LJ = this.timestamp_millis;
        c1c3h.addUnknownFields(unknownFields());
        return c1c3h;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.streaks.isEmpty()) {
            sb.append(", streaks=");
            sb.append(this.streaks);
        }
        if (this.timestamp_millis != null) {
            sb.append(", timestamp_millis=");
            sb.append(this.timestamp_millis);
        }
        sb.replace(0, 2, "tiktok_v1_im_streaks_get_response{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C3F)) {
            return false;
        }
        C1C3F c1c3f = (C1C3F) obj;
        if (unknownFields().equals(c1c3f.unknownFields()) && this.streaks.equals(c1c3f.streaks) && C1516540pZE.LJ(this.timestamp_millis, c1c3f.timestamp_millis)) {
            return true;
        }
        return false;
    }

    public C1C3F(List<C2272721DxW> list, Long l) {
        this(list, l, ByteString.EMPTY);
    }

    public C1C3F(List<C2272721DxW> list, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.streaks = C1516540pZE.LJFF("streaks", list);
        this.timestamp_millis = l;
    }
}
