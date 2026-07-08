package X;

/* JADX INFO: renamed from: X.0NsO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC607620NsO {
    CHECK_ITEMS(0),
    PRELOAD(1),
    REFRESH(2),
    LOAD_MORE(3);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC607620NsO valueOf(String str) {
        return (EnumC607620NsO) C08FF.LIZ(EnumC607620NsO.class, str);
    }

    EnumC607620NsO(int i) {
        this.LL = i;
    }
}
