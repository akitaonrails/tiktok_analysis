package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CXX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CXX implements WireEnum {
    VAR_LIVE_LOG_LEVEL_VERBOSE(0),
    VAR_LIVE_LOG_LEVEL_INFO(1),
    VAR_LIVE_LOG_LEVEL_DEBUG(2),
    VAR_LIVE_LOG_LEVEL_WARN(3),
    VAR_LIVE_LOG_LEVEL_ERROR(4);

    public static final ProtoAdapter<C1CXX> ADAPTER = new EnumAdapter<C1CXX>() { // from class: X.1CYg
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C1CXX.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C1CXX fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_LIVE_LOG_LEVEL_ERROR;
                    }
                    return VAR_LIVE_LOG_LEVEL_WARN;
                }
                return VAR_LIVE_LOG_LEVEL_DEBUG;
            }
            return VAR_LIVE_LOG_LEVEL_INFO;
        }
        return VAR_LIVE_LOG_LEVEL_VERBOSE;
    }

    public static C1CXX valueOf(String str) {
        return (C1CXX) C08FF.LIZ(C1CXX.class, str);
    }

    C1CXX(int i) {
        this.LL = i;
    }
}
