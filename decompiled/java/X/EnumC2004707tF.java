package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2004707tF {
    public static final /* synthetic */ EnumC2004707tF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2004707tF PURCHASE;
    public static final EnumC2004707tF SUBSCRIPTION;

    public static InterfaceC2044707zh<EnumC2004707tF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2004707tF enumC2004707tF = new EnumC2004707tF("PURCHASE", 0);
        PURCHASE = enumC2004707tF;
        EnumC2004707tF enumC2004707tF2 = new EnumC2004707tF("SUBSCRIPTION", 1);
        SUBSCRIPTION = enumC2004707tF2;
        EnumC2004707tF[] enumC2004707tFArr = {enumC2004707tF, enumC2004707tF2};
        LL = enumC2004707tFArr;
        LLILLJJLI = new C2254308sP(enumC2004707tFArr);
    }

    public static EnumC2004707tF[] values() {
        return (EnumC2004707tF[]) LL.clone();
    }

    public static EnumC2004707tF valueOf(String str) {
        return (EnumC2004707tF) C08FF.LIZ(EnumC2004707tF.class, str);
    }

    public EnumC2004707tF(String str, int i) {
    }
}
