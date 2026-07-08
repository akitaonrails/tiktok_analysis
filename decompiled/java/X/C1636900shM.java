package X;

import Y.AfS194S0100000_25;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0shM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636900shM extends AbstractC480450Isl {
    public final C1630880sXe LLJ;
    public final C1631250sYF LLJI;
    public final Map<Integer, InterfaceC1631590sYn<Fragment>> LLJIJIL;
    public final List<EffectCategoryModel> LLJILJIL;
    public final InterfaceC1635660sfM<?, Fragment> LLJILJILJ;
    public final Map<Integer, InterfaceC420801kM> LLJILLL;
    public final /* synthetic */ C1636890shL LLJJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLJILJIL.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC480450Isl
    public final Fragment LJJIJIL(int i) {
        InterfaceC1635690sfP<?, Fragment> interfaceC1635690sfP = this.LLJILJILJ.get(((EffectCategoryModel) ListProtector.get(this.LLJILJIL, i)).getKey());
        C1630880sXe c1630880sXe = this.LLJ;
        InterfaceC1631590sYn<Fragment> interfaceC1631590sYnLIZJ = interfaceC1635690sfP.LIZJ(i, c1630880sXe, this.LLJI, c1630880sXe.LJFF.LJIJI);
        C1636890shL c1636890shL = this.LLJJ;
        this.LLJIJIL.put(Integer.valueOf(i), interfaceC1631590sYnLIZJ);
        InterfaceC420801kM interfaceC420801kMLJJLL = interfaceC1631590sYnLIZJ.Cm().LJJLL(new AfS194S0100000_25(c1636890shL, 208), C09HN.LIZ);
        this.LLJILLL.put(Integer.valueOf(i), interfaceC420801kMLJJLL);
        interfaceC1631590sYnLIZJ.LJJZZI();
        return (Fragment) interfaceC1631590sYnLIZJ;
    }

    @Override // X.AbstractC480450Isl, androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        super.LJIIZILJ(viewGroup, i, obj);
        InterfaceC420801kM interfaceC420801kMRemove = this.LLJILLL.remove(Integer.valueOf(i));
        if (interfaceC420801kMRemove != null && !interfaceC420801kMRemove.isDisposed()) {
            interfaceC420801kMRemove.dispose();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1636900shM(C1636890shL c1636890shL, FragmentManager fragmentManager, C1630880sXe c1630880sXe, C1631250sYF c1631250sYF, Map<Integer, InterfaceC1631590sYn<Fragment>> map, List<EffectCategoryModel> list, InterfaceC1635660sfM<?, Fragment> interfaceC1635660sfM) {
        super(fragmentManager, 0);
        this.LLJJ = c1636890shL;
        this.LLJ = c1630880sXe;
        this.LLJI = c1631250sYF;
        this.LLJIJIL = map;
        this.LLJILJIL = list;
        this.LLJILJILJ = interfaceC1635660sfM;
        this.LLJILLL = new LinkedHashMap();
    }
}
