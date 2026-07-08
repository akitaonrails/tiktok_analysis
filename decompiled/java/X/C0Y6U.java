package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0Y6U, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0Y6U implements WireEnum {
    JOIN_TIME(1),
    CREATED_TIME(2),
    GROUP_NAME(3),
    ACTIVE_TIME(4);

    public static final ProtoAdapter<C0Y6U> ADAPTER = new EnumAdapter<C0Y6U>() { // from class: X.0Y6V
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0Y6U.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0Y6U fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return ACTIVE_TIME;
                }
                return GROUP_NAME;
            }
            return CREATED_TIME;
        }
        return JOIN_TIME;
    }

    public static C0Y6U valueOf(String str) {
        return (C0Y6U) C08FF.LIZ(C0Y6U.class, str);
    }

    C0Y6U(int i) {
        this.LL = i;
    }
}
