package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14Yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20283814Yi {
    public static final EnumC20283814Yi BACK;
    public static final EnumC20283814Yi BACKGROUND;
    public static final EnumC20283814Yi CANCEL;
    public static final EnumC20283814Yi CLICK_BLANK;
    public static final EnumC20283814Yi CLICK_VIDEO;
    public static final EnumC20283814Yi DISLIKE;
    public static final EnumC20283814Yi INTERVAL;
    public static final /* synthetic */ EnumC20283814Yi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20283814Yi PRIORITY;
    public static final EnumC20283814Yi SECONDARY_CANCEL;
    public static final EnumC20283814Yi SECONDARY_SUBMIT;
    public static final EnumC20283814Yi SUBMIT;
    public static final EnumC20283814Yi SWIPE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20283814Yi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20283814Yi enumC20283814Yi = new EnumC20283814Yi("SUBMIT", 0, 1);
        SUBMIT = enumC20283814Yi;
        EnumC20283814Yi enumC20283814Yi2 = new EnumC20283814Yi("INTERVAL", 1, 2);
        INTERVAL = enumC20283814Yi2;
        EnumC20283814Yi enumC20283814Yi3 = new EnumC20283814Yi("CANCEL", 2, 3);
        CANCEL = enumC20283814Yi3;
        EnumC20283814Yi enumC20283814Yi4 = new EnumC20283814Yi("DISLIKE", 3, 4);
        DISLIKE = enumC20283814Yi4;
        EnumC20283814Yi enumC20283814Yi5 = new EnumC20283814Yi("PRIORITY", 4, 5);
        PRIORITY = enumC20283814Yi5;
        EnumC20283814Yi enumC20283814Yi6 = new EnumC20283814Yi("SWIPE", 5, 6);
        SWIPE = enumC20283814Yi6;
        EnumC20283814Yi enumC20283814Yi7 = new EnumC20283814Yi("CLICK_BLANK", 6, 7);
        CLICK_BLANK = enumC20283814Yi7;
        EnumC20283814Yi enumC20283814Yi8 = new EnumC20283814Yi("BACK", 7, 8);
        BACK = enumC20283814Yi8;
        EnumC20283814Yi enumC20283814Yi9 = new EnumC20283814Yi("CLICK_VIDEO", 8, 9);
        CLICK_VIDEO = enumC20283814Yi9;
        EnumC20283814Yi enumC20283814Yi10 = new EnumC20283814Yi("BACKGROUND", 9, 10);
        BACKGROUND = enumC20283814Yi10;
        EnumC20283814Yi enumC20283814Yi11 = new EnumC20283814Yi("SECONDARY_SUBMIT", 10, 21);
        SECONDARY_SUBMIT = enumC20283814Yi11;
        EnumC20283814Yi enumC20283814Yi12 = new EnumC20283814Yi("SECONDARY_CANCEL", 11, 23);
        SECONDARY_CANCEL = enumC20283814Yi12;
        EnumC20283814Yi[] enumC20283814YiArr = {enumC20283814Yi, enumC20283814Yi2, enumC20283814Yi3, enumC20283814Yi4, enumC20283814Yi5, enumC20283814Yi6, enumC20283814Yi7, enumC20283814Yi8, enumC20283814Yi9, enumC20283814Yi10, enumC20283814Yi11, enumC20283814Yi12};
        LLILLJJLI = enumC20283814YiArr;
        LLILLL = new C2254308sP(enumC20283814YiArr);
    }

    public static EnumC20283814Yi[] values() {
        return (EnumC20283814Yi[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC20283814Yi valueOf(String str) {
        return (EnumC20283814Yi) C08FF.LIZ(EnumC20283814Yi.class, str);
    }

    public EnumC20283814Yi(String str, int i, int i2) {
        this.LL = i2;
    }
}
