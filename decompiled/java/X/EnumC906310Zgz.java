package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0Zgz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC906310Zgz implements WireEnum {
    STREAM_BLOCK_ACTION_UNKNOWN(0),
    STREAM_BLOCK_ACTION_ADD(1),
    STREAM_BLOCK_ACTION_UPDATE(2);

    public static final ProtoAdapter<EnumC906310Zgz> ADAPTER = new EnumAdapter<EnumC906310Zgz>() { // from class: X.0Zh0
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC906310Zgz.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC906310Zgz fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return STREAM_BLOCK_ACTION_UPDATE;
            }
            return STREAM_BLOCK_ACTION_ADD;
        }
        return STREAM_BLOCK_ACTION_UNKNOWN;
    }

    public static EnumC906310Zgz valueOf(String str) {
        return (EnumC906310Zgz) C08FF.LIZ(EnumC906310Zgz.class, str);
    }

    EnumC906310Zgz(int i) {
        this.LL = i;
    }
}
