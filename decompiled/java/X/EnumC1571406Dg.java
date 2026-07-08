package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.06Dg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1571406Dg implements WireEnum {
    StreakPetSubStatus_Unknown(0),
    StreakPetSubStatus_Hatching1(1),
    StreakPetSubStatus_Hatching2(2);

    public static final ProtoAdapter<EnumC1571406Dg> ADAPTER = new EnumAdapter<EnumC1571406Dg>() { // from class: X.06Dj
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1571406Dg.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1571406Dg fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return StreakPetSubStatus_Hatching2;
            }
            return StreakPetSubStatus_Hatching1;
        }
        return StreakPetSubStatus_Unknown;
    }

    public static EnumC1571406Dg valueOf(String str) {
        return (EnumC1571406Dg) C08FF.LIZ(EnumC1571406Dg.class, str);
    }

    EnumC1571406Dg(int i) {
        this.LL = i;
    }
}
