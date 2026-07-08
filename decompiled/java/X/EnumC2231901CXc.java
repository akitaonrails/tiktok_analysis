package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231901CXc implements WireEnum {
    VAR_LINK_MIC_IM_MODE_IM(0),
    VAR_LINK_MIC_IM_MODE_RECHARGE(1),
    VAR_LINK_MIC_IM_MODE_RTS(2);

    public static final ProtoAdapter<EnumC2231901CXc> ADAPTER = new EnumAdapter<EnumC2231901CXc>() { // from class: X.1CYF
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2231901CXc.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2231901CXc fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_LINK_MIC_IM_MODE_RTS;
            }
            return VAR_LINK_MIC_IM_MODE_RECHARGE;
        }
        return VAR_LINK_MIC_IM_MODE_IM;
    }

    public static EnumC2231901CXc valueOf(String str) {
        return (EnumC2231901CXc) C08FF.LIZ(EnumC2231901CXc.class, str);
    }

    EnumC2231901CXc(int i) {
        this.LL = i;
    }
}
