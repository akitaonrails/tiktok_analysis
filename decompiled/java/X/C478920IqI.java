package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLivePreloadConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.MultiTopLivePlayFeedListViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.LiveTab;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.MGModuleTab;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: renamed from: X.0IqI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478920IqI {
    public static InterfaceC476860Imy LIZIZ;
    public static volatile long LIZJ;
    public static volatile C478930IqJ LJFF;
    public static volatile C478940IqK LJI;
    public static WeakReference<C0IVA> LJII;
    public static final C478920IqI LIZ = new C478920IqI();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(307));
    public static volatile ConcurrentHashMap<String, C00IB> LJ = new ConcurrentHashMap<>();

    public static void LIZJ() {
        TabMGTopLive tabMGTopLive;
        List<MGModuleInteraction> list;
        TabMGTopLive tabMGTopLive2;
        List<MGModuleTab> list2;
        C0IVA c0iva;
        WeakReference<C0IVA> weakReference = LJII;
        if (weakReference != null && (c0iva = weakReference.get()) != null) {
            LIZ.getClass();
            if (LIZIZ == null) {
                LIZIZ = C474850Ijj.LIZIZ();
            }
            InterfaceC476860Imy interfaceC476860Imy = LIZIZ;
            if (interfaceC476860Imy != null) {
                interfaceC476860Imy.LIZJ(c0iva);
            }
        }
        LJII = null;
        LIZIZ = null;
        LIZLLL("clearAllCaches");
        C478930IqJ c478930IqJ = LJFF;
        if (c478930IqJ != null && (tabMGTopLive2 = c478930IqJ.LIZ) != null && (list2 = tabMGTopLive2.tabModule) != null) {
            list2.clear();
        }
        C478930IqJ c478930IqJ2 = LJFF;
        if (c478930IqJ2 != null && (tabMGTopLive = c478930IqJ2.LIZ) != null && (list = tabMGTopLive.interactionModule) != null) {
            list.clear();
        }
        LJFF = null;
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", "MultiTopLiveDataCacheManager Cleared all top module data cache");
        LJI = null;
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", "MultiTopLiveDataCacheManager Cleared play feed data cache");
        LIZJ = 0L;
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", "MultiTopLiveDataCacheManager Card feed data fetch timestamp reset");
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", "MultiTopLiveDataCacheManager Cleared all caches");
    }

    public static int LJI() {
        return ((Number) LIZLLL.getValue()).intValue();
    }

    public static void LIZLLL(String str) {
        LJ.clear();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLiveDataCacheManager Cleared all module room data cache, source: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Pair LJ(String str) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLiveDataCacheManager getCachedPlayFeedData, source: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", C2188811AlT.LIZIZ(sbLIZ));
        C478940IqK c478940IqK = LJI;
        if (c478940IqK == null) {
            return new Pair(Boolean.TRUE, null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - c478940IqK.LIZIZ;
        if (LJI() > 0 && jCurrentTimeMillis > ((long) LJI()) * 1000) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MultiTopLiveDataCacheManagerPlay feed data expiration check - Elapsed time: ");
        sbLIZ2.append(jCurrentTimeMillis);
        sbLIZ2.append(" ms, Expired: ");
        sbLIZ2.append(z);
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", C2188811AlT.LIZIZ(sbLIZ2));
        if (z) {
            Boolean bool = Boolean.TRUE;
            List listLLIIII = C13LP.LLIIII(c478940IqK.LIZ);
            if (!Intrinsics.LJFF(str, "hasHitPlayFeedCache") && !Intrinsics.LJFF(str, "preloadPlayFeedDataForRender")) {
                LJI = null;
            }
            return new Pair(bool, listLLIIII);
        }
        Boolean bool2 = Boolean.FALSE;
        List listLLIIII2 = C13LP.LLIIII(c478940IqK.LIZ);
        if (!Intrinsics.LJFF(str, "hasHitPlayFeedCache") && !Intrinsics.LJFF(str, "preloadPlayFeedDataForRender")) {
            LJI = null;
        }
        return new Pair(bool2, listLLIIII2);
    }

    public static C478930IqJ LJFF(String str) {
        long j;
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C478930IqJ c478930IqJ = LJFF;
        if (c478930IqJ != null) {
            j = c478930IqJ.LIZIZ;
        } else {
            j = 0;
        }
        long j2 = jCurrentTimeMillis - j;
        if (j2 > ((long) MultiGuestTopLivePreloadConfigSetting.getValue().topModuleCacheTimeoutDuration) * 1000) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLiveDataCacheManager topModule data expiration check, source: ");
        sbLIZ.append(str);
        sbLIZ.append(": Elapsed time: ");
        sbLIZ.append(j2);
        sbLIZ.append(" ms, Expired: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C478930IqJ c478930IqJ2 = LJFF;
            if (c478930IqJ2 != null) {
                c478930IqJ2.LIZJ = true;
                return c478930IqJ2;
            }
            return null;
        }
        C478930IqJ c478930IqJ3 = LJFF;
        if (c478930IqJ3 != null) {
            c478930IqJ3.LIZJ = false;
            return c478930IqJ3;
        }
        return null;
    }

    public static String LJII(MGModuleInteraction mGModuleInteraction) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(mGModuleInteraction.innerFeedMgAggId);
        sbLIZ.append('_');
        sbLIZ.append(mGModuleInteraction.type);
        sbLIZ.append('_');
        sbLIZ.append(mGModuleInteraction.name);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(TabMGTopLive tabMGTopLive, String str) {
        if (tabMGTopLive == null) {
            return;
        }
        LJFF = new C478930IqJ(tabMGTopLive, System.currentTimeMillis());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLiveDataCacheManager Cached topModule data, source: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZ(List list, EnumC479370Ir1 enumC479370Ir1, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LIZJ = jCurrentTimeMillis;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLiveDataCacheManager Card feed data fetch timestamp recorded: ");
        sbLIZ.append(LIZJ);
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC479370Ir1 != EnumC479370Ir1.INIT && enumC479370Ir1 != EnumC479370Ir1.PRELOAD) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MultiTopLiveDataCacheManager should not Cached playFeed data, only record time, source: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", scene: ");
            sbLIZ2.append(enumC479370Ir1);
            C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        LJI = new C478940IqK(new ArrayList(list), jCurrentTimeMillis);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("MultiTopLiveDataCacheManager Cached playFeed data, source: ");
        sbLIZ3.append(str);
        sbLIZ3.append(", with ");
        sbLIZ3.append(list.size());
        sbLIZ3.append(" items, scene: ");
        sbLIZ3.append(enumC479370Ir1);
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static void LJIIIIZZ(EnumC479370Ir1 enumC479370Ir1, String str, String str2, final LifecycleCoroutineScope lifecycleCoroutineScope, MultiTopLivePlayFeedListViewModel multiTopLivePlayFeedListViewModel, InterfaceC476860Imy interfaceC476860Imy, C479440Ir8 c479440Ir8, Function0 function0, Function0 function02) {
        C23250099c.LIZLLL(lifecycleCoroutineScope, null, null, new C478480Ipa(function0, function02, enumC479370Ir1, null, c479440Ir8, str2, interfaceC476860Imy, multiTopLivePlayFeedListViewModel, str, null), 3);
        if (!TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            WeakReference<C0IVA> weakReference = new WeakReference<>(new C0IVA() { // from class: X.0IpV
                public final /* synthetic */ C477580Io8 LIZ = null;

                @Override // X.C0IVA
                public final void LIZ(EnumC471750Iej enumC471750Iej, long j) {
                }

                @Override // X.C0IVA
                public final void LIZIZ(EnumC471750Iej enumC471750Iej, boolean z) {
                    List listLIZJ;
                    Object next;
                    if (this.LIZ == null || (listLIZJ = C477580Io8.LIZIZ()) == null || listLIZJ.isEmpty()) {
                        if (this.LIZ != null) {
                            listLIZJ = C477580Io8.LIZJ();
                        } else {
                            listLIZJ = null;
                        }
                    }
                    if (listLIZJ == null) {
                        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", "update TopModuleData from dataListener failed, tabs is null");
                        return;
                    }
                    if (z && C695930RRn.LIZLLL(listLIZJ)) {
                        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", "update TopModuleData from dataListener");
                        Iterator it2 = listLIZJ.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (((LiveTab) next).type == 2) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        LiveTab liveTab = (LiveTab) next;
                        if (liveTab != null) {
                            C23250099c.LIZLLL(lifecycleCoroutineScope, C0PEM.LIZJ, null, new C478420IpU(liveTab, null), 2);
                        } else {
                            C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", "update TopModuleData from dataListener, but data not found");
                        }
                    }
                }
            });
            LJII = weakReference;
            C0IVA c0iva = weakReference.get();
            if (c0iva != null) {
                LIZ.getClass();
                if (LIZIZ == null) {
                    LIZIZ = C474850Ijj.LIZIZ();
                }
                InterfaceC476860Imy interfaceC476860Imy2 = LIZIZ;
                if (interfaceC476860Imy2 != null) {
                    interfaceC476860Imy2.LJFF(c0iva);
                }
            }
        }
    }
}
