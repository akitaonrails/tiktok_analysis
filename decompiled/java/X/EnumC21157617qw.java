package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.17qw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21157617qw {
    public static final EnumC21157617qw CENTER;
    public static final EnumC21157617qw END;
    public static final /* synthetic */ EnumC21157617qw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21157617qw START;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21157617qw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21157617qw enumC21157617qw = new EnumC21157617qw("START", 0, "start");
        START = enumC21157617qw;
        EnumC21157617qw enumC21157617qw2 = new EnumC21157617qw("CENTER", 1, "center");
        CENTER = enumC21157617qw2;
        EnumC21157617qw enumC21157617qw3 = new EnumC21157617qw("END", 2, "end");
        END = enumC21157617qw3;
        EnumC21157617qw[] enumC21157617qwArr = {enumC21157617qw, enumC21157617qw2, enumC21157617qw3};
        LLILLJJLI = enumC21157617qwArr;
        LLILLL = new C2254308sP(enumC21157617qwArr);
    }

    public static EnumC21157617qw[] values() {
        return (EnumC21157617qw[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC21157617qw valueOf(String str) {
        return (EnumC21157617qw) C08FF.LIZ(EnumC21157617qw.class, str);
    }

    public EnumC21157617qw(String str, int i, String str2) {
        this.LL = str2;
    }
}
