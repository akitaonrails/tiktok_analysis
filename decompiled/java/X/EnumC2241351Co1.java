package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.1Co1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2241351Co1 implements WireEnum {
    TaskStatusCreated(0),
    TaskStatusRunning(1),
    TaskStatusSuccess(2),
    TaskStatusFailed(3),
    TaskStatusCancelled(4);

    public static final ProtoAdapter<EnumC2241351Co1> ADAPTER = new EnumAdapter<EnumC2241351Co1>() { // from class: X.1Co3
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC2241351Co1.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC2241351Co1 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return TaskStatusCancelled;
                    }
                    return TaskStatusFailed;
                }
                return TaskStatusSuccess;
            }
            return TaskStatusRunning;
        }
        return TaskStatusCreated;
    }

    public static EnumC2241351Co1 valueOf(String str) {
        return (EnumC2241351Co1) C08FF.LIZ(EnumC2241351Co1.class, str);
    }

    EnumC2241351Co1(int i) {
        this.LL = i;
    }
}
