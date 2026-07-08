package X;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0IOK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0IOK extends PagerAdapter {
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

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIJIIJI(ViewGroup viewGroup) {
    }

    public abstract Fragment LJJIJIL(int i);

    public long LJJIJL(int i) {
        return i;
    }

    public C0IOK(FragmentManager fragmentManager) {
        this.LLILLJJLI = fragmentManager;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIJI(ViewGroup viewGroup) {
        C19EH c19eh = this.LLILLL;
        if (c19eh != null) {
            try {
                c19eh.LJIIJ();
                this.LLILLL = null;
                this.LLILLJJLI.LJJJJL();
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object LJJI(int i, ViewGroup viewGroup) throws Throwable {
        if (this.LLILLL == null) {
            this.LLILLL = this.LLILLJJLI.LJIIJ();
        }
        LJJIJL(i);
        int id = viewGroup.getId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android:switcher:");
        sbLIZ.append(id);
        sbLIZ.append(":");
        sbLIZ.append(String.valueOf(LJJIJL(i)));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Fragment fragmentLJJJJZI = this.LLILLJJLI.LJJJJZI(strLIZIZ);
        if (fragmentLJJJJZI != null) {
            this.LLILLL.LJIIIIZZ(fragmentLJJJJZI);
        } else {
            fragmentLJJJJZI = LJJIJIL(i);
            this.LLILLL.LIZJ(viewGroup.getId(), fragmentLJJJJZI, strLIZIZ);
        }
        if (fragmentLJJJJZI != this.LLILZ) {
            fragmentLJJJJZI.setMenuVisibility(false);
            fragmentLJJJJZI.setUserVisibleHint(false);
        }
        return fragmentLJJJJZI;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        if (this.LLILLL == null) {
            this.LLILLL = this.LLILLJJLI.LJIIJ();
        }
        this.LLILLL.LJIILIIL((Fragment) obj);
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
