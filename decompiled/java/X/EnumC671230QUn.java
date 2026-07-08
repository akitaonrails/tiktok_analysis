package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC671230QUn {
    public static final EnumC671230QUn AUTO;
    public static final EnumC671230QUn BLACK;
    public static final /* synthetic */ EnumC671230QUn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC671230QUn MAIN_COLOR_DARK;

    public static InterfaceC2044707zh<EnumC671230QUn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC671230QUn enumC671230QUn = new EnumC671230QUn("BLACK", 0);
        BLACK = enumC671230QUn;
        EnumC671230QUn enumC671230QUn2 = new EnumC671230QUn("AUTO", 1);
        AUTO = enumC671230QUn2;
        EnumC671230QUn enumC671230QUn3 = new EnumC671230QUn("MAIN_COLOR_DARK", 2);
        MAIN_COLOR_DARK = enumC671230QUn3;
        EnumC671230QUn[] enumC671230QUnArr = {enumC671230QUn, enumC671230QUn2, enumC671230QUn3};
        LL = enumC671230QUnArr;
        LLILLJJLI = new C2254308sP(enumC671230QUnArr);
    }

    public static EnumC671230QUn[] values() {
        return (EnumC671230QUn[]) LL.clone();
    }

    public static EnumC671230QUn valueOf(String str) {
        return (EnumC671230QUn) C08FF.LIZ(EnumC671230QUn.class, str);
    }

    public EnumC671230QUn(String str, int i) {
    }
}
