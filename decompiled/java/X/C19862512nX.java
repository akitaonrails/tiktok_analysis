package X;

/* JADX INFO: renamed from: X.12nX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19862512nX {
    public static void LIZ(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String string = obj.toString();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("null value in entry: ");
            sbLIZ.append(string);
            sbLIZ.append("=null");
            throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
