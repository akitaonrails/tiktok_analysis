package X;

/* JADX INFO: renamed from: X.08z9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2296108z9 {
    public static final String LIZ(int[] iArr) {
        if (iArr == null) {
            return "null";
        }
        if (iArr.length == 0) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder("");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(iArr[i]);
            if (i != iArr.length - 1) {
                sb.append("x");
            }
        }
        return sb.toString();
    }
}
