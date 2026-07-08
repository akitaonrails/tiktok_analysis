package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Cse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2244221Cse implements WireEnum {
    ANCHOR_UNKNOWN(-1),
    ANCHOR_POI(45);

    public static final ProtoAdapter<EnumC2244221Cse> ADAPTER = new EnumAdapter<EnumC2244221Cse>() { // from class: X.1Csk
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2244221Cse.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2244221Cse fromValue(int i) {
        if (i != -1) {
            if (i != 45) {
                return null;
            }
            return ANCHOR_POI;
        }
        return ANCHOR_UNKNOWN;
    }

    public static EnumC2244221Cse valueOf(String str) {
        return (EnumC2244221Cse) C08FF.LIZ(EnumC2244221Cse.class, str);
    }

    EnumC2244221Cse(int i) {
        this.LL = i;
    }
}
