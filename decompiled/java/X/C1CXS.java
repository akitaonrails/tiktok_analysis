package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXS implements WireEnum {
    VAR_LINK_STATE_CLOSE(0),
    VAR_LINK_STATE_IDLE(1),
    VAR_LINK_STATE_WAIT(2),
    VAR_LINK_STATE_CONNECTING(3),
    VAR_LINK_STATE_LINKED(4);

    public static final ProtoAdapter<C1CXS> ADAPTER = new EnumAdapter<C1CXS>() { // from class: X.1CYS
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CXS.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CXS fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_LINK_STATE_LINKED;
                    }
                    return VAR_LINK_STATE_CONNECTING;
                }
                return VAR_LINK_STATE_WAIT;
            }
            return VAR_LINK_STATE_IDLE;
        }
        return VAR_LINK_STATE_CLOSE;
    }

    public static C1CXS valueOf(String str) {
        return (C1CXS) C08FF.LIZ(C1CXS.class, str);
    }

    C1CXS(int i) {
        this.LL = i;
    }
}
