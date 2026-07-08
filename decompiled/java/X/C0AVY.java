package X;

/* JADX INFO: renamed from: X.0AVY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0AVY {
    public static int LIZ(int i) {
        if (Integer.MIN_VALUE > i) {
            return 6;
        }
        if (i < 640) {
            return 2;
        }
        if (640 > i) {
            return 6;
        }
        if (i < 900) {
            return 3;
        }
        if (900 > i) {
            return 6;
        }
        if (i < 1200) {
            return 4;
        }
        return i < 1600 ? 5 : 6;
    }
}
