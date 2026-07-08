package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IoQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC477760IoQ {
    public static final EnumC477760IoQ LL;
    public static final EnumC477760IoQ LLILLJJLI;
    public static final EnumC477760IoQ LLILLL;
    public static final EnumC477760IoQ LLILZ;
    public static final /* synthetic */ EnumC477760IoQ[] LLILZIL;

    static {
        EnumC477760IoQ enumC477760IoQ = new EnumC477760IoQ("NONE", 0);
        LL = enumC477760IoQ;
        EnumC477760IoQ enumC477760IoQ2 = new EnumC477760IoQ("HANGUP_ACCEPT", 1);
        LLILLJJLI = enumC477760IoQ2;
        EnumC477760IoQ enumC477760IoQ3 = new EnumC477760IoQ("INVITE", 2);
        LLILLL = enumC477760IoQ3;
        EnumC477760IoQ enumC477760IoQ4 = new EnumC477760IoQ("GUIDE", 3);
        LLILZ = enumC477760IoQ4;
        EnumC477760IoQ[] enumC477760IoQArr = {enumC477760IoQ, enumC477760IoQ2, enumC477760IoQ3, enumC477760IoQ4};
        LLILZIL = enumC477760IoQArr;
        new C2254308sP(enumC477760IoQArr);
    }

    public static EnumC477760IoQ[] values() {
        return (EnumC477760IoQ[]) LLILZIL.clone();
    }

    public static EnumC477760IoQ valueOf(String str) {
        return (EnumC477760IoQ) C08FF.LIZ(EnumC477760IoQ.class, str);
    }

    public EnumC477760IoQ(String str, int i) {
    }
}
