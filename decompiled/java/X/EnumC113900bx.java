package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC113900bx {
    public static final EnumC113900bx ANOLE_CARD;
    public static final /* synthetic */ EnumC113900bx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC113900bx MARKDOWN_SUMMARY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC113900bx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC113900bx enumC113900bx = new EnumC113900bx("MARKDOWN_SUMMARY", 0, 1);
        MARKDOWN_SUMMARY = enumC113900bx;
        EnumC113900bx enumC113900bx2 = new EnumC113900bx("ANOLE_CARD", 1, 2);
        ANOLE_CARD = enumC113900bx2;
        EnumC113900bx[] enumC113900bxArr = {enumC113900bx, enumC113900bx2};
        LLILLJJLI = enumC113900bxArr;
        LLILLL = new C2254308sP(enumC113900bxArr);
    }

    public static EnumC113900bx[] values() {
        return (EnumC113900bx[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC113900bx valueOf(String str) {
        return (EnumC113900bx) C08FF.LIZ(EnumC113900bx.class, str);
    }

    public EnumC113900bx(String str, int i, int i2) {
        this.LL = i2;
    }
}
