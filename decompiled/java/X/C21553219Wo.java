package X;

import Y.ARunnableS41S0400000_33;
import android.os.SystemClock;
import android.view.MenuItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19Wo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21553219Wo implements C19X6 {
    public final /* synthetic */ ViewOnKeyListenerC21552919Wl LL;

    public C21553219Wo(ViewOnKeyListenerC21552919Wl viewOnKeyListenerC21552919Wl) {
        this.LL = viewOnKeyListenerC21552919Wl;
    }

    @Override // X.C19X6
    public final void LIZ(C19V6 c19v6, C21548219Uq c21548219Uq) {
        C19X2 c19x2 = null;
        this.LL.LLIZ.removeCallbacksAndMessages(null);
        int size = ((ArrayList) this.LL.LLJ).size();
        for (int i = 0; i < size; i++) {
            if (c19v6 == ((C19X2) ListProtector.get(this.LL.LLJ, i)).LIZIZ) {
                if (i != -1) {
                    int i2 = i + 1;
                    if (i2 < ((ArrayList) this.LL.LLJ).size()) {
                        c19x2 = (C19X2) ListProtector.get(this.LL.LLJ, i2);
                    }
                    C786410Ut5.LJLIIIL(this.LL.LLIZ, new ARunnableS41S0400000_33(this, c19x2, c21548219Uq, c19v6, 0), c19v6, SystemClock.uptimeMillis() + 200);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.C19X6
    public final void LIZIZ(C19V6 c19v6, MenuItem menuItem) {
        this.LL.LLIZ.removeCallbacksAndMessages(c19v6);
    }
}
