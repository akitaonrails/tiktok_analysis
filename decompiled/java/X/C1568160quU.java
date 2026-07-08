package X;

import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;

/* JADX INFO: renamed from: X.0quU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568160quU implements InterfaceC1568180quW {
    public final /* synthetic */ LoadMorePanelComponentTempHelper LIZ;

    public C1568160quU(LoadMorePanelComponentTempHelper loadMorePanelComponentTempHelper) {
        this.LIZ = loadMorePanelComponentTempHelper;
    }

    @Override // X.InterfaceC1568180quW
    public final void LIZ() {
        C19EG activity = this.LIZ.LL.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
