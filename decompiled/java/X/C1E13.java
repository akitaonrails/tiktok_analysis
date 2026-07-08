package X;

import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarState;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1E13, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E13 extends C09AY implements Function1<EditToolbarState, EditToolbarState> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1E13(int i, String str) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final EditToolbarState invoke(EditToolbarState editToolbarState) {
        EditToolbarState editToolbarState2 = editToolbarState;
        return editToolbarState2.copy(editToolbarState2.ui, editToolbarState2.backVisible, editToolbarState2.backTipVisible, editToolbarState2.backTipText, editToolbarState2.hideMoreEvent, editToolbarState2.chooseMusicText, editToolbarState2.chooseMusicIcon, editToolbarState2.topMargin, editToolbarState2.bottomHeight, editToolbarState2.refresh, editToolbarState2.iconAnimation, new C1644450stX<>(new Pair(Integer.valueOf(this.LL), this.LLILLJJLI)), editToolbarState2.autoEnhanceStatus, editToolbarState2.marginValue, editToolbarState2.chooseMusicIconRes, editToolbarState2.aiLiveState, editToolbarState2.actionWithItemPositionEvent, editToolbarState2.aiCaptionOn, editToolbarState2.soundSyncOn, editToolbarState2.livePhotoPreviewMode, editToolbarState2.makeItemVisibleOnCollapsed, editToolbarState2.showPromote, editToolbarState2.hidePromote, editToolbarState2.iconRes, editToolbarState2.iconColor);
    }
}
