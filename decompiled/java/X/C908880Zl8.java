package X;

/* JADX INFO: renamed from: X.0Zl8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908880Zl8 {
    public static int LIZ(Object obj, Object obj2) {
        int iHashCode;
        int iHashCode2 = 0;
        if (obj == null) {
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        if (obj2 != null) {
            iHashCode2 = obj2.hashCode();
        }
        return ((iHashCode + 31) * 31) + iHashCode2;
    }

    public static int LIZIZ(Object obj, Object obj2, Object obj3, Object obj4) {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4 = 0;
        if (obj == null) {
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        if (obj2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = obj2.hashCode();
        }
        if (obj3 == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = obj3.hashCode();
        }
        if (obj4 != null) {
            iHashCode4 = obj4.hashCode();
        }
        return ((((((iHashCode + 31) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
    }
}
