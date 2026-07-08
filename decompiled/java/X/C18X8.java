package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.18X8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18X8 extends C21299118Wv implements C18W3 {
    public final C18X9 LLJZ;

    @Override // X.C18W3
    public final void LIZ(C18XA c18xa) {
        this.LLJZ.LIZ(c18xa);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Iterator it2 = ((ArrayList) this.LLJZ.LL).iterator();
        while (it2.hasNext()) {
            ((C18XA) it2.next()).onTouchEvent(motionEvent);
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!zDispatchTouchEvent) {
            Iterator it3 = ((ArrayList) this.LLJZ.LL).iterator();
            while (it3.hasNext()) {
                ((C18XA) it3.next()).LIZ(motionEvent);
            }
        }
        return zDispatchTouchEvent;
    }

    public C18X8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJZ = new C18X9();
    }
}
