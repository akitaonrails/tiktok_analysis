package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1CrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2243411CrL implements WireEnum {
    DEFAULT(1),
    CLICKABLE_TEXT(2);

    public static final ProtoAdapter<EnumC2243411CrL> ADAPTER = new EnumAdapter<EnumC2243411CrL>() { // from class: X.1CrS
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2243411CrL.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2243411CrL fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return CLICKABLE_TEXT;
        }
        return DEFAULT;
    }

    public static EnumC2243411CrL valueOf(String str) {
        return (EnumC2243411CrL) C08FF.LIZ(EnumC2243411CrL.class, str);
    }

    EnumC2243411CrL(int i) {
        this.LL = i;
    }
}
