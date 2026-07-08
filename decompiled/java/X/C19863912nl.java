package X;

/* JADX INFO: renamed from: X.12nl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19863912nl {
    public static void LIZJ(boolean z) {
        C19864312np.LJIILIIL("no calls to next() since the last call to remove()", z);
    }

    public static void LIZ(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String strValueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 26);
            sb.append("null value in entry: ");
            sb.append(strValueOf);
            sb.append("=null");
            throw new NullPointerException(sb.toString());
        }
        String strValueOf2 = String.valueOf(obj2);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 24);
        sb2.append("null key in entry: null=");
        sb2.append(strValueOf2);
        throw new NullPointerException(sb2.toString());
    }

    public static void LIZIZ(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
