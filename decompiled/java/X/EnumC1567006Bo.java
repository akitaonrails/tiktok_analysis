package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.06Bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1567006Bo implements WireEnum {
    StreakActionUnkown(0),
    LightMilestoneStreak(1);

    public static final ProtoAdapter<EnumC1567006Bo> ADAPTER = new EnumAdapter<EnumC1567006Bo>() { // from class: X.06Bp
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC1567006Bo.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC1567006Bo fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return LightMilestoneStreak;
        }
        return StreakActionUnkown;
    }

    public static EnumC1567006Bo valueOf(String str) {
        return (EnumC1567006Bo) C08FF.LIZ(EnumC1567006Bo.class, str);
    }

    EnumC1567006Bo(int i) {
        this.LL = i;
    }
}
