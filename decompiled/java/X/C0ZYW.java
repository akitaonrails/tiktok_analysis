package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ZYW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZYW extends CardView {
    public C0ZYW(Context context) {
        int iIntValue;
        super(context, null, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(176)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)));
        layoutParams.gravity = 17;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setRadius(C0I73.LIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        setCardBackgroundColor(iIntValue);
    }
}
