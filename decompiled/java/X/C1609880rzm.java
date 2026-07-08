package X;

import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;

/* JADX INFO: renamed from: X.0rzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609880rzm implements InterfaceC1609890rzn {
    public final FullFeedFragmentPanel LIZ;
    public boolean LIZIZ;
    public float LIZJ;

    public final int LIZ() {
        return this.LIZ.LJLLJ();
    }

    public C1609880rzm(FullFeedFragmentPanel fullFeedFragmentPanel) {
        this.LIZ = fullFeedFragmentPanel;
        IViewPagerComponentAbility iViewPagerComponentAbility = fullFeedFragmentPanel.LLJJIJIIJIL;
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C0T21() { // from class: X.0rzl
                {
                    super(null);
                }

                @Override // X.C0T21, X.InterfaceC1616070s9l, X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                    C1609880rzm c1609880rzm = this.LLILLJJLI;
                    if (i == c1609880rzm.LIZ.LLJLILLLLZIIL && f > 0.0f) {
                        c1609880rzm.LIZIZ = true;
                        int i3 = (c1609880rzm.LIZJ > 0.0f ? 1 : (c1609880rzm.LIZJ == 0.0f ? 0 : -1));
                    } else if (f == 0.0f) {
                        c1609880rzm.LIZIZ = false;
                    }
                    c1609880rzm.LIZJ = f;
                }

                @Override // X.C0T21, X.InterfaceC1616070s9l
                public final void onPageScrolledEnd(int i, float f, int i2) {
                    C1609880rzm c1609880rzm = this.LLILLJJLI;
                    c1609880rzm.LIZJ = 0.0f;
                    c1609880rzm.LIZIZ = false;
                }
            });
        }
    }
}
