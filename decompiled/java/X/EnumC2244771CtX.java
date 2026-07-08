package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CtX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2244771CtX implements WireEnum {
    RETRY_STRATEGY_NONE(0),
    RETRY_STRATEGY_IMMEDIATE(1),
    RETRY_STRATEGY_FIXED_DELAY(2);

    public static final ProtoAdapter<EnumC2244771CtX> ADAPTER = new EnumAdapter<EnumC2244771CtX>() { // from class: X.1CtZ
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2244771CtX.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2244771CtX fromValue(int i) {
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

    public static EnumC2244771CtX valueOf(String str) {
        return (EnumC2244771CtX) C08FF.LIZ(EnumC2244771CtX.class, str);
    }

    EnumC2244771CtX(int i) {
        this.LL = i;
    }
}
