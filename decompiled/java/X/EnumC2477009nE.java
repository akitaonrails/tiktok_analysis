package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09nE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2477009nE {
    public static final EnumC2477009nE LL;
    public static final EnumC2477009nE LLILLJJLI;
    public static final /* synthetic */ EnumC2477009nE[] LLILLL;

    static {
        EnumC2477009nE enumC2477009nE = new EnumC2477009nE("VERTICAL", 0);
        LL = enumC2477009nE;
        EnumC2477009nE enumC2477009nE2 = new EnumC2477009nE("HORIZONTAL", 1);
        LLILLJJLI = enumC2477009nE2;
        EnumC2477009nE[] enumC2477009nEArr = {enumC2477009nE, enumC2477009nE2};
        LLILLL = enumC2477009nEArr;
        new C2254308sP(enumC2477009nEArr);
    }

    public static EnumC2477009nE[] values() {
        return (EnumC2477009nE[]) LLILLL.clone();
    }

    public static EnumC2477009nE valueOf(String str) {
        return (EnumC2477009nE) C08FF.LIZ(EnumC2477009nE.class, str);
    }

    public EnumC2477009nE(String str, int i) {
    }
}
