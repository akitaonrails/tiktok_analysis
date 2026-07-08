package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Cru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2243761Cru implements WireEnum {
    StickerVariant_Unknown(0),
    StickerVariant_Static(1),
    StickerVariant_Animated(2);

    public static final ProtoAdapter<EnumC2243761Cru> ADAPTER = new EnumAdapter<EnumC2243761Cru>() { // from class: X.1Cs1
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2243761Cru.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2243761Cru fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return StickerVariant_Animated;
            }
            return StickerVariant_Static;
        }
        return StickerVariant_Unknown;
    }

    public static EnumC2243761Cru valueOf(String str) {
        return (EnumC2243761Cru) C08FF.LIZ(EnumC2243761Cru.class, str);
    }

    EnumC2243761Cru(int i) {
        this.LL = i;
    }
}
