package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HoJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC452210HoJ {
    public static final EnumC452210HoJ INVALID_INPUT;
    public static final EnumC452210HoJ KEYBOARD_DISMISS;
    public static final /* synthetic */ EnumC452210HoJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC452210HoJ NO_RESULT;

    public static InterfaceC2044707zh<EnumC452210HoJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC452210HoJ enumC452210HoJ = new EnumC452210HoJ("KEYBOARD_DISMISS", 0);
        KEYBOARD_DISMISS = enumC452210HoJ;
        EnumC452210HoJ enumC452210HoJ2 = new EnumC452210HoJ("INVALID_INPUT", 1);
        INVALID_INPUT = enumC452210HoJ2;
        EnumC452210HoJ enumC452210HoJ3 = new EnumC452210HoJ("NO_RESULT", 2);
        NO_RESULT = enumC452210HoJ3;
        EnumC452210HoJ[] enumC452210HoJArr = {enumC452210HoJ, enumC452210HoJ2, enumC452210HoJ3};
        LL = enumC452210HoJArr;
        LLILLJJLI = new C2254308sP(enumC452210HoJArr);
    }

    public static EnumC452210HoJ[] values() {
        return (EnumC452210HoJ[]) LL.clone();
    }

    public static EnumC452210HoJ valueOf(String str) {
        return (EnumC452210HoJ) C08FF.LIZ(EnumC452210HoJ.class, str);
    }

    public EnumC452210HoJ(String str, int i) {
    }
}
