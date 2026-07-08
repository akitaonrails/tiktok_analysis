package X;

/* JADX INFO: renamed from: X.0jT7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1282110jT7 {
    Checked,
    NotChecked,
    Hide,
    Open,
    Close;

    public static final C1282160jTC Companion = new Object() { // from class: X.0jTC
    };

    public static EnumC1282110jT7 valueOf(String str) {
        return (EnumC1282110jT7) C08FF.LIZ(EnumC1282110jT7.class, str);
    }

    public final EnumC1282170jTD into() {
        int i = C1282100jT6.LIZ[ordinal()];
        if (i == 1) {
            return EnumC1282170jTD.VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_CHECKED;
        }
        if (i == 2) {
            return EnumC1282170jTD.VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_NOT_CHECKED;
        }
        if (i == 3) {
            return EnumC1282170jTD.VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_HIDE;
        }
        if (i == 4) {
            return EnumC1282170jTD.VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_OPEN;
        }
        if (i == 5) {
            return EnumC1282170jTD.VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_CLOSE;
        }
        throw new C1954807lC();
    }

    public final int intoInt() {
        int i = C1282100jT6.LIZ[ordinal()];
        int i2 = 1;
        if (i == 1) {
            return 0;
        }
        int i3 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i3 = 4;
                if (i != 4) {
                    if (i != 5) {
                        throw new C1954807lC();
                    }
                }
            }
            return i3;
        }
        return i2;
    }
}
