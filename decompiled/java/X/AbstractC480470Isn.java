package X;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Isn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC480470Isn extends PagerAdapter {
    public final FragmentManager LLILLJJLI;
    public final int LLILLL;
    public C19EH LLILZ;
    public Fragment LLILZIL;
    public boolean LLILZLL;

    public AbstractC480470Isn() {
        throw null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJJIII(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable LJJIIJ() {
        return null;
    }

    public abstract Fragment LJJIJIL(int i);

    public long LJJIJL(int i) {
        return i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIJI(ViewGroup viewGroup) {
        C19EH c19eh = this.LLILZ;
        if (c19eh != null) {
            if (!this.LLILZLL) {
                try {
                    this.LLILZLL = true;
                    c19eh.LJIIL();
                    this.LLILZLL = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLILZLL = false;
                    throw th;
                }
            }
            this.LLILZ = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJJIJIIJI(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewPager with adapter ");
        sbLIZ.append(this);
        sbLIZ.append(" requires a view id");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public AbstractC480470Isn(FragmentManager fragmentManager, int i) {
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object LJJI(int i, ViewGroup viewGroup) throws Throwable {
        if (this.LLILZ == null) {
            this.LLILZ = this.LLILLJJLI.LJIIJ();
        }
        long jLJJIJL = LJJIJL(i);
        int id = viewGroup.getId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android:switcher:");
        sbLIZ.append(id);
        sbLIZ.append(":");
        sbLIZ.append(jLJJIJL);
        Fragment fragmentLJJJJZI = this.LLILLJJLI.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        if (fragmentLJJJJZI != null) {
            this.LLILZ.LJIIIIZZ(fragmentLJJJJZI);
        } else {
            fragmentLJJJJZI = LJJIJIL(i);
            C19EH c19eh = this.LLILZ;
            int id2 = viewGroup.getId();
            int id3 = viewGroup.getId();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("android:switcher:");
            sbLIZ2.append(id3);
            sbLIZ2.append(":");
            sbLIZ2.append(jLJJIJL);
            c19eh.LIZJ(id2, fragmentLJJJJZI, C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (fragmentLJJJJZI != this.LLILZIL) {
            fragmentLJJJJZI.setMenuVisibility(false);
            if (this.LLILLL == 1) {
                this.LLILZ.LJIL(fragmentLJJJJZI, Lifecycle.State.STARTED);
            } else {
                fragmentLJJJJZI.setUserVisibleHint(false);
                return fragmentLJJJJZI;
            }
        }
        return fragmentLJJJJZI;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean LJJIFFI(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.LLILZ == null) {
            this.LLILZ = this.LLILLJJLI.LJIIJ();
        }
        this.LLILZ.LJIILIIL(fragment);
        if (fragment.equals(this.LLILZIL)) {
            this.LLILZIL = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJJIIZ(ViewGroup viewGroup, int i, Object obj) throws Throwable {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.LLILZIL;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.LLILLL == 1) {
                    if (this.LLILZ == null) {
                        this.LLILZ = this.LLILLJJLI.LJIIJ();
                    }
                    this.LLILZ.LJIL(this.LLILZIL, Lifecycle.State.STARTED);
                } else {
                    this.LLILZIL.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.LLILLL == 1) {
                if (this.LLILZ == null) {
                    this.LLILZ = this.LLILLJJLI.LJIIJ();
                }
                this.LLILZ.LJIL(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.LLILZIL = fragment;
        }
    }
}
