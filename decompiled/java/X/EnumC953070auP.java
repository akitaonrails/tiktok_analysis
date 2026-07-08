package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0auP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC953070auP {
    public static final EnumC953070auP INPUT;
    public static final /* synthetic */ EnumC953070auP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC953070auP NORMAL;
    public static final EnumC953070auP NORMAL_SELECT;
    public static final EnumC953070auP TEXT_STYLE;

    public static InterfaceC2044707zh<EnumC953070auP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC953070auP enumC953070auP = new EnumC953070auP("NORMAL", 0);
        NORMAL = enumC953070auP;
        EnumC953070auP enumC953070auP2 = new EnumC953070auP("NORMAL_SELECT", 1);
        NORMAL_SELECT = enumC953070auP2;
        EnumC953070auP enumC953070auP3 = new EnumC953070auP("INPUT", 2);
        INPUT = enumC953070auP3;
        EnumC953070auP enumC953070auP4 = new EnumC953070auP("TEXT_STYLE", 3);
        TEXT_STYLE = enumC953070auP4;
        EnumC953070auP[] enumC953070auPArr = {enumC953070auP, enumC953070auP2, enumC953070auP3, enumC953070auP4};
        LL = enumC953070auPArr;
        LLILLJJLI = new C2254308sP(enumC953070auPArr);
    }

    public static EnumC953070auP[] values() {
        return (EnumC953070auP[]) LL.clone();
    }

    public static EnumC953070auP valueOf(String str) {
        return (EnumC953070auP) C08FF.LIZ(EnumC953070auP.class, str);
    }

    public EnumC953070auP(String str, int i) {
    }
}
