package X;

/* JADX INFO: renamed from: X.0CF8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CF8 {
    public static final C0CF8 LIZ = new C0CF8();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1972207o0());

    public static float LIZ() {
        return ((Number) LIZIZ.getValue()).floatValue();
    }

    public static C0CFB LIZIZ() {
        return LIZ() == -1.0f ? C0CFB.UNKNOWN : LIZ() < ((Number) C307290C2t.LIZ.getValue()).floatValue() ? C0CFB.LOW : LIZ() < ((Number) C274190Aor.LIZ.getValue()).floatValue() ? C0CFB.MIDDLE : C0CFB.HIGH;
    }

    public static boolean LIZJ() {
        if (!C070Q.LIZ()) {
            return LIZ() != -1.0f && LIZ() <= 6.0f;
        }
        C0CBW c0cbw = C0CBW.LIZ;
        return C0CBW.LIZIZ();
    }

    public static boolean LIZLLL() {
        if (!C070Q.LIZ()) {
            return LIZ() != -1.0f && LIZ() < ((Number) C307290C2t.LIZ.getValue()).floatValue();
        }
        C0CBW c0cbw = C0CBW.LIZ;
        return C0CBW.LIZIZ();
    }
}
