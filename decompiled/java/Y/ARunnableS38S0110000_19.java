package Y;

import X.C036E;
import X.C0J0T;
import X.C1259360isQ;
import X.C1259890itH;
import X.C1C7U;
import X.C300180Bpg;
import X.C844470XAv;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.ProfileBaseAwemeListFragment;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS38S0110000_19 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        RecyclerView recyclerView;
        C1259890itH c1259890itH = (C1259890itH) this.l0;
        if (c1259890itH.LIZIZ == null || (recyclerView = c1259890itH.LIZ) == null || !C0J0T.LIZJ(recyclerView)) {
            return;
        }
        if (this.z1) {
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
                if (!C036E.LIZ.LIZIZ()) {
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C1259890itH c1259890itH2 = (C1259890itH) this.l0;
        c1259890itH2.LIZIZ.LJJIZ(c1259890itH2.LIZ, this.z1);
    }

    public static final void run$0(ARunnableS38S0110000_19 aRunnableS38S0110000_19) {
        boolean zLIZ;
        C1C7U.LIZ("OnCoverPageChangeListener@f682.startDynamicCoverAnimation$1");
        try {
            aRunnableS38S0110000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OnCoverPageChangeListener@f682.startDynamicCoverAnimation$1");
    }

    public static final void run$1(ARunnableS38S0110000_19 aRunnableS38S0110000_19) {
        boolean zLIZ;
        C1259360isQ c1259360isQ;
        C1C7U.LIZ("ProfileBaseAwemeListFragment@d2b.handleHasMore$1");
        try {
            ProfileBaseAwemeListFragment profileBaseAwemeListFragment = (ProfileBaseAwemeListFragment) aRunnableS38S0110000_19.l0;
            C1259360isQ c1259360isQ2 = profileBaseAwemeListFragment.LLJJL;
            if (c1259360isQ2 != null) {
                boolean z = aRunnableS38S0110000_19.z1;
                c1259360isQ2.resetLoadMoreState();
                if (!z && C300180Bpg.LIZ() && (c1259360isQ = profileBaseAwemeListFragment.LLJJL) != null && c1259360isQ.getBasicItemCount() > 0) {
                    c1259360isQ2.LLJJJ = false;
                    c1259360isQ2.setShowFooter(true);
                    c1259360isQ2.setLoadEmptyText(2131838827);
                    c1259360isQ2.showLoadMoreEmpty();
                } else {
                    c1259360isQ2.LLJJJ = z;
                    c1259360isQ2.setShowFooter(z);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileBaseAwemeListFragment@d2b.handleHasMore$1");
    }

    public ARunnableS38S0110000_19(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
