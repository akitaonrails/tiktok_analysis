package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10pA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19363010pA implements WireEnum {
    FROM_UNKNOWN(0),
    FROM_FRONTIER(1),
    FROM_HTTP(2),
    FROM_SERVER(3);

    public static final ProtoAdapter<EnumC19363010pA> ADAPTER = new EnumAdapter<EnumC19363010pA>() { // from class: X.10pB
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19363010pA.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19363010pA fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return FROM_SERVER;
                }
                return FROM_HTTP;
            }
            return FROM_FRONTIER;
        }
        return FROM_UNKNOWN;
    }

    public static EnumC19363010pA valueOf(String str) {
        return (EnumC19363010pA) C08FF.LIZ(EnumC19363010pA.class, str);
    }

    EnumC19363010pA(int i) {
        this.LL = i;
    }
}
