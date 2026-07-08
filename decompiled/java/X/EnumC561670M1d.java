package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC561670M1d {
    public static final EnumC561670M1d BY_AGE;
    public static final EnumC561670M1d BY_SIZE;
    public static final /* synthetic */ EnumC561670M1d[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC561670M1d> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC561670M1d enumC561670M1d = new EnumC561670M1d("BY_AGE", 0);
        BY_AGE = enumC561670M1d;
        EnumC561670M1d enumC561670M1d2 = new EnumC561670M1d("BY_SIZE", 1);
        BY_SIZE = enumC561670M1d2;
        EnumC561670M1d[] enumC561670M1dArr = {enumC561670M1d, enumC561670M1d2};
        LL = enumC561670M1dArr;
        LLILLJJLI = new C2254308sP(enumC561670M1dArr);
    }

    public static EnumC561670M1d[] values() {
        return (EnumC561670M1d[]) LL.clone();
    }

    public static EnumC561670M1d valueOf(String str) {
        return (EnumC561670M1d) C08FF.LIZ(EnumC561670M1d.class, str);
    }

    public EnumC561670M1d(String str, int i) {
    }
}
