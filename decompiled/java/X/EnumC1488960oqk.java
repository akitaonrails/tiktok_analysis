package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0oqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1488960oqk {
    public static final EnumC1488960oqk AIRPLANE_MODE;
    public static final EnumC1488960oqk FAKE;
    public static final /* synthetic */ EnumC1488960oqk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1488960oqk NOT_AVAILABLE;
    public static final EnumC1488960oqk TIMEOUT;

    public static InterfaceC2044707zh<EnumC1488960oqk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1488960oqk enumC1488960oqk = new EnumC1488960oqk("TIMEOUT", 0);
        TIMEOUT = enumC1488960oqk;
        EnumC1488960oqk enumC1488960oqk2 = new EnumC1488960oqk("NOT_AVAILABLE", 1);
        NOT_AVAILABLE = enumC1488960oqk2;
        EnumC1488960oqk enumC1488960oqk3 = new EnumC1488960oqk("FAKE", 2);
        FAKE = enumC1488960oqk3;
        EnumC1488960oqk enumC1488960oqk4 = new EnumC1488960oqk("AIRPLANE_MODE", 3);
        AIRPLANE_MODE = enumC1488960oqk4;
        EnumC1488960oqk[] enumC1488960oqkArr = {enumC1488960oqk, enumC1488960oqk2, enumC1488960oqk3, enumC1488960oqk4};
        LL = enumC1488960oqkArr;
        LLILLJJLI = new C2254308sP(enumC1488960oqkArr);
    }

    public static EnumC1488960oqk[] values() {
        return (EnumC1488960oqk[]) LL.clone();
    }

    public static EnumC1488960oqk valueOf(String str) {
        return (EnumC1488960oqk) C08FF.LIZ(EnumC1488960oqk.class, str);
    }

    public EnumC1488960oqk(String str, int i) {
    }
}
