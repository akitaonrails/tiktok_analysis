package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Cn8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2240801Cn8 implements WireEnum {
    STREAM_STATUS_UNKNOWN(0),
    STREAM_STATUS_START(1),
    STREAM_STATUS_WAIT(2),
    STREAM_STATUS_FINISH(3),
    STREAM_STATUS_ERROR(4);

    public static final ProtoAdapter<EnumC2240801Cn8> ADAPTER = new EnumAdapter<EnumC2240801Cn8>() { // from class: X.1CnA
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2240801Cn8.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2240801Cn8 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return STREAM_STATUS_ERROR;
                    }
                    return STREAM_STATUS_FINISH;
                }
                return STREAM_STATUS_WAIT;
            }
            return STREAM_STATUS_START;
        }
        return STREAM_STATUS_UNKNOWN;
    }

    public static EnumC2240801Cn8 valueOf(String str) {
        return (EnumC2240801Cn8) C08FF.LIZ(EnumC2240801Cn8.class, str);
    }

    EnumC2240801Cn8(int i) {
        this.LL = i;
    }
}
