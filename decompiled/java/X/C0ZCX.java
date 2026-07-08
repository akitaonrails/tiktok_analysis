package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0ZCX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public enum C0ZCX implements WireEnum {
    FilteredReasonNone(0),
    FilteredReasonRisk(1),
    FilteredRequestKeyword(2),
    FilteredReasonContentRisk(3),
    FilteredReasonHarasser(4),
    FilteredReasonUserBanned(5);

    public static final ProtoAdapter<C0ZCX> ADAPTER = new EnumAdapter<C0ZCX>() { // from class: X.0ZCY
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return C0ZCX.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0ZCX fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return FilteredReasonUserBanned;
                        }
                        return FilteredReasonHarasser;
                    }
                    return FilteredReasonContentRisk;
                }
                return FilteredRequestKeyword;
            }
            return FilteredReasonRisk;
        }
        return FilteredReasonNone;
    }

    public static C0ZCX valueOf(String str) {
        return (C0ZCX) C08FF.LIZ(C0ZCX.class, str);
    }

    C0ZCX(int i) {
        this.LL = i;
    }
}
