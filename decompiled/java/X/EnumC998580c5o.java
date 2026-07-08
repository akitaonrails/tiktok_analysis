package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC998580c5o {
    public static final EnumC998580c5o LL;
    public static final EnumC998580c5o LLILLJJLI;
    public static final EnumC998580c5o LLILLL;
    public static final EnumC998580c5o LLILZ;
    public static final EnumC998580c5o LLILZIL;
    public static final /* synthetic */ EnumC998580c5o[] LLILZLL;

    static {
        EnumC998580c5o enumC998580c5o = new EnumC998580c5o("NONE", 0);
        LL = enumC998580c5o;
        EnumC998580c5o enumC998580c5o2 = new EnumC998580c5o("CLICK", 1);
        LLILLJJLI = enumC998580c5o2;
        EnumC998580c5o enumC998580c5o3 = new EnumC998580c5o("DOUBLE_TAP", 2);
        LLILLL = enumC998580c5o3;
        EnumC998580c5o enumC998580c5o4 = new EnumC998580c5o("SCROLL", 3);
        LLILZ = enumC998580c5o4;
        EnumC998580c5o enumC998580c5o5 = new EnumC998580c5o("INTERCEPT", 4);
        LLILZIL = enumC998580c5o5;
        EnumC998580c5o[] enumC998580c5oArr = {enumC998580c5o, enumC998580c5o2, enumC998580c5o3, enumC998580c5o4, enumC998580c5o5};
        LLILZLL = enumC998580c5oArr;
        new C2254308sP(enumC998580c5oArr);
    }

    public static EnumC998580c5o[] values() {
        return (EnumC998580c5o[]) LLILZLL.clone();
    }

    public static EnumC998580c5o valueOf(String str) {
        return (EnumC998580c5o) C08FF.LIZ(EnumC998580c5o.class, str);
    }

    public EnumC998580c5o(String str, int i) {
    }
}
