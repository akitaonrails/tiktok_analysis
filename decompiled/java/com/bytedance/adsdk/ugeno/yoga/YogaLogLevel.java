package com.bytedance.adsdk.ugeno.yoga;

import X.C08FF;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static YogaLogLevel fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return FATAL;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Unknown enum value: ");
                            sbLIZ.append(i);
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        return VERBOSE;
                    }
                    return DEBUG;
                }
                return INFO;
            }
            return WARN;
        }
        return ERROR;
    }

    public static YogaLogLevel valueOf(String str) {
        return (YogaLogLevel) C08FF.LIZ(YogaLogLevel.class, str);
    }

    YogaLogLevel(int i) {
        this.LL = i;
    }
}
