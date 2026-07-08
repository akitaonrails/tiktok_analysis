package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231551CVt extends Message<C2231551CVt, C2231571CVv> {
    public static final ProtoAdapter<C2231551CVt> ADAPTER = new ProtoAdapter<C2231551CVt>() { // from class: X.1CVu
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231551CVt decode(ProtoReader protoReader) {
            C2231571CVv c2231571CVv = new C2231571CVv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2231571CVv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2231571CVv.LIZLLL = C1CW6.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2231571CVv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2231551CVt c2231551CVt) {
            C2231551CVt c2231551CVt2 = c2231551CVt;
            return C1CW6.ADAPTER.encodedSizeWithTag(1, c2231551CVt2.ret) + c2231551CVt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231551CVt redact(C2231551CVt c2231551CVt) {
            C2231571CVv c2231571CVvNewBuilder = c2231551CVt.newBuilder();
            C1CW6 c1cw6 = c2231571CVvNewBuilder.LIZLLL;
            if (c1cw6 != null) {
                c2231571CVvNewBuilder.LIZLLL = C1CW6.ADAPTER.redact(c1cw6);
            }
            c2231571CVvNewBuilder.clearUnknownFields();
            return c2231571CVvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2231551CVt c2231551CVt) {
            C2231551CVt c2231551CVt2 = c2231551CVt;
            C1CW6.ADAPTER.encodeWithTag(protoWriter, 1, c2231551CVt2.ret);
            protoWriter.writeBytes(c2231551CVt2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicStateModel#ADAPTER", tag = 1)
    public final C1CW6 ret;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C1CW6 c1cw6 = this.ret;
        int iHashCode2 = iHashCode + (c1cw6 != null ? c1cw6.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2231571CVv newBuilder() {
        C2231571CVv c2231571CVv = new C2231571CVv();
        c2231571CVv.LIZLLL = this.ret;
        c2231571CVv.addUnknownFields(unknownFields());
        return c2231571CVv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ret != null) {
            sb.append(", ret=");
            sb.append(this.ret);
        }
        sb.replace(0, 2, "FuncReturnX2205d49b4c6f44e3{");
        sb.append('}');
        return sb.toString();
    }

    public C2231551CVt(C1CW6 c1cw6) {
        this(c1cw6, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2231551CVt)) {
            return false;
        }
        C2231551CVt c2231551CVt = (C2231551CVt) obj;
        if (unknownFields().equals(c2231551CVt.unknownFields()) && C1516540pZE.LJ(this.ret, c2231551CVt.ret)) {
            return true;
        }
        return false;
    }

    public C2231551CVt(C1CW6 c1cw6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c1cw6;
    }
}
