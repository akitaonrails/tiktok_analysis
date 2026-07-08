package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CIJ extends Message<C1CIJ, C1CIL> {
    public static final ProtoAdapter<C1CIJ> ADAPTER = new ProtoAdapter<C1CIJ>() { // from class: X.1CIK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CIJ decode(ProtoReader protoReader) {
            C1CIL c1cil = new C1CIL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cil.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cil.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cil.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cil.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CIJ c1cij) {
            C1CIJ c1cij2 = c1cij;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c1cij2.enable_multi_guest_moderator) + C1CIG.ADAPTER.encodedSizeWithTag(2, c1cij2.log_provider) + c1cij2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CIJ redact(C1CIJ c1cij) {
            C1CIL c1cilNewBuilder = c1cij.newBuilder();
            c1cilNewBuilder.LJ = C1CIG.ADAPTER.redact(c1cilNewBuilder.LJ);
            c1cilNewBuilder.clearUnknownFields();
            return c1cilNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CIJ c1cij) {
            C1CIJ c1cij2 = c1cij;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c1cij2.enable_multi_guest_moderator);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c1cij2.log_provider);
            protoWriter.writeBytes(c1cij2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_ENABLE_MULTI_GUEST_MODERATOR = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean enable_multi_guest_moderator;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CIG log_provider;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.enable_multi_guest_moderator.hashCode()) * 37) + this.log_provider.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CIL newBuilder() {
        C1CIL c1cil = new C1CIL();
        c1cil.LIZLLL = this.enable_multi_guest_moderator;
        c1cil.LJ = this.log_provider;
        c1cil.addUnknownFields(unknownFields());
        return c1cil;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", enable_multi_guest_moderator=");
        sb.append(this.enable_multi_guest_moderator);
        sb.append(", log_provider=");
        sb.append(this.log_provider);
        sb.replace(0, 2, "FuncParamsX5cf6f020f6f2f628{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CIJ)) {
            return false;
        }
        C1CIJ c1cij = (C1CIJ) obj;
        if (unknownFields().equals(c1cij.unknownFields()) && this.enable_multi_guest_moderator.equals(c1cij.enable_multi_guest_moderator) && this.log_provider.equals(c1cij.log_provider)) {
            return true;
        }
        return false;
    }

    public C1CIJ(Boolean bool, C1CIG c1cig) {
        this(bool, c1cig, ByteString.EMPTY);
    }

    public C1CIJ(Boolean bool, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_multi_guest_moderator = bool;
        this.log_provider = c1cig;
    }
}
