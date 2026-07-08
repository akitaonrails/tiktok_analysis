package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228021CIe extends Message<C2228021CIe, C2228041CIg> {
    public static final ProtoAdapter<C2228021CIe> ADAPTER = new ProtoAdapter<C2228021CIe>() { // from class: X.1CIf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228021CIe decode(ProtoReader protoReader) {
            C2228041CIg c2228041CIg = new C2228041CIg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2228041CIg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2228041CIg.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2228041CIg.LIZLLL = C2227561CGk.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228041CIg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228021CIe c2228021CIe) {
            C2228021CIe c2228021CIe2 = c2228021CIe;
            return C2227561CGk.ADAPTER.encodedSizeWithTag(1, c2228021CIe2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2228021CIe2.callback) + c2228021CIe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228021CIe redact(C2228021CIe c2228021CIe) {
            C2228041CIg c2228041CIgNewBuilder = c2228021CIe.newBuilder();
            c2228041CIgNewBuilder.LIZLLL = C2227561CGk.ADAPTER.redact(c2228041CIgNewBuilder.LIZLLL);
            c2228041CIgNewBuilder.LJ = C1CIG.ADAPTER.redact(c2228041CIgNewBuilder.LJ);
            c2228041CIgNewBuilder.clearUnknownFields();
            return c2228041CIgNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228021CIe c2228021CIe) {
            C2228021CIe c2228021CIe2 = c2228021CIe;
            C2227561CGk.ADAPTER.encodeWithTag(protoWriter, 1, c2228021CIe2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2228021CIe2.callback);
            protoWriter.writeBytes(c2228021CIe2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicCancelInviteParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2227561CGk param;

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
    public C2228041CIg newBuilder() {
        C2228041CIg c2228041CIg = new C2228041CIg();
        c2228041CIg.LIZLLL = this.param;
        c2228041CIg.LJ = this.callback;
        c2228041CIg.addUnknownFields(unknownFields());
        return c2228041CIg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsX8ed7291de027a254{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228021CIe)) {
            return false;
        }
        C2228021CIe c2228021CIe = (C2228021CIe) obj;
        if (unknownFields().equals(c2228021CIe.unknownFields()) && this.param.equals(c2228021CIe.param) && this.callback.equals(c2228021CIe.callback)) {
            return true;
        }
        return false;
    }

    public C2228021CIe(C2227561CGk c2227561CGk, C1CIG c1cig) {
        this(c2227561CGk, c1cig, ByteString.EMPTY);
    }

    public C2228021CIe(C2227561CGk c2227561CGk, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2227561CGk;
        this.callback = c1cig;
    }
}
