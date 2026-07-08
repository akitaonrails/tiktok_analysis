package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0z6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883180z6a extends LinearLayout {
    public final C01GW LL;

    private final CopyOnWriteArrayList<View.OnTouchListener> getCustomTouchListeners() {
        return (CopyOnWriteArrayList) this.LL.getValue();
    }

    public final void LIZIZ() {
        getCustomTouchListeners().clear();
    }

    public C1883180z6a(Context context) {
        super(context, null, 0, 0);
        this.LL = C452501pT.LIZIZ(new C1883190z6b());
    }

    public final void LIZ(ViewOnTouchListenerC1883620z7I viewOnTouchListenerC1883620z7I) {
        getCustomTouchListeners().add(viewOnTouchListenerC1883620z7I);
    }

    public final void LIZJ(View.OnTouchListener onTouchListener) {
        getCustomTouchListeners().remove(onTouchListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Iterator<View.OnTouchListener> it2 = getCustomTouchListeners().iterator();
        while (it2.hasNext()) {
            it2.next().onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
