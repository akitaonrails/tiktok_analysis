package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cfj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236211Cfj extends Message<C2236211Cfj, C2236231Cfl> {
    public static final ProtoAdapter<C2236211Cfj> ADAPTER = new ProtoAdapter<C2236211Cfj>() { // from class: X.1Cfk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236211Cfj decode(ProtoReader protoReader) {
            C2236231Cfl c2236231Cfl = new C2236231Cfl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236231Cfl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2236231Cfl.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2236231Cfl.LIZLLL = C2236241Cfm.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236231Cfl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236211Cfj c2236211Cfj) {
            C2236211Cfj c2236211Cfj2 = c2236211Cfj;
            return C2236241Cfm.ADAPTER.encodedSizeWithTag(1, c2236211Cfj2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2236211Cfj2.callback) + c2236211Cfj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236211Cfj redact(C2236211Cfj c2236211Cfj) {
            C2236231Cfl c2236231CflNewBuilder = c2236211Cfj.newBuilder();
            c2236231CflNewBuilder.LIZLLL = C2236241Cfm.ADAPTER.redact(c2236231CflNewBuilder.LIZLLL);
            c2236231CflNewBuilder.LJ = C1CIG.ADAPTER.redact(c2236231CflNewBuilder.LJ);
            c2236231CflNewBuilder.clearUnknownFields();
            return c2236231CflNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236211Cfj c2236211Cfj) {
            C2236211Cfj c2236211Cfj2 = c2236211Cfj;
            C2236241Cfm.ADAPTER.encodeWithTag(protoWriter, 1, c2236211Cfj2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2236211Cfj2.callback);
            protoWriter.writeBytes(c2236211Cfj2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicCreateChannelParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2236241Cfm param;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.param.hashCode()) * 37) + this.callback.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236231Cfl newBuilder() {
        C2236231Cfl c2236231Cfl = new C2236231Cfl();
        c2236231Cfl.LIZLLL = this.param;
        c2236231Cfl.LJ = this.callback;
        c2236231Cfl.addUnknownFields(unknownFields());
        return c2236231Cfl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsXa094cc49879f5770{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236211Cfj)) {
            return false;
        }
        C2236211Cfj c2236211Cfj = (C2236211Cfj) obj;
        if (unknownFields().equals(c2236211Cfj.unknownFields()) && this.param.equals(c2236211Cfj.param) && this.callback.equals(c2236211Cfj.callback)) {
            return true;
        }
        return false;
    }

    public C2236211Cfj(C2236241Cfm c2236241Cfm, C1CIG c1cig) {
        this(c2236241Cfm, c1cig, ByteString.EMPTY);
    }

    public C2236211Cfj(C2236241Cfm c2236241Cfm, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2236241Cfm;
        this.callback = c1cig;
    }
}
