package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qeu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC675700Qeu {
    public static final EnumC675700Qeu CONTENT_LIST_REFRESH;
    public static final EnumC675700Qeu FIRST_SCREEN;
    public static final EnumC675700Qeu FULL_PAGE_REFRESH;
    public static final /* synthetic */ EnumC675700Qeu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC675700Qeu LOAD_MORE;
    public static final EnumC675700Qeu UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC675700Qeu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC675700Qeu enumC675700Qeu = new EnumC675700Qeu("UNKNOWN", 0, 0);
        UNKNOWN = enumC675700Qeu;
        EnumC675700Qeu enumC675700Qeu2 = new EnumC675700Qeu("FIRST_SCREEN", 1, 1);
        FIRST_SCREEN = enumC675700Qeu2;
        EnumC675700Qeu enumC675700Qeu3 = new EnumC675700Qeu("LOAD_MORE", 2, 2);
        LOAD_MORE = enumC675700Qeu3;
        EnumC675700Qeu enumC675700Qeu4 = new EnumC675700Qeu("FULL_PAGE_REFRESH", 3, 3);
        FULL_PAGE_REFRESH = enumC675700Qeu4;
        EnumC675700Qeu enumC675700Qeu5 = new EnumC675700Qeu("CONTENT_LIST_REFRESH", 4, 4);
        CONTENT_LIST_REFRESH = enumC675700Qeu5;
        EnumC675700Qeu[] enumC675700QeuArr = {enumC675700Qeu, enumC675700Qeu2, enumC675700Qeu3, enumC675700Qeu4, enumC675700Qeu5};
        LLILLJJLI = enumC675700QeuArr;
        LLILLL = new C2254308sP(enumC675700QeuArr);
    }

    public static EnumC675700Qeu[] values() {
        return (EnumC675700Qeu[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC675700Qeu valueOf(String str) {
        return (EnumC675700Qeu) C08FF.LIZ(EnumC675700Qeu.class, str);
    }

    public EnumC675700Qeu(String str, int i, int i2) {
        this.LL = i2;
    }
}
