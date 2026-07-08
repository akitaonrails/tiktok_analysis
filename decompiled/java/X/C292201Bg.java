package X;

import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: renamed from: X.01Bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C292201Bg {
    public static final AbstractC1126600fQI<Gift> LIZ(Gift gift) {
        if (gift.type == 3) {
            return new C2684012c(gift);
        }
        if (gift.LJ()) {
            return new C293001Bo(gift);
        }
        return new C1126040fPO(gift);
    }
}
