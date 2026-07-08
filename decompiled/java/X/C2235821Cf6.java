package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235821Cf6 extends Message<C2235821Cf6, C2235841Cf8> {
    public static final ProtoAdapter<C2235821Cf6> ADAPTER = new ProtoAdapter<C2235821Cf6>() { // from class: X.1Cf7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235821Cf6 decode(ProtoReader protoReader) {
            C2235841Cf8 c2235841Cf8 = new C2235841Cf8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2235841Cf8.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2235841Cf8.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2235841Cf8.LIZLLL = C2235851Cf9.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235841Cf8.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235821Cf6 c2235821Cf6) {
            C2235821Cf6 c2235821Cf62 = c2235821Cf6;
            return C2235851Cf9.ADAPTER.encodedSizeWithTag(1, c2235821Cf62.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2235821Cf62.callback) + c2235821Cf62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235821Cf6 redact(C2235821Cf6 c2235821Cf6) {
            C2235841Cf8 c2235841Cf8NewBuilder = c2235821Cf6.newBuilder();
            c2235841Cf8NewBuilder.LIZLLL = C2235851Cf9.ADAPTER.redact(c2235841Cf8NewBuilder.LIZLLL);
            c2235841Cf8NewBuilder.LJ = C1CIG.ADAPTER.redact(c2235841Cf8NewBuilder.LJ);
            c2235841Cf8NewBuilder.clearUnknownFields();
            return c2235841Cf8NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235821Cf6 c2235821Cf6) {
            C2235821Cf6 c2235821Cf62 = c2235821Cf6;
            C2235851Cf9.ADAPTER.encodeWithTag(protoWriter, 1, c2235821Cf62.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2235821Cf62.callback);
            protoWriter.writeBytes(c2235821Cf62.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicInviteParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2235851Cf9 param;

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
    public C2235841Cf8 newBuilder() {
        C2235841Cf8 c2235841Cf8 = new C2235841Cf8();
        c2235841Cf8.LIZLLL = this.param;
        c2235841Cf8.LJ = this.callback;
        c2235841Cf8.addUnknownFields(unknownFields());
        return c2235841Cf8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsXd5ebcfbd4b253b4d{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235821Cf6)) {
            return false;
        }
        C2235821Cf6 c2235821Cf6 = (C2235821Cf6) obj;
        if (unknownFields().equals(c2235821Cf6.unknownFields()) && this.param.equals(c2235821Cf6.param) && this.callback.equals(c2235821Cf6.callback)) {
            return true;
        }
        return false;
    }

    public C2235821Cf6(C2235851Cf9 c2235851Cf9, C1CIG c1cig) {
        this(c2235851Cf9, c1cig, ByteString.EMPTY);
    }

    public C2235821Cf6(C2235851Cf9 c2235851Cf9, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2235851Cf9;
        this.callback = c1cig;
    }
}
