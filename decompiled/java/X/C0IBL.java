package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0IBL, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public enum C0IBL implements WireEnum {
    REPOST_CARD_STATUS_REPOST_UNKNOWN(0),
    REPOST_CARD_STATUS_REPOST_SUCCESS(1),
    REPOST_CARD_STATUS_REPOST_INVISIBLE(2),
    REPOST_CARD_STATUS_POST_INVISIBLE(3);

    public static final ProtoAdapter<C0IBL> ADAPTER = new EnumAdapter<C0IBL>() { // from class: X.0IBM
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0IBL.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0IBL fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return REPOST_CARD_STATUS_POST_INVISIBLE;
                }
                return REPOST_CARD_STATUS_REPOST_INVISIBLE;
            }
            return REPOST_CARD_STATUS_REPOST_SUCCESS;
        }
        return REPOST_CARD_STATUS_REPOST_UNKNOWN;
    }

    public static C0IBL valueOf(String str) {
        return (C0IBL) C08FF.LIZ(C0IBL.class, str);
    }

    C0IBL(int i) {
        this.LL = i;
    }
}
