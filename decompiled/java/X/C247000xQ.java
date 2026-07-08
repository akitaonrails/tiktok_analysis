package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.api.IncentiveApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00xQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C247000xQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str, String str2, long j, String str3, String str4) {
        try {
            C480460Ism.LIZ().getClass();
            ((IncentiveApi) C480460Ism.LIZLLL(IncentiveApi.class)).reportGuide(j, str, i, str3, str2, str4).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.00MV
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("TpBubbleBuilder@e387.reportGuide$1");
                    C1C7U.LIZIZ("TpBubbleBuilder@e387.reportGuide$1");
                }
            }, new C09JN() { // from class: X.00qT
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("TpBubbleBuilder@e387.reportGuide$2");
                    C20441214yg.LJI("TpBubbleBuilder", (Throwable) obj);
                    C1C7U.LIZIZ("TpBubbleBuilder@e387.reportGuide$2");
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("TpBubbleBuilder", e);
        }
    }
}
