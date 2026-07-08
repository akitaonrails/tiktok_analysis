package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235541Cee extends Message<C2235541Cee, C2235561Ceg> {
    public static final ProtoAdapter<C2235541Cee> ADAPTER = new ProtoAdapter<C2235541Cee>() { // from class: X.1Cef
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235541Cee decode(ProtoReader protoReader) {
            C2235561Ceg c2235561Ceg = new C2235561Ceg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2235561Ceg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2235561Ceg.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2235561Ceg.LIZLLL = C2235511Ceb.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235561Ceg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235541Cee c2235541Cee) {
            C2235541Cee c2235541Cee2 = c2235541Cee;
            return C2235511Ceb.ADAPTER.encodedSizeWithTag(1, c2235541Cee2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2235541Cee2.callback) + c2235541Cee2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235541Cee redact(C2235541Cee c2235541Cee) {
            C2235561Ceg c2235561CegNewBuilder = c2235541Cee.newBuilder();
            c2235561CegNewBuilder.LIZLLL = C2235511Ceb.ADAPTER.redact(c2235561CegNewBuilder.LIZLLL);
            c2235561CegNewBuilder.LJ = C1CIG.ADAPTER.redact(c2235561CegNewBuilder.LJ);
            c2235561CegNewBuilder.clearUnknownFields();
            return c2235561CegNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235541Cee c2235541Cee) {
            C2235541Cee c2235541Cee2 = c2235541Cee;
            C2235511Ceb.ADAPTER.encodeWithTag(protoWriter, 1, c2235541Cee2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2235541Cee2.callback);
            protoWriter.writeBytes(c2235541Cee2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicFinishChannelParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2235511Ceb param;

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
    public C2235561Ceg newBuilder() {
        C2235561Ceg c2235561Ceg = new C2235561Ceg();
        c2235561Ceg.LIZLLL = this.param;
        c2235561Ceg.LJ = this.callback;
        c2235561Ceg.addUnknownFields(unknownFields());
        return c2235561Ceg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsX5ced79a465ca7d00{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235541Cee)) {
            return false;
        }
        C2235541Cee c2235541Cee = (C2235541Cee) obj;
        if (unknownFields().equals(c2235541Cee.unknownFields()) && this.param.equals(c2235541Cee.param) && this.callback.equals(c2235541Cee.callback)) {
            return true;
        }
        return false;
    }

    public C2235541Cee(C2235511Ceb c2235511Ceb, C1CIG c1cig) {
        this(c2235511Ceb, c1cig, ByteString.EMPTY);
    }

    public C2235541Cee(C2235511Ceb c2235511Ceb, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2235511Ceb;
        this.callback = c1cig;
    }
}
