package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0pqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1527240pqU implements WireEnum {
    NotExist(0),
    Active(1),
    Closed(2);

    public static final ProtoAdapter<EnumC1527240pqU> ADAPTER = new EnumAdapter<EnumC1527240pqU>() { // from class: X.0pqq
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1527240pqU.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1527240pqU fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return Closed;
            }
            return Active;
        }
        return NotExist;
    }

    public static EnumC1527240pqU valueOf(String str) {
        return (EnumC1527240pqU) C08FF.LIZ(EnumC1527240pqU.class, str);
    }

    EnumC1527240pqU(int i) {
        this.LL = i;
    }
}
