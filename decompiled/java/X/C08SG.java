package X;

/* JADX INFO: renamed from: X.08SG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public enum C08SG {
    EMPTY_ARRAY,
    NONEMPTY_ARRAY,
    EMPTY_OBJECT,
    DANGLING_KEY,
    NONEMPTY_OBJECT,
    NULL;

    public static C08SG valueOf(String str) {
        return (C08SG) C08FF.LIZ(C08SG.class, str);
    }
}
