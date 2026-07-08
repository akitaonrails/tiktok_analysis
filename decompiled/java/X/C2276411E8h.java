package X;

import com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper;
import com.ss.android.ugc.aweme.legoImp.task.ubtrace.AwemeCrashlyticsWrapperImpl;

/* JADX INFO: renamed from: X.1E8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276411E8h implements IAwemeCrashlyticsWrapper {
    public static final C2276411E8h LIZIZ = new C2276411E8h();
    public final /* synthetic */ IAwemeCrashlyticsWrapper LIZ;

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void LIZIZ(String str, Exception exc) {
        this.LIZ.LIZIZ(str, exc);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void LIZJ(String str, int i, String str2, String str3) {
        this.LIZ.LIZJ(str, i, str2, str3);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void LIZLLL(String str, Throwable th) {
        this.LIZ.LIZLLL(str, th);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void LJ(String str) {
        this.LIZ.LJ(str);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void LJFF(String str, Exception exc) {
        this.LIZ.LJFF(str, exc);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void LJI(int i, String str, String str2, String str3) {
        this.LIZ.LJI(i, str, str2, str3);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void LJII(String str, String str2, String str3) {
        this.LIZ.LJII(str, str2, str3);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCrashlyticsWrapper
    public final void log(String str, String str2) {
        this.LIZ.log(str, str2);
    }

    public C2276411E8h() {
        IAwemeCrashlyticsWrapper iAwemeCrashlyticsWrapper;
        Object objLIZ = C04TD.LIZ(IAwemeCrashlyticsWrapper.class, false);
        if (objLIZ != null) {
            iAwemeCrashlyticsWrapper = (IAwemeCrashlyticsWrapper) objLIZ;
        } else {
            if (C04TD.U1 == null) {
                synchronized (IAwemeCrashlyticsWrapper.class) {
                    if (C04TD.U1 == null) {
                        C04TD.U1 = new AwemeCrashlyticsWrapperImpl();
                    }
                }
            }
            iAwemeCrashlyticsWrapper = C04TD.U1;
        }
        this.LIZ = iAwemeCrashlyticsWrapper;
    }
}
