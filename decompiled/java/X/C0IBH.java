package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0IBH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public enum C0IBH implements WireEnum {
    GREETING_CARD_STATUS_UNKNOWN(0),
    GREETING_CARD_STATUS_UNOPENED(1),
    GREETING_CARD_STATUS_OPENED(2);

    public static final ProtoAdapter<C0IBH> ADAPTER = new EnumAdapter<C0IBH>() { // from class: X.0IBI
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0IBH.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0IBH fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return GREETING_CARD_STATUS_OPENED;
            }
            return GREETING_CARD_STATUS_UNOPENED;
        }
        return GREETING_CARD_STATUS_UNKNOWN;
    }

    public static C0IBH valueOf(String str) {
        return (C0IBH) C08FF.LIZ(C0IBH.class, str);
    }

    C0IBH(int i) {
        this.LL = i;
    }
}
