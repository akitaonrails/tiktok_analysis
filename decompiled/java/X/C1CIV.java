package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CIV extends Message<C1CIV, C1CIX> {
    public static final ProtoAdapter<C1CIV> ADAPTER = new ProtoAdapter<C1CIV>() { // from class: X.1CIW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CIV decode(ProtoReader protoReader) {
            C1CIX c1cix = new C1CIX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cix.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cix.LIZLLL = C1CIG.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cix.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CIV c1civ) {
            C1CIV c1civ2 = c1civ;
            return C1CIG.ADAPTER.encodedSizeWithTag(1, c1civ2.provider) + c1civ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CIV redact(C1CIV c1civ) {
            C1CIX c1cixNewBuilder = c1civ.newBuilder();
            c1cixNewBuilder.LIZLLL = C1CIG.ADAPTER.redact(c1cixNewBuilder.LIZLLL);
            c1cixNewBuilder.clearUnknownFields();
            return c1cixNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CIV c1civ) {
            C1CIV c1civ2 = c1civ;
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 1, c1civ2.provider);
            protoWriter.writeBytes(c1civ2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CIG provider;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.provider.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CIX newBuilder() {
        C1CIX c1cix = new C1CIX();
        c1cix.LIZLLL = this.provider;
        c1cix.addUnknownFields(unknownFields());
        return c1cix;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", provider=");
        sb.append(this.provider);
        sb.replace(0, 2, "FuncParamsX4bf7939dc052e1bf{");
        sb.append('}');
        return sb.toString();
    }

    public C1CIV(C1CIG c1cig) {
        this(c1cig, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CIV)) {
            return false;
        }
        C1CIV c1civ = (C1CIV) obj;
        if (unknownFields().equals(c1civ.unknownFields()) && this.provider.equals(c1civ.provider)) {
            return true;
        }
        return false;
    }

    public C1CIV(C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.provider = c1cig;
    }
}
