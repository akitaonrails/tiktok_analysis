package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CUQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CUQ implements WireEnum {
    VAR_LINKMIC_USER_SETTING_SHOW_ACTION_CHECKED(0),
    VAR_LINKMIC_USER_SETTING_SHOW_ACTION_NOT_CHECKED(1),
    VAR_LINKMIC_USER_SETTING_SHOW_ACTION_HIDE(2),
    VAR_LINKMIC_USER_SETTING_SHOW_ACTION_OPEN(3),
    VAR_LINKMIC_USER_SETTING_SHOW_ACTION_CLOSE(4);

    public static final ProtoAdapter<C1CUQ> ADAPTER = new EnumAdapter<C1CUQ>() { // from class: X.1CUR
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CUQ.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CUQ fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_LINKMIC_USER_SETTING_SHOW_ACTION_CLOSE;
                    }
                    return VAR_LINKMIC_USER_SETTING_SHOW_ACTION_OPEN;
                }
                return VAR_LINKMIC_USER_SETTING_SHOW_ACTION_HIDE;
            }
            return VAR_LINKMIC_USER_SETTING_SHOW_ACTION_NOT_CHECKED;
        }
        return VAR_LINKMIC_USER_SETTING_SHOW_ACTION_CHECKED;
    }

    public static C1CUQ valueOf(String str) {
        return (C1CUQ) C08FF.LIZ(C1CUQ.class, str);
    }

    C1CUQ(int i) {
        this.LL = i;
    }
}
