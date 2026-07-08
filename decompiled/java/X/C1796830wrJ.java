package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1796830wrJ extends AbstractC1805010x4V<AnonymousClass0504, String> implements InterfaceC1567100qsm {
    @Override // X.AbstractC1805010x4V
    public final Object LJFF(AnonymousClass0504 anonymousClass0504, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        try {
            if (anonymousClass0504.LIZ) {
                return C1797270ws1.LIZIZ().LIZLLL();
            }
            return C1797270ws1.LIZIZ().LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1803440x1y.LIZIZ("ttlive_wallet_recharge_query_iap_currency", e);
            C20441214yg.LJI("CurrencyQueryTask", e);
            return "";
        }
    }
}
