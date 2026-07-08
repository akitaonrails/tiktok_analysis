package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mx9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1416050mx9 {
    public static final EnumC1416050mx9 FAILED;
    public static final EnumC1416050mx9 IDLE;
    public static final /* synthetic */ EnumC1416050mx9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1416050mx9 LOADING;
    public static final EnumC1416050mx9 SUCCESS;

    public static InterfaceC2044707zh<EnumC1416050mx9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1416050mx9 enumC1416050mx9 = new EnumC1416050mx9("IDLE", 0);
        IDLE = enumC1416050mx9;
        EnumC1416050mx9 enumC1416050mx92 = new EnumC1416050mx9("LOADING", 1);
        LOADING = enumC1416050mx92;
        EnumC1416050mx9 enumC1416050mx93 = new EnumC1416050mx9("SUCCESS", 2);
        SUCCESS = enumC1416050mx93;
        EnumC1416050mx9 enumC1416050mx94 = new EnumC1416050mx9("FAILED", 3);
        FAILED = enumC1416050mx94;
        EnumC1416050mx9[] enumC1416050mx9Arr = {enumC1416050mx9, enumC1416050mx92, enumC1416050mx93, enumC1416050mx94};
        LL = enumC1416050mx9Arr;
        LLILLJJLI = new C2254308sP(enumC1416050mx9Arr);
    }

    public static EnumC1416050mx9[] values() {
        return (EnumC1416050mx9[]) LL.clone();
    }

    public static EnumC1416050mx9 valueOf(String str) {
        return (EnumC1416050mx9) C08FF.LIZ(EnumC1416050mx9.class, str);
    }

    public EnumC1416050mx9(String str, int i) {
    }
}
