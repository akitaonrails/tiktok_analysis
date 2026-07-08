package X;

import com.bytedance.android.livesdk.gift.model.GiftColorInfo;

/* JADX INFO: renamed from: X.0fSL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1127870fSL {
    public GiftColorInfo LIZ;
    public Long LIZIZ;
    public Long LIZJ;

    public final void LIZ(long j) {
        Long l = this.LIZJ;
        if (l == null || l.longValue() != j) {
            this.LIZ = null;
            this.LIZIZ = null;
            this.LIZJ = Long.valueOf(j);
        }
    }
}
