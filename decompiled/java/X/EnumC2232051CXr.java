package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2232051CXr implements WireEnum {
    VAR_LINKMIC_SHARE_REVENUE_SETTING_LINKMIC_SHARE_REVENUE_NOT_SET(0),
    VAR_LINKMIC_SHARE_REVENUE_SETTING_LINKMIC_SHARE_REVENUE_OPEN(1),
    VAR_LINKMIC_SHARE_REVENUE_SETTING_LINKMIC_SHARE_REVENUE_CLOSE(2);

    public static final ProtoAdapter<EnumC2232051CXr> ADAPTER = new EnumAdapter<EnumC2232051CXr>() { // from class: X.1CYY
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2232051CXr.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2232051CXr fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_LINKMIC_SHARE_REVENUE_SETTING_LINKMIC_SHARE_REVENUE_CLOSE;
            }
            return VAR_LINKMIC_SHARE_REVENUE_SETTING_LINKMIC_SHARE_REVENUE_OPEN;
        }
        return VAR_LINKMIC_SHARE_REVENUE_SETTING_LINKMIC_SHARE_REVENUE_NOT_SET;
    }

    public static EnumC2232051CXr valueOf(String str) {
        return (EnumC2232051CXr) C08FF.LIZ(EnumC2232051CXr.class, str);
    }

    EnumC2232051CXr(int i) {
        this.LL = i;
    }
}
