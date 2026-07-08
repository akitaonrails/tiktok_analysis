package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0ZhN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC906550ZhN implements WireEnum {
    MEDIA_STATUS_UNKNOWN(0),
    MEDIA_STATUS_READY(1),
    MEDIA_STATUS_PROCESSING(2),
    MEDIA_STATUS_FAILED(10);

    public static final ProtoAdapter<EnumC906550ZhN> ADAPTER = new EnumAdapter<EnumC906550ZhN>() { // from class: X.0ZhP
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC906550ZhN.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC906550ZhN fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 10) {
                        return null;
                    }
                    return MEDIA_STATUS_FAILED;
                }
                return MEDIA_STATUS_PROCESSING;
            }
            return MEDIA_STATUS_READY;
        }
        return MEDIA_STATUS_UNKNOWN;
    }

    public static EnumC906550ZhN valueOf(String str) {
        return (EnumC906550ZhN) C08FF.LIZ(EnumC906550ZhN.class, str);
    }

    EnumC906550ZhN(int i) {
        this.LL = i;
    }
}
