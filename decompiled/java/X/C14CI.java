package X;

import Y.ARunnableS99S0200000_30;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14CI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14CI implements C0LFL, InterfaceC1141530foN {
    public static final Set<Integer> LLIZLLLIL = new LinkedHashSet();
    public final LifecycleOwner LL;
    public final FrameLayout LLILLJJLI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILLL;
    public boolean LLILZ;
    public Boolean LLILZIL;
    public boolean LLILZLL;
    public ViewTreeObserverOnGlobalLayoutListenerC20307714d9 LLIZ;

    public final void LIZIZ() {
        ViewTreeObserverOnGlobalLayoutListenerC20307714d9 viewTreeObserverOnGlobalLayoutListenerC20307714d9 = this.LLIZ;
        if (viewTreeObserverOnGlobalLayoutListenerC20307714d9 != null) {
            C786410Ut5.C3(this.LLILLJJLI.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC20307714d9);
        }
        this.LLIZ = null;
    }

    @Override // X.C0LFL
    public final void LIZ(boolean z) {
        this.LLILZIL = Boolean.valueOf(z);
        if (!this.LLILZ) {
            return;
        }
        LIZJ(z);
    }

    public final void LIZJ(boolean z) {
        InterfaceC1541990qEH kitView;
        InterfaceC1541990qEH kitView2;
        if (z) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView2.LIZ("ec_recorder_start", null);
                return;
            }
            return;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLILLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView()) == null) {
            return;
        }
        kitView.LIZ("ec_recorder_stop", null);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "ec_teleprompter_loaded")) {
            this.LLILZ = true;
            if (!this.LLILZLL) {
                if (this.LLILLJJLI.findViewWithTag("record_album_panel_container") != null) {
                    if (this.LLIZ == null) {
                        ViewTreeObserverOnGlobalLayoutListenerC20307714d9 viewTreeObserverOnGlobalLayoutListenerC20307714d9 = new ViewTreeObserverOnGlobalLayoutListenerC20307714d9(this, 1);
                        this.LLIZ = viewTreeObserverOnGlobalLayoutListenerC20307714d9;
                        C786410Ut5.x3(this.LLILLJJLI.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC20307714d9);
                        return;
                    }
                    return;
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
                    return;
                }
                HandlerHook.viewPostDelay(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new ARunnableS99S0200000_30(this, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 7), 300L);
            }
        }
    }

    public C14CI(LifecycleOwner lifecycleOwner, FrameLayout frameLayout, String str, String str2) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = frameLayout;
    }
}
