package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMP extends Message<C1CMP, C1CMR> {
    public static final ProtoAdapter<C1CMP> ADAPTER = new ProtoAdapter<C1CMP>() { // from class: X.1CMQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CMP decode(ProtoReader protoReader) {
            C1CMR c1cmr = new C1CMR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cmr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cmr.LJ = C1CMS.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cmr.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cmr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CMP c1cmp) {
            C1CMP c1cmp2 = c1cmp;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cmp2.invoke_id) + C1CMS.ADAPTER.encodedSizeWithTag(2, c1cmp2.content) + c1cmp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CMP redact(C1CMP c1cmp) {
            C1CMR c1cmrNewBuilder = c1cmp.newBuilder();
            c1cmrNewBuilder.LJ = C1CMS.ADAPTER.redact(c1cmrNewBuilder.LJ);
            c1cmrNewBuilder.clearUnknownFields();
            return c1cmrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CMP c1cmp) {
            C1CMP c1cmp2 = c1cmp;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cmp2.invoke_id);
            C1CMS.ADAPTER.encodeWithTag(protoWriter, 2, c1cmp2.content);
            protoWriter.writeBytes(c1cmp2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRespModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CMS content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.content.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CMR newBuilder() {
        C1CMR c1cmr = new C1CMR();
        c1cmr.LIZLLL = this.invoke_id;
        c1cmr.LJ = this.content;
        c1cmr.addUnknownFields(unknownFields());
        return c1cmr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", content=");
        sb.append(this.content);
        sb.replace(0, 2, "LinkMicReqSuccessModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CMP)) {
            return false;
        }
        C1CMP c1cmp = (C1CMP) obj;
        if (unknownFields().equals(c1cmp.unknownFields()) && this.invoke_id.equals(c1cmp.invoke_id) && this.content.equals(c1cmp.content)) {
            return true;
        }
        return false;
    }

    public C1CMP(String str, C1CMS c1cms) {
        this(str, c1cms, ByteString.EMPTY);
    }

    public C1CMP(String str, C1CMS c1cms, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.content = c1cms;
    }
}
