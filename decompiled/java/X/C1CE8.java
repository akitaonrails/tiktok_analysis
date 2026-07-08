package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CE8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CE8 extends Message<C1CE8, C1CEA> {
    public static final ProtoAdapter<C1CE8> ADAPTER = new ProtoAdapter<C1CE8>() { // from class: X.1CE9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CE8 decode(ProtoReader protoReader) {
            C1CEA c1cea = new C1CEA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cea.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cea.LJ = C1CE3.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cea.LIZLLL = C1CE6.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cea.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CE8 c1ce8) {
            C1CE8 c1ce82 = c1ce8;
            return C1CE6.ADAPTER.encodedSizeWithTag(1, c1ce82.history_visibility) + C1CE3.ADAPTER.encodedSizeWithTag(2, c1ce82.b2c_message_request) + c1ce82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CE8 redact(C1CE8 c1ce8) {
            C1CEA c1ceaNewBuilder = c1ce8.newBuilder();
            C1CE6 c1ce6 = c1ceaNewBuilder.LIZLLL;
            if (c1ce6 != null) {
                c1ceaNewBuilder.LIZLLL = C1CE6.ADAPTER.redact(c1ce6);
            }
            C1CE3 c1ce3 = c1ceaNewBuilder.LJ;
            if (c1ce3 != null) {
                c1ceaNewBuilder.LJ = C1CE3.ADAPTER.redact(c1ce3);
            }
            c1ceaNewBuilder.clearUnknownFields();
            return c1ceaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CE8 c1ce8) {
            C1CE8 c1ce82 = c1ce8;
            C1CE6.ADAPTER.encodeWithTag(protoWriter, 1, c1ce82.history_visibility);
            C1CE3.ADAPTER.encodeWithTag(protoWriter, 2, c1ce82.b2c_message_request);
            protoWriter.writeBytes(c1ce82.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.conversation.extension.proto.B2CMessageRequest#ADAPTER", tag = 2)
    public final C1CE3 b2c_message_request;

    @WireField(adapter = "com.bytedance.im.conversation.extension.proto.HistoryVisibilityExt#ADAPTER", tag = 1)
    public final C1CE6 history_visibility;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C1CE6 c1ce6 = this.history_visibility;
        int iHashCode2 = (iHashCode + (c1ce6 != null ? c1ce6.hashCode() : 0)) * 37;
        C1CE3 c1ce3 = this.b2c_message_request;
        int iHashCode3 = iHashCode2 + (c1ce3 != null ? c1ce3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1CEA newBuilder() {
        C1CEA c1cea = new C1CEA();
        c1cea.LIZLLL = this.history_visibility;
        c1cea.LJ = this.b2c_message_request;
        c1cea.addUnknownFields(unknownFields());
        return c1cea;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.history_visibility != null) {
            sb.append(", history_visibility=");
            sb.append(this.history_visibility);
        }
        if (this.b2c_message_request != null) {
            sb.append(", b2c_message_request=");
            sb.append(this.b2c_message_request);
        }
        sb.replace(0, 2, "CorePersistentExtra{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CE8)) {
            return false;
        }
        C1CE8 c1ce8 = (C1CE8) obj;
        if (unknownFields().equals(c1ce8.unknownFields()) && C1516540pZE.LJ(this.history_visibility, c1ce8.history_visibility) && C1516540pZE.LJ(this.b2c_message_request, c1ce8.b2c_message_request)) {
            return true;
        }
        return false;
    }

    public C1CE8(C1CE6 c1ce6, C1CE3 c1ce3) {
        this(c1ce6, c1ce3, ByteString.EMPTY);
    }

    public C1CE8(C1CE6 c1ce6, C1CE3 c1ce3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.history_visibility = c1ce6;
        this.b2c_message_request = c1ce3;
    }
}
