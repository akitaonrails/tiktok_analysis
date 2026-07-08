package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YOD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0YOD implements WireEnum {
    OP_SUCCEED(0),
    REJECTED(1),
    PARTLY_REJECTED(2),
    APPLY_REJECTED(3),
    APPLY_SUCCEED(4),
    CALLBACK_REJECTED(5),
    TOUCH_LIMITS(6);

    public static final ProtoAdapter<C0YOD> ADAPTER = new EnumAdapter<C0YOD>() { // from class: X.0YOE
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0YOD.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0YOD fromValue(int i) {
        switch (i) {
            case 0:
                return OP_SUCCEED;
            case 1:
                return REJECTED;
            case 2:
                return PARTLY_REJECTED;
            case 3:
                return APPLY_REJECTED;
            case 4:
                return APPLY_SUCCEED;
            case 5:
                return CALLBACK_REJECTED;
            case 6:
                return TOUCH_LIMITS;
            default:
                return null;
        }
    }

    public static C0YOD valueOf(String str) {
        return (C0YOD) C08FF.LIZ(C0YOD.class, str);
    }

    C0YOD(int i) {
        this.LL = i;
    }
}
