package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Bv0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2220201Bv0 implements WireEnum {
    UNKNOWN(0),
    WIFI(1),
    MOBILE_2G(2),
    MOBILE_3G(3),
    MOBILE_4G(4),
    MOBILE_5G(5);

    public static final ProtoAdapter<EnumC2220201Bv0> ADAPTER = new EnumAdapter<EnumC2220201Bv0>() { // from class: X.1Bv1
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2220201Bv0.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2220201Bv0 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return MOBILE_5G;
                        }
                        return MOBILE_4G;
                    }
                    return MOBILE_3G;
                }
                return MOBILE_2G;
            }
            return WIFI;
        }
        return UNKNOWN;
    }

    public static EnumC2220201Bv0 valueOf(String str) {
        return (EnumC2220201Bv0) C08FF.LIZ(EnumC2220201Bv0.class, str);
    }

    EnumC2220201Bv0(int i) {
        this.LL = i;
    }
}
