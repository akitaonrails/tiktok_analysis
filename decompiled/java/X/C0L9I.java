package X;

/* JADX INFO: renamed from: X.0L9I, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public enum C0L9I {
    PREVIEW(1),
    THUMBNAIL(0);

    public int value;

    public static C0L9I valueOf(String str) {
        return (C0L9I) C08FF.LIZ(C0L9I.class, str);
    }

    C0L9I(int i) {
        this.value = i;
    }
}
