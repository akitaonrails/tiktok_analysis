package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0q2I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1534560q2I {
    public static final EnumC1534560q2I LL;
    public static final EnumC1534560q2I LLILLJJLI;
    public static final EnumC1534560q2I LLILLL;
    public static final EnumC1534560q2I LLILZ;
    public static final EnumC1534560q2I LLILZIL;
    public static final /* synthetic */ EnumC1534560q2I[] LLILZLL;

    static {
        EnumC1534560q2I enumC1534560q2I = new EnumC1534560q2I("PENDING", 0);
        LL = enumC1534560q2I;
        EnumC1534560q2I enumC1534560q2I2 = new EnumC1534560q2I("SUCCESS", 1);
        LLILLJJLI = enumC1534560q2I2;
        EnumC1534560q2I enumC1534560q2I3 = new EnumC1534560q2I("FAILURE", 2);
        LLILLL = enumC1534560q2I3;
        EnumC1534560q2I enumC1534560q2I4 = new EnumC1534560q2I("CANCEL", 3);
        LLILZ = enumC1534560q2I4;
        EnumC1534560q2I enumC1534560q2I5 = new EnumC1534560q2I("REDIRECTION", 4);
        LLILZIL = enumC1534560q2I5;
        EnumC1534560q2I[] enumC1534560q2IArr = {enumC1534560q2I, enumC1534560q2I2, enumC1534560q2I3, enumC1534560q2I4, enumC1534560q2I5};
        LLILZLL = enumC1534560q2IArr;
        new C2254308sP(enumC1534560q2IArr);
    }

    public static EnumC1534560q2I[] values() {
        return (EnumC1534560q2I[]) LLILZLL.clone();
    }

    public static EnumC1534560q2I valueOf(String str) {
        return (EnumC1534560q2I) C08FF.LIZ(EnumC1534560q2I.class, str);
    }

    public EnumC1534560q2I(String str, int i) {
    }
}
