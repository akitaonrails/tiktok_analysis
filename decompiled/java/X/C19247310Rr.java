package X;

import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;

/* JADX INFO: renamed from: X.10Rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19247310Rr {
    public final boolean LIZ;
    public final C19249810Sq LIZIZ;
    public final PNSErrorModel LIZJ;

    public C19247310Rr(boolean z, C19249810Sq c19249810Sq, PNSErrorModel pNSErrorModel, int i) {
        z = (i & 1) != 0 ? false : z;
        c19249810Sq = (i & 2) != 0 ? null : c19249810Sq;
        pNSErrorModel = (i & 4) != 0 ? null : pNSErrorModel;
        this.LIZ = z;
        this.LIZIZ = c19249810Sq;
        this.LIZJ = pNSErrorModel;
    }
}
