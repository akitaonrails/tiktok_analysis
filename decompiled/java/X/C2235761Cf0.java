package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235761Cf0 extends Message<C2235761Cf0, C2235781Cf2> {
    public static final ProtoAdapter<C2235761Cf0> ADAPTER = new ProtoAdapter<C2235761Cf0>() { // from class: X.1Cf1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235761Cf0 decode(ProtoReader protoReader) {
            C2235781Cf2 c2235781Cf2 = new C2235781Cf2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2235781Cf2.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2235781Cf2.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2235781Cf2.LIZLLL = C2235791Cf3.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235781Cf2.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235761Cf0 c2235761Cf0) {
            C2235761Cf0 c2235761Cf02 = c2235761Cf0;
            return C2235791Cf3.ADAPTER.encodedSizeWithTag(1, c2235761Cf02.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2235761Cf02.callback) + c2235761Cf02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235761Cf0 redact(C2235761Cf0 c2235761Cf0) {
            C2235781Cf2 c2235781Cf2NewBuilder = c2235761Cf0.newBuilder();
            c2235781Cf2NewBuilder.LIZLLL = C2235791Cf3.ADAPTER.redact(c2235781Cf2NewBuilder.LIZLLL);
            C1CIG c1cig = c2235781Cf2NewBuilder.LJ;
            if (c1cig != null) {
                c2235781Cf2NewBuilder.LJ = C1CIG.ADAPTER.redact(c1cig);
            }
            c2235781Cf2NewBuilder.clearUnknownFields();
            return c2235781Cf2NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235761Cf0 c2235761Cf0) {
            C2235761Cf0 c2235761Cf02 = c2235761Cf0;
            C2235791Cf3.ADAPTER.encodeWithTag(protoWriter, 1, c2235761Cf02.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2235761Cf02.callback);
            protoWriter.writeBytes(c2235761Cf02.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicCancelJoinGroupParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2235791Cf3 param;

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
    public C2235781Cf2 newBuilder() {
        C2235781Cf2 c2235781Cf2 = new C2235781Cf2();
        c2235781Cf2.LIZLLL = this.param;
        c2235781Cf2.LJ = this.callback;
        c2235781Cf2.addUnknownFields(unknownFields());
        return c2235781Cf2;
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
        sb.replace(0, 2, "FuncParamsXefb57bdeabc867a2{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235761Cf0)) {
            return false;
        }
        C2235761Cf0 c2235761Cf0 = (C2235761Cf0) obj;
        if (unknownFields().equals(c2235761Cf0.unknownFields()) && this.param.equals(c2235761Cf0.param) && C1516540pZE.LJ(this.callback, c2235761Cf0.callback)) {
            return true;
        }
        return false;
    }

    public C2235761Cf0(C2235791Cf3 c2235791Cf3, C1CIG c1cig) {
        this(c2235791Cf3, c1cig, ByteString.EMPTY);
    }

    public C2235761Cf0(C2235791Cf3 c2235791Cf3, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2235791Cf3;
        this.callback = c1cig;
    }
}
