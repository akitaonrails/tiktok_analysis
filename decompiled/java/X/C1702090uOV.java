package X;

import java.io.PrintStream;

/* JADX INFO: renamed from: X.0uOV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1702090uOV {
    public C1702190uOf LIZ;

    public final boolean LIZ() {
        if (this.LIZ == null) {
            this.LIZ = (C1702190uOf) C2201101BCq.LJI(EnumC1702070uOT.ResDash, null);
            PrintStream printStream = System.out;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TaskSchedulerEngine, first currentDashState: ");
            C1702190uOf c1702190uOf = this.LIZ;
            sbLIZ.append(c1702190uOf != null ? Integer.valueOf(c1702190uOf.LIZIZ) : null);
            sbLIZ.append("- ");
            C1702190uOf c1702190uOf2 = this.LIZ;
            sbLIZ.append(c1702190uOf2 != null ? Boolean.valueOf(c1702190uOf2.LIZIZ()) : null);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        }
        return !this.LIZ.LIZIZ();
    }
}
