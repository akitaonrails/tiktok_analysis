package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13nB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20115113nB {
    public static void LIZ(InterfaceC20115013nA interfaceC20115013nA, String str, EnumC20115313nD enumC20115313nD, String str2) {
        boolean z;
        Object objValueOf;
        int iD;
        try {
            InterfaceC20115413nE interfaceC20115413nE = interfaceC20115013nA.getLoggerWrapper().LIZ;
            String str3 = interfaceC20115013nA.getLoggerWrapper().LIZIZ;
            if (str2.length() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(str2);
                sbLIZ.append("] ");
                sbLIZ.append(str);
                str = C2188811AlT.LIZIZ(sbLIZ);
            } else if (str3.length() > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('[');
                sbLIZ2.append(str3);
                sbLIZ2.append("] ");
                sbLIZ2.append(str);
                str = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (interfaceC20115413nE == null) {
                int i = C20115213nC.LIZ[enumC20115313nD.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            iD = Log.i("bullet", Intrinsics.LJIIJJI(str, "onLog: "));
                        } else {
                            iD = Log.w("bullet", Intrinsics.LJIIJJI(str, "onLog: "));
                        }
                    } else {
                        iD = Log.e("bullet", Intrinsics.LJIIJJI(str, "onLog: "));
                    }
                } else {
                    iD = Log.d("bullet", Intrinsics.LJIIJJI(str, "onLog: "));
                }
                objValueOf = Integer.valueOf(iD);
            } else {
                interfaceC20115413nE.LIZ();
                objValueOf = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(objValueOf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
