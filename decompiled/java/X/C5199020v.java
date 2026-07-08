package X;

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

/* JADX INFO: renamed from: X.020v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5199020v extends Message<C5199020v, C02MI> {
    public static final ProtoAdapter<C5199020v> ADAPTER = new ProtoAdapter<C5199020v>() { // from class: X.020u
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5199020v decode(ProtoReader protoReader) {
            C5199020v c5199020v = new C5199020v();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5199020v.id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c5199020v.id_str = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5199020v.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5199020v.author = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5199020v.album = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5199020v.cover_hd = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5199020v.cover_large = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5199020v.cover_medium = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5199020v.cover_thumb = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5199020v.play_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5199020v.schema_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5199020v.source_platform = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5199020v.start_time = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            c5199020v.end_time = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            c5199020v.duration = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            c5199020v.extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5199020v.user_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5199020v.position.add(C559902Gf.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            c5199020v.share_info = C5271023p.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5199020v.collect_stat = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 21:
                            c5199020v.status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 22:
                            c5199020v.offline_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            c5199020v.effects_data = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c5199020v.owner_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 25:
                            c5199020v.owner_nickname = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 26:
                            c5199020v.use_count_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 27:
                            c5199020v.audio_track = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 28:
                            c5199020v.bodydance_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 29:
                            c5199020v.bodydance_challenge = C021F.ADAPTER.decode(protoReader);
                            break;
                        case 30:
                            c5199020v.is_original = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 31:
                            c5199020v.challenge = C021F.ADAPTER.decode(protoReader);
                            break;
                        case 32:
                            c5199020v.billboard_rank = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            c5199020v.mid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            c5199020v.bodydance_challenge_id = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 35:
                            c5199020v.binded_challenge_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            c5199020v.redirect = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 37:
                            c5199020v.is_restricted = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 38:
                            c5199020v.author_deleted = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 39:
                            c5199020v.is_del_video = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 40:
                            c5199020v.is_video_self_see = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 41:
                            c5199020v.owner_handle = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 42:
                            c5199020v.author_position.add(C559902Gf.ADAPTER.decode(protoReader));
                            break;
                        case 43:
                            c5199020v.prevent_download = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 44:
                            c5199020v.music_billboard_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 45:
                            c5199020v.music_billboard_weekly_info = C757302xX.ADAPTER.decode(protoReader);
                            break;
                        case 46:
                            c5199020v.category_cover_info = C747702vz.ADAPTER.decode(protoReader);
                            break;
                        case 47:
                            c5199020v.is_only_owner_use = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 48:
                            c5199020v.is_video_not_recommend = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 49:
                            c5199020v.strong_beat_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                            c5199020v.unshelve_countries.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 51:
                            c5199020v.prevent_item_download_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 52:
                            c5199020v.external_song_info.add(C02GA.ADAPTER.decode(protoReader));
                            break;
                        case 53:
                            c5199020v.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 54:
                            c5199020v.lyric_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 55:
                            c5199020v.lyric_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 56:
                            c5199020v.avatar_thumb = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 57:
                            c5199020v.avatar_medium = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 58:
                            c5199020v.avatar_large = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 59:
                            c5199020v.preview_start_time = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 60:
                            c5199020v.preview_end_time = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 61:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case BaseNotice.CREATOR /* 62 */:
                            c5199020v.mute_share = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 63:
                            c5199020v.is_author_artist = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 64:
                            c5199020v.is_pgc = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 65:
                            c5199020v.matched_pgc_sound = AnonymousClass0286.ADAPTER.decode(protoReader);
                            break;
                        case 66:
                            c5199020v.matched_song = AnonymousClass0264.ADAPTER.decode(protoReader);
                            break;
                        case 67:
                            c5199020v.is_commerce_music = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 68:
                            c5199020v.artists.add(C5344026k.ADAPTER.decode(protoReader));
                            break;
                        case 69:
                            c5199020v.duration_high_precision = C556602Ey.ADAPTER.decode(protoReader);
                            break;
                        case 70:
                            c5199020v.is_shooting_allow = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 71:
                            c5199020v.ttm_music_info = C572702Ld.ADAPTER.decode(protoReader);
                            break;
                        case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                            c5199020v.music_release_info = C617102av.ADAPTER.decode(protoReader);
                            break;
                        case 73:
                            c5199020v.tt_to_dsp_song_infos.add(C547302Bj.ADAPTER.decode(protoReader));
                            break;
                        case 74:
                            c5199020v.log_extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 75:
                            c5199020v.recommend_status = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 76:
                            c5199020v.meme_song_info = C622302bl.ADAPTER.decode(protoReader);
                            break;
                        case 77:
                            c5199020v.music_fusion_info = C02C5.ADAPTER.decode(protoReader);
                            break;
                        case 78:
                            c5199020v.tt_to_dsp_album_info = C559002Fw.ADAPTER.decode(protoReader);
                            break;
                        case 79:
                            c5199020v.allow_offline_music_to_detail_page = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 80:
                            c5199020v.stripped_music_info = C02F2.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5199020v;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5199020v c5199020v) {
            C5199020v c5199020v2 = c5199020v;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5199020v2.id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c5199020v2.id_str) + protoAdapter2.encodedSizeWithTag(3, c5199020v2.title) + protoAdapter2.encodedSizeWithTag(4, c5199020v2.author) + protoAdapter2.encodedSizeWithTag(5, c5199020v2.album);
            ProtoAdapter<C673002jw> protoAdapter3 = C673002jw.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c5199020v2.cover_hd) + protoAdapter3.encodedSizeWithTag(7, c5199020v2.cover_large) + protoAdapter3.encodedSizeWithTag(8, c5199020v2.cover_medium) + protoAdapter3.encodedSizeWithTag(9, c5199020v2.cover_thumb) + protoAdapter3.encodedSizeWithTag(10, c5199020v2.play_url) + protoAdapter2.encodedSizeWithTag(11, c5199020v2.schema_url);
            ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(12, c5199020v2.source_platform) + protoAdapter4.encodedSizeWithTag(13, c5199020v2.start_time) + protoAdapter4.encodedSizeWithTag(14, c5199020v2.end_time) + protoAdapter4.encodedSizeWithTag(15, c5199020v2.duration) + protoAdapter2.encodedSizeWithTag(16, c5199020v2.extra) + protoAdapter4.encodedSizeWithTag(17, c5199020v2.user_count);
            ProtoAdapter<C559902Gf> protoAdapter5 = C559902Gf.ADAPTER;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + protoAdapter5.asRepeated().encodedSizeWithTag(18, c5199020v2.position) + C5271023p.ADAPTER.encodedSizeWithTag(19, c5199020v2.share_info) + protoAdapter4.encodedSizeWithTag(20, c5199020v2.collect_stat) + protoAdapter4.encodedSizeWithTag(21, c5199020v2.status) + protoAdapter2.encodedSizeWithTag(22, c5199020v2.offline_desc) + protoAdapter3.encodedSizeWithTag(23, c5199020v2.effects_data) + protoAdapter2.encodedSizeWithTag(24, c5199020v2.owner_id) + protoAdapter2.encodedSizeWithTag(25, c5199020v2.owner_nickname) + protoAdapter2.encodedSizeWithTag(26, c5199020v2.use_count_desc) + protoAdapter3.encodedSizeWithTag(27, c5199020v2.audio_track) + protoAdapter3.encodedSizeWithTag(28, c5199020v2.bodydance_url);
            ProtoAdapter<C021F> protoAdapter6 = C021F.ADAPTER;
            int iEncodedSizeWithTag6 = iEncodedSizeWithTag5 + protoAdapter6.encodedSizeWithTag(29, c5199020v2.bodydance_challenge);
            ProtoAdapter<Boolean> protoAdapter7 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag7 = iEncodedSizeWithTag6 + protoAdapter7.encodedSizeWithTag(30, c5199020v2.is_original) + protoAdapter6.encodedSizeWithTag(31, c5199020v2.challenge) + protoAdapter4.encodedSizeWithTag(32, c5199020v2.billboard_rank) + protoAdapter2.encodedSizeWithTag(33, c5199020v2.mid) + protoAdapter3.encodedSizeWithTag(34, c5199020v2.bodydance_challenge_id) + protoAdapter.encodedSizeWithTag(35, c5199020v2.binded_challenge_id) + protoAdapter7.encodedSizeWithTag(36, c5199020v2.redirect) + protoAdapter7.encodedSizeWithTag(37, c5199020v2.is_restricted) + protoAdapter7.encodedSizeWithTag(38, c5199020v2.author_deleted) + protoAdapter7.encodedSizeWithTag(39, c5199020v2.is_del_video) + protoAdapter7.encodedSizeWithTag(40, c5199020v2.is_video_self_see) + protoAdapter2.encodedSizeWithTag(41, c5199020v2.owner_handle) + protoAdapter5.asRepeated().encodedSizeWithTag(42, c5199020v2.author_position) + protoAdapter7.encodedSizeWithTag(43, c5199020v2.prevent_download) + protoAdapter4.encodedSizeWithTag(44, c5199020v2.music_billboard_type) + C757302xX.ADAPTER.encodedSizeWithTag(45, c5199020v2.music_billboard_weekly_info) + C747702vz.ADAPTER.encodedSizeWithTag(46, c5199020v2.category_cover_info) + protoAdapter7.encodedSizeWithTag(47, c5199020v2.is_only_owner_use) + protoAdapter7.encodedSizeWithTag(48, c5199020v2.is_video_not_recommend) + protoAdapter3.encodedSizeWithTag(49, c5199020v2.strong_beat_url) + protoAdapter2.asRepeated().encodedSizeWithTag(50, c5199020v2.unshelve_countries) + protoAdapter4.encodedSizeWithTag(51, c5199020v2.prevent_item_download_status) + C02GA.ADAPTER.asRepeated().encodedSizeWithTag(52, c5199020v2.external_song_info) + protoAdapter2.encodedSizeWithTag(53, c5199020v2.sec_uid) + protoAdapter4.encodedSizeWithTag(54, c5199020v2.lyric_type) + protoAdapter2.encodedSizeWithTag(55, c5199020v2.lyric_url) + protoAdapter3.encodedSizeWithTag(56, c5199020v2.avatar_thumb) + protoAdapter3.encodedSizeWithTag(57, c5199020v2.avatar_medium) + protoAdapter3.encodedSizeWithTag(58, c5199020v2.avatar_large);
            ProtoAdapter<Double> protoAdapter8 = ProtoAdapter.DOUBLE;
            return iEncodedSizeWithTag7 + protoAdapter8.encodedSizeWithTag(59, c5199020v2.preview_start_time) + protoAdapter8.encodedSizeWithTag(60, c5199020v2.preview_end_time) + protoAdapter7.encodedSizeWithTag(62, c5199020v2.mute_share) + protoAdapter7.encodedSizeWithTag(63, c5199020v2.is_author_artist) + protoAdapter7.encodedSizeWithTag(64, c5199020v2.is_pgc) + AnonymousClass0286.ADAPTER.encodedSizeWithTag(65, c5199020v2.matched_pgc_sound) + AnonymousClass0264.ADAPTER.encodedSizeWithTag(66, c5199020v2.matched_song) + protoAdapter7.encodedSizeWithTag(67, c5199020v2.is_commerce_music) + C5344026k.ADAPTER.asRepeated().encodedSizeWithTag(68, c5199020v2.artists) + C556602Ey.ADAPTER.encodedSizeWithTag(69, c5199020v2.duration_high_precision) + protoAdapter7.encodedSizeWithTag(70, c5199020v2.is_shooting_allow) + C572702Ld.ADAPTER.encodedSizeWithTag(71, c5199020v2.ttm_music_info) + C617102av.ADAPTER.encodedSizeWithTag(72, c5199020v2.music_release_info) + C547302Bj.ADAPTER.asRepeated().encodedSizeWithTag(73, c5199020v2.tt_to_dsp_song_infos) + protoAdapter2.encodedSizeWithTag(74, c5199020v2.log_extra) + protoAdapter.encodedSizeWithTag(75, c5199020v2.recommend_status) + C622302bl.ADAPTER.encodedSizeWithTag(76, c5199020v2.meme_song_info) + C02C5.ADAPTER.encodedSizeWithTag(77, c5199020v2.music_fusion_info) + C559002Fw.ADAPTER.encodedSizeWithTag(78, c5199020v2.tt_to_dsp_album_info) + protoAdapter7.encodedSizeWithTag(79, c5199020v2.allow_offline_music_to_detail_page) + C02F2.ADAPTER.encodedSizeWithTag(80, c5199020v2.stripped_music_info) + c5199020v2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5199020v c5199020v) {
            C5199020v c5199020v2 = c5199020v;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c5199020v2.id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c5199020v2.id_str);
            protoAdapter2.encodeWithTag(protoWriter, 3, c5199020v2.title);
            protoAdapter2.encodeWithTag(protoWriter, 4, c5199020v2.author);
            protoAdapter2.encodeWithTag(protoWriter, 5, c5199020v2.album);
            ProtoAdapter<C673002jw> protoAdapter3 = C673002jw.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 6, c5199020v2.cover_hd);
            protoAdapter3.encodeWithTag(protoWriter, 7, c5199020v2.cover_large);
            protoAdapter3.encodeWithTag(protoWriter, 8, c5199020v2.cover_medium);
            protoAdapter3.encodeWithTag(protoWriter, 9, c5199020v2.cover_thumb);
            protoAdapter3.encodeWithTag(protoWriter, 10, c5199020v2.play_url);
            protoAdapter2.encodeWithTag(protoWriter, 11, c5199020v2.schema_url);
            ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
            protoAdapter4.encodeWithTag(protoWriter, 12, c5199020v2.source_platform);
            protoAdapter4.encodeWithTag(protoWriter, 13, c5199020v2.start_time);
            protoAdapter4.encodeWithTag(protoWriter, 14, c5199020v2.end_time);
            protoAdapter4.encodeWithTag(protoWriter, 15, c5199020v2.duration);
            protoAdapter2.encodeWithTag(protoWriter, 16, c5199020v2.extra);
            protoAdapter4.encodeWithTag(protoWriter, 17, c5199020v2.user_count);
            ProtoAdapter<C559902Gf> protoAdapter5 = C559902Gf.ADAPTER;
            protoAdapter5.asRepeated().encodeWithTag(protoWriter, 18, c5199020v2.position);
            C5271023p.ADAPTER.encodeWithTag(protoWriter, 19, c5199020v2.share_info);
            protoAdapter4.encodeWithTag(protoWriter, 20, c5199020v2.collect_stat);
            protoAdapter4.encodeWithTag(protoWriter, 21, c5199020v2.status);
            protoAdapter2.encodeWithTag(protoWriter, 22, c5199020v2.offline_desc);
            protoAdapter3.encodeWithTag(protoWriter, 23, c5199020v2.effects_data);
            protoAdapter2.encodeWithTag(protoWriter, 24, c5199020v2.owner_id);
            protoAdapter2.encodeWithTag(protoWriter, 25, c5199020v2.owner_nickname);
            protoAdapter2.encodeWithTag(protoWriter, 26, c5199020v2.use_count_desc);
            protoAdapter3.encodeWithTag(protoWriter, 27, c5199020v2.audio_track);
            protoAdapter3.encodeWithTag(protoWriter, 28, c5199020v2.bodydance_url);
            ProtoAdapter<C021F> protoAdapter6 = C021F.ADAPTER;
            protoAdapter6.encodeWithTag(protoWriter, 29, c5199020v2.bodydance_challenge);
            ProtoAdapter<Boolean> protoAdapter7 = ProtoAdapter.BOOL;
            protoAdapter7.encodeWithTag(protoWriter, 30, c5199020v2.is_original);
            protoAdapter6.encodeWithTag(protoWriter, 31, c5199020v2.challenge);
            protoAdapter4.encodeWithTag(protoWriter, 32, c5199020v2.billboard_rank);
            protoAdapter2.encodeWithTag(protoWriter, 33, c5199020v2.mid);
            protoAdapter3.encodeWithTag(protoWriter, 34, c5199020v2.bodydance_challenge_id);
            protoAdapter.encodeWithTag(protoWriter, 35, c5199020v2.binded_challenge_id);
            protoAdapter7.encodeWithTag(protoWriter, 36, c5199020v2.redirect);
            protoAdapter7.encodeWithTag(protoWriter, 37, c5199020v2.is_restricted);
            protoAdapter7.encodeWithTag(protoWriter, 38, c5199020v2.author_deleted);
            protoAdapter7.encodeWithTag(protoWriter, 39, c5199020v2.is_del_video);
            protoAdapter7.encodeWithTag(protoWriter, 40, c5199020v2.is_video_self_see);
            protoAdapter2.encodeWithTag(protoWriter, 41, c5199020v2.owner_handle);
            protoAdapter5.asRepeated().encodeWithTag(protoWriter, 42, c5199020v2.author_position);
            protoAdapter7.encodeWithTag(protoWriter, 43, c5199020v2.prevent_download);
            protoAdapter4.encodeWithTag(protoWriter, 44, c5199020v2.music_billboard_type);
            C757302xX.ADAPTER.encodeWithTag(protoWriter, 45, c5199020v2.music_billboard_weekly_info);
            C747702vz.ADAPTER.encodeWithTag(protoWriter, 46, c5199020v2.category_cover_info);
            protoAdapter7.encodeWithTag(protoWriter, 47, c5199020v2.is_only_owner_use);
            protoAdapter7.encodeWithTag(protoWriter, 48, c5199020v2.is_video_not_recommend);
            protoAdapter3.encodeWithTag(protoWriter, 49, c5199020v2.strong_beat_url);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 50, c5199020v2.unshelve_countries);
            protoAdapter4.encodeWithTag(protoWriter, 51, c5199020v2.prevent_item_download_status);
            C02GA.ADAPTER.asRepeated().encodeWithTag(protoWriter, 52, c5199020v2.external_song_info);
            protoAdapter2.encodeWithTag(protoWriter, 53, c5199020v2.sec_uid);
            protoAdapter4.encodeWithTag(protoWriter, 54, c5199020v2.lyric_type);
            protoAdapter2.encodeWithTag(protoWriter, 55, c5199020v2.lyric_url);
            protoAdapter3.encodeWithTag(protoWriter, 56, c5199020v2.avatar_thumb);
            protoAdapter3.encodeWithTag(protoWriter, 57, c5199020v2.avatar_medium);
            protoAdapter3.encodeWithTag(protoWriter, 58, c5199020v2.avatar_large);
            ProtoAdapter<Double> protoAdapter8 = ProtoAdapter.DOUBLE;
            protoAdapter8.encodeWithTag(protoWriter, 59, c5199020v2.preview_start_time);
            protoAdapter8.encodeWithTag(protoWriter, 60, c5199020v2.preview_end_time);
            protoAdapter7.encodeWithTag(protoWriter, 62, c5199020v2.mute_share);
            protoAdapter7.encodeWithTag(protoWriter, 63, c5199020v2.is_author_artist);
            protoAdapter7.encodeWithTag(protoWriter, 64, c5199020v2.is_pgc);
            AnonymousClass0286.ADAPTER.encodeWithTag(protoWriter, 65, c5199020v2.matched_pgc_sound);
            AnonymousClass0264.ADAPTER.encodeWithTag(protoWriter, 66, c5199020v2.matched_song);
            protoAdapter7.encodeWithTag(protoWriter, 67, c5199020v2.is_commerce_music);
            C5344026k.ADAPTER.asRepeated().encodeWithTag(protoWriter, 68, c5199020v2.artists);
            C556602Ey.ADAPTER.encodeWithTag(protoWriter, 69, c5199020v2.duration_high_precision);
            protoAdapter7.encodeWithTag(protoWriter, 70, c5199020v2.is_shooting_allow);
            C572702Ld.ADAPTER.encodeWithTag(protoWriter, 71, c5199020v2.ttm_music_info);
            C617102av.ADAPTER.encodeWithTag(protoWriter, 72, c5199020v2.music_release_info);
            C547302Bj.ADAPTER.asRepeated().encodeWithTag(protoWriter, 73, c5199020v2.tt_to_dsp_song_infos);
            protoAdapter2.encodeWithTag(protoWriter, 74, c5199020v2.log_extra);
            protoAdapter.encodeWithTag(protoWriter, 75, c5199020v2.recommend_status);
            C622302bl.ADAPTER.encodeWithTag(protoWriter, 76, c5199020v2.meme_song_info);
            C02C5.ADAPTER.encodeWithTag(protoWriter, 77, c5199020v2.music_fusion_info);
            C559002Fw.ADAPTER.encodeWithTag(protoWriter, 78, c5199020v2.tt_to_dsp_album_info);
            protoAdapter7.encodeWithTag(protoWriter, 79, c5199020v2.allow_offline_music_to_detail_page);
            C02F2.ADAPTER.encodeWithTag(protoWriter, 80, c5199020v2.stripped_music_info);
            protoWriter.writeBytes(c5199020v2.unknownFields());
        }
    };
    public String album;
    public Boolean allow_offline_music_to_detail_page;
    public List<C5344026k> artists;
    public C673002jw audio_track;
    public String author;
    public Boolean author_deleted;
    public List<C559902Gf> author_position;
    public C673002jw avatar_large;
    public C673002jw avatar_medium;
    public C673002jw avatar_thumb;
    public Integer billboard_rank;
    public Long binded_challenge_id;
    public C021F bodydance_challenge;
    public C673002jw bodydance_challenge_id;
    public C673002jw bodydance_url;
    public C747702vz category_cover_info;
    public C021F challenge;
    public Integer collect_stat;
    public C673002jw cover_hd;
    public C673002jw cover_large;
    public C673002jw cover_medium;
    public C673002jw cover_thumb;
    public Integer duration;
    public C556602Ey duration_high_precision;
    public C673002jw effects_data;
    public Integer end_time;
    public List<C02GA> external_song_info;
    public String extra;
    public Long id;
    public String id_str;
    public Boolean is_author_artist;
    public Boolean is_commerce_music;
    public Boolean is_del_video;
    public Boolean is_only_owner_use;
    public Boolean is_original;
    public Boolean is_pgc;
    public Boolean is_restricted;
    public Boolean is_shooting_allow;
    public Boolean is_video_not_recommend;
    public Boolean is_video_self_see;
    public String log_extra;
    public Integer lyric_type;
    public String lyric_url;
    public AnonymousClass0286 matched_pgc_sound;
    public AnonymousClass0264 matched_song;
    public C622302bl meme_song_info;
    public String mid;
    public Integer music_billboard_type;
    public C757302xX music_billboard_weekly_info;
    public C02C5 music_fusion_info;
    public C617102av music_release_info;
    public Boolean mute_share;
    public String offline_desc;
    public String owner_handle;
    public String owner_id;
    public String owner_nickname;
    public C673002jw play_url;
    public List<C559902Gf> position;
    public Boolean prevent_download;
    public Integer prevent_item_download_status;
    public Double preview_end_time;
    public Double preview_start_time;
    public Long recommend_status;
    public Boolean redirect;
    public String schema_url;
    public String sec_uid;
    public C5271023p share_info;
    public Integer source_platform;
    public Integer start_time;
    public Integer status;
    public C02F2 stripped_music_info;
    public C673002jw strong_beat_url;
    public String title;
    public C559002Fw tt_to_dsp_album_info;
    public List<C547302Bj> tt_to_dsp_song_infos;
    public C572702Ld ttm_music_info;
    public List<String> unshelve_countries;
    public String use_count_desc;
    public Integer user_count;

    public C5199020v() {
        super(ADAPTER, ByteString.EMPTY);
        this.position = C1516540pZE.LJIIIIZZ();
        this.author_position = C1516540pZE.LJIIIIZZ();
        this.unshelve_countries = C1516540pZE.LJIIIIZZ();
        this.external_song_info = C1516540pZE.LJIIIIZZ();
        this.artists = C1516540pZE.LJIIIIZZ();
        this.tt_to_dsp_song_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02MI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
