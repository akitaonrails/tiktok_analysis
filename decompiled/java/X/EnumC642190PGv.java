package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC642190PGv {
    public static final EnumC642190PGv LL;
    public static final EnumC642190PGv LLILLJJLI;
    public static final EnumC642190PGv LLILLL;
    public static final /* synthetic */ EnumC642190PGv[] LLILZ;

    static {
        EnumC642190PGv enumC642190PGv = new EnumC642190PGv("UP", 0);
        LL = enumC642190PGv;
        EnumC642190PGv enumC642190PGv2 = new EnumC642190PGv("DOWN", 1);
        LLILLJJLI = enumC642190PGv2;
        EnumC642190PGv enumC642190PGv3 = new EnumC642190PGv("SAME", 2);
        LLILLL = enumC642190PGv3;
        EnumC642190PGv[] enumC642190PGvArr = {enumC642190PGv, enumC642190PGv2, enumC642190PGv3};
        LLILZ = enumC642190PGvArr;
        new C2254308sP(enumC642190PGvArr);
    }

    public static EnumC642190PGv[] values() {
        return (EnumC642190PGv[]) LLILZ.clone();
    }

    public static EnumC642190PGv valueOf(String str) {
        return (EnumC642190PGv) C08FF.LIZ(EnumC642190PGv.class, str);
    }

    public EnumC642190PGv(String str, int i) {
    }
}
