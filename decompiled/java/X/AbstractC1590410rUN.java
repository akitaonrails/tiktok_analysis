package X;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0rUN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1590410rUN<T extends Fragment> extends C0IOK {
    public final int LLILZIL;
    public final HashMap<Integer, T> LLILZLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        HashMap<Integer, T> map = this.LLILZLL;
        if (map != null) {
            map.clear();
            HashMap<Integer, T> map2 = this.LLILZLL;
            InterfaceC1590450rUR interfaceC1590450rUR = ((C1590400rUM) this).LLJILJIL;
            if (interfaceC1590450rUR != 0) {
                interfaceC1590450rUR.LIZIZ(map2);
            }
        }
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILZIL;
    }

    @Override // X.C0IOK
    public final Fragment LJJIJIL(int i) {
        C1590430rUP c1590430rUP = (C1590430rUP) ListProtector.get(((C1590400rUM) this).LLJ, i);
        if (c1590430rUP != null) {
            try {
                CommonPageFragment commonPageFragmentNewInstance = c1590430rUP.LIZ.newInstance();
                Bundle bundle = c1590430rUP.LIZJ;
                if (bundle != null) {
                    if (commonPageFragmentNewInstance != null) {
                        commonPageFragmentNewInstance.setArguments(bundle);
                        return commonPageFragmentNewInstance;
                    }
                } else if (commonPageFragmentNewInstance != null) {
                    return commonPageFragmentNewInstance;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createFragment(position=");
        sbLIZ.append(i);
        sbLIZ.append(" does not return a Fragment),check the code to be sure that method createFragment has override all position");
        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public AbstractC1590410rUN(FragmentManager fragmentManager, int i) {
        super(fragmentManager);
        this.LLILZIL = i;
        C1590400rUM c1590400rUM = (C1590400rUM) this;
        InterfaceC1590450rUR interfaceC1590450rUR = c1590400rUM.LLJILJIL;
        if (interfaceC1590450rUR != null) {
            interfaceC1590450rUR.LIZ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        this.LLILZLL = linkedHashMap;
        InterfaceC1590450rUR interfaceC1590450rUR2 = c1590400rUM.LLJILJIL;
        if (interfaceC1590450rUR2 != null) {
            interfaceC1590450rUR2.LIZIZ(linkedHashMap);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.C0IOK, androidx.viewpager.widget.PagerAdapter
    public Object LJJI(int i, ViewGroup viewGroup) throws Throwable {
        IDetailPageAbility iDetailPageAbilityLIZ;
        Object objLJJI = super.LJJI(i, viewGroup);
        Fragment fragment = (Fragment) objLJJI;
        C1590400rUM c1590400rUM = (C1590400rUM) this;
        if (c1590400rUM.LLJILJILJ != null && (iDetailPageAbilityLIZ = C1600700rky.LIZ(fragment)) != null) {
            iDetailPageAbilityLIZ.y62(false);
        }
        this.LLILZLL.put(Integer.valueOf(i), (T) fragment);
        HashMap<Integer, T> map = this.LLILZLL;
        InterfaceC1590450rUR interfaceC1590450rUR = c1590400rUM.LLJILJIL;
        if (interfaceC1590450rUR != 0) {
            interfaceC1590450rUR.LIZIZ(map);
        }
        return objLJJI;
    }
}
