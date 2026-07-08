package X;

/* JADX INFO: renamed from: X.10fA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public enum EnumC19301010fA {
    DISMISS(1),
    CONTINUE(2),
    NATIVE(3),
    URL(4),
    EXIT(5);

    public final int LL;

    public static EnumC19301010fA valueOf(String str) {
        return (EnumC19301010fA) C08FF.LIZ(EnumC19301010fA.class, str);
    }

    public final int getType() {
        return this.LL;
    }

    EnumC19301010fA(int i) {
        this.LL = i;
    }
}
