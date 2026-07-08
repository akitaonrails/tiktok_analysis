package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1244190iTx {
    public static final EnumC1244190iTx CHECK_EMAIL;
    public static final EnumC1244190iTx ENTER_PAGE;
    public static final /* synthetic */ EnumC1244190iTx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1244190iTx NONE;
    public static final EnumC1244190iTx SHOW_POP;

    public static InterfaceC2044707zh<EnumC1244190iTx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1244190iTx enumC1244190iTx = new EnumC1244190iTx("NONE", 0);
        NONE = enumC1244190iTx;
        EnumC1244190iTx enumC1244190iTx2 = new EnumC1244190iTx("CHECK_EMAIL", 1);
        CHECK_EMAIL = enumC1244190iTx2;
        EnumC1244190iTx enumC1244190iTx3 = new EnumC1244190iTx("SHOW_POP", 2);
        SHOW_POP = enumC1244190iTx3;
        EnumC1244190iTx enumC1244190iTx4 = new EnumC1244190iTx("ENTER_PAGE", 3);
        ENTER_PAGE = enumC1244190iTx4;
        EnumC1244190iTx[] enumC1244190iTxArr = {enumC1244190iTx, enumC1244190iTx2, enumC1244190iTx3, enumC1244190iTx4};
        LL = enumC1244190iTxArr;
        LLILLJJLI = new C2254308sP(enumC1244190iTxArr);
    }

    public static EnumC1244190iTx[] values() {
        return (EnumC1244190iTx[]) LL.clone();
    }

    public static EnumC1244190iTx valueOf(String str) {
        return (EnumC1244190iTx) C08FF.LIZ(EnumC1244190iTx.class, str);
    }

    public EnumC1244190iTx(String str, int i) {
    }
}
