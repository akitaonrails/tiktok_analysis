package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0pqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1527170pqN implements WireEnum {
    None(0),
    ACK(1),
    Data(2),
    Sync(3),
    Poll(4),
    FIN(5);

    public static final ProtoAdapter<EnumC1527170pqN> ADAPTER = new EnumAdapter<EnumC1527170pqN>() { // from class: X.0pqm
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1527170pqN.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1527170pqN fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return FIN;
                        }
                        return Poll;
                    }
                    return Sync;
                }
                return Data;
            }
            return ACK;
        }
        return None;
    }

    public static EnumC1527170pqN valueOf(String str) {
        return (EnumC1527170pqN) C08FF.LIZ(EnumC1527170pqN.class, str);
    }

    EnumC1527170pqN(int i) {
        this.LL = i;
    }
}
