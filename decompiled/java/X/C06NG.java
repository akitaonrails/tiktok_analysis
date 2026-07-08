package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06NG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06NG {
    public static final C06NG BOTTOM;
    public static final C06NG BOTTOM_FLOATING;
    public static final C06NG BOTTOM_OTHERS;
    public static final /* synthetic */ C06NG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06NG TOP;
    public static final C06NG TOP_BANNER;
    public static final C06NG TOP_FLOATING;
    public static final C06NG TOP_OTHERS;
    public final String LL;

    public static InterfaceC2044707zh<C06NG> getEntries() {
        return LLILLL;
    }

    static {
        C06NG c06ng = new C06NG("TOP", 0, "top");
        TOP = c06ng;
        C06NG c06ng2 = new C06NG("TOP_BANNER", 1, "top_banner");
        TOP_BANNER = c06ng2;
        C06NG c06ng3 = new C06NG("TOP_FLOATING", 2, "top_floating");
        TOP_FLOATING = c06ng3;
        C06NG c06ng4 = new C06NG("TOP_OTHERS", 3, "top_others");
        TOP_OTHERS = c06ng4;
        C06NG c06ng5 = new C06NG("BOTTOM", 4, "bottom");
        BOTTOM = c06ng5;
        C06NG c06ng6 = new C06NG("BOTTOM_FLOATING", 5, "bottom_floating");
        BOTTOM_FLOATING = c06ng6;
        C06NG c06ng7 = new C06NG("BOTTOM_OTHERS", 6, "bottom_others");
        BOTTOM_OTHERS = c06ng7;
        C06NG[] c06ngArr = {c06ng, c06ng2, c06ng3, c06ng4, c06ng5, c06ng6, c06ng7};
        LLILLJJLI = c06ngArr;
        LLILLL = new C2254308sP(c06ngArr);
    }

    public static C06NG[] values() {
        return (C06NG[]) LLILLJJLI.clone();
    }

    public final C06NH getSceneId() {
        if (!C06NJ.LIZIZ()) {
            switch (C06NF.LIZ[ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return C06NH.TOP;
                case 5:
                case 6:
                case 7:
                    return C06NH.BOTTOM;
                default:
                    throw new C1954807lC();
            }
        }
        switch (C06NF.LIZ[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return C06NH.TOP;
            case 5:
            case 6:
                return C06NH.BOTTOM;
            case 7:
                return C06NH.KEYBOARD_FLOATING;
            default:
                throw new C1954807lC();
        }
    }

    public final String getTrackingName() {
        return this.LL;
    }

    public static C06NG valueOf(String str) {
        return (C06NG) C08FF.LIZ(C06NG.class, str);
    }

    public C06NG(String str, int i, String str2) {
        this.LL = str2;
    }
}
