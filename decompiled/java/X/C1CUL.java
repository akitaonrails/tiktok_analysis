package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CUL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CUL implements WireEnum {
    VAR_LINKMIC_USER_SETTING_LAYOUT_GRID(0),
    VAR_LINKMIC_USER_SETTING_LAYOUT_FLOATING(1);

    public static final ProtoAdapter<C1CUL> ADAPTER = new EnumAdapter<C1CUL>() { // from class: X.1CUM
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CUL.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CUL fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return VAR_LINKMIC_USER_SETTING_LAYOUT_FLOATING;
        }
        return VAR_LINKMIC_USER_SETTING_LAYOUT_GRID;
    }

    public static C1CUL valueOf(String str) {
        return (C1CUL) C08FF.LIZ(C1CUL.class, str);
    }

    C1CUL(int i) {
        this.LL = i;
    }
}
