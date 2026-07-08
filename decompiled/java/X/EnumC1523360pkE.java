package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pkE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1523360pkE {
    public static final EnumC1523360pkE LL;
    public static final EnumC1523360pkE LLILLJJLI;
    public static final /* synthetic */ EnumC1523360pkE[] LLILLL;

    static {
        EnumC1523360pkE enumC1523360pkE = new EnumC1523360pkE("CACHE", 0);
        LL = enumC1523360pkE;
        EnumC1523360pkE enumC1523360pkE2 = new EnumC1523360pkE("REAL_TIME", 1);
        LLILLJJLI = enumC1523360pkE2;
        EnumC1523360pkE[] enumC1523360pkEArr = {enumC1523360pkE, enumC1523360pkE2};
        LLILLL = enumC1523360pkEArr;
        new C2254308sP(enumC1523360pkEArr);
    }

    public static EnumC1523360pkE[] values() {
        return (EnumC1523360pkE[]) LLILLL.clone();
    }

    public static EnumC1523360pkE valueOf(String str) {
        return (EnumC1523360pkE) C08FF.LIZ(EnumC1523360pkE.class, str);
    }

    public EnumC1523360pkE(String str, int i) {
    }
}
