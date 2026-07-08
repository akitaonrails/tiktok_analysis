package X;

import Y.ARunnableS93S0200000_24;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.minidrama.tab.v2.DramaCategoryContentFragment;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rBR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578670rBR extends PagerAdapter {
    public final Fragment LLILLJJLI;
    public final List<SeriesCenterCenterScene> LLILLL;
    public final boolean LLILZ;
    public final Function0<Fragment> LLILZIL;
    public final SparseArray<FrameLayout> LLILZLL = new SparseArray<>();
    public final Map<SeriesCenterCenterScene, Fragment> LLIZ = new ConcurrentHashMap();
    public int LLIZLLLIL = -1;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILLL.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        if (!(obj instanceof FrameLayout)) {
            obj = null;
        }
        if (obj == null) {
            return -2;
        }
        int size = this.LLILZLL.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = this.LLILZLL.keyAt(i);
            if (this.LLILZLL.valueAt(i) == obj) {
                return iKeyAt;
            }
        }
        return -2;
    }

    public final String LJJIJL(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Drama_Fragment_");
        sbLIZ.append(((SeriesCenterCenterScene) ListProtector.get(this.LLILLL, i)).categoryId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        FrameLayout frameLayout = this.LLILZLL.get(i);
        if (frameLayout == null) {
            if (((SeriesCenterCenterScene) ListProtector.get(this.LLILLL, i)).scene == SeriesCenterSceneEnum.PICKS) {
                frameLayout = new C1578910rBp(viewGroup.getContext(), null, 6);
            } else {
                frameLayout = new FrameLayout(viewGroup.getContext());
            }
            frameLayout.setId(View.generateViewId());
            this.LLILZLL.put(i, frameLayout);
        }
        if (!Intrinsics.LJFF(frameLayout.getParent(), viewGroup)) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return Intrinsics.LJFF(view, obj);
    }

    public final Fragment LJJIJIL(SeriesCenterCenterScene seriesCenterCenterScene, int i) {
        if (seriesCenterCenterScene.scene == SeriesCenterSceneEnum.PICKS) {
            return this.LLILZIL.invoke();
        }
        SeriesCenterCenterScene seriesCenterCenterScene2 = (SeriesCenterCenterScene) ListProtector.get(this.LLILLL, i);
        boolean z = this.LLILZ;
        DramaCategoryContentFragment dramaCategoryContentFragment = new DramaCategoryContentFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "category", seriesCenterCenterScene2);
        bundle.putBoolean("is_from_innerfeed_discover", z);
        dramaCategoryContentFragment.setArguments(bundle);
        return dramaCategoryContentFragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        C786410Ut5.LJJJLZIJ((View) obj, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) throws Throwable {
        C1896607bo c1896607bo;
        InterfaceC1561380qjY interfaceC1561380qjY;
        if (i == this.LLIZLLLIL) {
            return;
        }
        SeriesCenterCenterScene seriesCenterCenterScene = (SeriesCenterCenterScene) ListProtector.get(this.LLILLL, i);
        View view = (View) obj;
        int id = view.getId();
        SeriesCenterCenterScene seriesCenterCenterScene2 = (SeriesCenterCenterScene) ListProtector.get(this.LLILLL, i);
        String strLJJIJL = LJJIJL(i);
        Fragment fragmentLJJJJZI = (Fragment) ((ConcurrentHashMap) this.LLIZ).get(seriesCenterCenterScene2);
        if (fragmentLJJJJZI == null) {
            fragmentLJJJJZI = this.LLILLJJLI.getChildFragmentManager().LJJJJZI(strLJJIJL);
        }
        if (fragmentLJJJJZI == null) {
            c1896607bo = new C1896607bo(LJJIJIL(seriesCenterCenterScene2, i), null);
        } else if (fragmentLJJJJZI.isAdded() && fragmentLJJJJZI.getId() != id) {
            c1896607bo = new C1896607bo(LJJIJIL(seriesCenterCenterScene2, i), fragmentLJJJJZI);
        } else {
            c1896607bo = new C1896607bo(fragmentLJJJJZI, null);
        }
        Fragment fragment = c1896607bo.LIZ;
        C19EH c19ehLJIIJ = this.LLILLJJLI.getChildFragmentManager().LJIIJ();
        Fragment fragment2 = c1896607bo.LIZIZ;
        if (fragment2 != null) {
            c19ehLJIIJ.LJIIZILJ(fragment2);
        }
        ((ConcurrentHashMap) this.LLIZ).put(seriesCenterCenterScene, fragment);
        if (!fragment.isAdded()) {
            c19ehLJIIJ.LIZJ(view.getId(), fragment, LJJIJL(i));
        }
        Integer numValueOf = Integer.valueOf(this.LLIZLLLIL);
        if (numValueOf.intValue() >= 0) {
            Fragment fragment3 = (Fragment) ((ConcurrentHashMap) this.LLIZ).get(ListProtector.get(this.LLILLL, numValueOf.intValue()));
            if (fragment3 != 0 && fragment3 != c1896607bo.LIZIZ) {
                if ((fragment3 instanceof InterfaceC1561380qjY) && (interfaceC1561380qjY = (InterfaceC1561380qjY) fragment3) != null) {
                    interfaceC1561380qjY.nd();
                }
                c19ehLJIIJ.LJIL(fragment3, Lifecycle.State.STARTED);
                fragment3.setUserVisibleHint(false);
            }
        }
        c19ehLJIIJ.LJIL(fragment, Lifecycle.State.RESUMED);
        fragment.setUserVisibleHint(true);
        c19ehLJIIJ.LJJIFFI(fragment);
        this.LLIZLLLIL = i;
        c19ehLJIIJ.LJIJI(new ARunnableS93S0200000_24(this, seriesCenterCenterScene, 24), false);
        c19ehLJIIJ.LJIIL();
        this.LLILLJJLI.getChildFragmentManager().LJJJJL();
    }

    public C1578670rBR(Fragment fragment, List list, boolean z, AwS568S0100000_24 awS568S0100000_24) {
        this.LLILLJJLI = fragment;
        this.LLILLL = list;
        this.LLILZ = z;
        this.LLILZIL = awS568S0100000_24;
    }
}
