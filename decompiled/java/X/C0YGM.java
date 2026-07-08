package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YGM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0YGM implements WireEnum {
    ResetTypeUnknown(0),
    ResetTypeColdStart(1),
    ResetTypeAtOnce(2);

    public static final ProtoAdapter<C0YGM> ADAPTER = new EnumAdapter<C0YGM>() { // from class: X.0YGN
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0YGM.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0YGM fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return ResetTypeAtOnce;
            }
            return ResetTypeColdStart;
        }
        return ResetTypeUnknown;
    }

    public static C0YGM valueOf(String str) {
        return (C0YGM) C08FF.LIZ(C0YGM.class, str);
    }

    C0YGM(int i) {
        this.LL = i;
    }
}
