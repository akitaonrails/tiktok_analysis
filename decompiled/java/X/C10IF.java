package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10IF, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10IF {
    public static volatile long LJ;
    public static volatile C11JF LJI;
    public static final C10IF LIZ = new C10IF();
    public static final C19319410i8 LIZIZ = new C19319410i8("push_S2Trigger");
    public static volatile String LIZJ = "";
    public static volatile String LIZLLL = "";
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static final C10IJ LJII = new C0CSC() { // from class: X.10IJ
        @Override // X.C0CSC
        public final void LIZ(EnumC325100Com enumC325100Com) {
            String strLIZ;
            C10IF c10if = C10IF.LIZ;
            if (enumC325100Com == EnumC325100Com.NOT_AVAILABLE) {
                strLIZ = "none";
            } else {
                C10IF.LIZ.getClass();
                strLIZ = C10IF.LIZ();
            }
            C10IF.LIZLLL = strLIZ;
            if (Intrinsics.LJFF(C10IF.LIZLLL, "cellular") || Intrinsics.LJFF(C10IF.LIZLLL, "none")) {
                C10IF.LJ = System.currentTimeMillis();
            }
            C10IF.LIZIZ.LIZIZ(new AwS572S0100000_28(enumC325100Com, 675));
        }
    };

    public static String LIZ() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C0XF5 c0xf5 = C0XF5.LIZJ;
        c0xf5.LIZIZ.getClass();
        if (C0XF1.LJ(contextLIZ)) {
            return "wifi";
        }
        c0xf5.LIZIZ.getClass();
        return C0XF1.LIZJ(contextLIZ) ? "cellular" : "none";
    }

    public static void LIZIZ() {
        Object c098200Yq;
        if (LJFF.compareAndSet(true, false)) {
            Object c098200Yq2 = null;
            try {
                C11JF c11jf = LJI;
                if (c11jf != null) {
                    c11jf.dispose();
                    c098200Yq = Unit.LIZ;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C19319410i8 c19319410i8 = LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[S2] dispose backgroundDisposable failed ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            LJI = null;
            try {
                INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
                if (iNetworkStateService != null) {
                    iNetworkStateService.removeNetworkChangeObserver(LJII);
                    c098200Yq2 = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (thM5exceptionOrNullimpl2 != null) {
                C19319410i8 c19319410i82 = LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[S2] remove network observer failed ");
                sbLIZ2.append(thM5exceptionOrNullimpl2);
                c19319410i82.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
            LIZJ = "";
            LIZLLL = "";
            LJ = 0L;
            LIZIZ.LJIIJJI(AFwS217S0000000_28.get$arr$(469));
        }
    }
}
