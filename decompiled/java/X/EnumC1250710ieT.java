package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ieT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1250710ieT {
    public static final EnumC1250710ieT AUTO;
    public static final EnumC1250710ieT CLICK;
    public static final /* synthetic */ EnumC1250710ieT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1250710ieT UNINITIALIZED;

    public static InterfaceC2044707zh<EnumC1250710ieT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1250710ieT enumC1250710ieT = new EnumC1250710ieT("UNINITIALIZED", 0);
        UNINITIALIZED = enumC1250710ieT;
        EnumC1250710ieT enumC1250710ieT2 = new EnumC1250710ieT("CLICK", 1);
        CLICK = enumC1250710ieT2;
        EnumC1250710ieT enumC1250710ieT3 = new EnumC1250710ieT("AUTO", 2);
        AUTO = enumC1250710ieT3;
        EnumC1250710ieT[] enumC1250710ieTArr = {enumC1250710ieT, enumC1250710ieT2, enumC1250710ieT3};
        LL = enumC1250710ieTArr;
        LLILLJJLI = new C2254308sP(enumC1250710ieTArr);
    }

    public static EnumC1250710ieT[] values() {
        return (EnumC1250710ieT[]) LL.clone();
    }

    public static EnumC1250710ieT valueOf(String str) {
        return (EnumC1250710ieT) C08FF.LIZ(EnumC1250710ieT.class, str);
    }

    public EnumC1250710ieT(String str, int i) {
    }
}
