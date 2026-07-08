package X;

/* JADX INFO: renamed from: X.0Du6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C353880Du6 {
    public static C353890Du7 LIZIZ() {
        return new C353890Du7(null, null, false);
    }

    public static C353890Du7 LIZ(String str, Integer num, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        return new C353890Du7(num, str, true);
    }
}
