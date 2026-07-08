package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04Fn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1067704Fn {
    public static final EnumC1067704Fn LLILLJJLI;
    public static final EnumC1067704Fn LLILLL;
    public static final EnumC1067704Fn LLILZ;
    public static final EnumC1067704Fn LLILZIL;
    public static final EnumC1067704Fn LLILZLL;
    public static final EnumC1067704Fn LLIZ;
    public static final EnumC1067704Fn LLIZLLLIL;
    public static final EnumC1067704Fn LLJ;
    public static final /* synthetic */ EnumC1067704Fn[] LLJI;
    public final int LL;

    static {
        EnumC1067704Fn enumC1067704Fn = new EnumC1067704Fn("NO_DATA_PROVIDER", 0, 0);
        LLILLJJLI = enumC1067704Fn;
        EnumC1067704Fn enumC1067704Fn2 = new EnumC1067704Fn("INVALID_BUILD_PAGE_PARAMS", 1, 1);
        LLILLL = enumC1067704Fn2;
        EnumC1067704Fn enumC1067704Fn3 = new EnumC1067704Fn("INVALID_BUILD_TRACE_PARAMS", 2, 2);
        LLILZ = enumC1067704Fn3;
        EnumC1067704Fn enumC1067704Fn4 = new EnumC1067704Fn("INVALID_BUILD_BTM_PARAMS", 3, 3);
        LLILZIL = enumC1067704Fn4;
        EnumC1067704Fn enumC1067704Fn5 = new EnumC1067704Fn("NO_TRACK_DATA", 4, 100);
        LLILZLL = enumC1067704Fn5;
        EnumC1067704Fn enumC1067704Fn6 = new EnumC1067704Fn("NO_EVENT_GROUP", 5, 101);
        LLIZ = enumC1067704Fn6;
        EnumC1067704Fn enumC1067704Fn7 = new EnumC1067704Fn("EMPTY_EVENT_LIST", 6, 102);
        LLIZLLLIL = enumC1067704Fn7;
        EnumC1067704Fn enumC1067704Fn8 = new EnumC1067704Fn("NO_TEMPLATE_PARAMS", 7, 200);
        LLJ = enumC1067704Fn8;
        EnumC1067704Fn[] enumC1067704FnArr = {enumC1067704Fn, enumC1067704Fn2, enumC1067704Fn3, enumC1067704Fn4, enumC1067704Fn5, enumC1067704Fn6, enumC1067704Fn7, enumC1067704Fn8};
        LLJI = enumC1067704FnArr;
        new C2254308sP(enumC1067704FnArr);
    }

    public static EnumC1067704Fn[] values() {
        return (EnumC1067704Fn[]) LLJI.clone();
    }

    public static EnumC1067704Fn valueOf(String str) {
        return (EnumC1067704Fn) C08FF.LIZ(EnumC1067704Fn.class, str);
    }

    public EnumC1067704Fn(String str, int i, int i2) {
        this.LL = i2;
    }
}
