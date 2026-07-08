package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0otc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490740otc {
    public static final C1490740otc LIZ = new C1490740otc();
    public static InterfaceC1490720ota LIZIZ;

    public static void LIZJ(C1490740otc c1490740otc, final Throwable th, final String str) {
        final String str2 = "HybridKit";
        c1490740otc.getClass();
        try {
            ExecutorService executorService = C2281108wj.LIZ;
            C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new Runnable(str2, th, str) { // from class: X.0otZ
                public final /* synthetic */ String LL;

                public final void LIZ() {
                    C1490740otc.LIZ.getClass();
                    InterfaceC1490720ota interfaceC1490720ota = C1490740otc.LIZIZ;
                    if (interfaceC1490720ota != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("HybridKit");
                        sbLIZ.append('_');
                        sbLIZ.append(this.LL);
                        C2188811AlT.LIZIZ(sbLIZ);
                        interfaceC1490720ota.LIZIZ();
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LogUtils@32f2.printReject$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LogUtils@32f2.printReject$1$1");
                }
            });
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public final void LIZ(final String str, final EnumC1490770otf enumC1490770otf, final String str2) {
        try {
            ExecutorService executorService = C2281108wj.LIZ;
            C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new Runnable() { // from class: X.0otb
                public final void LIZ() {
                    this.LL.getClass();
                    if (C1490740otc.LIZIZ != null) {
                        this.LL.getClass();
                        InterfaceC1490720ota interfaceC1490720ota = C1490740otc.LIZIZ;
                        if (interfaceC1490720ota != null) {
                            EnumC1490770otf enumC1490770otf2 = enumC1490770otf;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("HybridKit");
                            sbLIZ.append('_');
                            sbLIZ.append(str2);
                            C2188811AlT.LIZIZ(sbLIZ);
                            interfaceC1490720ota.LIZ(enumC1490770otf2);
                            return;
                        }
                        return;
                    }
                    int i = C1490750otd.LIZ[enumC1490770otf.ordinal()];
                    if (i == 1) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("HybridKit");
                        sbLIZ2.append('_');
                        sbLIZ2.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onLog: ");
                        sbLIZ3.append(str);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        return;
                    }
                    if (i == 2) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("HybridKit");
                        sbLIZ4.append('_');
                        sbLIZ4.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ4);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("onLog: ");
                        sbLIZ5.append(str);
                        C2188811AlT.LIZIZ(sbLIZ5);
                        return;
                    }
                    if (i == 3) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("HybridKit");
                        sbLIZ6.append('_');
                        sbLIZ6.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ6);
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("onLog: ");
                        sbLIZ7.append(str);
                        C2188811AlT.LIZIZ(sbLIZ7);
                        return;
                    }
                    if (i != 4) {
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("HybridKit");
                        sbLIZ8.append('_');
                        sbLIZ8.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ8);
                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                        sbLIZ9.append("onLog: ");
                        sbLIZ9.append(str);
                        C2188811AlT.LIZIZ(sbLIZ9);
                        return;
                    }
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append("HybridKit");
                    sbLIZ10.append('_');
                    sbLIZ10.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ10);
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("onLog: ");
                    sbLIZ11.append(str);
                    C2188811AlT.LIZIZ(sbLIZ11);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LogUtils@32f2.printLog$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LogUtils@32f2.printLog$1$1");
                }
            });
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static /* synthetic */ void LIZIZ(C1490740otc c1490740otc, String str, EnumC1490770otf enumC1490770otf, String str2, int i) {
        if ((i & 2) != 0) {
            enumC1490770otf = EnumC1490770otf.I;
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        c1490740otc.LIZ(str, enumC1490770otf, str2);
    }
}
