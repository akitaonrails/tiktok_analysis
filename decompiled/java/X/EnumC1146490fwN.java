package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1146490fwN {
    public static final EnumC1146490fwN FE_UPDATE_ITEM_EVENT;
    public static final EnumC1146490fwN INIT_WITH_SELECT;
    public static final /* synthetic */ EnumC1146490fwN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1146490fwN SELECT;

    public static InterfaceC2044707zh<EnumC1146490fwN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1146490fwN enumC1146490fwN = new EnumC1146490fwN("INIT_WITH_SELECT", 0);
        INIT_WITH_SELECT = enumC1146490fwN;
        EnumC1146490fwN enumC1146490fwN2 = new EnumC1146490fwN("SELECT", 1);
        SELECT = enumC1146490fwN2;
        EnumC1146490fwN enumC1146490fwN3 = new EnumC1146490fwN("FE_UPDATE_ITEM_EVENT", 2);
        FE_UPDATE_ITEM_EVENT = enumC1146490fwN3;
        EnumC1146490fwN[] enumC1146490fwNArr = {enumC1146490fwN, enumC1146490fwN2, enumC1146490fwN3};
        LL = enumC1146490fwNArr;
        LLILLJJLI = new C2254308sP(enumC1146490fwNArr);
    }

    public static EnumC1146490fwN[] values() {
        return (EnumC1146490fwN[]) LL.clone();
    }

    public static EnumC1146490fwN valueOf(String str) {
        return (EnumC1146490fwN) C08FF.LIZ(EnumC1146490fwN.class, str);
    }

    public EnumC1146490fwN(String str, int i) {
    }
}
