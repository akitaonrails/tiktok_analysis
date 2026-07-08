package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXN implements WireEnum {
    VAR_LINK_MIC_RTC_NETWORK_QUALITY_UNDEFINED(0),
    VAR_LINK_MIC_RTC_NETWORK_QUALITY_EXCELLENT(1),
    VAR_LINK_MIC_RTC_NETWORK_QUALITY_GOOD(2),
    VAR_LINK_MIC_RTC_NETWORK_QUALITY_POOR(3),
    VAR_LINK_MIC_RTC_NETWORK_QUALITY_BAD(4),
    VAR_LINK_MIC_RTC_NETWORK_QUALITY_VBAD(5),
    VAR_LINK_MIC_RTC_NETWORK_QUALITY_DOWN(6);

    public static final ProtoAdapter<C1CXN> ADAPTER = new EnumAdapter<C1CXN>() { // from class: X.1CYU
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CXN.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CXN fromValue(int i) {
        switch (i) {
            case 0:
                return VAR_LINK_MIC_RTC_NETWORK_QUALITY_UNDEFINED;
            case 1:
                return VAR_LINK_MIC_RTC_NETWORK_QUALITY_EXCELLENT;
            case 2:
                return VAR_LINK_MIC_RTC_NETWORK_QUALITY_GOOD;
            case 3:
                return VAR_LINK_MIC_RTC_NETWORK_QUALITY_POOR;
            case 4:
                return VAR_LINK_MIC_RTC_NETWORK_QUALITY_BAD;
            case 5:
                return VAR_LINK_MIC_RTC_NETWORK_QUALITY_VBAD;
            case 6:
                return VAR_LINK_MIC_RTC_NETWORK_QUALITY_DOWN;
            default:
                return null;
        }
    }

    public static C1CXN valueOf(String str) {
        return (C1CXN) C08FF.LIZ(C1CXN.class, str);
    }

    C1CXN(int i) {
        this.LL = i;
    }
}
