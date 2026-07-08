package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Cw6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2246361Cw6 {
    public static final /* synthetic */ EnumC2246361Cw6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2246361Cw6 MENTIONING;
    public static final EnumC2246361Cw6 NORMAL;
    public static final EnumC2246361Cw6 OVERFLOW;
    public static final EnumC2246361Cw6 OVERFLOW_NEWLINES;

    public static InterfaceC2044707zh<EnumC2246361Cw6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2246361Cw6 enumC2246361Cw6 = new EnumC2246361Cw6("NORMAL", 0);
        NORMAL = enumC2246361Cw6;
        EnumC2246361Cw6 enumC2246361Cw62 = new EnumC2246361Cw6("MENTIONING", 1);
        MENTIONING = enumC2246361Cw62;
        EnumC2246361Cw6 enumC2246361Cw63 = new EnumC2246361Cw6("OVERFLOW", 2);
        OVERFLOW = enumC2246361Cw63;
        EnumC2246361Cw6 enumC2246361Cw64 = new EnumC2246361Cw6("OVERFLOW_NEWLINES", 3);
        OVERFLOW_NEWLINES = enumC2246361Cw64;
        EnumC2246361Cw6[] enumC2246361Cw6Arr = {enumC2246361Cw6, enumC2246361Cw62, enumC2246361Cw63, enumC2246361Cw64};
        LL = enumC2246361Cw6Arr;
        LLILLJJLI = new C2254308sP(enumC2246361Cw6Arr);
    }

    public static EnumC2246361Cw6[] values() {
        return (EnumC2246361Cw6[]) LL.clone();
    }

    public static EnumC2246361Cw6 valueOf(String str) {
        return (EnumC2246361Cw6) C08FF.LIZ(EnumC2246361Cw6.class, str);
    }

    public EnumC2246361Cw6(String str, int i) {
    }
}
