package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995490c0p {
    public static final EnumC995490c0p LL;
    public static final EnumC995490c0p LLILLJJLI;
    public static final /* synthetic */ EnumC995490c0p[] LLILLL;

    public static EnumC995490c0p valueOf(String str) {
        return (EnumC995490c0p) C08FF.LIZ(EnumC995490c0p.class, str);
    }

    public static EnumC995490c0p[] values() {
        return (EnumC995490c0p[]) LLILLL.clone();
    }

    static {
        EnumC995490c0p enumC995490c0p = new EnumC995490c0p("Min", 0);
        LL = enumC995490c0p;
        EnumC995490c0p enumC995490c0p2 = new EnumC995490c0p("Max", 1);
        LLILLJJLI = enumC995490c0p2;
        EnumC995490c0p[] enumC995490c0pArr = {enumC995490c0p, enumC995490c0p2};
        LLILLL = enumC995490c0pArr;
        new C2254308sP(enumC995490c0pArr);
    }

    public EnumC995490c0p(String str, int i) {
    }
}
