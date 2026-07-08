package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CWY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CWY implements WireEnum {
    VAR_LINK_MIC_RTC_CONNECTION_STATE_UNDEFINED(0),
    VAR_LINK_MIC_RTC_CONNECTION_STATE_NORMAL(1),
    VAR_LINK_MIC_RTC_CONNECTION_STATE_DISCONNECT(2);

    public static final ProtoAdapter<C1CWY> ADAPTER = new EnumAdapter<C1CWY>() { // from class: X.1CWZ
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CWY.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CWY fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_LINK_MIC_RTC_CONNECTION_STATE_DISCONNECT;
            }
            return VAR_LINK_MIC_RTC_CONNECTION_STATE_NORMAL;
        }
        return VAR_LINK_MIC_RTC_CONNECTION_STATE_UNDEFINED;
    }

    public static C1CWY valueOf(String str) {
        return (C1CWY) C08FF.LIZ(C1CWY.class, str);
    }

    C1CWY(int i) {
        this.LL = i;
    }
}
