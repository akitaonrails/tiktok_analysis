package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10os, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19361210os implements WireEnum {
    GAME_RANKING_ORDER_UNKNOWN(0),
    GAME_RANKING_ORDER_DESC(1),
    GAME_RANKING_ORDER_ASC(2);

    public static final ProtoAdapter<EnumC19361210os> ADAPTER = new EnumAdapter<EnumC19361210os>() { // from class: X.10ot
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19361210os.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19361210os fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return GAME_RANKING_ORDER_ASC;
            }
            return GAME_RANKING_ORDER_DESC;
        }
        return GAME_RANKING_ORDER_UNKNOWN;
    }

    public static EnumC19361210os valueOf(String str) {
        return (EnumC19361210os) C08FF.LIZ(EnumC19361210os.class, str);
    }

    EnumC19361210os(int i) {
        this.LL = i;
    }
}
