package X;

import X.AbstractC1028360crq;
import X.C0R1H;
import X.C1049250dPX;
import X.C1388190mED;
import X.C1C7U;
import X.C356901a3;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.commercialize.promote.settings.PromotePreloadSchemaRemoveParametersSettings;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS296S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dPX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049250dPX {
    public static final C1049250dPX LIZ = new C1049250dPX();
    public static AbstractC1028360crq LIZIZ;
    public static final List<String> LIZJ;
    public static C1051290dSp LIZLLL;

    static {
        PromotePreloadSchemaRemoveParametersSettings.PromotePreloadSchemaRemoveParametersModel promotePreloadSchemaRemoveParametersModel;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            promotePreloadSchemaRemoveParametersModel = PromotePreloadSchemaRemoveParametersSettings.LIZ;
            PromotePreloadSchemaRemoveParametersSettings.PromotePreloadSchemaRemoveParametersModel promotePreloadSchemaRemoveParametersModel2 = (PromotePreloadSchemaRemoveParametersSettings.PromotePreloadSchemaRemoveParametersModel) settingsManagerLIZLLL.LJIIIIZZ("promote_preload_schema_remove_parameters", PromotePreloadSchemaRemoveParametersSettings.PromotePreloadSchemaRemoveParametersModel.class, promotePreloadSchemaRemoveParametersModel);
            if (promotePreloadSchemaRemoveParametersModel2 != null) {
                promotePreloadSchemaRemoveParametersModel = promotePreloadSchemaRemoveParametersModel2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            promotePreloadSchemaRemoveParametersModel = PromotePreloadSchemaRemoveParametersSettings.LIZ;
        }
        LIZJ = promotePreloadSchemaRemoveParametersModel.parameters;
    }

    public static void LIZIZ(Context context, String str) {
        C1049260dPY c1049260dPY;
        C1051290dSp c1051290dSp = LIZLLL;
        if (c1051290dSp != null && (c1049260dPY = c1051290dSp.LJFF) != null) {
            c1049260dPY.LIZ(str, false, true);
            String str2 = c1049260dPY.LIZIZ;
            if (str2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("routerPage realurl = ");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
                C811103Ev.LIZ("PromoteAdHybridDelegate");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("routerPage cacheKey = ");
                sbLIZ2.append(C2821017j.LIZ(UriProtector.parse(str2), LIZJ));
                C2188811AlT.LIZIZ(sbLIZ2);
                C811103Ev.LIZ("PromoteAdHybridDelegate");
                AbstractC1028360crq abstractC1028360crq = LIZIZ;
                if (abstractC1028360crq != null) {
                    abstractC1028360crq.LJJII(context, str2);
                }
            }
        }
    }

    public static void LIZ(final Context context, String str, boolean z) {
        Context contextN3;
        String str2;
        C1049260dPY c1049260dPY;
        String str3 = str;
        boolean z2 = false;
        Integer num = (Integer) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).B4().LIZJ(0, "go_live_memory_leak_opt");
        if (num != null && num.intValue() == 1) {
            z2 = true;
        }
        C0WOV c0wov = C0WOV.SPARK;
        if (z2) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = context;
        }
        C1028380crs c1028380crs = new C1028380crs("promote", c0wov, contextN3, new C1029740cu4(null, null, null, null, null, null, false, 127));
        ArrayList<Integer> arrayList = C113500bt.LIZ;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ArrayList<Integer> arrayList2 = C113500bt.LIZ;
        ArrayList<Integer> arrayList3 = (ArrayList) c0c64LJIILLIIL.LJJII(ArrayList.class, arrayList2, "promote_fix_oom", true);
        if (arrayList3 == null) {
            arrayList3 = arrayList2;
        }
        if (C13LP.LJJJJ(Double.valueOf(1.0d), arrayList3)) {
            Runnable runnable = new Runnable() { // from class: com.ss.android.ugc.aweme.commercialize.promote.preload.PromoteAdHybridManager$createContainer$addObserverRunnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    LifecycleOwner lifecycleOwner;
                    C1C7U.LIZ("PromoteAdHybridManager@64bf.createContainer$addObserverRunnable$1");
                    try {
                        ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(context);
                        if (componentCallbacks2LIZ != null && (componentCallbacks2LIZ instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) componentCallbacks2LIZ) != null) {
                            C0R1H.LIZIZ(lifecycleOwner, new AnonymousClass2());
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PromoteAdHybridManager@64bf.createContainer$addObserverRunnable$1");
                }

                /* JADX INFO: renamed from: com.ss.android.ugc.aweme.commercialize.promote.preload.PromoteAdHybridManager$createContainer$addObserverRunnable$1$2, reason: invalid class name */
                public final class AnonymousClass2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                        C356901a3.LIZ(this, lifecycleOwner);
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                        C356901a3.LIZJ(this, lifecycleOwner);
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                        C356901a3.LIZLLL(this, lifecycleOwner);
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                        C356901a3.LJ(this, lifecycleOwner);
                    }

                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                        C356901a3.LJFF(this, lifecycleOwner);
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public final void onDestroy(LifecycleOwner lifecycleOwner) {
                        C1049250dPX.LIZ.getClass();
                        AbstractC1028360crq abstractC1028360crq = C1049250dPX.LIZIZ;
                        if (abstractC1028360crq != null) {
                            abstractC1028360crq.LJIJJLI();
                        }
                        C1049250dPX.LIZIZ = null;
                        C1049250dPX.LIZLLL = null;
                    }
                }
            };
            if (Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
                runnable.run();
            } else {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), runnable);
            }
        }
        C1049260dPY c1049260dPY2 = new C1049260dPY("promote", str3, new Bundle(), null, new C1020420cf2(), false, AFwS296S0000000_12.get$arr$(17), true, null, null, null, null, 15464);
        EnumC1000680c9C enumC1000680c9C = EnumC1000680c9C.CACHE_WITH_RETRY;
        ArrayList<Integer> arrayList4 = (ArrayList) C0C64.LJIILLIIL().LJJII(ArrayList.class, arrayList2, "promote_fix_oom", true);
        if (arrayList4 != null) {
            arrayList2 = arrayList4;
        }
        if (C13LP.LJJJJ(Double.valueOf(2.0d), arrayList2)) {
            enumC1000680c9C = EnumC1000680c9C.ONLY_RENDER;
        }
        String str4 = c1049260dPY2.LIZIZ;
        if (str4 != null) {
            str3 = str4;
        }
        LIZLLL = new C1051290dSp(enumC1000680c9C, str3, 1, false, c1049260dPY2, null, false, false, 472);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preload realurl = ");
        C1051290dSp c1051290dSp = LIZLLL;
        if (c1051290dSp != null && (c1049260dPY = c1051290dSp.LJFF) != null) {
            str2 = c1049260dPY.LIZIZ;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        C811103Ev.LIZ("PromoteAdHybridDelegate");
        C1051290dSp c1051290dSp2 = LIZLLL;
        if (c1051290dSp2 != null) {
            if (z) {
                LIZIZ = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZIZ(c1028380crs, c1051290dSp2, null);
            } else {
                LIZIZ = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZLLL(c1028380crs, c1051290dSp2);
            }
        }
    }
}
