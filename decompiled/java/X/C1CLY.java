package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLY extends Message<C1CLY, C2228761CLa> {
    public static final ProtoAdapter<C1CLY> ADAPTER = new ProtoAdapter<C1CLY>() { // from class: X.1CLZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLY decode(ProtoReader protoReader) {
            C2228761CLa c2228761CLa = new C2228761CLa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2228761CLa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2228761CLa.LIZLLL = C2229431CNp.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228761CLa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CLY c1cly) {
            C1CLY c1cly2 = c1cly;
            return C2229431CNp.ADAPTER.encodedSizeWithTag(1, c1cly2.ret) + c1cly2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLY redact(C1CLY c1cly) {
            C2228761CLa c2228761CLaNewBuilder = c1cly.newBuilder();
            c2228761CLaNewBuilder.LIZLLL = C2229431CNp.ADAPTER.redact(c2228761CLaNewBuilder.LIZLLL);
            c2228761CLaNewBuilder.clearUnknownFields();
            return c2228761CLaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CLY c1cly) {
            C1CLY c1cly2 = c1cly;
            C2229431CNp.ADAPTER.encodeWithTag(protoWriter, 1, c1cly2.ret);
            protoWriter.writeBytes(c1cly2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicResolutionModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2229431CNp ret;

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
    public C2228761CLa newBuilder() {
        C2228761CLa c2228761CLa = new C2228761CLa();
        c2228761CLa.LIZLLL = this.ret;
        c2228761CLa.addUnknownFields(unknownFields());
        return c2228761CLa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX22ce5fec5c563128{");
        sb.append('}');
        return sb.toString();
    }

    public C1CLY(C2229431CNp c2229431CNp) {
        this(c2229431CNp, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CLY)) {
            return false;
        }
        C1CLY c1cly = (C1CLY) obj;
        if (unknownFields().equals(c1cly.unknownFields()) && this.ret.equals(c1cly.ret)) {
            return true;
        }
        return false;
    }

    public C1CLY(C2229431CNp c2229431CNp, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c2229431CNp;
    }
}
