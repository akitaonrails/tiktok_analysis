package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXW implements WireEnum {
    VAR_USER_LINK_STATE_IDLE(0),
    VAR_USER_LINK_STATE_REQUEST(1),
    VAR_USER_LINK_STATE_WAIT(2),
    VAR_USER_LINK_STATE_CONNECTING(3),
    VAR_USER_LINK_STATE_LINKED(4);

    public static final ProtoAdapter<C1CXW> ADAPTER = new EnumAdapter<C1CXW>() { // from class: X.1CYZ
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CXW.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CXW fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_USER_LINK_STATE_LINKED;
                    }
                    return VAR_USER_LINK_STATE_CONNECTING;
                }
                return VAR_USER_LINK_STATE_WAIT;
            }
            return VAR_USER_LINK_STATE_REQUEST;
        }
        return VAR_USER_LINK_STATE_IDLE;
    }

    public static C1CXW valueOf(String str) {
        return (C1CXW) C08FF.LIZ(C1CXW.class, str);
    }

    C1CXW(int i) {
        this.LL = i;
    }
}
