package X;

/* JADX INFO: renamed from: X.12pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19876812pq {
    public static int LIZ(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int LIZIZ(Object obj) {
        int iHashCode;
        if (obj == null) {
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        return LIZ(iHashCode);
    }
}
