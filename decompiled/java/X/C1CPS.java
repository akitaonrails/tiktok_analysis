package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CPS extends Message<C1CPS, C1CPU> {
    public static final ProtoAdapter<C1CPS> ADAPTER = new ProtoAdapter<C1CPS>() { // from class: X.1CPT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CPS decode(ProtoReader protoReader) {
            C1CPU c1cpu = new C1CPU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cpu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cpu.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cpu.LIZLLL = C1CPQ.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cpu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CPS c1cps) {
            C1CPS c1cps2 = c1cps;
            return C1CPQ.ADAPTER.encodedSizeWithTag(1, c1cps2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c1cps2.callback) + c1cps2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CPS redact(C1CPS c1cps) {
            C1CPU c1cpuNewBuilder = c1cps.newBuilder();
            c1cpuNewBuilder.LIZLLL = C1CPQ.ADAPTER.redact(c1cpuNewBuilder.LIZLLL);
            C1CIG c1cig = c1cpuNewBuilder.LJ;
            if (c1cig != null) {
                c1cpuNewBuilder.LJ = C1CIG.ADAPTER.redact(c1cig);
            }
            c1cpuNewBuilder.clearUnknownFields();
            return c1cpuNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CPS c1cps) {
            C1CPS c1cps2 = c1cps;
            C1CPQ.ADAPTER.encodeWithTag(protoWriter, 1, c1cps2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c1cps2.callback);
            protoWriter.writeBytes(c1cps2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicKickoutParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CPQ param;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.param.hashCode()) * 37;
        C1CIG c1cig = this.callback;
        int iHashCode2 = iHashCode + (c1cig != null ? c1cig.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CPU newBuilder() {
        C1CPU c1cpu = new C1CPU();
        c1cpu.LIZLLL = this.param;
        c1cpu.LJ = this.callback;
        c1cpu.addUnknownFields(unknownFields());
        return c1cpu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        if (this.callback != null) {
            sb.append(", callback=");
            sb.append(this.callback);
        }
        sb.replace(0, 2, "FuncParamsXce6c9bb7e3fc63ec{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CPS)) {
            return false;
        }
        C1CPS c1cps = (C1CPS) obj;
        if (unknownFields().equals(c1cps.unknownFields()) && this.param.equals(c1cps.param) && C1516540pZE.LJ(this.callback, c1cps.callback)) {
            return true;
        }
        return false;
    }

    public C1CPS(C1CPQ c1cpq, C1CIG c1cig) {
        this(c1cpq, c1cig, ByteString.EMPTY);
    }

    public C1CPS(C1CPQ c1cpq, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c1cpq;
        this.callback = c1cig;
    }
}
