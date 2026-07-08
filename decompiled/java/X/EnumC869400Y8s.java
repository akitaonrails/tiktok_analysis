package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0Y8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC869400Y8s implements WireEnum {
    UNKNOWN_CONV_TYPE(0),
    ONE_TO_ONE_CHAT(1),
    GROUP_CHAT(2);

    public static final ProtoAdapter<EnumC869400Y8s> ADAPTER = new EnumAdapter<EnumC869400Y8s>() { // from class: X.0Y90
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC869400Y8s.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC869400Y8s fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return GROUP_CHAT;
            }
            return ONE_TO_ONE_CHAT;
        }
        return UNKNOWN_CONV_TYPE;
    }

    public static EnumC869400Y8s valueOf(String str) {
        return (EnumC869400Y8s) C08FF.LIZ(EnumC869400Y8s.class, str);
    }

    EnumC869400Y8s(int i) {
        this.LL = i;
    }
}
