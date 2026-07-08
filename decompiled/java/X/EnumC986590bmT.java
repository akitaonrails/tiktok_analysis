package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC986590bmT {
    public static final EnumC986590bmT LL;
    public static final EnumC986590bmT LLILLJJLI;
    public static final EnumC986590bmT LLILLL;
    public static final EnumC986590bmT LLILZ;
    public static final /* synthetic */ EnumC986590bmT[] LLILZIL;

    static {
        EnumC986590bmT enumC986590bmT = new EnumC986590bmT("SMALL_LOOP", 0);
        LL = enumC986590bmT;
        EnumC986590bmT enumC986590bmT2 = new EnumC986590bmT("BIG_LOOP", 1);
        LLILLJJLI = enumC986590bmT2;
        EnumC986590bmT enumC986590bmT3 = new EnumC986590bmT("TRANSITION_TO_BIG_LOOP", 2);
        LLILLL = enumC986590bmT3;
        EnumC986590bmT enumC986590bmT4 = new EnumC986590bmT("TRANSITION_TO_SMALL_LOOP", 3);
        LLILZ = enumC986590bmT4;
        EnumC986590bmT[] enumC986590bmTArr = {enumC986590bmT, enumC986590bmT2, enumC986590bmT3, enumC986590bmT4};
        LLILZIL = enumC986590bmTArr;
        new C2254308sP(enumC986590bmTArr);
    }

    public static EnumC986590bmT[] values() {
        return (EnumC986590bmT[]) LLILZIL.clone();
    }

    public static EnumC986590bmT valueOf(String str) {
        return (EnumC986590bmT) C08FF.LIZ(EnumC986590bmT.class, str);
    }

    public EnumC986590bmT(String str, int i) {
    }
}
