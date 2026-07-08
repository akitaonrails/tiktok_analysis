package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236121Cfa extends Message<C2236121Cfa, C2236141Cfc> {
    public static final ProtoAdapter<C2236121Cfa> ADAPTER = new ProtoAdapter<C2236121Cfa>() { // from class: X.1Cfb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236121Cfa decode(ProtoReader protoReader) {
            C2236141Cfc c2236141Cfc = new C2236141Cfc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236141Cfc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2236141Cfc.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2236141Cfc.LIZLLL = C2236151Cfd.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236141Cfc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236121Cfa c2236121Cfa) {
            C2236121Cfa c2236121Cfa2 = c2236121Cfa;
            return C2236151Cfd.ADAPTER.encodedSizeWithTag(1, c2236121Cfa2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2236121Cfa2.callback) + c2236121Cfa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236121Cfa redact(C2236121Cfa c2236121Cfa) {
            C2236141Cfc c2236141CfcNewBuilder = c2236121Cfa.newBuilder();
            c2236141CfcNewBuilder.LIZLLL = C2236151Cfd.ADAPTER.redact(c2236141CfcNewBuilder.LIZLLL);
            c2236141CfcNewBuilder.LJ = C1CIG.ADAPTER.redact(c2236141CfcNewBuilder.LJ);
            c2236141CfcNewBuilder.clearUnknownFields();
            return c2236141CfcNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236121Cfa c2236121Cfa) {
            C2236121Cfa c2236121Cfa2 = c2236121Cfa;
            C2236151Cfd.ADAPTER.encodeWithTag(protoWriter, 1, c2236121Cfa2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2236121Cfa2.callback);
            protoWriter.writeBytes(c2236121Cfa2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicResumeParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2236151Cfd param;

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
    public C2236141Cfc newBuilder() {
        C2236141Cfc c2236141Cfc = new C2236141Cfc();
        c2236141Cfc.LIZLLL = this.param;
        c2236141Cfc.LJ = this.callback;
        c2236141Cfc.addUnknownFields(unknownFields());
        return c2236141Cfc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsX0fcc76199318b113{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236121Cfa)) {
            return false;
        }
        C2236121Cfa c2236121Cfa = (C2236121Cfa) obj;
        if (unknownFields().equals(c2236121Cfa.unknownFields()) && this.param.equals(c2236121Cfa.param) && this.callback.equals(c2236121Cfa.callback)) {
            return true;
        }
        return false;
    }

    public C2236121Cfa(C2236151Cfd c2236151Cfd, C1CIG c1cig) {
        this(c2236151Cfd, c1cig, ByteString.EMPTY);
    }

    public C2236121Cfa(C2236151Cfd c2236151Cfd, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2236151Cfd;
        this.callback = c1cig;
    }
}
