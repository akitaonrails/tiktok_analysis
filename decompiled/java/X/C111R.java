package X;

import Y.AObserverS231S0100000_29;
import Y.AfS163S0200000_29;
import Y.AfS198S0100000_29;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.shortvideo.NaviContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.navi.core.EffectDependencyLoader;
import com.ss.android.ugc.gamora.recorder.navi.core.EntryPointStickerLifecycleListener;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviFeature;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviFeatureInfo;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewModel;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.111R, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C111R {
    public final C19EG LIZ;
    public final InterfaceC2254081DKk LIZIZ;
    public final InterfaceC1635390sev LIZJ;
    public final ShortVideoContext LIZLLL;
    public final Function0<Unit> LJ;
    public final LifecycleOwner LJFF;
    public final NaviAvatarListViewModel LJI;
    public C19426510zP LJII;
    public InterfaceC420801kM LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ = true;
    public int LJIIJJI = -1;
    public int LJIIL = -1;
    public final C01GW LJIILIIL;
    public C20672087y LJIILJJIL;

    public final void LIZIZ(List<C111S> list) {
        if (this.LJIIIZ) {
            int iIntValue = 0;
            if (list != null && !list.isEmpty()) {
                Integer selectedIndex = ((NaviAvatarListViewState) this.LJI.hR2()).getSelectedIndex();
                if (selectedIndex != null) {
                    iIntValue = selectedIndex.intValue();
                }
                int avatarCountSelf = ((NaviAvatarListViewState) this.LJI.hR2()).getAvatarCountSelf();
                this.LJIIL = avatarCountSelf;
                if (this.LJIIJJI < 0) {
                    this.LJIIJJI = avatarCountSelf;
                }
                LIZ(iIntValue, (C111S) ListProtector.get(list, iIntValue));
            }
        }
    }

    public final void LIZ(int i, C111S c111s) {
        long j;
        boolean z;
        NaviContext naviContext = this.LIZLLL.naviContext;
        String str = c111s.LIZ;
        if (str == null && (str = c111s.LIZIZ) == null) {
            j = -1;
        } else {
            j = CastLongProtector.parseLong(str);
        }
        naviContext.avatarId = Long.valueOf(j);
        if (i <= (this.LJIIL - this.LJIIJJI) - 1) {
            z = true;
        } else {
            z = false;
        }
        naviContext.avatarIsNew = Boolean.valueOf(z);
        NaviAvatarListViewModel naviAvatarListViewModel = this.LJI;
        naviAvatarListViewModel.getClass();
        naviAvatarListViewModel.setState(new AwS41S0001000_29(i, 36));
        NaviAvatarListViewModel naviAvatarListViewModel2 = this.LJI;
        Integer numValueOf = Integer.valueOf(i);
        naviAvatarListViewModel2.getClass();
        naviAvatarListViewModel2.setState(new AwS608S0100000_29(numValueOf, 734));
        C19426510zP c19426510zP = this.LJII;
        if (c19426510zP != null && !c19426510zP.LJI) {
            for (Pair pair : (ArrayList) c19426510zP.LJII) {
                c19426510zP.LIZIZ.sendEffectMsg(((Number) pair.getFirst()).intValue(), 0L, 0L, (String) pair.getSecond());
            }
            ((ArrayList) c19426510zP.LJII).clear();
            if (!c19426510zP.LJI) {
                C11JF c11jf = c19426510zP.LJIIIZ;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                c19426510zP.LJIIIZ = null;
                EffectDependencyLoader effectDependencyLoader = c19426510zP.LJFF;
                if (effectDependencyLoader != null) {
                    effectDependencyLoader.LLILZIL = true;
                    MessageCenter.removeListener(effectDependencyLoader);
                    ((LinkedHashMap) effectDependencyLoader.LLILZ).clear();
                    effectDependencyLoader.LLILLL.clear();
                }
                c19426510zP.LJI = true;
            }
        }
        C19426510zP c19426510zP2 = new C19426510zP(this.LIZ, this.LIZIZ, this.LIZJ);
        this.LJII = c19426510zP2;
        c19426510zP2.LJIIIIZZ = new AwS573S0100000_29(this, 1006);
        C19426510zP c19426510zP3 = this.LJII;
        boolean z2 = !this.LJIIJ;
        if (c19426510zP3.LJ == null) {
            if (!c19426510zP3.LJI) {
                c19426510zP3.LJ = c111s;
                List<ProfileNaviFeature> list = c111s.LIZJ;
                if (list != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ProfileNaviFeature> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Object objFromJson = GsonProtectorUtils.fromJson(c19426510zP3.LIZLLL, it2.next().info, (Class<Object>) ProfileNaviFeatureInfo.class);
                        if (objFromJson != null) {
                            arrayList.add(objFromJson);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String str2 = ((ProfileNaviFeatureInfo) it3.next()).effectId;
                        if (str2 != null) {
                            arrayList2.add(str2);
                        }
                    }
                    if (z2) {
                        c19426510zP3.LJIIIZ = (C11JF) C11NZ.LJLLILLLL(C11NZ.LJIJJLI(new C2502409rK(c19426510zP3, 4)), C11NZ.LJIJJLI(new C581220Mqu(c19426510zP3, arrayList2, 8)), new InterfaceC500500Jk0() { // from class: X.0Jk6
                            @Override // X.InterfaceC500500Jk0
                            public final Object apply(Object obj, Object obj2) {
                                return new Pair(obj2, obj);
                            }
                        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS163S0200000_29(c19426510zP3, arrayList, 6), new AfS198S0100000_29(c19426510zP3, 47));
                        return;
                    } else {
                        c19426510zP3.LJIIIZ = (C11JF) C11NZ.LJIJJLI(new C581220Mqu(c19426510zP3, arrayList2, 8)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS163S0200000_29(c19426510zP3, arrayList, 7), new AfS198S0100000_29(c19426510zP3, 48));
                        return;
                    }
                }
                return;
            }
            return;
        }
        final String str3 = "NaviEffectLoader load() method can only be called once. Developer should always create a new instance of NaviEffectLoader for each new load.";
        throw new Exception(str3) { // from class: X.111W
            public static final int $stable = 8;
        };
    }

    public C111R(C19GS c19gs, InterfaceC2254081DKk interfaceC2254081DKk, InterfaceC1635390sev interfaceC1635390sev, ShortVideoContext shortVideoContext, Function0 function0, LifecycleOwner lifecycleOwner) {
        this.LIZ = c19gs;
        this.LIZIZ = interfaceC2254081DKk;
        this.LIZJ = interfaceC1635390sev;
        this.LIZLLL = shortVideoContext;
        this.LJ = function0;
        this.LJFF = lifecycleOwner;
        this.LJI = (NaviAvatarListViewModel) C1659640tI2.LIZ(interfaceC2254081DKk.getViewFunction().getView(), c19gs).LIZ(NaviAvatarListViewModel.class);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(418));
        this.LJIILIIL = c01gwLIZIZ;
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        EntryPointStickerLifecycleListener entryPointStickerLifecycleListener = new EntryPointStickerLifecycleListener(lifecycle, new AwS608S0100000_29(this, 732));
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(entryPointStickerLifecycleListener);
            MessageCenter.removeListener(entryPointStickerLifecycleListener);
            MessageCenter.addListener(entryPointStickerLifecycleListener);
        }
        ((LiveData) c01gwLIZIZ.getValue()).observe(this.LJFF, new AObserverS231S0100000_29(this, 205));
    }
}
