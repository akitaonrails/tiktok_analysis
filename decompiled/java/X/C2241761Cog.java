package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241761Cog extends Message<C2241761Cog, C2241751Cof> {
    public static final ProtoAdapter<C2241761Cog> ADAPTER = new ProtoAdapter<C2241761Cog>() { // from class: X.1Com
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241761Cog decode(ProtoReader protoReader) {
            C2241751Cof c2241751Cof = new C2241751Cof();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2241751Cof.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2241751Cof.LJ = C2241841Coo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2241751Cof.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241751Cof.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241761Cog c2241761Cog) {
            C2241761Cog c2241761Cog2 = c2241761Cog;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2241761Cog2.text) + C2241841Coo.ADAPTER.encodedSizeWithTag(2, c2241761Cog2.image) + c2241761Cog2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241761Cog redact(C2241761Cog c2241761Cog) {
            C2241751Cof c2241751CofNewBuilder = c2241761Cog.newBuilder();
            C2241841Coo c2241841Coo = c2241751CofNewBuilder.LJ;
            if (c2241841Coo != null) {
                c2241751CofNewBuilder.LJ = C2241841Coo.ADAPTER.redact(c2241841Coo);
            }
            c2241751CofNewBuilder.clearUnknownFields();
            return c2241751CofNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241761Cog c2241761Cog) {
            C2241761Cog c2241761Cog2 = c2241761Cog;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2241761Cog2.text);
            C2241841Coo.ADAPTER.encodeWithTag(protoWriter, 2, c2241761Cog2.image);
            protoWriter.writeBytes(c2241761Cog2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetPictureStruct#ADAPTER", tag = 2)
    public final C2241841Coo image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String text;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        C2241841Coo c2241841Coo = this.image;
        int iHashCode3 = iHashCode2 + (c2241841Coo != null ? c2241841Coo.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2241751Cof newBuilder() {
        C2241751Cof c2241751Cof = new C2241751Cof();
        c2241751Cof.LIZLLL = this.text;
        c2241751Cof.LJ = this.image;
        c2241751Cof.addUnknownFields(unknownFields());
        return c2241751Cof;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        sb.replace(0, 2, "VisualPoetSystem{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241761Cog)) {
            return false;
        }
        C2241761Cog c2241761Cog = (C2241761Cog) obj;
        if (unknownFields().equals(c2241761Cog.unknownFields()) && C1516540pZE.LJ(this.text, c2241761Cog.text) && C1516540pZE.LJ(this.image, c2241761Cog.image)) {
            return true;
        }
        return false;
    }

    public C2241761Cog(String str, C2241841Coo c2241841Coo) {
        this(str, c2241841Coo, ByteString.EMPTY);
    }

    public C2241761Cog(String str, C2241841Coo c2241841Coo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
        this.image = c2241841Coo;
    }
}
