package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CmL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2240311CmL implements WireEnum {
    MEDIA_STATUS_UNKNOWN(0),
    MEDIA_STATUS_READY(1),
    MEDIA_STATUS_PROCESSING(2),
    MEDIA_STATUS_FAILED(10);

    public static final ProtoAdapter<EnumC2240311CmL> ADAPTER = new EnumAdapter<EnumC2240311CmL>() { // from class: X.1CmN
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2240311CmL.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2240311CmL fromValue(int i) {
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

    public static EnumC2240311CmL valueOf(String str) {
        return (EnumC2240311CmL) C08FF.LIZ(EnumC2240311CmL.class, str);
    }

    EnumC2240311CmL(int i) {
        this.LL = i;
    }
}
