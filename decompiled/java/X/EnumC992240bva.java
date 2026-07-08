package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bva, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992240bva {
    public static final EnumC992240bva COLD_BOOT;
    public static final /* synthetic */ EnumC992240bva[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992240bva ON_NEW_INTENT;

    public static InterfaceC2044707zh<EnumC992240bva> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992240bva enumC992240bva = new EnumC992240bva("COLD_BOOT", 0);
        COLD_BOOT = enumC992240bva;
        EnumC992240bva enumC992240bva2 = new EnumC992240bva("ON_NEW_INTENT", 1);
        ON_NEW_INTENT = enumC992240bva2;
        EnumC992240bva[] enumC992240bvaArr = {enumC992240bva, enumC992240bva2};
        LL = enumC992240bvaArr;
        LLILLJJLI = new C2254308sP(enumC992240bvaArr);
    }

    public static EnumC992240bva[] values() {
        return (EnumC992240bva[]) LL.clone();
    }

    public static EnumC992240bva valueOf(String str) {
        return (EnumC992240bva) C08FF.LIZ(EnumC992240bva.class, str);
    }

    public EnumC992240bva(String str, int i) {
    }
}
