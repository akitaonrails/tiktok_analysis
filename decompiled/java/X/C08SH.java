package X;

/* JADX INFO: renamed from: X.08SH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public enum C08SH {
    EMPTY_ARRAY,
    NONEMPTY_ARRAY,
    EMPTY_OBJECT,
    DANGLING_KEY,
    NONEMPTY_OBJECT,
    NULL;

    public static C08SH valueOf(String str) {
        return (C08SH) C08FF.LIZ(C08SH.class, str);
    }
}
