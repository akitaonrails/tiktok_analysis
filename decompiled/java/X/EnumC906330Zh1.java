package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0Zh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC906330Zh1 implements WireEnum {
    RETRY_STRATEGY_NONE(0),
    RETRY_STRATEGY_IMMEDIATE(1),
    RETRY_STRATEGY_FIXED_DELAY(2);

    public static final ProtoAdapter<EnumC906330Zh1> ADAPTER = new EnumAdapter<EnumC906330Zh1>() { // from class: X.0Zh2
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC906330Zh1.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC906330Zh1 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return RETRY_STRATEGY_FIXED_DELAY;
            }
            return RETRY_STRATEGY_IMMEDIATE;
        }
        return RETRY_STRATEGY_NONE;
    }

    public static EnumC906330Zh1 valueOf(String str) {
        return (EnumC906330Zh1) C08FF.LIZ(EnumC906330Zh1.class, str);
    }

    EnumC906330Zh1(int i) {
        this.LL = i;
    }
}
