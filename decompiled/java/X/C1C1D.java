package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1D, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C1D extends Message<C1C1D, C1C1F> {
    public static final ProtoAdapter<C1C1D> ADAPTER = new ProtoAdapter<C1C1D>() { // from class: X.1C1E
        public final ProtoAdapter<Map<Long, C062F>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, C062F.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C1D decode(ProtoReader protoReader) {
            C1C1F c1c1f = new C1C1F();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c1f.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c1f.LIZLLL.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c1f.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C1D c1c1d) {
            C1C1D c1c1d2 = c1c1d;
            return this.LIZ.encodedSizeWithTag(1, c1c1d2.feedback_map) + c1c1d2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C1D redact(C1C1D c1c1d) {
            C1C1F c1c1fNewBuilder = c1c1d.newBuilder();
            c1c1fNewBuilder.clearUnknownFields();
            return c1c1fNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C1D c1c1d) {
            C1C1D c1c1d2 = c1c1d;
            this.LIZ.encodeWithTag(protoWriter, 1, c1c1d2.feedback_map);
            protoWriter.writeBytes(c1c1d2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.BotFeedbackType#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Map<Long, C062F> feedback_map;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.feedback_map.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C1F newBuilder() {
        C1C1F c1c1f = new C1C1F();
        c1c1f.LIZLLL = C1516540pZE.LIZLLL("feedback_map", this.feedback_map);
        c1c1f.addUnknownFields(unknownFields());
        return c1c1f;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.feedback_map.isEmpty()) {
            sb.append(", feedback_map=");
            sb.append(this.feedback_map);
        }
        sb.replace(0, 2, "BotFeedback{");
        sb.append('}');
        return sb.toString();
    }

    public C1C1D(Map<Long, C062F> map) {
        this(map, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C1D)) {
            return false;
        }
        C1C1D c1c1d = (C1C1D) obj;
        if (unknownFields().equals(c1c1d.unknownFields()) && this.feedback_map.equals(c1c1d.feedback_map)) {
            return true;
        }
        return false;
    }

    public C1C1D(Map<Long, C062F> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feedback_map = C1516540pZE.LJI("feedback_map", map);
    }
}
