package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228921CLq extends Message<C2228921CLq, C2228941CLs> {
    public static final ProtoAdapter<C2228921CLq> ADAPTER = new ProtoAdapter<C2228921CLq>() { // from class: X.1CLr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228921CLq decode(ProtoReader protoReader) {
            C2228941CLs c2228941CLs = new C2228941CLs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2228941CLs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2228941CLs.LIZLLL = C1CMV.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228941CLs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228921CLq c2228921CLq) {
            C2228921CLq c2228921CLq2 = c2228921CLq;
            return C1CMV.ADAPTER.encodedSizeWithTag(1, c2228921CLq2.ret) + c2228921CLq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228921CLq redact(C2228921CLq c2228921CLq) {
            C2228941CLs c2228941CLsNewBuilder = c2228921CLq.newBuilder();
            c2228941CLsNewBuilder.LIZLLL = C1CMV.ADAPTER.redact(c2228941CLsNewBuilder.LIZLLL);
            c2228941CLsNewBuilder.clearUnknownFields();
            return c2228941CLsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228921CLq c2228921CLq) {
            C2228921CLq c2228921CLq2 = c2228921CLq;
            C1CMV.ADAPTER.encodeWithTag(protoWriter, 1, c2228921CLq2.ret);
            protoWriter.writeBytes(c2228921CLq2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicError#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CMV ret;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.ret.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228941CLs newBuilder() {
        C2228941CLs c2228941CLs = new C2228941CLs();
        c2228941CLs.LIZLLL = this.ret;
        c2228941CLs.addUnknownFields(unknownFields());
        return c2228941CLs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnXfacb2806dfb8c5e0{");
        sb.append('}');
        return sb.toString();
    }

    public C2228921CLq(C1CMV c1cmv) {
        this(c1cmv, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228921CLq)) {
            return false;
        }
        C2228921CLq c2228921CLq = (C2228921CLq) obj;
        if (unknownFields().equals(c2228921CLq.unknownFields()) && this.ret.equals(c2228921CLq.ret)) {
            return true;
        }
        return false;
    }

    public C2228921CLq(C1CMV c1cmv, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c1cmv;
    }
}
