package X;

import com.ss.android.ugc.aweme.feed.api.BaseControllerContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;

/* JADX INFO: renamed from: X.0Syx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C739090Syx implements InterfaceC1167830gUn {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ BaseListFragmentPanel LIZJ;

    @Override // X.InterfaceC1167830gUn
    public final void LIZ(int i, boolean z) {
        this.LIZJ.R();
        if (z) {
            BaseListFragmentPanel baseListFragmentPanel = this.LIZJ;
            BaseControllerContext baseControllerContext = baseListFragmentPanel.LLLJIL;
            if (baseControllerContext instanceof InterfaceC739430SzV) {
                ((InterfaceC739430SzV) baseControllerContext).LJLLLL(baseListFragmentPanel.activity, this.LIZ, "", "", baseListFragmentPanel.C7(true), this.LIZIZ);
            }
            this.LIZJ.LLJJIJI.setDisableScroll(false);
            return;
        }
        C1233040iBy c1233040iBy = new C1233040iBy(this.LIZJ.getContext());
        c1233040iBy.LIZIZ(2131834213);
        c1233040iBy.LIZLLL();
    }

    public C739090Syx(BaseListFragmentPanel baseListFragmentPanel, Aweme aweme, String str) {
        this.LIZJ = baseListFragmentPanel;
        this.LIZ = aweme;
        this.LIZIZ = str;
    }
}
