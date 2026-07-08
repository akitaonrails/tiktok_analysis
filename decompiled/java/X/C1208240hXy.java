package X;

/* JADX INFO: renamed from: X.0hXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208240hXy {
    public static final C1208240hXy LIZLLL;
    public final EnumC1207420hWe LIZ;
    public final long LIZIZ;
    public final C1207220hWK LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PermissionRequestData(stage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", time=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        new C1208240hXy(EnumC1207420hWe.System);
        new C1208240hXy(EnumC1207420hWe.OpenSettings);
        LIZLLL = new C1208240hXy(EnumC1207420hWe.InApp);
    }

    public /* synthetic */ C1208240hXy(EnumC1207420hWe enumC1207420hWe) {
        this(enumC1207420hWe, System.currentTimeMillis(), null);
    }

    public C1208240hXy(EnumC1207420hWe enumC1207420hWe, long j, C1207220hWK c1207220hWK) {
        this.LIZ = enumC1207420hWe;
        this.LIZIZ = j;
        this.LIZJ = c1207220hWK;
    }
}
