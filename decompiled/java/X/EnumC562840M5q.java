package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M5q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC562840M5q {
    public static final EnumC562840M5q LL;
    public static final EnumC562840M5q LLILLJJLI;
    public static final EnumC562840M5q LLILLL;
    public static final EnumC562840M5q LLILZ;
    public static final /* synthetic */ EnumC562840M5q[] LLILZIL;

    static {
        EnumC562840M5q enumC562840M5q = new EnumC562840M5q("AI_REMIX", 0);
        LL = enumC562840M5q;
        EnumC562840M5q enumC562840M5q2 = new EnumC562840M5q("ASYNC_TASK", 1);
        LLILLJJLI = enumC562840M5q2;
        EnumC562840M5q enumC562840M5q3 = new EnumC562840M5q("FREE_UP_SPACE", 2);
        LLILLL = enumC562840M5q3;
        EnumC562840M5q enumC562840M5q4 = new EnumC562840M5q("NONE", 3);
        LLILZ = enumC562840M5q4;
        EnumC562840M5q[] enumC562840M5qArr = {enumC562840M5q, enumC562840M5q2, enumC562840M5q3, enumC562840M5q4};
        LLILZIL = enumC562840M5qArr;
        new C2254308sP(enumC562840M5qArr);
    }

    public static EnumC562840M5q[] values() {
        return (EnumC562840M5q[]) LLILZIL.clone();
    }

    public static EnumC562840M5q valueOf(String str) {
        return (EnumC562840M5q) C08FF.LIZ(EnumC562840M5q.class, str);
    }

    public EnumC562840M5q(String str, int i) {
    }
}
