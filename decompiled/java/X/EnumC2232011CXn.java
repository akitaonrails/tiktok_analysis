package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2232011CXn implements WireEnum {
    VAR_LINKER_USER_TYPE_UNKNOWN(0),
    VAR_LINKER_USER_TYPE_GUEST(1),
    VAR_LINKER_USER_TYPE_HOST(2);

    public static final ProtoAdapter<EnumC2232011CXn> ADAPTER = new EnumAdapter<EnumC2232011CXn>() { // from class: X.1CYX
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2232011CXn.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2232011CXn fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return VAR_LINKER_USER_TYPE_HOST;
            }
            return VAR_LINKER_USER_TYPE_GUEST;
        }
        return VAR_LINKER_USER_TYPE_UNKNOWN;
    }

    public static EnumC2232011CXn valueOf(String str) {
        return (EnumC2232011CXn) C08FF.LIZ(EnumC2232011CXn.class, str);
    }

    EnumC2232011CXn(int i) {
        this.LL = i;
    }
}
