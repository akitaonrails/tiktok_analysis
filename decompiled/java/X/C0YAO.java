package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YAO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0YAO implements WireEnum {
    MODIFY_PROPERTY_SUCCESS(0),
    MODIFY_PROPERTY_REPEAT_REQUEST(1),
    MODIFY_PROPERTY_INVALID_LENGTH(2),
    MODIFY_PROPERTY_INVALID_REQUEST(3),
    MODIFY_PROPERTY_CALLBACK_ERROR(4),
    MODIFY_PROPERTY_INTERNAL_ERROR(500);

    public static final ProtoAdapter<C0YAO> ADAPTER = new EnumAdapter<C0YAO>() { // from class: X.0YAz
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0YAO.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0YAO fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 500) {
                                return null;
                            }
                            return MODIFY_PROPERTY_INTERNAL_ERROR;
                        }
                        return MODIFY_PROPERTY_CALLBACK_ERROR;
                    }
                    return MODIFY_PROPERTY_INVALID_REQUEST;
                }
                return MODIFY_PROPERTY_INVALID_LENGTH;
            }
            return MODIFY_PROPERTY_REPEAT_REQUEST;
        }
        return MODIFY_PROPERTY_SUCCESS;
    }

    public static C0YAO valueOf(String str) {
        return (C0YAO) C08FF.LIZ(C0YAO.class, str);
    }

    C0YAO(int i) {
        this.LL = i;
    }
}
