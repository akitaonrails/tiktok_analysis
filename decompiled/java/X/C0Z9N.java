package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0Z9N, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0Z9N implements WireEnum {
    ORDINARY(0),
    OWNER(1),
    ADMIN(2),
    VISITOR(3),
    SYSTEM(4);

    public static final ProtoAdapter<C0Z9N> ADAPTER = new EnumAdapter<C0Z9N>() { // from class: X.0Z9O
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0Z9N.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0Z9N fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return SYSTEM;
                    }
                    return VISITOR;
                }
                return ADMIN;
            }
            return OWNER;
        }
        return ORDINARY;
    }

    public static C0Z9N valueOf(String str) {
        return (C0Z9N) C08FF.LIZ(C0Z9N.class, str);
    }

    C0Z9N(int i) {
        this.LL = i;
    }
}
