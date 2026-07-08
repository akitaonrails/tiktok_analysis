package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC357040DzC {
    public static final EnumC357040DzC I2V;
    public static final /* synthetic */ EnumC357040DzC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "I2V";

    public static InterfaceC2044707zh<EnumC357040DzC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC357040DzC enumC357040DzC = new EnumC357040DzC();
        I2V = enumC357040DzC;
        EnumC357040DzC[] enumC357040DzCArr = {enumC357040DzC};
        LLILLJJLI = enumC357040DzCArr;
        LLILLL = new C2254308sP(enumC357040DzCArr);
    }

    public static EnumC357040DzC[] values() {
        return (EnumC357040DzC[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC357040DzC valueOf(String str) {
        return (EnumC357040DzC) C08FF.LIZ(EnumC357040DzC.class, str);
    }
}
