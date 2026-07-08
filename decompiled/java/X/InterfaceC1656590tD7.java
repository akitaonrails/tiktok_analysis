package X;

import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.SimpleMusic;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0tD7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1656590tD7 {
    @InterfaceC1501200pAU("/tiktok/v1/music/recommend/effect/")
    C11NZ<RecommendMusic> LIZ(@InterfaceC1501120pAM("effect_id") String str, @InterfaceC1501120pAM("resource_id") String str2, @InterfaceC1501120pAM("shoot_way") String str3, @InterfaceC1501120pAM("content_type") String str4, @InterfaceC1501120pAM("content_source") String str5, @InterfaceC1501120pAM("info_sticker_list") String str6, @InterfaceC1501120pAM("mv_id") String str7, @InterfaceC1501120pAM("flash_mob_id") String str8, @InterfaceC1501120pAM("source_text") String str9, @InterfaceC1501120pAM("creation_id") String str10, @InterfaceC1501120pAM("video_duration") Long l, @InterfaceC1501120pAM("recommend_extra") JSONObject jSONObject);

    @InterfaceC1501200pAU("/aweme/v1/music/detail/")
    C11NZ<SimpleMusic> getMusicDetail(@InterfaceC1501120pAM("music_id") String str);
}
