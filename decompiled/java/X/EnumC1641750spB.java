package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0spB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641750spB {
    public static final EnumC1641750spB LL;
    public static final EnumC1641750spB LLILLJJLI;
    public static final EnumC1641750spB LLILLL;
    public static final /* synthetic */ EnumC1641750spB[] LLILZ;

    static {
        EnumC1641750spB enumC1641750spB = new EnumC1641750spB("NONE", 0);
        LL = enumC1641750spB;
        EnumC1641750spB enumC1641750spB2 = new EnumC1641750spB("SHOW", 1);
        LLILLJJLI = enumC1641750spB2;
        EnumC1641750spB enumC1641750spB3 = new EnumC1641750spB("HIDE", 2);
        LLILLL = enumC1641750spB3;
        EnumC1641750spB[] enumC1641750spBArr = {enumC1641750spB, enumC1641750spB2, enumC1641750spB3};
        LLILZ = enumC1641750spBArr;
        new C2254308sP(enumC1641750spBArr);
    }

    public static EnumC1641750spB[] values() {
        return (EnumC1641750spB[]) LLILZ.clone();
    }

    public static EnumC1641750spB valueOf(String str) {
        return (EnumC1641750spB) C08FF.LIZ(EnumC1641750spB.class, str);
    }

    public EnumC1641750spB(String str, int i) {
    }
}
