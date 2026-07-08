package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233851Cbv extends Message<C2233851Cbv, C2233871Cbx> {
    public static final ProtoAdapter<C2233851Cbv> ADAPTER = new ProtoAdapter<C2233851Cbv>() { // from class: X.1Cbw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233851Cbv decode(ProtoReader protoReader) {
            C2233871Cbx c2233871Cbx = new C2233871Cbx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2233871Cbx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2233871Cbx.LIZLLL = C2233761Cbm.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233871Cbx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233851Cbv c2233851Cbv) {
            C2233851Cbv c2233851Cbv2 = c2233851Cbv;
            return C2233761Cbm.ADAPTER.encodedSizeWithTag(1, c2233851Cbv2.ret) + c2233851Cbv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233851Cbv redact(C2233851Cbv c2233851Cbv) {
            C2233871Cbx c2233871CbxNewBuilder = c2233851Cbv.newBuilder();
            C2233761Cbm c2233761Cbm = c2233871CbxNewBuilder.LIZLLL;
            if (c2233761Cbm != null) {
                c2233871CbxNewBuilder.LIZLLL = C2233761Cbm.ADAPTER.redact(c2233761Cbm);
            }
            c2233871CbxNewBuilder.clearUnknownFields();
            return c2233871CbxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233851Cbv c2233851Cbv) {
            C2233851Cbv c2233851Cbv2 = c2233851Cbv;
            C2233761Cbm.ADAPTER.encodeWithTag(protoWriter, 1, c2233851Cbv2.ret);
            protoWriter.writeBytes(c2233851Cbv2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutStreamPlayerResolution#ADAPTER", tag = 1)
    public final C2233761Cbm ret;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2233761Cbm c2233761Cbm = this.ret;
        int iHashCode2 = iHashCode + (c2233761Cbm != null ? c2233761Cbm.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2233871Cbx newBuilder() {
        C2233871Cbx c2233871Cbx = new C2233871Cbx();
        c2233871Cbx.LIZLLL = this.ret;
        c2233871Cbx.addUnknownFields(unknownFields());
        return c2233871Cbx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ret != null) {
            sb.append(", ret=");
            sb.append(this.ret);
        }
        sb.replace(0, 2, "FuncReturnXede3640a21b12ade{");
        sb.append('}');
        return sb.toString();
    }

    public C2233851Cbv(C2233761Cbm c2233761Cbm) {
        this(c2233761Cbm, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233851Cbv)) {
            return false;
        }
        C2233851Cbv c2233851Cbv = (C2233851Cbv) obj;
        if (unknownFields().equals(c2233851Cbv.unknownFields()) && C1516540pZE.LJ(this.ret, c2233851Cbv.ret)) {
            return true;
        }
        return false;
    }

    public C2233851Cbv(C2233761Cbm c2233761Cbm, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c2233761Cbm;
    }
}
