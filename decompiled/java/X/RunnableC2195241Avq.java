package X;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;

/* JADX INFO: renamed from: X.1Avq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class RunnableC2195241Avq implements Runnable {
    public final /* synthetic */ MiniGameFragment LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    public RunnableC2195241Avq(MiniGameFragment miniGameFragment, C19EG c19eg, boolean z) {
        this.LL = miniGameFragment;
        this.LLILLJJLI = c19eg;
        this.LLILLL = z;
    }

    public final void LIZ() {
        MiniGameFragment miniGameFragment = this.LL;
        if (miniGameFragment.l == null) {
            C1547430qN3 c1547430qN3 = C1547430qN3.LIZ;
            Activity activity = this.LLILLJJLI;
            String strIS = miniGameFragment.iS();
            if (strIS == null) {
                strIS = "";
            }
            MiniGameFragment miniGameFragment2 = this.LL;
            C1547470qN7 c1547470qN7 = (C1547470qN7) miniGameFragment2.RP(miniGameFragment2.LLJLILLLLZIIL);
            c1547430qN3.getClass();
            miniGameFragment.l = C1547430qN3.LJIILL(activity, strIS, c1547470qN7);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            MiniGameFragment miniGameFragment3 = this.LL;
            FrameLayout frameLayout = miniGameFragment3.LLZ;
            if (frameLayout != null) {
                frameLayout.addView(miniGameFragment3.l, layoutParams);
            }
            MiniGameFragment miniGameFragment4 = this.LL;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = miniGameFragment4.l;
            miniGameFragment4.o = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView() : null;
        }
        if (this.LLILLL) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LL.l;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, 0);
            }
            ImageView imageView = this.LL.m;
            if (imageView != null) {
                C786410Ut5.LJZI(8, imageView);
                return;
            }
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LL.l;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null) {
            C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3, 8);
        }
        ImageView imageView2 = this.LL.m;
        if (imageView2 != null) {
            C786410Ut5.LJZI(0, imageView2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MiniGameFragment@6eb9.triggerVConsolePageShow$1$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniGameFragment@6eb9.triggerVConsolePageShow$1$1");
    }
}
