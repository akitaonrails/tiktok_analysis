package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0Y6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC868900Y6u implements WireEnum {
    READ_ONLY(1),
    POOL_READY(2),
    NOT_REGISTERED(3),
    LIMIT_EXCEEDED(4),
    REPLACED_OLDEST(5);

    public static final ProtoAdapter<EnumC868900Y6u> ADAPTER = new EnumAdapter<EnumC868900Y6u>() { // from class: X.0Y6v
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC868900Y6u.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC868900Y6u fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return REPLACED_OLDEST;
                    }
                    return LIMIT_EXCEEDED;
                }
                return NOT_REGISTERED;
            }
            return POOL_READY;
        }
        return READ_ONLY;
    }

    public static EnumC868900Y6u valueOf(String str) {
        return (EnumC868900Y6u) C08FF.LIZ(EnumC868900Y6u.class, str);
    }

    EnumC868900Y6u(int i) {
        this.LL = i;
    }
}
