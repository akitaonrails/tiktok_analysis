package X;

/* JADX INFO: renamed from: X.10f5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public enum EnumC19300510f5 {
    MINOR(0),
    MEDIUM(1),
    MAJOR(2);

    public static final C19301110fB Companion = new C19301110fB();
    public final int LL;

    public static EnumC19300510f5 valueOf(String str) {
        return (EnumC19300510f5) C08FF.LIZ(EnumC19300510f5.class, str);
    }

    public final int getType() {
        return this.LL;
    }

    EnumC19300510f5(int i) {
        this.LL = i;
    }
}
