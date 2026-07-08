package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994140bye {
    public static final EnumC994140bye LL;
    public static final EnumC994140bye LLILLJJLI;
    public static final EnumC994140bye LLILLL;
    public static final /* synthetic */ EnumC994140bye[] LLILZ;

    static {
        EnumC994140bye enumC994140bye = new EnumC994140bye("NONE", 0);
        LL = enumC994140bye;
        EnumC994140bye enumC994140bye2 = new EnumC994140bye("GUEST", 1);
        LLILLJJLI = enumC994140bye2;
        EnumC994140bye enumC994140bye3 = new EnumC994140bye("U18", 2);
        LLILLL = enumC994140bye3;
        EnumC994140bye[] enumC994140byeArr = {enumC994140bye, enumC994140bye2, enumC994140bye3};
        LLILZ = enumC994140byeArr;
        new C2254308sP(enumC994140byeArr);
    }

    public static EnumC994140bye[] values() {
        return (EnumC994140bye[]) LLILZ.clone();
    }

    public static EnumC994140bye valueOf(String str) {
        return (EnumC994140bye) C08FF.LIZ(EnumC994140bye.class, str);
    }

    public EnumC994140bye(String str, int i) {
    }
}
