package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.preregister.GamePreRegisterCard;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0z1V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class ViewTreeObserverOnPreDrawListenerC1880030z1V implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View LL;
    public final /* synthetic */ GamePreRegisterCard LLILLJJLI;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C786410Ut5.D3(this.LL.getViewTreeObserver(), this);
        View view = this.LL;
        final GamePreRegisterCard gamePreRegisterCard = this.LLILLJJLI;
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0z1U
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:100:0x0137  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 320
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1880020z1U.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GamePreRegisterCard@ea5b.reportCardShowOnce$1$onPreDraw$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GamePreRegisterCard@ea5b.reportCardShowOnce$1$onPreDraw$1");
            }
        });
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC1880030z1V(View view, GamePreRegisterCard gamePreRegisterCard) {
        this.LL = view;
        this.LLILLJJLI = gamePreRegisterCard;
    }
}
