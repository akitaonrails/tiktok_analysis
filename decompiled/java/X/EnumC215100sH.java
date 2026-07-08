package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00sH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC215100sH {
    public static final EnumC215100sH ADD_TO_HOME_SCREEN;
    public static final EnumC215100sH FEED_SIDEBAR;
    public static final /* synthetic */ EnumC215100sH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC215100sH PROFILE_SIDEBAR;

    public static InterfaceC2044707zh<EnumC215100sH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC215100sH enumC215100sH = new EnumC215100sH("PROFILE_SIDEBAR", 0);
        PROFILE_SIDEBAR = enumC215100sH;
        EnumC215100sH enumC215100sH2 = new EnumC215100sH("FEED_SIDEBAR", 1);
        FEED_SIDEBAR = enumC215100sH2;
        EnumC215100sH enumC215100sH3 = new EnumC215100sH("ADD_TO_HOME_SCREEN", 2);
        ADD_TO_HOME_SCREEN = enumC215100sH3;
        EnumC215100sH[] enumC215100sHArr = {enumC215100sH, enumC215100sH2, enumC215100sH3};
        LL = enumC215100sHArr;
        LLILLJJLI = new C2254308sP(enumC215100sHArr);
    }

    public static EnumC215100sH[] values() {
        return (EnumC215100sH[]) LL.clone();
    }

    public static EnumC215100sH valueOf(String str) {
        return (EnumC215100sH) C08FF.LIZ(EnumC215100sH.class, str);
    }

    public EnumC215100sH(String str, int i) {
    }
}
