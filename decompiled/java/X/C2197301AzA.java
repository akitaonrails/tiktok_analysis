package X;

import X.AbstractC20656215sG;
import X.C2197301AzA;
import X.C2197311AzB;
import X.EnumC2008307tp;
import X.InterfaceC20661315t5;
import X.InterfaceC2197321AzC;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1AzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197301AzA {
    public static final C2197301AzA LIZ = new C2197301AzA();
    public static final CopyOnWriteArrayList<InterfaceC2197341AzE> LIZIZ = new CopyOnWriteArrayList<>();
    public static final ConcurrentHashMap<Fragment, List<C2197311AzB>> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Fragment, LifecycleEventObserver> LIZLLL = new ConcurrentHashMap<>();

    public static AbstractC2192621Arc LIZ(Fragment fragment, AbstractC20656215sG abstractC20656215sG, InterfaceC20661315t5 interfaceC20661315t5) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2197341AzE interfaceC2197341AzE : LIZIZ) {
            if (interfaceC2197341AzE instanceof InterfaceC2197331AzD) {
                InterfaceC2197331AzD interfaceC2197331AzD = (InterfaceC2197331AzD) interfaceC2197341AzE;
                if (interfaceC2197331AzD.LIZ(fragment)) {
                    return new C2192611Arb(interfaceC2197331AzD.LJFF());
                }
            } else if ((interfaceC2197341AzE instanceof InterfaceC2197321AzC) && ((InterfaceC2197321AzC) interfaceC2197341AzE).LIZ(fragment)) {
                arrayList.add(interfaceC2197341AzE);
            }
        }
        if (!arrayList.isEmpty()) {
            return new C2192601Ara(((InterfaceC2197341AzE) C13LP.LJJJJZI(arrayList)).LJFF(), arrayList);
        }
        return C2192631Ard.LIZ;
    }

    public static void LIZIZ(Fragment fragment, AbstractC20656215sG abstractC20656215sG, InterfaceC20661315t5 interfaceC20661315t5) {
        String triggerId;
        C2197351AzF c2197351AzF = C2197351AzF.LIZ;
        String strLIZ = C20647515qr.LIZ(abstractC20656215sG);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (interfaceC20661315t5 != null) {
            triggerId = interfaceC20661315t5.getTriggerId();
        } else {
            triggerId = null;
        }
        if (fragment != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment, null);
        }
        PageFinder pageFinderVia = PageFinder.via(fragment);
        c2197351AzF.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7zLJFF);
        C1189060h32.LJJIFFI(c2344009Gk, "popup_key", strLIZ);
        C1189060h32.LJJIFFI(c2344009Gk, "trigger_id", triggerId);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_rd_poi_popup_triggered", map, c1185050gwZ);
        try {
            if (interfaceC20661315t5 == null) {
                PopupManager.LJIJI(abstractC20656215sG, true);
            } else {
                PopupManager.LJIIZILJ(abstractC20656215sG, interfaceC20661315t5);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            new AwS432S0200000_31(abstractC20656215sG, e, 64).invoke();
        }
    }

    public static void LIZLLL(final Fragment fragment, AbstractC20656215sG abstractC20656215sG, InterfaceC20661315t5 interfaceC20661315t5) {
        List<C2197311AzB> listPutIfAbsent;
        if (!(fragment instanceof PoiDetailSlashFragment)) {
            LIZIZ(fragment, abstractC20656215sG, interfaceC20661315t5);
            return;
        }
        ConcurrentHashMap<Fragment, LifecycleEventObserver> concurrentHashMap = LIZLLL;
        if (!concurrentHashMap.containsKey(fragment)) {
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.detail.container.popup.PoiPopupManager$registerFragmentLifecycle$observer$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C2197301AzA c2197301AzA = C2197301AzA.LIZ;
                        Fragment fragment2 = fragment;
                        c2197301AzA.getClass();
                        List<C2197311AzB> listRemove = C2197301AzA.LIZJ.remove(fragment2);
                        if (listRemove != null) {
                            for (C2197311AzB c2197311AzB : listRemove) {
                                Iterator<InterfaceC2197321AzC> it2 = c2197311AzB.LIZJ.iterator();
                                while (it2.hasNext()) {
                                    it2.next().LJI(AFwS225S0000000_34.get$arr$(97));
                                }
                                C2197301AzA c2197301AzA2 = C2197301AzA.LIZ;
                                AbstractC20656215sG abstractC20656215sG2 = c2197311AzB.LIZ;
                                InterfaceC20661315t5 interfaceC20661315t52 = c2197311AzB.LIZIZ;
                                EnumC2008307tp enumC2008307tp = EnumC2008307tp.FRAGMENT_DESTROYED;
                                c2197301AzA2.getClass();
                                C2197301AzA.LIZJ(fragment2, abstractC20656215sG2, interfaceC20661315t52, enumC2008307tp);
                            }
                        }
                        LifecycleEventObserver lifecycleEventObserverRemove = C2197301AzA.LIZLLL.remove(fragment2);
                        if (lifecycleEventObserverRemove != null) {
                            fragment2.getLifecycle().removeObserver(lifecycleEventObserverRemove);
                        }
                    }
                }
            };
            fragment.getLifecycle().addObserver(lifecycleEventObserver);
            concurrentHashMap.put(fragment, lifecycleEventObserver);
        }
        AbstractC2192621Arc abstractC2192621ArcLIZ = LIZ(fragment, abstractC20656215sG, interfaceC20661315t5);
        if (abstractC2192621ArcLIZ instanceof C2192611Arb) {
            LIZJ(fragment, abstractC20656215sG, interfaceC20661315t5, ((C2192611Arb) abstractC2192621ArcLIZ).LIZ);
            return;
        }
        if (abstractC2192621ArcLIZ instanceof C2192601Ara) {
            C2192601Ara c2192601Ara = (C2192601Ara) abstractC2192621ArcLIZ;
            LIZJ(fragment, abstractC20656215sG, interfaceC20661315t5, c2192601Ara.LIZ);
            List<InterfaceC2197321AzC> list = c2192601Ara.LIZIZ;
            C2197311AzB c2197311AzB = new C2197311AzB(abstractC20656215sG, interfaceC20661315t5, new ArrayList(list));
            ConcurrentHashMap<Fragment, List<C2197311AzB>> concurrentHashMap2 = LIZJ;
            List<C2197311AzB> arrayList = concurrentHashMap2.get(fragment);
            if (arrayList == null && (listPutIfAbsent = concurrentHashMap2.putIfAbsent(fragment, (arrayList = new ArrayList<>()))) != null) {
                arrayList = listPutIfAbsent;
            }
            arrayList.add(c2197311AzB);
            Iterator<InterfaceC2197321AzC> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJI(new AwS578S0100000_34(fragment, 54));
            }
            return;
        }
        if (abstractC2192621ArcLIZ instanceof C2192631Ard) {
            LIZIZ(fragment, abstractC20656215sG, interfaceC20661315t5);
            return;
        }
        throw new C1954807lC();
    }

    public static void LIZJ(Fragment fragment, AbstractC20656215sG abstractC20656215sG, InterfaceC20661315t5 interfaceC20661315t5, EnumC2008307tp enumC2008307tp) {
        String triggerId;
        C2197351AzF c2197351AzF = C2197351AzF.LIZ;
        String strLIZ = C20647515qr.LIZ(abstractC20656215sG);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        if (interfaceC20661315t5 != null) {
            triggerId = interfaceC20661315t5.getTriggerId();
        } else {
            triggerId = null;
        }
        String reason = enumC2008307tp.getReason();
        if (fragment != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment, null);
        }
        PageFinder pageFinderVia = PageFinder.via(fragment);
        c2197351AzF.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1182410gsJ.LIZIZ(c2344009Gk, interfaceC665370Q7zLJFF);
        C1189060h32.LJJIFFI(c2344009Gk, "popup_key", strLIZ);
        C1189060h32.LJJIFFI(c2344009Gk, "trigger_id", triggerId);
        C1189060h32.LJJIFFI(c2344009Gk, "block_reason", reason);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("ttls_rd_poi_popup_blocked", map, c1185050gwZ);
    }
}
