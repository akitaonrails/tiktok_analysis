package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rhr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1598770rhr {
    public static final /* synthetic */ EnumC1598770rhr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1598770rhr PAGE_CHANGE;
    public static final EnumC1598770rhr SCROLL_IDLE;
    public static final EnumC1598770rhr SKYLIGHT_ATTACH;

    public static InterfaceC2044707zh<EnumC1598770rhr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1598770rhr enumC1598770rhr = new EnumC1598770rhr("SCROLL_IDLE", 0);
        SCROLL_IDLE = enumC1598770rhr;
        EnumC1598770rhr enumC1598770rhr2 = new EnumC1598770rhr("PAGE_CHANGE", 1);
        PAGE_CHANGE = enumC1598770rhr2;
        EnumC1598770rhr enumC1598770rhr3 = new EnumC1598770rhr("SKYLIGHT_ATTACH", 2);
        SKYLIGHT_ATTACH = enumC1598770rhr3;
        EnumC1598770rhr[] enumC1598770rhrArr = {enumC1598770rhr, enumC1598770rhr2, enumC1598770rhr3};
        LL = enumC1598770rhrArr;
        LLILLJJLI = new C2254308sP(enumC1598770rhrArr);
    }

    public static EnumC1598770rhr[] values() {
        return (EnumC1598770rhr[]) LL.clone();
    }

    public static EnumC1598770rhr valueOf(String str) {
        return (EnumC1598770rhr) C08FF.LIZ(EnumC1598770rhr.class, str);
    }

    public EnumC1598770rhr(String str, int i) {
    }
}
