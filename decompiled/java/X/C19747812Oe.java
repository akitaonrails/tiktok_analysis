package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.12Oe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19747812Oe extends TouchDelegate {
    public final ArrayList<Rect> LIZ;
    public final ArrayList<TouchDelegate> LIZIZ;
    public TouchDelegate LIZJ;

    public C19747812Oe(View view) {
        super(new Rect(), view);
        this.LIZ = new ArrayList<>();
        this.LIZIZ = new ArrayList<>();
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.LIZJ = null;
            int size = this.LIZ.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (((Rect) ListProtector.get(this.LIZ, i)).contains(x, y)) {
                    this.LIZJ = (TouchDelegate) ListProtector.get(this.LIZIZ, i);
                    break;
                }
                i++;
            }
        }
        TouchDelegate touchDelegate = this.LIZJ;
        if (touchDelegate == null) {
            return false;
        }
        return touchDelegate.onTouchEvent(motionEvent);
    }
}
