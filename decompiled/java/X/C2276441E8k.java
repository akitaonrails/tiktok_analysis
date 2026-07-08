package X;

import com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingLogWrapper;
import com.ss.android.ugc.aweme.common.UBTrackingLogImpl;

/* JADX INFO: renamed from: X.1E8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276441E8k implements IUBTrackingLogWrapper {
    public static final C2276441E8k LIZIZ = new C2276441E8k();
    public final /* synthetic */ IUBTrackingLogWrapper LIZ;

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingLogWrapper
    public final void LIZ(C807250Vlb c807250Vlb, String str, String str2, Throwable th) {
        this.LIZ.LIZ(c807250Vlb, str, str2, th);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingLogWrapper
    public final void LIZIZ(C807250Vlb c807250Vlb, String str, String str2) {
        this.LIZ.LIZIZ(c807250Vlb, str, str2);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingLogWrapper
    public final void LIZJ(C807250Vlb c807250Vlb, String str, String str2) {
        this.LIZ.LIZJ(c807250Vlb, str, str2);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingLogWrapper
    public final void LIZLLL(C807250Vlb c807250Vlb, String str, String str2) {
        this.LIZ.LIZLLL(c807250Vlb, str, str2);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingLogWrapper
    public final void LJ(C807250Vlb c807250Vlb, String str, String str2) {
        this.LIZ.LJ(c807250Vlb, str, str2);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IUBTrackingLogWrapper
    public final void LJFF(C807250Vlb c807250Vlb, String str, String str2) {
        this.LIZ.LJFF(c807250Vlb, str, str2);
    }

    public C2276441E8k() {
        IUBTrackingLogWrapper iUBTrackingLogWrapper;
        Object objLIZ = C04TD.LIZ(IUBTrackingLogWrapper.class, false);
        if (objLIZ != null) {
            iUBTrackingLogWrapper = (IUBTrackingLogWrapper) objLIZ;
        } else {
            if (C04TD.LLLLIIIILLL == null) {
                synchronized (IUBTrackingLogWrapper.class) {
                    if (C04TD.LLLLIIIILLL == null) {
                        C04TD.LLLLIIIILLL = new UBTrackingLogImpl();
                    }
                }
            }
            iUBTrackingLogWrapper = C04TD.LLLLIIIILLL;
        }
        this.LIZ = iUBTrackingLogWrapper;
    }
}
