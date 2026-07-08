package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YCN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0YCN implements WireEnum {
    SEND_SUCCEED(0),
    USER_NOT_IN_CONVERSATION(1),
    CHECK_CONV_NOT_PASS(2),
    CHECK_MSG_NOT_PASS(3),
    CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE(4),
    USER_HAS_BEEN_BLOCKED(5);

    public static final ProtoAdapter<C0YCN> ADAPTER = new EnumAdapter<C0YCN>() { // from class: X.0YCV
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0YCN.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0YCN fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return USER_HAS_BEEN_BLOCKED;
                        }
                        return CHECK_MSG_NOT_PASS_BUT_SELF_VISIBLE;
                    }
                    return CHECK_MSG_NOT_PASS;
                }
                return CHECK_CONV_NOT_PASS;
            }
            return USER_NOT_IN_CONVERSATION;
        }
        return SEND_SUCCEED;
    }

    public static C0YCN valueOf(String str) {
        return (C0YCN) C08FF.LIZ(C0YCN.class, str);
    }

    C0YCN(int i) {
        this.LL = i;
    }
}
