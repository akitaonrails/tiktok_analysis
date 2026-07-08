package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC578300MmC {
    public static final EnumC578300MmC CANCEL;
    public static final /* synthetic */ EnumC578300MmC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC578300MmC START;
    public static final EnumC578300MmC SWITCHING;

    public static InterfaceC2044707zh<EnumC578300MmC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC578300MmC enumC578300MmC = new EnumC578300MmC("START", 0);
        START = enumC578300MmC;
        EnumC578300MmC enumC578300MmC2 = new EnumC578300MmC("SWITCHING", 1);
        SWITCHING = enumC578300MmC2;
        EnumC578300MmC enumC578300MmC3 = new EnumC578300MmC("CANCEL", 2);
        CANCEL = enumC578300MmC3;
        EnumC578300MmC[] enumC578300MmCArr = {enumC578300MmC, enumC578300MmC2, enumC578300MmC3};
        LL = enumC578300MmCArr;
        LLILLJJLI = new C2254308sP(enumC578300MmCArr);
    }

    public static EnumC578300MmC[] values() {
        return (EnumC578300MmC[]) LL.clone();
    }

    public static EnumC578300MmC valueOf(String str) {
        return (EnumC578300MmC) C08FF.LIZ(EnumC578300MmC.class, str);
    }

    public EnumC578300MmC(String str, int i) {
    }
}
