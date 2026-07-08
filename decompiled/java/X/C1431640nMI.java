package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0nMI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431640nMI {
    public final int LIZ;
    public final boolean LIZIZ;
    public long LIZJ;

    public C1431640nMI(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }

    public static void LIZ(C1431640nMI c1431640nMI, Function0 function0) {
        boolean z;
        int i = c1431640nMI.LIZ;
        c1431640nMI.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - c1431640nMI.LIZJ > i) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("allow:");
        sbLIZ.append(z);
        sbLIZ.append(" gap:");
        sbLIZ.append(jCurrentTimeMillis - c1431640nMI.LIZJ);
        sbLIZ.append(" filterGap:");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("InvokeFilter ");
        sbLIZ2.append(strLIZIZ);
        C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ2));
        if (z) {
            if (c1431640nMI.LIZIZ) {
                c1431640nMI.LIZJ = jCurrentTimeMillis;
            }
            function0.invoke();
        }
    }
}
