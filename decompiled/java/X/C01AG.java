package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01AG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01AG {
    public static final C01AG GIFT_SERIES;
    public static final /* synthetic */ C01AG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C01AG MINUTE_GAME;

    public static InterfaceC2044707zh<C01AG> getEntries() {
        return LLILLJJLI;
    }

    static {
        C01AG c01ag = new C01AG("GIFT_SERIES", 0);
        GIFT_SERIES = c01ag;
        C01AG c01ag2 = new C01AG("MINUTE_GAME", 1);
        MINUTE_GAME = c01ag2;
        C01AG[] c01agArr = {c01ag, c01ag2};
        LL = c01agArr;
        LLILLJJLI = new C2254308sP(c01agArr);
    }

    public static C01AG[] values() {
        return (C01AG[]) LL.clone();
    }

    public final int getHeaderType() {
        int i = C01AF.LIZ[ordinal()];
        if (i == 1) {
            return 223;
        }
        if (i == 2) {
            return 224;
        }
        throw new C1954807lC();
    }

    public final boolean getShowEntranceIconWhenSelected() {
        int i = C01AF.LIZ[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new C1954807lC();
    }

    public final String getUuidPrefix() {
        int i = C01AF.LIZ[ordinal()];
        if (i == 1) {
            return "series";
        }
        if (i == 2) {
            return "minutegame";
        }
        throw new C1954807lC();
    }

    public static C01AG valueOf(String str) {
        return (C01AG) C08FF.LIZ(C01AG.class, str);
    }

    public C01AG(String str, int i) {
    }
}
