package X;

import android.text.TextUtils;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoMobFiller;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m2E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380760m2E implements InterfaceC1282004zy {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;
    public final String LLJJI;
    public final String LLJJIII;
    public final String LLJJIJI;
    public final String LLJJIJIIJIL;
    public final Aweme LLJJIJIL;
    public final String LLJJJ;
    public final HashMap<String, String> LLJJJIL;
    public final String LLJJJJ;
    public final String LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public final Integer LLJL;
    public String LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public String LLJLLIL;
    public String LLJLLL;

    public C1380760m2E() {
        throw null;
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1380760m2E)) {
            return false;
        }
        C1380760m2E c1380760m2E = (C1380760m2E) obj;
        return Intrinsics.LJFF(this.LL, c1380760m2E.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1380760m2E.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1380760m2E.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1380760m2E.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1380760m2E.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1380760m2E.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1380760m2E.LLIZ) && this.LLIZLLLIL == c1380760m2E.LLIZLLLIL && this.LLJ == c1380760m2E.LLJ && Intrinsics.LJFF(this.LLJI, c1380760m2E.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1380760m2E.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1380760m2E.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1380760m2E.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1380760m2E.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1380760m2E.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1380760m2E.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1380760m2E.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c1380760m2E.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c1380760m2E.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c1380760m2E.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c1380760m2E.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c1380760m2E.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c1380760m2E.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c1380760m2E.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, c1380760m2E.LLJJJJLIIL) && Intrinsics.LJFF(this.LLJJL, c1380760m2E.LLJJL) && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c1380760m2E.LLJJLIIIJLLLLLLLZ) && Intrinsics.LJFF(this.LLJL, c1380760m2E.LLJL) && Intrinsics.LJFF(this.LLJLIL, c1380760m2E.LLJLIL) && Intrinsics.LJFF(this.LLJLILLLLZIIL, c1380760m2E.LLJLILLLLZIIL) && Intrinsics.LJFF(this.LLJLL, c1380760m2E.LLJLL) && Intrinsics.LJFF(this.LLJLLIL, c1380760m2E.LLJLLIL) && Intrinsics.LJFF(this.LLJLLL, c1380760m2E.LLJLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL) * 31) + this.LLJ) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31) + this.LLJILLL.hashCode()) * 31) + this.LLJJ.hashCode()) * 31;
        String str = this.LLJJI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLJJIII;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJJIJI;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJJIJIIJIL;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LLJJIJIL.hashCode()) * 31;
        String str5 = this.LLJJJ;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        HashMap<String, String> map = this.LLJJJIL;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str6 = this.LLJJJJ;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLJJJJJIL;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LLJJJJLIIL;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LLJJL;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LLJJLIIIJLLLLLLLZ;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num = this.LLJL;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str11 = this.LLJLIL;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.LLJLILLLLZIIL;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.LLJLL;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.LLJLLIL;
        return ((iHashCode16 + (str14 != null ? str14.hashCode() : 0)) * 31) + this.LLJLLL.hashCode();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("author_id", this.LL);
        linkedHashMap.put("download_type", this.LLILLJJLI);
        linkedHashMap.put("panel_source", this.LLILLL);
        linkedHashMap.put("retry_time", this.LLILZ);
        linkedHashMap.put("impr_type", this.LLILZIL);
        linkedHashMap.put("is_reposted", this.LLILZLL);
        linkedHashMap.put("from_group_id", this.LLIZ);
        linkedHashMap.put("is_landscape_screen", Integer.valueOf(this.LLIZLLLIL));
        linkedHashMap.put("is_sub_only_video", Integer.valueOf(this.LLJ));
        linkedHashMap.put("is_save_with_watermark", this.LLJI);
        linkedHashMap.put("enter_position", this.LLJIJIL);
        linkedHashMap.put("aigc_theme_status", this.LLJILJIL);
        linkedHashMap.put("music_name", this.LLJILJILJ);
        linkedHashMap.put("music_id", this.LLJILLL);
        linkedHashMap.put("compilation_id", this.LLJJ);
        linkedHashMap.put("action_on", this.LLJJI);
        linkedHashMap.put("tt_template_type", this.LLJJIII);
        linkedHashMap.put("tt_template_id", this.LLJJIJI);
        linkedHashMap.put("camera_use_function", this.LLJJJJ);
        linkedHashMap.put("redistribute_reason", this.LLJJJJJIL);
        linkedHashMap.put("query_id", this.LLJJJJLIIL);
        linkedHashMap.put("recalled_query", this.LLJJL);
        linkedHashMap.put("recalled_query_search_ts", this.LLJJLIIIJLLLLLLLZ);
        linkedHashMap.put("is_same_music_supply_detail_page", this.LLJL);
        linkedHashMap.put("followup_square_action_position", this.LLJLIL);
        linkedHashMap.put("is_from_followup_square_original_video", this.LLJLILLLLZIIL);
        linkedHashMap.put("followup_square_recommend_type", this.LLJLL);
        linkedHashMap.put("followup_square_recommend_reason", this.LLJLLIL);
        linkedHashMap.put("meta_song_id", this.LLJLLL);
        return linkedHashMap;
    }

    public final String toString() {
        return "DownloadEventExtraParamsGroup(authorID=" + this.LL + ", downloadType=" + this.LLILLJJLI + ", panelSource=" + this.LLILLL + ", retryTime=" + this.LLILZ + ", imprType=" + this.LLILZIL + ", isReposeted=" + this.LLILZLL + ", fromGroupID=" + this.LLIZ + ", isLandscapeScreen=" + this.LLIZLLLIL + ", isSubOnlyVideo=" + this.LLJ + ", isSaveWithWatermark=" + this.LLJI + ", enterPosition=" + this.LLJIJIL + ", aigcThemeStatus=" + this.LLJILJIL + ", musicName=" + this.LLJILJILJ + ", musicId=" + this.LLJILLL + ", compilationID=" + this.LLJJ + ", actionOn=" + this.LLJJI + ", ttTemplateType=" + this.LLJJIII + ", ttTemplateId=" + this.LLJJIJI + ", newsID=" + this.LLJJIJIIJIL + ", aweme=" + this.LLJJIJIL + ", enterFrom=" + this.LLJJJ + ", inboxLogExtraMap=" + this.LLJJJIL + ", cameraUseFunction=" + this.LLJJJJ + ", redistributeReason=" + this.LLJJJJJIL + ", queryId=" + this.LLJJJJLIIL + ", recalledQuery=" + this.LLJJL + ", recalledQuerySearchTS=" + this.LLJJLIIIJLLLLLLLZ + ", isSameMusicSupplyDetailPage=" + this.LLJL + ", followupSquareActionPosition=" + this.LLJLIL + ", isFromFollowupSquareOriginalVideo=" + this.LLJLILLLLZIIL + ", followupSquareRecommendType=" + this.LLJLL + ", followupSquareRecommendReason=" + this.LLJLLIL + ", metaSongId=" + this.LLJLLL + ')';
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        HashMap map = new HashMap();
        map.putAll(keyParams());
        String str = this.LLJJIJIIJIL;
        if (str != null && str.length() != 0) {
            map.put("news_id", this.LLJJIJIIJIL);
        }
        FypAutoScrollService fypAutoScrollService = (FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class);
        String str2 = this.LLJJJ;
        if (str2 == null) {
            str2 = "";
        }
        if (fypAutoScrollService.LJIIZILJ(str2)) {
            map.put("play_mode", ((FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class)).LJI());
        }
        if (AwemeExtKt.getRepostFromGroupId(this.LLJJIJIL) != null || AwemeExtKt.getRepostFromUserId(this.LLJJIJIL) != null) {
            map.put("author_id", AwemeExtKt.getRepostFromUserId(this.LLJJIJIL));
            map.put("repost_from_group_id", this.LLJJIJIL.getAid());
            map.put("repost_from_user_id", AwemeExtKt.getAuthorUid(this.LLJJIJIL));
            map.put("is_reposted", "1");
        }
        if (C735370Ssx.LJJIJL(this.LLJJJ)) {
            if (!TextUtils.equals(this.LLJJJ, "homepage_fresh")) {
                TextUtils.equals(this.LLJJJ, "homepage_channel");
            }
            map.put("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(this.LLJJIJIL)));
        }
        String str3 = this.LLJJI;
        if (str3 == null || str3.length() == 0) {
            map.remove("action_on");
        }
        return map;
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        C1380790m2H c1380790m2H;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1357130lQ7.LIZIZ(c2344009Gk, "download", this.LLJJJIL);
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        C734780Ss0.LIZ(c2344009Gk, null, C0SUC.LIZ(abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LIZIZ() : null));
        C1612650s4F.LIZIZ(c2344009Gk, this.LLJJIJIL);
        C1357660lQy.LJI(c2344009Gk, this.LLJJIJIL);
        C1357660lQy.LJIIIIZZ(c2344009Gk, this.LLJJIJIL);
        C1357660lQy.LIZLLL(c2344009Gk, this.LLJJIJIL);
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "Download", C1380790m2H.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (c1380790m2H = (C1380790m2H) interfaceC1555100qZQLIZIZ.getSource()) != null) {
            for (Map.Entry<String, String> entry : TakoAIVideoMobFiller.toParams(c1380790m2H.LLILLJJLI, c1380790m2H.LLILLL, c1380790m2H.LLILZ).entrySet()) {
                c2344009Gk.LJFF(entry.getKey(), entry.getValue());
            }
        }
        C1893310zMv.LIZIZ.LJI(PageFinder.via(BtmSDK.INSTANCE.getCurrentResumedPage()), c2344009Gk, "download");
        return c2344009Gk.LIZ;
    }

    public C1380760m2E(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Aweme aweme, String str17, HashMap map, String str18, String str19) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = CardStruct.IStatusCode.DEFAULT;
        this.LLIZ = str6;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
        this.LLJI = str7;
        this.LLJIJIL = str8;
        this.LLJILJIL = str9;
        this.LLJILJILJ = str10;
        this.LLJILLL = str11;
        this.LLJJ = str12;
        this.LLJJI = str13;
        this.LLJJIII = str14;
        this.LLJJIJI = str15;
        this.LLJJIJIIJIL = str16;
        this.LLJJIJIL = aweme;
        this.LLJJJ = str17;
        this.LLJJJIL = map;
        this.LLJJJJ = str18;
        this.LLJJJJJIL = str19;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        this.LLJLLIL = null;
        this.LLJLLL = "";
    }
}
