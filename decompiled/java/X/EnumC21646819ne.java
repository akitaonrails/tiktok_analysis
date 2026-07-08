package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC21646819ne {
    public static final EnumC21646819ne LL;
    public static final EnumC21646819ne LLILLJJLI;
    public static final EnumC21646819ne LLILLL;
    public static final EnumC21646819ne LLILZ;
    public static final /* synthetic */ EnumC21646819ne[] LLILZIL;

    static {
        EnumC21646819ne enumC21646819ne = new EnumC21646819ne("NONE", 0);
        LL = enumC21646819ne;
        EnumC21646819ne enumC21646819ne2 = new EnumC21646819ne("HINT", 1);
        LLILLJJLI = enumC21646819ne2;
        EnumC21646819ne enumC21646819ne3 = new EnumC21646819ne("THOUGHT", 2);
        LLILLL = enumC21646819ne3;
        EnumC21646819ne enumC21646819ne4 = new EnumC21646819ne("EXPANDED_THOUGHT", 3);
        LLILZ = enumC21646819ne4;
        EnumC21646819ne[] enumC21646819neArr = {enumC21646819ne, enumC21646819ne2, enumC21646819ne3, enumC21646819ne4};
        LLILZIL = enumC21646819neArr;
        new C2254308sP(enumC21646819neArr);
    }

    public static EnumC21646819ne[] values() {
        return (EnumC21646819ne[]) LLILZIL.clone();
    }

    public static EnumC21646819ne valueOf(String str) {
        return (EnumC21646819ne) C08FF.LIZ(EnumC21646819ne.class, str);
    }

    public EnumC21646819ne(String str, int i) {
    }
}
