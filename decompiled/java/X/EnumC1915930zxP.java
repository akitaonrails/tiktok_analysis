package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zxP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1915930zxP {
    public static final EnumC1915930zxP EU;
    public static final EnumC1915930zxP KR;
    public static final /* synthetic */ EnumC1915930zxP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1915930zxP ROW;
    public static final EnumC1915930zxP UNKNOWN;
    public static final EnumC1915930zxP US;

    public static InterfaceC2044707zh<EnumC1915930zxP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1915930zxP enumC1915930zxP = new EnumC1915930zxP("US", 0);
        US = enumC1915930zxP;
        EnumC1915930zxP enumC1915930zxP2 = new EnumC1915930zxP("EU", 1);
        EU = enumC1915930zxP2;
        EnumC1915930zxP enumC1915930zxP3 = new EnumC1915930zxP("KR", 2);
        KR = enumC1915930zxP3;
        EnumC1915930zxP enumC1915930zxP4 = new EnumC1915930zxP("ROW", 3);
        ROW = enumC1915930zxP4;
        EnumC1915930zxP enumC1915930zxP5 = new EnumC1915930zxP("UNKNOWN", 4);
        UNKNOWN = enumC1915930zxP5;
        EnumC1915930zxP[] enumC1915930zxPArr = {enumC1915930zxP, enumC1915930zxP2, enumC1915930zxP3, enumC1915930zxP4, enumC1915930zxP5};
        LL = enumC1915930zxPArr;
        LLILLJJLI = new C2254308sP(enumC1915930zxPArr);
    }

    public static EnumC1915930zxP[] values() {
        return (EnumC1915930zxP[]) LL.clone();
    }

    public static EnumC1915930zxP valueOf(String str) {
        return (EnumC1915930zxP) C08FF.LIZ(EnumC1915930zxP.class, str);
    }

    public EnumC1915930zxP(String str, int i) {
    }
}
