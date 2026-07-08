package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0H1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC434400H1q {
    public static final EnumC434400H1q LL;
    public static final EnumC434400H1q LLILLJJLI;
    public static final EnumC434400H1q LLILLL;
    public static final EnumC434400H1q LLILZ;
    public static final /* synthetic */ EnumC434400H1q[] LLILZIL;

    static {
        EnumC434400H1q enumC434400H1q = new EnumC434400H1q("HORIZONTAL_LEFT", 0);
        LL = enumC434400H1q;
        EnumC434400H1q enumC434400H1q2 = new EnumC434400H1q("VERTICAL_UP", 1);
        LLILLJJLI = enumC434400H1q2;
        EnumC434400H1q enumC434400H1q3 = new EnumC434400H1q("NONE", 2);
        LLILLL = enumC434400H1q3;
        EnumC434400H1q enumC434400H1q4 = new EnumC434400H1q("DONE", 3);
        LLILZ = enumC434400H1q4;
        EnumC434400H1q[] enumC434400H1qArr = {enumC434400H1q, enumC434400H1q2, enumC434400H1q3, enumC434400H1q4};
        LLILZIL = enumC434400H1qArr;
        new C2254308sP(enumC434400H1qArr);
    }

    public static EnumC434400H1q[] values() {
        return (EnumC434400H1q[]) LLILZIL.clone();
    }

    public static EnumC434400H1q valueOf(String str) {
        return (EnumC434400H1q) C08FF.LIZ(EnumC434400H1q.class, str);
    }

    public EnumC434400H1q(String str, int i) {
    }
}
