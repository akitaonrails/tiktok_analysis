package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.066w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15548066w implements WireEnum {
    StreakPetActionTypeUnknown(0),
    StreakPetActionTypeRefreshStreakInfo(1),
    StreakPetActionTypeRefreshStickerSet(2);

    public static final ProtoAdapter<EnumC15548066w> ADAPTER = new EnumAdapter<EnumC15548066w>() { // from class: X.066y
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC15548066w.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC15548066w fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return StreakPetActionTypeRefreshStickerSet;
            }
            return StreakPetActionTypeRefreshStreakInfo;
        }
        return StreakPetActionTypeUnknown;
    }

    public static EnumC15548066w valueOf(String str) {
        return (EnumC15548066w) C08FF.LIZ(EnumC15548066w.class, str);
    }

    EnumC15548066w(int i) {
        this.LL = i;
    }
}
