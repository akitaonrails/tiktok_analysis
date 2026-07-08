package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.10p1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19362110p1 implements WireEnum {
    StreakPetTaskType_Unknown(0),
    StreakPetTaskType_PanelDaily(1),
    StreakPetTaskType_WheeDownload(2),
    StreakPetTaskType_WheeDaily(3);

    public static final ProtoAdapter<EnumC19362110p1> ADAPTER = new EnumAdapter<EnumC19362110p1>() { // from class: X.10p2
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC19362110p1.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC19362110p1 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return StreakPetTaskType_WheeDaily;
                }
                return StreakPetTaskType_WheeDownload;
            }
            return StreakPetTaskType_PanelDaily;
        }
        return StreakPetTaskType_Unknown;
    }

    public static EnumC19362110p1 valueOf(String str) {
        return (EnumC19362110p1) C08FF.LIZ(EnumC19362110p1.class, str);
    }

    EnumC19362110p1(int i) {
        this.LL = i;
    }
}
