package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Cnd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2241111Cnd implements WireEnum {
    AVATAR_DUO_TASK_STATUS_UNKNOWN(0),
    AVATAR_DUO_TASK_STATUS_INVITE(1),
    AVATAR_DUO_TASK_STATUS_ACCEPT(2),
    AVATAR_DUO_TASK_STATUS_SUCCESS(3),
    AVATAR_DUO_TASK_STATUS_FAILED(4);

    public static final ProtoAdapter<EnumC2241111Cnd> ADAPTER = new EnumAdapter<EnumC2241111Cnd>() { // from class: X.1Cng
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2241111Cnd.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2241111Cnd fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return AVATAR_DUO_TASK_STATUS_FAILED;
                    }
                    return AVATAR_DUO_TASK_STATUS_SUCCESS;
                }
                return AVATAR_DUO_TASK_STATUS_ACCEPT;
            }
            return AVATAR_DUO_TASK_STATUS_INVITE;
        }
        return AVATAR_DUO_TASK_STATUS_UNKNOWN;
    }

    public static EnumC2241111Cnd valueOf(String str) {
        return (EnumC2241111Cnd) C08FF.LIZ(EnumC2241111Cnd.class, str);
    }

    EnumC2241111Cnd(int i) {
        this.LL = i;
    }
}
