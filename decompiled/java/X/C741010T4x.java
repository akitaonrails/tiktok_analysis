package X;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C741010T4x extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1885000z9W LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C741010T4x(C1885000z9W c1885000z9W) {
        super(0);
        this.LL = c1885000z9W;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZJ();
        final C1885000z9W c1885000z9W = this.LL;
        ViewGroup viewGroup = c1885000z9W.LJIIIIZZ;
        if (viewGroup != null) {
            C476770Imp.LIZJ(viewGroup, new Runnable() { // from class: X.0T4s
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("GameHashTagPresenter@d6bb.showPageRetryStatusView$1$1");
                    try {
                        ViewGroup viewGroup2 = c1885000z9W.LJIIIIZZ;
                        if (viewGroup2 != null) {
                            C500260Jjc.LJIILIIL(viewGroup2);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("GameHashTagPresenter@d6bb.showPageRetryStatusView$1$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
