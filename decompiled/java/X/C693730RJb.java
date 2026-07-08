package X;

import Y.ARunnableS30S0110000_11;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.feed.platform.container.info.FeedInfoAreaContainer;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0RJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693730RJb extends C09AY implements InterfaceC1631620sYq<FeedInfoAreaContainer, Boolean, Long, Unit> {
    public C693730RJb() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Unit invoke(FeedInfoAreaContainer feedInfoAreaContainer, Boolean bool, Long l) {
        int i;
        boolean zBooleanValue = bool.booleanValue();
        long jLongValue = l.longValue();
        final View viewFindViewById = feedInfoAreaContainer.LJJIJL().findViewById(R.id.bm5);
        if (viewFindViewById != null) {
            final float f = 0.0f;
            if (jLongValue <= 0) {
                if (zBooleanValue) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, viewFindViewById);
                if (zBooleanValue) {
                    f = 1.0f;
                }
                C786410Ut5.T4(viewFindViewById, f);
            } else {
                if (!zBooleanValue) {
                    f = 1.0f;
                }
                viewFindViewById.clearAnimation();
                viewFindViewById.animate().alpha(1 - f).setDuration(jLongValue).setInterpolator(new LinearInterpolator()).withStartAction(new Runnable() { // from class: X.0RJc
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FeedInfoAreaContainer@2fe3.onCreate$3$1");
                        try {
                            C786410Ut5.T4(viewFindViewById, f);
                            C786410Ut5.LJLLLLLL(0, viewFindViewById);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FeedInfoAreaContainer@2fe3.onCreate$3$1");
                    }
                }).withEndAction(new ARunnableS30S0110000_11(viewFindViewById, zBooleanValue, 3)).start();
            }
        }
        return Unit.LIZ;
    }
}
