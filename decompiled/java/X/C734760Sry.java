package X;

import com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel;

/* JADX INFO: renamed from: X.0Sry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734760Sry implements C05KM {
    public final /* synthetic */ FeedRightBtnBaseViewModel<S> LIZ;

    public C734760Sry(FeedRightBtnBaseViewModel<S> feedRightBtnBaseViewModel) {
        this.LIZ = feedRightBtnBaseViewModel;
    }

    @Override // X.C05KM
    public final void LIZ(boolean z) {
        FeedRightBtnBaseViewModel<S> feedRightBtnBaseViewModel = this.LIZ;
        feedRightBtnBaseViewModel.forceHideTextFlag = !z;
        feedRightBtnBaseViewModel.onForceHideTextFlagChange();
    }
}
