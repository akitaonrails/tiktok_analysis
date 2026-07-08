package X;

import android.util.Log;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;

/* JADX INFO: renamed from: X.0oEi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465380oEi {
    public static final void LIZ(ProviderEffect providerEffect) {
        String clickUrl = providerEffect.getClickUrl();
        if (clickUrl != null) {
            ((InterfaceC1465400oEk) C0CHQ.LIZ().getNetworkService().retrofitCreate(clickUrl, InterfaceC1465400oEk.class)).LIZ(clickUrl).LJL(C11S5.LIZ()).LJJZ(new C09JN() { // from class: X.0oEj
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("ProviderEffectExtensions@c766.notifyDealer$1$1");
                    C1C7U.LIZIZ("ProviderEffectExtensions@c766.notifyDealer$1$1");
                }
            }, new C09JN() { // from class: X.0oEg
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ProviderEffectExtensions@c766.notifyDealer$1$2");
                    Throwable th = (Throwable) obj;
                    C201955140j.LJI("ProviderEffect", th);
                    C543670LTx c543670LTx = new C543670LTx();
                    c543670LTx.LIZ.put("errorMsg", Log.getStackTraceString(th));
                    C1637890six.LJ("effect_provider_notify_dealer_error_rate", 1, c543670LTx.LJ());
                    C1C7U.LIZIZ("ProviderEffectExtensions@c766.notifyDealer$1$2");
                }
            }, new InterfaceC781210Ukh() { // from class: X.0oEh
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    C1637890six.LJ("effect_provider_notify_dealer_error_rate", 0, null);
                }
            });
        }
    }
}
