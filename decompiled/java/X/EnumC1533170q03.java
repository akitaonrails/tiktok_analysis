package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0q03, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1533170q03 {
    public static final EnumC1533170q03 KEEP_ALIVE;
    public static final /* synthetic */ EnumC1533170q03[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1533170q03 ONLY_ONCE;
    public static final EnumC1533170q03 REMOVE_ON_CONSUME;

    public static InterfaceC2044707zh<EnumC1533170q03> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1533170q03 enumC1533170q03 = new EnumC1533170q03("ONLY_ONCE", 0);
        ONLY_ONCE = enumC1533170q03;
        EnumC1533170q03 enumC1533170q032 = new EnumC1533170q03("KEEP_ALIVE", 1);
        KEEP_ALIVE = enumC1533170q032;
        EnumC1533170q03 enumC1533170q033 = new EnumC1533170q03("REMOVE_ON_CONSUME", 2);
        REMOVE_ON_CONSUME = enumC1533170q033;
        EnumC1533170q03[] enumC1533170q03Arr = {enumC1533170q03, enumC1533170q032, enumC1533170q033};
        LL = enumC1533170q03Arr;
        LLILLJJLI = new C2254308sP(enumC1533170q03Arr);
    }

    public static EnumC1533170q03[] values() {
        return (EnumC1533170q03[]) LL.clone();
    }

    public static EnumC1533170q03 valueOf(String str) {
        return (EnumC1533170q03) C08FF.LIZ(EnumC1533170q03.class, str);
    }

    public EnumC1533170q03(String str, int i) {
    }
}
