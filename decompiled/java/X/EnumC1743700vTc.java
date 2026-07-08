package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1743700vTc {
    public static final EnumC1743700vTc LL;
    public static final EnumC1743700vTc LLILLJJLI;
    public static final EnumC1743700vTc LLILLL;
    public static final EnumC1743700vTc LLILZ;
    public static final /* synthetic */ EnumC1743700vTc[] LLILZIL;

    static {
        EnumC1743700vTc enumC1743700vTc = new EnumC1743700vTc("FINISH", 0);
        LL = enumC1743700vTc;
        EnumC1743700vTc enumC1743700vTc2 = new EnumC1743700vTc("PAUSED", 1);
        LLILLJJLI = enumC1743700vTc2;
        EnumC1743700vTc enumC1743700vTc3 = new EnumC1743700vTc("DESTROYED", 2);
        LLILLL = enumC1743700vTc3;
        EnumC1743700vTc enumC1743700vTc4 = new EnumC1743700vTc("RESUMED", 3);
        LLILZ = enumC1743700vTc4;
        EnumC1743700vTc[] enumC1743700vTcArr = {enumC1743700vTc, enumC1743700vTc2, enumC1743700vTc3, enumC1743700vTc4};
        LLILZIL = enumC1743700vTcArr;
        new C2254308sP(enumC1743700vTcArr);
    }

    public static EnumC1743700vTc[] values() {
        return (EnumC1743700vTc[]) LLILZIL.clone();
    }

    public static EnumC1743700vTc valueOf(String str) {
        return (EnumC1743700vTc) C08FF.LIZ(EnumC1743700vTc.class, str);
    }

    public EnumC1743700vTc(String str, int i) {
    }
}
