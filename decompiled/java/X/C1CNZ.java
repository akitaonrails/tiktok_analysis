package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CNZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNZ extends Message<C1CNZ, C2229281CNa> {
    public static final ProtoAdapter<C1CNZ> ADAPTER = new ProtoAdapter<C1CNZ>() { // from class: X.1CNY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CNZ decode(ProtoReader protoReader) {
            C2229281CNa c2229281CNa = new C2229281CNa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2229281CNa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2229281CNa.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229281CNa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CNZ c1cnz) {
            C1CNZ c1cnz2 = c1cnz;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cnz2.screen_share_stream_id) + c1cnz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CNZ redact(C1CNZ c1cnz) {
            C2229281CNa c2229281CNaNewBuilder = c1cnz.newBuilder();
            c2229281CNaNewBuilder.clearUnknownFields();
            return c2229281CNaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CNZ c1cnz) {
            C1CNZ c1cnz2 = c1cnz;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cnz2.screen_share_stream_id);
            protoWriter.writeBytes(c1cnz2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String screen_share_stream_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.screen_share_stream_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229281CNa newBuilder() {
        C2229281CNa c2229281CNa = new C2229281CNa();
        c2229281CNa.LIZLLL = this.screen_share_stream_id;
        c2229281CNa.addUnknownFields(unknownFields());
        return c2229281CNa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", screen_share_stream_id=");
        sb.append(this.screen_share_stream_id);
        sb.replace(0, 2, "LinkMicCohostStreamConfig{");
        sb.append('}');
        return sb.toString();
    }

    public C1CNZ(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CNZ)) {
            return false;
        }
        C1CNZ c1cnz = (C1CNZ) obj;
        if (unknownFields().equals(c1cnz.unknownFields()) && this.screen_share_stream_id.equals(c1cnz.screen_share_stream_id)) {
            return true;
        }
        return false;
    }

    public C1CNZ(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.screen_share_stream_id = str;
    }
}
