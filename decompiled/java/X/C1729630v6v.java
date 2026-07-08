package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.BillboardImagesFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.BillboardTemplateFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0v6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729630v6v extends FragmentStateAdapter {
    public static final ArrayList<Integer> LLJIJIL = C1697810uHb.LJ(2131822626, 2131832854);
    public final List<Fragment> LLJI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return LLJIJIL.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        return (Fragment) ListProtector.get(this.LLJI, i);
    }

    public C1729630v6v(Fragment fragment, InterfaceC1729710v73 interfaceC1729710v73) {
        super(fragment);
        BillboardTemplateFragment billboardTemplateFragment = new BillboardTemplateFragment();
        billboardTemplateFragment.LLILZIL = interfaceC1729710v73;
        BillboardImagesFragment billboardImagesFragment = new BillboardImagesFragment();
        billboardImagesFragment.LLILZ = interfaceC1729710v73;
        this.LLJI = C1697810uHb.LJ(billboardTemplateFragment, billboardImagesFragment);
    }
}
