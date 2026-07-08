package X;

import com.bytedance.android.livesdk.gift.model.GiftActivityCreator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Yc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C096800Yc {
    public static volatile C096700Yb LIZ;

    public static C096700Yb LIZ(C096600Ya c096600Ya, long j) {
        C096700Yb c096700Yb = LIZ;
        if (c096700Yb == null || !Intrinsics.LJFF(c096700Yb.LIZ, c096600Ya)) {
            return null;
        }
        GiftActivityCreator giftActivityCreator = c096700Yb.LIZIZ.activity;
        if (giftActivityCreator != null && (j < giftActivityCreator.startTime || j > giftActivityCreator.endTime)) {
            return null;
        }
        return c096700Yb;
    }
}
