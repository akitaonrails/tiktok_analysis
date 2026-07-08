package X;

/* JADX INFO: renamed from: X.07tm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC2008007tm {
    SliverType(1),
    PrimitiveType(2),
    NativeType(3);

    public final int LL;

    public static EnumC2008007tm valueOf(String str) {
        return (EnumC2008007tm) C08FF.LIZ(EnumC2008007tm.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC2008007tm(int i) {
        this.LL = i;
    }
}
