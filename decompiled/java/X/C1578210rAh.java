package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0rAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578210rAh extends Message<C1578210rAh, C1578190rAf> {
    public static final ProtoAdapter<C1578210rAh> ADAPTER = new ProtoAdapter<C1578210rAh>() { // from class: X.0rAg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1578210rAh decode(ProtoReader protoReader) {
            C1578190rAf c1578190rAf = new C1578190rAf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1578190rAf.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c1578190rAf.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1578190rAf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 4:
                            c1578190rAf.LJFF = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c1578190rAf.LJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c1578190rAf.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c1578190rAf.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c1578190rAf.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1578190rAf.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1578190rAf.LJIIJJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1578190rAf.LJIIL.add(C1518180pbs.ADAPTER.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c1578190rAf.LJIILIIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c1578190rAf.LJIILJJIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            c1578190rAf.LJIILL.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 15:
                            c1578190rAf.LJIILLIIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            c1578190rAf.LJIIZILJ.add(C1578590rBJ.ADAPTER.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c1578190rAf.LJIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c1578190rAf.LJIJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            c1578190rAf.LJIJJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c1578190rAf.LJIJJLI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            c1578190rAf.LJIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 22:
                            c1578190rAf.LJJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            c1578190rAf.LJJI = C1578560rBG.ADAPTER.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c1578190rAf.LJJIFFI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 25:
                            c1578190rAf.LJJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 26:
                            c1578190rAf.LJJIII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1578190rAf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1578210rAh c1578210rAh) {
            C1578210rAh c1578210rAh2 = c1578210rAh;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1578210rAh2.collection_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1578210rAh2.title) + C673002jw.ADAPTER.encodedSizeWithTag(4, c1578210rAh2.cover);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, c1578210rAh2.num_videos) + protoAdapter3.encodedSizeWithTag(6, c1578210rAh2.num_watched) + protoAdapter3.encodedSizeWithTag(7, c1578210rAh2.last_watched) + protoAdapter2.encodedSizeWithTag(8, c1578210rAh2.categories);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(9, c1578210rAh2.label_hot) + protoAdapter4.encodedSizeWithTag(10, c1578210rAh2.label_new) + C1518180pbs.ADAPTER.asRepeated().encodedSizeWithTag(11, c1578210rAh2.theme_tag_list) + protoAdapter3.encodedSizeWithTag(12, c1578210rAh2.category) + protoAdapter4.encodedSizeWithTag(13, c1578210rAh2.is_limited_free) + protoAdapter.asRepeated().encodedSizeWithTag(14, c1578210rAh2.full_video_ids) + protoAdapter4.encodedSizeWithTag(15, c1578210rAh2.has_trailer) + C1578590rBJ.ADAPTER.asRepeated().encodedSizeWithTag(16, c1578210rAh2.video_list) + protoAdapter.encodedSizeWithTag(17, c1578210rAh2.first_unlocked_video_id) + protoAdapter4.encodedSizeWithTag(18, c1578210rAh2.show_rank_badge) + protoAdapter2.encodedSizeWithTag(19, c1578210rAh2.collection_id_str) + protoAdapter2.encodedSizeWithTag(20, c1578210rAh2.last_watched_video_id_str) + protoAdapter4.encodedSizeWithTag(21, c1578210rAh2.is_safety_selected) + protoAdapter2.encodedSizeWithTag(22, c1578210rAh2.description) + C1578560rBG.ADAPTER.encodedSizeWithTag(23, c1578210rAh2.log_extra) + protoAdapter.encodedSizeWithTag(24, c1578210rAh2.last_watched_time) + protoAdapter.encodedSizeWithTag(25, c1578210rAh2.heat_score) + protoAdapter3.encodedSizeWithTag(26, c1578210rAh2.badge_type) + c1578210rAh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1578210rAh c1578210rAh) {
            C1578210rAh c1578210rAh2 = c1578210rAh;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1578210rAh2.collection_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c1578210rAh2.title);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 4, c1578210rAh2.cover);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 5, c1578210rAh2.num_videos);
            protoAdapter3.encodeWithTag(protoWriter, 6, c1578210rAh2.num_watched);
            protoAdapter3.encodeWithTag(protoWriter, 7, c1578210rAh2.last_watched);
            protoAdapter2.encodeWithTag(protoWriter, 8, c1578210rAh2.categories);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            protoAdapter4.encodeWithTag(protoWriter, 9, c1578210rAh2.label_hot);
            protoAdapter4.encodeWithTag(protoWriter, 10, c1578210rAh2.label_new);
            C1518180pbs.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, c1578210rAh2.theme_tag_list);
            protoAdapter3.encodeWithTag(protoWriter, 12, c1578210rAh2.category);
            protoAdapter4.encodeWithTag(protoWriter, 13, c1578210rAh2.is_limited_free);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 14, c1578210rAh2.full_video_ids);
            protoAdapter4.encodeWithTag(protoWriter, 15, c1578210rAh2.has_trailer);
            C1578590rBJ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, c1578210rAh2.video_list);
            protoAdapter.encodeWithTag(protoWriter, 17, c1578210rAh2.first_unlocked_video_id);
            protoAdapter4.encodeWithTag(protoWriter, 18, c1578210rAh2.show_rank_badge);
            protoAdapter2.encodeWithTag(protoWriter, 19, c1578210rAh2.collection_id_str);
            protoAdapter2.encodeWithTag(protoWriter, 20, c1578210rAh2.last_watched_video_id_str);
            protoAdapter4.encodeWithTag(protoWriter, 21, c1578210rAh2.is_safety_selected);
            protoAdapter2.encodeWithTag(protoWriter, 22, c1578210rAh2.description);
            C1578560rBG.ADAPTER.encodeWithTag(protoWriter, 23, c1578210rAh2.log_extra);
            protoAdapter.encodeWithTag(protoWriter, 24, c1578210rAh2.last_watched_time);
            protoAdapter.encodeWithTag(protoWriter, 25, c1578210rAh2.heat_score);
            protoAdapter3.encodeWithTag(protoWriter, 26, c1578210rAh2.badge_type);
            protoWriter.writeBytes(c1578210rAh2.unknownFields());
        }
    };
    public Integer badge_type;
    public String categories;
    public Integer category;
    public Long collection_id;
    public String collection_id_str;
    public C673002jw cover;
    public String description;
    public Long first_unlocked_video_id;
    public List<Long> full_video_ids;
    public Boolean has_trailer;
    public Long heat_score;
    public Boolean is_limited_free;
    public Boolean is_safety_selected;
    public Boolean label_hot;
    public Boolean label_new;
    public Integer last_watched;
    public Long last_watched_time;
    public String last_watched_video_id_str;
    public C1578560rBG log_extra;
    public Integer num_videos;
    public Integer num_watched;
    public Boolean show_rank_badge;
    public List<C1518180pbs> theme_tag_list;
    public String title;
    public List<C1578590rBJ> video_list;

    @Override // com.squareup.wire.Message
    public C1578190rAf newBuilder() {
        return null;
    }

    public C1578210rAh(Long l, String str, C673002jw c673002jw, Integer num, Integer num2, Integer num3, String str2, Boolean bool, Boolean bool2, List<C1518180pbs> list, Integer num4, Boolean bool3, List<Long> list2, Boolean bool4, List<C1578590rBJ> list3, Long l2, Boolean bool5, String str3, String str4, Boolean bool6, String str5, C1578560rBG c1578560rBG, Long l3, Long l4, Integer num5) {
        this(l, str, c673002jw, num, num2, num3, str2, bool, bool2, list, num4, bool3, list2, bool4, list3, l2, bool5, str3, str4, bool6, str5, c1578560rBG, l3, l4, num5, ByteString.EMPTY);
    }

    public C1578210rAh(Long l, String str, C673002jw c673002jw, Integer num, Integer num2, Integer num3, String str2, Boolean bool, Boolean bool2, List<C1518180pbs> list, Integer num4, Boolean bool3, List<Long> list2, Boolean bool4, List<C1578590rBJ> list3, Long l2, Boolean bool5, String str3, String str4, Boolean bool6, String str5, C1578560rBG c1578560rBG, Long l3, Long l4, Integer num5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.collection_id = l;
        this.title = str;
        this.cover = c673002jw;
        this.num_videos = num;
        this.num_watched = num2;
        this.last_watched = num3;
        this.categories = str2;
        this.label_hot = bool;
        this.label_new = bool2;
        this.theme_tag_list = C1516540pZE.LJFF("theme_tag_list", list);
        this.category = num4;
        this.is_limited_free = bool3;
        this.full_video_ids = C1516540pZE.LJFF("full_video_ids", list2);
        this.has_trailer = bool4;
        this.video_list = C1516540pZE.LJFF("video_list", list3);
        this.first_unlocked_video_id = l2;
        this.show_rank_badge = bool5;
        this.collection_id_str = str3;
        this.last_watched_video_id_str = str4;
        this.is_safety_selected = bool6;
        this.description = str5;
        this.log_extra = c1578560rBG;
        this.last_watched_time = l3;
        this.heat_score = l4;
        this.badge_type = num5;
    }
}
