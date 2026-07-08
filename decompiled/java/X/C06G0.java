package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.06G0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public enum C06G0 implements WireEnum {
    StreakPetStatus_Inactive(0),
    StreakPetStatus_Invited(1),
    StreakPetStatus_Active(2);

    public static final ProtoAdapter<C06G0> ADAPTER = new EnumAdapter<C06G0>() { // from class: X.06GC
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C06G0.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C06G0 fromValue(int i) {
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

    public static C06G0 valueOf(String str) {
        return (C06G0) C08FF.LIZ(C06G0.class, str);
    }

    C06G0(int i) {
        this.LL = i;
    }
}
