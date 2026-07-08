package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Isl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC480450Isl extends PagerAdapter {
    public final FragmentManager LLILLJJLI;
    public final int LLILLL;
    public C19EH LLILZ;
    public final ArrayList<Fragment.SavedState> LLILZIL = new ArrayList<>();
    public final ArrayList<Fragment> LLILZLL = new ArrayList<>();
    public Fragment LLIZ = null;
    public boolean LLIZLLLIL;

    public abstract Fragment LJJIJIL(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable LJJIIJ() {
        Bundle bundle;
        if (this.LLILZIL.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.LLILZIL.size()];
            this.LLILZIL.toArray(savedStateArr);
            C786410Ut5.LJJIJLIJ(bundle, "states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.LLILZLL.size(); i++) {
            Fragment fragment = (Fragment) ListProtector.get(this.LLILZLL, i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("f");
                sbLIZ.append(i);
                this.LLILLJJLI.LJZI(bundle, fragment, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(ViewGroup viewGroup) {
        C19EH c19eh = this.LLILZ;
        if (c19eh != null) {
            if (!this.LLIZLLLIL) {
                try {
                    this.LLIZLLLIL = true;
                    c19eh.LJIIL();
                    this.LLIZLLLIL = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLIZLLLIL = false;
                    throw th;
                }
            }
            this.LLILZ = null;
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

    public AbstractC480450Isl(FragmentManager fragmentManager, int i) {
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) throws Throwable {
        Fragment.SavedState savedState;
        Object obj;
        if (this.LLILZLL.size() > i && (obj = ListProtector.get(this.LLILZLL, i)) != null) {
            return obj;
        }
        if (this.LLILZ == null) {
            this.LLILZ = this.LLILLJJLI.LJIIJ();
        }
        Fragment fragmentLJJIJIL = LJJIJIL(i);
        if (this.LLILZIL.size() > i && (savedState = (Fragment.SavedState) ListProtector.get(this.LLILZIL, i)) != null) {
            fragmentLJJIJIL.setInitialSavedState(savedState);
        }
        while (this.LLILZLL.size() <= i) {
            this.LLILZLL.add(null);
        }
        fragmentLJJIJIL.setMenuVisibility(false);
        if (this.LLILLL == 0) {
            fragmentLJJIJIL.setUserVisibleHint(false);
        }
        ListProtector.set(this.LLILZLL, i, fragmentLJJIJIL);
        this.LLILZ.LIZIZ(viewGroup.getId(), fragmentLJJIJIL);
        if (this.LLILLL == 1) {
            this.LLILZ.LJIL(fragmentLJJIJIL, Lifecycle.State.STARTED);
        }
        return fragmentLJJIJIL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIII(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.LLILZIL.clear();
            this.LLILZLL.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.LLILZIL.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i = CastIntegerProtector.parseInt(str.substring(1));
                    Fragment fragmentLJJLIIIJILLIZJL = this.LLILLJJLI.LJJLIIIJILLIZJL(bundle, str);
                    if (fragmentLJJLIIIJILLIZJL != null) {
                        while (this.LLILZLL.size() <= i) {
                            this.LLILZLL.add(null);
                        }
                        fragmentLJJLIIIJILLIZJL.setMenuVisibility(false);
                        ListProtector.set(this.LLILZLL, i, fragmentLJJLIIIJILLIZJL);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        Fragment.SavedState savedStateLLIFFJFJJ;
        Fragment fragment = (Fragment) obj;
        if (this.LLILZ == null) {
            this.LLILZ = this.LLILLJJLI.LJIIJ();
        }
        while (this.LLILZIL.size() <= i) {
            this.LLILZIL.add(null);
        }
        ArrayList<Fragment.SavedState> arrayList = this.LLILZIL;
        if (fragment.isAdded()) {
            savedStateLLIFFJFJJ = this.LLILLJJLI.LLIFFJFJJ(fragment);
        } else {
            savedStateLLIFFJFJJ = null;
        }
        ListProtector.set(arrayList, i, savedStateLLIFFJFJJ);
        ListProtector.set(this.LLILZLL, i, null);
        this.LLILZ.LJIIZILJ(fragment);
        if (fragment.equals(this.LLIZ)) {
            this.LLIZ = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJJIIZ(ViewGroup viewGroup, int i, Object obj) throws Throwable {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.LLIZ;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.LLILLL == 1) {
                    if (this.LLILZ == null) {
                        this.LLILZ = this.LLILLJJLI.LJIIJ();
                    }
                    this.LLILZ.LJIL(this.LLIZ, Lifecycle.State.STARTED);
                } else {
                    this.LLIZ.setUserVisibleHint(false);
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
            this.LLIZ = fragment;
        }
    }
}
