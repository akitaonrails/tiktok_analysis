package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.06BD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public enum C06BD implements WireEnum {
    StreakCmdUnknown(0),
    StreakCmdStart(1),
    StreakCmdEnd(2),
    StreakCmdUpdate(3),
    StreakCmdRemind(4);

    public static final ProtoAdapter<C06BD> ADAPTER = new EnumAdapter<C06BD>() { // from class: X.06BF
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C06BD.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C06BD fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return StreakCmdRemind;
                    }
                    return StreakCmdUpdate;
                }
                return StreakCmdEnd;
            }
            return StreakCmdStart;
        }
        return StreakCmdUnknown;
    }

    public static C06BD valueOf(String str) {
        return (C06BD) C08FF.LIZ(C06BD.class, str);
    }

    C06BD(int i) {
        this.LL = i;
    }
}
