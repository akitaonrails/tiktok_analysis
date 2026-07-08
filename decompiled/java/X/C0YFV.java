package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YFV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0YFV implements WireEnum {
    CURSOR_TYPE_USER_MSG_CHAIN(0),
    CURSOR_TYPE_RECENT_CONV_CHAIN(1),
    CURSOR_TYPE_STATUS_MSG_CHAIN(2),
    CURSOR_TYPE_PRIORITY_MSG_CHAIN(3);

    public static final ProtoAdapter<C0YFV> ADAPTER = new EnumAdapter<C0YFV>() { // from class: X.0YFW
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0YFV.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0YFV fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return CURSOR_TYPE_PRIORITY_MSG_CHAIN;
                }
                return CURSOR_TYPE_STATUS_MSG_CHAIN;
            }
            return CURSOR_TYPE_RECENT_CONV_CHAIN;
        }
        return CURSOR_TYPE_USER_MSG_CHAIN;
    }

    public static C0YFV valueOf(String str) {
        return (C0YFV) C08FF.LIZ(C0YFV.class, str);
    }

    C0YFV(int i) {
        this.LL = i;
    }
}
