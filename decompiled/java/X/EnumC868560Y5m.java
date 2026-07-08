package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0Y5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC868560Y5m implements WireEnum {
    UNBLOCK(0),
    BLOCK(1);

    public static final ProtoAdapter<EnumC868560Y5m> ADAPTER = new EnumAdapter<EnumC868560Y5m>() { // from class: X.0Y5n
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC868560Y5m.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC868560Y5m fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return BLOCK;
        }
        return UNBLOCK;
    }

    public static EnumC868560Y5m valueOf(String str) {
        return (EnumC868560Y5m) C08FF.LIZ(EnumC868560Y5m.class, str);
    }

    EnumC868560Y5m(int i) {
        this.LL = i;
    }
}
