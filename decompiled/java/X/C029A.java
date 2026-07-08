package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.029A, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C029A extends Message<C029A, C565202Ig> {
    public static final ProtoAdapter<C029A> ADAPTER = new ProtoAdapter<C029A>() { // from class: X.024H
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C029A decode(ProtoReader protoReader) {
            C029A c029a = new C029A();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c029a.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c029a.comment_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c029a.digg_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c029a.download_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c029a.play_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c029a.share_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c029a.forward_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c029a.lose_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c029a.lose_comment_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c029a.whatsapp_share_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c029a.collect_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c029a.repost_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c029a;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C029A c029a) {
            C029A c029a2 = c029a;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c029a2.aweme_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c029a2.comment_count) + protoAdapter.encodedSizeWithTag(3, c029a2.digg_count) + protoAdapter.encodedSizeWithTag(4, c029a2.download_count) + protoAdapter.encodedSizeWithTag(5, c029a2.play_count) + protoAdapter.encodedSizeWithTag(6, c029a2.share_count) + protoAdapter.encodedSizeWithTag(7, c029a2.forward_count);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(8, c029a2.lose_count) + protoAdapter2.encodedSizeWithTag(9, c029a2.lose_comment_count) + protoAdapter.encodedSizeWithTag(10, c029a2.whatsapp_share_count) + protoAdapter.encodedSizeWithTag(11, c029a2.collect_count) + protoAdapter.encodedSizeWithTag(12, c029a2.repost_count) + c029a2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C029A c029a) {
            C029A c029a2 = c029a;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c029a2.aweme_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c029a2.comment_count);
            protoAdapter.encodeWithTag(protoWriter, 3, c029a2.digg_count);
            protoAdapter.encodeWithTag(protoWriter, 4, c029a2.download_count);
            protoAdapter.encodeWithTag(protoWriter, 5, c029a2.play_count);
            protoAdapter.encodeWithTag(protoWriter, 6, c029a2.share_count);
            protoAdapter.encodeWithTag(protoWriter, 7, c029a2.forward_count);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 8, c029a2.lose_count);
            protoAdapter2.encodeWithTag(protoWriter, 9, c029a2.lose_comment_count);
            protoAdapter.encodeWithTag(protoWriter, 10, c029a2.whatsapp_share_count);
            protoAdapter.encodeWithTag(protoWriter, 11, c029a2.collect_count);
            protoAdapter.encodeWithTag(protoWriter, 12, c029a2.repost_count);
            protoWriter.writeBytes(c029a2.unknownFields());
        }
    };
    public String aweme_id;
    public Long collect_count;
    public Long comment_count;
    public Long digg_count;
    public Long download_count;
    public Long forward_count;
    public Integer lose_comment_count;
    public Integer lose_count;
    public Long play_count;
    public Long repost_count;
    public Long share_count;
    public Long whatsapp_share_count;

    public C029A() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C565202Ig newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
