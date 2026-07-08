package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CWW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CWW implements WireEnum {
    VAR_LINK_MIC_ONLINE_USER_STATE_UNDEFINED(0),
    VAR_LINK_MIC_ONLINE_USER_STATE_NORMAL(1),
    VAR_LINK_MIC_ONLINE_USER_STATE_PAUSED(2);

    public static final ProtoAdapter<C1CWW> ADAPTER = new EnumAdapter<C1CWW>() { // from class: X.1CWX
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CWW.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CWW fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_LINK_MIC_ONLINE_USER_STATE_PAUSED;
            }
            return VAR_LINK_MIC_ONLINE_USER_STATE_NORMAL;
        }
        return VAR_LINK_MIC_ONLINE_USER_STATE_UNDEFINED;
    }

    public static C1CWW valueOf(String str) {
        return (C1CWW) C08FF.LIZ(C1CWW.class, str);
    }

    C1CWW(int i) {
        this.LL = i;
    }
}
