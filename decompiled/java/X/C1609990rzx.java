package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0rzx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609990rzx extends Message<C1609990rzx, C1610020s00> {
    public static final ProtoAdapter<C1609990rzx> ADAPTER = new ProtoAdapter<C1609990rzx>() { // from class: X.0rzw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1609990rzx decode(ProtoReader protoReader) {
            C1609990rzx c1609990rzx = new C1609990rzx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1609990rzx.media_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c1609990rzx.is_template_share_to_story = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c1609990rzx.original_content_author_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1609990rzx.original_content_video_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1609990rzx.has_text = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c1609990rzx.mention_nums = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c1609990rzx.is_own_video = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c1609990rzx.is_mention = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1609990rzx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1609990rzx c1609990rzx) {
            C1609990rzx c1609990rzx2 = c1609990rzx;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c1609990rzx2.media_type);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1609990rzx2.is_template_share_to_story);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, c1609990rzx2.original_content_author_id) + protoAdapter2.encodedSizeWithTag(4, c1609990rzx2.original_content_video_id) + protoAdapter.encodedSizeWithTag(5, c1609990rzx2.has_text) + protoAdapter2.encodedSizeWithTag(6, c1609990rzx2.mention_nums) + protoAdapter.encodedSizeWithTag(7, c1609990rzx2.is_own_video) + protoAdapter.encodedSizeWithTag(8, c1609990rzx2.is_mention) + c1609990rzx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1609990rzx c1609990rzx) {
            C1609990rzx c1609990rzx2 = c1609990rzx;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1609990rzx2.media_type);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 2, c1609990rzx2.is_template_share_to_story);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 3, c1609990rzx2.original_content_author_id);
            protoAdapter2.encodeWithTag(protoWriter, 4, c1609990rzx2.original_content_video_id);
            protoAdapter.encodeWithTag(protoWriter, 5, c1609990rzx2.has_text);
            protoAdapter2.encodeWithTag(protoWriter, 6, c1609990rzx2.mention_nums);
            protoAdapter.encodeWithTag(protoWriter, 7, c1609990rzx2.is_own_video);
            protoAdapter.encodeWithTag(protoWriter, 8, c1609990rzx2.is_mention);
            protoWriter.writeBytes(c1609990rzx2.unknownFields());
        }
    };
    public Boolean has_text;
    public Boolean is_mention;
    public Boolean is_own_video;
    public Boolean is_template_share_to_story;
    public Integer media_type;
    public Long mention_nums;
    public Long original_content_author_id;
    public Long original_content_video_id;

    public C1609990rzx() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1610020s00 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
