package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.020i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5186020i extends Message<C5186020i, C02J8> {
    public static final ProtoAdapter<C5186020i> ADAPTER = new ProtoAdapter<C5186020i>() { // from class: X.020j
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ C5186020i decode(ProtoReader protoReader) {
            C5186020i c5186020i = new C5186020i();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5186020i.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5186020i.desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5186020i.create_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c5186020i.author = C5189020l.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c5186020i.music = C5199020v.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5186020i.cha_list.add(C021F.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c5186020i.video = AnonymousClass0213.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5186020i.share_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5186020i.user_digged = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5186020i.statistics = C029A.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5186020i.status = C024B.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5186020i.extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5186020i.rate = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            c5186020i.text_extra.add(C5312025e.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            c5186020i.label_large = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            c5186020i.label_thumb = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5186020i.is_top = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5186020i.label_top = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c5186020i.share_info = C5271023p.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5186020i.label_origin_author = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            c5186020i.distance = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            c5186020i.label_music_starter = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 23:
                            c5186020i.label_private = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c5186020i.video_labels.add(C02FQ.ADAPTER.decode(protoReader));
                            break;
                        case 25:
                            c5186020i.is_vr = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 26:
                            c5186020i.landing_page = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 27:
                            c5186020i.is_ads = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 28:
                        case 31:
                        case 32:
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        case 43:
                        case 51:
                        case 56:
                        case 60:
                        case 61:
                        case 75:
                        case 94:
                        case 100:
                        case 120:
                        case 145:
                        case 146:
                        case 152:
                        case 153:
                        case 155:
                        case 156:
                        case 157:
                        case 158:
                        case 159:
                        case 166:
                        case 175:
                        case 176:
                        case 177:
                        case 178:
                        case 179:
                        case 184:
                        case 192:
                        case 254:
                        case 287:
                        case 339:
                        case 340:
                        case 341:
                        case 342:
                        case 343:
                        case 344:
                        case 345:
                        case 346:
                        case 347:
                        case 348:
                        case 349:
                        case 350:
                        case 351:
                        case 352:
                        case 353:
                        case 354:
                        case 355:
                        case 356:
                        case 357:
                        case 358:
                        case 359:
                        case 360:
                        case 361:
                        case 362:
                        case 363:
                        case 364:
                        case 365:
                        case 366:
                        case 367:
                        case 368:
                        case 369:
                        case 370:
                        case 371:
                        case 372:
                        case 373:
                        case 374:
                        case 375:
                        case 376:
                        case 377:
                        case 378:
                        case 379:
                        case 380:
                        case 381:
                        case 382:
                        case 383:
                        case 384:
                        case 385:
                        case 386:
                        case 388:
                        case 389:
                        case 390:
                        case 391:
                        case 392:
                        case 393:
                        case 394:
                        case 395:
                        case 396:
                        case 397:
                        case 398:
                        case 399:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 29:
                            c5186020i.duration = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 30:
                            c5186020i.aweme_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 35:
                            c5186020i.cmt_swt = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            c5186020i.image_infos.add(C02E5.ADAPTER.decode(protoReader));
                            break;
                        case 37:
                            c5186020i.risk_infos = C02CM.ADAPTER.decode(protoReader);
                            break;
                        case 38:
                            c5186020i.is_relieve = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 39:
                            c5186020i.label_friend = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 40:
                            c5186020i.sort_label = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 41:
                            c5186020i.position.add(C559902Gf.ADAPTER.decode(protoReader));
                            break;
                        case 42:
                            c5186020i.uniqid_position.add(C559902Gf.ADAPTER.decode(protoReader));
                            break;
                        case 44:
                            c5186020i.author_user_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 45:
                            c5186020i.bodydance_score = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 46:
                            c5186020i.geofencing.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 47:
                            c5186020i.is_hash_tag = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 48:
                            c5186020i.is_pgcshow = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 49:
                            c5186020i.region = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                            c5186020i.video_text.add(C556502Ex.ADAPTER.decode(protoReader));
                            break;
                        case 52:
                            c5186020i.sp_sticker = C550302Cn.ADAPTER.decode(protoReader);
                            break;
                        case 53:
                            c5186020i.ad_schedule = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 54:
                            c5186020i.collect_stat = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 55:
                            c5186020i.label_top_text.add(C556502Ex.ADAPTER.decode(protoReader));
                            break;
                        case 57:
                            c5186020i.stickers = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 58:
                            c5186020i.forward_item = C5186020i.ADAPTER.decode(protoReader);
                            break;
                        case 59:
                            c5186020i.forward_comment_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BaseNotice.CREATOR /* 62 */:
                            c5186020i.forward_item_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 63:
                            c5186020i.group_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 64:
                            c5186020i.pre_forward_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 65:
                            c5186020i.prevent_download = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 66:
                            c5186020i.nickname_position.add(C559902Gf.ADAPTER.decode(protoReader));
                            break;
                        case 67:
                            c5186020i.challenge_position.add(C559902Gf.ADAPTER.decode(protoReader));
                            break;
                        case 68:
                            c5186020i.item_comment_settings = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 69:
                            c5186020i.descendants = C618902bD.ADAPTER.decode(protoReader);
                            break;
                        case 70:
                            c5186020i.raw_ad_data = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 71:
                            c5186020i.game_info = C628102ch.ADAPTER.decode(protoReader);
                            break;
                        case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                            c5186020i.micro_app_info = AnonymousClass0299.ADAPTER.decode(protoReader);
                            break;
                        case 73:
                            c5186020i.with_promotional_music = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 74:
                            c5186020i.link_ad_data = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 76:
                            c5186020i.gesture_red_packet = AnonymousClass0263.ADAPTER.decode(protoReader);
                            break;
                        case 77:
                            c5186020i.activity_pendant = AnonymousClass0263.ADAPTER.decode(protoReader);
                            break;
                        case 78:
                            c5186020i.sticker_detail = C022S.ADAPTER.decode(protoReader);
                            break;
                        case 79:
                            c5186020i.long_video.add(C02BX.ADAPTER.decode(protoReader));
                            break;
                        case 80:
                            c5186020i.item_duet = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 81:
                            c5186020i.item_react = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 82:
                            c5186020i.hot_info = C544302Af.ADAPTER.decode(protoReader);
                            break;
                        case 83:
                            c5186020i.star_atlas_order_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 84:
                            c5186020i.label_music_starter_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 85:
                            c5186020i.without_watermark = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 86:
                            c5186020i.preload = C544502Ah.ADAPTER.decode(protoReader);
                            break;
                        case 87:
                            c5186020i.star_recommend_tag = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 88:
                            c5186020i.ad_order_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 89:
                            c5186020i.open_platform_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 90:
                            c5186020i.star_atlas_info = C1CBX.ADAPTER.decode(protoReader);
                            break;
                        case 91:
                            c5186020i.desc_language = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 92:
                            c5186020i.floating_card_content = C5426029o.ADAPTER.decode(protoReader);
                            break;
                        case 93:
                            c5186020i.interaction_stickers.add(AnonymousClass0216.ADAPTER.decode(protoReader));
                            break;
                        case 95:
                            c5186020i.ad_link_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 96:
                            c5186020i.take_down_reason = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 97:
                            c5186020i.take_down_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 98:
                            c5186020i.simple_promotions = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 99:
                            c5186020i.misc_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 101:
                            c5186020i.origin_comment_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 102:
                            c5186020i.commerce_config_data.add(C656202hE.ADAPTER.decode(protoReader));
                            break;
                        case 103:
                            c5186020i.commerce_sticker_info = C550702Cr.ADAPTER.decode(protoReader);
                            break;
                        case 104:
                            c5186020i.enable_top_view = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 105:
                            c5186020i.distribute_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 106:
                            c5186020i.video_control = C02A4.ADAPTER.decode(protoReader);
                            break;
                        case 107:
                            c5186020i.is_effect_designer = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 108:
                            c5186020i.ad_aweme_source = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 109:
                            c5186020i.aweme_control = C02F4.ADAPTER.decode(protoReader);
                            break;
                        case 110:
                            c5186020i.has_vs_entry = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 111:
                            c5186020i.anchor = C546902Bf.ADAPTER.decode(protoReader);
                            break;
                        case 112:
                            c5186020i.feed_relation_label = C02C2.ADAPTER.decode(protoReader);
                            break;
                        case 113:
                            c5186020i.mix_info = AnonymousClass0285.ADAPTER.decode(protoReader);
                            break;
                        case 114:
                            c5186020i.simple_shop_seeding = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 115:
                            c5186020i.hot_list = C02CT.ADAPTER.decode(protoReader);
                            break;
                        case 116:
                            c5186020i.commerce_info = C5228021y.ADAPTER.decode(protoReader);
                            break;
                        case 117:
                            c5186020i.national_task_info = C2227811CHj.ADAPTER.decode(protoReader);
                            break;
                        case 118:
                            c5186020i.banner_tip = C02ER.ADAPTER.decode(protoReader);
                            break;
                        case 119:
                            c5186020i.acl_info = C027T.ADAPTER.decode(protoReader);
                            break;
                        case 121:
                            c5186020i.anchor_info = C544602Ai.ADAPTER.decode(protoReader);
                            break;
                        case 122:
                            c5186020i.vpa_info = C726102sV.ADAPTER.decode(protoReader);
                            break;
                        case 123:
                            c5186020i.cny_info = C549102Cb.ADAPTER.decode(protoReader);
                            break;
                        case 124:
                            c5186020i.is_familiar = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 125:
                            c5186020i.need_vs_entry = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 126:
                            c5186020i.cell_room = AnonymousClass0287.ADAPTER.decode(protoReader);
                            break;
                        case 127:
                            c5186020i.live_reason = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 128:
                            c5186020i.video_feed_tag = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 129:
                            c5186020i.mask_info = C02AY.ADAPTER.decode(protoReader);
                            break;
                        case 130:
                            c5186020i.link_match = C02CB.ADAPTER.decode(protoReader);
                            break;
                        case 131:
                            c5186020i.video_reply_info = C02B6.ADAPTER.decode(protoReader);
                            break;
                        case 132:
                            c5186020i.anchors.add(C5227021x.ADAPTER.decode(protoReader));
                            break;
                        case 133:
                            c5186020i.hybrid_label.add(C550402Co.ADAPTER.decode(protoReader));
                            break;
                        case 134:
                            c5186020i.relation_recommend_info = C556302Ev.ADAPTER.decode(protoReader);
                            break;
                        case 135:
                            c5186020i.user_profile_init_info = C665102if.ADAPTER.decode(protoReader);
                            break;
                        case 136:
                            c5186020i.with_survey = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 137:
                            c5186020i.dou_discount_mix_info = C544302Af.ADAPTER.decode(protoReader);
                            break;
                        case 138:
                            c5186020i.aweme_acl = C027T.ADAPTER.decode(protoReader);
                            break;
                        case 139:
                            c5186020i.activity = C02GB.ADAPTER.decode(protoReader);
                            break;
                        case 140:
                            c5186020i.story_group = C2226971CEd.ADAPTER.decode(protoReader);
                            break;
                        case 141:
                            c5186020i.is_story = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 142:
                            c5186020i.vs_entry = C2251241D9m.ADAPTER.decode(protoReader);
                            break;
                        case 143:
                            c5186020i.item_stitch = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 144:
                            c5186020i.cloud_game = C2226281CBm.ADAPTER.decode(protoReader);
                            break;
                        case 147:
                            c5186020i.show_sticker_guide = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 148:
                            c5186020i.story_ttl = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 149:
                            c5186020i.is_horizontal = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 150:
                            c5186020i.geofencing_regions.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 151:
                            c5186020i.city = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 154:
                            c5186020i.mutual_relation_tmp = C02C6.ADAPTER.decode(protoReader);
                            break;
                        case 160:
                            c5186020i.anchors_extras = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 161:
                            c5186020i.allow_gift = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 162:
                            c5186020i.mutual_relation = C02C6.ADAPTER.decode(protoReader);
                            break;
                        case 163:
                            c5186020i.mask_infos.add(C02AY.ADAPTER.decode(protoReader));
                            break;
                        case 164:
                            c5186020i.boost_tag_info = C618002b4.ADAPTER.decode(protoReader);
                            break;
                        case 165:
                            c5186020i.bottom_bar = C02UP.ADAPTER.decode(protoReader);
                            break;
                        case 167:
                            c5186020i.playlist_info = C608702Yz.ADAPTER.decode(protoReader);
                            break;
                        case 168:
                            c5186020i.sound_exemption = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 169:
                            c5186020i.stitch = C1CAO.ADAPTER.decode(protoReader);
                            break;
                        case 170:
                            c5186020i.playlist_blocked = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 171:
                            c5186020i.part_n = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 172:
                            c5186020i.green_screen_materials.add(C550902Ct.ADAPTER.decode(protoReader));
                            break;
                        case 173:
                            c5186020i.stitch_permission = C732502tX.ADAPTER.decode(protoReader);
                            break;
                        case 174:
                            c5186020i.trending_bar = C02CP.ADAPTER.decode(protoReader);
                            break;
                        case 180:
                            c5186020i.user_story = AnonymousClass0242.ADAPTER.decode(protoReader);
                            break;
                        case 181:
                            c5186020i.story_metadata = C595302Tv.ADAPTER.decode(protoReader);
                            break;
                        case 182:
                            c5186020i.interact_permission = C544402Ag.ADAPTER.decode(protoReader);
                            break;
                        case 183:
                            c5186020i.item_distribute_source = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 185:
                            c5186020i.question_list.add(C550502Cp.ADAPTER.decode(protoReader));
                            break;
                        case 186:
                            c5186020i.audio = C02BA.ADAPTER.decode(protoReader);
                            break;
                        case 187:
                            c5186020i.upvote_reason = C5411028z.ADAPTER.decode(protoReader);
                            break;
                        case 188:
                            c5186020i.deduplication_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 189:
                            c5186020i.interaction_tag_info = C02C3.ADAPTER.decode(protoReader);
                            break;
                        case 190:
                            c5186020i.content_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 191:
                            c5186020i.content_desc_extra.add(C5312025e.ADAPTER.decode(protoReader));
                            break;
                        case 193:
                            c5186020i.duet_info = C621102bZ.ADAPTER.decode(protoReader);
                            break;
                        case 194:
                            c5186020i.extra_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 195:
                            c5186020i.item_source_category = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 196:
                            c5186020i.enable_pos_adjust = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 197:
                            c5186020i.enable_ad_drop = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 198:
                            c5186020i.pred_playtime = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 199:
                            c5186020i.gap_list.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 200:
                            c5186020i.is_client_cache = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 201:
                            c5186020i.follow_up_publish_from_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 202:
                            c5186020i.trending_bar_fyp = C02CO.ADAPTER.decode(protoReader);
                            break;
                        case 203:
                            c5186020i.music_dsp_info = C546302Az.ADAPTER.decode(protoReader);
                            break;
                        case 204:
                            c5186020i.disable_search_trending_bar = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 205:
                            c5186020i.image_post_info = C026X.ADAPTER.decode(protoReader);
                            break;
                        case 206:
                            c5186020i.suggest_words = C552202Dg.ADAPTER.decode(protoReader);
                            break;
                        case 207:
                            c5186020i.GroupIdList = C619202bG.ADAPTER.decode(protoReader);
                            break;
                        case 208:
                            c5186020i.commercial_video_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 209:
                            c5186020i.allow_reuse_original_sound = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 210:
                            c5186020i.music_begin_time_in_ms = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 211:
                            c5186020i.music_end_time_in_ms = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 212:
                            c5186020i.retry_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 213:
                            c5186020i.upvote_preload = C668402jC.ADAPTER.decode(protoReader);
                            break;
                        case 214:
                            c5186020i.commerce_rerank_info = C620502bT.ADAPTER.decode(protoReader);
                            break;
                        case 215:
                            c5186020i.share_to_story_info = C627802ce.ADAPTER.decode(protoReader);
                            break;
                        case 216:
                            c5186020i.ad_story_video = C02CW.ADAPTER.decode(protoReader);
                            break;
                        case 217:
                            c5186020i.nearby_info = C620202bQ.ADAPTER.decode(protoReader);
                            break;
                        case 218:
                            c5186020i.branded_content_accounts.add(C5189020l.ADAPTER.decode(protoReader));
                            break;
                        case 219:
                            c5186020i.rec_reason = C5436029y.ADAPTER.decode(protoReader);
                            break;
                        case 220:
                            c5186020i.should_add_creator_tts_watermark_when_downloading = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 221:
                            c5186020i.poi_data = C5225021v.ADAPTER.decode(protoReader);
                            break;
                        case 222:
                            c5186020i.is_description_translatable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 223:
                            c5186020i.now_posts = C5215021l.ADAPTER.decode(protoReader);
                            break;
                        case 224:
                            c5186020i.podcast_info = C5281023z.ADAPTER.decode(protoReader);
                            break;
                        case 225:
                            c5186020i.follow_up_first_item_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 226:
                            c5186020i.follow_up_item_id_groups = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 227:
                            c5186020i.story_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 228:
                            c5186020i.is_text_sticker_translatable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 229:
                            c5186020i.text_sticker_major_lang = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 230:
                            c5186020i.ttm_info = C02E6.ADAPTER.decode(protoReader);
                            break;
                        case 231:
                            c5186020i.edit_post_permission = C02S8.ADAPTER.decode(protoReader);
                            break;
                        case 232:
                            c5186020i.original_client_text = C02D8.ADAPTER.decode(protoReader);
                            break;
                        case 233:
                            c5186020i.music_selected_from = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 234:
                            c5186020i.tts_voice_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 235:
                            c5186020i.reference_tts_voice_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 236:
                            c5186020i.voice_filter_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 237:
                            c5186020i.reference_voice_filter_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 238:
                            c5186020i.music_title_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 239:
                            c5186020i.promote = C550802Cs.ADAPTER.decode(protoReader);
                            break;
                        case 240:
                            c5186020i.animated_image_info = C626302cP.ADAPTER.decode(protoReader);
                            break;
                        case 241:
                            c5186020i.comment_config = C5214021k.ADAPTER.decode(protoReader);
                            break;
                        case 242:
                            c5186020i.survey_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 243:
                            c5186020i.trans_params = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 244:
                            c5186020i.animated_btn = C551602Da.ADAPTER.decode(protoReader);
                            break;
                        case 245:
                            c5186020i.survey_info.add(C5425029n.ADAPTER.decode(protoReader));
                            break;
                        case 246:
                            c5186020i.added_sound_music_info = C5199020v.ADAPTER.decode(protoReader);
                            break;
                        case 247:
                            c5186020i.origin_volume = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 248:
                            c5186020i.music_volume = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 249:
                            c5186020i.support_danmaku = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 250:
                            c5186020i.has_danmaku = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 251:
                            c5186020i.real_survey_info = C5425029n.ADAPTER.decode(protoReader);
                            break;
                        case 252:
                            c5186020i.card = C02CI.ADAPTER.decode(protoReader);
                            break;
                        case 253:
                            c5186020i.ttec_suggest_words = C552402Di.ADAPTER.decode(protoReader);
                            break;
                        case 255:
                            c5186020i.content_original_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 256:
                            c5186020i.shoot_tab_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 257:
                            c5186020i.content_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 258:
                            c5186020i.content_size_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 259:
                            c5186020i.is_tiktok_story = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 260:
                            c5186020i.is_sub_only_video = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 261:
                            c5186020i.is_nff_or_nr = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 262:
                            c5186020i.podcast_full_episode_item = C5186020i.ADAPTER.decode(protoReader);
                            break;
                        case 263:
                            c5186020i.parameterized_speed = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case 264:
                            c5186020i.operator_boost_info.add(C557502Fh.ADAPTER.decode(protoReader));
                            break;
                        case 265:
                            c5186020i.filter_unfriendly_user_comments = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 266:
                            c5186020i.filter_stranger_comments = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 267:
                            c5186020i.is_story_to_normal = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 268:
                            c5186020i.fake_landscape_video_info = C02DQ.ADAPTER.decode(protoReader);
                            break;
                        case 269:
                            c5186020i.main_arch_common = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 270:
                            c5186020i.batch_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 271:
                            c5186020i.batch_index = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 272:
                            c5186020i.aigc_info = C687002mC.ADAPTER.decode(protoReader);
                            break;
                        case 273:
                            c5186020i.ttt_product_recall_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 274:
                            c5186020i.related_live = C02W5.ADAPTER.decode(protoReader);
                            break;
                        case 275:
                            c5186020i.share_story_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 276:
                            c5186020i.add_yours_recommendation = C02US.ADAPTER.decode(protoReader);
                            break;
                        case 277:
                            c5186020i.banners.add(C02D9.ADAPTER.decode(protoReader));
                            break;
                        case 278:
                            c5186020i.picked_users.add(C5189020l.ADAPTER.decode(protoReader));
                            break;
                        case 279:
                            c5186020i.standard_component_info = C02AT.ADAPTER.decode(protoReader);
                            break;
                        case 280:
                            c5186020i.is_comment_post_video = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 281:
                            c5186020i.comment_post_video = C667502j3.ADAPTER.decode(protoReader);
                            break;
                        case 282:
                            c5186020i.has_promote_entry = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 283:
                            c5186020i.promote_toast = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 284:
                            c5186020i.promote_toast_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 285:
                            c5186020i.share_operation_info = C600902Vz.ADAPTER.decode(protoReader);
                            break;
                        case 286:
                            c5186020i.show_quick_dm_box = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 288:
                            c5186020i.title_language = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 289:
                            c5186020i.upvote_info = C02C4.ADAPTER.decode(protoReader);
                            break;
                        case 290:
                            c5186020i.share_to_video_info = C667802j6.ADAPTER.decode(protoReader);
                            break;
                        case 291:
                            c5186020i.comment_topbar_info.add(C025O.ADAPTER.decode(protoReader));
                            break;
                        case 292:
                            c5186020i.user_affinity_score = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 293:
                            c5186020i.music_promo_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 294:
                            c5186020i.music_retriever_flag = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 295:
                            c5186020i.content_model = C610002Zm.ADAPTER.decode(protoReader);
                            break;
                        case 296:
                            c5186020i.creation_info = C663702iR.ADAPTER.decode(protoReader);
                            break;
                        case 297:
                            c5186020i.interactive_rec_hit_instructions.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 298:
                            c5186020i.market_sub_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 299:
                            c5186020i.market_drop_strategy = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                            c5186020i.collab_info = C02GU.ADAPTER.decode(protoReader);
                            break;
                        case 301:
                            c5186020i.title_limited_rows = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 302:
                            c5186020i.text_consumption_info = C028C.ADAPTER.decode(protoReader);
                            break;
                        case 303:
                            c5186020i.music_promo_tag_info = C02E9.ADAPTER.decode(protoReader);
                            break;
                        case 304:
                            c5186020i.rec_reason_tag = C557702Fj.ADAPTER.decode(protoReader);
                            break;
                        case 305:
                            c5186020i.live_room_stats_tag.add(C02SK.ADAPTER.decode(protoReader));
                            break;
                        case 306:
                            c5186020i.moments_mode_info = C713502qT.ADAPTER.decode(protoReader);
                            break;
                        case 307:
                            c5186020i.music_fusion_info = C02C5.ADAPTER.decode(protoReader);
                            break;
                        case 308:
                            c5186020i.story_note_info = C027M.ADAPTER.decode(protoReader);
                            break;
                        case 309:
                            c5186020i.promote_icon_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 310:
                            c5186020i.used_full_song = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 311:
                            c5186020i.on_device_ml_features = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 312:
                            c5186020i.realtime_fcp_config = C02UD.ADAPTER.decode(protoReader);
                            break;
                        case 313:
                            c5186020i.interactive_rec_match_info = C02DH.ADAPTER.decode(protoReader);
                            break;
                        case 314:
                            c5186020i.add_yours_info = C666302ir.ADAPTER.decode(protoReader);
                            break;
                        case 315:
                            c5186020i.internal_share = C5410028y.ADAPTER.decode(protoReader);
                            break;
                        case 316:
                            c5186020i.is_paid_content = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 317:
                            c5186020i.paid_content_info = C021E.ADAPTER.decode(protoReader);
                            break;
                        case 318:
                            c5186020i.music_discovery_info = C559202Fy.ADAPTER.decode(protoReader);
                            break;
                        case 319:
                            c5186020i.ocean_group_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 320:
                            c5186020i.similar_video_info = C669002jI.ADAPTER.decode(protoReader);
                            break;
                        case 321:
                            c5186020i.c2pa_info = C5313025f.ADAPTER.decode(protoReader);
                            break;
                        case 322:
                            c5186020i.video_mention_info = C666602iu.ADAPTER.decode(protoReader);
                            break;
                        case 323:
                            c5186020i.use_aweme_cache = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 324:
                            c5186020i.abroll = C2223211Bzr.ADAPTER.decode(protoReader);
                            break;
                        case 325:
                            c5186020i.has_ever_advertised = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 326:
                            c5186020i.live_extra_info_struct = C02SM.ADAPTER.decode(protoReader);
                            break;
                        case 327:
                            c5186020i.prompt_result = C559402Ga.ADAPTER.decode(protoReader);
                            break;
                        case 328:
                            c5186020i.time_portal = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 329:
                            c5186020i.is_streaks_post = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 330:
                            c5186020i.streaks_meta = C667202j0.ADAPTER.decode(protoReader);
                            break;
                        case 331:
                            c5186020i.celebration_metadata = C670502jX.ADAPTER.decode(protoReader);
                            break;
                        case 332:
                            c5186020i.consumption_recall = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 333:
                            c5186020i.is_high_consumption_val = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 334:
                            c5186020i.quick_reply_emojis.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 335:
                            c5186020i.new_user_recommended_reason = C02H7.ADAPTER.decode(protoReader);
                            break;
                        case 336:
                            c5186020i.visual_search_info = AnonymousClass0243.ADAPTER.decode(protoReader);
                            break;
                        case 337:
                            c5186020i.template_config = C550202Cm.ADAPTER.decode(protoReader);
                            break;
                        case 338:
                            c5186020i.search_info_struct.add(C558502Fr.ADAPTER.decode(protoReader));
                            break;
                        case 387:
                            c5186020i.is_title_translatable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 400:
                            c5186020i.social_interaction_blob = C673702k3.ADAPTER.decode(protoReader);
                            break;
                        case 401:
                            c5186020i.solaria_profile = C674002k6.ADAPTER.decode(protoReader);
                            break;
                        case 402:
                            c5186020i.is_social_fresh_content = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 403:
                            c5186020i.convert_to_fyp_card = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 404:
                            c5186020i.convert_to_fyp_card_expire_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 405:
                            c5186020i.is_unconsumed_resuse = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 406:
                            c5186020i.meme_reg_info = C653802gq.ADAPTER.decode(protoReader);
                            break;
                        case 407:
                            c5186020i.onboarding_survey = C626002cM.ADAPTER.decode(protoReader);
                            break;
                        case 408:
                            c5186020i.desc_title_translated_text = C02D4.ADAPTER.decode(protoReader);
                            break;
                        case 409:
                            c5186020i.outflow_poi_data = C5225021v.ADAPTER.decode(protoReader);
                            break;
                        case 410:
                            c5186020i.layout_info = C632402dO.ADAPTER.decode(protoReader);
                            break;
                        case 411:
                            c5186020i.golden_cache_config = C669302jL.ADAPTER.decode(protoReader);
                            break;
                        case 412:
                            c5186020i.moderation_aigc_info = C596802Uk.ADAPTER.decode(protoReader);
                            break;
                        case 413:
                            c5186020i.landscape_video = C700102oJ.ADAPTER.decode(protoReader);
                            break;
                        case 414:
                            c5186020i.smart_search_info = C02UA.ADAPTER.decode(protoReader);
                            break;
                        case 415:
                            c5186020i.survey_tags = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 416:
                            c5186020i.ttec_search_growth_info = C556202Eu.ADAPTER.decode(protoReader);
                            break;
                        case 417:
                            c5186020i.tns_ue_feed_info = C02LL.ADAPTER.decode(protoReader);
                            break;
                        case 418:
                            c5186020i.local_service_info = C02SS.ADAPTER.decode(protoReader);
                            break;
                        case 419:
                            c5186020i.ai_info = C1CCK.ADAPTER.decode(protoReader);
                            break;
                        case 420:
                            c5186020i.declaration_info.add(C02HS.ADAPTER.decode(protoReader));
                            break;
                        case 421:
                            c5186020i.ai_alive_info = C02FN.ADAPTER.decode(protoReader);
                            break;
                        case 422:
                            c5186020i.imagine_sticker_info = C027K.ADAPTER.decode(protoReader);
                            break;
                        case 423:
                            c5186020i.tako_bubble_info = C664802ic.ADAPTER.decode(protoReader);
                            break;
                        case 424:
                            c5186020i.creator_ai_comment = C1CCQ.ADAPTER.decode(protoReader);
                            break;
                        case 425:
                            c5186020i.is_spark_plus = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 426:
                            c5186020i.personalized_survey_ui = C668102j9.ADAPTER.decode(protoReader);
                            break;
                        case 427:
                            c5186020i.brand_safety_info = C687402mG.ADAPTER.decode(protoReader);
                            break;
                        case 428:
                            c5186020i.translated_video = C02E1.ADAPTER.decode(protoReader);
                            break;
                        case 429:
                            c5186020i.psp_info = C674902kF.ADAPTER.decode(protoReader);
                            break;
                        case 430:
                            c5186020i.ic_asset_info.add(C02DS.ADAPTER.decode(protoReader));
                            break;
                        case 431:
                            c5186020i.ai_theater_info = C5296024o.ADAPTER.decode(protoReader);
                            break;
                        case 432:
                            c5186020i.comment_at_tako_info = C666902ix.ADAPTER.decode(protoReader);
                            break;
                        case 433:
                            c5186020i.ai_remix_info = C027Z.ADAPTER.decode(protoReader);
                            break;
                        case 434:
                            c5186020i.item_allow_ai_remix = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 435:
                            c5186020i.poi_trace = C02VC.ADAPTER.decode(protoReader);
                            break;
                        case 436:
                            c5186020i.detail_lynx_card_info = C655602h8.ADAPTER.decode(protoReader);
                            break;
                        case 437:
                            c5186020i.personalized_onboarding_survey = C622602bo.ADAPTER.decode(protoReader);
                            break;
                        case 438:
                            c5186020i.offline_video_info = C661502i5.ADAPTER.decode(protoReader);
                            break;
                        case 439:
                            c5186020i.ai_portrait_info = AnonymousClass0267.ADAPTER.decode(protoReader);
                            break;
                        case 440:
                            c5186020i.ai_chat_meta = C739002ua.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5186020i;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ int encodedSize(C5186020i c5186020i) {
            C5186020i c5186020i2 = c5186020i;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5186020i2.aweme_id) + protoAdapter.encodedSizeWithTag(2, c5186020i2.desc);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c5186020i2.create_time);
            ProtoAdapter<C5189020l> protoAdapter3 = C5189020l.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c5186020i2.author);
            ProtoAdapter<C5199020v> protoAdapter4 = C5199020v.ADAPTER;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(5, c5186020i2.music) + C021F.ADAPTER.asRepeated().encodedSizeWithTag(6, c5186020i2.cha_list) + AnonymousClass0213.ADAPTER.encodedSizeWithTag(7, c5186020i2.video) + protoAdapter.encodedSizeWithTag(8, c5186020i2.share_url);
            ProtoAdapter<Integer> protoAdapter5 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(9, c5186020i2.user_digged) + C029A.ADAPTER.encodedSizeWithTag(10, c5186020i2.statistics) + C024B.ADAPTER.encodedSizeWithTag(11, c5186020i2.status) + protoAdapter.encodedSizeWithTag(12, c5186020i2.extra) + protoAdapter5.encodedSizeWithTag(13, c5186020i2.rate);
            ProtoAdapter<C5312025e> protoAdapter6 = C5312025e.ADAPTER;
            int iEncodedSizeWithTag6 = iEncodedSizeWithTag5 + protoAdapter6.asRepeated().encodedSizeWithTag(14, c5186020i2.text_extra);
            ProtoAdapter<C673002jw> protoAdapter7 = C673002jw.ADAPTER;
            int iEncodedSizeWithTag7 = iEncodedSizeWithTag6 + protoAdapter7.encodedSizeWithTag(15, c5186020i2.label_large) + protoAdapter7.encodedSizeWithTag(16, c5186020i2.label_thumb) + protoAdapter5.encodedSizeWithTag(17, c5186020i2.is_top) + protoAdapter7.encodedSizeWithTag(18, c5186020i2.label_top) + C5271023p.ADAPTER.encodedSizeWithTag(19, c5186020i2.share_info) + protoAdapter7.encodedSizeWithTag(20, c5186020i2.label_origin_author) + protoAdapter.encodedSizeWithTag(21, c5186020i2.distance) + protoAdapter7.encodedSizeWithTag(22, c5186020i2.label_music_starter) + protoAdapter7.encodedSizeWithTag(23, c5186020i2.label_private) + C02FQ.ADAPTER.asRepeated().encodedSizeWithTag(24, c5186020i2.video_labels);
            ProtoAdapter<Boolean> protoAdapter8 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag8 = iEncodedSizeWithTag7 + protoAdapter8.encodedSizeWithTag(25, c5186020i2.is_vr) + protoAdapter.encodedSizeWithTag(26, c5186020i2.landing_page) + protoAdapter8.encodedSizeWithTag(27, c5186020i2.is_ads) + protoAdapter5.encodedSizeWithTag(29, c5186020i2.duration) + protoAdapter5.encodedSizeWithTag(30, c5186020i2.aweme_type) + protoAdapter8.encodedSizeWithTag(35, c5186020i2.cmt_swt) + C02E5.ADAPTER.asRepeated().encodedSizeWithTag(36, c5186020i2.image_infos) + C02CM.ADAPTER.encodedSizeWithTag(37, c5186020i2.risk_infos) + protoAdapter8.encodedSizeWithTag(38, c5186020i2.is_relieve) + protoAdapter7.encodedSizeWithTag(39, c5186020i2.label_friend) + protoAdapter.encodedSizeWithTag(40, c5186020i2.sort_label);
            ProtoAdapter<C559902Gf> protoAdapter9 = C559902Gf.ADAPTER;
            int iEncodedSizeWithTag9 = iEncodedSizeWithTag8 + protoAdapter9.asRepeated().encodedSizeWithTag(41, c5186020i2.position) + protoAdapter9.asRepeated().encodedSizeWithTag(42, c5186020i2.uniqid_position) + protoAdapter2.encodedSizeWithTag(44, c5186020i2.author_user_id) + protoAdapter5.encodedSizeWithTag(45, c5186020i2.bodydance_score) + protoAdapter.asRepeated().encodedSizeWithTag(46, c5186020i2.geofencing) + protoAdapter5.encodedSizeWithTag(47, c5186020i2.is_hash_tag) + protoAdapter8.encodedSizeWithTag(48, c5186020i2.is_pgcshow) + protoAdapter.encodedSizeWithTag(49, c5186020i2.region);
            ProtoAdapter<C556502Ex> protoAdapter10 = C556502Ex.ADAPTER;
            int iEncodedSizeWithTag10 = iEncodedSizeWithTag9 + protoAdapter10.asRepeated().encodedSizeWithTag(50, c5186020i2.video_text) + C550302Cn.ADAPTER.encodedSizeWithTag(52, c5186020i2.sp_sticker) + protoAdapter.encodedSizeWithTag(53, c5186020i2.ad_schedule) + protoAdapter5.encodedSizeWithTag(54, c5186020i2.collect_stat) + protoAdapter10.asRepeated().encodedSizeWithTag(55, c5186020i2.label_top_text) + protoAdapter.encodedSizeWithTag(57, c5186020i2.stickers);
            ProtoAdapter<C5186020i> protoAdapter11 = C5186020i.ADAPTER;
            int iEncodedSizeWithTag11 = iEncodedSizeWithTag10 + protoAdapter11.encodedSizeWithTag(58, c5186020i2.forward_item) + protoAdapter.encodedSizeWithTag(59, c5186020i2.forward_comment_id) + protoAdapter.encodedSizeWithTag(62, c5186020i2.forward_item_id) + protoAdapter.encodedSizeWithTag(63, c5186020i2.group_id) + protoAdapter.encodedSizeWithTag(64, c5186020i2.pre_forward_id) + protoAdapter8.encodedSizeWithTag(65, c5186020i2.prevent_download) + protoAdapter9.asRepeated().encodedSizeWithTag(66, c5186020i2.nickname_position) + protoAdapter9.asRepeated().encodedSizeWithTag(67, c5186020i2.challenge_position) + protoAdapter5.encodedSizeWithTag(68, c5186020i2.item_comment_settings) + C618902bD.ADAPTER.encodedSizeWithTag(69, c5186020i2.descendants) + protoAdapter.encodedSizeWithTag(70, c5186020i2.raw_ad_data) + C628102ch.ADAPTER.encodedSizeWithTag(71, c5186020i2.game_info) + AnonymousClass0299.ADAPTER.encodedSizeWithTag(72, c5186020i2.micro_app_info) + protoAdapter8.encodedSizeWithTag(73, c5186020i2.with_promotional_music) + protoAdapter.encodedSizeWithTag(74, c5186020i2.link_ad_data);
            ProtoAdapter<AnonymousClass0263> protoAdapter12 = AnonymousClass0263.ADAPTER;
            int iEncodedSizeWithTag12 = iEncodedSizeWithTag11 + protoAdapter12.encodedSizeWithTag(76, c5186020i2.gesture_red_packet) + protoAdapter12.encodedSizeWithTag(77, c5186020i2.activity_pendant) + C022S.ADAPTER.encodedSizeWithTag(78, c5186020i2.sticker_detail) + C02BX.ADAPTER.asRepeated().encodedSizeWithTag(79, c5186020i2.long_video) + protoAdapter5.encodedSizeWithTag(80, c5186020i2.item_duet) + protoAdapter5.encodedSizeWithTag(81, c5186020i2.item_react);
            ProtoAdapter<C544302Af> protoAdapter13 = C544302Af.ADAPTER;
            int iEncodedSizeWithTag13 = iEncodedSizeWithTag12 + protoAdapter13.encodedSizeWithTag(82, c5186020i2.hot_info) + protoAdapter2.encodedSizeWithTag(83, c5186020i2.star_atlas_order_id) + protoAdapter.encodedSizeWithTag(84, c5186020i2.label_music_starter_text) + protoAdapter8.encodedSizeWithTag(85, c5186020i2.without_watermark) + C544502Ah.ADAPTER.encodedSizeWithTag(86, c5186020i2.preload) + protoAdapter.encodedSizeWithTag(87, c5186020i2.star_recommend_tag) + protoAdapter.encodedSizeWithTag(88, c5186020i2.ad_order_id) + protoAdapter.encodedSizeWithTag(89, c5186020i2.open_platform_name) + C1CBX.ADAPTER.encodedSizeWithTag(90, c5186020i2.star_atlas_info) + protoAdapter.encodedSizeWithTag(91, c5186020i2.desc_language) + C5426029o.ADAPTER.encodedSizeWithTag(92, c5186020i2.floating_card_content) + AnonymousClass0216.ADAPTER.asRepeated().encodedSizeWithTag(93, c5186020i2.interaction_stickers) + protoAdapter5.encodedSizeWithTag(95, c5186020i2.ad_link_type) + protoAdapter5.encodedSizeWithTag(96, c5186020i2.take_down_reason) + protoAdapter.encodedSizeWithTag(97, c5186020i2.take_down_desc) + protoAdapter.encodedSizeWithTag(98, c5186020i2.simple_promotions) + protoAdapter.encodedSizeWithTag(99, c5186020i2.misc_info) + protoAdapter.asRepeated().encodedSizeWithTag(101, c5186020i2.origin_comment_ids) + C656202hE.ADAPTER.asRepeated().encodedSizeWithTag(102, c5186020i2.commerce_config_data) + C550702Cr.ADAPTER.encodedSizeWithTag(103, c5186020i2.commerce_sticker_info) + protoAdapter8.encodedSizeWithTag(104, c5186020i2.enable_top_view) + protoAdapter5.encodedSizeWithTag(105, c5186020i2.distribute_type) + C02A4.ADAPTER.encodedSizeWithTag(106, c5186020i2.video_control) + protoAdapter5.encodedSizeWithTag(107, c5186020i2.is_effect_designer) + protoAdapter5.encodedSizeWithTag(108, c5186020i2.ad_aweme_source) + C02F4.ADAPTER.encodedSizeWithTag(109, c5186020i2.aweme_control) + protoAdapter8.encodedSizeWithTag(110, c5186020i2.has_vs_entry) + C546902Bf.ADAPTER.encodedSizeWithTag(111, c5186020i2.anchor) + C02C2.ADAPTER.encodedSizeWithTag(112, c5186020i2.feed_relation_label) + AnonymousClass0285.ADAPTER.encodedSizeWithTag(113, c5186020i2.mix_info) + protoAdapter.encodedSizeWithTag(114, c5186020i2.simple_shop_seeding) + C02CT.ADAPTER.encodedSizeWithTag(115, c5186020i2.hot_list) + C5228021y.ADAPTER.encodedSizeWithTag(116, c5186020i2.commerce_info) + C2227811CHj.ADAPTER.encodedSizeWithTag(117, c5186020i2.national_task_info) + C02ER.ADAPTER.encodedSizeWithTag(118, c5186020i2.banner_tip);
            ProtoAdapter<C027T> protoAdapter14 = C027T.ADAPTER;
            int iEncodedSizeWithTag14 = iEncodedSizeWithTag13 + protoAdapter14.encodedSizeWithTag(119, c5186020i2.acl_info) + C544602Ai.ADAPTER.encodedSizeWithTag(121, c5186020i2.anchor_info) + C726102sV.ADAPTER.encodedSizeWithTag(122, c5186020i2.vpa_info) + C549102Cb.ADAPTER.encodedSizeWithTag(123, c5186020i2.cny_info) + protoAdapter8.encodedSizeWithTag(124, c5186020i2.is_familiar) + protoAdapter8.encodedSizeWithTag(125, c5186020i2.need_vs_entry) + AnonymousClass0287.ADAPTER.encodedSizeWithTag(126, c5186020i2.cell_room) + protoAdapter.encodedSizeWithTag(127, c5186020i2.live_reason) + protoAdapter.encodedSizeWithTag(128, c5186020i2.video_feed_tag);
            ProtoAdapter<C02AY> protoAdapter15 = C02AY.ADAPTER;
            int iEncodedSizeWithTag15 = iEncodedSizeWithTag14 + protoAdapter15.encodedSizeWithTag(129, c5186020i2.mask_info) + C02CB.ADAPTER.encodedSizeWithTag(130, c5186020i2.link_match) + C02B6.ADAPTER.encodedSizeWithTag(131, c5186020i2.video_reply_info) + C5227021x.ADAPTER.asRepeated().encodedSizeWithTag(132, c5186020i2.anchors) + C550402Co.ADAPTER.asRepeated().encodedSizeWithTag(133, c5186020i2.hybrid_label) + C556302Ev.ADAPTER.encodedSizeWithTag(134, c5186020i2.relation_recommend_info) + C665102if.ADAPTER.encodedSizeWithTag(135, c5186020i2.user_profile_init_info) + protoAdapter8.encodedSizeWithTag(136, c5186020i2.with_survey) + protoAdapter13.encodedSizeWithTag(137, c5186020i2.dou_discount_mix_info) + protoAdapter14.encodedSizeWithTag(138, c5186020i2.aweme_acl) + C02GB.ADAPTER.encodedSizeWithTag(139, c5186020i2.activity) + C2226971CEd.ADAPTER.encodedSizeWithTag(140, c5186020i2.story_group) + protoAdapter5.encodedSizeWithTag(141, c5186020i2.is_story) + C2251241D9m.ADAPTER.encodedSizeWithTag(142, c5186020i2.vs_entry) + protoAdapter5.encodedSizeWithTag(143, c5186020i2.item_stitch) + C2226281CBm.ADAPTER.encodedSizeWithTag(144, c5186020i2.cloud_game) + protoAdapter8.encodedSizeWithTag(147, c5186020i2.show_sticker_guide) + protoAdapter5.encodedSizeWithTag(148, c5186020i2.story_ttl) + protoAdapter8.encodedSizeWithTag(149, c5186020i2.is_horizontal) + protoAdapter.asRepeated().encodedSizeWithTag(150, c5186020i2.geofencing_regions) + protoAdapter.encodedSizeWithTag(151, c5186020i2.city);
            ProtoAdapter<C02C6> protoAdapter16 = C02C6.ADAPTER;
            int iEncodedSizeWithTag16 = iEncodedSizeWithTag15 + protoAdapter16.encodedSizeWithTag(154, c5186020i2.mutual_relation_tmp) + protoAdapter.encodedSizeWithTag(160, c5186020i2.anchors_extras) + protoAdapter8.encodedSizeWithTag(161, c5186020i2.allow_gift) + protoAdapter16.encodedSizeWithTag(162, c5186020i2.mutual_relation) + protoAdapter15.asRepeated().encodedSizeWithTag(163, c5186020i2.mask_infos) + C618002b4.ADAPTER.encodedSizeWithTag(164, c5186020i2.boost_tag_info) + C02UP.ADAPTER.encodedSizeWithTag(165, c5186020i2.bottom_bar) + C608702Yz.ADAPTER.encodedSizeWithTag(167, c5186020i2.playlist_info) + protoAdapter5.encodedSizeWithTag(168, c5186020i2.sound_exemption) + C1CAO.ADAPTER.encodedSizeWithTag(169, c5186020i2.stitch) + protoAdapter8.encodedSizeWithTag(170, c5186020i2.playlist_blocked) + protoAdapter.encodedSizeWithTag(171, c5186020i2.part_n) + C550902Ct.ADAPTER.asRepeated().encodedSizeWithTag(172, c5186020i2.green_screen_materials) + C732502tX.ADAPTER.encodedSizeWithTag(173, c5186020i2.stitch_permission) + C02CP.ADAPTER.encodedSizeWithTag(174, c5186020i2.trending_bar) + AnonymousClass0242.ADAPTER.encodedSizeWithTag(180, c5186020i2.user_story) + C595302Tv.ADAPTER.encodedSizeWithTag(181, c5186020i2.story_metadata) + C544402Ag.ADAPTER.encodedSizeWithTag(182, c5186020i2.interact_permission) + protoAdapter.encodedSizeWithTag(183, c5186020i2.item_distribute_source) + C550502Cp.ADAPTER.asRepeated().encodedSizeWithTag(185, c5186020i2.question_list) + C02BA.ADAPTER.encodedSizeWithTag(186, c5186020i2.audio) + C5411028z.ADAPTER.encodedSizeWithTag(187, c5186020i2.upvote_reason) + protoAdapter5.encodedSizeWithTag(188, c5186020i2.deduplication_type) + C02C3.ADAPTER.encodedSizeWithTag(189, c5186020i2.interaction_tag_info) + protoAdapter.encodedSizeWithTag(190, c5186020i2.content_desc) + protoAdapter6.asRepeated().encodedSizeWithTag(191, c5186020i2.content_desc_extra) + C621102bZ.ADAPTER.encodedSizeWithTag(193, c5186020i2.duet_info) + protoAdapter.encodedSizeWithTag(194, c5186020i2.extra_info) + protoAdapter5.encodedSizeWithTag(195, c5186020i2.item_source_category) + protoAdapter8.encodedSizeWithTag(196, c5186020i2.enable_pos_adjust) + protoAdapter8.encodedSizeWithTag(197, c5186020i2.enable_ad_drop) + protoAdapter5.encodedSizeWithTag(198, c5186020i2.pred_playtime) + protoAdapter5.asRepeated().encodedSizeWithTag(199, c5186020i2.gap_list) + protoAdapter8.encodedSizeWithTag(200, c5186020i2.is_client_cache) + protoAdapter2.encodedSizeWithTag(201, c5186020i2.follow_up_publish_from_id) + C02CO.ADAPTER.encodedSizeWithTag(202, c5186020i2.trending_bar_fyp) + C546302Az.ADAPTER.encodedSizeWithTag(203, c5186020i2.music_dsp_info) + protoAdapter8.encodedSizeWithTag(204, c5186020i2.disable_search_trending_bar) + C026X.ADAPTER.encodedSizeWithTag(205, c5186020i2.image_post_info) + C552202Dg.ADAPTER.encodedSizeWithTag(206, c5186020i2.suggest_words) + C619202bG.ADAPTER.encodedSizeWithTag(207, c5186020i2.GroupIdList) + protoAdapter.encodedSizeWithTag(208, c5186020i2.commercial_video_info) + protoAdapter8.encodedSizeWithTag(209, c5186020i2.allow_reuse_original_sound) + protoAdapter5.encodedSizeWithTag(210, c5186020i2.music_begin_time_in_ms) + protoAdapter5.encodedSizeWithTag(211, c5186020i2.music_end_time_in_ms) + protoAdapter5.encodedSizeWithTag(212, c5186020i2.retry_type) + C668402jC.ADAPTER.encodedSizeWithTag(213, c5186020i2.upvote_preload) + C620502bT.ADAPTER.encodedSizeWithTag(214, c5186020i2.commerce_rerank_info) + C627802ce.ADAPTER.encodedSizeWithTag(215, c5186020i2.share_to_story_info) + C02CW.ADAPTER.encodedSizeWithTag(216, c5186020i2.ad_story_video) + C620202bQ.ADAPTER.encodedSizeWithTag(217, c5186020i2.nearby_info) + protoAdapter3.asRepeated().encodedSizeWithTag(218, c5186020i2.branded_content_accounts) + C5436029y.ADAPTER.encodedSizeWithTag(219, c5186020i2.rec_reason) + protoAdapter8.encodedSizeWithTag(220, c5186020i2.should_add_creator_tts_watermark_when_downloading);
            ProtoAdapter<C5225021v> protoAdapter17 = C5225021v.ADAPTER;
            int iEncodedSizeWithTag17 = iEncodedSizeWithTag16 + protoAdapter17.encodedSizeWithTag(221, c5186020i2.poi_data) + protoAdapter8.encodedSizeWithTag(222, c5186020i2.is_description_translatable) + C5215021l.ADAPTER.encodedSizeWithTag(223, c5186020i2.now_posts) + C5281023z.ADAPTER.encodedSizeWithTag(224, c5186020i2.podcast_info) + protoAdapter.encodedSizeWithTag(225, c5186020i2.follow_up_first_item_id) + protoAdapter.encodedSizeWithTag(226, c5186020i2.follow_up_item_id_groups) + protoAdapter5.encodedSizeWithTag(227, c5186020i2.story_type) + protoAdapter8.encodedSizeWithTag(228, c5186020i2.is_text_sticker_translatable) + protoAdapter.encodedSizeWithTag(229, c5186020i2.text_sticker_major_lang) + C02E6.ADAPTER.encodedSizeWithTag(230, c5186020i2.ttm_info) + C02S8.ADAPTER.encodedSizeWithTag(231, c5186020i2.edit_post_permission) + C02D8.ADAPTER.encodedSizeWithTag(232, c5186020i2.original_client_text) + protoAdapter.encodedSizeWithTag(233, c5186020i2.music_selected_from) + protoAdapter.asRepeated().encodedSizeWithTag(234, c5186020i2.tts_voice_ids) + protoAdapter.asRepeated().encodedSizeWithTag(235, c5186020i2.reference_tts_voice_ids) + protoAdapter.asRepeated().encodedSizeWithTag(236, c5186020i2.voice_filter_ids) + protoAdapter.asRepeated().encodedSizeWithTag(237, c5186020i2.reference_voice_filter_ids) + protoAdapter5.encodedSizeWithTag(238, c5186020i2.music_title_style) + C550802Cs.ADAPTER.encodedSizeWithTag(239, c5186020i2.promote) + C626302cP.ADAPTER.encodedSizeWithTag(240, c5186020i2.animated_image_info) + C5214021k.ADAPTER.encodedSizeWithTag(241, c5186020i2.comment_config) + protoAdapter.encodedSizeWithTag(242, c5186020i2.survey_key) + protoAdapter.encodedSizeWithTag(243, c5186020i2.trans_params) + C551602Da.ADAPTER.encodedSizeWithTag(244, c5186020i2.animated_btn);
            ProtoAdapter<C5425029n> protoAdapter18 = C5425029n.ADAPTER;
            return iEncodedSizeWithTag17 + protoAdapter18.asRepeated().encodedSizeWithTag(245, c5186020i2.survey_info) + protoAdapter4.encodedSizeWithTag(246, c5186020i2.added_sound_music_info) + protoAdapter.encodedSizeWithTag(247, c5186020i2.origin_volume) + protoAdapter.encodedSizeWithTag(248, c5186020i2.music_volume) + protoAdapter8.encodedSizeWithTag(249, c5186020i2.support_danmaku) + protoAdapter8.encodedSizeWithTag(250, c5186020i2.has_danmaku) + protoAdapter18.encodedSizeWithTag(251, c5186020i2.real_survey_info) + C02CI.ADAPTER.encodedSizeWithTag(252, c5186020i2.card) + C552402Di.ADAPTER.encodedSizeWithTag(253, c5186020i2.ttec_suggest_words) + protoAdapter5.encodedSizeWithTag(255, c5186020i2.content_original_type) + protoAdapter.encodedSizeWithTag(256, c5186020i2.shoot_tab_name) + protoAdapter.encodedSizeWithTag(257, c5186020i2.content_type) + protoAdapter5.encodedSizeWithTag(258, c5186020i2.content_size_type) + protoAdapter8.encodedSizeWithTag(259, c5186020i2.is_tiktok_story) + protoAdapter8.encodedSizeWithTag(260, c5186020i2.is_sub_only_video) + protoAdapter8.encodedSizeWithTag(261, c5186020i2.is_nff_or_nr) + protoAdapter11.encodedSizeWithTag(262, c5186020i2.podcast_full_episode_item) + ProtoAdapter.FLOAT.encodedSizeWithTag(263, c5186020i2.parameterized_speed) + C557502Fh.ADAPTER.asRepeated().encodedSizeWithTag(264, c5186020i2.operator_boost_info) + protoAdapter8.encodedSizeWithTag(265, c5186020i2.filter_unfriendly_user_comments) + protoAdapter8.encodedSizeWithTag(266, c5186020i2.filter_stranger_comments) + protoAdapter8.encodedSizeWithTag(267, c5186020i2.is_story_to_normal) + C02DQ.ADAPTER.encodedSizeWithTag(268, c5186020i2.fake_landscape_video_info) + protoAdapter.encodedSizeWithTag(269, c5186020i2.main_arch_common) + protoAdapter.encodedSizeWithTag(270, c5186020i2.batch_id) + protoAdapter5.encodedSizeWithTag(271, c5186020i2.batch_index) + C687002mC.ADAPTER.encodedSizeWithTag(272, c5186020i2.aigc_info) + protoAdapter5.encodedSizeWithTag(273, c5186020i2.ttt_product_recall_type) + C02W5.ADAPTER.encodedSizeWithTag(274, c5186020i2.related_live) + protoAdapter5.encodedSizeWithTag(275, c5186020i2.share_story_status) + C02US.ADAPTER.encodedSizeWithTag(276, c5186020i2.add_yours_recommendation) + C02D9.ADAPTER.asRepeated().encodedSizeWithTag(277, c5186020i2.banners) + protoAdapter3.asRepeated().encodedSizeWithTag(278, c5186020i2.picked_users) + C02AT.ADAPTER.encodedSizeWithTag(279, c5186020i2.standard_component_info) + protoAdapter8.encodedSizeWithTag(280, c5186020i2.is_comment_post_video) + C667502j3.ADAPTER.encodedSizeWithTag(281, c5186020i2.comment_post_video) + protoAdapter5.encodedSizeWithTag(282, c5186020i2.has_promote_entry) + protoAdapter.encodedSizeWithTag(283, c5186020i2.promote_toast) + protoAdapter.encodedSizeWithTag(284, c5186020i2.promote_toast_key) + C600902Vz.ADAPTER.encodedSizeWithTag(285, c5186020i2.share_operation_info) + protoAdapter8.encodedSizeWithTag(286, c5186020i2.show_quick_dm_box) + protoAdapter8.encodedSizeWithTag(387, c5186020i2.is_title_translatable) + protoAdapter.encodedSizeWithTag(288, c5186020i2.title_language) + C02C4.ADAPTER.encodedSizeWithTag(289, c5186020i2.upvote_info) + C667802j6.ADAPTER.encodedSizeWithTag(290, c5186020i2.share_to_video_info) + C025O.ADAPTER.asRepeated().encodedSizeWithTag(291, c5186020i2.comment_topbar_info) + ProtoAdapter.DOUBLE.encodedSizeWithTag(292, c5186020i2.user_affinity_score) + protoAdapter.encodedSizeWithTag(293, c5186020i2.music_promo_id) + protoAdapter5.encodedSizeWithTag(294, c5186020i2.music_retriever_flag) + C610002Zm.ADAPTER.encodedSizeWithTag(295, c5186020i2.content_model) + C663702iR.ADAPTER.encodedSizeWithTag(296, c5186020i2.creation_info) + protoAdapter2.asRepeated().encodedSizeWithTag(297, c5186020i2.interactive_rec_hit_instructions) + protoAdapter5.encodedSizeWithTag(298, c5186020i2.market_sub_type) + protoAdapter5.encodedSizeWithTag(299, c5186020i2.market_drop_strategy) + C02GU.ADAPTER.encodedSizeWithTag(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, c5186020i2.collab_info) + protoAdapter5.encodedSizeWithTag(301, c5186020i2.title_limited_rows) + C028C.ADAPTER.encodedSizeWithTag(302, c5186020i2.text_consumption_info) + C02E9.ADAPTER.encodedSizeWithTag(303, c5186020i2.music_promo_tag_info) + C557702Fj.ADAPTER.encodedSizeWithTag(304, c5186020i2.rec_reason_tag) + C02SK.ADAPTER.asRepeated().encodedSizeWithTag(305, c5186020i2.live_room_stats_tag) + C713502qT.ADAPTER.encodedSizeWithTag(306, c5186020i2.moments_mode_info) + C02C5.ADAPTER.encodedSizeWithTag(307, c5186020i2.music_fusion_info) + C027M.ADAPTER.encodedSizeWithTag(308, c5186020i2.story_note_info) + protoAdapter.encodedSizeWithTag(309, c5186020i2.promote_icon_text) + protoAdapter8.encodedSizeWithTag(310, c5186020i2.used_full_song) + protoAdapter.encodedSizeWithTag(311, c5186020i2.on_device_ml_features) + C02UD.ADAPTER.encodedSizeWithTag(312, c5186020i2.realtime_fcp_config) + C02DH.ADAPTER.encodedSizeWithTag(313, c5186020i2.interactive_rec_match_info) + C666302ir.ADAPTER.encodedSizeWithTag(314, c5186020i2.add_yours_info) + C5410028y.ADAPTER.encodedSizeWithTag(315, c5186020i2.internal_share) + protoAdapter8.encodedSizeWithTag(316, c5186020i2.is_paid_content) + C021E.ADAPTER.encodedSizeWithTag(317, c5186020i2.paid_content_info) + C559202Fy.ADAPTER.encodedSizeWithTag(318, c5186020i2.music_discovery_info) + protoAdapter.encodedSizeWithTag(319, c5186020i2.ocean_group_info) + C669002jI.ADAPTER.encodedSizeWithTag(320, c5186020i2.similar_video_info) + C5313025f.ADAPTER.encodedSizeWithTag(321, c5186020i2.c2pa_info) + C666602iu.ADAPTER.encodedSizeWithTag(322, c5186020i2.video_mention_info) + protoAdapter8.encodedSizeWithTag(323, c5186020i2.use_aweme_cache) + C2223211Bzr.ADAPTER.encodedSizeWithTag(324, c5186020i2.abroll) + protoAdapter8.encodedSizeWithTag(325, c5186020i2.has_ever_advertised) + C02SM.ADAPTER.encodedSizeWithTag(326, c5186020i2.live_extra_info_struct) + C559402Ga.ADAPTER.encodedSizeWithTag(327, c5186020i2.prompt_result) + protoAdapter2.encodedSizeWithTag(328, c5186020i2.time_portal) + protoAdapter8.encodedSizeWithTag(329, c5186020i2.is_streaks_post) + C667202j0.ADAPTER.encodedSizeWithTag(330, c5186020i2.streaks_meta) + C670502jX.ADAPTER.encodedSizeWithTag(331, c5186020i2.celebration_metadata) + protoAdapter5.encodedSizeWithTag(332, c5186020i2.consumption_recall) + protoAdapter5.encodedSizeWithTag(333, c5186020i2.is_high_consumption_val) + protoAdapter.asRepeated().encodedSizeWithTag(334, c5186020i2.quick_reply_emojis) + C02H7.ADAPTER.encodedSizeWithTag(335, c5186020i2.new_user_recommended_reason) + AnonymousClass0243.ADAPTER.encodedSizeWithTag(336, c5186020i2.visual_search_info) + C550202Cm.ADAPTER.encodedSizeWithTag(337, c5186020i2.template_config) + C558502Fr.ADAPTER.asRepeated().encodedSizeWithTag(338, c5186020i2.search_info_struct) + C673702k3.ADAPTER.encodedSizeWithTag(400, c5186020i2.social_interaction_blob) + C674002k6.ADAPTER.encodedSizeWithTag(401, c5186020i2.solaria_profile) + protoAdapter8.encodedSizeWithTag(402, c5186020i2.is_social_fresh_content) + protoAdapter8.encodedSizeWithTag(403, c5186020i2.convert_to_fyp_card) + protoAdapter2.encodedSizeWithTag(404, c5186020i2.convert_to_fyp_card_expire_time) + protoAdapter8.encodedSizeWithTag(405, c5186020i2.is_unconsumed_resuse) + C653802gq.ADAPTER.encodedSizeWithTag(406, c5186020i2.meme_reg_info) + C626002cM.ADAPTER.encodedSizeWithTag(407, c5186020i2.onboarding_survey) + C02D4.ADAPTER.encodedSizeWithTag(408, c5186020i2.desc_title_translated_text) + protoAdapter17.encodedSizeWithTag(409, c5186020i2.outflow_poi_data) + C632402dO.ADAPTER.encodedSizeWithTag(410, c5186020i2.layout_info) + C669302jL.ADAPTER.encodedSizeWithTag(411, c5186020i2.golden_cache_config) + C596802Uk.ADAPTER.encodedSizeWithTag(412, c5186020i2.moderation_aigc_info) + C700102oJ.ADAPTER.encodedSizeWithTag(413, c5186020i2.landscape_video) + C02UA.ADAPTER.encodedSizeWithTag(414, c5186020i2.smart_search_info) + protoAdapter.encodedSizeWithTag(415, c5186020i2.survey_tags) + C556202Eu.ADAPTER.encodedSizeWithTag(416, c5186020i2.ttec_search_growth_info) + C02LL.ADAPTER.encodedSizeWithTag(417, c5186020i2.tns_ue_feed_info) + C02SS.ADAPTER.encodedSizeWithTag(418, c5186020i2.local_service_info) + C1CCK.ADAPTER.encodedSizeWithTag(419, c5186020i2.ai_info) + C02HS.ADAPTER.asRepeated().encodedSizeWithTag(420, c5186020i2.declaration_info) + C02FN.ADAPTER.encodedSizeWithTag(421, c5186020i2.ai_alive_info) + C027K.ADAPTER.encodedSizeWithTag(422, c5186020i2.imagine_sticker_info) + C664802ic.ADAPTER.encodedSizeWithTag(423, c5186020i2.tako_bubble_info) + C1CCQ.ADAPTER.encodedSizeWithTag(424, c5186020i2.creator_ai_comment) + protoAdapter8.encodedSizeWithTag(425, c5186020i2.is_spark_plus) + C668102j9.ADAPTER.encodedSizeWithTag(426, c5186020i2.personalized_survey_ui) + C687402mG.ADAPTER.encodedSizeWithTag(427, c5186020i2.brand_safety_info) + C02E1.ADAPTER.encodedSizeWithTag(428, c5186020i2.translated_video) + C674902kF.ADAPTER.encodedSizeWithTag(429, c5186020i2.psp_info) + C02DS.ADAPTER.asRepeated().encodedSizeWithTag(430, c5186020i2.ic_asset_info) + C5296024o.ADAPTER.encodedSizeWithTag(431, c5186020i2.ai_theater_info) + C666902ix.ADAPTER.encodedSizeWithTag(432, c5186020i2.comment_at_tako_info) + C027Z.ADAPTER.encodedSizeWithTag(433, c5186020i2.ai_remix_info) + protoAdapter5.encodedSizeWithTag(434, c5186020i2.item_allow_ai_remix) + C02VC.ADAPTER.encodedSizeWithTag(435, c5186020i2.poi_trace) + C655602h8.ADAPTER.encodedSizeWithTag(436, c5186020i2.detail_lynx_card_info) + C622602bo.ADAPTER.encodedSizeWithTag(437, c5186020i2.personalized_onboarding_survey) + C661502i5.ADAPTER.encodedSizeWithTag(438, c5186020i2.offline_video_info) + AnonymousClass0267.ADAPTER.encodedSizeWithTag(439, c5186020i2.ai_portrait_info) + C739002ua.ADAPTER.encodedSizeWithTag(440, c5186020i2.ai_chat_meta) + c5186020i2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5186020i c5186020i) {
            C5186020i c5186020i2 = c5186020i;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5186020i2.aweme_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c5186020i2.desc);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 3, c5186020i2.create_time);
            ProtoAdapter<C5189020l> protoAdapter3 = C5189020l.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 4, c5186020i2.author);
            ProtoAdapter<C5199020v> protoAdapter4 = C5199020v.ADAPTER;
            protoAdapter4.encodeWithTag(protoWriter, 5, c5186020i2.music);
            C021F.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, c5186020i2.cha_list);
            AnonymousClass0213.ADAPTER.encodeWithTag(protoWriter, 7, c5186020i2.video);
            protoAdapter.encodeWithTag(protoWriter, 8, c5186020i2.share_url);
            ProtoAdapter<Integer> protoAdapter5 = ProtoAdapter.INT32;
            protoAdapter5.encodeWithTag(protoWriter, 9, c5186020i2.user_digged);
            C029A.ADAPTER.encodeWithTag(protoWriter, 10, c5186020i2.statistics);
            C024B.ADAPTER.encodeWithTag(protoWriter, 11, c5186020i2.status);
            protoAdapter.encodeWithTag(protoWriter, 12, c5186020i2.extra);
            protoAdapter5.encodeWithTag(protoWriter, 13, c5186020i2.rate);
            ProtoAdapter<C5312025e> protoAdapter6 = C5312025e.ADAPTER;
            protoAdapter6.asRepeated().encodeWithTag(protoWriter, 14, c5186020i2.text_extra);
            ProtoAdapter<C673002jw> protoAdapter7 = C673002jw.ADAPTER;
            protoAdapter7.encodeWithTag(protoWriter, 15, c5186020i2.label_large);
            protoAdapter7.encodeWithTag(protoWriter, 16, c5186020i2.label_thumb);
            protoAdapter5.encodeWithTag(protoWriter, 17, c5186020i2.is_top);
            protoAdapter7.encodeWithTag(protoWriter, 18, c5186020i2.label_top);
            C5271023p.ADAPTER.encodeWithTag(protoWriter, 19, c5186020i2.share_info);
            protoAdapter7.encodeWithTag(protoWriter, 20, c5186020i2.label_origin_author);
            protoAdapter.encodeWithTag(protoWriter, 21, c5186020i2.distance);
            protoAdapter7.encodeWithTag(protoWriter, 22, c5186020i2.label_music_starter);
            protoAdapter7.encodeWithTag(protoWriter, 23, c5186020i2.label_private);
            C02FQ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 24, c5186020i2.video_labels);
            ProtoAdapter<Boolean> protoAdapter8 = ProtoAdapter.BOOL;
            protoAdapter8.encodeWithTag(protoWriter, 25, c5186020i2.is_vr);
            protoAdapter.encodeWithTag(protoWriter, 26, c5186020i2.landing_page);
            protoAdapter8.encodeWithTag(protoWriter, 27, c5186020i2.is_ads);
            protoAdapter5.encodeWithTag(protoWriter, 29, c5186020i2.duration);
            protoAdapter5.encodeWithTag(protoWriter, 30, c5186020i2.aweme_type);
            protoAdapter8.encodeWithTag(protoWriter, 35, c5186020i2.cmt_swt);
            C02E5.ADAPTER.asRepeated().encodeWithTag(protoWriter, 36, c5186020i2.image_infos);
            C02CM.ADAPTER.encodeWithTag(protoWriter, 37, c5186020i2.risk_infos);
            protoAdapter8.encodeWithTag(protoWriter, 38, c5186020i2.is_relieve);
            protoAdapter7.encodeWithTag(protoWriter, 39, c5186020i2.label_friend);
            protoAdapter.encodeWithTag(protoWriter, 40, c5186020i2.sort_label);
            ProtoAdapter<C559902Gf> protoAdapter9 = C559902Gf.ADAPTER;
            protoAdapter9.asRepeated().encodeWithTag(protoWriter, 41, c5186020i2.position);
            protoAdapter9.asRepeated().encodeWithTag(protoWriter, 42, c5186020i2.uniqid_position);
            protoAdapter2.encodeWithTag(protoWriter, 44, c5186020i2.author_user_id);
            protoAdapter5.encodeWithTag(protoWriter, 45, c5186020i2.bodydance_score);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 46, c5186020i2.geofencing);
            protoAdapter5.encodeWithTag(protoWriter, 47, c5186020i2.is_hash_tag);
            protoAdapter8.encodeWithTag(protoWriter, 48, c5186020i2.is_pgcshow);
            protoAdapter.encodeWithTag(protoWriter, 49, c5186020i2.region);
            ProtoAdapter<C556502Ex> protoAdapter10 = C556502Ex.ADAPTER;
            protoAdapter10.asRepeated().encodeWithTag(protoWriter, 50, c5186020i2.video_text);
            C550302Cn.ADAPTER.encodeWithTag(protoWriter, 52, c5186020i2.sp_sticker);
            protoAdapter.encodeWithTag(protoWriter, 53, c5186020i2.ad_schedule);
            protoAdapter5.encodeWithTag(protoWriter, 54, c5186020i2.collect_stat);
            protoAdapter10.asRepeated().encodeWithTag(protoWriter, 55, c5186020i2.label_top_text);
            protoAdapter.encodeWithTag(protoWriter, 57, c5186020i2.stickers);
            ProtoAdapter<C5186020i> protoAdapter11 = C5186020i.ADAPTER;
            protoAdapter11.encodeWithTag(protoWriter, 58, c5186020i2.forward_item);
            protoAdapter.encodeWithTag(protoWriter, 59, c5186020i2.forward_comment_id);
            protoAdapter.encodeWithTag(protoWriter, 62, c5186020i2.forward_item_id);
            protoAdapter.encodeWithTag(protoWriter, 63, c5186020i2.group_id);
            protoAdapter.encodeWithTag(protoWriter, 64, c5186020i2.pre_forward_id);
            protoAdapter8.encodeWithTag(protoWriter, 65, c5186020i2.prevent_download);
            protoAdapter9.asRepeated().encodeWithTag(protoWriter, 66, c5186020i2.nickname_position);
            protoAdapter9.asRepeated().encodeWithTag(protoWriter, 67, c5186020i2.challenge_position);
            protoAdapter5.encodeWithTag(protoWriter, 68, c5186020i2.item_comment_settings);
            C618902bD.ADAPTER.encodeWithTag(protoWriter, 69, c5186020i2.descendants);
            protoAdapter.encodeWithTag(protoWriter, 70, c5186020i2.raw_ad_data);
            C628102ch.ADAPTER.encodeWithTag(protoWriter, 71, c5186020i2.game_info);
            AnonymousClass0299.ADAPTER.encodeWithTag(protoWriter, 72, c5186020i2.micro_app_info);
            protoAdapter8.encodeWithTag(protoWriter, 73, c5186020i2.with_promotional_music);
            protoAdapter.encodeWithTag(protoWriter, 74, c5186020i2.link_ad_data);
            ProtoAdapter<AnonymousClass0263> protoAdapter12 = AnonymousClass0263.ADAPTER;
            protoAdapter12.encodeWithTag(protoWriter, 76, c5186020i2.gesture_red_packet);
            protoAdapter12.encodeWithTag(protoWriter, 77, c5186020i2.activity_pendant);
            C022S.ADAPTER.encodeWithTag(protoWriter, 78, c5186020i2.sticker_detail);
            C02BX.ADAPTER.asRepeated().encodeWithTag(protoWriter, 79, c5186020i2.long_video);
            protoAdapter5.encodeWithTag(protoWriter, 80, c5186020i2.item_duet);
            protoAdapter5.encodeWithTag(protoWriter, 81, c5186020i2.item_react);
            ProtoAdapter<C544302Af> protoAdapter13 = C544302Af.ADAPTER;
            protoAdapter13.encodeWithTag(protoWriter, 82, c5186020i2.hot_info);
            protoAdapter2.encodeWithTag(protoWriter, 83, c5186020i2.star_atlas_order_id);
            protoAdapter.encodeWithTag(protoWriter, 84, c5186020i2.label_music_starter_text);
            protoAdapter8.encodeWithTag(protoWriter, 85, c5186020i2.without_watermark);
            C544502Ah.ADAPTER.encodeWithTag(protoWriter, 86, c5186020i2.preload);
            protoAdapter.encodeWithTag(protoWriter, 87, c5186020i2.star_recommend_tag);
            protoAdapter.encodeWithTag(protoWriter, 88, c5186020i2.ad_order_id);
            protoAdapter.encodeWithTag(protoWriter, 89, c5186020i2.open_platform_name);
            C1CBX.ADAPTER.encodeWithTag(protoWriter, 90, c5186020i2.star_atlas_info);
            protoAdapter.encodeWithTag(protoWriter, 91, c5186020i2.desc_language);
            C5426029o.ADAPTER.encodeWithTag(protoWriter, 92, c5186020i2.floating_card_content);
            AnonymousClass0216.ADAPTER.asRepeated().encodeWithTag(protoWriter, 93, c5186020i2.interaction_stickers);
            protoAdapter5.encodeWithTag(protoWriter, 95, c5186020i2.ad_link_type);
            protoAdapter5.encodeWithTag(protoWriter, 96, c5186020i2.take_down_reason);
            protoAdapter.encodeWithTag(protoWriter, 97, c5186020i2.take_down_desc);
            protoAdapter.encodeWithTag(protoWriter, 98, c5186020i2.simple_promotions);
            protoAdapter.encodeWithTag(protoWriter, 99, c5186020i2.misc_info);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 101, c5186020i2.origin_comment_ids);
            C656202hE.ADAPTER.asRepeated().encodeWithTag(protoWriter, 102, c5186020i2.commerce_config_data);
            C550702Cr.ADAPTER.encodeWithTag(protoWriter, 103, c5186020i2.commerce_sticker_info);
            protoAdapter8.encodeWithTag(protoWriter, 104, c5186020i2.enable_top_view);
            protoAdapter5.encodeWithTag(protoWriter, 105, c5186020i2.distribute_type);
            C02A4.ADAPTER.encodeWithTag(protoWriter, 106, c5186020i2.video_control);
            protoAdapter5.encodeWithTag(protoWriter, 107, c5186020i2.is_effect_designer);
            protoAdapter5.encodeWithTag(protoWriter, 108, c5186020i2.ad_aweme_source);
            C02F4.ADAPTER.encodeWithTag(protoWriter, 109, c5186020i2.aweme_control);
            protoAdapter8.encodeWithTag(protoWriter, 110, c5186020i2.has_vs_entry);
            C546902Bf.ADAPTER.encodeWithTag(protoWriter, 111, c5186020i2.anchor);
            C02C2.ADAPTER.encodeWithTag(protoWriter, 112, c5186020i2.feed_relation_label);
            AnonymousClass0285.ADAPTER.encodeWithTag(protoWriter, 113, c5186020i2.mix_info);
            protoAdapter.encodeWithTag(protoWriter, 114, c5186020i2.simple_shop_seeding);
            C02CT.ADAPTER.encodeWithTag(protoWriter, 115, c5186020i2.hot_list);
            C5228021y.ADAPTER.encodeWithTag(protoWriter, 116, c5186020i2.commerce_info);
            C2227811CHj.ADAPTER.encodeWithTag(protoWriter, 117, c5186020i2.national_task_info);
            C02ER.ADAPTER.encodeWithTag(protoWriter, 118, c5186020i2.banner_tip);
            ProtoAdapter<C027T> protoAdapter14 = C027T.ADAPTER;
            protoAdapter14.encodeWithTag(protoWriter, 119, c5186020i2.acl_info);
            C544602Ai.ADAPTER.encodeWithTag(protoWriter, 121, c5186020i2.anchor_info);
            C726102sV.ADAPTER.encodeWithTag(protoWriter, 122, c5186020i2.vpa_info);
            C549102Cb.ADAPTER.encodeWithTag(protoWriter, 123, c5186020i2.cny_info);
            protoAdapter8.encodeWithTag(protoWriter, 124, c5186020i2.is_familiar);
            protoAdapter8.encodeWithTag(protoWriter, 125, c5186020i2.need_vs_entry);
            AnonymousClass0287.ADAPTER.encodeWithTag(protoWriter, 126, c5186020i2.cell_room);
            protoAdapter.encodeWithTag(protoWriter, 127, c5186020i2.live_reason);
            protoAdapter.encodeWithTag(protoWriter, 128, c5186020i2.video_feed_tag);
            ProtoAdapter<C02AY> protoAdapter15 = C02AY.ADAPTER;
            protoAdapter15.encodeWithTag(protoWriter, 129, c5186020i2.mask_info);
            C02CB.ADAPTER.encodeWithTag(protoWriter, 130, c5186020i2.link_match);
            C02B6.ADAPTER.encodeWithTag(protoWriter, 131, c5186020i2.video_reply_info);
            C5227021x.ADAPTER.asRepeated().encodeWithTag(protoWriter, 132, c5186020i2.anchors);
            C550402Co.ADAPTER.asRepeated().encodeWithTag(protoWriter, 133, c5186020i2.hybrid_label);
            C556302Ev.ADAPTER.encodeWithTag(protoWriter, 134, c5186020i2.relation_recommend_info);
            C665102if.ADAPTER.encodeWithTag(protoWriter, 135, c5186020i2.user_profile_init_info);
            protoAdapter8.encodeWithTag(protoWriter, 136, c5186020i2.with_survey);
            protoAdapter13.encodeWithTag(protoWriter, 137, c5186020i2.dou_discount_mix_info);
            protoAdapter14.encodeWithTag(protoWriter, 138, c5186020i2.aweme_acl);
            C02GB.ADAPTER.encodeWithTag(protoWriter, 139, c5186020i2.activity);
            C2226971CEd.ADAPTER.encodeWithTag(protoWriter, 140, c5186020i2.story_group);
            protoAdapter5.encodeWithTag(protoWriter, 141, c5186020i2.is_story);
            C2251241D9m.ADAPTER.encodeWithTag(protoWriter, 142, c5186020i2.vs_entry);
            protoAdapter5.encodeWithTag(protoWriter, 143, c5186020i2.item_stitch);
            C2226281CBm.ADAPTER.encodeWithTag(protoWriter, 144, c5186020i2.cloud_game);
            protoAdapter8.encodeWithTag(protoWriter, 147, c5186020i2.show_sticker_guide);
            protoAdapter5.encodeWithTag(protoWriter, 148, c5186020i2.story_ttl);
            protoAdapter8.encodeWithTag(protoWriter, 149, c5186020i2.is_horizontal);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 150, c5186020i2.geofencing_regions);
            protoAdapter.encodeWithTag(protoWriter, 151, c5186020i2.city);
            ProtoAdapter<C02C6> protoAdapter16 = C02C6.ADAPTER;
            protoAdapter16.encodeWithTag(protoWriter, 154, c5186020i2.mutual_relation_tmp);
            protoAdapter.encodeWithTag(protoWriter, 160, c5186020i2.anchors_extras);
            protoAdapter8.encodeWithTag(protoWriter, 161, c5186020i2.allow_gift);
            protoAdapter16.encodeWithTag(protoWriter, 162, c5186020i2.mutual_relation);
            protoAdapter15.asRepeated().encodeWithTag(protoWriter, 163, c5186020i2.mask_infos);
            C618002b4.ADAPTER.encodeWithTag(protoWriter, 164, c5186020i2.boost_tag_info);
            C02UP.ADAPTER.encodeWithTag(protoWriter, 165, c5186020i2.bottom_bar);
            C608702Yz.ADAPTER.encodeWithTag(protoWriter, 167, c5186020i2.playlist_info);
            protoAdapter5.encodeWithTag(protoWriter, 168, c5186020i2.sound_exemption);
            C1CAO.ADAPTER.encodeWithTag(protoWriter, 169, c5186020i2.stitch);
            protoAdapter8.encodeWithTag(protoWriter, 170, c5186020i2.playlist_blocked);
            protoAdapter.encodeWithTag(protoWriter, 171, c5186020i2.part_n);
            C550902Ct.ADAPTER.asRepeated().encodeWithTag(protoWriter, 172, c5186020i2.green_screen_materials);
            C732502tX.ADAPTER.encodeWithTag(protoWriter, 173, c5186020i2.stitch_permission);
            C02CP.ADAPTER.encodeWithTag(protoWriter, 174, c5186020i2.trending_bar);
            AnonymousClass0242.ADAPTER.encodeWithTag(protoWriter, 180, c5186020i2.user_story);
            C595302Tv.ADAPTER.encodeWithTag(protoWriter, 181, c5186020i2.story_metadata);
            C544402Ag.ADAPTER.encodeWithTag(protoWriter, 182, c5186020i2.interact_permission);
            protoAdapter.encodeWithTag(protoWriter, 183, c5186020i2.item_distribute_source);
            C550502Cp.ADAPTER.asRepeated().encodeWithTag(protoWriter, 185, c5186020i2.question_list);
            C02BA.ADAPTER.encodeWithTag(protoWriter, 186, c5186020i2.audio);
            C5411028z.ADAPTER.encodeWithTag(protoWriter, 187, c5186020i2.upvote_reason);
            protoAdapter5.encodeWithTag(protoWriter, 188, c5186020i2.deduplication_type);
            C02C3.ADAPTER.encodeWithTag(protoWriter, 189, c5186020i2.interaction_tag_info);
            protoAdapter.encodeWithTag(protoWriter, 190, c5186020i2.content_desc);
            protoAdapter6.asRepeated().encodeWithTag(protoWriter, 191, c5186020i2.content_desc_extra);
            C621102bZ.ADAPTER.encodeWithTag(protoWriter, 193, c5186020i2.duet_info);
            protoAdapter.encodeWithTag(protoWriter, 194, c5186020i2.extra_info);
            protoAdapter5.encodeWithTag(protoWriter, 195, c5186020i2.item_source_category);
            protoAdapter8.encodeWithTag(protoWriter, 196, c5186020i2.enable_pos_adjust);
            protoAdapter8.encodeWithTag(protoWriter, 197, c5186020i2.enable_ad_drop);
            protoAdapter5.encodeWithTag(protoWriter, 198, c5186020i2.pred_playtime);
            protoAdapter5.asRepeated().encodeWithTag(protoWriter, 199, c5186020i2.gap_list);
            protoAdapter8.encodeWithTag(protoWriter, 200, c5186020i2.is_client_cache);
            protoAdapter2.encodeWithTag(protoWriter, 201, c5186020i2.follow_up_publish_from_id);
            C02CO.ADAPTER.encodeWithTag(protoWriter, 202, c5186020i2.trending_bar_fyp);
            C546302Az.ADAPTER.encodeWithTag(protoWriter, 203, c5186020i2.music_dsp_info);
            protoAdapter8.encodeWithTag(protoWriter, 204, c5186020i2.disable_search_trending_bar);
            C026X.ADAPTER.encodeWithTag(protoWriter, 205, c5186020i2.image_post_info);
            C552202Dg.ADAPTER.encodeWithTag(protoWriter, 206, c5186020i2.suggest_words);
            C619202bG.ADAPTER.encodeWithTag(protoWriter, 207, c5186020i2.GroupIdList);
            protoAdapter.encodeWithTag(protoWriter, 208, c5186020i2.commercial_video_info);
            protoAdapter8.encodeWithTag(protoWriter, 209, c5186020i2.allow_reuse_original_sound);
            protoAdapter5.encodeWithTag(protoWriter, 210, c5186020i2.music_begin_time_in_ms);
            protoAdapter5.encodeWithTag(protoWriter, 211, c5186020i2.music_end_time_in_ms);
            protoAdapter5.encodeWithTag(protoWriter, 212, c5186020i2.retry_type);
            C668402jC.ADAPTER.encodeWithTag(protoWriter, 213, c5186020i2.upvote_preload);
            C620502bT.ADAPTER.encodeWithTag(protoWriter, 214, c5186020i2.commerce_rerank_info);
            C627802ce.ADAPTER.encodeWithTag(protoWriter, 215, c5186020i2.share_to_story_info);
            C02CW.ADAPTER.encodeWithTag(protoWriter, 216, c5186020i2.ad_story_video);
            C620202bQ.ADAPTER.encodeWithTag(protoWriter, 217, c5186020i2.nearby_info);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 218, c5186020i2.branded_content_accounts);
            C5436029y.ADAPTER.encodeWithTag(protoWriter, 219, c5186020i2.rec_reason);
            protoAdapter8.encodeWithTag(protoWriter, 220, c5186020i2.should_add_creator_tts_watermark_when_downloading);
            ProtoAdapter<C5225021v> protoAdapter17 = C5225021v.ADAPTER;
            protoAdapter17.encodeWithTag(protoWriter, 221, c5186020i2.poi_data);
            protoAdapter8.encodeWithTag(protoWriter, 222, c5186020i2.is_description_translatable);
            C5215021l.ADAPTER.encodeWithTag(protoWriter, 223, c5186020i2.now_posts);
            C5281023z.ADAPTER.encodeWithTag(protoWriter, 224, c5186020i2.podcast_info);
            protoAdapter.encodeWithTag(protoWriter, 225, c5186020i2.follow_up_first_item_id);
            protoAdapter.encodeWithTag(protoWriter, 226, c5186020i2.follow_up_item_id_groups);
            protoAdapter5.encodeWithTag(protoWriter, 227, c5186020i2.story_type);
            protoAdapter8.encodeWithTag(protoWriter, 228, c5186020i2.is_text_sticker_translatable);
            protoAdapter.encodeWithTag(protoWriter, 229, c5186020i2.text_sticker_major_lang);
            C02E6.ADAPTER.encodeWithTag(protoWriter, 230, c5186020i2.ttm_info);
            C02S8.ADAPTER.encodeWithTag(protoWriter, 231, c5186020i2.edit_post_permission);
            C02D8.ADAPTER.encodeWithTag(protoWriter, 232, c5186020i2.original_client_text);
            protoAdapter.encodeWithTag(protoWriter, 233, c5186020i2.music_selected_from);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 234, c5186020i2.tts_voice_ids);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 235, c5186020i2.reference_tts_voice_ids);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 236, c5186020i2.voice_filter_ids);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 237, c5186020i2.reference_voice_filter_ids);
            protoAdapter5.encodeWithTag(protoWriter, 238, c5186020i2.music_title_style);
            C550802Cs.ADAPTER.encodeWithTag(protoWriter, 239, c5186020i2.promote);
            C626302cP.ADAPTER.encodeWithTag(protoWriter, 240, c5186020i2.animated_image_info);
            C5214021k.ADAPTER.encodeWithTag(protoWriter, 241, c5186020i2.comment_config);
            protoAdapter.encodeWithTag(protoWriter, 242, c5186020i2.survey_key);
            protoAdapter.encodeWithTag(protoWriter, 243, c5186020i2.trans_params);
            C551602Da.ADAPTER.encodeWithTag(protoWriter, 244, c5186020i2.animated_btn);
            ProtoAdapter<C5425029n> protoAdapter18 = C5425029n.ADAPTER;
            protoAdapter18.asRepeated().encodeWithTag(protoWriter, 245, c5186020i2.survey_info);
            protoAdapter4.encodeWithTag(protoWriter, 246, c5186020i2.added_sound_music_info);
            protoAdapter.encodeWithTag(protoWriter, 247, c5186020i2.origin_volume);
            protoAdapter.encodeWithTag(protoWriter, 248, c5186020i2.music_volume);
            protoAdapter8.encodeWithTag(protoWriter, 249, c5186020i2.support_danmaku);
            protoAdapter8.encodeWithTag(protoWriter, 250, c5186020i2.has_danmaku);
            protoAdapter18.encodeWithTag(protoWriter, 251, c5186020i2.real_survey_info);
            C02CI.ADAPTER.encodeWithTag(protoWriter, 252, c5186020i2.card);
            C552402Di.ADAPTER.encodeWithTag(protoWriter, 253, c5186020i2.ttec_suggest_words);
            protoAdapter5.encodeWithTag(protoWriter, 255, c5186020i2.content_original_type);
            protoAdapter.encodeWithTag(protoWriter, 256, c5186020i2.shoot_tab_name);
            protoAdapter.encodeWithTag(protoWriter, 257, c5186020i2.content_type);
            protoAdapter5.encodeWithTag(protoWriter, 258, c5186020i2.content_size_type);
            protoAdapter8.encodeWithTag(protoWriter, 259, c5186020i2.is_tiktok_story);
            protoAdapter8.encodeWithTag(protoWriter, 260, c5186020i2.is_sub_only_video);
            protoAdapter8.encodeWithTag(protoWriter, 261, c5186020i2.is_nff_or_nr);
            protoAdapter11.encodeWithTag(protoWriter, 262, c5186020i2.podcast_full_episode_item);
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 263, c5186020i2.parameterized_speed);
            C557502Fh.ADAPTER.asRepeated().encodeWithTag(protoWriter, 264, c5186020i2.operator_boost_info);
            protoAdapter8.encodeWithTag(protoWriter, 265, c5186020i2.filter_unfriendly_user_comments);
            protoAdapter8.encodeWithTag(protoWriter, 266, c5186020i2.filter_stranger_comments);
            protoAdapter8.encodeWithTag(protoWriter, 267, c5186020i2.is_story_to_normal);
            C02DQ.ADAPTER.encodeWithTag(protoWriter, 268, c5186020i2.fake_landscape_video_info);
            protoAdapter.encodeWithTag(protoWriter, 269, c5186020i2.main_arch_common);
            protoAdapter.encodeWithTag(protoWriter, 270, c5186020i2.batch_id);
            protoAdapter5.encodeWithTag(protoWriter, 271, c5186020i2.batch_index);
            C687002mC.ADAPTER.encodeWithTag(protoWriter, 272, c5186020i2.aigc_info);
            protoAdapter5.encodeWithTag(protoWriter, 273, c5186020i2.ttt_product_recall_type);
            C02W5.ADAPTER.encodeWithTag(protoWriter, 274, c5186020i2.related_live);
            protoAdapter5.encodeWithTag(protoWriter, 275, c5186020i2.share_story_status);
            C02US.ADAPTER.encodeWithTag(protoWriter, 276, c5186020i2.add_yours_recommendation);
            C02D9.ADAPTER.asRepeated().encodeWithTag(protoWriter, 277, c5186020i2.banners);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 278, c5186020i2.picked_users);
            C02AT.ADAPTER.encodeWithTag(protoWriter, 279, c5186020i2.standard_component_info);
            protoAdapter8.encodeWithTag(protoWriter, 280, c5186020i2.is_comment_post_video);
            C667502j3.ADAPTER.encodeWithTag(protoWriter, 281, c5186020i2.comment_post_video);
            protoAdapter5.encodeWithTag(protoWriter, 282, c5186020i2.has_promote_entry);
            protoAdapter.encodeWithTag(protoWriter, 283, c5186020i2.promote_toast);
            protoAdapter.encodeWithTag(protoWriter, 284, c5186020i2.promote_toast_key);
            C600902Vz.ADAPTER.encodeWithTag(protoWriter, 285, c5186020i2.share_operation_info);
            protoAdapter8.encodeWithTag(protoWriter, 286, c5186020i2.show_quick_dm_box);
            protoAdapter8.encodeWithTag(protoWriter, 387, c5186020i2.is_title_translatable);
            protoAdapter.encodeWithTag(protoWriter, 288, c5186020i2.title_language);
            C02C4.ADAPTER.encodeWithTag(protoWriter, 289, c5186020i2.upvote_info);
            C667802j6.ADAPTER.encodeWithTag(protoWriter, 290, c5186020i2.share_to_video_info);
            C025O.ADAPTER.asRepeated().encodeWithTag(protoWriter, 291, c5186020i2.comment_topbar_info);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 292, c5186020i2.user_affinity_score);
            protoAdapter.encodeWithTag(protoWriter, 293, c5186020i2.music_promo_id);
            protoAdapter5.encodeWithTag(protoWriter, 294, c5186020i2.music_retriever_flag);
            C610002Zm.ADAPTER.encodeWithTag(protoWriter, 295, c5186020i2.content_model);
            C663702iR.ADAPTER.encodeWithTag(protoWriter, 296, c5186020i2.creation_info);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 297, c5186020i2.interactive_rec_hit_instructions);
            protoAdapter5.encodeWithTag(protoWriter, 298, c5186020i2.market_sub_type);
            protoAdapter5.encodeWithTag(protoWriter, 299, c5186020i2.market_drop_strategy);
            C02GU.ADAPTER.encodeWithTag(protoWriter, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, c5186020i2.collab_info);
            protoAdapter5.encodeWithTag(protoWriter, 301, c5186020i2.title_limited_rows);
            C028C.ADAPTER.encodeWithTag(protoWriter, 302, c5186020i2.text_consumption_info);
            C02E9.ADAPTER.encodeWithTag(protoWriter, 303, c5186020i2.music_promo_tag_info);
            C557702Fj.ADAPTER.encodeWithTag(protoWriter, 304, c5186020i2.rec_reason_tag);
            C02SK.ADAPTER.asRepeated().encodeWithTag(protoWriter, 305, c5186020i2.live_room_stats_tag);
            C713502qT.ADAPTER.encodeWithTag(protoWriter, 306, c5186020i2.moments_mode_info);
            C02C5.ADAPTER.encodeWithTag(protoWriter, 307, c5186020i2.music_fusion_info);
            C027M.ADAPTER.encodeWithTag(protoWriter, 308, c5186020i2.story_note_info);
            protoAdapter.encodeWithTag(protoWriter, 309, c5186020i2.promote_icon_text);
            protoAdapter8.encodeWithTag(protoWriter, 310, c5186020i2.used_full_song);
            protoAdapter.encodeWithTag(protoWriter, 311, c5186020i2.on_device_ml_features);
            C02UD.ADAPTER.encodeWithTag(protoWriter, 312, c5186020i2.realtime_fcp_config);
            C02DH.ADAPTER.encodeWithTag(protoWriter, 313, c5186020i2.interactive_rec_match_info);
            C666302ir.ADAPTER.encodeWithTag(protoWriter, 314, c5186020i2.add_yours_info);
            C5410028y.ADAPTER.encodeWithTag(protoWriter, 315, c5186020i2.internal_share);
            protoAdapter8.encodeWithTag(protoWriter, 316, c5186020i2.is_paid_content);
            C021E.ADAPTER.encodeWithTag(protoWriter, 317, c5186020i2.paid_content_info);
            C559202Fy.ADAPTER.encodeWithTag(protoWriter, 318, c5186020i2.music_discovery_info);
            protoAdapter.encodeWithTag(protoWriter, 319, c5186020i2.ocean_group_info);
            C669002jI.ADAPTER.encodeWithTag(protoWriter, 320, c5186020i2.similar_video_info);
            C5313025f.ADAPTER.encodeWithTag(protoWriter, 321, c5186020i2.c2pa_info);
            C666602iu.ADAPTER.encodeWithTag(protoWriter, 322, c5186020i2.video_mention_info);
            protoAdapter8.encodeWithTag(protoWriter, 323, c5186020i2.use_aweme_cache);
            C2223211Bzr.ADAPTER.encodeWithTag(protoWriter, 324, c5186020i2.abroll);
            protoAdapter8.encodeWithTag(protoWriter, 325, c5186020i2.has_ever_advertised);
            C02SM.ADAPTER.encodeWithTag(protoWriter, 326, c5186020i2.live_extra_info_struct);
            C559402Ga.ADAPTER.encodeWithTag(protoWriter, 327, c5186020i2.prompt_result);
            protoAdapter2.encodeWithTag(protoWriter, 328, c5186020i2.time_portal);
            protoAdapter8.encodeWithTag(protoWriter, 329, c5186020i2.is_streaks_post);
            C667202j0.ADAPTER.encodeWithTag(protoWriter, 330, c5186020i2.streaks_meta);
            C670502jX.ADAPTER.encodeWithTag(protoWriter, 331, c5186020i2.celebration_metadata);
            protoAdapter5.encodeWithTag(protoWriter, 332, c5186020i2.consumption_recall);
            protoAdapter5.encodeWithTag(protoWriter, 333, c5186020i2.is_high_consumption_val);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 334, c5186020i2.quick_reply_emojis);
            C02H7.ADAPTER.encodeWithTag(protoWriter, 335, c5186020i2.new_user_recommended_reason);
            AnonymousClass0243.ADAPTER.encodeWithTag(protoWriter, 336, c5186020i2.visual_search_info);
            C550202Cm.ADAPTER.encodeWithTag(protoWriter, 337, c5186020i2.template_config);
            C558502Fr.ADAPTER.asRepeated().encodeWithTag(protoWriter, 338, c5186020i2.search_info_struct);
            C673702k3.ADAPTER.encodeWithTag(protoWriter, 400, c5186020i2.social_interaction_blob);
            C674002k6.ADAPTER.encodeWithTag(protoWriter, 401, c5186020i2.solaria_profile);
            protoAdapter8.encodeWithTag(protoWriter, 402, c5186020i2.is_social_fresh_content);
            protoAdapter8.encodeWithTag(protoWriter, 403, c5186020i2.convert_to_fyp_card);
            protoAdapter2.encodeWithTag(protoWriter, 404, c5186020i2.convert_to_fyp_card_expire_time);
            protoAdapter8.encodeWithTag(protoWriter, 405, c5186020i2.is_unconsumed_resuse);
            C653802gq.ADAPTER.encodeWithTag(protoWriter, 406, c5186020i2.meme_reg_info);
            C626002cM.ADAPTER.encodeWithTag(protoWriter, 407, c5186020i2.onboarding_survey);
            C02D4.ADAPTER.encodeWithTag(protoWriter, 408, c5186020i2.desc_title_translated_text);
            protoAdapter17.encodeWithTag(protoWriter, 409, c5186020i2.outflow_poi_data);
            C632402dO.ADAPTER.encodeWithTag(protoWriter, 410, c5186020i2.layout_info);
            C669302jL.ADAPTER.encodeWithTag(protoWriter, 411, c5186020i2.golden_cache_config);
            C596802Uk.ADAPTER.encodeWithTag(protoWriter, 412, c5186020i2.moderation_aigc_info);
            C700102oJ.ADAPTER.encodeWithTag(protoWriter, 413, c5186020i2.landscape_video);
            C02UA.ADAPTER.encodeWithTag(protoWriter, 414, c5186020i2.smart_search_info);
            protoAdapter.encodeWithTag(protoWriter, 415, c5186020i2.survey_tags);
            C556202Eu.ADAPTER.encodeWithTag(protoWriter, 416, c5186020i2.ttec_search_growth_info);
            C02LL.ADAPTER.encodeWithTag(protoWriter, 417, c5186020i2.tns_ue_feed_info);
            C02SS.ADAPTER.encodeWithTag(protoWriter, 418, c5186020i2.local_service_info);
            C1CCK.ADAPTER.encodeWithTag(protoWriter, 419, c5186020i2.ai_info);
            C02HS.ADAPTER.asRepeated().encodeWithTag(protoWriter, 420, c5186020i2.declaration_info);
            C02FN.ADAPTER.encodeWithTag(protoWriter, 421, c5186020i2.ai_alive_info);
            C027K.ADAPTER.encodeWithTag(protoWriter, 422, c5186020i2.imagine_sticker_info);
            C664802ic.ADAPTER.encodeWithTag(protoWriter, 423, c5186020i2.tako_bubble_info);
            C1CCQ.ADAPTER.encodeWithTag(protoWriter, 424, c5186020i2.creator_ai_comment);
            protoAdapter8.encodeWithTag(protoWriter, 425, c5186020i2.is_spark_plus);
            C668102j9.ADAPTER.encodeWithTag(protoWriter, 426, c5186020i2.personalized_survey_ui);
            C687402mG.ADAPTER.encodeWithTag(protoWriter, 427, c5186020i2.brand_safety_info);
            C02E1.ADAPTER.encodeWithTag(protoWriter, 428, c5186020i2.translated_video);
            C674902kF.ADAPTER.encodeWithTag(protoWriter, 429, c5186020i2.psp_info);
            C02DS.ADAPTER.asRepeated().encodeWithTag(protoWriter, 430, c5186020i2.ic_asset_info);
            C5296024o.ADAPTER.encodeWithTag(protoWriter, 431, c5186020i2.ai_theater_info);
            C666902ix.ADAPTER.encodeWithTag(protoWriter, 432, c5186020i2.comment_at_tako_info);
            C027Z.ADAPTER.encodeWithTag(protoWriter, 433, c5186020i2.ai_remix_info);
            protoAdapter5.encodeWithTag(protoWriter, 434, c5186020i2.item_allow_ai_remix);
            C02VC.ADAPTER.encodeWithTag(protoWriter, 435, c5186020i2.poi_trace);
            C655602h8.ADAPTER.encodeWithTag(protoWriter, 436, c5186020i2.detail_lynx_card_info);
            C622602bo.ADAPTER.encodeWithTag(protoWriter, 437, c5186020i2.personalized_onboarding_survey);
            C661502i5.ADAPTER.encodeWithTag(protoWriter, 438, c5186020i2.offline_video_info);
            AnonymousClass0267.ADAPTER.encodeWithTag(protoWriter, 439, c5186020i2.ai_portrait_info);
            C739002ua.ADAPTER.encodeWithTag(protoWriter, 440, c5186020i2.ai_chat_meta);
            protoWriter.writeBytes(c5186020i2.unknownFields());
        }
    };
    public C619202bG GroupIdList;
    public C2223211Bzr abroll;
    public C027T acl_info;
    public C02GB activity;
    public AnonymousClass0263 activity_pendant;
    public Integer ad_aweme_source;
    public Integer ad_link_type;
    public String ad_order_id;
    public String ad_schedule;
    public C02CW ad_story_video;
    public C666302ir add_yours_info;
    public C02US add_yours_recommendation;
    public C5199020v added_sound_music_info;
    public C02FN ai_alive_info;
    public C739002ua ai_chat_meta;
    public C1CCK ai_info;
    public AnonymousClass0267 ai_portrait_info;
    public C027Z ai_remix_info;
    public C5296024o ai_theater_info;
    public C687002mC aigc_info;
    public Boolean allow_gift;
    public Boolean allow_reuse_original_sound;
    public C546902Bf anchor;
    public C544602Ai anchor_info;
    public List<C5227021x> anchors;
    public String anchors_extras;
    public C551602Da animated_btn;
    public C626302cP animated_image_info;
    public C02BA audio;
    public C5189020l author;
    public Long author_user_id;
    public C027T aweme_acl;
    public C02F4 aweme_control;
    public String aweme_id;
    public Integer aweme_type;
    public C02ER banner_tip;
    public List<C02D9> banners;
    public String batch_id;
    public Integer batch_index;
    public Integer bodydance_score;
    public C618002b4 boost_tag_info;
    public C02UP bottom_bar;
    public C687402mG brand_safety_info;
    public List<C5189020l> branded_content_accounts;
    public C5313025f c2pa_info;
    public C02CI card;
    public C670502jX celebration_metadata;
    public AnonymousClass0287 cell_room;
    public List<C021F> cha_list;
    public List<C559902Gf> challenge_position;
    public String city;
    public C2226281CBm cloud_game;
    public Boolean cmt_swt;
    public C549102Cb cny_info;
    public C02GU collab_info;
    public Integer collect_stat;
    public C666902ix comment_at_tako_info;
    public C5214021k comment_config;
    public C667502j3 comment_post_video;
    public List<C025O> comment_topbar_info;
    public List<C656202hE> commerce_config_data;
    public C5228021y commerce_info;
    public C620502bT commerce_rerank_info;
    public C550702Cr commerce_sticker_info;
    public String commercial_video_info;
    public Integer consumption_recall;
    public String content_desc;
    public List<C5312025e> content_desc_extra;
    public C610002Zm content_model;
    public Integer content_original_type;
    public Integer content_size_type;
    public String content_type;
    public Boolean convert_to_fyp_card;
    public Long convert_to_fyp_card_expire_time;
    public Long create_time;
    public C663702iR creation_info;
    public C1CCQ creator_ai_comment;
    public List<C02HS> declaration_info;
    public Integer deduplication_type;
    public String desc;
    public String desc_language;
    public C02D4 desc_title_translated_text;
    public C618902bD descendants;
    public C655602h8 detail_lynx_card_info;
    public Boolean disable_search_trending_bar;
    public String distance;
    public Integer distribute_type;
    public C544302Af dou_discount_mix_info;
    public C621102bZ duet_info;
    public Integer duration;
    public C02S8 edit_post_permission;
    public Boolean enable_ad_drop;
    public Boolean enable_pos_adjust;
    public Boolean enable_top_view;
    public String extra;
    public String extra_info;
    public C02DQ fake_landscape_video_info;
    public C02C2 feed_relation_label;
    public Boolean filter_stranger_comments;
    public Boolean filter_unfriendly_user_comments;
    public C5426029o floating_card_content;
    public String follow_up_first_item_id;
    public String follow_up_item_id_groups;
    public Long follow_up_publish_from_id;
    public String forward_comment_id;
    public C5186020i forward_item;
    public String forward_item_id;
    public C628102ch game_info;
    public List<Integer> gap_list;
    public List<String> geofencing;
    public List<String> geofencing_regions;
    public AnonymousClass0263 gesture_red_packet;
    public C669302jL golden_cache_config;
    public List<C550902Ct> green_screen_materials;
    public String group_id;
    public Boolean has_danmaku;
    public Boolean has_ever_advertised;
    public Integer has_promote_entry;
    public Boolean has_vs_entry;
    public C544302Af hot_info;
    public C02CT hot_list;
    public List<C550402Co> hybrid_label;
    public List<C02DS> ic_asset_info;
    public List<C02E5> image_infos;
    public C026X image_post_info;
    public C027K imagine_sticker_info;
    public C544402Ag interact_permission;
    public List<AnonymousClass0216> interaction_stickers;
    public C02C3 interaction_tag_info;
    public List<Long> interactive_rec_hit_instructions;
    public C02DH interactive_rec_match_info;
    public C5410028y internal_share;
    public Boolean is_ads;
    public Boolean is_client_cache;
    public Boolean is_comment_post_video;
    public Boolean is_description_translatable;
    public Integer is_effect_designer;
    public Boolean is_familiar;
    public Integer is_hash_tag;
    public Integer is_high_consumption_val;
    public Boolean is_horizontal;
    public Boolean is_nff_or_nr;
    public Boolean is_paid_content;
    public Boolean is_pgcshow;
    public Boolean is_relieve;
    public Boolean is_social_fresh_content;
    public Boolean is_spark_plus;
    public Integer is_story;
    public Boolean is_story_to_normal;
    public Boolean is_streaks_post;
    public Boolean is_sub_only_video;
    public Boolean is_text_sticker_translatable;
    public Boolean is_tiktok_story;
    public Boolean is_title_translatable;
    public Integer is_top;
    public Boolean is_unconsumed_resuse;
    public Boolean is_vr;
    public Integer item_allow_ai_remix;
    public Integer item_comment_settings;
    public String item_distribute_source;
    public Integer item_duet;
    public Integer item_react;
    public Integer item_source_category;
    public Integer item_stitch;
    public C673002jw label_friend;
    public C673002jw label_large;
    public C673002jw label_music_starter;
    public String label_music_starter_text;
    public C673002jw label_origin_author;
    public C673002jw label_private;
    public C673002jw label_thumb;
    public C673002jw label_top;
    public List<C556502Ex> label_top_text;
    public String landing_page;
    public C700102oJ landscape_video;
    public C632402dO layout_info;
    public String link_ad_data;
    public C02CB link_match;
    public C02SM live_extra_info_struct;
    public String live_reason;
    public List<C02SK> live_room_stats_tag;
    public C02SS local_service_info;
    public List<C02BX> long_video;
    public String main_arch_common;
    public Integer market_drop_strategy;
    public Integer market_sub_type;
    public C02AY mask_info;
    public List<C02AY> mask_infos;
    public C653802gq meme_reg_info;
    public AnonymousClass0299 micro_app_info;
    public String misc_info;
    public AnonymousClass0285 mix_info;
    public C596802Uk moderation_aigc_info;
    public C713502qT moments_mode_info;
    public C5199020v music;
    public Integer music_begin_time_in_ms;
    public C559202Fy music_discovery_info;
    public C546302Az music_dsp_info;
    public Integer music_end_time_in_ms;
    public C02C5 music_fusion_info;
    public String music_promo_id;
    public C02E9 music_promo_tag_info;
    public Integer music_retriever_flag;
    public String music_selected_from;
    public Integer music_title_style;
    public String music_volume;
    public C02C6 mutual_relation;
    public C02C6 mutual_relation_tmp;
    public C2227811CHj national_task_info;
    public C620202bQ nearby_info;
    public Boolean need_vs_entry;
    public C02H7 new_user_recommended_reason;
    public List<C559902Gf> nickname_position;
    public C5215021l now_posts;
    public String ocean_group_info;
    public C661502i5 offline_video_info;
    public String on_device_ml_features;
    public C626002cM onboarding_survey;
    public String open_platform_name;
    public List<C557502Fh> operator_boost_info;
    public List<String> origin_comment_ids;
    public String origin_volume;
    public C02D8 original_client_text;
    public C5225021v outflow_poi_data;
    public C021E paid_content_info;
    public Float parameterized_speed;
    public String part_n;
    public C622602bo personalized_onboarding_survey;
    public C668102j9 personalized_survey_ui;
    public List<C5189020l> picked_users;
    public Boolean playlist_blocked;
    public C608702Yz playlist_info;
    public C5186020i podcast_full_episode_item;
    public C5281023z podcast_info;
    public C5225021v poi_data;
    public C02VC poi_trace;
    public List<C559902Gf> position;
    public String pre_forward_id;
    public Integer pred_playtime;
    public C544502Ah preload;
    public Boolean prevent_download;
    public C550802Cs promote;
    public String promote_icon_text;
    public String promote_toast;
    public String promote_toast_key;
    public C559402Ga prompt_result;
    public C674902kF psp_info;
    public List<C550502Cp> question_list;
    public List<String> quick_reply_emojis;
    public Integer rate;
    public String raw_ad_data;
    public C5425029n real_survey_info;
    public C02UD realtime_fcp_config;
    public C5436029y rec_reason;
    public C557702Fj rec_reason_tag;
    public List<String> reference_tts_voice_ids;
    public List<String> reference_voice_filter_ids;
    public String region;
    public C02W5 related_live;
    public C556302Ev relation_recommend_info;
    public Integer retry_type;
    public C02CM risk_infos;
    public List<C558502Fr> search_info_struct;
    public C5271023p share_info;
    public C600902Vz share_operation_info;
    public Integer share_story_status;
    public C627802ce share_to_story_info;
    public C667802j6 share_to_video_info;
    public String share_url;
    public String shoot_tab_name;
    public Boolean should_add_creator_tts_watermark_when_downloading;
    public Boolean show_quick_dm_box;
    public Boolean show_sticker_guide;
    public C669002jI similar_video_info;
    public String simple_promotions;
    public String simple_shop_seeding;
    public C02UA smart_search_info;
    public C673702k3 social_interaction_blob;
    public C674002k6 solaria_profile;
    public String sort_label;
    public Integer sound_exemption;
    public C550302Cn sp_sticker;
    public C02AT standard_component_info;
    public C1CBX star_atlas_info;
    public Long star_atlas_order_id;
    public String star_recommend_tag;
    public C029A statistics;
    public C024B status;
    public C022S sticker_detail;
    public String stickers;
    public C1CAO stitch;
    public C732502tX stitch_permission;
    public C2226971CEd story_group;
    public C595302Tv story_metadata;
    public C027M story_note_info;
    public Integer story_ttl;
    public Integer story_type;
    public C667202j0 streaks_meta;
    public C552202Dg suggest_words;
    public Boolean support_danmaku;
    public List<C5425029n> survey_info;
    public String survey_key;
    public String survey_tags;
    public String take_down_desc;
    public Integer take_down_reason;
    public C664802ic tako_bubble_info;
    public C550202Cm template_config;
    public C028C text_consumption_info;
    public List<C5312025e> text_extra;
    public String text_sticker_major_lang;
    public Long time_portal;
    public String title_language;
    public Integer title_limited_rows;
    public C02LL tns_ue_feed_info;
    public String trans_params;
    public C02E1 translated_video;
    public C02CP trending_bar;
    public C02CO trending_bar_fyp;
    public C556202Eu ttec_search_growth_info;
    public C552402Di ttec_suggest_words;
    public C02E6 ttm_info;
    public List<String> tts_voice_ids;
    public Integer ttt_product_recall_type;
    public List<C559902Gf> uniqid_position;
    public C02C4 upvote_info;
    public C668402jC upvote_preload;
    public C5411028z upvote_reason;
    public Boolean use_aweme_cache;
    public Boolean used_full_song;
    public Double user_affinity_score;
    public Integer user_digged;
    public C665102if user_profile_init_info;
    public AnonymousClass0242 user_story;
    public AnonymousClass0213 video;
    public C02A4 video_control;
    public String video_feed_tag;
    public List<C02FQ> video_labels;
    public C666602iu video_mention_info;
    public C02B6 video_reply_info;
    public List<C556502Ex> video_text;
    public AnonymousClass0243 visual_search_info;
    public List<String> voice_filter_ids;
    public C726102sV vpa_info;
    public C2251241D9m vs_entry;
    public Boolean with_promotional_music;
    public Boolean with_survey;
    public Boolean without_watermark;

    public C5186020i() {
        super(ADAPTER, ByteString.EMPTY);
        this.cha_list = C1516540pZE.LJIIIIZZ();
        this.text_extra = C1516540pZE.LJIIIIZZ();
        this.video_labels = C1516540pZE.LJIIIIZZ();
        this.image_infos = C1516540pZE.LJIIIIZZ();
        this.position = C1516540pZE.LJIIIIZZ();
        this.uniqid_position = C1516540pZE.LJIIIIZZ();
        this.geofencing = C1516540pZE.LJIIIIZZ();
        this.video_text = C1516540pZE.LJIIIIZZ();
        this.label_top_text = C1516540pZE.LJIIIIZZ();
        this.nickname_position = C1516540pZE.LJIIIIZZ();
        this.challenge_position = C1516540pZE.LJIIIIZZ();
        this.long_video = C1516540pZE.LJIIIIZZ();
        this.interaction_stickers = C1516540pZE.LJIIIIZZ();
        this.origin_comment_ids = C1516540pZE.LJIIIIZZ();
        this.commerce_config_data = C1516540pZE.LJIIIIZZ();
        this.anchors = C1516540pZE.LJIIIIZZ();
        this.hybrid_label = C1516540pZE.LJIIIIZZ();
        this.geofencing_regions = C1516540pZE.LJIIIIZZ();
        this.mask_infos = C1516540pZE.LJIIIIZZ();
        this.green_screen_materials = C1516540pZE.LJIIIIZZ();
        this.question_list = C1516540pZE.LJIIIIZZ();
        this.content_desc_extra = C1516540pZE.LJIIIIZZ();
        this.gap_list = C1516540pZE.LJIIIIZZ();
        this.branded_content_accounts = C1516540pZE.LJIIIIZZ();
        this.tts_voice_ids = C1516540pZE.LJIIIIZZ();
        this.reference_tts_voice_ids = C1516540pZE.LJIIIIZZ();
        this.voice_filter_ids = C1516540pZE.LJIIIIZZ();
        this.reference_voice_filter_ids = C1516540pZE.LJIIIIZZ();
        this.survey_info = C1516540pZE.LJIIIIZZ();
        this.operator_boost_info = C1516540pZE.LJIIIIZZ();
        this.banners = C1516540pZE.LJIIIIZZ();
        this.picked_users = C1516540pZE.LJIIIIZZ();
        this.comment_topbar_info = C1516540pZE.LJIIIIZZ();
        this.interactive_rec_hit_instructions = C1516540pZE.LJIIIIZZ();
        this.live_room_stats_tag = C1516540pZE.LJIIIIZZ();
        this.quick_reply_emojis = C1516540pZE.LJIIIIZZ();
        this.search_info_struct = C1516540pZE.LJIIIIZZ();
        this.declaration_info = C1516540pZE.LJIIIIZZ();
        this.ic_asset_info = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02J8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.aweme_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.desc;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.create_time;
        int iHashCode4 = (iHashCode3 + (l != null ? l.hashCode() : 0)) * 37;
        C5189020l c5189020l = this.author;
        int iHashCode5 = (iHashCode4 + (c5189020l != null ? c5189020l.hashCode() : 0)) * 37;
        C5199020v c5199020v = this.music;
        int iHashCode6 = (((iHashCode5 + (c5199020v != null ? c5199020v.hashCode() : 0)) * 37) + this.cha_list.hashCode()) * 37;
        AnonymousClass0213 anonymousClass0213 = this.video;
        int iHashCode7 = (iHashCode6 + (anonymousClass0213 != null ? anonymousClass0213.hashCode() : 0)) * 37;
        String str3 = this.share_url;
        int iHashCode8 = (iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Integer num = this.user_digged;
        int iHashCode9 = (iHashCode8 + (num != null ? num.hashCode() : 0)) * 37;
        C029A c029a = this.statistics;
        int iHashCode10 = (iHashCode9 + (c029a != null ? c029a.hashCode() : 0)) * 37;
        C024B c024b = this.status;
        int iHashCode11 = (iHashCode10 + (c024b != null ? c024b.hashCode() : 0)) * 37;
        String str4 = this.extra;
        int iHashCode12 = (iHashCode11 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Integer num2 = this.rate;
        int iHashCode13 = (((iHashCode12 + (num2 != null ? num2.hashCode() : 0)) * 37) + this.text_extra.hashCode()) * 37;
        C673002jw c673002jw = this.label_large;
        int iHashCode14 = (iHashCode13 + (c673002jw != null ? c673002jw.hashCode() : 0)) * 37;
        C673002jw c673002jw2 = this.label_thumb;
        int iHashCode15 = (iHashCode14 + (c673002jw2 != null ? c673002jw2.hashCode() : 0)) * 37;
        Integer num3 = this.is_top;
        int iHashCode16 = (iHashCode15 + (num3 != null ? num3.hashCode() : 0)) * 37;
        C673002jw c673002jw3 = this.label_top;
        int iHashCode17 = (iHashCode16 + (c673002jw3 != null ? c673002jw3.hashCode() : 0)) * 37;
        C5271023p c5271023p = this.share_info;
        int iHashCode18 = (iHashCode17 + (c5271023p != null ? c5271023p.hashCode() : 0)) * 37;
        C673002jw c673002jw4 = this.label_origin_author;
        int iHashCode19 = (iHashCode18 + (c673002jw4 != null ? c673002jw4.hashCode() : 0)) * 37;
        String str5 = this.distance;
        int iHashCode20 = (iHashCode19 + (str5 != null ? str5.hashCode() : 0)) * 37;
        C673002jw c673002jw5 = this.label_music_starter;
        int iHashCode21 = (iHashCode20 + (c673002jw5 != null ? c673002jw5.hashCode() : 0)) * 37;
        C673002jw c673002jw6 = this.label_private;
        int iHashCode22 = (((iHashCode21 + (c673002jw6 != null ? c673002jw6.hashCode() : 0)) * 37) + this.video_labels.hashCode()) * 37;
        Boolean bool = this.is_vr;
        int iHashCode23 = (iHashCode22 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str6 = this.landing_page;
        int iHashCode24 = (iHashCode23 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_ads;
        int iHashCode25 = (iHashCode24 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Integer num4 = this.duration;
        int iHashCode26 = (iHashCode25 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Integer num5 = this.aweme_type;
        int iHashCode27 = (iHashCode26 + (num5 != null ? num5.hashCode() : 0)) * 37;
        Boolean bool3 = this.cmt_swt;
        int iHashCode28 = (((iHashCode27 + (bool3 != null ? bool3.hashCode() : 0)) * 37) + this.image_infos.hashCode()) * 37;
        C02CM c02cm = this.risk_infos;
        int iHashCode29 = (iHashCode28 + (c02cm != null ? c02cm.hashCode() : 0)) * 37;
        Boolean bool4 = this.is_relieve;
        int iHashCode30 = (iHashCode29 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        C673002jw c673002jw7 = this.label_friend;
        int iHashCode31 = (iHashCode30 + (c673002jw7 != null ? c673002jw7.hashCode() : 0)) * 37;
        String str7 = this.sort_label;
        int iHashCode32 = (((((iHashCode31 + (str7 != null ? str7.hashCode() : 0)) * 37) + this.position.hashCode()) * 37) + this.uniqid_position.hashCode()) * 37;
        Long l2 = this.author_user_id;
        int iHashCode33 = (iHashCode32 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Integer num6 = this.bodydance_score;
        int iHashCode34 = (((iHashCode33 + (num6 != null ? num6.hashCode() : 0)) * 37) + this.geofencing.hashCode()) * 37;
        Integer num7 = this.is_hash_tag;
        int iHashCode35 = (iHashCode34 + (num7 != null ? num7.hashCode() : 0)) * 37;
        Boolean bool5 = this.is_pgcshow;
        int iHashCode36 = (iHashCode35 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        String str8 = this.region;
        int iHashCode37 = (((iHashCode36 + (str8 != null ? str8.hashCode() : 0)) * 37) + this.video_text.hashCode()) * 37;
        C550302Cn c550302Cn = this.sp_sticker;
        int iHashCode38 = (iHashCode37 + (c550302Cn != null ? c550302Cn.hashCode() : 0)) * 37;
        String str9 = this.ad_schedule;
        int iHashCode39 = (iHashCode38 + (str9 != null ? str9.hashCode() : 0)) * 37;
        Integer num8 = this.collect_stat;
        int iHashCode40 = (((iHashCode39 + (num8 != null ? num8.hashCode() : 0)) * 37) + this.label_top_text.hashCode()) * 37;
        String str10 = this.stickers;
        int iHashCode41 = (iHashCode40 + (str10 != null ? str10.hashCode() : 0)) * 37;
        C5186020i c5186020i = this.forward_item;
        int iHashCode42 = (iHashCode41 + (c5186020i != null ? c5186020i.hashCode() : 0)) * 37;
        String str11 = this.forward_comment_id;
        int iHashCode43 = (iHashCode42 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.forward_item_id;
        int iHashCode44 = (iHashCode43 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.group_id;
        int iHashCode45 = (iHashCode44 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.pre_forward_id;
        int iHashCode46 = (iHashCode45 + (str14 != null ? str14.hashCode() : 0)) * 37;
        Boolean bool6 = this.prevent_download;
        int iHashCode47 = (((((iHashCode46 + (bool6 != null ? bool6.hashCode() : 0)) * 37) + this.nickname_position.hashCode()) * 37) + this.challenge_position.hashCode()) * 37;
        Integer num9 = this.item_comment_settings;
        int iHashCode48 = (iHashCode47 + (num9 != null ? num9.hashCode() : 0)) * 37;
        C618902bD c618902bD = this.descendants;
        int iHashCode49 = (iHashCode48 + (c618902bD != null ? c618902bD.hashCode() : 0)) * 37;
        String str15 = this.raw_ad_data;
        int iHashCode50 = (iHashCode49 + (str15 != null ? str15.hashCode() : 0)) * 37;
        C628102ch c628102ch = this.game_info;
        int iHashCode51 = (iHashCode50 + (c628102ch != null ? c628102ch.hashCode() : 0)) * 37;
        AnonymousClass0299 anonymousClass0299 = this.micro_app_info;
        int iHashCode52 = (iHashCode51 + (anonymousClass0299 != null ? anonymousClass0299.hashCode() : 0)) * 37;
        Boolean bool7 = this.with_promotional_music;
        int iHashCode53 = (iHashCode52 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
        String str16 = this.link_ad_data;
        int iHashCode54 = (iHashCode53 + (str16 != null ? str16.hashCode() : 0)) * 37;
        AnonymousClass0263 anonymousClass0263 = this.gesture_red_packet;
        int iHashCode55 = (iHashCode54 + (anonymousClass0263 != null ? anonymousClass0263.hashCode() : 0)) * 37;
        AnonymousClass0263 anonymousClass02632 = this.activity_pendant;
        int iHashCode56 = (iHashCode55 + (anonymousClass02632 != null ? anonymousClass02632.hashCode() : 0)) * 37;
        C022S c022s = this.sticker_detail;
        int iHashCode57 = (((iHashCode56 + (c022s != null ? c022s.hashCode() : 0)) * 37) + this.long_video.hashCode()) * 37;
        Integer num10 = this.item_duet;
        int iHashCode58 = (iHashCode57 + (num10 != null ? num10.hashCode() : 0)) * 37;
        Integer num11 = this.item_react;
        int iHashCode59 = (iHashCode58 + (num11 != null ? num11.hashCode() : 0)) * 37;
        C544302Af c544302Af = this.hot_info;
        int iHashCode60 = (iHashCode59 + (c544302Af != null ? c544302Af.hashCode() : 0)) * 37;
        Long l3 = this.star_atlas_order_id;
        int iHashCode61 = (iHashCode60 + (l3 != null ? l3.hashCode() : 0)) * 37;
        String str17 = this.label_music_starter_text;
        int iHashCode62 = (iHashCode61 + (str17 != null ? str17.hashCode() : 0)) * 37;
        Boolean bool8 = this.without_watermark;
        int iHashCode63 = (iHashCode62 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
        C544502Ah c544502Ah = this.preload;
        int iHashCode64 = (iHashCode63 + (c544502Ah != null ? c544502Ah.hashCode() : 0)) * 37;
        String str18 = this.star_recommend_tag;
        int iHashCode65 = (iHashCode64 + (str18 != null ? str18.hashCode() : 0)) * 37;
        String str19 = this.ad_order_id;
        int iHashCode66 = (iHashCode65 + (str19 != null ? str19.hashCode() : 0)) * 37;
        String str20 = this.open_platform_name;
        int iHashCode67 = (iHashCode66 + (str20 != null ? str20.hashCode() : 0)) * 37;
        C1CBX c1cbx = this.star_atlas_info;
        int iHashCode68 = (iHashCode67 + (c1cbx != null ? c1cbx.hashCode() : 0)) * 37;
        String str21 = this.desc_language;
        int iHashCode69 = (iHashCode68 + (str21 != null ? str21.hashCode() : 0)) * 37;
        C5426029o c5426029o = this.floating_card_content;
        int iHashCode70 = (((iHashCode69 + (c5426029o != null ? c5426029o.hashCode() : 0)) * 37) + this.interaction_stickers.hashCode()) * 37;
        Integer num12 = this.ad_link_type;
        int iHashCode71 = (iHashCode70 + (num12 != null ? num12.hashCode() : 0)) * 37;
        Integer num13 = this.take_down_reason;
        int iHashCode72 = (iHashCode71 + (num13 != null ? num13.hashCode() : 0)) * 37;
        String str22 = this.take_down_desc;
        int iHashCode73 = (iHashCode72 + (str22 != null ? str22.hashCode() : 0)) * 37;
        String str23 = this.simple_promotions;
        int iHashCode74 = (iHashCode73 + (str23 != null ? str23.hashCode() : 0)) * 37;
        String str24 = this.misc_info;
        int iHashCode75 = (((((iHashCode74 + (str24 != null ? str24.hashCode() : 0)) * 37) + this.origin_comment_ids.hashCode()) * 37) + this.commerce_config_data.hashCode()) * 37;
        C550702Cr c550702Cr = this.commerce_sticker_info;
        int iHashCode76 = (iHashCode75 + (c550702Cr != null ? c550702Cr.hashCode() : 0)) * 37;
        Boolean bool9 = this.enable_top_view;
        int iHashCode77 = (iHashCode76 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
        Integer num14 = this.distribute_type;
        int iHashCode78 = (iHashCode77 + (num14 != null ? num14.hashCode() : 0)) * 37;
        C02A4 c02a4 = this.video_control;
        int iHashCode79 = (iHashCode78 + (c02a4 != null ? c02a4.hashCode() : 0)) * 37;
        Integer num15 = this.is_effect_designer;
        int iHashCode80 = (iHashCode79 + (num15 != null ? num15.hashCode() : 0)) * 37;
        Integer num16 = this.ad_aweme_source;
        int iHashCode81 = (iHashCode80 + (num16 != null ? num16.hashCode() : 0)) * 37;
        C02F4 c02f4 = this.aweme_control;
        int iHashCode82 = (iHashCode81 + (c02f4 != null ? c02f4.hashCode() : 0)) * 37;
        Boolean bool10 = this.has_vs_entry;
        int iHashCode83 = (iHashCode82 + (bool10 != null ? bool10.hashCode() : 0)) * 37;
        C546902Bf c546902Bf = this.anchor;
        int iHashCode84 = (iHashCode83 + (c546902Bf != null ? c546902Bf.hashCode() : 0)) * 37;
        C02C2 c02c2 = this.feed_relation_label;
        int iHashCode85 = (iHashCode84 + (c02c2 != null ? c02c2.hashCode() : 0)) * 37;
        AnonymousClass0285 anonymousClass0285 = this.mix_info;
        int iHashCode86 = (iHashCode85 + (anonymousClass0285 != null ? anonymousClass0285.hashCode() : 0)) * 37;
        String str25 = this.simple_shop_seeding;
        int iHashCode87 = (iHashCode86 + (str25 != null ? str25.hashCode() : 0)) * 37;
        C02CT c02ct = this.hot_list;
        int iHashCode88 = (iHashCode87 + (c02ct != null ? c02ct.hashCode() : 0)) * 37;
        C5228021y c5228021y = this.commerce_info;
        int iHashCode89 = (iHashCode88 + (c5228021y != null ? c5228021y.hashCode() : 0)) * 37;
        C2227811CHj c2227811CHj = this.national_task_info;
        int iHashCode90 = (iHashCode89 + (c2227811CHj != null ? c2227811CHj.hashCode() : 0)) * 37;
        C02ER c02er = this.banner_tip;
        int iHashCode91 = (iHashCode90 + (c02er != null ? c02er.hashCode() : 0)) * 37;
        C027T c027t = this.acl_info;
        int iHashCode92 = (iHashCode91 + (c027t != null ? c027t.hashCode() : 0)) * 37;
        C544602Ai c544602Ai = this.anchor_info;
        int iHashCode93 = (iHashCode92 + (c544602Ai != null ? c544602Ai.hashCode() : 0)) * 37;
        C726102sV c726102sV = this.vpa_info;
        int iHashCode94 = (iHashCode93 + (c726102sV != null ? c726102sV.hashCode() : 0)) * 37;
        C549102Cb c549102Cb = this.cny_info;
        int iHashCode95 = (iHashCode94 + (c549102Cb != null ? c549102Cb.hashCode() : 0)) * 37;
        Boolean bool11 = this.is_familiar;
        int iHashCode96 = (iHashCode95 + (bool11 != null ? bool11.hashCode() : 0)) * 37;
        Boolean bool12 = this.need_vs_entry;
        int iHashCode97 = (iHashCode96 + (bool12 != null ? bool12.hashCode() : 0)) * 37;
        AnonymousClass0287 anonymousClass0287 = this.cell_room;
        int iHashCode98 = (iHashCode97 + (anonymousClass0287 != null ? anonymousClass0287.hashCode() : 0)) * 37;
        String str26 = this.live_reason;
        int iHashCode99 = (iHashCode98 + (str26 != null ? str26.hashCode() : 0)) * 37;
        String str27 = this.video_feed_tag;
        int iHashCode100 = (iHashCode99 + (str27 != null ? str27.hashCode() : 0)) * 37;
        C02AY c02ay = this.mask_info;
        int iHashCode101 = (iHashCode100 + (c02ay != null ? c02ay.hashCode() : 0)) * 37;
        C02CB c02cb = this.link_match;
        int iHashCode102 = (iHashCode101 + (c02cb != null ? c02cb.hashCode() : 0)) * 37;
        C02B6 c02b6 = this.video_reply_info;
        int iHashCode103 = (((((iHashCode102 + (c02b6 != null ? c02b6.hashCode() : 0)) * 37) + this.anchors.hashCode()) * 37) + this.hybrid_label.hashCode()) * 37;
        C556302Ev c556302Ev = this.relation_recommend_info;
        int iHashCode104 = (iHashCode103 + (c556302Ev != null ? c556302Ev.hashCode() : 0)) * 37;
        C665102if c665102if = this.user_profile_init_info;
        int iHashCode105 = (iHashCode104 + (c665102if != null ? c665102if.hashCode() : 0)) * 37;
        Boolean bool13 = this.with_survey;
        int iHashCode106 = (iHashCode105 + (bool13 != null ? bool13.hashCode() : 0)) * 37;
        C544302Af c544302Af2 = this.dou_discount_mix_info;
        int iHashCode107 = (iHashCode106 + (c544302Af2 != null ? c544302Af2.hashCode() : 0)) * 37;
        C027T c027t2 = this.aweme_acl;
        int iHashCode108 = (iHashCode107 + (c027t2 != null ? c027t2.hashCode() : 0)) * 37;
        C02GB c02gb = this.activity;
        int iHashCode109 = (iHashCode108 + (c02gb != null ? c02gb.hashCode() : 0)) * 37;
        C2226971CEd c2226971CEd = this.story_group;
        int iHashCode110 = (iHashCode109 + (c2226971CEd != null ? c2226971CEd.hashCode() : 0)) * 37;
        Integer num17 = this.is_story;
        int iHashCode111 = (iHashCode110 + (num17 != null ? num17.hashCode() : 0)) * 37;
        C2251241D9m c2251241D9m = this.vs_entry;
        int iHashCode112 = (iHashCode111 + (c2251241D9m != null ? c2251241D9m.hashCode() : 0)) * 37;
        Integer num18 = this.item_stitch;
        int iHashCode113 = (iHashCode112 + (num18 != null ? num18.hashCode() : 0)) * 37;
        C2226281CBm c2226281CBm = this.cloud_game;
        int iHashCode114 = (iHashCode113 + (c2226281CBm != null ? c2226281CBm.hashCode() : 0)) * 37;
        Boolean bool14 = this.show_sticker_guide;
        int iHashCode115 = (iHashCode114 + (bool14 != null ? bool14.hashCode() : 0)) * 37;
        Integer num19 = this.story_ttl;
        int iHashCode116 = (iHashCode115 + (num19 != null ? num19.hashCode() : 0)) * 37;
        Boolean bool15 = this.is_horizontal;
        int iHashCode117 = (((iHashCode116 + (bool15 != null ? bool15.hashCode() : 0)) * 37) + this.geofencing_regions.hashCode()) * 37;
        String str28 = this.city;
        int iHashCode118 = (iHashCode117 + (str28 != null ? str28.hashCode() : 0)) * 37;
        C02C6 c02c6 = this.mutual_relation_tmp;
        int iHashCode119 = (iHashCode118 + (c02c6 != null ? c02c6.hashCode() : 0)) * 37;
        String str29 = this.anchors_extras;
        int iHashCode120 = (iHashCode119 + (str29 != null ? str29.hashCode() : 0)) * 37;
        Boolean bool16 = this.allow_gift;
        int iHashCode121 = (iHashCode120 + (bool16 != null ? bool16.hashCode() : 0)) * 37;
        C02C6 c02c62 = this.mutual_relation;
        int iHashCode122 = (((iHashCode121 + (c02c62 != null ? c02c62.hashCode() : 0)) * 37) + this.mask_infos.hashCode()) * 37;
        C618002b4 c618002b4 = this.boost_tag_info;
        int iHashCode123 = (iHashCode122 + (c618002b4 != null ? c618002b4.hashCode() : 0)) * 37;
        C02UP c02up = this.bottom_bar;
        int iHashCode124 = (iHashCode123 + (c02up != null ? c02up.hashCode() : 0)) * 37;
        C608702Yz c608702Yz = this.playlist_info;
        int iHashCode125 = (iHashCode124 + (c608702Yz != null ? c608702Yz.hashCode() : 0)) * 37;
        Integer num20 = this.sound_exemption;
        int iHashCode126 = (iHashCode125 + (num20 != null ? num20.hashCode() : 0)) * 37;
        C1CAO c1cao = this.stitch;
        int iHashCode127 = (iHashCode126 + (c1cao != null ? c1cao.hashCode() : 0)) * 37;
        Boolean bool17 = this.playlist_blocked;
        int iHashCode128 = (iHashCode127 + (bool17 != null ? bool17.hashCode() : 0)) * 37;
        String str30 = this.part_n;
        int iHashCode129 = (((iHashCode128 + (str30 != null ? str30.hashCode() : 0)) * 37) + this.green_screen_materials.hashCode()) * 37;
        C732502tX c732502tX = this.stitch_permission;
        int iHashCode130 = (iHashCode129 + (c732502tX != null ? c732502tX.hashCode() : 0)) * 37;
        C02CP c02cp = this.trending_bar;
        int iHashCode131 = (iHashCode130 + (c02cp != null ? c02cp.hashCode() : 0)) * 37;
        AnonymousClass0242 anonymousClass0242 = this.user_story;
        int iHashCode132 = (iHashCode131 + (anonymousClass0242 != null ? anonymousClass0242.hashCode() : 0)) * 37;
        C595302Tv c595302Tv = this.story_metadata;
        int iHashCode133 = (iHashCode132 + (c595302Tv != null ? c595302Tv.hashCode() : 0)) * 37;
        C544402Ag c544402Ag = this.interact_permission;
        int iHashCode134 = (iHashCode133 + (c544402Ag != null ? c544402Ag.hashCode() : 0)) * 37;
        String str31 = this.item_distribute_source;
        int iHashCode135 = (((iHashCode134 + (str31 != null ? str31.hashCode() : 0)) * 37) + this.question_list.hashCode()) * 37;
        C02BA c02ba = this.audio;
        int iHashCode136 = (iHashCode135 + (c02ba != null ? c02ba.hashCode() : 0)) * 37;
        C5411028z c5411028z = this.upvote_reason;
        int iHashCode137 = (iHashCode136 + (c5411028z != null ? c5411028z.hashCode() : 0)) * 37;
        Integer num21 = this.deduplication_type;
        int iHashCode138 = (iHashCode137 + (num21 != null ? num21.hashCode() : 0)) * 37;
        C02C3 c02c3 = this.interaction_tag_info;
        int iHashCode139 = (iHashCode138 + (c02c3 != null ? c02c3.hashCode() : 0)) * 37;
        String str32 = this.content_desc;
        int iHashCode140 = (((iHashCode139 + (str32 != null ? str32.hashCode() : 0)) * 37) + this.content_desc_extra.hashCode()) * 37;
        C621102bZ c621102bZ = this.duet_info;
        int iHashCode141 = (iHashCode140 + (c621102bZ != null ? c621102bZ.hashCode() : 0)) * 37;
        String str33 = this.extra_info;
        int iHashCode142 = (iHashCode141 + (str33 != null ? str33.hashCode() : 0)) * 37;
        Integer num22 = this.item_source_category;
        int iHashCode143 = (iHashCode142 + (num22 != null ? num22.hashCode() : 0)) * 37;
        Boolean bool18 = this.enable_pos_adjust;
        int iHashCode144 = (iHashCode143 + (bool18 != null ? bool18.hashCode() : 0)) * 37;
        Boolean bool19 = this.enable_ad_drop;
        int iHashCode145 = (iHashCode144 + (bool19 != null ? bool19.hashCode() : 0)) * 37;
        Integer num23 = this.pred_playtime;
        int iHashCode146 = (((iHashCode145 + (num23 != null ? num23.hashCode() : 0)) * 37) + this.gap_list.hashCode()) * 37;
        Boolean bool20 = this.is_client_cache;
        int iHashCode147 = (iHashCode146 + (bool20 != null ? bool20.hashCode() : 0)) * 37;
        Long l4 = this.follow_up_publish_from_id;
        int iHashCode148 = (iHashCode147 + (l4 != null ? l4.hashCode() : 0)) * 37;
        C02CO c02co = this.trending_bar_fyp;
        int iHashCode149 = (iHashCode148 + (c02co != null ? c02co.hashCode() : 0)) * 37;
        C546302Az c546302Az = this.music_dsp_info;
        int iHashCode150 = (iHashCode149 + (c546302Az != null ? c546302Az.hashCode() : 0)) * 37;
        Boolean bool21 = this.disable_search_trending_bar;
        int iHashCode151 = (iHashCode150 + (bool21 != null ? bool21.hashCode() : 0)) * 37;
        C026X c026x = this.image_post_info;
        int iHashCode152 = (iHashCode151 + (c026x != null ? c026x.hashCode() : 0)) * 37;
        C552202Dg c552202Dg = this.suggest_words;
        int iHashCode153 = (iHashCode152 + (c552202Dg != null ? c552202Dg.hashCode() : 0)) * 37;
        C619202bG c619202bG = this.GroupIdList;
        int iHashCode154 = (iHashCode153 + (c619202bG != null ? c619202bG.hashCode() : 0)) * 37;
        String str34 = this.commercial_video_info;
        int iHashCode155 = (iHashCode154 + (str34 != null ? str34.hashCode() : 0)) * 37;
        Boolean bool22 = this.allow_reuse_original_sound;
        int iHashCode156 = (iHashCode155 + (bool22 != null ? bool22.hashCode() : 0)) * 37;
        Integer num24 = this.music_begin_time_in_ms;
        int iHashCode157 = (iHashCode156 + (num24 != null ? num24.hashCode() : 0)) * 37;
        Integer num25 = this.music_end_time_in_ms;
        int iHashCode158 = (iHashCode157 + (num25 != null ? num25.hashCode() : 0)) * 37;
        Integer num26 = this.retry_type;
        int iHashCode159 = (iHashCode158 + (num26 != null ? num26.hashCode() : 0)) * 37;
        C668402jC c668402jC = this.upvote_preload;
        int iHashCode160 = (iHashCode159 + (c668402jC != null ? c668402jC.hashCode() : 0)) * 37;
        C620502bT c620502bT = this.commerce_rerank_info;
        int iHashCode161 = (iHashCode160 + (c620502bT != null ? c620502bT.hashCode() : 0)) * 37;
        C627802ce c627802ce = this.share_to_story_info;
        int iHashCode162 = (iHashCode161 + (c627802ce != null ? c627802ce.hashCode() : 0)) * 37;
        C02CW c02cw = this.ad_story_video;
        int iHashCode163 = (iHashCode162 + (c02cw != null ? c02cw.hashCode() : 0)) * 37;
        C620202bQ c620202bQ = this.nearby_info;
        int iHashCode164 = (((iHashCode163 + (c620202bQ != null ? c620202bQ.hashCode() : 0)) * 37) + this.branded_content_accounts.hashCode()) * 37;
        C5436029y c5436029y = this.rec_reason;
        int iHashCode165 = (iHashCode164 + (c5436029y != null ? c5436029y.hashCode() : 0)) * 37;
        Boolean bool23 = this.should_add_creator_tts_watermark_when_downloading;
        int iHashCode166 = (iHashCode165 + (bool23 != null ? bool23.hashCode() : 0)) * 37;
        C5225021v c5225021v = this.poi_data;
        int iHashCode167 = (iHashCode166 + (c5225021v != null ? c5225021v.hashCode() : 0)) * 37;
        Boolean bool24 = this.is_description_translatable;
        int iHashCode168 = (iHashCode167 + (bool24 != null ? bool24.hashCode() : 0)) * 37;
        C5215021l c5215021l = this.now_posts;
        int iHashCode169 = (iHashCode168 + (c5215021l != null ? c5215021l.hashCode() : 0)) * 37;
        C5281023z c5281023z = this.podcast_info;
        int iHashCode170 = (iHashCode169 + (c5281023z != null ? c5281023z.hashCode() : 0)) * 37;
        String str35 = this.follow_up_first_item_id;
        int iHashCode171 = (iHashCode170 + (str35 != null ? str35.hashCode() : 0)) * 37;
        String str36 = this.follow_up_item_id_groups;
        int iHashCode172 = (iHashCode171 + (str36 != null ? str36.hashCode() : 0)) * 37;
        Integer num27 = this.story_type;
        int iHashCode173 = (iHashCode172 + (num27 != null ? num27.hashCode() : 0)) * 37;
        Boolean bool25 = this.is_text_sticker_translatable;
        int iHashCode174 = (iHashCode173 + (bool25 != null ? bool25.hashCode() : 0)) * 37;
        String str37 = this.text_sticker_major_lang;
        int iHashCode175 = (iHashCode174 + (str37 != null ? str37.hashCode() : 0)) * 37;
        C02E6 c02e6 = this.ttm_info;
        int iHashCode176 = (iHashCode175 + (c02e6 != null ? c02e6.hashCode() : 0)) * 37;
        C02S8 c02s8 = this.edit_post_permission;
        int iHashCode177 = (iHashCode176 + (c02s8 != null ? c02s8.hashCode() : 0)) * 37;
        C02D8 c02d8 = this.original_client_text;
        int iHashCode178 = (iHashCode177 + (c02d8 != null ? c02d8.hashCode() : 0)) * 37;
        String str38 = this.music_selected_from;
        int iHashCode179 = (((((((((iHashCode178 + (str38 != null ? str38.hashCode() : 0)) * 37) + this.tts_voice_ids.hashCode()) * 37) + this.reference_tts_voice_ids.hashCode()) * 37) + this.voice_filter_ids.hashCode()) * 37) + this.reference_voice_filter_ids.hashCode()) * 37;
        Integer num28 = this.music_title_style;
        int iHashCode180 = (iHashCode179 + (num28 != null ? num28.hashCode() : 0)) * 37;
        C550802Cs c550802Cs = this.promote;
        int iHashCode181 = (iHashCode180 + (c550802Cs != null ? c550802Cs.hashCode() : 0)) * 37;
        C626302cP c626302cP = this.animated_image_info;
        int iHashCode182 = (iHashCode181 + (c626302cP != null ? c626302cP.hashCode() : 0)) * 37;
        C5214021k c5214021k = this.comment_config;
        int iHashCode183 = (iHashCode182 + (c5214021k != null ? c5214021k.hashCode() : 0)) * 37;
        String str39 = this.survey_key;
        int iHashCode184 = (iHashCode183 + (str39 != null ? str39.hashCode() : 0)) * 37;
        String str40 = this.trans_params;
        int iHashCode185 = (iHashCode184 + (str40 != null ? str40.hashCode() : 0)) * 37;
        C551602Da c551602Da = this.animated_btn;
        int iHashCode186 = (((iHashCode185 + (c551602Da != null ? c551602Da.hashCode() : 0)) * 37) + this.survey_info.hashCode()) * 37;
        C5199020v c5199020v2 = this.added_sound_music_info;
        int iHashCode187 = (iHashCode186 + (c5199020v2 != null ? c5199020v2.hashCode() : 0)) * 37;
        String str41 = this.origin_volume;
        int iHashCode188 = (iHashCode187 + (str41 != null ? str41.hashCode() : 0)) * 37;
        String str42 = this.music_volume;
        int iHashCode189 = (iHashCode188 + (str42 != null ? str42.hashCode() : 0)) * 37;
        Boolean bool26 = this.support_danmaku;
        int iHashCode190 = (iHashCode189 + (bool26 != null ? bool26.hashCode() : 0)) * 37;
        Boolean bool27 = this.has_danmaku;
        int iHashCode191 = (iHashCode190 + (bool27 != null ? bool27.hashCode() : 0)) * 37;
        C5425029n c5425029n = this.real_survey_info;
        int iHashCode192 = (iHashCode191 + (c5425029n != null ? c5425029n.hashCode() : 0)) * 37;
        C02CI c02ci = this.card;
        int iHashCode193 = (iHashCode192 + (c02ci != null ? c02ci.hashCode() : 0)) * 37;
        C552402Di c552402Di = this.ttec_suggest_words;
        int iHashCode194 = (iHashCode193 + (c552402Di != null ? c552402Di.hashCode() : 0)) * 37;
        Integer num29 = this.content_original_type;
        int iHashCode195 = (iHashCode194 + (num29 != null ? num29.hashCode() : 0)) * 37;
        String str43 = this.shoot_tab_name;
        int iHashCode196 = (iHashCode195 + (str43 != null ? str43.hashCode() : 0)) * 37;
        String str44 = this.content_type;
        int iHashCode197 = (iHashCode196 + (str44 != null ? str44.hashCode() : 0)) * 37;
        Integer num30 = this.content_size_type;
        int iHashCode198 = (iHashCode197 + (num30 != null ? num30.hashCode() : 0)) * 37;
        Boolean bool28 = this.is_tiktok_story;
        int iHashCode199 = (iHashCode198 + (bool28 != null ? bool28.hashCode() : 0)) * 37;
        Boolean bool29 = this.is_sub_only_video;
        int iHashCode200 = (iHashCode199 + (bool29 != null ? bool29.hashCode() : 0)) * 37;
        Boolean bool30 = this.is_nff_or_nr;
        int iHashCode201 = (iHashCode200 + (bool30 != null ? bool30.hashCode() : 0)) * 37;
        C5186020i c5186020i2 = this.podcast_full_episode_item;
        int iHashCode202 = (iHashCode201 + (c5186020i2 != null ? c5186020i2.hashCode() : 0)) * 37;
        Float f = this.parameterized_speed;
        int iHashCode203 = (((iHashCode202 + (f != null ? f.hashCode() : 0)) * 37) + this.operator_boost_info.hashCode()) * 37;
        Boolean bool31 = this.filter_unfriendly_user_comments;
        int iHashCode204 = (iHashCode203 + (bool31 != null ? bool31.hashCode() : 0)) * 37;
        Boolean bool32 = this.filter_stranger_comments;
        int iHashCode205 = (iHashCode204 + (bool32 != null ? bool32.hashCode() : 0)) * 37;
        Boolean bool33 = this.is_story_to_normal;
        int iHashCode206 = (iHashCode205 + (bool33 != null ? bool33.hashCode() : 0)) * 37;
        C02DQ c02dq = this.fake_landscape_video_info;
        int iHashCode207 = (iHashCode206 + (c02dq != null ? c02dq.hashCode() : 0)) * 37;
        String str45 = this.main_arch_common;
        int iHashCode208 = (iHashCode207 + (str45 != null ? str45.hashCode() : 0)) * 37;
        String str46 = this.batch_id;
        int iHashCode209 = (iHashCode208 + (str46 != null ? str46.hashCode() : 0)) * 37;
        Integer num31 = this.batch_index;
        int iHashCode210 = (iHashCode209 + (num31 != null ? num31.hashCode() : 0)) * 37;
        C687002mC c687002mC = this.aigc_info;
        int iHashCode211 = (iHashCode210 + (c687002mC != null ? c687002mC.hashCode() : 0)) * 37;
        Integer num32 = this.ttt_product_recall_type;
        int iHashCode212 = (iHashCode211 + (num32 != null ? num32.hashCode() : 0)) * 37;
        C02W5 c02w5 = this.related_live;
        int iHashCode213 = (iHashCode212 + (c02w5 != null ? c02w5.hashCode() : 0)) * 37;
        Integer num33 = this.share_story_status;
        int iHashCode214 = (iHashCode213 + (num33 != null ? num33.hashCode() : 0)) * 37;
        C02US c02us = this.add_yours_recommendation;
        int iHashCode215 = (((((iHashCode214 + (c02us != null ? c02us.hashCode() : 0)) * 37) + this.banners.hashCode()) * 37) + this.picked_users.hashCode()) * 37;
        C02AT c02at = this.standard_component_info;
        int iHashCode216 = (iHashCode215 + (c02at != null ? c02at.hashCode() : 0)) * 37;
        Boolean bool34 = this.is_comment_post_video;
        int iHashCode217 = (iHashCode216 + (bool34 != null ? bool34.hashCode() : 0)) * 37;
        C667502j3 c667502j3 = this.comment_post_video;
        int iHashCode218 = (iHashCode217 + (c667502j3 != null ? c667502j3.hashCode() : 0)) * 37;
        Integer num34 = this.has_promote_entry;
        int iHashCode219 = (iHashCode218 + (num34 != null ? num34.hashCode() : 0)) * 37;
        String str47 = this.promote_toast;
        int iHashCode220 = (iHashCode219 + (str47 != null ? str47.hashCode() : 0)) * 37;
        String str48 = this.promote_toast_key;
        int iHashCode221 = (iHashCode220 + (str48 != null ? str48.hashCode() : 0)) * 37;
        C600902Vz c600902Vz = this.share_operation_info;
        int iHashCode222 = (iHashCode221 + (c600902Vz != null ? c600902Vz.hashCode() : 0)) * 37;
        Boolean bool35 = this.show_quick_dm_box;
        int iHashCode223 = (iHashCode222 + (bool35 != null ? bool35.hashCode() : 0)) * 37;
        Boolean bool36 = this.is_title_translatable;
        int iHashCode224 = (iHashCode223 + (bool36 != null ? bool36.hashCode() : 0)) * 37;
        String str49 = this.title_language;
        int iHashCode225 = (iHashCode224 + (str49 != null ? str49.hashCode() : 0)) * 37;
        C02C4 c02c4 = this.upvote_info;
        int iHashCode226 = (iHashCode225 + (c02c4 != null ? c02c4.hashCode() : 0)) * 37;
        C667802j6 c667802j6 = this.share_to_video_info;
        int iHashCode227 = (((iHashCode226 + (c667802j6 != null ? c667802j6.hashCode() : 0)) * 37) + this.comment_topbar_info.hashCode()) * 37;
        Double d = this.user_affinity_score;
        int iHashCode228 = (iHashCode227 + (d != null ? d.hashCode() : 0)) * 37;
        String str50 = this.music_promo_id;
        int iHashCode229 = (iHashCode228 + (str50 != null ? str50.hashCode() : 0)) * 37;
        Integer num35 = this.music_retriever_flag;
        int iHashCode230 = (iHashCode229 + (num35 != null ? num35.hashCode() : 0)) * 37;
        C610002Zm c610002Zm = this.content_model;
        int iHashCode231 = (iHashCode230 + (c610002Zm != null ? c610002Zm.hashCode() : 0)) * 37;
        C663702iR c663702iR = this.creation_info;
        int iHashCode232 = (((iHashCode231 + (c663702iR != null ? c663702iR.hashCode() : 0)) * 37) + this.interactive_rec_hit_instructions.hashCode()) * 37;
        Integer num36 = this.market_sub_type;
        int iHashCode233 = (iHashCode232 + (num36 != null ? num36.hashCode() : 0)) * 37;
        Integer num37 = this.market_drop_strategy;
        int iHashCode234 = (iHashCode233 + (num37 != null ? num37.hashCode() : 0)) * 37;
        C02GU c02gu = this.collab_info;
        int iHashCode235 = (iHashCode234 + (c02gu != null ? c02gu.hashCode() : 0)) * 37;
        Integer num38 = this.title_limited_rows;
        int iHashCode236 = (iHashCode235 + (num38 != null ? num38.hashCode() : 0)) * 37;
        C028C c028c = this.text_consumption_info;
        int iHashCode237 = (iHashCode236 + (c028c != null ? c028c.hashCode() : 0)) * 37;
        C02E9 c02e9 = this.music_promo_tag_info;
        int iHashCode238 = (iHashCode237 + (c02e9 != null ? c02e9.hashCode() : 0)) * 37;
        C557702Fj c557702Fj = this.rec_reason_tag;
        int iHashCode239 = (((iHashCode238 + (c557702Fj != null ? c557702Fj.hashCode() : 0)) * 37) + this.live_room_stats_tag.hashCode()) * 37;
        C713502qT c713502qT = this.moments_mode_info;
        int iHashCode240 = (iHashCode239 + (c713502qT != null ? c713502qT.hashCode() : 0)) * 37;
        C02C5 c02c5 = this.music_fusion_info;
        int iHashCode241 = (iHashCode240 + (c02c5 != null ? c02c5.hashCode() : 0)) * 37;
        C027M c027m = this.story_note_info;
        int iHashCode242 = (iHashCode241 + (c027m != null ? c027m.hashCode() : 0)) * 37;
        String str51 = this.promote_icon_text;
        int iHashCode243 = (iHashCode242 + (str51 != null ? str51.hashCode() : 0)) * 37;
        Boolean bool37 = this.used_full_song;
        int iHashCode244 = (iHashCode243 + (bool37 != null ? bool37.hashCode() : 0)) * 37;
        String str52 = this.on_device_ml_features;
        int iHashCode245 = (iHashCode244 + (str52 != null ? str52.hashCode() : 0)) * 37;
        C02UD c02ud = this.realtime_fcp_config;
        int iHashCode246 = (iHashCode245 + (c02ud != null ? c02ud.hashCode() : 0)) * 37;
        C02DH c02dh = this.interactive_rec_match_info;
        int iHashCode247 = (iHashCode246 + (c02dh != null ? c02dh.hashCode() : 0)) * 37;
        C666302ir c666302ir = this.add_yours_info;
        int iHashCode248 = (iHashCode247 + (c666302ir != null ? c666302ir.hashCode() : 0)) * 37;
        C5410028y c5410028y = this.internal_share;
        int iHashCode249 = (iHashCode248 + (c5410028y != null ? c5410028y.hashCode() : 0)) * 37;
        Boolean bool38 = this.is_paid_content;
        int iHashCode250 = (iHashCode249 + (bool38 != null ? bool38.hashCode() : 0)) * 37;
        C021E c021e = this.paid_content_info;
        int iHashCode251 = (iHashCode250 + (c021e != null ? c021e.hashCode() : 0)) * 37;
        C559202Fy c559202Fy = this.music_discovery_info;
        int iHashCode252 = (iHashCode251 + (c559202Fy != null ? c559202Fy.hashCode() : 0)) * 37;
        String str53 = this.ocean_group_info;
        int iHashCode253 = (iHashCode252 + (str53 != null ? str53.hashCode() : 0)) * 37;
        C669002jI c669002jI = this.similar_video_info;
        int iHashCode254 = (iHashCode253 + (c669002jI != null ? c669002jI.hashCode() : 0)) * 37;
        C5313025f c5313025f = this.c2pa_info;
        int iHashCode255 = (iHashCode254 + (c5313025f != null ? c5313025f.hashCode() : 0)) * 37;
        C666602iu c666602iu = this.video_mention_info;
        int iHashCode256 = (iHashCode255 + (c666602iu != null ? c666602iu.hashCode() : 0)) * 37;
        Boolean bool39 = this.use_aweme_cache;
        int iHashCode257 = (iHashCode256 + (bool39 != null ? bool39.hashCode() : 0)) * 37;
        C2223211Bzr c2223211Bzr = this.abroll;
        int iHashCode258 = (iHashCode257 + (c2223211Bzr != null ? c2223211Bzr.hashCode() : 0)) * 37;
        Boolean bool40 = this.has_ever_advertised;
        int iHashCode259 = (iHashCode258 + (bool40 != null ? bool40.hashCode() : 0)) * 37;
        C02SM c02sm = this.live_extra_info_struct;
        int iHashCode260 = (iHashCode259 + (c02sm != null ? c02sm.hashCode() : 0)) * 37;
        C559402Ga c559402Ga = this.prompt_result;
        int iHashCode261 = (iHashCode260 + (c559402Ga != null ? c559402Ga.hashCode() : 0)) * 37;
        Long l5 = this.time_portal;
        int iHashCode262 = (iHashCode261 + (l5 != null ? l5.hashCode() : 0)) * 37;
        Boolean bool41 = this.is_streaks_post;
        int iHashCode263 = (iHashCode262 + (bool41 != null ? bool41.hashCode() : 0)) * 37;
        C667202j0 c667202j0 = this.streaks_meta;
        int iHashCode264 = (iHashCode263 + (c667202j0 != null ? c667202j0.hashCode() : 0)) * 37;
        C670502jX c670502jX = this.celebration_metadata;
        int iHashCode265 = (iHashCode264 + (c670502jX != null ? c670502jX.hashCode() : 0)) * 37;
        Integer num39 = this.consumption_recall;
        int iHashCode266 = (iHashCode265 + (num39 != null ? num39.hashCode() : 0)) * 37;
        Integer num40 = this.is_high_consumption_val;
        int iHashCode267 = (((iHashCode266 + (num40 != null ? num40.hashCode() : 0)) * 37) + this.quick_reply_emojis.hashCode()) * 37;
        C02H7 c02h7 = this.new_user_recommended_reason;
        int iHashCode268 = (iHashCode267 + (c02h7 != null ? c02h7.hashCode() : 0)) * 37;
        AnonymousClass0243 anonymousClass0243 = this.visual_search_info;
        int iHashCode269 = (iHashCode268 + (anonymousClass0243 != null ? anonymousClass0243.hashCode() : 0)) * 37;
        C550202Cm c550202Cm = this.template_config;
        int iHashCode270 = (((iHashCode269 + (c550202Cm != null ? c550202Cm.hashCode() : 0)) * 37) + this.search_info_struct.hashCode()) * 37;
        C673702k3 c673702k3 = this.social_interaction_blob;
        int iHashCode271 = (iHashCode270 + (c673702k3 != null ? c673702k3.hashCode() : 0)) * 37;
        C674002k6 c674002k6 = this.solaria_profile;
        int iHashCode272 = (iHashCode271 + (c674002k6 != null ? c674002k6.hashCode() : 0)) * 37;
        Boolean bool42 = this.is_social_fresh_content;
        int iHashCode273 = (iHashCode272 + (bool42 != null ? bool42.hashCode() : 0)) * 37;
        Boolean bool43 = this.convert_to_fyp_card;
        int iHashCode274 = (iHashCode273 + (bool43 != null ? bool43.hashCode() : 0)) * 37;
        Long l6 = this.convert_to_fyp_card_expire_time;
        int iHashCode275 = (iHashCode274 + (l6 != null ? l6.hashCode() : 0)) * 37;
        Boolean bool44 = this.is_unconsumed_resuse;
        int iHashCode276 = (iHashCode275 + (bool44 != null ? bool44.hashCode() : 0)) * 37;
        C653802gq c653802gq = this.meme_reg_info;
        int iHashCode277 = (iHashCode276 + (c653802gq != null ? c653802gq.hashCode() : 0)) * 37;
        C626002cM c626002cM = this.onboarding_survey;
        int iHashCode278 = (iHashCode277 + (c626002cM != null ? c626002cM.hashCode() : 0)) * 37;
        C02D4 c02d4 = this.desc_title_translated_text;
        int iHashCode279 = (iHashCode278 + (c02d4 != null ? c02d4.hashCode() : 0)) * 37;
        C5225021v c5225021v2 = this.outflow_poi_data;
        int iHashCode280 = (iHashCode279 + (c5225021v2 != null ? c5225021v2.hashCode() : 0)) * 37;
        C632402dO c632402dO = this.layout_info;
        int iHashCode281 = (iHashCode280 + (c632402dO != null ? c632402dO.hashCode() : 0)) * 37;
        C669302jL c669302jL = this.golden_cache_config;
        int iHashCode282 = (iHashCode281 + (c669302jL != null ? c669302jL.hashCode() : 0)) * 37;
        C596802Uk c596802Uk = this.moderation_aigc_info;
        int iHashCode283 = (iHashCode282 + (c596802Uk != null ? c596802Uk.hashCode() : 0)) * 37;
        C700102oJ c700102oJ = this.landscape_video;
        int iHashCode284 = (iHashCode283 + (c700102oJ != null ? c700102oJ.hashCode() : 0)) * 37;
        C02UA c02ua = this.smart_search_info;
        int iHashCode285 = (iHashCode284 + (c02ua != null ? c02ua.hashCode() : 0)) * 37;
        String str54 = this.survey_tags;
        int iHashCode286 = (iHashCode285 + (str54 != null ? str54.hashCode() : 0)) * 37;
        C556202Eu c556202Eu = this.ttec_search_growth_info;
        int iHashCode287 = (iHashCode286 + (c556202Eu != null ? c556202Eu.hashCode() : 0)) * 37;
        C02LL c02ll = this.tns_ue_feed_info;
        int iHashCode288 = (iHashCode287 + (c02ll != null ? c02ll.hashCode() : 0)) * 37;
        C02SS c02ss = this.local_service_info;
        int iHashCode289 = (iHashCode288 + (c02ss != null ? c02ss.hashCode() : 0)) * 37;
        C1CCK c1cck = this.ai_info;
        int iHashCode290 = (((iHashCode289 + (c1cck != null ? c1cck.hashCode() : 0)) * 37) + this.declaration_info.hashCode()) * 37;
        C02FN c02fn = this.ai_alive_info;
        int iHashCode291 = (iHashCode290 + (c02fn != null ? c02fn.hashCode() : 0)) * 37;
        C027K c027k = this.imagine_sticker_info;
        int iHashCode292 = (iHashCode291 + (c027k != null ? c027k.hashCode() : 0)) * 37;
        C664802ic c664802ic = this.tako_bubble_info;
        int iHashCode293 = (iHashCode292 + (c664802ic != null ? c664802ic.hashCode() : 0)) * 37;
        C1CCQ c1ccq = this.creator_ai_comment;
        int iHashCode294 = (iHashCode293 + (c1ccq != null ? c1ccq.hashCode() : 0)) * 37;
        Boolean bool45 = this.is_spark_plus;
        int iHashCode295 = (iHashCode294 + (bool45 != null ? bool45.hashCode() : 0)) * 37;
        C668102j9 c668102j9 = this.personalized_survey_ui;
        int iHashCode296 = (iHashCode295 + (c668102j9 != null ? c668102j9.hashCode() : 0)) * 37;
        C687402mG c687402mG = this.brand_safety_info;
        int iHashCode297 = (iHashCode296 + (c687402mG != null ? c687402mG.hashCode() : 0)) * 37;
        C02E1 c02e1 = this.translated_video;
        int iHashCode298 = (iHashCode297 + (c02e1 != null ? c02e1.hashCode() : 0)) * 37;
        C674902kF c674902kF = this.psp_info;
        int iHashCode299 = (((iHashCode298 + (c674902kF != null ? c674902kF.hashCode() : 0)) * 37) + this.ic_asset_info.hashCode()) * 37;
        C5296024o c5296024o = this.ai_theater_info;
        int iHashCode300 = (iHashCode299 + (c5296024o != null ? c5296024o.hashCode() : 0)) * 37;
        C666902ix c666902ix = this.comment_at_tako_info;
        int iHashCode301 = (iHashCode300 + (c666902ix != null ? c666902ix.hashCode() : 0)) * 37;
        C027Z c027z = this.ai_remix_info;
        int iHashCode302 = (iHashCode301 + (c027z != null ? c027z.hashCode() : 0)) * 37;
        Integer num41 = this.item_allow_ai_remix;
        int iHashCode303 = (iHashCode302 + (num41 != null ? num41.hashCode() : 0)) * 37;
        C02VC c02vc = this.poi_trace;
        int iHashCode304 = (iHashCode303 + (c02vc != null ? c02vc.hashCode() : 0)) * 37;
        C655602h8 c655602h8 = this.detail_lynx_card_info;
        int iHashCode305 = (iHashCode304 + (c655602h8 != null ? c655602h8.hashCode() : 0)) * 37;
        C622602bo c622602bo = this.personalized_onboarding_survey;
        int iHashCode306 = (iHashCode305 + (c622602bo != null ? c622602bo.hashCode() : 0)) * 37;
        C661502i5 c661502i5 = this.offline_video_info;
        int iHashCode307 = (iHashCode306 + (c661502i5 != null ? c661502i5.hashCode() : 0)) * 37;
        AnonymousClass0267 anonymousClass0267 = this.ai_portrait_info;
        int iHashCode308 = (iHashCode307 + (anonymousClass0267 != null ? anonymousClass0267.hashCode() : 0)) * 37;
        C739002ua c739002ua = this.ai_chat_meta;
        int iHashCode309 = iHashCode308 + (c739002ua != null ? c739002ua.hashCode() : 0);
        this.hashCode = iHashCode309;
        return iHashCode309;
    }
}
