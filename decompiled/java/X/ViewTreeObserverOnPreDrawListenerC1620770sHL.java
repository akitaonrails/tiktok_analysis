package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0sHL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class ViewTreeObserverOnPreDrawListenerC1620770sHL implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC1620770sHL viewTreeObserverOnPreDrawListenerC1620770sHL) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
        c1587740rQ4.getClass();
        HashMap<String, String> map = C1587740rQ4.LIZIZ;
        c1587740rQ4.getClass();
        map.put("duration_touch_tab_to_first_view", String.valueOf(jElapsedRealtime - C1587740rQ4.LIZJ));
        c1587740rQ4.getClass();
        c1587740rQ4.getClass();
        map.put("duration_from_fetch_feed_to_first_view", String.valueOf(jElapsedRealtime - C1587740rQ4.LIZLLL));
        C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC1620770sHL.l0).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1620770sHL);
        C0VWW.LIZIZ("latency_friends");
        return false;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC1620770sHL viewTreeObserverOnPreDrawListenerC1620770sHL) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1587740rQ4 c1587740rQ4 = C1587740rQ4.LIZ;
        c1587740rQ4.getClass();
        HashMap<String, String> map = C1587740rQ4.LIZIZ;
        c1587740rQ4.getClass();
        map.put("duration_touch_tab_to_first_view", String.valueOf(jElapsedRealtime - C1587740rQ4.LIZJ));
        c1587740rQ4.getClass();
        c1587740rQ4.getClass();
        map.put("duration_from_fetch_feed_to_first_view", String.valueOf(jElapsedRealtime - C1587740rQ4.LIZLLL));
        C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC1620770sHL.l0).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1620770sHL);
        C0VWW.LIZIZ("latency_friends");
        return false;
    }

    public ViewTreeObserverOnPreDrawListenerC1620770sHL(View view, int i) {
        this.$t = i;
        this.l0 = view;
    }
}
