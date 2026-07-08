package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YZO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0YZO implements WireEnum {
    Success(1),
    AsyncSuccess(2),
    Fail(3),
    Offline(4);

    public static final ProtoAdapter<C0YZO> ADAPTER = new EnumAdapter<C0YZO>() { // from class: X.0YZP
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0YZO.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0YZO fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return Offline;
                }
                return Fail;
            }
            return AsyncSuccess;
        }
        return Success;
    }

    public static C0YZO valueOf(String str) {
        return (C0YZO) C08FF.LIZ(C0YZO.class, str);
    }

    C0YZO(int i) {
        this.LL = i;
    }
}
