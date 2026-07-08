package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sD4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1618120sD4 {
    public static final EnumC1618120sD4 CHANGE_CYCLE;
    public static final /* synthetic */ EnumC1618120sD4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1618120sD4 ONETIME;
    public static final EnumC1618120sD4 RESUBSCRIBE;
    public static final EnumC1618120sD4 SUB;
    public static final EnumC1618120sD4 UPGRADE_DOWNGRADE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1618120sD4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1618120sD4 enumC1618120sD4 = new EnumC1618120sD4("ONETIME", 0, "onetime");
        ONETIME = enumC1618120sD4;
        EnumC1618120sD4 enumC1618120sD42 = new EnumC1618120sD4("SUB", 1, "sub");
        SUB = enumC1618120sD42;
        EnumC1618120sD4 enumC1618120sD43 = new EnumC1618120sD4("RESUBSCRIBE", 2, "resub");
        RESUBSCRIBE = enumC1618120sD43;
        EnumC1618120sD4 enumC1618120sD44 = new EnumC1618120sD4("UPGRADE_DOWNGRADE", 3, "upgrade_downgrade");
        UPGRADE_DOWNGRADE = enumC1618120sD44;
        EnumC1618120sD4 enumC1618120sD45 = new EnumC1618120sD4("CHANGE_CYCLE", 4, "change_cycle");
        CHANGE_CYCLE = enumC1618120sD45;
        EnumC1618120sD4[] enumC1618120sD4Arr = {enumC1618120sD4, enumC1618120sD42, enumC1618120sD43, enumC1618120sD44, enumC1618120sD45};
        LLILLJJLI = enumC1618120sD4Arr;
        LLILLL = new C2254308sP(enumC1618120sD4Arr);
    }

    public static EnumC1618120sD4[] values() {
        return (EnumC1618120sD4[]) LLILLJJLI.clone();
    }

    public final String getLogValue() {
        return this.LL;
    }

    public static EnumC1618120sD4 valueOf(String str) {
        return (EnumC1618120sD4) C08FF.LIZ(EnumC1618120sD4.class, str);
    }

    public EnumC1618120sD4(String str, int i, String str2) {
        this.LL = str2;
    }
}
