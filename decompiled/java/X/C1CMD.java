package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMD extends Message<C1CMD, C1CMF> {
    public static final ProtoAdapter<C1CMD> ADAPTER = new ProtoAdapter<C1CMD>() { // from class: X.1CME
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CMD decode(ProtoReader protoReader) {
            C1CMF c1cmf = new C1CMF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cmf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cmf.LJFF = ProtoAdapter.BYTES.decode(protoReader);
                            }
                        } else {
                            c1cmf.LJ = C1CMV.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cmf.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cmf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CMD c1cmd) {
            C1CMD c1cmd2 = c1cmd;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cmd2.invoke_id) + C1CMV.ADAPTER.encodedSizeWithTag(2, c1cmd2.error) + ProtoAdapter.BYTES.encodedSizeWithTag(3, c1cmd2.content) + c1cmd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CMD redact(C1CMD c1cmd) {
            C1CMF c1cmfNewBuilder = c1cmd.newBuilder();
            c1cmfNewBuilder.LJ = C1CMV.ADAPTER.redact(c1cmfNewBuilder.LJ);
            c1cmfNewBuilder.clearUnknownFields();
            return c1cmfNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CMD c1cmd) {
            C1CMD c1cmd2 = c1cmd;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cmd2.invoke_id);
            C1CMV.ADAPTER.encodeWithTag(protoWriter, 2, c1cmd2.error);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, c1cmd2.content);
            protoWriter.writeBytes(c1cmd2.unknownFields());
        }
    };
    public static final ByteString DEFAULT_CONTENT = ByteString.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 3)
    public final ByteString content;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicError#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CMV error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.error.hashCode()) * 37;
        ByteString byteString = this.content;
        int iHashCode2 = iHashCode + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CMF newBuilder() {
        C1CMF c1cmf = new C1CMF();
        c1cmf.LIZLLL = this.invoke_id;
        c1cmf.LJ = this.error;
        c1cmf.LJFF = this.content;
        c1cmf.addUnknownFields(unknownFields());
        return c1cmf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", error=");
        sb.append(this.error);
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        sb.replace(0, 2, "LinkMicReqFailedModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CMD)) {
            return false;
        }
        C1CMD c1cmd = (C1CMD) obj;
        if (unknownFields().equals(c1cmd.unknownFields()) && this.invoke_id.equals(c1cmd.invoke_id) && this.error.equals(c1cmd.error) && C1516540pZE.LJ(this.content, c1cmd.content)) {
            return true;
        }
        return false;
    }

    public C1CMD(String str, C1CMV c1cmv, ByteString byteString) {
        this(str, c1cmv, byteString, ByteString.EMPTY);
    }

    public C1CMD(String str, C1CMV c1cmv, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.invoke_id = str;
        this.error = c1cmv;
        this.content = byteString;
    }
}
