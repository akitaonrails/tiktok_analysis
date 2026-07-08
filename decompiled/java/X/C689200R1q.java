package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0R1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C689200R1q extends C688690Qzr {
    public boolean LLLILZ;
    public boolean LLLILZJ;

    public C689200R1q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.C688690Qzr
    public final boolean LJJJJLL(boolean z) {
        if (!this.LLLILZ) {
            return false;
        }
        this.LLLILZJ = z;
        return true;
    }

    public C689200R1q(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
