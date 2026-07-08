package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cfy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236361Cfy extends Message<C2236361Cfy, C2236381Cg0> {
    public static final ProtoAdapter<C2236361Cfy> ADAPTER = new ProtoAdapter<C2236361Cfy>() { // from class: X.1Cfz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236361Cfy decode(ProtoReader protoReader) {
            C2236381Cg0 c2236381Cg0 = new C2236381Cg0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236381Cg0.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2236381Cg0.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2236381Cg0.LIZLLL = C2236391Cg1.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236381Cg0.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236361Cfy c2236361Cfy) {
            C2236361Cfy c2236361Cfy2 = c2236361Cfy;
            return C2236391Cg1.ADAPTER.encodedSizeWithTag(1, c2236361Cfy2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2236361Cfy2.callback) + c2236361Cfy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236361Cfy redact(C2236361Cfy c2236361Cfy) {
            C2236381Cg0 c2236381Cg0NewBuilder = c2236361Cfy.newBuilder();
            c2236381Cg0NewBuilder.LIZLLL = C2236391Cg1.ADAPTER.redact(c2236381Cg0NewBuilder.LIZLLL);
            c2236381Cg0NewBuilder.LJ = C1CIG.ADAPTER.redact(c2236381Cg0NewBuilder.LJ);
            c2236381Cg0NewBuilder.clearUnknownFields();
            return c2236381Cg0NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236361Cfy c2236361Cfy) {
            C2236361Cfy c2236361Cfy2 = c2236361Cfy;
            C2236391Cg1.ADAPTER.encodeWithTag(protoWriter, 1, c2236361Cfy2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2236361Cfy2.callback);
            protoWriter.writeBytes(c2236361Cfy2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicKickoutAllGuestsParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2236391Cg1 param;

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
    public C2236381Cg0 newBuilder() {
        C2236381Cg0 c2236381Cg0 = new C2236381Cg0();
        c2236381Cg0.LIZLLL = this.param;
        c2236381Cg0.LJ = this.callback;
        c2236381Cg0.addUnknownFields(unknownFields());
        return c2236381Cg0;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsXce2070c893e73fe2{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236361Cfy)) {
            return false;
        }
        C2236361Cfy c2236361Cfy = (C2236361Cfy) obj;
        if (unknownFields().equals(c2236361Cfy.unknownFields()) && this.param.equals(c2236361Cfy.param) && this.callback.equals(c2236361Cfy.callback)) {
            return true;
        }
        return false;
    }

    public C2236361Cfy(C2236391Cg1 c2236391Cg1, C1CIG c1cig) {
        this(c2236391Cg1, c1cig, ByteString.EMPTY);
    }

    public C2236361Cfy(C2236391Cg1 c2236391Cg1, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2236391Cg1;
        this.callback = c1cig;
    }
}
