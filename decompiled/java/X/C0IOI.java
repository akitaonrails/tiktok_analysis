package X;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0IOI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0IOI extends PagerAdapter {
    public final FragmentManager LLILLJJLI;
    public C19EH LLILLL;
    public Fragment LLILZ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIII(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable LJJIIJ() {
        return null;
    }

    public C0IOI(FragmentManager fragmentManager) {
        this.LLILLJJLI = fragmentManager;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(ViewGroup viewGroup) {
        C19EH c19eh = this.LLILLL;
        if (c19eh != null) {
            try {
                try {
                    c19eh.LJIIL();
                    this.LLILLJJLI.LJJJJL();
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJFF("FragmentStatePagerAdapt", e.getMessage(), e);
                } catch (NullPointerException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C20441214yg.LJFF("FragmentStatePagerAdapt", e2.getMessage(), e2);
                }
                this.LLILLL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLILLL = null;
                throw th;
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIJIIJI(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewPager with adapter ");
        sbLIZ.append(this);
        sbLIZ.append(" requires a view id");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) throws Throwable {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.LLILZ;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.LLILZ.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.LLILZ = fragment;
        }
    }
}
