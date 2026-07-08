package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0242, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0242 extends Message<AnonymousClass0242, C02IB> {
    public static final ProtoAdapter<AnonymousClass0242> ADAPTER = new ProtoAdapter<AnonymousClass0242>() { // from class: X.022U
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0242 decode(ProtoReader protoReader) {
            AnonymousClass0242 anonymousClass0242 = new AnonymousClass0242();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0242.stories.add(C5186020i.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            anonymousClass0242.total_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0242.current_position = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0242.all_viewed = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0242.min_cursor = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0242.max_cursor = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0242.has_more_after = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0242.has_more_before = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0242.last_story_created_at = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0242.is_post_style = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0242.all_story_lite_metadata.add(C02CE.ADAPTER.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0242.is_story_guide_card = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            anonymousClass0242.forbidden_to_be_guide_card = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            anonymousClass0242.user_filter_story_info = C615602ag.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0242;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0242 anonymousClass0242) {
            AnonymousClass0242 anonymousClass02422 = anonymousClass0242;
            int iEncodedSizeWithTag = C5186020i.ADAPTER.asRepeated().encodedSizeWithTag(1, anonymousClass02422.stories);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, anonymousClass02422.total_count) + protoAdapter.encodedSizeWithTag(3, anonymousClass02422.current_position);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(4, anonymousClass02422.all_viewed) + protoAdapter.encodedSizeWithTag(5, anonymousClass02422.min_cursor) + protoAdapter.encodedSizeWithTag(6, anonymousClass02422.max_cursor) + protoAdapter2.encodedSizeWithTag(7, anonymousClass02422.has_more_after) + protoAdapter2.encodedSizeWithTag(8, anonymousClass02422.has_more_before) + protoAdapter.encodedSizeWithTag(9, anonymousClass02422.last_story_created_at) + protoAdapter2.encodedSizeWithTag(10, anonymousClass02422.is_post_style) + C02CE.ADAPTER.asRepeated().encodedSizeWithTag(11, anonymousClass02422.all_story_lite_metadata) + protoAdapter2.encodedSizeWithTag(12, anonymousClass02422.is_story_guide_card) + protoAdapter2.encodedSizeWithTag(13, anonymousClass02422.forbidden_to_be_guide_card) + C615602ag.ADAPTER.encodedSizeWithTag(14, anonymousClass02422.user_filter_story_info) + anonymousClass02422.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0242 anonymousClass0242) {
            AnonymousClass0242 anonymousClass02422 = anonymousClass0242;
            C5186020i.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, anonymousClass02422.stories);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, anonymousClass02422.total_count);
            protoAdapter.encodeWithTag(protoWriter, 3, anonymousClass02422.current_position);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 4, anonymousClass02422.all_viewed);
            protoAdapter.encodeWithTag(protoWriter, 5, anonymousClass02422.min_cursor);
            protoAdapter.encodeWithTag(protoWriter, 6, anonymousClass02422.max_cursor);
            protoAdapter2.encodeWithTag(protoWriter, 7, anonymousClass02422.has_more_after);
            protoAdapter2.encodeWithTag(protoWriter, 8, anonymousClass02422.has_more_before);
            protoAdapter.encodeWithTag(protoWriter, 9, anonymousClass02422.last_story_created_at);
            protoAdapter2.encodeWithTag(protoWriter, 10, anonymousClass02422.is_post_style);
            C02CE.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, anonymousClass02422.all_story_lite_metadata);
            protoAdapter2.encodeWithTag(protoWriter, 12, anonymousClass02422.is_story_guide_card);
            protoAdapter2.encodeWithTag(protoWriter, 13, anonymousClass02422.forbidden_to_be_guide_card);
            C615602ag.ADAPTER.encodeWithTag(protoWriter, 14, anonymousClass02422.user_filter_story_info);
            protoWriter.writeBytes(anonymousClass02422.unknownFields());
        }
    };
    public List<C02CE> all_story_lite_metadata;
    public Boolean all_viewed;
    public Long current_position;
    public Boolean forbidden_to_be_guide_card;
    public Boolean has_more_after;
    public Boolean has_more_before;
    public Boolean is_post_style;
    public Boolean is_story_guide_card;
    public Long last_story_created_at;
    public Long max_cursor;
    public Long min_cursor;
    public List<C5186020i> stories;
    public Long total_count;
    public C615602ag user_filter_story_info;

    public AnonymousClass0242() {
        super(ADAPTER, ByteString.EMPTY);
        this.stories = C1516540pZE.LJIIIIZZ();
        this.all_story_lite_metadata = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02IB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
