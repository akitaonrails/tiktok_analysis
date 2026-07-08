package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CW0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CW0 implements WireEnum {
    VAR_LINKER_MODE_UNKNOWN(0),
    VAR_LINKER_MODE_INNER(1),
    VAR_LINKER_MODE_CROSS(2),
    VAR_LINKER_MODE_MIXED(3);

    public static final ProtoAdapter<C1CW0> ADAPTER = new EnumAdapter<C1CW0>() { // from class: X.1CVz
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CW0.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CW0 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return VAR_LINKER_MODE_MIXED;
                }
                return VAR_LINKER_MODE_CROSS;
            }
            return VAR_LINKER_MODE_INNER;
        }
        return VAR_LINKER_MODE_UNKNOWN;
    }

    public static C1CW0 valueOf(String str) {
        return (C1CW0) C08FF.LIZ(C1CW0.class, str);
    }

    C1CW0(int i) {
        this.LL = i;
    }
}
