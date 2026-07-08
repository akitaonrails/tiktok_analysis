package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993260bxE {
    public static final EnumC993260bxE LL;
    public static final EnumC993260bxE LLILLJJLI;
    public static final EnumC993260bxE LLILLL;
    public static final /* synthetic */ EnumC993260bxE[] LLILZ;

    static {
        EnumC993260bxE enumC993260bxE = new EnumC993260bxE("POP_UP_PROFILE", 0);
        LL = enumC993260bxE;
        EnumC993260bxE enumC993260bxE2 = new EnumC993260bxE("FULL_SCREEN_PROFILE", 1);
        LLILLJJLI = enumC993260bxE2;
        EnumC993260bxE enumC993260bxE3 = new EnumC993260bxE("CIP_POP_UP_PROFILE", 2);
        LLILLL = enumC993260bxE3;
        EnumC993260bxE[] enumC993260bxEArr = {enumC993260bxE, enumC993260bxE2, enumC993260bxE3};
        LLILZ = enumC993260bxEArr;
        new C2254308sP(enumC993260bxEArr);
    }

    public static EnumC993260bxE[] values() {
        return (EnumC993260bxE[]) LLILZ.clone();
    }

    public static EnumC993260bxE valueOf(String str) {
        return (EnumC993260bxE) C08FF.LIZ(EnumC993260bxE.class, str);
    }

    public EnumC993260bxE(String str, int i) {
    }
}
