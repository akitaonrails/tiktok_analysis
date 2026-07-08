package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0pqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1527260pqW implements WireEnum {
    Noop(0),
    NeedFin(1);

    public static final ProtoAdapter<EnumC1527260pqW> ADAPTER = new EnumAdapter<EnumC1527260pqW>() { // from class: X.0pqn
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1527260pqW.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1527260pqW fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return NeedFin;
        }
        return Noop;
    }

    public static EnumC1527260pqW valueOf(String str) {
        return (EnumC1527260pqW) C08FF.LIZ(EnumC1527260pqW.class, str);
    }

    EnumC1527260pqW(int i) {
        this.LL = i;
    }
}
