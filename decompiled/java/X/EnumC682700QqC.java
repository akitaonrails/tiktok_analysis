package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC682700QqC {
    public static final /* synthetic */ EnumC682700QqC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC682700QqC PAGE_LANDING;
    public static final EnumC682700QqC PAGE_MIDDLE;
    public static final EnumC682700QqC PAGE_RESULT;

    public static InterfaceC2044707zh<EnumC682700QqC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC682700QqC enumC682700QqC = new EnumC682700QqC("PAGE_RESULT", 0);
        PAGE_RESULT = enumC682700QqC;
        EnumC682700QqC enumC682700QqC2 = new EnumC682700QqC("PAGE_LANDING", 1);
        PAGE_LANDING = enumC682700QqC2;
        EnumC682700QqC enumC682700QqC3 = new EnumC682700QqC("PAGE_MIDDLE", 2);
        PAGE_MIDDLE = enumC682700QqC3;
        EnumC682700QqC[] enumC682700QqCArr = {enumC682700QqC, enumC682700QqC2, enumC682700QqC3};
        LL = enumC682700QqCArr;
        LLILLJJLI = new C2254308sP(enumC682700QqCArr);
    }

    public static EnumC682700QqC[] values() {
        return (EnumC682700QqC[]) LL.clone();
    }

    public static EnumC682700QqC valueOf(String str) {
        return (EnumC682700QqC) C08FF.LIZ(EnumC682700QqC.class, str);
    }

    public EnumC682700QqC(String str, int i) {
    }
}
