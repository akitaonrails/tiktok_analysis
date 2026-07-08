package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC539100LCi {
    public static final EnumC539100LCi AUTOCUT;
    public static final EnumC539100LCi CUTSAME;
    public static final /* synthetic */ EnumC539100LCi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC539100LCi UGC;

    public static InterfaceC2044707zh<EnumC539100LCi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC539100LCi enumC539100LCi = new EnumC539100LCi("CUTSAME", 0);
        CUTSAME = enumC539100LCi;
        EnumC539100LCi enumC539100LCi2 = new EnumC539100LCi("UGC", 1);
        UGC = enumC539100LCi2;
        EnumC539100LCi enumC539100LCi3 = new EnumC539100LCi("AUTOCUT", 2);
        AUTOCUT = enumC539100LCi3;
        EnumC539100LCi[] enumC539100LCiArr = {enumC539100LCi, enumC539100LCi2, enumC539100LCi3};
        LL = enumC539100LCiArr;
        LLILLJJLI = new C2254308sP(enumC539100LCiArr);
    }

    public static EnumC539100LCi[] values() {
        return (EnumC539100LCi[]) LL.clone();
    }

    public static EnumC539100LCi valueOf(String str) {
        return (EnumC539100LCi) C08FF.LIZ(EnumC539100LCi.class, str);
    }

    public EnumC539100LCi(String str, int i) {
    }
}
