package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231521CVq extends Message<C2231521CVq, C2231541CVs> {
    public static final ProtoAdapter<C2231521CVq> ADAPTER = new ProtoAdapter<C2231521CVq>() { // from class: X.1CVr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231521CVq decode(ProtoReader protoReader) {
            C2231541CVs c2231541CVs = new C2231541CVs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2231541CVs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2231541CVs.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2231541CVs.LIZLLL = C2231491CVn.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2231541CVs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2231521CVq c2231521CVq) {
            C2231521CVq c2231521CVq2 = c2231521CVq;
            return C2231491CVn.ADAPTER.encodedSizeWithTag(1, c2231521CVq2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2231521CVq2.callback) + c2231521CVq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231521CVq redact(C2231521CVq c2231521CVq) {
            C2231541CVs c2231541CVsNewBuilder = c2231521CVq.newBuilder();
            c2231541CVsNewBuilder.LIZLLL = C2231491CVn.ADAPTER.redact(c2231541CVsNewBuilder.LIZLLL);
            C1CIG c1cig = c2231541CVsNewBuilder.LJ;
            if (c1cig != null) {
                c2231541CVsNewBuilder.LJ = C1CIG.ADAPTER.redact(c1cig);
            }
            c2231541CVsNewBuilder.clearUnknownFields();
            return c2231541CVsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2231521CVq c2231521CVq) {
            C2231521CVq c2231521CVq2 = c2231521CVq;
            C2231491CVn.ADAPTER.encodeWithTag(protoWriter, 1, c2231521CVq2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2231521CVq2.callback);
            protoWriter.writeBytes(c2231521CVq2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLeaveGroupParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2231491CVn param;

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
    public C2231541CVs newBuilder() {
        C2231541CVs c2231541CVs = new C2231541CVs();
        c2231541CVs.LIZLLL = this.param;
        c2231541CVs.LJ = this.callback;
        c2231541CVs.addUnknownFields(unknownFields());
        return c2231541CVs;
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
        sb.replace(0, 2, "FuncParamsX714bd11db080bfe5{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2231521CVq)) {
            return false;
        }
        C2231521CVq c2231521CVq = (C2231521CVq) obj;
        if (unknownFields().equals(c2231521CVq.unknownFields()) && this.param.equals(c2231521CVq.param) && C1516540pZE.LJ(this.callback, c2231521CVq.callback)) {
            return true;
        }
        return false;
    }

    public C2231521CVq(C2231491CVn c2231491CVn, C1CIG c1cig) {
        this(c2231491CVn, c1cig, ByteString.EMPTY);
    }

    public C2231521CVq(C2231491CVn c2231491CVn, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2231491CVn;
        this.callback = c1cig;
    }
}
