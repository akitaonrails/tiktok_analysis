package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rtm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710400Rtm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19EG LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710400Rtm(C19EG c19eg) {
        super(0);
        this.LL = c19eg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C799900VZk.LIZ.getClass();
        if (C0CP9.LIZIZ() && ((Boolean) C073B.LIZJ.getValue()).booleanValue()) {
            C0VY3.LIZJ(new C710390Rtl(this.LL));
            C786410Ut5.LJLIIL(10000L, C799570VYd.LIZIZ(), new Runnable() { // from class: X.0Rtk
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LoginSceneOpt@2e54.optPreloadLayout$2");
                    try {
                        C20673215v0.LJIIIZ("awemenotice_mus_new_popview_notification");
                        C20673215v0.LJIIIZ("awemenotice_mus_new_popview_notification_side");
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LoginSceneOpt@2e54.optPreloadLayout$2");
                }
            });
        }
        return Unit.LIZ;
    }
}
