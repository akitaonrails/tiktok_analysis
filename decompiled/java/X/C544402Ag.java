package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C544402Ag extends Message<C544402Ag, C568802Jq> {
    public static final ProtoAdapter<C544402Ag> ADAPTER = new ProtoAdapter<C544402Ag>() { // from class: X.025S
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C544402Ag decode(ProtoReader protoReader) {
            C544402Ag c544402Ag = new C544402Ag();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c544402Ag.duet = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c544402Ag.stitch = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c544402Ag.duet_privacy_setting = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c544402Ag.stitch_privacy_setting = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c544402Ag.upvote = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c544402Ag.allow_adding_to_story = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c544402Ag.allow_create_sticker = C02V6.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c544402Ag.allow_story_switch_to_post = C02V6.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c544402Ag.allow_adding_as_post = C02V6.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c544402Ag.allow_ai_remix = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c544402Ag;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C544402Ag c544402Ag) {
            C544402Ag c544402Ag2 = c544402Ag;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c544402Ag2.duet) + protoAdapter.encodedSizeWithTag(2, c544402Ag2.stitch) + protoAdapter.encodedSizeWithTag(3, c544402Ag2.duet_privacy_setting) + protoAdapter.encodedSizeWithTag(4, c544402Ag2.stitch_privacy_setting) + protoAdapter.encodedSizeWithTag(5, c544402Ag2.upvote) + protoAdapter.encodedSizeWithTag(6, c544402Ag2.allow_adding_to_story);
            ProtoAdapter<C02V6> protoAdapter2 = C02V6.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(7, c544402Ag2.allow_create_sticker) + protoAdapter2.encodedSizeWithTag(8, c544402Ag2.allow_story_switch_to_post) + protoAdapter2.encodedSizeWithTag(9, c544402Ag2.allow_adding_as_post) + protoAdapter.encodedSizeWithTag(10, c544402Ag2.allow_ai_remix) + c544402Ag2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C544402Ag c544402Ag) {
            C544402Ag c544402Ag2 = c544402Ag;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c544402Ag2.duet);
            protoAdapter.encodeWithTag(protoWriter, 2, c544402Ag2.stitch);
            protoAdapter.encodeWithTag(protoWriter, 3, c544402Ag2.duet_privacy_setting);
            protoAdapter.encodeWithTag(protoWriter, 4, c544402Ag2.stitch_privacy_setting);
            protoAdapter.encodeWithTag(protoWriter, 5, c544402Ag2.upvote);
            protoAdapter.encodeWithTag(protoWriter, 6, c544402Ag2.allow_adding_to_story);
            ProtoAdapter<C02V6> protoAdapter2 = C02V6.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 7, c544402Ag2.allow_create_sticker);
            protoAdapter2.encodeWithTag(protoWriter, 8, c544402Ag2.allow_story_switch_to_post);
            protoAdapter2.encodeWithTag(protoWriter, 9, c544402Ag2.allow_adding_as_post);
            protoAdapter.encodeWithTag(protoWriter, 10, c544402Ag2.allow_ai_remix);
            protoWriter.writeBytes(c544402Ag2.unknownFields());
        }
    };
    public C02V6 allow_adding_as_post;
    public Integer allow_adding_to_story;
    public Integer allow_ai_remix;
    public C02V6 allow_create_sticker;
    public C02V6 allow_story_switch_to_post;
    public Integer duet;
    public Integer duet_privacy_setting;
    public Integer stitch;
    public Integer stitch_privacy_setting;
    public Integer upvote;

    public C544402Ag() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C568802Jq newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
