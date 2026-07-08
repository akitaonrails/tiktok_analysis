package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0zza, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1917280zza {
    public static long LIZ(InterfaceC1917300zzc interfaceC1917300zzc, Context context) {
        return C813020Vuu.LJIIL().LIZJ(context, interfaceC1917300zzc.LJFF());
    }

    public static void LIZIZ(InterfaceC1917300zzc interfaceC1917300zzc, Context context, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLastShowTimestamp(");
        sbLIZ.append(interfaceC1917300zzc.LIZLLL());
        sbLIZ.append(", ");
        sbLIZ.append(j);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push]");
        C813020Vuu.LJIIL().LJIIIZ(context, interfaceC1917300zzc.LIZLLL(), j);
    }

    public static void LIZJ(InterfaceC1917300zzc interfaceC1917300zzc, Context context, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setShowUpTimes(");
        sbLIZ.append(interfaceC1917300zzc.LJFF());
        sbLIZ.append(", ");
        sbLIZ.append(j);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push]");
        C813020Vuu.LJIIL().LJIIIZ(context, interfaceC1917300zzc.LJFF(), j);
    }
}
