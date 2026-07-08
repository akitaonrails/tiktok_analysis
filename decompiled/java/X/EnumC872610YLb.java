package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YLb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC872610YLb implements WireEnum {
    REFER_NOT_USED(0),
    ANDROID(1),
    IOS(2),
    PC(3),
    SERVER(4);

    public static final ProtoAdapter<EnumC872610YLb> ADAPTER = new EnumAdapter<EnumC872610YLb>() { // from class: X.0YLd
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC872610YLb.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC872610YLb fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return SERVER;
                    }
                    return PC;
                }
                return IOS;
            }
            return ANDROID;
        }
        return REFER_NOT_USED;
    }

    public static EnumC872610YLb valueOf(String str) {
        return (EnumC872610YLb) C08FF.LIZ(EnumC872610YLb.class, str);
    }

    EnumC872610YLb(int i) {
        this.LL = i;
    }
}
