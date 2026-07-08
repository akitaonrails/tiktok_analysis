package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: X.0uGN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697050uGN {
    public static void LIZ(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1697060uGO.LIZ(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC1697040uGM viewOnLongClickListenerC1697040uGM = ViewOnLongClickListenerC1697040uGM.LLJIJIL;
        if (viewOnLongClickListenerC1697040uGM != null && viewOnLongClickListenerC1697040uGM.LL == view) {
            ViewOnLongClickListenerC1697040uGM.LIZIZ(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            ViewOnLongClickListenerC1697040uGM viewOnLongClickListenerC1697040uGM2 = ViewOnLongClickListenerC1697040uGM.LLJILJIL;
            if (viewOnLongClickListenerC1697040uGM2 != null && viewOnLongClickListenerC1697040uGM2.LL == view) {
                viewOnLongClickListenerC1697040uGM2.LIZ();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ViewOnLongClickListenerC1697040uGM(view, charSequence);
    }
}
