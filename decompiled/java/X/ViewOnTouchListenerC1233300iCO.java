package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0iCO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class ViewOnTouchListenerC1233300iCO implements View.OnTouchListener {
    public final List<View.OnTouchListener> LL = new ArrayList();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Iterator it2 = ((ArrayList) this.LL).iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (((View.OnTouchListener) it2.next()).onTouch(view, motionEvent)) {
                z = true;
            }
        }
        return z;
    }
}
