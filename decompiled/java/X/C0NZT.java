package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0NZT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public enum C0NZT implements WireEnum {
    ONBOARDING_CARD_STATUS_UNKNOWN(0),
    ONBOARDING_CARD_STATUS_SHOW(1),
    ONBOARDING_CARD_STATUS_FINISH(2),
    ONBOARDING_CARD_STATUS_DISMISS(3);

    public static final ProtoAdapter<C0NZT> ADAPTER = new EnumAdapter<C0NZT>() { // from class: X.0NZU
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0NZT.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0NZT fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ONBOARDING_CARD_STATUS_DISMISS;
                }
                return ONBOARDING_CARD_STATUS_FINISH;
            }
            return ONBOARDING_CARD_STATUS_SHOW;
        }
        return ONBOARDING_CARD_STATUS_UNKNOWN;
    }

    public static C0NZT valueOf(String str) {
        return (C0NZT) C08FF.LIZ(C0NZT.class, str);
    }

    C0NZT(int i) {
        this.LL = i;
    }
}
