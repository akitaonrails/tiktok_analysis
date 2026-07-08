package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ipo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1257740ipo {
    public static final EnumC1257740ipo INITIAL;
    public static final /* synthetic */ EnumC1257740ipo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1257740ipo TOGGLED;

    public static InterfaceC2044707zh<EnumC1257740ipo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1257740ipo enumC1257740ipo = new EnumC1257740ipo("INITIAL", 0);
        INITIAL = enumC1257740ipo;
        EnumC1257740ipo enumC1257740ipo2 = new EnumC1257740ipo("TOGGLED", 1);
        TOGGLED = enumC1257740ipo2;
        EnumC1257740ipo[] enumC1257740ipoArr = {enumC1257740ipo, enumC1257740ipo2};
        LL = enumC1257740ipoArr;
        LLILLJJLI = new C2254308sP(enumC1257740ipoArr);
    }

    public static EnumC1257740ipo[] values() {
        return (EnumC1257740ipo[]) LL.clone();
    }

    public static EnumC1257740ipo valueOf(String str) {
        return (EnumC1257740ipo) C08FF.LIZ(EnumC1257740ipo.class, str);
    }

    public EnumC1257740ipo(String str, int i) {
    }
}
