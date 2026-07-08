package X;

import Y.ARunnableS99S0200000_30;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.14d9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC20307714d9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC20307714d9 viewTreeObserverOnGlobalLayoutListenerC20307714d9) {
        ((AndroidComposeView) viewTreeObserverOnGlobalLayoutListenerC20307714d9.l0).LJJJJZ();
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC20307714d9 viewTreeObserverOnGlobalLayoutListenerC20307714d9) {
        C14CI c14ci = (C14CI) viewTreeObserverOnGlobalLayoutListenerC20307714d9.l0;
        if (c14ci.LLILZLL) {
            c14ci.LIZIZ();
            return;
        }
        if (c14ci.LLILLJJLI.findViewWithTag("record_album_panel_container") == null) {
            ((C14CI) viewTreeObserverOnGlobalLayoutListenerC20307714d9.l0).LIZIZ();
            C14CI c14ci2 = (C14CI) viewTreeObserverOnGlobalLayoutListenerC20307714d9.l0;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c14ci2.LLILLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                HandlerHook.viewPostDelay(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new ARunnableS99S0200000_30(c14ci2, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 7), 300L);
            }
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC20307714d9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
