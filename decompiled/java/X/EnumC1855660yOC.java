package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yOC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1855660yOC {
    public static final EnumC1855660yOC CANCELLING_LONG_PRESS;
    public static final EnumC1855660yOC INITIATE;
    public static final /* synthetic */ EnumC1855660yOC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1855660yOC TALKING_CLICK;
    public static final EnumC1855660yOC TALKING_LONG_PRESS;

    public static InterfaceC2044707zh<EnumC1855660yOC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1855660yOC enumC1855660yOC = new EnumC1855660yOC("INITIATE", 0);
        INITIATE = enumC1855660yOC;
        EnumC1855660yOC enumC1855660yOC2 = new EnumC1855660yOC("TALKING_CLICK", 1);
        TALKING_CLICK = enumC1855660yOC2;
        EnumC1855660yOC enumC1855660yOC3 = new EnumC1855660yOC("TALKING_LONG_PRESS", 2);
        TALKING_LONG_PRESS = enumC1855660yOC3;
        EnumC1855660yOC enumC1855660yOC4 = new EnumC1855660yOC("CANCELLING_LONG_PRESS", 3);
        CANCELLING_LONG_PRESS = enumC1855660yOC4;
        EnumC1855660yOC[] enumC1855660yOCArr = {enumC1855660yOC, enumC1855660yOC2, enumC1855660yOC3, enumC1855660yOC4};
        LL = enumC1855660yOCArr;
        LLILLJJLI = new C2254308sP(enumC1855660yOCArr);
    }

    public static EnumC1855660yOC[] values() {
        return (EnumC1855660yOC[]) LL.clone();
    }

    public static EnumC1855660yOC valueOf(String str) {
        return (EnumC1855660yOC) C08FF.LIZ(EnumC1855660yOC.class, str);
    }

    public EnumC1855660yOC(String str, int i) {
    }
}
