package X;

import android.view.ViewTreeObserver;
import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: renamed from: X.0qYI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class ViewTreeObserverOnPreDrawListenerC1554400qYI implements ViewTreeObserver.OnPreDrawListener {
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

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC1554400qYI viewTreeObserverOnPreDrawListenerC1554400qYI) {
        SparkContext sparkContext;
        InterfaceC1538940q9M interfaceC1538940q9M;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) viewTreeObserverOnPreDrawListenerC1554400qYI.l0;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLILZIL != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLILZLL) != null && (interfaceC1538940q9M = (InterfaceC1538940q9M) sparkContext.LJFF(InterfaceC1538940q9M.class)) != null) {
            interfaceC1538940q9M.LIZ();
            return true;
        }
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC1554400qYI viewTreeObserverOnPreDrawListenerC1554400qYI) {
        ((C1474100oSm) viewTreeObserverOnPreDrawListenerC1554400qYI.l0).LJII("from_pre_draw");
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC1554400qYI(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
