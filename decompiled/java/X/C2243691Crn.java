package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Crn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243691Crn extends Message<C2243691Crn, C2243791Crx> {
    public static final ProtoAdapter<C2243691Crn> ADAPTER = new ProtoAdapter<C2243691Crn>() { // from class: X.1Cro
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243691Crn decode(ProtoReader protoReader) {
            C2243791Crx c2243791Crx = new C2243791Crx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2243791Crx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2243791Crx.LIZLLL = C2244091CsR.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243791Crx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243691Crn c2243691Crn) {
            C2243691Crn c2243691Crn2 = c2243691Crn;
            return C2244091CsR.ADAPTER.encodedSizeWithTag(1, c2243691Crn2.placeholder) + c2243691Crn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243691Crn redact(C2243691Crn c2243691Crn) {
            C2243791Crx c2243791CrxNewBuilder = c2243691Crn.newBuilder();
            C2244091CsR c2244091CsR = c2243791CrxNewBuilder.LIZLLL;
            if (c2244091CsR != null) {
                c2243791CrxNewBuilder.LIZLLL = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            c2243791CrxNewBuilder.clearUnknownFields();
            return c2243791CrxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243691Crn c2243691Crn) {
            C2243691Crn c2243691Crn2 = c2243691Crn;
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 1, c2243691Crn2.placeholder);
            protoWriter.writeBytes(c2243691Crn2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C2244091CsR placeholder;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2244091CsR c2244091CsR = this.placeholder;
        int iHashCode2 = iHashCode + (c2244091CsR != null ? c2244091CsR.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2243791Crx newBuilder() {
        C2243791Crx c2243791Crx = new C2243791Crx();
        c2243791Crx.LIZLLL = this.placeholder;
        c2243791Crx.addUnknownFields(unknownFields());
        return c2243791Crx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.placeholder != null) {
            sb.append(", placeholder=");
            sb.append(this.placeholder);
        }
        sb.replace(0, 2, "StickerCardFallbackInfo{");
        sb.append('}');
        return sb.toString();
    }

    public C2243691Crn(C2244091CsR c2244091CsR) {
        this(c2244091CsR, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243691Crn)) {
            return false;
        }
        C2243691Crn c2243691Crn = (C2243691Crn) obj;
        if (unknownFields().equals(c2243691Crn.unknownFields()) && C1516540pZE.LJ(this.placeholder, c2243691Crn.placeholder)) {
            return true;
        }
        return false;
    }

    public C2243691Crn(C2244091CsR c2244091CsR, ByteString byteString) {
        super(ADAPTER, byteString);
        this.placeholder = c2244091CsR;
    }
}
