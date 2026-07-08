package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CBO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBO extends Message<C1CBO, C1CBQ> {
    public static final ProtoAdapter<C1CBO> ADAPTER = new ProtoAdapter<C1CBO>() { // from class: X.1CBP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBO decode(ProtoReader protoReader) {
            C1CBQ c1cbq = new C1CBQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cbq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cbq.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cbq.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cbq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CBO c1cbo) {
            C1CBO c1cbo2 = c1cbo;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cbo2.message_method) + ProtoAdapter.INT64.encodedSizeWithTag(2, c1cbo2.message_handler) + c1cbo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBO redact(C1CBO c1cbo) {
            C1CBQ c1cbqNewBuilder = c1cbo.newBuilder();
            c1cbqNewBuilder.clearUnknownFields();
            return c1cbqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CBO c1cbo) {
            C1CBO c1cbo2 = c1cbo;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cbo2.message_method);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c1cbo2.message_handler);
            protoWriter.writeBytes(c1cbo2.unknownFields());
        }
    };
    public static final Long DEFAULT_MESSAGE_HANDLER = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long message_handler;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String message_method;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.message_method.hashCode()) * 37) + this.message_handler.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CBQ newBuilder() {
        C1CBQ c1cbq = new C1CBQ();
        c1cbq.LIZLLL = this.message_method;
        c1cbq.LJ = this.message_handler;
        c1cbq.addUnknownFields(unknownFields());
        return c1cbq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", message_method=");
        sb.append(this.message_method);
        sb.append(", message_handler=");
        sb.append(this.message_handler);
        sb.replace(0, 2, "FuncParamsXbe67fbe9dc7d218b{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CBO)) {
            return false;
        }
        C1CBO c1cbo = (C1CBO) obj;
        if (unknownFields().equals(c1cbo.unknownFields()) && this.message_method.equals(c1cbo.message_method) && this.message_handler.equals(c1cbo.message_handler)) {
            return true;
        }
        return false;
    }

    public C1CBO(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public C1CBO(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_method = str;
        this.message_handler = l;
    }
}
