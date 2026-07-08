package X;

import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0J9V, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0J9V extends PagerAdapter {
    public final FragmentManager LLILLJJLI;
    public C19EH LLILLL;
    public Fragment LLILZ;
    public final SparseArray<String> LLILZIL = new SparseArray<>();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIII(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable LJJIIJ() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJJIJIIJI(ViewGroup viewGroup) {
    }

    public abstract Fragment LJJIJIL(int i);

    public long LJJIJL(int i) {
        return i;
    }

    public C0J9V(FragmentManager fragmentManager) {
        this.LLILLJJLI = fragmentManager;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(ViewGroup viewGroup) {
        C19EH c19eh = this.LLILLL;
        if (c19eh != null) {
            try {
                c19eh.LJIIJ();
                this.LLILLL = null;
                this.LLILLJJLI.LJJJJL();
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZLLL(6, "FragmentPagerAdapter", "finishUpdate ->" + e);
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) throws Throwable {
        if (this.LLILLL == null) {
            this.LLILLL = this.LLILLJJLI.LJIIJ();
        }
        LJJIJL(i);
        String strLJJIJLIJ = LJJIJLIJ(viewGroup.getId(), i);
        Fragment fragmentLJJJJZI = this.LLILLJJLI.LJJJJZI(strLJJIJLIJ);
        if (fragmentLJJJJZI != null) {
            this.LLILLL.LJIIIIZZ(fragmentLJJJJZI);
        } else {
            fragmentLJJJJZI = LJJIJIL(i);
            if (fragmentLJJJJZI == this.LLILZ) {
                this.LLILLL.LIZJ(viewGroup.getId(), fragmentLJJJJZI, strLJJIJLIJ);
                this.LLILZIL.put(i, strLJJIJLIJ);
            }
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

    public final String LJJIJLIJ(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android:switcher:");
        sbLIZ.append(i);
        sbLIZ.append(':');
        sbLIZ.append(String.valueOf(LJJIJL(i2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        if (this.LLILLL == null) {
            this.LLILLL = this.LLILLJJLI.LJIIJ();
        }
        this.LLILLL.LJIILIIL((Fragment) obj);
        this.LLILZIL.remove(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.LLILZ) {
            boolean zIsEmpty = TextUtils.isEmpty(fragment.getTag());
            boolean z = !TextUtils.equals(fragment.getTag(), this.LLILZIL.get(i, ""));
            if (zIsEmpty || z) {
                String strLJJIJLIJ = LJJIJLIJ(viewGroup.getId(), i);
                if (this.LLILLL == null) {
                    this.LLILLL = this.LLILLJJLI.LJIIJ();
                }
                Fragment fragmentLJJJJZI = this.LLILLJJLI.LJJJJZI(strLJJIJLIJ);
                if (fragmentLJJJJZI != null) {
                    this.LLILLL.LJJIFFI(fragmentLJJJJZI);
                } else {
                    this.LLILLL.LIZJ(viewGroup.getId(), fragment, strLJJIJLIJ);
                }
                this.LLILZIL.put(i, strLJJIJLIJ);
            }
            Fragment fragment2 = this.LLILZ;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.LLILZ.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.LLILZ = fragment;
        }
    }
}
