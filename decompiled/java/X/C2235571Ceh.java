package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Ceh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235571Ceh extends Message<C2235571Ceh, C2235591Cej> {
    public static final ProtoAdapter<C2235571Ceh> ADAPTER = new ProtoAdapter<C2235571Ceh>() { // from class: X.1Cei
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235571Ceh decode(ProtoReader protoReader) {
            C2235591Cej c2235591Cej = new C2235591Cej();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2235591Cej.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2235591Cej.LIZLLL = C2235601Cek.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235591Cej.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235571Ceh c2235571Ceh) {
            C2235571Ceh c2235571Ceh2 = c2235571Ceh;
            return C2235601Cek.ADAPTER.encodedSizeWithTag(1, c2235571Ceh2.ret) + c2235571Ceh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235571Ceh redact(C2235571Ceh c2235571Ceh) {
            C2235591Cej c2235591CejNewBuilder = c2235571Ceh.newBuilder();
            c2235591CejNewBuilder.LIZLLL = C2235601Cek.ADAPTER.redact(c2235591CejNewBuilder.LIZLLL);
            c2235591CejNewBuilder.clearUnknownFields();
            return c2235591CejNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235571Ceh c2235571Ceh) {
            C2235571Ceh c2235571Ceh2 = c2235571Ceh;
            C2235601Cek.ADAPTER.encodeWithTag(protoWriter, 1, c2235571Ceh2.ret);
            protoWriter.writeBytes(c2235571Ceh2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicSei#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2235601Cek ret;

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
    public C2235591Cej newBuilder() {
        C2235591Cej c2235591Cej = new C2235591Cej();
        c2235591Cej.LIZLLL = this.ret;
        c2235591Cej.addUnknownFields(unknownFields());
        return c2235591Cej;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnXfb845187e6084096{");
        sb.append('}');
        return sb.toString();
    }

    public C2235571Ceh(C2235601Cek c2235601Cek) {
        this(c2235601Cek, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235571Ceh)) {
            return false;
        }
        C2235571Ceh c2235571Ceh = (C2235571Ceh) obj;
        if (unknownFields().equals(c2235571Ceh.unknownFields()) && this.ret.equals(c2235571Ceh.ret)) {
            return true;
        }
        return false;
    }

    public C2235571Ceh(C2235601Cek c2235601Cek, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c2235601Cek;
    }
}
