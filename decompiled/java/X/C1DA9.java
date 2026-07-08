package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DA9, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DA9 extends Message<C1DA9, C1DAB> {
    public static final ProtoAdapter<C1DA9> ADAPTER = new ProtoAdapter<C1DA9>() { // from class: X.1DAA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DA9 decode(ProtoReader protoReader) {
            C1DAB c1dab = new C1DAB();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1dab.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1dab.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1dab.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1dab.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dab.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DA9 c1da9) {
            C1DA9 c1da92 = c1da9;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1da92.client_source) + protoAdapter.encodedSizeWithTag(2, c1da92.email_prefix) + protoAdapter.encodedSizeWithTag(3, c1da92.batch_task_system_message) + c1da92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DA9 redact(C1DA9 c1da9) {
            C1DAB c1dabNewBuilder = c1da9.newBuilder();
            c1dabNewBuilder.clearUnknownFields();
            return c1dabNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1DA9 c1da9) {
            C1DA9 c1da92 = c1da9;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1da92.client_source);
            protoAdapter.encodeWithTag(protoWriter, 2, c1da92.email_prefix);
            protoAdapter.encodeWithTag(protoWriter, 3, c1da92.batch_task_system_message);
            protoWriter.writeBytes(c1da92.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String batch_task_system_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String client_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String email_prefix;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.client_source;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.email_prefix;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.batch_task_system_message;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C1DAB newBuilder() {
        C1DAB c1dab = new C1DAB();
        c1dab.LIZLLL = this.client_source;
        c1dab.LJ = this.email_prefix;
        c1dab.LJFF = this.batch_task_system_message;
        c1dab.addUnknownFields(unknownFields());
        return c1dab;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.client_source != null) {
            sb.append(", client_source=");
            sb.append(this.client_source);
        }
        if (this.email_prefix != null) {
            sb.append(", email_prefix=");
            sb.append(this.email_prefix);
        }
        if (this.batch_task_system_message != null) {
            sb.append(", batch_task_system_message=");
            sb.append(this.batch_task_system_message);
        }
        sb.replace(0, 2, "OperaBizPersistentExtra{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1DA9)) {
            return false;
        }
        C1DA9 c1da9 = (C1DA9) obj;
        if (unknownFields().equals(c1da9.unknownFields()) && C1516540pZE.LJ(this.client_source, c1da9.client_source) && C1516540pZE.LJ(this.email_prefix, c1da9.email_prefix) && C1516540pZE.LJ(this.batch_task_system_message, c1da9.batch_task_system_message)) {
            return true;
        }
        return false;
    }

    public C1DA9(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public C1DA9(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.client_source = str;
        this.email_prefix = str2;
        this.batch_task_system_message = str3;
    }
}
