package X;

import android.app.Activity;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginState;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jv6.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13zh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20192713zh {
    public static final C20192713zh LIZ = new C20192713zh();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(236));
    public static final AtomicInteger LIZJ = new AtomicInteger(0);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public static final AtomicReference<CreativeToolsBizPluginState> LJFF;

    static {
        Object c098200Yq;
        try {
            c098200Yq = Class.forName("com.ss.android.ugc.aweme.tools.aab.CameraBizDFServiceImpl");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        AtomicReference<CreativeToolsBizPluginState> atomicReference = new AtomicReference<>((C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null) ? CreativeToolsBizPluginState.NotInstalled.INSTANCE : new CreativeToolsBizPluginState.Installed(true));
        LJFF = atomicReference;
        C554740LpI c554740LpI = C554740LpI.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init: state=");
        sbLIZ.append(atomicReference.get());
        C201955140j.LIZLLL(c554740LpI, "CreativeToolsBizPluginManager", C2188811AlT.LIZIZ(sbLIZ));
        LIZ.getClass();
        ((IPluginService) LIZIZ.getValue()).LJJIJ(new C1BLD() { // from class: X.13zi
            @Override // X.C1BLD
            public final void LIZ() {
            }

            @Override // X.C1BLD
            public final void LIZIZ(String str, boolean z) {
            }

            @Override // X.C1BLD
            public final void LIZLLL() {
            }

            @Override // X.C1BLD
            public final void LJFF(long j, long j2, String str, boolean z) {
            }

            @Override // X.C1BLD
            public final void LJI(String str, boolean z) {
            }

            @Override // X.C1BLD
            public final void LJ(String str, boolean z) {
                if (!Intrinsics.LJFF(str, "com.ss.android.ugc.aweme.df_camera_biz")) {
                    return;
                }
                C20192713zh.LIZ.getClass();
                C20192713zh.LIZIZ("global onInstallSuccess");
            }

            @Override // X.C1BLD
            public final void LIZJ(String str, boolean z, int i, Function0<Unit> function0) {
                if (!Intrinsics.LJFF(str, "com.ss.android.ugc.aweme.df_camera_biz")) {
                    return;
                }
                C20192713zh.LIZ.getClass();
                C20192713zh.LIZ(i, "global onInstallFailed");
            }
        });
    }

    public static void LIZIZ(String str) {
        Activity activityLIZIZ;
        C554740LpI c554740LpI = C554740LpI.LIZIZ;
        C201955140j.LIZLLL(c554740LpI, "CreativeToolsBizPluginManager", str);
        boolean z = false;
        if (LIZLLL.compareAndSet(false, true)) {
            C844470XAv.LIZ.getClass();
            a.install(C844470XAv.LIZ());
            if (((Boolean) C264780AZg.LIZ.getValue()).booleanValue()) {
                AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("installSplitCompatForProcess install all activities, count=");
                sbLIZ.append(abstractC1387200mCcArrLJII.length);
                C201955140j.LIZLLL(c554740LpI, "CreativeToolsBizPluginManager", C2188811AlT.LIZIZ(sbLIZ));
                for (AbstractC1387200mCc abstractC1387200mCc : abstractC1387200mCcArrLJII) {
                    Activity activityLIZIZ2 = abstractC1387200mCc.LIZIZ();
                    if (activityLIZIZ2 != null) {
                        a.LIZLLL(activityLIZIZ2);
                    }
                }
            } else {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null) {
                    activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
                } else {
                    activityLIZIZ = null;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("installSplitCompatForProcess install top activity only, hasTop=");
                if (activityLIZIZ != null) {
                    z = true;
                }
                sbLIZ2.append(z);
                C201955140j.LIZLLL(c554740LpI, "CreativeToolsBizPluginManager", C2188811AlT.LIZIZ(sbLIZ2));
                if (activityLIZIZ != null) {
                    a.LIZLLL(activityLIZIZ);
                }
            }
            RunnableC20192613zg runnableC20192613zg = RunnableC20192613zg.LL;
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                runnableC20192613zg.run();
            } else {
                C786410Ut5.LJJZZIII(LJ, runnableC20192613zg);
            }
        }
    }

    public static boolean LIZJ(CreativeToolsBizPluginState creativeToolsBizPluginState) {
        CreativeToolsBizPluginState creativeToolsBizPluginState2;
        while (true) {
            AtomicReference<CreativeToolsBizPluginState> atomicReference = LJFF;
            CreativeToolsBizPluginState creativeToolsBizPluginState3 = atomicReference.get();
            if ((creativeToolsBizPluginState3 instanceof CreativeToolsBizPluginState.Installed) || ((creativeToolsBizPluginState3 instanceof CreativeToolsBizPluginState.Downloading) && (creativeToolsBizPluginState instanceof CreativeToolsBizPluginState.Downloading))) {
                creativeToolsBizPluginState2 = creativeToolsBizPluginState3;
            } else {
                creativeToolsBizPluginState2 = creativeToolsBizPluginState;
            }
            if (creativeToolsBizPluginState2 == creativeToolsBizPluginState3) {
                return false;
            }
            while (!atomicReference.compareAndSet(creativeToolsBizPluginState3, creativeToolsBizPluginState2)) {
                if (atomicReference.get() != creativeToolsBizPluginState3) {
                    break;
                }
            }
            return true;
        }
    }

    public static void LIZ(int i, String str) {
        C554740LpI c554740LpI = C554740LpI.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", reason=");
        sbLIZ.append(i);
        C201955140j.LIZLLL(c554740LpI, "CreativeToolsBizPluginManager", C2188811AlT.LIZIZ(sbLIZ));
        LIZJ(CreativeToolsBizPluginState.NotInstalled.INSTANCE);
    }
}
