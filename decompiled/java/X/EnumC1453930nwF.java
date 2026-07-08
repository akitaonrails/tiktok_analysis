package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nwF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1453930nwF {
    public static final /* synthetic */ EnumC1453930nwF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1453930nwF P0;
    public static final EnumC1453930nwF P1;
    public static final EnumC1453930nwF P2;
    public static final EnumC1453930nwF P_BACK_TO_EDIT;

    public static InterfaceC2044707zh<EnumC1453930nwF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1453930nwF enumC1453930nwF = new EnumC1453930nwF("P0", 0);
        P0 = enumC1453930nwF;
        EnumC1453930nwF enumC1453930nwF2 = new EnumC1453930nwF("P1", 1);
        P1 = enumC1453930nwF2;
        EnumC1453930nwF enumC1453930nwF3 = new EnumC1453930nwF("P2", 2);
        P2 = enumC1453930nwF3;
        EnumC1453930nwF enumC1453930nwF4 = new EnumC1453930nwF("P_BACK_TO_EDIT", 3);
        P_BACK_TO_EDIT = enumC1453930nwF4;
        EnumC1453930nwF[] enumC1453930nwFArr = {enumC1453930nwF, enumC1453930nwF2, enumC1453930nwF3, enumC1453930nwF4};
        LL = enumC1453930nwFArr;
        LLILLJJLI = new C2254308sP(enumC1453930nwFArr);
    }

    public static EnumC1453930nwF[] values() {
        return (EnumC1453930nwF[]) LL.clone();
    }

    public static EnumC1453930nwF valueOf(String str) {
        return (EnumC1453930nwF) C08FF.LIZ(EnumC1453930nwF.class, str);
    }

    public EnumC1453930nwF(String str, int i) {
    }
}
