package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Coo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241841Coo extends Message<C2241841Coo, C2241861Coq> {
    public static final ProtoAdapter<C2241841Coo> ADAPTER = new ProtoAdapter<C2241841Coo>() { // from class: X.1Cop
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241841Coo decode(ProtoReader protoReader) {
            C2241861Coq c2241861Coq = new C2241861Coq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2241861Coq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2241861Coq.LJ = C2244091CsR.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2241861Coq.LIZLLL = C2244091CsR.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241861Coq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241841Coo c2241841Coo) {
            C2241841Coo c2241841Coo2 = c2241841Coo;
            ProtoAdapter<C2244091CsR> protoAdapter = C2244091CsR.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2241841Coo2.image) + protoAdapter.encodedSizeWithTag(2, c2241841Coo2.thumbnail) + c2241841Coo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241841Coo redact(C2241841Coo c2241841Coo) {
            C2241861Coq c2241861CoqNewBuilder = c2241841Coo.newBuilder();
            C2244091CsR c2244091CsR = c2241861CoqNewBuilder.LIZLLL;
            if (c2244091CsR != null) {
                c2241861CoqNewBuilder.LIZLLL = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            C2244091CsR c2244091CsR2 = c2241861CoqNewBuilder.LJ;
            if (c2244091CsR2 != null) {
                c2241861CoqNewBuilder.LJ = C2244091CsR.ADAPTER.redact(c2244091CsR2);
            }
            c2241861CoqNewBuilder.clearUnknownFields();
            return c2241861CoqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241841Coo c2241841Coo) {
            C2241841Coo c2241841Coo2 = c2241841Coo;
            ProtoAdapter<C2244091CsR> protoAdapter = C2244091CsR.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2241841Coo2.image);
            protoAdapter.encodeWithTag(protoWriter, 2, c2241841Coo2.thumbnail);
            protoWriter.writeBytes(c2241841Coo2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C2244091CsR image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 2)
    public final C2244091CsR thumbnail;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2244091CsR c2244091CsR = this.image;
        int iHashCode2 = (iHashCode + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR2 = this.thumbnail;
        int iHashCode3 = iHashCode2 + (c2244091CsR2 != null ? c2244091CsR2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2241861Coq newBuilder() {
        C2241861Coq c2241861Coq = new C2241861Coq();
        c2241861Coq.LIZLLL = this.image;
        c2241861Coq.LJ = this.thumbnail;
        c2241861Coq.addUnknownFields(unknownFields());
        return c2241861Coq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.thumbnail != null) {
            sb.append(", thumbnail=");
            sb.append(this.thumbnail);
        }
        sb.replace(0, 2, "VisualPoetPictureStruct{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241841Coo)) {
            return false;
        }
        C2241841Coo c2241841Coo = (C2241841Coo) obj;
        if (unknownFields().equals(c2241841Coo.unknownFields()) && C1516540pZE.LJ(this.image, c2241841Coo.image) && C1516540pZE.LJ(this.thumbnail, c2241841Coo.thumbnail)) {
            return true;
        }
        return false;
    }

    public C2241841Coo(C2244091CsR c2244091CsR, C2244091CsR c2244091CsR2) {
        this(c2244091CsR, c2244091CsR2, ByteString.EMPTY);
    }

    public C2241841Coo(C2244091CsR c2244091CsR, C2244091CsR c2244091CsR2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image = c2244091CsR;
        this.thumbnail = c2244091CsR2;
    }
}
