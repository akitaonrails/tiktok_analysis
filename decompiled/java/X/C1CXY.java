package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXY implements WireEnum {
    VAR_LIVE_SETTING_TYPE_BOOL(0),
    VAR_LIVE_SETTING_TYPE_INTEGER(1),
    VAR_LIVE_SETTING_TYPE_LONG(2),
    VAR_LIVE_SETTING_TYPE_FLOAT(3),
    VAR_LIVE_SETTING_TYPE_STRING(4);

    public static final ProtoAdapter<C1CXY> ADAPTER = new EnumAdapter<C1CXY>() { // from class: X.1CYj
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CXY.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CXY fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_LIVE_SETTING_TYPE_STRING;
                    }
                    return VAR_LIVE_SETTING_TYPE_FLOAT;
                }
                return VAR_LIVE_SETTING_TYPE_LONG;
            }
            return VAR_LIVE_SETTING_TYPE_INTEGER;
        }
        return VAR_LIVE_SETTING_TYPE_BOOL;
    }

    public static C1CXY valueOf(String str) {
        return (C1CXY) C08FF.LIZ(C1CXY.class, str);
    }

    C1CXY(int i) {
        this.LL = i;
    }
}
