package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pmP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1524710pmP {
    public static final EnumC1524710pmP ARRAYBUFFER;
    public static final C1525260pnI Companion;
    public static final /* synthetic */ EnumC1524710pmP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1524710pmP STRING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1524710pmP> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0pnI] */
    static {
        EnumC1524710pmP enumC1524710pmP = new EnumC1524710pmP("STRING", 0, "string");
        STRING = enumC1524710pmP;
        EnumC1524710pmP enumC1524710pmP2 = new EnumC1524710pmP("ARRAYBUFFER", 1, "arraybuffer");
        ARRAYBUFFER = enumC1524710pmP2;
        EnumC1524710pmP[] enumC1524710pmPArr = {enumC1524710pmP, enumC1524710pmP2};
        LLILLJJLI = enumC1524710pmPArr;
        LLILLL = new C2254308sP(enumC1524710pmPArr);
        Companion = new Object() { // from class: X.0pnI
        };
    }

    public static EnumC1524710pmP[] values() {
        return (EnumC1524710pmP[]) LLILLJJLI.clone();
    }

    public final String getWireValue() {
        return this.LL;
    }

    public static EnumC1524710pmP valueOf(String str) {
        return (EnumC1524710pmP) C08FF.LIZ(EnumC1524710pmP.class, str);
    }

    public EnumC1524710pmP(String str, int i, String str2) {
        this.LL = str2;
    }
}
