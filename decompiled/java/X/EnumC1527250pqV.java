package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0pqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1527250pqV implements WireEnum {
    Device(0),
    User(1);

    public static final ProtoAdapter<EnumC1527250pqV> ADAPTER = new EnumAdapter<EnumC1527250pqV>() { // from class: X.0pql
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1527250pqV.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1527250pqV fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return User;
        }
        return Device;
    }

    public static EnumC1527250pqV valueOf(String str) {
        return (EnumC1527250pqV) C08FF.LIZ(EnumC1527250pqV.class, str);
    }

    EnumC1527250pqV(int i) {
        this.LL = i;
    }
}
