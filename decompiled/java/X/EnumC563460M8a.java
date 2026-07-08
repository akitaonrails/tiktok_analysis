package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC563460M8a {
    public static final EnumC563460M8a LL;
    public static final EnumC563460M8a LLILLJJLI;
    public static final EnumC563460M8a LLILLL;
    public static final /* synthetic */ EnumC563460M8a[] LLILZ;

    static {
        EnumC563460M8a enumC563460M8a = new EnumC563460M8a("ALL_ALLOWED", 0);
        LL = enumC563460M8a;
        EnumC563460M8a enumC563460M8a2 = new EnumC563460M8a("LIMITED_ALLOWED", 1);
        LLILLJJLI = enumC563460M8a2;
        EnumC563460M8a enumC563460M8a3 = new EnumC563460M8a("DISALLOWED", 2);
        LLILLL = enumC563460M8a3;
        EnumC563460M8a[] enumC563460M8aArr = {enumC563460M8a, enumC563460M8a2, enumC563460M8a3};
        LLILZ = enumC563460M8aArr;
        new C2254308sP(enumC563460M8aArr);
    }

    public static EnumC563460M8a[] values() {
        return (EnumC563460M8a[]) LLILZ.clone();
    }

    public static EnumC563460M8a valueOf(String str) {
        return (EnumC563460M8a) C08FF.LIZ(EnumC563460M8a.class, str);
    }

    public EnumC563460M8a(String str, int i) {
    }
}
