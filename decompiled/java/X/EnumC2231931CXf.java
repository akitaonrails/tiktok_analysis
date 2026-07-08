package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231931CXf implements WireEnum {
    VAR_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_NOT_SET(0),
    VAR_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_ZERO(1),
    VAR_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO30(2),
    VAR_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO70(3);

    public static final ProtoAdapter<EnumC2231931CXf> ADAPTER = new EnumAdapter<EnumC2231931CXf>() { // from class: X.1CYa
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2231931CXf.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2231931CXf fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return VAR_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO70;
                }
                return VAR_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO30;
            }
            return VAR_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_ZERO;
        }
        return VAR_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_NOT_SET;
    }

    public static EnumC2231931CXf valueOf(String str) {
        return (EnumC2231931CXf) C08FF.LIZ(EnumC2231931CXf.class, str);
    }

    EnumC2231931CXf(int i) {
        this.LL = i;
    }
}
