package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC719330SJn {
    public static final EnumC719330SJn CHARACTER_ATTR_EQUAL;
    public static final EnumC719330SJn CHARACTER_ATTR_VALUE_QUOTES;
    public static final EnumC719330SJn CHARACTER_END;
    public static final EnumC719330SJn CHARACTER_LINE_SLANT;
    public static final EnumC719330SJn CHARACTER_SPACE;
    public static final EnumC719330SJn CHARACTER_START;
    public static final /* synthetic */ EnumC719330SJn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final char LL;

    public static InterfaceC2044707zh<EnumC719330SJn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC719330SJn enumC719330SJn = new EnumC719330SJn('<', 0, "CHARACTER_START");
        CHARACTER_START = enumC719330SJn;
        EnumC719330SJn enumC719330SJn2 = new EnumC719330SJn('>', 1, "CHARACTER_END");
        CHARACTER_END = enumC719330SJn2;
        EnumC719330SJn enumC719330SJn3 = new EnumC719330SJn(' ', 2, "CHARACTER_SPACE");
        CHARACTER_SPACE = enumC719330SJn3;
        EnumC719330SJn enumC719330SJn4 = new EnumC719330SJn('/', 3, "CHARACTER_LINE_SLANT");
        CHARACTER_LINE_SLANT = enumC719330SJn4;
        EnumC719330SJn enumC719330SJn5 = new EnumC719330SJn('=', 4, "CHARACTER_ATTR_EQUAL");
        CHARACTER_ATTR_EQUAL = enumC719330SJn5;
        EnumC719330SJn enumC719330SJn6 = new EnumC719330SJn('\"', 5, "CHARACTER_ATTR_VALUE_QUOTES");
        CHARACTER_ATTR_VALUE_QUOTES = enumC719330SJn6;
        EnumC719330SJn[] enumC719330SJnArr = {enumC719330SJn, enumC719330SJn2, enumC719330SJn3, enumC719330SJn4, enumC719330SJn5, enumC719330SJn6};
        LLILLJJLI = enumC719330SJnArr;
        LLILLL = new C2254308sP(enumC719330SJnArr);
    }

    public static EnumC719330SJn[] values() {
        return (EnumC719330SJn[]) LLILLJJLI.clone();
    }

    public final char getValue() {
        return this.LL;
    }

    public static EnumC719330SJn valueOf(String str) {
        return (EnumC719330SJn) C08FF.LIZ(EnumC719330SJn.class, str);
    }

    public EnumC719330SJn(char c, int i, String str) {
        this.LL = c;
    }
}
