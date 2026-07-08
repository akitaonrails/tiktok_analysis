package X;

/* JADX INFO: renamed from: X.13SS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13SS {
    public static final C13SS LIZ = new C13SS();
    public static C13SV LIZIZ = new C13SV() { // from class: X.13SW
        @Override // X.C13SV
        public final boolean getEnabled() {
            return false;
        }

        @Override // X.C13SV
        public final void logDebug(String str, String str2) {
        }

        @Override // X.C13SV
        public final void logError(String str, String str2) {
        }

        @Override // X.C13SV
        public final void logError(String str, String str2, Throwable th) {
        }

        @Override // X.C13SV
        public final void logWarn(String str, String str2) {
        }
    };

    public static String LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPKN.-");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(String str, String str2) {
        if (LIZIZ.getEnabled()) {
            LIZIZ.logDebug(LIZLLL(str), str2);
        }
    }

    public static void LJ(String str, String str2) {
        if (LIZIZ.getEnabled()) {
            LIZIZ.logWarn(LIZLLL(str), str2);
        }
    }

    public static void LIZIZ(String str, String str2, Throwable th) {
        if (th != null) {
            C13SV c13sv = LIZIZ;
            LIZ.getClass();
            c13sv.logError(LIZLLL(str), str2, th);
            return;
        }
        LIZIZ.logError(LIZLLL(str), str2);
    }
}
