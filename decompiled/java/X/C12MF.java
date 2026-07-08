package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12MF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12MF {
    public static final C12MF BOLD;
    public static final C12MF BOLD_ITALIC;
    public static final C12MF ITALIC;
    public static final C12MF LIGHT;
    public static final C12MF LIGHT_ITALIC;
    public static final /* synthetic */ C12MF[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C12MF MEDIUM;
    public static final C12MF MEDIUM_ITALIC;
    public static final C12MF REGULAR;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<C12MF> getEntries() {
        return LLILZ;
    }

    static {
        C12MF c12mf = new C12MF("REGULAR", 0, "regular", 1);
        REGULAR = c12mf;
        C12MF c12mf2 = new C12MF("BOLD", 1, "bold", 2);
        BOLD = c12mf2;
        C12MF c12mf3 = new C12MF("BOLD_ITALIC", 2, "boldItalic", 3);
        BOLD_ITALIC = c12mf3;
        C12MF c12mf4 = new C12MF("ITALIC", 3, "italic", 4);
        ITALIC = c12mf4;
        C12MF c12mf5 = new C12MF("LIGHT", 4, "light", 5);
        LIGHT = c12mf5;
        C12MF c12mf6 = new C12MF("LIGHT_ITALIC", 5, "lightItalic", 6);
        LIGHT_ITALIC = c12mf6;
        C12MF c12mf7 = new C12MF("MEDIUM", 6, "medium", 7);
        MEDIUM = c12mf7;
        C12MF c12mf8 = new C12MF("MEDIUM_ITALIC", 7, "mediumItalic", 8);
        MEDIUM_ITALIC = c12mf8;
        C12MF[] c12mfArr = {c12mf, c12mf2, c12mf3, c12mf4, c12mf5, c12mf6, c12mf7, c12mf8};
        LLILLL = c12mfArr;
        LLILZ = new C2254308sP(c12mfArr);
    }

    public static C12MF[] values() {
        return (C12MF[]) LLILLL.clone();
    }

    public final String getFONT_NAME() {
        return this.LL;
    }

    public final int getVALUE() {
        return this.LLILLJJLI;
    }

    public static C12MF valueOf(String str) {
        return (C12MF) C08FF.LIZ(C12MF.class, str);
    }

    public C12MF(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
