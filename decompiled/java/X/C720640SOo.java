package X;

/* JADX INFO: renamed from: X.0SOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720640SOo {
    public static final String LIZ(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() > 23) {
            return simpleName.substring(0, 23);
        }
        return simpleName;
    }
}
