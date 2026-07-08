package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235170iFP {
    public static final /* synthetic */ EnumC1235170iFP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1235170iFP NO;
    public static final EnumC1235170iFP YES;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1235170iFP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235170iFP enumC1235170iFP = new EnumC1235170iFP("NO", 0, 0);
        NO = enumC1235170iFP;
        EnumC1235170iFP enumC1235170iFP2 = new EnumC1235170iFP("YES", 1, 1);
        YES = enumC1235170iFP2;
        EnumC1235170iFP[] enumC1235170iFPArr = {enumC1235170iFP, enumC1235170iFP2};
        LLILLJJLI = enumC1235170iFPArr;
        LLILLL = new C2254308sP(enumC1235170iFPArr);
    }

    public static EnumC1235170iFP[] values() {
        return (EnumC1235170iFP[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1235170iFP valueOf(String str) {
        return (EnumC1235170iFP) C08FF.LIZ(EnumC1235170iFP.class, str);
    }

    public EnumC1235170iFP(String str, int i, int i2) {
        this.LL = i2;
    }
}
