package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1841270y0z {
    public static final EnumC1841270y0z GOOGLE_PLAY;
    public static final /* synthetic */ EnumC1841270y0z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1841270y0z WEB;

    public static InterfaceC2044707zh<EnumC1841270y0z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1841270y0z enumC1841270y0z = new EnumC1841270y0z("WEB", 0);
        WEB = enumC1841270y0z;
        EnumC1841270y0z enumC1841270y0z2 = new EnumC1841270y0z("GOOGLE_PLAY", 1);
        GOOGLE_PLAY = enumC1841270y0z2;
        EnumC1841270y0z[] enumC1841270y0zArr = {enumC1841270y0z, enumC1841270y0z2};
        LL = enumC1841270y0zArr;
        LLILLJJLI = new C2254308sP(enumC1841270y0zArr);
    }

    public static EnumC1841270y0z[] values() {
        return (EnumC1841270y0z[]) LL.clone();
    }

    public static EnumC1841270y0z valueOf(String str) {
        return (EnumC1841270y0z) C08FF.LIZ(EnumC1841270y0z.class, str);
    }

    public EnumC1841270y0z(String str, int i) {
    }
}
