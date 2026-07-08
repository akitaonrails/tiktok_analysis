package X;

/* JADX INFO: renamed from: X.10f2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public enum EnumC19300210f2 {
    NONE(0),
    CLOSE(1),
    BACK(2),
    INFO(3),
    ICON(4),
    TEXT(5);

    public static final C19301710fH Companion = new Object() { // from class: X.10fH
    };
    public final int LL;

    public static EnumC19300210f2 valueOf(String str) {
        return (EnumC19300210f2) C08FF.LIZ(EnumC19300210f2.class, str);
    }

    public final int getType() {
        return this.LL;
    }

    EnumC19300210f2(int i) {
        this.LL = i;
    }
}
