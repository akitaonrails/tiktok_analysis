package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gkP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1177510gkP {
    public static final EnumC1177510gkP DARK;
    public static final EnumC1177510gkP LIGHT;
    public static final /* synthetic */ EnumC1177510gkP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1177510gkP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1177510gkP enumC1177510gkP = new EnumC1177510gkP("DARK", 0);
        DARK = enumC1177510gkP;
        EnumC1177510gkP enumC1177510gkP2 = new EnumC1177510gkP("LIGHT", 1);
        LIGHT = enumC1177510gkP2;
        EnumC1177510gkP[] enumC1177510gkPArr = {enumC1177510gkP, enumC1177510gkP2};
        LL = enumC1177510gkPArr;
        LLILLJJLI = new C2254308sP(enumC1177510gkPArr);
    }

    public static EnumC1177510gkP[] values() {
        return (EnumC1177510gkP[]) LL.clone();
    }

    public static EnumC1177510gkP valueOf(String str) {
        return (EnumC1177510gkP) C08FF.LIZ(EnumC1177510gkP.class, str);
    }

    public EnumC1177510gkP(String str, int i) {
    }
}
