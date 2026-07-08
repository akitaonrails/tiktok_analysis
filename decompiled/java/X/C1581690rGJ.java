package X;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rGJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581690rGJ extends C0J9V implements InterfaceC1589690rTD, InterfaceC1581710rGL {
    public final InterfaceC1581640rGE LLILZLL;
    public final AbsFragment LLIZ;
    public final C19EG LLIZLLLIL;
    public ViewGroup LLJ;
    public final Set<Class<?>> LLJI;
    public final List<InterfaceC1583870rJp> LLJIJIL;
    public WeakReference<Fragment> LLJILJIL;

    @Override // X.InterfaceC1589690rTD
    public final void LJ() {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLJIJIL.size();
    }

    @Override // X.InterfaceC1589690rTD
    public final Fragment getCurrentFragment() {
        Fragment fragment;
        WeakReference<Fragment> weakReference = this.LLJILJIL;
        if (weakReference == null || (fragment = weakReference.get()) == null) {
            return null;
        }
        return C1058520deU.LIZ(fragment);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override // X.InterfaceC1589690rTD
    public final String LIZJ(int i) {
        if (i >= 0 && i < this.LLJIJIL.size()) {
            return ((InterfaceC1583870rJp) ListProtector.get(this.LLJIJIL, i)).LJFF();
        }
        return "";
    }

    @Override // X.InterfaceC1589690rTD
    public final String LJII(int i) {
        for (InterfaceC1583870rJp interfaceC1583870rJp : this.LLJIJIL) {
            if (interfaceC1583870rJp.type() == i) {
                return interfaceC1583870rJp.tag();
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    @Override // X.InterfaceC1581710rGL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1581690rGJ.LJIIIIZZ(java.lang.String):void");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        if (!(obj instanceof Fragment)) {
            return -1;
        }
        int i = -1;
        int i2 = 0;
        for (InterfaceC1583870rJp interfaceC1583870rJp : this.LLJIJIL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Class<?> clsEQ2 = Hox.LLJILJIL.LIZ(this.LLIZLLLIL).EQ2(interfaceC1583870rJp.tag());
                if (clsEQ2 != null && clsEQ2.isInstance(obj)) {
                    i = i2;
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if ((!this.LLJI.contains(obj.getClass()) && C1591220rVg.LIZ()) || i == -1) {
            return -2;
        }
        return i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        return ((InterfaceC1583870rJp) ListProtector.get(this.LLJIJIL, i)).LIZLLL();
    }

    @Override // X.C0J9V, androidx.viewpager.widget.PagerAdapter
    public final void LJJIJIIJI(ViewGroup viewGroup) {
        if (C1591220rVg.LIZ()) {
            this.LLJ = viewGroup;
        }
    }

    @Override // X.C0J9V
    public final Fragment LJJIJIL(int i) {
        Fragment fragment;
        Fragment fragmentLIZ;
        Class<?> clsEQ2;
        String strTag = ((InterfaceC1583870rJp) ListProtector.get(this.LLJIJIL, i)).tag();
        Bundle bundleLJIIZILJ = null;
        try {
        } catch (Exception e) {
            e = e;
            fragment = null;
        }
        if (!((Boolean) C285090BFj.LJFF.getValue()).booleanValue() && !((Boolean) C285090BFj.LJI.getValue()).booleanValue()) {
            Class<?> clsEQ22 = Hox.LLJILJIL.LIZ(this.LLIZLLLIL).EQ2(strTag);
            if (clsEQ22 != null) {
                fragmentLIZ = (Fragment) clsEQ22.newInstance();
            } else {
                fragmentLIZ = null;
            }
        } else {
            if (Intrinsics.LJFF(strTag, "For You")) {
                fragmentLIZ = ((IMainService) ServiceManager.get().getService(IMainService.class)).getRecommendFragmentCache();
            } else {
                fragmentLIZ = null;
            }
            try {
                if (Intrinsics.LJFF(strTag, "Following")) {
                    fragmentLIZ = ((IMainService) ServiceManager.get().getService(IMainService.class)).getFollowFragmentCache();
                }
            } catch (Exception e2) {
                e = e2;
                fragment = fragmentLIZ;
                TryCatchGuardChecker.doCheck(e);
            }
            if (fragmentLIZ == null && (clsEQ2 = Hox.LLJILJIL.LIZ(this.LLIZLLLIL).EQ2(strTag)) != null) {
                fragment = (Fragment) clsEQ2.newInstance();
                fragmentLIZ = fragment;
            }
        }
        if (fragmentLIZ == null) {
            if (Intrinsics.LJFF(strTag, "For You")) {
                if (!((Boolean) C285090BFj.LJFF.getValue()).booleanValue() || (fragmentLIZ = ((IMainService) ServiceManager.get().getService(IMainService.class)).getRecommendFragmentCache()) == null) {
                    fragmentLIZ = C1135904cP.LIZIZ.LIZ();
                }
            } else if (Intrinsics.LJFF(strTag, "Following")) {
                if (!((Boolean) C285090BFj.LJI.getValue()).booleanValue() || (fragmentLIZ = ((IMainService) ServiceManager.get().getService(IMainService.class)).getFollowFragmentCache()) == null) {
                    fragmentLIZ = FollowFeedServiceImpl.LJIL().LJIIJJI();
                }
            } else {
                fragmentLIZ = C1135904cP.LIZIZ.LIZ();
            }
        }
        if (fragmentLIZ instanceof FeedFragment) {
            ((FeedFragment) fragmentLIZ).LLILZ = this.LLIZ;
        }
        AbstractC1583720rJa abstractC1583720rJaGQ2 = Hox.LLJILJIL.LIZ(this.LLIZLLLIL).GQ2(strTag);
        if (abstractC1583720rJaGQ2 != null) {
            bundleLJIIZILJ = abstractC1583720rJaGQ2.LJIIZILJ();
        }
        if (bundleLJIIZILJ != null && fragmentLIZ != null) {
            fragmentLIZ.setArguments(bundleLJIIZILJ);
        }
        if (C1591220rVg.LIZ()) {
            this.LLJI.add(fragmentLIZ.getClass());
        }
        return fragmentLIZ;
    }

    @Override // X.C0J9V
    public final long LJJIJL(int i) {
        return ((InterfaceC1583870rJp) ListProtector.get(this.LLJIJIL, i)).tag().hashCode();
    }

    public final boolean LJJIL(String str) {
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup == null) {
            return false;
        }
        int id = viewGroup.getId();
        Iterator<InterfaceC1583870rJp> it2 = this.LLJIJIL.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().tag(), str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Fragment fragmentLJJJJZI = this.LLILLJJLI.LJJJJZI(LJJIJLIJ(id, i));
        if (fragmentLJJJJZI == null) {
            return false;
        }
        this.LLJI.remove(fragmentLJJJJZI.getClass());
        super.notifyDataSetChanged();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1581690rGJ(com.bytedance.ies.uikit.base.AbsFragment r10, X.C1581630rGD r11) {
        /*
            r9 = this;
            androidx.fragment.app.FragmentManager r0 = r10.getChildFragmentManager()
            r9.<init>(r0)
            r9.LLILZLL = r11
            r9.LLIZ = r10
            android.content.Context r1 = r10.getContext()
            r0 = 0
            if (r1 == 0) goto L99
            X.19EG r8 = X.C1388190mED.LIZIZ(r1)
        L16:
            r9.LLIZLLLIL = r8
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r9.LLJI = r1
            X.0qxI r1 = com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel.LLILZIL
            com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel r1 = r1.LIZ(r8)
            r5 = 0
            java.util.List r4 = r1.lZ1(r5)
            long r6 = X.C285040BFe.LIZ
            r2 = -1
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r2 = 1
            if (r1 == 0) goto L55
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            Y.ARunnableS104S0100000_4 r1 = new Y.ARunnableS104S0100000_4
            r0 = 139(0x8b, float:1.95E-43)
            r1.<init>(r9, r0)
            X.C0CN5.LIZJ(r2, r1, r5)
        L41:
            r9.LLJIJIL = r4
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            X.08oa r0 = r0.getShowTimeLineTab()
            java.lang.Object r0 = r0.LIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            return
        L55:
            boolean r1 = X.C296200BjG.LIZ()
            if (r1 == 0) goto L86
            X.19EG r1 = X.C1388190mED.LIZIZ(r8)
            if (r1 == 0) goto L41
            X.0Q7z r3 = X.C1558360qeg.LJI(r1, r0)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r2[r5] = r1
            X.0QSJ r2 = X.C687700QyG.LIZJ(r3, r2)
            if (r2 == 0) goto L84
            java.lang.Class<com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility> r1 = com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility.class
            java.lang.Object r2 = r2.getAbility(r1)
        L77:
            boolean r1 = r2 instanceof com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility
            if (r1 == 0) goto L7c
            r0 = r2
        L7c:
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r0
        L7e:
            if (r0 == 0) goto L41
            r0.Lb0()
            goto L41
        L84:
            r2 = r0
            goto L77
        L86:
            X.19EG r1 = X.C1388190mED.LIZIZ(r8)
            if (r1 == 0) goto L41
            X.0Q7z r2 = X.C1558360qeg.LJI(r1, r0)
            java.lang.Class<com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility> r1 = com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r2, r1, r0)
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r0
            goto L7e
        L99:
            r8 = r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1581690rGJ.<init>(com.bytedance.ies.uikit.base.AbsFragment, X.0rGD):void");
    }

    @Override // X.InterfaceC1589690rTD
    public final int Im(int i, boolean z) {
        if (this.LLJIJIL.size() > 0) {
            int size = this.LLJIJIL.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((InterfaceC1583870rJp) ListProtector.get(this.LLJIJIL, i2)).type() == i) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // X.InterfaceC1589690rTD
    public final Fragment Nk(int i, boolean z) {
        Class<?> clsEQ2 = Hox.LLJILJIL.LIZ(this.LLIZLLLIL).EQ2(((InterfaceC1583870rJp) ListProtector.get(this.LLJIJIL, i)).tag());
        if (clsEQ2 == null) {
            return null;
        }
        for (Fragment fragment : this.LLILLJJLI.LJJLIIIJL()) {
            if (clsEQ2.isInstance(fragment)) {
                if (z) {
                    return C1058520deU.LIZ(fragment);
                }
                return fragment;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1589690rTD
    public final int Vd(int i, boolean z) {
        if (i >= 0 && i < this.LLJIJIL.size()) {
            return ((InterfaceC1583870rJp) ListProtector.get(this.LLJIJIL, i)).type();
        }
        return -1;
    }

    @Override // X.C0J9V, androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        super.LJIIZILJ(viewGroup, i, obj);
        if (obj instanceof Fragment) {
            try {
                C19EH c19eh = this.LLILLL;
                if (c19eh != null) {
                    c19eh.LJIIZILJ((Fragment) obj);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.C0J9V, androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment;
        super.LJJIIZ(viewGroup, i, obj);
        WeakReference<Fragment> weakReference = this.LLJILJIL;
        if (weakReference != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        if (fragment != obj) {
            Fragment fragment2 = (Fragment) obj;
            this.LLJILJIL = new WeakReference<>(fragment2);
            InterfaceC1581640rGE interfaceC1581640rGE = this.LLILZLL;
            if (interfaceC1581640rGE != null) {
                Fragment fragmentLIZ = C1058520deU.LIZ(fragment2);
                MainFragment mainFragment = ((C1581630rGD) interfaceC1581640rGE).LIZ;
                mainFragment.getClass();
                HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(mainFragment);
                if (homeViewPagerAbilityLIZIZ != null) {
                    homeViewPagerAbilityLIZIZ.AX0(i, fragmentLIZ);
                }
            }
            if (fragment != null) {
                C1440005kM.LIZ(new C739530Szf(fragment.hashCode()));
            }
        }
    }
}
