package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CSA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CSA extends Message<C1CSA, C1CSC> {
    public static final ProtoAdapter<C1CSA> ADAPTER = new ProtoAdapter<C1CSA>() { // from class: X.1CSB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CSA decode(ProtoReader protoReader) {
            C1CSC c1csc = new C1CSC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1csc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1csc.LJ = C2232601CZu.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1csc.LIZLLL = C2232591CZt.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1csc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CSA c1csa) {
            C1CSA c1csa2 = c1csa;
            return C2232591CZt.ADAPTER.encodedSizeWithTag(1, c1csa2.full_info) + C2232601CZu.ADAPTER.encodedSizeWithTag(2, c1csa2.diff_info) + c1csa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CSA redact(C1CSA c1csa) {
            C1CSC c1cscNewBuilder = c1csa.newBuilder();
            c1cscNewBuilder.LIZLLL = C2232591CZt.ADAPTER.redact(c1cscNewBuilder.LIZLLL);
            c1cscNewBuilder.LJ = C2232601CZu.ADAPTER.redact(c1cscNewBuilder.LJ);
            c1cscNewBuilder.clearUnknownFields();
            return c1cscNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CSA c1csa) {
            C1CSA c1csa2 = c1csa;
            C2232591CZt.ADAPTER.encodeWithTag(protoWriter, 1, c1csa2.full_info);
            C2232601CZu.ADAPTER.encodeWithTag(protoWriter, 2, c1csa2.diff_info);
            protoWriter.writeBytes(c1csa2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutDiffInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232601CZu diff_info;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRenderInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232591CZt full_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.full_info.hashCode()) * 37) + this.diff_info.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CSC newBuilder() {
        C1CSC c1csc = new C1CSC();
        c1csc.LIZLLL = this.full_info;
        c1csc.LJ = this.diff_info;
        c1csc.addUnknownFields(unknownFields());
        return c1csc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", full_info=");
        sb.append(this.full_info);
        sb.append(", diff_info=");
        sb.append(this.diff_info);
        sb.replace(0, 2, "LinkMicLayoutRenderResult{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CSA)) {
            return false;
        }
        C1CSA c1csa = (C1CSA) obj;
        if (unknownFields().equals(c1csa.unknownFields()) && this.full_info.equals(c1csa.full_info) && this.diff_info.equals(c1csa.diff_info)) {
            return true;
        }
        return false;
    }

    public C1CSA(C2232591CZt c2232591CZt, C2232601CZu c2232601CZu) {
        this(c2232591CZt, c2232601CZu, ByteString.EMPTY);
    }

    public C1CSA(C2232591CZt c2232591CZt, C2232601CZu c2232601CZu, ByteString byteString) {
        super(ADAPTER, byteString);
        this.full_info = c2232591CZt;
        this.diff_info = c2232601CZu;
    }
}
