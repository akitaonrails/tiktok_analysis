package X;

import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RaL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698350RaL extends C09AY implements Function1<C698700Rau, Unit> {
    public final /* synthetic */ InteractAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C698350RaL(InteractAreaComponent interactAreaComponent) {
        super(1);
        this.LL = interactAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C698700Rau c698700Rau) {
        if (c698700Rau != null) {
            c698700Rau.getClass();
            final long j = 0;
            c698700Rau.getClass();
            BPEAHandler bPEAHandler = C0CAU.LIZ;
            final InteractAreaComponent interactAreaComponent = this.LL;
            C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0RaM
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("InteractAreaComponent@725d.eventInit$1$1");
                    try {
                        View view = interactAreaComponent.LLLFF;
                        if (view == null) {
                            view = null;
                        }
                        C786410Ut5.LJLLLLLL(0, view);
                        interactAreaComponent.sp(j, true);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("InteractAreaComponent@725d.eventInit$1$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
