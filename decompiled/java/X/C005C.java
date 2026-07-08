package X;

/* JADX INFO: renamed from: X.005C, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public enum C005C {
    COHOST_TYPE(20),
    FEIEND_TYPE(31),
    FOLLOWED_TYPE(32),
    FOLLOWING_TYPE(33);

    public int value;

    public static C005C valueOf(String str) {
        return (C005C) C08FF.LIZ(C005C.class, str);
    }

    C005C(int i) {
        this.value = i;
    }
}
