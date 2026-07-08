package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.062E, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public enum C062E implements WireEnum {
    BOT_STATUS_UNKNOWN(0),
    BOT_STATUS_CREATING(1),
    BOT_STATUS_WORKING(2),
    BOT_STATUS_DELETED(3),
    BOT_STATUS_FAILED(4);

    public static final ProtoAdapter<C062E> ADAPTER = new EnumAdapter<C062E>() { // from class: X.062K
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C062E.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C062E fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return BOT_STATUS_FAILED;
                    }
                    return BOT_STATUS_DELETED;
                }
                return BOT_STATUS_WORKING;
            }
            return BOT_STATUS_CREATING;
        }
        return BOT_STATUS_UNKNOWN;
    }

    public static C062E valueOf(String str) {
        return (C062E) C08FF.LIZ(C062E.class, str);
    }

    C062E(int i) {
        this.LL = i;
    }
}
