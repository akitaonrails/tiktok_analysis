package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.aikit.api.create.MentionService;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.mention.RecommendMentionAndPrompt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Lgo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549480Lgo implements C0DV5<C549480Lgo> {
    public MentionService LL;
    public C549510Lgr LLILLJJLI;
    public C553840Lnq LLILLL;
    public C550000Lhe<String> LLILZ;
    public C550000Lhe<List<InputBlock>> LLILZIL;
    public C550000Lhe<List<MentionDataItem>> LLILZLL;
    public C550000Lhe<Map<MentionDataItem, MentionDataItem>> LLIZ;
    public C550000Lhe<List<MentionDataItem>> LLIZLLLIL;
    public C550000Lhe<String> LLJ;
    public C550000Lhe<Boolean> LLJI;
    public LiveData<InterfaceC549270LgT> LLJIJIL;
    public List<C551340Ljo> LLJILJIL;
    public C550000Lhe<InterfaceC551380Ljs> LLJILJILJ;
    public C550000Lhe<Boolean> LLJILLL;
    public C550000Lhe<Boolean> LLJJ;
    public LiveData<RecommendMentionAndPrompt> LLJJI;

    @Override // X.C0DV5
    public C549480Lgo build() {
        return this;
    }

    public C549480Lgo() {
        C546890Lcd.LIZ.getClass();
        this.LL = C546890Lcd.LIZJ();
        this.LLILLJJLI = new C549510Lgr();
        this.LLILLL = new C553840Lnq();
        this.LLJI = new C550000Lhe<>(AFwS194S0000000_8.get$arr$(63));
        this.LLJILLL = new C550000Lhe<>(AFwS194S0000000_8.get$arr$(65));
        this.LLJJ = new C550000Lhe<>(AFwS194S0000000_8.get$arr$(64));
    }

    @Override // X.C0DV5
    public /* bridge */ /* synthetic */ C0DV5 build() {
        build();
        return this;
    }

    public final C549510Lgr getAlbumConfig$tools_ai_uikit_df_release() {
        return this.LLILLJJLI;
    }

    public final C550000Lhe<Boolean> getCameoMenuEnable$tools_ai_uikit_df_release() {
        return this.LLJI;
    }

    public final List<C551340Ljo> getEllipsisMenuItems$tools_ai_uikit_df_release() {
        return this.LLJILJIL;
    }

    public final C550000Lhe<Boolean> getEnableEmptySearchRefresh$tools_ai_uikit_df_release() {
        return this.LLJJ;
    }

    public final C550000Lhe<Boolean> getEnableSearchPagination$tools_ai_uikit_df_release() {
        return this.LLJILLL;
    }

    public final C550000Lhe<List<MentionDataItem>> getInitFollowPathUserInfos$tools_ai_uikit_df_release() {
        return this.LLILZLL;
    }

    public final C550000Lhe<List<InputBlock>> getInitInputBlocks$tools_ai_uikit_df_release() {
        return this.LLILZIL;
    }

    public final C550000Lhe<String> getInitMediaPath$tools_ai_uikit_df_release() {
        return this.LLILZ;
    }

    public final C550000Lhe<Map<MentionDataItem, MentionDataItem>> getInitUserSwitchInfos$tools_ai_uikit_df_release() {
        return this.LLIZ;
    }

    public final C550000Lhe<List<MentionDataItem>> getInsertItemList$tools_ai_uikit_df_release() {
        return this.LLIZLLLIL;
    }

    public final C553840Lnq getMentionEditConfig$tools_ai_uikit_df_release() {
        return this.LLILLL;
    }

    public final C550000Lhe<String> getMentionListLeftTopText$tools_ai_uikit_df_release() {
        return this.LLJ;
    }

    public final MentionService getMentionService$tools_ai_uikit_df_release() {
        return this.LL;
    }

    public final LiveData<RecommendMentionAndPrompt> getRecommendMentionResultLiveData$tools_ai_uikit_df_release() {
        return this.LLJJI;
    }

    public final C550000Lhe<InterfaceC551380Ljs> getRestQuotaProvider$tools_ai_uikit_df_release() {
        return this.LLJILJILJ;
    }

    public final LiveData<InterfaceC549270LgT> getSelfCameoStatusLiveData$tools_ai_uikit_df_release() {
        return this.LLJIJIL;
    }

    public final C549480Lgo albumConfig(C549510Lgr c549510Lgr) {
        this.LLILLJJLI = c549510Lgr;
        return this;
    }

    public final C549480Lgo cameoStatusLiveData(LiveData<InterfaceC549270LgT> liveData) {
        this.LLJIJIL = liveData;
        return this;
    }

    public final C549480Lgo ellipsisMenuItems(List<C551340Ljo> list) {
        this.LLJILJIL = list;
        return this;
    }

    public final C549480Lgo enableCameoMenu(C550000Lhe<Boolean> c550000Lhe) {
        this.LLJI = c550000Lhe;
        return this;
    }

    public final C549480Lgo enableEmptySearchRefresh(C550000Lhe<Boolean> c550000Lhe) {
        this.LLJJ = c550000Lhe;
        return this;
    }

    public final C549480Lgo enableSearchPagination(C550000Lhe<Boolean> c550000Lhe) {
        this.LLJILLL = c550000Lhe;
        return this;
    }

    public final C549480Lgo forceInsertRecommendItems(C550000Lhe<List<MentionDataItem>> c550000Lhe) {
        this.LLIZLLLIL = c550000Lhe;
        return this;
    }

    public final C549480Lgo initFollowPathUserInfo(C550000Lhe<List<MentionDataItem>> c550000Lhe) {
        this.LLILZLL = c550000Lhe;
        return this;
    }

    public final C549480Lgo initInputBlocks(C550000Lhe<List<InputBlock>> c550000Lhe) {
        this.LLILZIL = c550000Lhe;
        return this;
    }

    public final C549480Lgo initMediaPath(C550000Lhe<String> c550000Lhe) {
        this.LLILZ = c550000Lhe;
        return this;
    }

    public final C549480Lgo initUserSwitchInfos(C550000Lhe<Map<MentionDataItem, MentionDataItem>> c550000Lhe) {
        this.LLIZ = c550000Lhe;
        return this;
    }

    public final C549480Lgo mentionConfig(C553840Lnq c553840Lnq) {
        this.LLILLL = c553840Lnq;
        return this;
    }

    public final C549480Lgo mentionListLeftTopText(C550000Lhe<String> c550000Lhe) {
        this.LLJ = c550000Lhe;
        return this;
    }

    public final C549480Lgo mentionService(MentionService mentionService) {
        this.LL = mentionService;
        return this;
    }

    public final C549480Lgo recommendMentionResultLiveData(LiveData<RecommendMentionAndPrompt> liveData) {
        this.LLJJI = liveData;
        return this;
    }

    public final C549480Lgo restQuotaProvider(C550000Lhe<InterfaceC551380Ljs> c550000Lhe) {
        this.LLJILJILJ = c550000Lhe;
        return this;
    }

    public final void setAlbumConfig$tools_ai_uikit_df_release(C549510Lgr c549510Lgr) {
        this.LLILLJJLI = c549510Lgr;
    }

    public final void setCameoMenuEnable$tools_ai_uikit_df_release(C550000Lhe<Boolean> c550000Lhe) {
        this.LLJI = c550000Lhe;
    }

    public final void setEllipsisMenuItems$tools_ai_uikit_df_release(List<C551340Ljo> list) {
        this.LLJILJIL = list;
    }

    public final void setEnableEmptySearchRefresh$tools_ai_uikit_df_release(C550000Lhe<Boolean> c550000Lhe) {
        this.LLJJ = c550000Lhe;
    }

    public final void setEnableSearchPagination$tools_ai_uikit_df_release(C550000Lhe<Boolean> c550000Lhe) {
        this.LLJILLL = c550000Lhe;
    }

    public final void setInitFollowPathUserInfos$tools_ai_uikit_df_release(C550000Lhe<List<MentionDataItem>> c550000Lhe) {
        this.LLILZLL = c550000Lhe;
    }

    public final void setInitInputBlocks$tools_ai_uikit_df_release(C550000Lhe<List<InputBlock>> c550000Lhe) {
        this.LLILZIL = c550000Lhe;
    }

    public final void setInitMediaPath$tools_ai_uikit_df_release(C550000Lhe<String> c550000Lhe) {
        this.LLILZ = c550000Lhe;
    }

    public final void setInitUserSwitchInfos$tools_ai_uikit_df_release(C550000Lhe<Map<MentionDataItem, MentionDataItem>> c550000Lhe) {
        this.LLIZ = c550000Lhe;
    }

    public final void setInsertItemList$tools_ai_uikit_df_release(C550000Lhe<List<MentionDataItem>> c550000Lhe) {
        this.LLIZLLLIL = c550000Lhe;
    }

    public final void setMentionEditConfig$tools_ai_uikit_df_release(C553840Lnq c553840Lnq) {
        this.LLILLL = c553840Lnq;
    }

    public final void setMentionListLeftTopText$tools_ai_uikit_df_release(C550000Lhe<String> c550000Lhe) {
        this.LLJ = c550000Lhe;
    }

    public final void setMentionService$tools_ai_uikit_df_release(MentionService mentionService) {
        this.LL = mentionService;
    }

    public final void setRecommendMentionResultLiveData$tools_ai_uikit_df_release(LiveData<RecommendMentionAndPrompt> liveData) {
        this.LLJJI = liveData;
    }

    public final void setRestQuotaProvider$tools_ai_uikit_df_release(C550000Lhe<InterfaceC551380Ljs> c550000Lhe) {
        this.LLJILJILJ = c550000Lhe;
    }

    public final void setSelfCameoStatusLiveData$tools_ai_uikit_df_release(LiveData<InterfaceC549270LgT> liveData) {
        this.LLJIJIL = liveData;
    }
}
