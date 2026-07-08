package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ETf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC365130ETf {
    public static final EnumC365130ETf LL;
    public static final EnumC365130ETf LLILLJJLI;
    public static final EnumC365130ETf LLILLL;
    public static final EnumC365130ETf LLILZ;
    public static final /* synthetic */ EnumC365130ETf[] LLILZIL;

    static {
        EnumC365130ETf enumC365130ETf = new EnumC365130ETf("NORMAL", 0);
        LL = enumC365130ETf;
        EnumC365130ETf enumC365130ETf2 = new EnumC365130ETf("DYNAMIC_LENS", 1);
        LLILLJJLI = enumC365130ETf2;
        EnumC365130ETf enumC365130ETf3 = new EnumC365130ETf("TIME", 2);
        LLILLL = enumC365130ETf3;
        EnumC365130ETf enumC365130ETf4 = new EnumC365130ETf("NONE", 3);
        LLILZ = enumC365130ETf4;
        EnumC365130ETf[] enumC365130ETfArr = {enumC365130ETf, enumC365130ETf2, enumC365130ETf3, enumC365130ETf4};
        LLILZIL = enumC365130ETfArr;
        new C2254308sP(enumC365130ETfArr);
    }

    public static EnumC365130ETf[] values() {
        return (EnumC365130ETf[]) LLILZIL.clone();
    }

    public static EnumC365130ETf valueOf(String str) {
        return (EnumC365130ETf) C08FF.LIZ(EnumC365130ETf.class, str);
    }

    public EnumC365130ETf(String str, int i) {
    }
}
