package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Zh6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C906380Zh6 extends Message<C906380Zh6, C906520ZhK> {
    public static final ProtoAdapter<C906380Zh6> ADAPTER = new ProtoAdapter<C906380Zh6>() { // from class: X.0Zh7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906380Zh6 decode(ProtoReader protoReader) {
            C906520ZhK c906520ZhK = new C906520ZhK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c906520ZhK.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c906520ZhK.LJFF = C906400Zh8.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c906520ZhK.LJ = C906370Zh5.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c906520ZhK.LIZLLL = C906410Zh9.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c906520ZhK.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C906380Zh6 c906380Zh6) {
            C906380Zh6 c906380Zh62 = c906380Zh6;
            return C906410Zh9.ADAPTER.encodedSizeWithTag(1, c906380Zh62.text_stream_block) + C906370Zh5.ADAPTER.encodedSizeWithTag(2, c906380Zh62.image_stream_block) + C906400Zh8.ADAPTER.encodedSizeWithTag(3, c906380Zh62.markdown_stream_block) + c906380Zh62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C906380Zh6 redact(C906380Zh6 c906380Zh6) {
            C906520ZhK c906520ZhKNewBuilder = c906380Zh6.newBuilder();
            C906410Zh9 c906410Zh9 = c906520ZhKNewBuilder.LIZLLL;
            if (c906410Zh9 != null) {
                c906520ZhKNewBuilder.LIZLLL = C906410Zh9.ADAPTER.redact(c906410Zh9);
            }
            C906370Zh5 c906370Zh5 = c906520ZhKNewBuilder.LJ;
            if (c906370Zh5 != null) {
                c906520ZhKNewBuilder.LJ = C906370Zh5.ADAPTER.redact(c906370Zh5);
            }
            C906400Zh8 c906400Zh8 = c906520ZhKNewBuilder.LJFF;
            if (c906400Zh8 != null) {
                c906520ZhKNewBuilder.LJFF = C906400Zh8.ADAPTER.redact(c906400Zh8);
            }
            c906520ZhKNewBuilder.clearUnknownFields();
            return c906520ZhKNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C906380Zh6 c906380Zh6) {
            C906380Zh6 c906380Zh62 = c906380Zh6;
            C906410Zh9.ADAPTER.encodeWithTag(protoWriter, 1, c906380Zh62.text_stream_block);
            C906370Zh5.ADAPTER.encodeWithTag(protoWriter, 2, c906380Zh62.image_stream_block);
            C906400Zh8.ADAPTER.encodeWithTag(protoWriter, 3, c906380Zh62.markdown_stream_block);
            protoWriter.writeBytes(c906380Zh62.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streaming.remote.data.ImageStreamBlock#ADAPTER", tag = 2)
    public final C906370Zh5 image_stream_block;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streaming.remote.data.MarkdownStreamBlock#ADAPTER", tag = 3)
    public final C906400Zh8 markdown_stream_block;

    @WireField(adapter = "com.ss.android.ugc.aweme.im.streaming.remote.data.TextStreamBlock#ADAPTER", tag = 1)
    public final C906410Zh9 text_stream_block;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C906410Zh9 c906410Zh9 = this.text_stream_block;
        int iHashCode2 = (iHashCode + (c906410Zh9 != null ? c906410Zh9.hashCode() : 0)) * 37;
        C906370Zh5 c906370Zh5 = this.image_stream_block;
        int iHashCode3 = (iHashCode2 + (c906370Zh5 != null ? c906370Zh5.hashCode() : 0)) * 37;
        C906400Zh8 c906400Zh8 = this.markdown_stream_block;
        int iHashCode4 = iHashCode3 + (c906400Zh8 != null ? c906400Zh8.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C906520ZhK newBuilder() {
        C906520ZhK c906520ZhK = new C906520ZhK();
        c906520ZhK.LIZLLL = this.text_stream_block;
        c906520ZhK.LJ = this.image_stream_block;
        c906520ZhK.LJFF = this.markdown_stream_block;
        c906520ZhK.addUnknownFields(unknownFields());
        return c906520ZhK;
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
        if (!(obj instanceof C906380Zh6)) {
            return false;
        }
        C906380Zh6 c906380Zh6 = (C906380Zh6) obj;
        if (unknownFields().equals(c906380Zh6.unknownFields()) && C1516540pZE.LJ(this.text_stream_block, c906380Zh6.text_stream_block) && C1516540pZE.LJ(this.image_stream_block, c906380Zh6.image_stream_block) && C1516540pZE.LJ(this.markdown_stream_block, c906380Zh6.markdown_stream_block)) {
            return true;
        }
        return false;
    }

    public C906380Zh6(C906410Zh9 c906410Zh9, C906370Zh5 c906370Zh5, C906400Zh8 c906400Zh8) {
        this(c906410Zh9, c906370Zh5, c906400Zh8, ByteString.EMPTY);
    }

    public C906380Zh6(C906410Zh9 c906410Zh9, C906370Zh5 c906370Zh5, C906400Zh8 c906400Zh8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text_stream_block = c906410Zh9;
        this.image_stream_block = c906370Zh5;
        this.markdown_stream_block = c906400Zh8;
    }
}
