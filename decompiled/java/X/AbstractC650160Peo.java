package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Peo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC650160Peo extends AbstractC650180Peq<Fragment> {
    public final FragmentManager LLILZ;
    public C19EH LLILZIL;
    public final boolean LLILZLL = true;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIJIIJI(ViewGroup viewGroup) {
    }

    public abstract String LJJIZ(long j);

    public abstract void LJJJ();

    public AbstractC650160Peo(FragmentManager fragmentManager) {
        this.LLILZ = fragmentManager;
    }

    public static final void LJJJIL(String str) {
        C2344809Gs.LIZLLL(4, "TikTokSearch", str);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIJI(ViewGroup viewGroup) throws Exception {
        C19EH c19eh = this.LLILZIL;
        if (c19eh != null) {
            c19eh.LJIIJ();
            this.LLILZIL = null;
            if (((Number) C07BE.LIZ.getValue()).intValue() == 0) {
                try {
                    this.LLILZ.LJJJJL();
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    try {
                        C664410Q4h.LIZIZ(C0Q45.COMMON, EnumC664420Q4i.VIEW_PAGER, e, "ABLazyFragmentPagerAdapter", C2097608Jq.LJIIIIZZ(new Pair("occurTime", String.valueOf(System.currentTimeMillis())), new Pair("dynamicTabsTimes", C13LP.LJJLIIIJ(SearchContainerFragment.LLLJ, ",", null, null, 0, null, null, 62))), C2097608Jq.LJ(), "search");
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        throw e;
                    }
                }
            }
            this.LLILZ.LJJJJL();
        }
    }

    public final boolean LJJJI(int i) {
        if (!this.LLILZLL || this.LLILLJJLI.get(i) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.19EH] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.viewpager.widget.PagerAdapter
    public Object LJJI(int i, ViewGroup viewGroup) throws Throwable {
        Boolean boolValueOf;
        ?? r2;
        if (this.LLILZIL == null) {
            this.LLILZIL = this.LLILZ.LJIIJ();
        }
        String strLJJIL = LJJIL(viewGroup.getId(), i);
        Fragment fragmentLJJJJZI = this.LLILZ.LJJJJZI(strLJJIL);
        String strLJIILIIL = C644560PPy.LJIILIIL(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PagerAdapter instantiate check, pos: ");
        sbLIZ.append(i);
        sbLIZ.append(" (");
        sbLIZ.append(strLJIILIIL);
        sbLIZ.append("), added: ");
        Boolean boolValueOf2 = null;
        if (fragmentLJJJJZI != null) {
            boolValueOf = Boolean.valueOf(fragmentLJJJJZI.isAdded());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        LJJJIL(C2188811AlT.LIZIZ(sbLIZ));
        if (fragmentLJJJJZI != null) {
            if (LJJIJLIJ(fragmentLJJJJZI, strLJJIL)) {
                LJJJIL("PagerAdapter attaching");
                this.LLILZIL.LJIIIIZZ(fragmentLJJJJZI);
            } else {
                LJJJIL("PagerAdapter attached, ignoring");
            }
            LJJJ();
            View view = fragmentLJJJJZI.getView();
            r2 = fragmentLJJJJZI;
            if (view != null) {
                C661350Pwr.LJIIL(view);
                r2 = fragmentLJJJJZI;
            }
        } else {
            ?? r22 = (Fragment) LJJIJIL(i);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PagerAdapter create, pos: ");
            sbLIZ2.append(i);
            sbLIZ2.append(" (");
            sbLIZ2.append(strLJIILIIL);
            sbLIZ2.append("), added: ");
            if (r22 != null) {
                boolValueOf2 = Boolean.valueOf(r22.isAdded());
            }
            sbLIZ2.append(boolValueOf2);
            LJJJIL(C2188811AlT.LIZIZ(sbLIZ2));
            if (this.LLILZLL && (r22 instanceof InterfaceC650190Per)) {
                LJJJIL("PagerAdapter storing");
                this.LLILLJJLI.put(i, (T) r22);
                r2 = r22;
            } else {
                LJJJIL("PagerAdapter adding");
                if (LJJIJLIJ(r22, strLJJIL)) {
                    this.LLILZIL.LIZJ(viewGroup.getId(), r22, strLJJIL);
                    r2 = r22;
                } else {
                    LJJJIL("PagerAdapter added, ignoring");
                    r2 = r22;
                }
            }
        }
        if (r2 != this.LLILLL) {
            r2.setMenuVisibility(false);
            r2.setUserVisibleHint(false);
        }
        return r2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        if (view == ((Fragment) obj).getView()) {
            return true;
        }
        return false;
    }

    public final Fragment LJJIJL(int i, ViewGroup viewGroup) {
        Fragment fragment;
        if (!this.LLILZLL || (fragment = (Fragment) this.LLILLJJLI.get(i)) == null) {
            return null;
        }
        String strLJJIL = LJJIL(viewGroup.getId(), i);
        if (this.LLILZ.LJJJJZI(strLJJIL) == null) {
            if (this.LLILZIL == null) {
                this.LLILZIL = this.LLILZ.LJIIJ();
            }
            this.LLILZIL.LIZJ(viewGroup.getId(), fragment, strLJJIL);
            this.LLILLJJLI.remove(i);
        }
        return fragment;
    }

    public final boolean LJJIJLIJ(Fragment fragment, String str) {
        if (fragment.isAdded()) {
            LJJJIL("PagerAdapter added, ignoring");
            return false;
        }
        if (this.LLILZ.LJJJJZI(str) != null) {
            LJJJIL("PagerAdapter manager already found the fragment ");
            return false;
        }
        return true;
    }

    public final String LJJIL(int i, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewPager:Fragment:");
        sbLIZ.append(i);
        sbLIZ.append(':');
        sbLIZ.append(LJJIZ(j));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment;
        View view;
        if (this.LLILZIL == null) {
            this.LLILZIL = this.LLILZ.LJIIJ();
        }
        String strLJJIL = LJJIL(viewGroup.getId(), i);
        LJJJ();
        if ((obj instanceof Fragment) && (fragment = (Fragment) obj) != null && fragment.isAdded() && (view = fragment.getView()) != null) {
            C661350Pwr.LIZJ(view);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PagerAdapter destroyItem, pos: ");
        sbLIZ.append(i);
        sbLIZ.append(" (");
        sbLIZ.append(C644560PPy.LJIILIIL(i));
        sbLIZ.append(')');
        LJJJIL(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZLL && this.LLILZ.LJJJJZI(strLJJIL) != null) {
            this.LLILLJJLI.remove(i);
        } else {
            this.LLILZIL.LJIILIIL((Fragment) obj);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJJIIZ(ViewGroup viewGroup, int i, Object obj) throws Throwable {
        if (LJJJI(i)) {
            LJJIJL(i, viewGroup);
            LJIJI(viewGroup);
        }
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.LLILLL;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.LLILLL.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.LLILLL = fragment;
        }
    }
}
