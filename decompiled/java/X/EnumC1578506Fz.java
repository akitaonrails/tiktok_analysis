package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.06Fz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1578506Fz implements WireEnum {
    StreakPetStatus_Inactive(0),
    StreakPetStatus_Invited(1),
    StreakPetStatus_Active(2);

    public static final ProtoAdapter<EnumC1578506Fz> ADAPTER = new EnumAdapter<EnumC1578506Fz>() { // from class: X.06GD
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1578506Fz.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1578506Fz fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return StreakPetStatus_Active;
            }
            return StreakPetStatus_Invited;
        }
        return StreakPetStatus_Inactive;
    }

    public static EnumC1578506Fz valueOf(String str) {
        return (EnumC1578506Fz) C08FF.LIZ(EnumC1578506Fz.class, str);
    }

    EnumC1578506Fz(int i) {
        this.LL = i;
    }
}
