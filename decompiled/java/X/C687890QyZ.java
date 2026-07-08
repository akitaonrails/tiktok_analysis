package X;

import Y.ARunnableS110S0100000_10;
import Y.ARunnableS17S0201000_10;
import Y.ARunnableS43S0300000_10;
import Y.ARunnableS79S0200000_10;
import android.app.Activity;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.common.utils.SearchLocationCacheData;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.NativeGpsPopupConfig;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0QyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687890QyZ {
    public static final C687890QyZ LIZ = new C687890QyZ();
    public static final Set<Integer> LIZIZ = C13LQ.LJLIIL(new Integer[]{1, 3, 4});
    public static final Set<Integer> LIZJ = C13LQ.LJLIIL(new Integer[]{1, 2, 3});
    public static final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());

    public static NativeGpsPopupConfig LJII() {
        NativeGpsPopupConfig nativeGpsPopupConfig = (NativeGpsPopupConfig) C687990Qyj.LIZIZ.getValue();
        NativeGpsPopupConfig nativeGpsPopupConfig2 = new NativeGpsPopupConfig();
        nativeGpsPopupConfig2.popupDelayMs = C13LZ.LJ(nativeGpsPopupConfig.popupDelayMs, 0, 10000);
        nativeGpsPopupConfig2.cooldownAfterCloseDays = C13LZ.LJ(nativeGpsPopupConfig.cooldownAfterCloseDays, 0, 365);
        nativeGpsPopupConfig2.cooldownUpgradeDays = C13LZ.LJ(nativeGpsPopupConfig.cooldownUpgradeDays, 0, 365);
        int i = nativeGpsPopupConfig.upgradeThreshold;
        if (i < 1) {
            i = 1;
        }
        nativeGpsPopupConfig2.upgradeThreshold = i;
        return nativeGpsPopupConfig2;
    }

    public static String LJIIIIZZ() {
        Object c098200Yq;
        try {
            c098200Yq = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLJLL;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        return str == null ? "" : str;
    }

    public static String LJIIIZ() {
        Object c098200Yq;
        try {
            c098200Yq = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLIZLLLIL;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (str == null || !(!a0.LJJJIL(str))) {
            return null;
        }
        return str;
    }

    public static void LIZ(C687920Qyc c687920Qyc) {
        C0PPN c0ppn = C0PPN.LIZ;
        String str = c687920Qyc.LJ;
        EnumC682580Qq0 enumC682580Qq0 = c687920Qyc.LIZ;
        c0ppn.getClass();
        C0PPN.LIZ("activity_invalid_after_delay", str, enumC682580Qq0, null);
        c687920Qyc.LJIILIIL.LIZIZ(204, "activity_invalid");
    }

    public static C1207520hWo LIZIZ(C687920Qyc c687920Qyc) {
        String str = c687920Qyc.LIZJ;
        String str2 = c687920Qyc.LIZLLL;
        Pair[] pairArr = new Pair[3];
        String str3 = c687920Qyc.LJ;
        if (str3 == null) {
            str3 = "";
        }
        boolean z = false;
        pairArr[0] = new Pair("search_id", str3);
        pairArr[1] = new Pair("trigger_source", c687920Qyc.LIZ.getValue());
        pairArr[2] = new Pair("fe_flag", "native");
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        if (c687920Qyc.LIZIZ == EnumC687950Qyf.PRECISE) {
            z = true;
        }
        return new C1207520hWo(str, str2, mapLJIIIIZZ, null, false, false, Boolean.valueOf(z), null, null, 440);
    }

    public static void LIZJ(C687920Qyc c687920Qyc) {
        C19EG c19eg;
        Fragment fragment;
        Activity activity = c687920Qyc.LJIIJJI.get();
        if (!(activity instanceof C19EG) || (c19eg = (C19EG) activity) == null || (fragment = c687920Qyc.LJIIL.get()) == null) {
            return;
        }
        try {
            SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchGlobalViewModel.class);
            searchGlobalViewModel.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(searchGlobalViewModel), null, null, new C0CVR(searchGlobalViewModel, null), 3);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static boolean LIZLLL(C687920Qyc c687920Qyc) {
        Object c098200Yq;
        Activity activity = c687920Qyc.LJIIJJI.get();
        Fragment fragment = c687920Qyc.LJIIL.get();
        boolean z = false;
        if (activity != null) {
            SAFHelper.LIZ.getClass();
            if (!SAFHelper.LJJJJIZL(activity) && !SAFHelper.LJJJJ(activity) && fragment != null && fragment.isAdded() && fragment.getView() != null) {
                try {
                    if (fragment.getViewLifecycleOwner().getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                        z = true;
                    }
                    c098200Yq = Boolean.valueOf(z);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Boolean bool = Boolean.FALSE;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = bool;
                }
                return ((Boolean) c098200Yq).booleanValue();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r5) >= r7) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.C687920Qyc r18) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C687890QyZ.LJI(X.0Qyc):void");
    }

    public static Map LJIIJ(C687920Qyc c687920Qyc) {
        boolean zLJJIJ;
        Object c098200Yq;
        boolean zLJ;
        Object c098200Yq2;
        Activity activity = c687920Qyc.LJIIJJI.get();
        if (activity == null) {
            return C2097608Jq.LJ();
        }
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        if (iLocationBaseServiceForMT == null) {
            zLJJIJ = false;
        } else {
            try {
                zLJJIJ = iLocationBaseServiceForMT.LJJIJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        c098200Yq = Boolean.valueOf(zLJJIJ);
        C189200o6.m2constructorimpl(c098200Yq);
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        boolean zBooleanValue = ((Boolean) c098200Yq).booleanValue();
        if (iLocationBaseServiceForMT == null) {
            zLJ = false;
        } else {
            try {
                zLJ = iLocationBaseServiceForMT.LJ(activity);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
        }
        c098200Yq2 = Boolean.valueOf(zLJ);
        C189200o6.m2constructorimpl(c098200Yq2);
        Boolean bool2 = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = bool2;
        }
        boolean zBooleanValue2 = ((Boolean) c098200Yq2).booleanValue();
        PermissionCache.LL.getClass();
        return C2097608Jq.LJIIIIZZ(new Pair("inapp_is_precise", Integer.valueOf(zBooleanValue ? 1 : 0)), new Pair("system_is_precise", Integer.valueOf(zBooleanValue2 ? 1 : 0)), new Pair("enable_location", Integer.valueOf(PermissionCache.LIZIZ("android.permission.ACCESS_COARSE_LOCATION") ? 1 : 0)));
    }

    public static void LJFF(C687920Qyc c687920Qyc, Function1 function1) {
        int i = c687920Qyc.LJI;
        if (i <= 0) {
            if (!LIZLLL(c687920Qyc)) {
                LIZ(c687920Qyc);
                return;
            } else {
                function1.invoke(c687920Qyc);
                return;
            }
        }
        C786410Ut5.LJLIIL(i, LIZLLL, new ARunnableS79S0200000_10(c687920Qyc, function1, 4));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Qya] */
    public static C687900Qya LJIIJJI(final C687920Qyc c687920Qyc, final Map map) {
        Object c098200Yq;
        InterfaceC688000Qyk interfaceC688000Qyk = new InterfaceC688000Qyk() { // from class: X.0QyN
            @Override // X.InterfaceC688000Qyk
            public final void LIZ() {
                Fragment fragment;
                Object c098200Yq2;
                C19EG c19eg;
                final C687890QyZ c687890QyZ = C687890QyZ.LIZ;
                final C687920Qyc c687920Qyc2 = c687920Qyc;
                c687890QyZ.getClass();
                Activity activity = c687920Qyc2.LJIIJJI.get();
                if (activity == null || (fragment = c687920Qyc2.LJIIL.get()) == null) {
                    return;
                }
                if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
                    try {
                        SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) C679340Qkm.LIZIZ(fragment, c19eg).get(SearchGlobalViewModel.class);
                        searchGlobalViewModel.getClass();
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(searchGlobalViewModel), null, null, new C0CVS(searchGlobalViewModel, null), 3);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    try {
                        C0Q3E.LJI().fe(new C639800P7q());
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                }
                try {
                    C1207450hWh c1207450hWh = C1207450hWh.LIZ;
                    C688040Qyo.LIZ.getClass();
                    c1207450hWh.LJIIL("search", "poi_biz", C688040Qyo.LIZJ, C688040Qyo.LIZIZ, new InterfaceC687820QyS() { // from class: X.0QyK
                        @Override // X.InterfaceC687820QyS
                        public final void LIZ(LocationData locationData) {
                            C19EG c19eg2;
                            C687890QyZ c687890QyZ2 = c687890QyZ;
                            C687920Qyc c687920Qyc3 = c687920Qyc2;
                            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                                Activity activity2 = c687920Qyc3.LJIIJJI.get();
                                if (activity2 instanceof C19EG) {
                                    c19eg2 = (C19EG) activity2;
                                } else {
                                    c19eg2 = null;
                                }
                                try {
                                    SearchLocationCacheData.LIZ.LJII(locationData, c19eg2, 0);
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                                }
                                if (c687920Qyc3.LIZ == EnumC682580Qq0.NATIVE_BANNER && c19eg2 != null) {
                                    try {
                                        int i = C651950Phh.LLILLL;
                                        C640790PBl.LIZ(c19eg2, SAFExtensionKt.LJIILLIIL(c19eg2), "place_change");
                                        C189200o6.m2constructorimpl(Unit.LIZ);
                                    } catch (Throwable th4) {
                                        TryCatchGuardChecker.doCheck(th4);
                                        C189200o6.m2constructorimpl(new C098200Yq(th4));
                                    }
                                }
                                c687890QyZ2.getClass();
                                C687890QyZ.LIZJ(c687920Qyc3);
                                return;
                            }
                            C786410Ut5.LJJZZIII(C687890QyZ.LIZLLL, new ARunnableS43S0300000_10(c687920Qyc3, this, c687890QyZ2, locationData, 0));
                        }

                        @Override // X.InterfaceC687820QyS
                        public final void onError(int i, String str) {
                            Activity activity2;
                            C687890QyZ c687890QyZ2 = c687890QyZ;
                            C687920Qyc c687920Qyc3 = c687920Qyc2;
                            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                                Activity activity3 = c687920Qyc3.LJIIJJI.get();
                                if (activity3 instanceof C19EG) {
                                    activity2 = activity3;
                                } else {
                                    activity2 = null;
                                }
                                try {
                                    SearchLocationCacheData.LIZ.LJII(null, activity2, i);
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                                }
                                c687890QyZ2.getClass();
                                C687890QyZ.LIZJ(c687920Qyc3);
                                return;
                            }
                            C786410Ut5.LJJZZIII(C687890QyZ.LIZLLL, new ARunnableS17S0201000_10(c687920Qyc3, this, c687890QyZ2, i, 0));
                        }
                    }, -1L);
                    c098200Yq2 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq2 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                    if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                        C786410Ut5.LJJZZIII(C687890QyZ.LIZLLL, new ARunnableS110S0100000_10(c687920Qyc2, 7));
                    } else {
                        C687890QyZ.LIZ.getClass();
                        C687890QyZ.LIZJ(c687920Qyc2);
                    }
                }
            }
        };
        Object obj = null;
        try {
            Fragment fragment = c687920Qyc.LJIIL.get();
            if (fragment != null && fragment.getView() != null) {
                c098200Yq = fragment.getViewLifecycleOwner();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        InterfaceC2485609oc.LJJJ.getClass();
        final InterfaceC688000Qyk interfaceC688000Qyk2 = (InterfaceC688000Qyk) C2485409oa.LIZIZ.LIZ((LifecycleOwner) obj, interfaceC688000Qyk);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return new InterfaceC1207030hW1() { // from class: X.0Qya
            @Override // X.InterfaceC1207030hW1
            public final void LIZ() {
                Number number;
                Number number2;
                if (atomicBoolean.compareAndSet(false, true)) {
                    C687910Qyb c687910Qyb = C687910Qyb.LIZ;
                    boolean z = c687920Qyc.LJIIJ;
                    c687910Qyb.getClass();
                    C687930Qyd.LIZ.getClass();
                    Map mapLIZIZ = C687930Qyd.LIZIZ("tt_poi_search_permission");
                    if (mapLIZIZ == null) {
                        mapLIZIZ = C2097608Jq.LJ();
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(mapLIZIZ);
                    linkedHashMap.put("turnOnPopup", C2097608Jq.LJIIIIZZ(new Pair("closePopupCount", 0L), new Pair("closePopupValidTime", 0L)));
                    try {
                        C687930Qyd.LIZJ().LJIIIIZZ(linkedHashMap, "tt_poi_search_permission");
                        InterfaceC1870830ymf interfaceC1870830ymfLIZJ = C687930Qyd.LIZJ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("tt_poi_search_permission");
                        sbLIZ.append("_TIME");
                        C189200o6.m2constructorimpl(Boolean.valueOf(interfaceC1870830ymfLIZJ.LJI(C2188811AlT.LIZIZ(sbLIZ))));
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                    if (z) {
                        C687910Qyb.LIZJ(0L);
                    }
                    C687890QyZ c687890QyZ = C687890QyZ.LIZ;
                    C687920Qyc c687920Qyc2 = c687920Qyc;
                    c687890QyZ.getClass();
                    Map<String, ? extends Object> mapLJIIJ = C687890QyZ.LJIIJ(c687920Qyc2);
                    C687920Qyc c687920Qyc3 = c687920Qyc;
                    if (c687920Qyc3.LIZ == EnumC682580Qq0.NATIVE_BANNER) {
                        C0PPN c0ppn = C0PPN.LIZ;
                        Map<String, Object> map2 = map;
                        EnumC687950Qyf enumC687950Qyf = c687920Qyc3.LIZIZ;
                        Object obj2 = map2.get("enable_location");
                        int iIntValue = (!(obj2 instanceof Number) || (number2 = (Number) obj2) == null) ? 0 : number2.intValue();
                        Object obj3 = map2.get("system_is_precise");
                        String str = iIntValue == 0 ? "turn_on" : (enumC687950Qyf == EnumC687950Qyf.PRECISE && ((!(obj3 instanceof Number) || (number = (Number) obj3) == null) ? 0 : number.intValue()) == 0) ? "use_precise" : "update";
                        Map<String, Object> map3 = map;
                        c0ppn.getClass();
                        Pair[] pairArr = new Pair[6];
                        String str2 = c687920Qyc3.LJ;
                        if (str2 == null) {
                            str2 = "";
                        }
                        pairArr[0] = new Pair("search_id", str2);
                        String str3 = c687920Qyc3.LJFF;
                        pairArr[1] = new Pair("search_keyword", str3 != null ? str3 : "");
                        pairArr[2] = new Pair("enter_from", c687920Qyc3.LIZJ);
                        pairArr[3] = new Pair("enter_method", c687920Qyc3.LIZLLL);
                        pairArr[4] = new Pair("trigger_source", c687920Qyc3.LIZ.getValue());
                        pairArr[5] = new Pair("fe_flag", "native");
                        HashMap map4 = new HashMap(C2097608Jq.LJIIIIZZ(pairArr));
                        map4.put("fe_flag", "native");
                        map4.put("click_type", str);
                        C0PPN.LIZJ(map3.get("enable_location"), "orginal_enable_location", map4);
                        C0PPN.LIZJ(map3.get("inapp_is_precise"), "orginal_inapp_is_precise", map4);
                        C0PPN.LIZJ(map3.get("system_is_precise"), "orginal_system_is_precise", map4);
                        C0PPN.LIZJ(mapLJIIJ.get("enable_location"), "update_enable_location", map4);
                        C0PPN.LIZJ(mapLJIIJ.get("inapp_is_precise"), "update_inapp_is_precise", map4);
                        C0PPN.LIZJ(mapLJIIJ.get("system_is_precise"), "update_system_is_precise", map4);
                        C20684815ws.LJIILLIIL("click_place_update_success", map4);
                        interfaceC688000Qyk2.LIZ();
                    }
                    c687920Qyc.LJIILIIL.LIZ(mapLJIIJ);
                }
            }

            @Override // X.InterfaceC1207030hW1
            public final void LIZJ(int i) {
                if (!atomicBoolean.compareAndSet(false, true)) {
                    return;
                }
                C687890QyZ c687890QyZ = C687890QyZ.LIZ;
                C687920Qyc c687920Qyc2 = c687920Qyc;
                c687890QyZ.getClass();
                C687890QyZ.LJ(c687920Qyc2, i, true);
                c687920Qyc.LJIILIIL.LJ(i);
            }

            @Override // X.InterfaceC1207030hW1
            public final void LIZIZ(int i, String str) {
                if (!atomicBoolean.compareAndSet(false, true)) {
                    return;
                }
                C687890QyZ c687890QyZ = C687890QyZ.LIZ;
                C687920Qyc c687920Qyc2 = c687920Qyc;
                c687890QyZ.getClass();
                C687890QyZ.LJ(c687920Qyc2, i, false);
                c687920Qyc.LJIILIIL.LIZIZ(i, str);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C687920Qyc r12, int r13, boolean r14) {
        /*
            if (r14 == 0) goto L9d
            java.util.Set<java.lang.Integer> r1 = X.C687890QyZ.LIZIZ
        L4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto La1
            X.0Qyb r5 = X.C687910Qyb.LIZ
            int r10 = r12.LJII
            int r9 = r12.LJIIIIZZ
            int r4 = r12.LJIIIZ
            boolean r0 = r12.LJIIJ
            long r2 = java.lang.System.currentTimeMillis()
            r5.getClass()
            r13 = 1
            java.lang.String r6 = "turnOnPopup"
            if (r0 == 0) goto L4e
            X.0Qyd r0 = X.C687930Qyd.LIZ
            r0.getClass()
            java.lang.String r0 = "tt_poi_search_popup"
            java.util.Map r0 = X.C687930Qyd.LIZIZ(r0)
            if (r0 == 0) goto L9a
            java.lang.Object r1 = r0.get(r6)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L9a
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L9a
            java.lang.String r0 = "closeCount"
            long r7 = X.C687910Qyb.LIZ(r5, r1, r0)
        L44:
            long r7 = r7 + r13
            long r4 = (long) r4
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 < 0) goto L4b
            r10 = r9
        L4b:
            X.C687910Qyb.LIZJ(r7)
        L4e:
            long r4 = (long) r10
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 * r0
            long r4 = r4 + r2
            long r11 = r4 - r2
            X.0Qyd r0 = X.C687930Qyd.LIZ
            r0.getClass()
            java.lang.String r8 = "tt_poi_search_permission"
            java.util.Map r0 = X.C687930Qyd.LIZIZ(r8)
            if (r0 != 0) goto L67
            java.util.Map r0 = X.C2097608Jq.LJ()
        L67:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r0)
            r0 = 2
            kotlin.Pair[] r10 = new kotlin.Pair[r0]
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "closePopupCount"
            r1.<init>(r0, r9)
            r0 = 0
            r10[r0] = r1
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "closePopupValidTime"
            r1.<init>(r0, r4)
            r0 = 1
            r10[r0] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r10)
            r7.put(r6, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            X.C687930Qyd.LIZLLL(r2, r0, r8, r7)
            return
        L9a:
            r7 = 0
            goto L44
        L9d:
            java.util.Set<java.lang.Integer> r1 = X.C687890QyZ.LIZJ
            goto L4
        La1:
            X.0PPN r0 = X.C0PPN.LIZ
            java.lang.String r3 = r12.LJ
            X.0Qq0 r2 = r12.LIZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0.getClass()
            java.lang.String r0 = "sdk_reject"
            X.C0PPN.LIZ(r0, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C687890QyZ.LJ(X.0Qyc, int, boolean):void");
    }
}
