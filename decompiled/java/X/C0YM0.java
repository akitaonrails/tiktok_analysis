package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YM0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0YM0 implements WireEnum {
    INPUT_STATUS_SCENE_UNKNOWN(0),
    SMART_REPLY_USER(1),
    SMART_REPLY_CREATOR(2);

    public static final ProtoAdapter<C0YM0> ADAPTER = new EnumAdapter<C0YM0>() { // from class: X.0YM1
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0YM0.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0YM0 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return SMART_REPLY_CREATOR;
            }
            return SMART_REPLY_USER;
        }
        return INPUT_STATUS_SCENE_UNKNOWN;
    }

    public static C0YM0 valueOf(String str) {
        return (C0YM0) C08FF.LIZ(C0YM0.class, str);
    }

    C0YM0(int i) {
        this.LL = i;
    }
}
