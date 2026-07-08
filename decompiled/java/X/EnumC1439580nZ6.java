package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nZ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1439580nZ6 {
    public static final EnumC1439580nZ6 DISABLE;
    public static final EnumC1439580nZ6 ENABLE;
    public static final /* synthetic */ EnumC1439580nZ6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1439580nZ6 UNKNOWN;

    @C040H
    public final int LL;

    public static InterfaceC2044707zh<EnumC1439580nZ6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1439580nZ6 enumC1439580nZ6 = new EnumC1439580nZ6("UNKNOWN", 0, 0);
        UNKNOWN = enumC1439580nZ6;
        EnumC1439580nZ6 enumC1439580nZ62 = new EnumC1439580nZ6("ENABLE", 1, 1);
        ENABLE = enumC1439580nZ62;
        EnumC1439580nZ6 enumC1439580nZ63 = new EnumC1439580nZ6("DISABLE", 2, 2);
        DISABLE = enumC1439580nZ63;
        EnumC1439580nZ6[] enumC1439580nZ6Arr = {enumC1439580nZ6, enumC1439580nZ62, enumC1439580nZ63};
        LLILLJJLI = enumC1439580nZ6Arr;
        LLILLL = new C2254308sP(enumC1439580nZ6Arr);
    }

    public static EnumC1439580nZ6[] values() {
        return (EnumC1439580nZ6[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1439580nZ6 valueOf(String str) {
        return (EnumC1439580nZ6) C08FF.LIZ(EnumC1439580nZ6.class, str);
    }

    public EnumC1439580nZ6(String str, int i, int i2) {
        this.LL = i2;
    }
}
