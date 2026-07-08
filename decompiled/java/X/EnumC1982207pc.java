package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1982207pc {
    public static final /* synthetic */ EnumC1982207pc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1982207pc V0;
    public static final EnumC1982207pc V1;
    public static final EnumC1982207pc V2;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1982207pc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1982207pc enumC1982207pc = new EnumC1982207pc("V0", 0, 0);
        V0 = enumC1982207pc;
        EnumC1982207pc enumC1982207pc2 = new EnumC1982207pc("V1", 1, 1);
        V1 = enumC1982207pc2;
        EnumC1982207pc enumC1982207pc3 = new EnumC1982207pc("V2", 2, 2);
        V2 = enumC1982207pc3;
        EnumC1982207pc[] enumC1982207pcArr = {enumC1982207pc, enumC1982207pc2, enumC1982207pc3};
        LLILLJJLI = enumC1982207pcArr;
        LLILLL = new C2254308sP(enumC1982207pcArr);
    }

    public static EnumC1982207pc[] values() {
        return (EnumC1982207pc[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1982207pc valueOf(String str) {
        return (EnumC1982207pc) C08FF.LIZ(EnumC1982207pc.class, str);
    }

    public EnumC1982207pc(String str, int i, int i2) {
        this.LL = i2;
    }
}
