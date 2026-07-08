package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC366550EYr {
    public static final EnumC366550EYr CLICK_STICKER;
    public static final /* synthetic */ EnumC366550EYr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC366550EYr REPLACE_FUNCTION;
    public static final EnumC366550EYr STICKER_PANEL;
    public static final EnumC366550EYr UNKNOWN;

    public static InterfaceC2044707zh<EnumC366550EYr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC366550EYr enumC366550EYr = new EnumC366550EYr("UNKNOWN", 0);
        UNKNOWN = enumC366550EYr;
        EnumC366550EYr enumC366550EYr2 = new EnumC366550EYr("STICKER_PANEL", 1);
        STICKER_PANEL = enumC366550EYr2;
        EnumC366550EYr enumC366550EYr3 = new EnumC366550EYr("CLICK_STICKER", 2);
        CLICK_STICKER = enumC366550EYr3;
        EnumC366550EYr enumC366550EYr4 = new EnumC366550EYr("REPLACE_FUNCTION", 3);
        REPLACE_FUNCTION = enumC366550EYr4;
        EnumC366550EYr[] enumC366550EYrArr = {enumC366550EYr, enumC366550EYr2, enumC366550EYr3, enumC366550EYr4};
        LL = enumC366550EYrArr;
        LLILLJJLI = new C2254308sP(enumC366550EYrArr);
    }

    public static EnumC366550EYr[] values() {
        return (EnumC366550EYr[]) LL.clone();
    }

    public static EnumC366550EYr valueOf(String str) {
        return (EnumC366550EYr) C08FF.LIZ(EnumC366550EYr.class, str);
    }

    public EnumC366550EYr(String str, int i) {
    }
}
