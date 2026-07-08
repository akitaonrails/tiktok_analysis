package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.ecommerce.dependency.legacy.LegacyDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.geccard.ECMMKGecCardManager$initLifecycle$1;
import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.ECGecCardMallConfigModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.legacy.ILegacyDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18c1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21319918c1 implements InterfaceC21319518bx {
    public final InterfaceC1773310wFN LIZ;
    public final C21328418dO LIZIZ;
    public final C21326718d7 LIZJ;
    public final C21319018bs LIZLLL;
    public final Map<String, ? extends Object> LJ;
    public final C01GW LJFF;

    @Override // X.InterfaceC21319518bx
    public final void ensureNotReachHere() {
    }

    public C21319918c1(Context context, ECMMKContainerController eCMMKContainerController) {
        C21326718d7 c21326718d7;
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        Object objValueOf;
        boolean z;
        String name;
        String str;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3;
        AnonymousClass0317 anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin;
        IECommerceHostService iECommerceHostService3;
        boolean z2;
        boolean z3;
        String name2;
        boolean z4;
        String name3;
        boolean z5;
        String name4;
        boolean z6;
        String name5;
        IECommerceHostService iECommerceHostService4;
        boolean z7;
        String name6;
        boolean z8;
        String name7;
        this.LIZ = eCMMKContainerController;
        C21320518c7.LIZ.LIZ();
        C21322218cO c21322218cO = C21322218cO.LIZ;
        c21322218cO.getClass();
        InterfaceC21322918cV interfaceC21322918cVLJ = C21322218cO.LJ(context, "MixMall");
        C21329018dU c21329018dULIZIZ = interfaceC21322918cVLJ.LIZIZ();
        C21328418dO c21328418dO = new C21328418dO(c21329018dULIZIZ == null ? new C21329018dU((Object) null) : c21329018dULIZIZ);
        this.LIZIZ = c21328418dO;
        C1168270gVV.LIZ.getClass();
        InterfaceC1168310gVZ interfaceC1168310gVZ = (InterfaceC1168310gVZ) C1168270gVV.LJIIIIZZ().get("MixMall");
        if (interfaceC1168310gVZ == null) {
            C1325860kbg.LIZIZ(null, AFwS223S0000000_32.get$arr$(276), C2097608Jq.LJ());
        }
        C21322018cM c21322018cM = C21322218cO.LJI;
        Reference reference = (Reference) ((ConcurrentHashMap) c21322018cM.LJFF.getValue()).get("MixMall");
        if (reference != null && (c21326718d7 = (C21326718d7) reference.get()) != null) {
            Context context2 = c21326718d7.LIZ;
            c21322218cO.getClass();
            C21322218cO.LJIIJ(context2, context);
        } else {
            c21326718d7 = null;
        }
        if (c21326718d7 == null) {
            c21326718d7 = new C21326718d7(context, "MixMall", c21328418dO);
            if (interfaceC1168310gVZ != null) {
                c21326718d7.LJIIIIZZ = interfaceC1168310gVZ.LJIIJ();
                c21326718d7.LJIIL = interfaceC1168310gVZ.LIZJ();
                c21326718d7.LJIILIIL = true;
            }
            c21326718d7.LJJJLL = new AwS570S0100000_26(this, 1565);
            c21322218cO.getClass();
            ((ConcurrentHashMap) c21322018cM.LJFF.getValue()).put("MixMall", new WeakReference(c21326718d7));
        }
        this.LIZJ = c21326718d7;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            String name8 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name7 = iECommerceHostService.getClass().getName();
            } else {
                name7 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name8, name7, z8);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).getVersionInfo().LIZLLL.length() > 0) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService4 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService4 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                String name9 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService4 != null) {
                    name6 = iECommerceHostService4.getClass().getName();
                } else {
                    name6 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name9, name6, z7);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService4 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            objValueOf = ((IApplicationDependencyService) iECommerceHostService4).getVersionInfo().LIZLLL;
        } else {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name10 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name10, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            objValueOf = Long.valueOf(((IApplicationDependencyService) iECommerceHostService2).getVersionInfo().LIZIZ);
        }
        linkedHashMap.put("version_code", objValueOf);
        if (C960203pA.LIZIZ(context)) {
            str = "dark";
        } else {
            str = "light";
        }
        linkedHashMap.put("theme", str);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime4 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            String name11 = ILocationDependencyService.class.getName();
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                name5 = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name5 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime4, 1, name11, name5, z6);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        linkedHashMap.put("region", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime5 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            String name12 = ILocationDependencyService.class.getName();
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 != null) {
                name4 = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2.getClass().getName();
            } else {
                name4 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime5, 1, name12, name4, z5);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        linkedHashMap.put("op_region", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin2).getCurrentRegionCode());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime6 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3 = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3 != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            String name13 = ILocationDependencyService.class.getName();
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3 != null) {
                name3 = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3.getClass().getName();
            } else {
                name3 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime6, 1, name13, name3, z4);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        linkedHashMap.put("carrier_region", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin3).getSimCountry());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime7 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin = LegacyDependencyService.createILegacyDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name14 = ILegacyDependencyService.class.getName();
            if (anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime7, 1, name14, name2, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILegacyDependencyService.class);
        }
        String userResidence = ((ILegacyDependencyService) anonymousClass0317CreateILegacyDependencyServicebyMonsterPlugin).getUserResidence();
        linkedHashMap.put("residence", userResidence == null ? "" : userResidence);
        this.LJ = linkedHashMap;
        if (c21326718d7.LJJJI) {
            List<AbstractC21324618cm> listSingletonList = Collections.singletonList(new AbstractC21324618cm() { // from class: X.18c4
                @Override // X.InterfaceC21320318c5
                public final String LIZ() {
                    return "mmk-s-video";
                }

                @Override // X.AbstractC21324618cm
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.AbstractC21324618cm
                public final int LIZJ() {
                    return 2;
                }
            });
            Map<String, AbstractC21324618cm> map = C21325218cs.LIZ;
            C1325860kbg.LIZ();
            HashMap<String, HashMap<String, AbstractC21324618cm>> map2 = C21325218cs.LIZIZ;
            HashMap<String, AbstractC21324618cm> map3 = new HashMap<>();
            for (AbstractC21324618cm abstractC21324618cm : listSingletonList) {
                map3.put(abstractC21324618cm.LIZ(), abstractC21324618cm);
            }
            map2.put("MixMall", map3);
        }
        C21320118c3.LIZ.getClass();
        Integer num = ((ECGecCardMallConfigModel) C21320118c3.LIZJ.getValue()).enableViewPool;
        if (num != null && num.intValue() == 1) {
            this.LIZJ.LJII(true);
        }
        this.LIZJ.LJJJLIIL = new C21323118cX(interfaceC21322918cVLJ);
        C21319018bs c21319018bs = new C21319018bs(this.LIZIZ, this);
        this.LIZLLL = c21319018bs;
        c21319018bs.LIZJ.LIZIZ = new AwS576S0100000_32(this, 811);
        c21319018bs.LJ("ecMallUpdateCardData", AFwS223S0000000_32.get$arr$(277));
        c21319018bs.LJ("ecMallTriggerCardRefresh", new AwS576S0100000_32(this, 812));
        c21319018bs.LJ("ecMallOpenSchema", new AwS576S0100000_32(this, 813));
        c21319018bs.LJ("ecMallAddBtmBcmConfig", new AwS576S0100000_32(this, 814));
        c21319018bs.LJ("ecMallSchemaMerge", new AwS576S0100000_32(this, 815));
        c21319018bs.LJ("ecMallPublishBridgeEvent", new AwS576S0100000_32(this, 816));
        c21319018bs.LJ("ecMallAddBridgeEventObserver", new AwS576S0100000_32(this, 817));
        c21319018bs.LJ("ecMallRemoveBridgeEventObserver", new AwS576S0100000_32(this, 818));
        c21319018bs.LJ("ecMallSetGlobalContext", new AwS576S0100000_32(this, StrategyCenter.ENABLE_SMART_SERVICE));
        c21319018bs.LJ("ecMallGetGlobalContext", new AwS576S0100000_32(this, 809));
        c21319018bs.LJ("ecMallSetStorageItem", AFwS217S0000000_28.get$arr$(713));
        c21319018bs.LJ("ecMallLogin", new AwS576S0100000_32(this, 810));
        C0R1H.LIZIZ(this.LIZ.LIZLLL().LIZJ, new ECMMKGecCardManager$initLifecycle$1(this));
        this.LJFF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 807));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime8 = SystemClock.elapsedRealtime();
            iECommerceHostService3 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService3 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1AQS.LIZJ(jElapsedRealtime8, 1, IApplicationDependencyService.class.getName(), iECommerceHostService3 != null ? iECommerceHostService3.getClass().getName() : null, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        ((IApplicationDependencyService) iECommerceHostService3).isOffline();
    }
}
