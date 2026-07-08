package X;

/* JADX INFO: renamed from: X.00re, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C211200re {
    public static final <T> String LIZ(Class<? extends T> cls, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hierarchy-data-tag-");
        sbLIZ.append(cls.getName());
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
