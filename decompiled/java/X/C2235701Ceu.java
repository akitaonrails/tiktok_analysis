package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Ceu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235701Ceu extends Message<C2235701Ceu, C2235721Cew> {
    public static final ProtoAdapter<C2235701Ceu> ADAPTER = new ProtoAdapter<C2235701Ceu>() { // from class: X.1Cev
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235701Ceu decode(ProtoReader protoReader) {
            C2235721Cew c2235721Cew = new C2235721Cew();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2235721Cew.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2235721Cew.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2235721Cew.LIZLLL = C2235731Cex.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235721Cew.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235701Ceu c2235701Ceu) {
            C2235701Ceu c2235701Ceu2 = c2235701Ceu;
            return C2235731Cex.ADAPTER.encodedSizeWithTag(1, c2235701Ceu2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2235701Ceu2.callback) + c2235701Ceu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235701Ceu redact(C2235701Ceu c2235701Ceu) {
            C2235721Cew c2235721CewNewBuilder = c2235701Ceu.newBuilder();
            c2235721CewNewBuilder.LIZLLL = C2235731Cex.ADAPTER.redact(c2235721CewNewBuilder.LIZLLL);
            C1CIG c1cig = c2235721CewNewBuilder.LJ;
            if (c1cig != null) {
                c2235721CewNewBuilder.LJ = C1CIG.ADAPTER.redact(c1cig);
            }
            c2235721CewNewBuilder.clearUnknownFields();
            return c2235721CewNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235701Ceu c2235701Ceu) {
            C2235701Ceu c2235701Ceu2 = c2235701Ceu;
            C2235731Cex.ADAPTER.encodeWithTag(protoWriter, 1, c2235701Ceu2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2235701Ceu2.callback);
            protoWriter.writeBytes(c2235701Ceu2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicCompensateGroupListChangeParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2235731Cex param;

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
    public C2235721Cew newBuilder() {
        C2235721Cew c2235721Cew = new C2235721Cew();
        c2235721Cew.LIZLLL = this.param;
        c2235721Cew.LJ = this.callback;
        c2235721Cew.addUnknownFields(unknownFields());
        return c2235721Cew;
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
        sb.replace(0, 2, "FuncParamsX8d0048c3e242419b{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235701Ceu)) {
            return false;
        }
        C2235701Ceu c2235701Ceu = (C2235701Ceu) obj;
        if (unknownFields().equals(c2235701Ceu.unknownFields()) && this.param.equals(c2235701Ceu.param) && C1516540pZE.LJ(this.callback, c2235701Ceu.callback)) {
            return true;
        }
        return false;
    }

    public C2235701Ceu(C2235731Cex c2235731Cex, C1CIG c1cig) {
        this(c2235731Cex, c1cig, ByteString.EMPTY);
    }

    public C2235701Ceu(C2235731Cex c2235731Cex, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2235731Cex;
        this.callback = c1cig;
    }
}
