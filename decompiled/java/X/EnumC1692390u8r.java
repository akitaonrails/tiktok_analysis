package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0u8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1692390u8r {
    public static final EnumC1692390u8r COLLAPSED;
    public static final EnumC1692390u8r CROSSED;
    public static final /* synthetic */ EnumC1692390u8r[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1692390u8r NOT_CROSSED;

    public static InterfaceC2044707zh<EnumC1692390u8r> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1692390u8r valueOf(String str) {
        return (EnumC1692390u8r) C08FF.LIZ(EnumC1692390u8r.class, str);
    }

    public static EnumC1692390u8r[] values() {
        return (EnumC1692390u8r[]) LL.clone();
    }

    static {
        EnumC1692390u8r enumC1692390u8r = new EnumC1692390u8r("CROSSED", 0);
        CROSSED = enumC1692390u8r;
        EnumC1692390u8r enumC1692390u8r2 = new EnumC1692390u8r("NOT_CROSSED", 1);
        NOT_CROSSED = enumC1692390u8r2;
        EnumC1692390u8r enumC1692390u8r3 = new EnumC1692390u8r("COLLAPSED", 2);
        COLLAPSED = enumC1692390u8r3;
        EnumC1692390u8r[] enumC1692390u8rArr = {enumC1692390u8r, enumC1692390u8r2, enumC1692390u8r3};
        LL = enumC1692390u8rArr;
        LLILLJJLI = new C2254308sP(enumC1692390u8rArr);
    }

    public EnumC1692390u8r(String str, int i) {
    }
}
