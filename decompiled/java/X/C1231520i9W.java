package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0i9W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231520i9W {
    public static C0P0T LIZ;

    public static void LIZLLL() {
        C0P0T c0p0t = LIZ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    public static void LIZ(AbstractC1637470siH abstractC1637470siH) {
        abstractC1637470siH.itemView.setLongClickable(true);
        abstractC1637470siH.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1265920j30(abstractC1637470siH, 6));
    }

    public static void LIZIZ(AbstractC1637470siH abstractC1637470siH) {
        if (abstractC1637470siH.itemView.isLongClickable()) {
            abstractC1637470siH.itemView.setLongClickable(false);
        }
        abstractC1637470siH.itemView.setOnLongClickListener(null);
    }

    public static Integer LIZJ(int i, Context context) {
        return C1308910kAL.LIZJ(i, new ContextThemeWrapper(context, R.style.z4));
    }
}
