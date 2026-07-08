package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0jTH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1282210jTH implements WireEnum {
    VAR_LINK_MIC_RTC_USER_OFFLINE_REASON_QUIT(0),
    VAR_LINK_MIC_RTC_USER_OFFLINE_REASON_DROPPED(1),
    VAR_LINK_MIC_RTC_USER_OFFLINE_REASON_BECOME_AUDIENCE(2);

    public static final ProtoAdapter<EnumC1282210jTH> ADAPTER = new EnumAdapter<EnumC1282210jTH>() { // from class: X.0jTI
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1282210jTH.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1282210jTH fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_LINK_MIC_RTC_USER_OFFLINE_REASON_BECOME_AUDIENCE;
            }
            return VAR_LINK_MIC_RTC_USER_OFFLINE_REASON_DROPPED;
        }
        return VAR_LINK_MIC_RTC_USER_OFFLINE_REASON_QUIT;
    }

    public static EnumC1282210jTH valueOf(String str) {
        return (EnumC1282210jTH) C08FF.LIZ(EnumC1282210jTH.class, str);
    }

    EnumC1282210jTH(int i) {
        this.LL = i;
    }
}
