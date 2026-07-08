package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hlf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216730hlf {
    public static final EnumC1216730hlf GROUP;
    public static final /* synthetic */ EnumC1216730hlf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1216730hlf SINGLE;

    public static InterfaceC2044707zh<EnumC1216730hlf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1216730hlf enumC1216730hlf = new EnumC1216730hlf("SINGLE", 0);
        SINGLE = enumC1216730hlf;
        EnumC1216730hlf enumC1216730hlf2 = new EnumC1216730hlf("GROUP", 1);
        GROUP = enumC1216730hlf2;
        EnumC1216730hlf[] enumC1216730hlfArr = {enumC1216730hlf, enumC1216730hlf2};
        LL = enumC1216730hlfArr;
        LLILLJJLI = new C2254308sP(enumC1216730hlfArr);
    }

    public static EnumC1216730hlf[] values() {
        return (EnumC1216730hlf[]) LL.clone();
    }

    public static EnumC1216730hlf valueOf(String str) {
        return (EnumC1216730hlf) C08FF.LIZ(EnumC1216730hlf.class, str);
    }

    public EnumC1216730hlf(String str, int i) {
    }
}
