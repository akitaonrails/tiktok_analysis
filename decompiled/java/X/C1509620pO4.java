package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pO4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509620pO4 extends C1509180pNM {
    public static final C1509620pO4 LIZ = new C1509620pO4();
    public static int LIZIZ;

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        FeaturePlayTypeConfig fTypePlay;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypePlay = features.getFTypePlay()) == null || !fTypePlay.getEnable()) {
            return;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_play", 0, 2, null);
        if (producer$default != null) {
            producer$default.enableProducer((List<FeatureItem>) null);
        }
    }

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeaturePlayTypeConfig fTypePlay;
        String aid;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypePlay = features.getFTypePlay()) == null || !fTypePlay.getEnable()) {
            return;
        }
        LIZIZ = fTypePlay.getRange();
        Aweme awemeLIZ = C1511360pQs.LIZ(c1509310pNZ);
        c1509310pNZ.LIZIZ();
        boolean z = c1509310pNZ.LIZLLL;
        if (awemeLIZ != null) {
            aid = awemeLIZ.getAid();
        } else {
            aid = null;
        }
        boolean zContainSubType = fTypePlay.containSubType("event");
        boolean zContainSubType2 = fTypePlay.containSubType("feed");
        boolean zContainSubType3 = fTypePlay.containSubType("play_performance", true);
        try {
            JSONObject jSONObjectLIZ = C1509400pNi.LIZ(fTypePlay.getRange(), aid, fTypePlay.getRangeExcludeThis(), true, false);
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_play", 0, 2, null);
            if (producer$default == null) {
                return;
            }
            String str = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "play_time", "play_time", jSONObjectLIZ, true, str);
            LIZJ(producer$default, c1509310pNZ, "finish", "finish", jSONObjectLIZ, zContainSubType, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "skip", "skip", jSONObjectLIZ, zContainSubType, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "head", "head", jSONObjectLIZ, zContainSubType, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "comment", "comment", jSONObjectLIZ, zContainSubType, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "like", "like", jSONObjectLIZ, zContainSubType, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "dislike", "dislike", jSONObjectLIZ, zContainSubType, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "report", "report", jSONObjectLIZ, zContainSubType, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "music", "music", jSONObjectLIZ, zContainSubType, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "follow", "follow", jSONObjectLIZ, zContainSubType, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "share", "share", jSONObjectLIZ, zContainSubType, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "pause", "pause", jSONObjectLIZ, zContainSubType, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "favorite", "favorite", jSONObjectLIZ, zContainSubType, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "enter_tag", "enter_tag", jSONObjectLIZ, zContainSubType, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "clk_poi", "clk_poi", jSONObjectLIZ, zContainSubType, c1510230pP3.LIZ);
            String str2 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "volume_level", "volume_level", jSONObjectLIZ, true, str2);
            String str3 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "volume_change", "volume_change", jSONObjectLIZ, true, str3);
            String str4 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "volume_label", "volume_label", jSONObjectLIZ, true, str4);
            String str5 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "volume_increase_cnt", "volume_increase_cnt", jSONObjectLIZ, true, str5);
            String str6 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "volume_decrease_cnt", "volume_decrease_cnt", jSONObjectLIZ, true, str6);
            String str7 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "finish_cnt", "finish_cnt", jSONObjectLIZ, true, str7);
            String str8 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "comment_cnt", "comment_cnt", jSONObjectLIZ, true, str8);
            String str9 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "head_cnt", "head_cnt", jSONObjectLIZ, true, str9);
            String str10 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "like_cnt", "like_cnt", jSONObjectLIZ, true, str10);
            String str11 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "dislike_cnt", "dislike_cnt", jSONObjectLIZ, true, str11);
            String str12 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "report_cnt", "report_cnt", jSONObjectLIZ, true, str12);
            String str13 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "follow_cnt", "follow_cnt", jSONObjectLIZ, true, str13);
            String str14 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "music_cnt", "music_cnt", jSONObjectLIZ, true, str14);
            String str15 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "share_cnt", "share_cnt", jSONObjectLIZ, true, str15);
            String str16 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "skip_cnt", "skip_cnt", jSONObjectLIZ, true, str16);
            String str17 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "click_pause_cnt", "click_pause_cnt", jSONObjectLIZ, true, str17);
            String str18 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "favourite_cnt", "favourite_cnt", jSONObjectLIZ, true, str18);
            String str19 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "enter_tag_cnt", "enter_tag_cnt", jSONObjectLIZ, true, str19);
            String str20 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "clk_poi_cnt", "clk_poi_cnt", jSONObjectLIZ, true, str20);
            if (zContainSubType2) {
                String str21 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_type_ad", "type_ad", jSONObjectLIZ, true, str21);
                String str22 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_type_mix", "type_mix", jSONObjectLIZ, true, str22);
                String str23 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_type_live", "type_live", jSONObjectLIZ, true, str23);
                String str24 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_type_photos", "type_photos", jSONObjectLIZ, true, str24);
                String str25 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_type_photo_mode", "type_photo_mode", jSONObjectLIZ, true, str25);
                String str26 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_type_text_mode", "type_text_mode", jSONObjectLIZ, true, str26);
                String str27 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_follow_status", "follow_status", jSONObjectLIZ, true, str27);
                String str28 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_duration", "duration", jSONObjectLIZ, true, str28);
                String str29 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_comment", "all_comment", jSONObjectLIZ, true, str29);
                String str30 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_like", "all_like", jSONObjectLIZ, true, str30);
                String str31 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_share", "all_share", jSONObjectLIZ, true, str31);
                String str32 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_play", "all_play", jSONObjectLIZ, true, str32);
                String str33 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_download", "all_download", jSONObjectLIZ, true, str33);
                String str34 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_forward", "all_forward", jSONObjectLIZ, true, str34);
                String str35 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_favourite", "all_collect", jSONObjectLIZ, true, str35);
                String str36 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "p_create_time", "create_time", jSONObjectLIZ, true, str36);
            }
            if (zContainSubType3) {
                String str37 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "block_count", "block_count", jSONObjectLIZ, true, str37);
                String str38 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "block_duration", "block_duration", jSONObjectLIZ, true, str38);
                String str39 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "start_playing_timestamp", "start_playing_timestamp", jSONObjectLIZ, true, str39);
                String str40 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "first_frame_duration", "first_frame_duration", jSONObjectLIZ, true, str40);
                String str41 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "video_bitrate", "video_bitrate", jSONObjectLIZ, true, str41);
                String str42 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "video_resolution", "video_resolution", jSONObjectLIZ, true, str42);
                String str43 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "is_h265", "is_h265", jSONObjectLIZ, true, str43);
            }
            String str44 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "play_time_min", "play_time_min", jSONObjectLIZ, true, str44);
            String str45 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "play_time_total", "play_time_total", jSONObjectLIZ, true, str45);
            String str46 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "play_time_avg", "play_time_avg", jSONObjectLIZ, true, str46);
            String str47 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "play_time_max", "play_time_max", jSONObjectLIZ, true, str47);
            String str48 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "play_time_mid", "play_time_mid", jSONObjectLIZ, true, str48);
            if (z) {
                String str49 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "aid", "aid", jSONObjectLIZ, true, str49);
            }
            String str50 = c1510230pP3.LIZ;
            getClass();
            LIZJ(producer$default, c1509310pNZ, "aweme_scene", "aweme_scene", null, true, str50);
            if (fTypePlay.containSubType("current")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("aid", aid);
                String str51 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "cur_finish", "cur_finish", jSONObject, true, str51);
                String str52 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "cur_like", "cur_like", jSONObject, true, str52);
                String str53 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "cur_follow", "cur_follow", jSONObject, true, str53);
                String str54 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "cur_favorite", "cur_favorite", jSONObject, true, str54);
                String str55 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "cur_comment", "cur_comment", jSONObject, true, str55);
                String str56 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "cur_pause", "cur_pause", jSONObject, true, str56);
                String str57 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "cur_head", "cur_head", jSONObject, true, str57);
                String str58 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "cur_playtime", "cur_playtime", jSONObject, true, str58);
                String str59 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "cur_music", "cur_music", jSONObject, true, str59);
                String str60 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "cur_gap_time", "cur_gap_time", jSONObject, true, str60);
                String str61 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "cur_playing_progress", "cur_playing_position", null, true, str61);
                String str62 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "cur_play_times", "cur_playing_times", null, true, str62);
                String str63 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "cur_gap_time", "cur_gap_time", jSONObject, true, str63);
                String str64 = c1510230pP3.LIZ;
                getClass();
                LIZJ(producer$default, c1509310pNZ, "cur_playtime_total", "cur_playtime_total", jSONObject, true, str64);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }

    public static Object LIZJ(FeatureProducer featureProducer, C1509310pNZ c1509310pNZ, String str, String str2, JSONObject jSONObject, boolean z, String str3) {
        Object feature$default = FeatureProducer.getFeature$default(featureProducer, str2, jSONObject, str3, (ReturnCode) null, 8, (Object) null);
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        if (feature$default instanceof ArrayList) {
            int i = LIZIZ;
            for (Object obj : (Iterable) feature$default) {
                i--;
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append('_');
                    sbLIZ.append(i);
                    mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ), obj);
                }
            }
            return feature$default;
        }
        if (feature$default == null) {
            return null;
        }
        if (z) {
            mapLIZIZ.put(str, feature$default);
        }
        return feature$default;
    }
}
