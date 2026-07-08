package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0by7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993810by7 {
    public static final /* synthetic */ EnumC993810by7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993810by7 NOT_FOUND;
    public static final EnumC993810by7 NO_PERMISSION;

    public static InterfaceC2044707zh<EnumC993810by7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993810by7 enumC993810by7 = new EnumC993810by7("NOT_FOUND", 0);
        NOT_FOUND = enumC993810by7;
        EnumC993810by7 enumC993810by72 = new EnumC993810by7("NO_PERMISSION", 1);
        NO_PERMISSION = enumC993810by72;
        EnumC993810by7[] enumC993810by7Arr = {enumC993810by7, enumC993810by72};
        LL = enumC993810by7Arr;
        LLILLJJLI = new C2254308sP(enumC993810by7Arr);
    }

    public static EnumC993810by7[] values() {
        return (EnumC993810by7[]) LL.clone();
    }

    public static EnumC993810by7 valueOf(String str) {
        return (EnumC993810by7) C08FF.LIZ(EnumC993810by7.class, str);
    }

    public EnumC993810by7(String str, int i) {
    }
}
