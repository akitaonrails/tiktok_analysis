package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229911CPl extends Message<C2229911CPl, C2229931CPn> {
    public static final ProtoAdapter<C2229911CPl> ADAPTER = new ProtoAdapter<C2229911CPl>() { // from class: X.1CPm
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229911CPl decode(ProtoReader protoReader) {
            C2229931CPn c2229931CPn = new C2229931CPn();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2229931CPn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2229931CPn.LIZLLL = C1CQM.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229931CPn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229911CPl c2229911CPl) {
            C2229911CPl c2229911CPl2 = c2229911CPl;
            return C1CQM.ADAPTER.encodedSizeWithTag(1, c2229911CPl2.ret) + c2229911CPl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229911CPl redact(C2229911CPl c2229911CPl) {
            C2229931CPn c2229931CPnNewBuilder = c2229911CPl.newBuilder();
            c2229931CPnNewBuilder.LIZLLL = C1CQM.ADAPTER.redact(c2229931CPnNewBuilder.LIZLLL);
            c2229931CPnNewBuilder.clearUnknownFields();
            return c2229931CPnNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229911CPl c2229911CPl) {
            C2229911CPl c2229911CPl2 = c2229911CPl;
            C1CQM.ADAPTER.encodeWithTag(protoWriter, 1, c2229911CPl2.ret);
            protoWriter.writeBytes(c2229911CPl2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.SyeState#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CQM ret;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.ret.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229931CPn newBuilder() {
        C2229931CPn c2229931CPn = new C2229931CPn();
        c2229931CPn.LIZLLL = this.ret;
        c2229931CPn.addUnknownFields(unknownFields());
        return c2229931CPn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX95f079ed92d5a69b{");
        sb.append('}');
        return sb.toString();
    }

    public C2229911CPl(C1CQM c1cqm) {
        this(c1cqm, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229911CPl)) {
            return false;
        }
        C2229911CPl c2229911CPl = (C2229911CPl) obj;
        if (unknownFields().equals(c2229911CPl.unknownFields()) && this.ret.equals(c2229911CPl.ret)) {
            return true;
        }
        return false;
    }

    public C2229911CPl(C1CQM c1cqm, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c1cqm;
    }
}
