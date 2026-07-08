package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXR implements WireEnum {
    VAR_LINK_MIC_IM_SUB_TYPE_NONE(0),
    VAR_LINK_MIC_IM_SUB_TYPE_MODERATOR_INVITE(1),
    VAR_LINK_MIC_IM_SUB_TYPE_MODERATOR_CANCEL_INVITE(2),
    VAR_LINK_MIC_IM_SUB_TYPE_MODERATOR_REPLY(3),
    VAR_LINK_MIC_IM_SUB_TYPE_MODERATOR_PERMIT(4);

    public static final ProtoAdapter<C1CXR> ADAPTER = new EnumAdapter<C1CXR>() { // from class: X.1CYO
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CXR.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CXR fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_LINK_MIC_IM_SUB_TYPE_MODERATOR_PERMIT;
                    }
                    return VAR_LINK_MIC_IM_SUB_TYPE_MODERATOR_REPLY;
                }
                return VAR_LINK_MIC_IM_SUB_TYPE_MODERATOR_CANCEL_INVITE;
            }
            return VAR_LINK_MIC_IM_SUB_TYPE_MODERATOR_INVITE;
        }
        return VAR_LINK_MIC_IM_SUB_TYPE_NONE;
    }

    public static C1CXR valueOf(String str) {
        return (C1CXR) C08FF.LIZ(C1CXR.class, str);
    }

    C1CXR(int i) {
        this.LL = i;
    }
}
