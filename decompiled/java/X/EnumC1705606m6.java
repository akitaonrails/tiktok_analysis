package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.06m6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1705606m6 implements WireEnum {
    INTERACTION_TYPE_UNKNOWN(0),
    INTERACTION_TYPE_QUICK_REPLY(1),
    INTERACTION_TYPE_SUGGESTED_REPLY(2),
    INTERACTION_TYPE_INSIGHT(3),
    INTERACTION_TYPE_FEEDBACK(4);

    public static final ProtoAdapter<EnumC1705606m6> ADAPTER = new EnumAdapter<EnumC1705606m6>() { // from class: X.06m8
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1705606m6.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1705606m6 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return INTERACTION_TYPE_FEEDBACK;
                    }
                    return INTERACTION_TYPE_INSIGHT;
                }
                return INTERACTION_TYPE_SUGGESTED_REPLY;
            }
            return INTERACTION_TYPE_QUICK_REPLY;
        }
        return INTERACTION_TYPE_UNKNOWN;
    }

    public static EnumC1705606m6 valueOf(String str) {
        return (EnumC1705606m6) C08FF.LIZ(EnumC1705606m6.class, str);
    }

    EnumC1705606m6(int i) {
        this.LL = i;
    }
}
