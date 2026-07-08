package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00c8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC115000c8 {
    public static final /* synthetic */ EnumC115000c8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC115000c8 SUCCESS;

    public static InterfaceC2044707zh<EnumC115000c8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC115000c8 enumC115000c8 = new EnumC115000c8();
        SUCCESS = enumC115000c8;
        EnumC115000c8[] enumC115000c8Arr = {enumC115000c8};
        LL = enumC115000c8Arr;
        LLILLJJLI = new C2254308sP(enumC115000c8Arr);
    }

    public static EnumC115000c8[] values() {
        return (EnumC115000c8[]) LL.clone();
    }

    public static EnumC115000c8 valueOf(String str) {
        return (EnumC115000c8) C08FF.LIZ(EnumC115000c8.class, str);
    }
}
