package X;

/* JADX INFO: renamed from: X.0GsP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429270GsP {
    public static final C429270GsP LIZIZ = new C429270GsP(EnumC429250GsN.IS_ACTIVE);
    public static final C429270GsP LIZJ = new C429270GsP(EnumC429250GsN.IS_INACTIVE);
    public static final C429270GsP LIZLLL = new C429270GsP(0);
    public final EnumC429250GsN LIZ;

    public C429270GsP() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C429270GsP) && this.LIZ == ((C429270GsP) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActivityStatusViewData(activityStatusViewLevel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C429270GsP(int i) {
        this(EnumC429250GsN.DEFAULT);
    }

    public C429270GsP(EnumC429250GsN enumC429250GsN) {
        this.LIZ = enumC429250GsN;
    }
}
