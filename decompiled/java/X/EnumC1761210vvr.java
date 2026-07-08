package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vvr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1761210vvr {
    public static final EnumC1761210vvr BOTTOM_END;
    public static final EnumC1761210vvr BOTTOM_START;
    public static final /* synthetic */ EnumC1761210vvr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1761210vvr TOP_END;
    public static final EnumC1761210vvr TOP_START;

    public static InterfaceC2044707zh<EnumC1761210vvr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1761210vvr enumC1761210vvr = new EnumC1761210vvr("TOP_START", 0);
        TOP_START = enumC1761210vvr;
        EnumC1761210vvr enumC1761210vvr2 = new EnumC1761210vvr("TOP_END", 1);
        TOP_END = enumC1761210vvr2;
        EnumC1761210vvr enumC1761210vvr3 = new EnumC1761210vvr("BOTTOM_START", 2);
        BOTTOM_START = enumC1761210vvr3;
        EnumC1761210vvr enumC1761210vvr4 = new EnumC1761210vvr("BOTTOM_END", 3);
        BOTTOM_END = enumC1761210vvr4;
        EnumC1761210vvr[] enumC1761210vvrArr = {enumC1761210vvr, enumC1761210vvr2, enumC1761210vvr3, enumC1761210vvr4};
        LL = enumC1761210vvrArr;
        LLILLJJLI = new C2254308sP(enumC1761210vvrArr);
    }

    public static EnumC1761210vvr[] values() {
        return (EnumC1761210vvr[]) LL.clone();
    }

    public static EnumC1761210vvr valueOf(String str) {
        return (EnumC1761210vvr) C08FF.LIZ(EnumC1761210vvr.class, str);
    }

    public EnumC1761210vvr(String str, int i) {
    }
}
