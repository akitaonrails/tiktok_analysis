package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1AcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2183061AcC implements WireEnum {
    VAR_LINK_MIC_LOG_LEVEL_VERBOSE(0),
    VAR_LINK_MIC_LOG_LEVEL_INFO(1),
    VAR_LINK_MIC_LOG_LEVEL_DEBUG(2),
    VAR_LINK_MIC_LOG_LEVEL_WARN(3),
    VAR_LINK_MIC_LOG_LEVEL_ERROR(4);

    public static final ProtoAdapter<EnumC2183061AcC> ADAPTER = new EnumAdapter<EnumC2183061AcC>() { // from class: X.1AcD
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2183061AcC.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2183061AcC fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return VAR_LINK_MIC_LOG_LEVEL_ERROR;
                    }
                    return VAR_LINK_MIC_LOG_LEVEL_WARN;
                }
                return VAR_LINK_MIC_LOG_LEVEL_DEBUG;
            }
            return VAR_LINK_MIC_LOG_LEVEL_INFO;
        }
        return VAR_LINK_MIC_LOG_LEVEL_VERBOSE;
    }

    public static EnumC2183061AcC valueOf(String str) {
        return (EnumC2183061AcC) C08FF.LIZ(EnumC2183061AcC.class, str);
    }

    EnumC2183061AcC(int i) {
        this.LL = i;
    }
}
