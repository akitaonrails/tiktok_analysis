package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cm7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240171Cm7 extends Message<C2240171Cm7, C2240181Cm8> {
    public static final ProtoAdapter<C2240171Cm7> ADAPTER = new ProtoAdapter<C2240171Cm7>() { // from class: X.1Cm6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240171Cm7 decode(ProtoReader protoReader) {
            C2240181Cm8 c2240181Cm8 = new C2240181Cm8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2240181Cm8.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2240181Cm8.LJFF = C2240191Cm9.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2240181Cm8.LJ = C2240251CmF.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2240181Cm8.LIZLLL = C2240101Cm0.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2240181Cm8.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2240171Cm7 c2240171Cm7) {
            C2240171Cm7 c2240171Cm72 = c2240171Cm7;
            return C2240101Cm0.ADAPTER.encodedSizeWithTag(1, c2240171Cm72.text_stream_block) + C2240251CmF.ADAPTER.encodedSizeWithTag(2, c2240171Cm72.image_stream_block) + C2240191Cm9.ADAPTER.encodedSizeWithTag(3, c2240171Cm72.markdown_stream_block) + c2240171Cm72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240171Cm7 redact(C2240171Cm7 c2240171Cm7) {
            C2240181Cm8 c2240181Cm8NewBuilder = c2240171Cm7.newBuilder();
            C2240101Cm0 c2240101Cm0 = c2240181Cm8NewBuilder.LIZLLL;
            if (c2240101Cm0 != null) {
                c2240181Cm8NewBuilder.LIZLLL = C2240101Cm0.ADAPTER.redact(c2240101Cm0);
            }
            C2240251CmF c2240251CmF = c2240181Cm8NewBuilder.LJ;
            if (c2240251CmF != null) {
                c2240181Cm8NewBuilder.LJ = C2240251CmF.ADAPTER.redact(c2240251CmF);
            }
            C2240191Cm9 c2240191Cm9 = c2240181Cm8NewBuilder.LJFF;
            if (c2240191Cm9 != null) {
                c2240181Cm8NewBuilder.LJFF = C2240191Cm9.ADAPTER.redact(c2240191Cm9);
            }
            c2240181Cm8NewBuilder.clearUnknownFields();
            return c2240181Cm8NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2240171Cm7 c2240171Cm7) {
            C2240171Cm7 c2240171Cm72 = c2240171Cm7;
            C2240101Cm0.ADAPTER.encodeWithTag(protoWriter, 1, c2240171Cm72.text_stream_block);
            C2240251CmF.ADAPTER.encodeWithTag(protoWriter, 2, c2240171Cm72.image_stream_block);
            C2240191Cm9.ADAPTER.encodeWithTag(protoWriter, 3, c2240171Cm72.markdown_stream_block);
            protoWriter.writeBytes(c2240171Cm72.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.ImageStreamBlock#ADAPTER", tag = 2)
    public final C2240251CmF image_stream_block;

    @WireField(adapter = "com.bytedance.im.message.template.proto.MarkdownStreamBlock#ADAPTER", tag = 3)
    public final C2240191Cm9 markdown_stream_block;

    @WireField(adapter = "com.bytedance.im.message.template.proto.TextStreamBlock#ADAPTER", tag = 1)
    public final C2240101Cm0 text_stream_block;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2240101Cm0 c2240101Cm0 = this.text_stream_block;
        int iHashCode2 = (iHashCode + (c2240101Cm0 != null ? c2240101Cm0.hashCode() : 0)) * 37;
        C2240251CmF c2240251CmF = this.image_stream_block;
        int iHashCode3 = (iHashCode2 + (c2240251CmF != null ? c2240251CmF.hashCode() : 0)) * 37;
        C2240191Cm9 c2240191Cm9 = this.markdown_stream_block;
        int iHashCode4 = iHashCode3 + (c2240191Cm9 != null ? c2240191Cm9.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C2240181Cm8 newBuilder() {
        C2240181Cm8 c2240181Cm8 = new C2240181Cm8();
        c2240181Cm8.LIZLLL = this.text_stream_block;
        c2240181Cm8.LJ = this.image_stream_block;
        c2240181Cm8.LJFF = this.markdown_stream_block;
        c2240181Cm8.addUnknownFields(unknownFields());
        return c2240181Cm8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text_stream_block != null) {
            sb.append(", text_stream_block=");
            sb.append(this.text_stream_block);
        }
        if (this.image_stream_block != null) {
            sb.append(", image_stream_block=");
            sb.append(this.image_stream_block);
        }
        if (this.markdown_stream_block != null) {
            sb.append(", markdown_stream_block=");
            sb.append(this.markdown_stream_block);
        }
        sb.replace(0, 2, "StreamBlockContent{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2240171Cm7)) {
            return false;
        }
        C2240171Cm7 c2240171Cm7 = (C2240171Cm7) obj;
        if (unknownFields().equals(c2240171Cm7.unknownFields()) && C1516540pZE.LJ(this.text_stream_block, c2240171Cm7.text_stream_block) && C1516540pZE.LJ(this.image_stream_block, c2240171Cm7.image_stream_block) && C1516540pZE.LJ(this.markdown_stream_block, c2240171Cm7.markdown_stream_block)) {
            return true;
        }
        return false;
    }

    public C2240171Cm7(C2240101Cm0 c2240101Cm0, C2240251CmF c2240251CmF, C2240191Cm9 c2240191Cm9) {
        this(c2240101Cm0, c2240251CmF, c2240191Cm9, ByteString.EMPTY);
    }

    public C2240171Cm7(C2240101Cm0 c2240101Cm0, C2240251CmF c2240251CmF, C2240191Cm9 c2240191Cm9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text_stream_block = c2240101Cm0;
        this.image_stream_block = c2240251CmF;
        this.markdown_stream_block = c2240191Cm9;
    }
}
