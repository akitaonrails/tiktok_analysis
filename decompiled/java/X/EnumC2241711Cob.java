package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Cob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2241711Cob implements WireEnum {
    TASK_STATUS_UNKNOWN(0),
    TASK_STATUS_IN_PROGRESS(1),
    TASK_STATUS_RECALL(2),
    TASK_STATUS_EXPIRED(3),
    TASK_STATUS_UNSUPPORTED(4);

    public static final ProtoAdapter<EnumC2241711Cob> ADAPTER = new EnumAdapter<EnumC2241711Cob>() { // from class: X.1Cod
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2241711Cob.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2241711Cob fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return TASK_STATUS_UNSUPPORTED;
                    }
                    return TASK_STATUS_EXPIRED;
                }
                return TASK_STATUS_RECALL;
            }
            return TASK_STATUS_IN_PROGRESS;
        }
        return TASK_STATUS_UNKNOWN;
    }

    public static EnumC2241711Cob valueOf(String str) {
        return (EnumC2241711Cob) C08FF.LIZ(EnumC2241711Cob.class, str);
    }

    EnumC2241711Cob(int i) {
        this.LL = i;
    }
}
