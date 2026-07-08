package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXQ implements WireEnum {
    VAR_LINK_MIC_DROPPED_IM_TYPE_UNKNOWN(0),
    VAR_LINK_MIC_DROPPED_IM_TYPE_INVITE_GROUP(1),
    VAR_LINK_MIC_DROPPED_IM_TYPE_REPLY_GROUP(2),
    VAR_LINK_MIC_DROPPED_IM_TYPE_APPLY_GROUP(3),
    VAR_LINK_MIC_DROPPED_IM_TYPE_PERMIT_GROUP(4);

    public static final ProtoAdapter<C1CXQ> ADAPTER = new EnumAdapter<C1CXQ>() { // from class: X.1CYH
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CXQ.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CXQ fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_LINK_MIC_DROPPED_IM_TYPE_PERMIT_GROUP;
                    }
                    return VAR_LINK_MIC_DROPPED_IM_TYPE_APPLY_GROUP;
                }
                return VAR_LINK_MIC_DROPPED_IM_TYPE_REPLY_GROUP;
            }
            return VAR_LINK_MIC_DROPPED_IM_TYPE_INVITE_GROUP;
        }
        return VAR_LINK_MIC_DROPPED_IM_TYPE_UNKNOWN;
    }

    public static C1CXQ valueOf(String str) {
        return (C1CXQ) C08FF.LIZ(C1CXQ.class, str);
    }

    C1CXQ(int i) {
        this.LL = i;
    }
}
