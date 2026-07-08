package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iR0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1242360iR0 {
    public static final EnumC1242360iR0 COLLAPSE;
    public static final EnumC1242360iR0 EXPAND;
    public static final /* synthetic */ EnumC1242360iR0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1242360iR0 REFRESH;

    public static InterfaceC2044707zh<EnumC1242360iR0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1242360iR0 enumC1242360iR0 = new EnumC1242360iR0("REFRESH", 0);
        REFRESH = enumC1242360iR0;
        EnumC1242360iR0 enumC1242360iR02 = new EnumC1242360iR0("COLLAPSE", 1);
        COLLAPSE = enumC1242360iR02;
        EnumC1242360iR0 enumC1242360iR03 = new EnumC1242360iR0("EXPAND", 2);
        EXPAND = enumC1242360iR03;
        EnumC1242360iR0[] enumC1242360iR0Arr = {enumC1242360iR0, enumC1242360iR02, enumC1242360iR03};
        LL = enumC1242360iR0Arr;
        LLILLJJLI = new C2254308sP(enumC1242360iR0Arr);
    }

    public static EnumC1242360iR0[] values() {
        return (EnumC1242360iR0[]) LL.clone();
    }

    public static EnumC1242360iR0 valueOf(String str) {
        return (EnumC1242360iR0) C08FF.LIZ(EnumC1242360iR0.class, str);
    }

    public EnumC1242360iR0(String str, int i) {
    }
}
