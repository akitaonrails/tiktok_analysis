package X;

import android.view.View;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;

/* JADX INFO: renamed from: X.0Sup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736530Sup {
    public final /* synthetic */ DetailPageComponent LIZ;

    public C736530Sup(DetailPageComponent detailPageComponent) {
        this.LIZ = detailPageComponent;
    }

    public final void LIZ(float f) {
        View view;
        View view2;
        DetailPageComponent detailPageComponent = this.LIZ;
        IFeedCleanAbility iFeedCleanAbility = detailPageComponent.LLLIIII;
        int i = 0;
        if (iFeedCleanAbility == null || !iFeedCleanAbility.pM2()) {
            CommentService.LIZ.getClass();
            if ((!C523420Kfs.LIZ().LLFFF(detailPageComponent.Vo()) || !C1616490sAR.LIZIZ(detailPageComponent.LLLFFI) || !C274420ApE.LIZ()) && (view = detailPageComponent.LLJJ) != null) {
                C786410Ut5.T4(view, f);
            }
        }
        C01GW<C0RGG> c01gw = C0RGG.LJ;
        if (!C586380MzE.LIZ().LIZIZ(detailPageComponent.LLJJL.getEventType()) && (view2 = detailPageComponent.LLJJ) != null) {
            if (f <= 0.0f) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
    }
}
