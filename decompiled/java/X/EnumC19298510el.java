package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10el, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19298510el {
    public static final C19298610em Companion;
    public static final EnumC19298510el DISABLE;
    public static final EnumC19298510el HIDE;
    public static final /* synthetic */ EnumC19298510el[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19298510el SHOW_CHECKED;
    public static final EnumC19298510el SHOW_UNCHECKED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19298510el> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.10em] */
    static {
        EnumC19298510el enumC19298510el = new EnumC19298510el("HIDE", 0, 0);
        HIDE = enumC19298510el;
        EnumC19298510el enumC19298510el2 = new EnumC19298510el("SHOW_CHECKED", 1, 1);
        SHOW_CHECKED = enumC19298510el2;
        EnumC19298510el enumC19298510el3 = new EnumC19298510el("SHOW_UNCHECKED", 2, 2);
        SHOW_UNCHECKED = enumC19298510el3;
        EnumC19298510el enumC19298510el4 = new EnumC19298510el("DISABLE", 3, 3);
        DISABLE = enumC19298510el4;
        EnumC19298510el[] enumC19298510elArr = {enumC19298510el, enumC19298510el2, enumC19298510el3, enumC19298510el4};
        LLILLJJLI = enumC19298510elArr;
        LLILLL = new C2254308sP(enumC19298510elArr);
        Companion = new Object() { // from class: X.10em
        };
    }

    public static EnumC19298510el[] values() {
        return (EnumC19298510el[]) LLILLJJLI.clone();
    }

    public final int getFlag() {
        return this.LL;
    }

    public static EnumC19298510el valueOf(String str) {
        return (EnumC19298510el) C08FF.LIZ(EnumC19298510el.class, str);
    }

    public EnumC19298510el(String str, int i, int i2) {
        this.LL = i2;
    }
}
