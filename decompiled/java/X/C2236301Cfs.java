package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236301Cfs extends Message<C2236301Cfs, C2236321Cfu> {
    public static final ProtoAdapter<C2236301Cfs> ADAPTER = new ProtoAdapter<C2236301Cfs>() { // from class: X.1Cft
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236301Cfs decode(ProtoReader protoReader) {
            C2236321Cfu c2236321Cfu = new C2236321Cfu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236321Cfu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2236321Cfu.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2236321Cfu.LIZLLL = C2236331Cfv.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236321Cfu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236301Cfs c2236301Cfs) {
            C2236301Cfs c2236301Cfs2 = c2236301Cfs;
            return C2236331Cfv.ADAPTER.encodedSizeWithTag(1, c2236301Cfs2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2236301Cfs2.callback) + c2236301Cfs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236301Cfs redact(C2236301Cfs c2236301Cfs) {
            C2236321Cfu c2236321CfuNewBuilder = c2236301Cfs.newBuilder();
            c2236321CfuNewBuilder.LIZLLL = C2236331Cfv.ADAPTER.redact(c2236321CfuNewBuilder.LIZLLL);
            c2236321CfuNewBuilder.LJ = C1CIG.ADAPTER.redact(c2236321CfuNewBuilder.LJ);
            c2236321CfuNewBuilder.clearUnknownFields();
            return c2236321CfuNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236301Cfs c2236301Cfs) {
            C2236301Cfs c2236301Cfs2 = c2236301Cfs;
            C2236331Cfv.ADAPTER.encodeWithTag(protoWriter, 1, c2236301Cfs2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2236301Cfs2.callback);
            protoWriter.writeBytes(c2236301Cfs2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicReplyParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2236331Cfv param;

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
    public C2236321Cfu newBuilder() {
        C2236321Cfu c2236321Cfu = new C2236321Cfu();
        c2236321Cfu.LIZLLL = this.param;
        c2236321Cfu.LJ = this.callback;
        c2236321Cfu.addUnknownFields(unknownFields());
        return c2236321Cfu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsXa286fae6cdb91068{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236301Cfs)) {
            return false;
        }
        C2236301Cfs c2236301Cfs = (C2236301Cfs) obj;
        if (unknownFields().equals(c2236301Cfs.unknownFields()) && this.param.equals(c2236301Cfs.param) && this.callback.equals(c2236301Cfs.callback)) {
            return true;
        }
        return false;
    }

    public C2236301Cfs(C2236331Cfv c2236331Cfv, C1CIG c1cig) {
        this(c2236331Cfv, c1cig, ByteString.EMPTY);
    }

    public C2236301Cfs(C2236331Cfv c2236331Cfv, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2236331Cfv;
        this.callback = c1cig;
    }
}
