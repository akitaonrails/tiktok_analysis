package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236451Cg7 extends Message<C2236451Cg7, C2236471Cg9> {
    public static final ProtoAdapter<C2236451Cg7> ADAPTER = new ProtoAdapter<C2236451Cg7>() { // from class: X.1Cg8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236451Cg7 decode(ProtoReader protoReader) {
            C2236471Cg9 c2236471Cg9 = new C2236471Cg9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236471Cg9.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2236471Cg9.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2236471Cg9.LIZLLL = C2236511CgD.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236471Cg9.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236451Cg7 c2236451Cg7) {
            C2236451Cg7 c2236451Cg72 = c2236451Cg7;
            return C2236511CgD.ADAPTER.encodedSizeWithTag(1, c2236451Cg72.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2236451Cg72.callback) + c2236451Cg72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236451Cg7 redact(C2236451Cg7 c2236451Cg7) {
            C2236471Cg9 c2236471Cg9NewBuilder = c2236451Cg7.newBuilder();
            c2236471Cg9NewBuilder.LIZLLL = C2236511CgD.ADAPTER.redact(c2236471Cg9NewBuilder.LIZLLL);
            c2236471Cg9NewBuilder.LJ = C1CIG.ADAPTER.redact(c2236471Cg9NewBuilder.LJ);
            c2236471Cg9NewBuilder.clearUnknownFields();
            return c2236471Cg9NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236451Cg7 c2236451Cg7) {
            C2236451Cg7 c2236451Cg72 = c2236451Cg7;
            C2236511CgD.ADAPTER.encodeWithTag(protoWriter, 1, c2236451Cg72.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2236451Cg72.callback);
            protoWriter.writeBytes(c2236451Cg72.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPermitParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2236511CgD param;

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
    public C2236471Cg9 newBuilder() {
        C2236471Cg9 c2236471Cg9 = new C2236471Cg9();
        c2236471Cg9.LIZLLL = this.param;
        c2236471Cg9.LJ = this.callback;
        c2236471Cg9.addUnknownFields(unknownFields());
        return c2236471Cg9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsX3c7bbf1cc347999b{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236451Cg7)) {
            return false;
        }
        C2236451Cg7 c2236451Cg7 = (C2236451Cg7) obj;
        if (unknownFields().equals(c2236451Cg7.unknownFields()) && this.param.equals(c2236451Cg7.param) && this.callback.equals(c2236451Cg7.callback)) {
            return true;
        }
        return false;
    }

    public C2236451Cg7(C2236511CgD c2236511CgD, C1CIG c1cig) {
        this(c2236511CgD, c1cig, ByteString.EMPTY);
    }

    public C2236451Cg7(C2236511CgD c2236511CgD, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2236511CgD;
        this.callback = c1cig;
    }
}
