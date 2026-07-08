package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06gJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1669706gJ {
    public static final C1669806gK Companion;
    public static final EnumC1669706gJ FREQUENT;
    public static final EnumC1669706gJ LAPSED;
    public static final /* synthetic */ EnumC1669706gJ[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1669706gJ NONE;
    public static final EnumC1669706gJ RECENT;
    public static final EnumC1669706gJ REPEAT;
    public final int LL;
    public final int LLILLJJLI;
    public final String LLILLL;

    public static InterfaceC2044707zh<EnumC1669706gJ> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.06gK] */
    static {
        EnumC1669706gJ enumC1669706gJ = new EnumC1669706gJ("NONE", 0, 0, 0, "");
        NONE = enumC1669706gJ;
        EnumC1669706gJ enumC1669706gJ2 = new EnumC1669706gJ("FREQUENT", 1, 1, 2131827500, "frequent_buyer");
        FREQUENT = enumC1669706gJ2;
        EnumC1669706gJ enumC1669706gJ3 = new EnumC1669706gJ("REPEAT", 2, 2, 2131827505, "repeat_buyer");
        REPEAT = enumC1669706gJ3;
        EnumC1669706gJ enumC1669706gJ4 = new EnumC1669706gJ("RECENT", 3, 3, 2131827504, "recent_buyer");
        RECENT = enumC1669706gJ4;
        EnumC1669706gJ enumC1669706gJ5 = new EnumC1669706gJ("LAPSED", 4, 4, 2131827501, "lapsed_buyer");
        LAPSED = enumC1669706gJ5;
        EnumC1669706gJ[] enumC1669706gJArr = {enumC1669706gJ, enumC1669706gJ2, enumC1669706gJ3, enumC1669706gJ4, enumC1669706gJ5};
        LLILZ = enumC1669706gJArr;
        LLILZIL = new C2254308sP(enumC1669706gJArr);
        Companion = new Object() { // from class: X.06gK
        };
    }

    public static EnumC1669706gJ[] values() {
        return (EnumC1669706gJ[]) LLILZ.clone();
    }

    public final int getDisplayText() {
        return this.LLILLJJLI;
    }

    public final String getMobValue() {
        return this.LLILLL;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1669706gJ valueOf(String str) {
        return (EnumC1669706gJ) C08FF.LIZ(EnumC1669706gJ.class, str);
    }

    public EnumC1669706gJ(String str, int i, int i2, int i3, String str2) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = str2;
    }
}
