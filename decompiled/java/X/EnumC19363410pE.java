package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10pE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19363410pE implements WireEnum {
    StreakPetCmdUnknown(0),
    StreakPetCmdUpdate(1),
    StreakPetCmdCreate(2),
    StreakPetCmdLevelUp(3);

    public static final ProtoAdapter<EnumC19363410pE> ADAPTER = new EnumAdapter<EnumC19363410pE>() { // from class: X.10pF
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19363410pE.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19363410pE fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return StreakPetCmdLevelUp;
                }
                return StreakPetCmdCreate;
            }
            return StreakPetCmdUpdate;
        }
        return StreakPetCmdUnknown;
    }

    public static EnumC19363410pE valueOf(String str) {
        return (EnumC19363410pE) C08FF.LIZ(EnumC19363410pE.class, str);
    }

    EnumC19363410pE(int i) {
        this.LL = i;
    }
}
