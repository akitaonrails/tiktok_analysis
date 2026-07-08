package X;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pMT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508630pMT {
    public static long LIZIZ;
    public static final C1508630pMT LIZ = new C1508630pMT();
    public static final ConcurrentHashMap<String, C1490960oty> LIZJ = new ConcurrentHashMap<>();
    public static String LIZLLL = "startup";

    public static void LIZJ(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("run event  ");
        sbLIZ.append(str);
        sbLIZ.append(" -- ");
        sbLIZ.append(SystemClock.uptimeMillis() - LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(long j, RecyclerView.ViewHolder viewHolder) {
        String simpleName;
        InterfaceC1508640pMU interfaceC1508640pMU;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("adapter bind VH: ");
        sbLIZ.append(C13LE.LIZ(viewHolder.getClass()).LJI());
        sbLIZ.append(" cost -- ");
        sbLIZ.append(System.currentTimeMillis() - j);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!(viewHolder instanceof InterfaceC1508640pMU) || (interfaceC1508640pMU = (InterfaceC1508640pMU) viewHolder) == null || (simpleName = interfaceC1508640pMU.T()) == null) {
            simpleName = viewHolder.getClass().getSimpleName();
        }
        LIZLLL(System.currentTimeMillis() - j, simpleName, "bind");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(long j, RecyclerView.ViewHolder viewHolder) {
        String simpleName;
        InterfaceC1508640pMU interfaceC1508640pMU;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("adapter create VH: ");
        sbLIZ.append(C13LE.LIZ(viewHolder.getClass()).LJI());
        sbLIZ.append(" cost -- ");
        sbLIZ.append(System.currentTimeMillis() - j);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!(viewHolder instanceof InterfaceC1508640pMU) || (interfaceC1508640pMU = (InterfaceC1508640pMU) viewHolder) == null || (simpleName = interfaceC1508640pMU.T()) == null) {
            simpleName = viewHolder.getClass().getSimpleName();
        }
        LIZLLL(System.currentTimeMillis() - j, simpleName, "create");
    }

    public static void LIZLLL(long j, String str, String str2) {
        if (C19994513Lb.LIZIZ(SystemClock.elapsedRealtime()).nextDouble(1.0d) > ((Number) C0B44.LIZ.getValue()).doubleValue()) {
            return;
        }
        C2450909j1.LIZ(new C109700bH(j, str, str2));
    }
}
