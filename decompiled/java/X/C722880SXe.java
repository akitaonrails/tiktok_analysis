package X;

/* JADX INFO: renamed from: X.0SXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722880SXe {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C722890SXf());

    public static C722900SXg LIZ() {
        return (C722900SXg) LIZ.getValue();
    }

    public static final void LIZLLL(String str) {
        C722900SXg c722900SXgLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audio device connected, scenario: ");
        sbLIZ.append(str);
        sbLIZ.append(", try to resume");
        c722900SXgLIZ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZIZ(Boolean bool, String str) {
        C722900SXg c722900SXgLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audio reconnected, scenario: ");
        sbLIZ.append(str);
        sbLIZ.append(",  will resume: ");
        sbLIZ.append(bool);
        c722900SXgLIZ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZJ(Boolean bool, String str) {
        C722900SXg c722900SXgLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scenario: ");
        sbLIZ.append(str);
        sbLIZ.append(", resuming result: ");
        sbLIZ.append(bool);
        c722900SXgLIZ.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
