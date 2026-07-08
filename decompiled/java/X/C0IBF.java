package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0IBF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public enum C0IBF implements WireEnum {
    FEATURE_STATUS_UNKNOWN(0),
    FEATURE_STATUS_SHOW(1),
    FEATURE_STATUS_DISABLED(2),
    FEATURE_STATUS_HIDE(3);

    public static final ProtoAdapter<C0IBF> ADAPTER = new EnumAdapter<C0IBF>() { // from class: X.0IBG
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0IBF.fromValue(i);
        }
    };
    public final int LL;

    public boolean isEnable() {
        return this == FEATURE_STATUS_SHOW || this == FEATURE_STATUS_UNKNOWN;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0IBF fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return FEATURE_STATUS_HIDE;
                }
                return FEATURE_STATUS_DISABLED;
            }
            return FEATURE_STATUS_SHOW;
        }
        return FEATURE_STATUS_UNKNOWN;
    }

    public static C0IBF valueOf(String str) {
        return (C0IBF) C08FF.LIZ(C0IBF.class, str);
    }

    C0IBF(int i) {
        this.LL = i;
    }
}
