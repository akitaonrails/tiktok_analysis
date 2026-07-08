package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CaE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232801CaE extends Message<C2232801CaE, C2232821CaG> {
    public static final ProtoAdapter<C2232801CaE> ADAPTER = new ProtoAdapter<C2232801CaE>() { // from class: X.1CaF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232801CaE decode(ProtoReader protoReader) {
            C2232821CaG c2232821CaG = new C2232821CaG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2232821CaG.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2232821CaG.LIZLLL = C2232681Ca2.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232821CaG.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232801CaE c2232801CaE) {
            C2232801CaE c2232801CaE2 = c2232801CaE;
            return C2232681Ca2.ADAPTER.encodedSizeWithTag(1, c2232801CaE2.ret) + c2232801CaE2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232801CaE redact(C2232801CaE c2232801CaE) {
            C2232821CaG c2232821CaGNewBuilder = c2232801CaE.newBuilder();
            C2232681Ca2 c2232681Ca2 = c2232821CaGNewBuilder.LIZLLL;
            if (c2232681Ca2 != null) {
                c2232821CaGNewBuilder.LIZLLL = C2232681Ca2.ADAPTER.redact(c2232681Ca2);
            }
            c2232821CaGNewBuilder.clearUnknownFields();
            return c2232821CaGNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232801CaE c2232801CaE) {
            C2232801CaE c2232801CaE2 = c2232801CaE;
            C2232681Ca2.ADAPTER.encodeWithTag(protoWriter, 1, c2232801CaE2.ret);
            protoWriter.writeBytes(c2232801CaE2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutSimpleSeiResult#ADAPTER", tag = 1)
    public final C2232681Ca2 ret;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2232681Ca2 c2232681Ca2 = this.ret;
        int iHashCode2 = iHashCode + (c2232681Ca2 != null ? c2232681Ca2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2232821CaG newBuilder() {
        C2232821CaG c2232821CaG = new C2232821CaG();
        c2232821CaG.LIZLLL = this.ret;
        c2232821CaG.addUnknownFields(unknownFields());
        return c2232821CaG;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ret != null) {
            sb.append(", ret=");
            sb.append(this.ret);
        }
        sb.replace(0, 2, "FuncReturnX2f2131fad54cd961{");
        sb.append('}');
        return sb.toString();
    }

    public C2232801CaE(C2232681Ca2 c2232681Ca2) {
        this(c2232681Ca2, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232801CaE)) {
            return false;
        }
        C2232801CaE c2232801CaE = (C2232801CaE) obj;
        if (unknownFields().equals(c2232801CaE.unknownFields()) && C1516540pZE.LJ(this.ret, c2232801CaE.ret)) {
            return true;
        }
        return false;
    }

    public C2232801CaE(C2232681Ca2 c2232681Ca2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c2232681Ca2;
    }
}
