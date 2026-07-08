package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0QxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687070QxF extends FrameLayout {
    public List<InterfaceC687110QxJ> LL;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("onTouchEvent");
        List<InterfaceC687110QxJ> list = this.LL;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((InterfaceC687110QxJ) it2.next()).LIZ();
            }
            return false;
        }
        return false;
    }

    public C687070QxF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
