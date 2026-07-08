package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1742610vRr {
    public static final EnumC1742610vRr FAIL;
    public static final EnumC1742610vRr INIT;
    public static final /* synthetic */ EnumC1742610vRr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1742610vRr LOADING;
    public static final EnumC1742610vRr NO_MORE_DATA;
    public static final EnumC1742610vRr REFRESH;
    public static final EnumC1742610vRr SUCCESS;

    public static InterfaceC2044707zh<EnumC1742610vRr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1742610vRr enumC1742610vRr = new EnumC1742610vRr("LOADING", 0);
        LOADING = enumC1742610vRr;
        EnumC1742610vRr enumC1742610vRr2 = new EnumC1742610vRr("REFRESH", 1);
        REFRESH = enumC1742610vRr2;
        EnumC1742610vRr enumC1742610vRr3 = new EnumC1742610vRr("FAIL", 2);
        FAIL = enumC1742610vRr3;
        EnumC1742610vRr enumC1742610vRr4 = new EnumC1742610vRr("SUCCESS", 3);
        SUCCESS = enumC1742610vRr4;
        EnumC1742610vRr enumC1742610vRr5 = new EnumC1742610vRr("NO_MORE_DATA", 4);
        NO_MORE_DATA = enumC1742610vRr5;
        EnumC1742610vRr enumC1742610vRr6 = new EnumC1742610vRr("INIT", 5);
        INIT = enumC1742610vRr6;
        EnumC1742610vRr[] enumC1742610vRrArr = {enumC1742610vRr, enumC1742610vRr2, enumC1742610vRr3, enumC1742610vRr4, enumC1742610vRr5, enumC1742610vRr6};
        LL = enumC1742610vRrArr;
        LLILLJJLI = new C2254308sP(enumC1742610vRrArr);
    }

    public static EnumC1742610vRr[] values() {
        return (EnumC1742610vRr[]) LL.clone();
    }

    public static EnumC1742610vRr valueOf(String str) {
        return (EnumC1742610vRr) C08FF.LIZ(EnumC1742610vRr.class, str);
    }

    public EnumC1742610vRr(String str, int i) {
    }
}
