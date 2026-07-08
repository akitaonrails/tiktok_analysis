package X;

/* JADX INFO: renamed from: X.0kRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1319630kRd {
    NONE,
    IMAGE,
    BUTTON;

    public static EnumC1319630kRd fromValue(String str) {
        if (str != null) {
            for (EnumC1319630kRd enumC1319630kRd : values()) {
                if (enumC1319630kRd.name().equalsIgnoreCase(str)) {
                    return enumC1319630kRd;
                }
            }
        }
        return NONE;
    }

    public static String getValue(EnumC1319630kRd enumC1319630kRd) {
        int i = C1319640kRe.LIZ[enumC1319630kRd.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "android.view.View";
            }
            return "android.widget.Button";
        }
        return "android.widget.ImageView";
    }

    public static EnumC1319630kRd valueOf(String str) {
        return (EnumC1319630kRd) C08FF.LIZ(EnumC1319630kRd.class, str);
    }
}
