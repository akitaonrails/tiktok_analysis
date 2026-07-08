package X;

/* JADX INFO: renamed from: X.0Wxv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC840370Wxv {
    NOT_MODIFIED(0),
    URL_MODIFIED(1),
    HEADER_MODIFIED(2),
    BOTH_MODIFIED(3);

    public final int mValue;

    public int getValue() {
        return this.mValue;
    }

    public static EnumC840370Wxv valueOf(String str) {
        return (EnumC840370Wxv) C08FF.LIZ(EnumC840370Wxv.class, str);
    }

    EnumC840370Wxv(int i) {
        this.mValue = i;
    }
}
