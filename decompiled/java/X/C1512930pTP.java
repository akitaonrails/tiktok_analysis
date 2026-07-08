package X;

import android.content.Intent;

/* JADX INFO: renamed from: X.0pTP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512930pTP extends C1702170uOd {
    public boolean LIZIZ;
    public Intent LIZJ;
    public int LIZLLL;
    public boolean LJ;

    @Override // X.C1702170uOd
    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("battery: isChanging-");
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append(", currentBatteryPercent: ");
        sbLIZ2.append(this.LIZLLL);
        sbLIZ2.append(", saveMode: ");
        sbLIZ2.append(this.LJ);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
