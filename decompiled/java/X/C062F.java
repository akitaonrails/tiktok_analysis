package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.062F, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public enum C062F implements WireEnum {
    BOT_FEEDBACK_TYPE_UNKNOWN(0),
    BOT_FEEDBACK_TYPE_POSITIVE(1),
    BOT_FEEDBACK_TYPE_NEGATIVE(2);

    public static final ProtoAdapter<C062F> ADAPTER = new EnumAdapter<C062F>() { // from class: X.062I
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C062F.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C062F fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return BOT_FEEDBACK_TYPE_NEGATIVE;
            }
            return BOT_FEEDBACK_TYPE_POSITIVE;
        }
        return BOT_FEEDBACK_TYPE_UNKNOWN;
    }

    public static C062F valueOf(String str) {
        return (C062F) C08FF.LIZ(C062F.class, str);
    }

    C062F(int i) {
        this.LL = i;
    }
}
