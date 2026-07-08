package X;

/* JADX INFO: renamed from: X.05JA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05JA {
    public static int LJ = 5;
    public static int LJFF = 3;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final void LIZ() {
        C05J9.LIZ().storeLong(this.LIZIZ, LJ);
        C05J9.LIZ().storeBoolean(this.LIZLLL, false);
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDismissedWithoutAction [");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("]: skipRemaining=");
        sbLIZ.append(LJ);
        sbLIZ.append(", pendingShown=false");
        C201955140j.LIZLLL(c0may, "DraftOrganizerGuard", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LIZIZ() {
        boolean z = C05J9.LIZ().getBoolean(this.LIZJ, false);
        boolean z2 = C05J9.LIZ().getBoolean(this.LIZLLL, false);
        Long lValueOf = C05J9.LIZ().contains(this.LIZIZ) ? Long.valueOf(C05J9.LIZ().getLong(this.LIZIZ, 0L)) : null;
        if (!z && !z2 && lValueOf != null && lValueOf.longValue() == 0) {
            return true;
        }
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldShow=false [");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("]: permanentlyDismissed=");
        sbLIZ.append(z);
        sbLIZ.append(", pendingShown=");
        sbLIZ.append(z2);
        sbLIZ.append(", skipRemaining=");
        sbLIZ.append(lValueOf);
        C201955140j.LIZLLL(c0may, "DraftOrganizerGuard", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public C05JA(C0M22 c0m22) {
        String str;
        if (c0m22 instanceof C0M20) {
            str = "count";
        } else if (c0m22 instanceof C561890M1z) {
            str = "memory";
        } else {
            throw new C1954807lC();
        }
        this.LIZ = str;
        this.LIZIZ = C05J9.LIZJ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("draft_organizer_dismissed_");
        sbLIZ.append(str);
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZLLL = C05J9.LIZIZ(str);
    }
}
