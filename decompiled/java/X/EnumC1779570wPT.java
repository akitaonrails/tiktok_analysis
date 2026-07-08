package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779570wPT {
    public static final EnumC1779570wPT INIT;
    public static final /* synthetic */ EnumC1779570wPT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779570wPT LONG_PRESS;
    public static final EnumC1779570wPT SWIPE;

    public static InterfaceC2044707zh<EnumC1779570wPT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779570wPT enumC1779570wPT = new EnumC1779570wPT("INIT", 0);
        INIT = enumC1779570wPT;
        EnumC1779570wPT enumC1779570wPT2 = new EnumC1779570wPT("LONG_PRESS", 1);
        LONG_PRESS = enumC1779570wPT2;
        EnumC1779570wPT enumC1779570wPT3 = new EnumC1779570wPT("SWIPE", 2);
        SWIPE = enumC1779570wPT3;
        EnumC1779570wPT[] enumC1779570wPTArr = {enumC1779570wPT, enumC1779570wPT2, enumC1779570wPT3};
        LL = enumC1779570wPTArr;
        LLILLJJLI = new C2254308sP(enumC1779570wPTArr);
    }

    public static EnumC1779570wPT[] values() {
        return (EnumC1779570wPT[]) LL.clone();
    }

    public static EnumC1779570wPT valueOf(String str) {
        return (EnumC1779570wPT) C08FF.LIZ(EnumC1779570wPT.class, str);
    }

    public EnumC1779570wPT(String str, int i) {
    }
}
