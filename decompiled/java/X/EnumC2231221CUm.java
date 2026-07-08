package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2231221CUm implements WireEnum {
    VAR_LINK_MIC_COMPENSATE_IM_TYPE_INVITE(0),
    VAR_LINK_MIC_COMPENSATE_IM_TYPE_REPLY(1),
    VAR_LINK_MIC_COMPENSATE_IM_TYPE_PERMIT(2);

    public static final ProtoAdapter<EnumC2231221CUm> ADAPTER = new EnumAdapter<EnumC2231221CUm>() { // from class: X.1CUn
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2231221CUm.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2231221CUm fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_LINK_MIC_COMPENSATE_IM_TYPE_PERMIT;
            }
            return VAR_LINK_MIC_COMPENSATE_IM_TYPE_REPLY;
        }
        return VAR_LINK_MIC_COMPENSATE_IM_TYPE_INVITE;
    }

    public static EnumC2231221CUm valueOf(String str) {
        return (EnumC2231221CUm) C08FF.LIZ(EnumC2231221CUm.class, str);
    }

    EnumC2231221CUm(int i) {
        this.LL = i;
    }
}
