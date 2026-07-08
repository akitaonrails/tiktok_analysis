package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.03Xr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C860103Xr {
    public static final String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == EnumC860203Xs.REFUNDABLE_SAMPLE_STATUS_SELECTED.getValue()) {
                return "1";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}
