package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0kR9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1319330kR9 extends AndroidView {
    public boolean LL;

    public final boolean getHandleGesture() {
        return this.LL;
    }

    public C1319330kR9(Context context) {
        new LinkedHashMap();
        super(context);
    }

    @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (motionEvent.getActionMasked() == 0 && this.LL && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setHandleGesture(boolean z) {
        this.LL = z;
    }
}
