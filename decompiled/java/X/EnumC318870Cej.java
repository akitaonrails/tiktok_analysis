package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Cej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC318870Cej {
    public static final EnumC318870Cej LL;
    public static final EnumC318870Cej LLILLJJLI;
    public static final EnumC318870Cej LLILLL;
    public static final /* synthetic */ EnumC318870Cej[] LLILZ;

    static {
        EnumC318870Cej enumC318870Cej = new EnumC318870Cej("NOT_SET", 0);
        LL = enumC318870Cej;
        EnumC318870Cej enumC318870Cej2 = new EnumC318870Cej("SHOW", 1);
        LLILLJJLI = enumC318870Cej2;
        EnumC318870Cej enumC318870Cej3 = new EnumC318870Cej("HIDE", 2);
        LLILLL = enumC318870Cej3;
        EnumC318870Cej[] enumC318870CejArr = {enumC318870Cej, enumC318870Cej2, enumC318870Cej3};
        LLILZ = enumC318870CejArr;
        new C2254308sP(enumC318870CejArr);
    }

    public static EnumC318870Cej[] values() {
        return (EnumC318870Cej[]) LLILZ.clone();
    }

    public static EnumC318870Cej valueOf(String str) {
        return (EnumC318870Cej) C08FF.LIZ(EnumC318870Cej.class, str);
    }

    public EnumC318870Cej(String str, int i) {
    }
}
