package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yEE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1849480yEE {
    public static final EnumC1849480yEE LL;
    public static final EnumC1849480yEE LLILLJJLI;
    public static final /* synthetic */ EnumC1849480yEE[] LLILLL;

    static {
        EnumC1849480yEE enumC1849480yEE = new EnumC1849480yEE("FULL", 0);
        LL = enumC1849480yEE;
        EnumC1849480yEE enumC1849480yEE2 = new EnumC1849480yEE("PRIMARY_ONLY", 1);
        LLILLJJLI = enumC1849480yEE2;
        EnumC1849480yEE[] enumC1849480yEEArr = {enumC1849480yEE, enumC1849480yEE2};
        LLILLL = enumC1849480yEEArr;
        new C2254308sP(enumC1849480yEEArr);
    }

    public static EnumC1849480yEE[] values() {
        return (EnumC1849480yEE[]) LLILLL.clone();
    }

    public static EnumC1849480yEE valueOf(String str) {
        return (EnumC1849480yEE) C08FF.LIZ(EnumC1849480yEE.class, str);
    }

    public EnumC1849480yEE(String str, int i) {
    }
}
