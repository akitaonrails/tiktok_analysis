package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddleAIFragment;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchMiddleAdapterFragment;
import java.util.List;

/* JADX INFO: renamed from: X.0QWQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QWQ extends FragmentStateAdapter {
    public final InterfaceC668720QKw LLJI;
    public final List<EnumC671670QWf> LLJIJIL;
    public int LLJILJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJIJIL.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        int i2 = C671690QWh.LIZ[((EnumC671670QWf) ListProtector.get(this.LLJIJIL, i)).ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return new EcSearchMiddleAIFragment();
            }
            throw new C1954807lC();
        }
        return new EcSearchMiddleAdapterFragment(this.LLJI);
    }

    public final Fragment LLLJ(FragmentManager fragmentManager) {
        int iIndexOf = this.LLJIJIL.indexOf(EnumC671670QWf.AI);
        if (fragmentManager != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('f');
            sbLIZ.append(iIndexOf);
            return fragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        }
        return null;
    }

    public static Fragment LLLILZLLLI(FragmentManager fragmentManager, int i) {
        if (fragmentManager != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('f');
            sbLIZ.append(i);
            return fragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0QWQ(InterfaceC668720QKw interfaceC668720QKw, List<? extends EnumC671670QWf> list, Fragment fragment) {
        super(fragment);
        this.LLJI = interfaceC668720QKw;
        this.LLJIJIL = list;
    }
}
