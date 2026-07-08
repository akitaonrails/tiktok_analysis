package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddleAIFragment;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchContentFragment;
import java.util.List;

/* JADX INFO: renamed from: X.0QVm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671480QVm extends FragmentStateAdapter {
    public final List<EnumC671670QWf> LLJI;
    public int LLJIJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJI.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        int i2 = C671490QVn.LIZ[((EnumC671670QWf) ListProtector.get(this.LLJI, i)).ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return new EcSearchMiddleAIFragment();
            }
            throw new C1954807lC();
        }
        return new EcSearchContentFragment();
    }

    public C671480QVm(Fragment fragment, List list) {
        super(fragment);
        this.LLJI = list;
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
}
