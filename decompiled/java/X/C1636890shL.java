package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS153S0400000_25;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0shL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636890shL implements InterfaceC1635680sfO {
    public final ViewPager LL;
    public final InterfaceC1635640sfK LLILLJJLI;
    public final C1631250sYF LLILLL;
    public final HashMap<Integer, InterfaceC1631590sYn<Fragment>> LLILZ = new HashMap<>();
    public final List<EffectCategoryModel> LLILZIL = new ArrayList();
    public final C01GW LLILZLL;
    public int LLIZ;
    public final C11RK<Integer> LLIZLLLIL;
    public final C11RK<Pair<Integer, Integer>> LLJ;

    @Override // X.InterfaceC1625800sPS
    public final C11NZ<Integer> Cm() {
        C11RK<Integer> c11rk = this.LLIZLLLIL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1625810sPT
    public final void LIZJ(List<? extends EffectCategoryModel> list) {
        if (this.LL.getAdapter() != null) {
            this.LL.setAdapter(null);
        }
        ((ArrayList) this.LLILZIL).clear();
        ((ArrayList) this.LLILZIL).addAll(list);
        ((C1636900shM) this.LLILZLL.getValue()).LLJI.LJI = Integer.valueOf(this.LLILLJJLI.eK2());
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "effect_panel_selected_tab_elapsed_fix", true, false)) {
            ((C1636900shM) this.LLILZLL.getValue()).LLJI.LJFF = Integer.valueOf(this.LLILLJJLI.eK2());
        }
        this.LL.setAdapter((PagerAdapter) this.LLILZLL.getValue());
        this.LL.setCurrentItem(this.LLILLJJLI.eK2());
    }

    @Override // X.InterfaceC1635680sfO
    public final void Ng(final C19642311t7 c19642311t7) {
        this.LL.addOnPageChangeListener(new InterfaceC469360Ias() { // from class: X.0shN
            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                c19642311t7.onPageScrollStateChanged(i);
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                C1636890shL c1636890shL = this;
                c1636890shL.LLJ.onNext(new Pair<>(Integer.valueOf(c1636890shL.LLIZ), Integer.valueOf(i)));
                C1636890shL c1636890shL2 = this;
                c1636890shL2.LLIZ = i;
                ((C1636900shM) c1636890shL2.LLILZLL.getValue()).LLJI.LJFF = Integer.valueOf(this.LLIZ);
                c19642311t7.onPageSelected(i);
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrolled(int i, float f, int i2) {
                c19642311t7.onPageScrolled(i, f, i2);
            }
        });
    }

    @Override // X.InterfaceC1625800sPS
    public final void in(boolean z) {
        InterfaceC1631590sYn<Fragment> interfaceC1631590sYn = this.LLILZ.get(Integer.valueOf(this.LLIZ));
        if (interfaceC1631590sYn != null) {
            interfaceC1631590sYn.in(z);
        }
    }

    @Override // X.InterfaceC1625800sPS
    public final void qB(Effect effect) {
        InterfaceC1631590sYn<Fragment> interfaceC1631590sYn = this.LLILZ.get(Integer.valueOf(this.LLIZ));
        if (interfaceC1631590sYn != null) {
            interfaceC1631590sYn.qB(effect);
        }
    }

    @Override // X.InterfaceC1625820sPU
    public final void qM(int i) {
        this.LL.setCurrentItem(i, true);
    }

    @Override // X.InterfaceC1625820sPU
    public final void YL(String str, boolean z) {
        Iterator it2 = ((ArrayList) this.LLILZIL).iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (u.LJJIIJZLJL(((EffectCategoryModel) it2.next()).getKey(), str, false)) {
                if (i != -1) {
                    this.LL.setCurrentItem(i, z);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public C1636890shL(ViewPager viewPager, InterfaceC1635640sfK interfaceC1635640sfK, FragmentManager fragmentManager, C1630880sXe c1630880sXe, C1631250sYF c1631250sYF, InterfaceC1635660sfM<?, Fragment> interfaceC1635660sfM) {
        this.LL = viewPager;
        this.LLILLJJLI = interfaceC1635640sfK;
        this.LLILLL = c1631250sYF;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS153S0400000_25(this, (C1636890shL) fragmentManager, (FragmentManager) c1630880sXe, (C1630880sXe) interfaceC1635660sfM, (InterfaceC1635660sfM<?, Fragment>) 16));
        this.LLILZLL = c01gwLIZIZ;
        this.LLIZ = -1;
        this.LLIZLLLIL = new C11RK<>();
        this.LLJ = new C11RK<>();
        viewPager.setAdapter((PagerAdapter) c01gwLIZIZ.getValue());
    }
}
