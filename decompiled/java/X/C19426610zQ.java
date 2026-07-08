package X;

import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10zQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19426610zQ extends C09AY implements Function1<ProfileNaviEditorState, ProfileNaviEditorState> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19426610zQ(String str, int i) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
        ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
        return profileNaviEditorState2.copy(profileNaviEditorState2.tabList, profileNaviEditorState2.currentTabIndex, profileNaviEditorState2.parentCategoryList, C19427810zc.LIZ(this.LLILLJJLI, 66667, this.LL), profileNaviEditorState2.sceneStickerPath, profileNaviEditorState2.scanStickerPath, profileNaviEditorState2.editCategory, profileNaviEditorState2.naviDoneLoading, profileNaviEditorState2.isQuitEditing, profileNaviEditorState2.isScanEffectLoaded, profileNaviEditorState2.isSceneEffectLoaded, profileNaviEditorState2.hasEdited, profileNaviEditorState2.fromAutoCreation, profileNaviEditorState2.isHeadLoaded, profileNaviEditorState2.fps, profileNaviEditorState2.currentProfileNaviSelectable);
    }
}
