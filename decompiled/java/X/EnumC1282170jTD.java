package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0jTD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1282170jTD implements WireEnum {
    VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_CHECKED(0),
    VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_NOT_CHECKED(1),
    VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_HIDE(2),
    VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_OPEN(3),
    VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_CLOSE(4);

    public static final ProtoAdapter<EnumC1282170jTD> ADAPTER = new EnumAdapter<EnumC1282170jTD>() { // from class: X.0jTE
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1282170jTD.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1282170jTD fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_CLOSE;
                    }
                    return VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_OPEN;
                }
                return VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_HIDE;
            }
            return VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_NOT_CHECKED;
        }
        return VAR_LINK_MIC_BIZ_USER_SETTING_SHOW_ACTION_CHECKED;
    }

    public static EnumC1282170jTD valueOf(String str) {
        return (EnumC1282170jTD) C08FF.LIZ(EnumC1282170jTD.class, str);
    }

    EnumC1282170jTD(int i) {
        this.LL = i;
    }
}
