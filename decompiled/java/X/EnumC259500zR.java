package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00zR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC259500zR {
    public static final EnumC259500zR LL;
    public static final EnumC259500zR LLILLJJLI;
    public static final EnumC259500zR LLILLL;
    public static final EnumC259500zR LLILZ;
    public static final /* synthetic */ EnumC259500zR[] LLILZIL;

    static {
        EnumC259500zR enumC259500zR = new EnumC259500zR("ONGOING", 0);
        LL = enumC259500zR;
        EnumC259500zR enumC259500zR2 = new EnumC259500zR("STOPBETTING", 1);
        LLILLJJLI = enumC259500zR2;
        EnumC259500zR enumC259500zR3 = new EnumC259500zR("RESOLVED", 2);
        LLILLL = enumC259500zR3;
        EnumC259500zR enumC259500zR4 = new EnumC259500zR("OTHER", 3);
        LLILZ = enumC259500zR4;
        EnumC259500zR[] enumC259500zRArr = {enumC259500zR, enumC259500zR2, enumC259500zR3, enumC259500zR4};
        LLILZIL = enumC259500zRArr;
        new C2254308sP(enumC259500zRArr);
    }

    public static EnumC259500zR[] values() {
        return (EnumC259500zR[]) LLILZIL.clone();
    }

    public static EnumC259500zR valueOf(String str) {
        return (EnumC259500zR) C08FF.LIZ(EnumC259500zR.class, str);
    }

    public EnumC259500zR(String str, int i) {
    }
}
