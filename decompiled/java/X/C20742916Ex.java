package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.16Ex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20742916Ex {
    public static InterfaceC20743016Ey LIZ = null;
    public static boolean LIZIZ = true;

    public static View LIZ(Context context, int i, ViewGroup viewGroup, boolean z, int i2) {
        return LIZIZ(context, i, viewGroup, z, i2, false);
    }

    public static View LIZIZ(Context context, int i, ViewGroup viewGroup, boolean z, int i2, boolean z2) {
        View viewLIZ;
        if (!LIZIZ) {
            int i3 = C2187451AjH.LIZ;
            if (z2) {
                return null;
            }
            return C786410Ut5.Td(C786410Ut5.ne(context), i, viewGroup, z);
        }
        InterfaceC20742716Ev interfaceC20742716Ev = C20741516Ej.LIZ.get(i);
        if (interfaceC20742716Ev == null) {
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("layout id :");
            sbLIZ.append(Integer.toHexString(i));
            sbLIZ.append(" does not match any inflator, inflate with android.view.LayoutInflater");
            C2188811AlT.LIZIZ(sbLIZ);
            if (LIZ != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
            }
            if (z2) {
                return null;
            }
            return C786410Ut5.Td(C786410Ut5.ne(context), i, viewGroup, z);
        }
        try {
            if (!C2260308tN.LIZ()) {
                viewLIZ = C20741516Ej.LIZ(interfaceC20742716Ev, context, viewGroup, z);
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                viewLIZ = C20741516Ej.LIZ(interfaceC20742716Ev, context, viewGroup, z);
                C2260308tN.LIZIZ(i, SystemClock.elapsedRealtime() - jElapsedRealtime, context, "x2c");
            }
            if (LIZ != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
                return viewLIZ;
            }
            return viewLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            InterfaceC20743016Ey interfaceC20743016Ey = LIZ;
            if (interfaceC20743016Ey != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
                C16F1.LIZ(th);
            }
            if (!C1337240ku2.LIZ) {
                if (z2) {
                    return null;
                }
                return C786410Ut5.Td(C786410Ut5.ne(context), i, viewGroup, z);
            }
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("the inflator with id: ");
            sbLIZ2.append(i);
            sbLIZ2.append(" inflated failed ");
            sbLIZ2.append(th.getMessage());
            sbLIZ2.append(" , inflate with android.view.LayoutInflater");
            C2188811AlT.LIZIZ(sbLIZ2);
            throw new IllegalStateException(th);
        }
    }
}
