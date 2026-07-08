package X;

import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10zS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19426810zS extends C09AY implements Function1<ProfileNaviEditorState, ProfileNaviEditorState> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19426810zS(boolean z, Effect effect, int i) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = effect;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
        ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
        if (this.LL) {
            return profileNaviEditorState2.copy(profileNaviEditorState2.tabList, profileNaviEditorState2.currentTabIndex, profileNaviEditorState2.parentCategoryList, profileNaviEditorState2.currentMessage, profileNaviEditorState2.sceneStickerPath, this.LLILLJJLI.getUnzipPath(), profileNaviEditorState2.editCategory, profileNaviEditorState2.naviDoneLoading, profileNaviEditorState2.isQuitEditing, profileNaviEditorState2.isScanEffectLoaded, true, profileNaviEditorState2.hasEdited, profileNaviEditorState2.fromAutoCreation, profileNaviEditorState2.isHeadLoaded, this.LLILLL, profileNaviEditorState2.currentProfileNaviSelectable);
        }
        return profileNaviEditorState2.copy(profileNaviEditorState2.tabList, profileNaviEditorState2.currentTabIndex, profileNaviEditorState2.parentCategoryList, profileNaviEditorState2.currentMessage, this.LLILLJJLI.getUnzipPath(), profileNaviEditorState2.scanStickerPath, profileNaviEditorState2.editCategory, profileNaviEditorState2.naviDoneLoading, profileNaviEditorState2.isQuitEditing, profileNaviEditorState2.isScanEffectLoaded, true, profileNaviEditorState2.hasEdited, profileNaviEditorState2.fromAutoCreation, profileNaviEditorState2.isHeadLoaded, this.LLILLL, profileNaviEditorState2.currentProfileNaviSelectable);
    }
}
