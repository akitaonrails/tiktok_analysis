package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0pqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1527210pqR implements WireEnum {
    Unknown(0),
    V1(1),
    V2(2),
    V21(3),
    V4(4);

    public static final ProtoAdapter<EnumC1527210pqR> ADAPTER = new EnumAdapter<EnumC1527210pqR>() { // from class: X.0pqr
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1527210pqR.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1527210pqR fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return V4;
                    }
                    return V21;
                }
                return V2;
            }
            return V1;
        }
        return Unknown;
    }

    public static EnumC1527210pqR valueOf(String str) {
        return (EnumC1527210pqR) C08FF.LIZ(EnumC1527210pqR.class, str);
    }

    EnumC1527210pqR(int i) {
        this.LL = i;
    }
}
