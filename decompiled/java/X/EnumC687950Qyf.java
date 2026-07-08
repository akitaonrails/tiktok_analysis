package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC687950Qyf {
    public static final EnumC687950Qyf COARSE;
    public static final /* synthetic */ EnumC687950Qyf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC687950Qyf PRECISE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC687950Qyf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC687950Qyf enumC687950Qyf = new EnumC687950Qyf("COARSE", 0, 2);
        COARSE = enumC687950Qyf;
        EnumC687950Qyf enumC687950Qyf2 = new EnumC687950Qyf("PRECISE", 1, 3);
        PRECISE = enumC687950Qyf2;
        EnumC687950Qyf[] enumC687950QyfArr = {enumC687950Qyf, enumC687950Qyf2};
        LLILLJJLI = enumC687950QyfArr;
        LLILLL = new C2254308sP(enumC687950QyfArr);
    }

    public static EnumC687950Qyf[] values() {
        return (EnumC687950Qyf[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC687950Qyf valueOf(String str) {
        return (EnumC687950Qyf) C08FF.LIZ(EnumC687950Qyf.class, str);
    }

    public EnumC687950Qyf(String str, int i, int i2) {
        this.LL = i2;
    }
}
