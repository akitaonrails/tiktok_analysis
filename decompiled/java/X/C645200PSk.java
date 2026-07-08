package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0PSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C645200PSk extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Context context;
        C19EG c19egLIZIZ;
        if (motionEvent != null && motionEvent.getAction() == 0 && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C645960PVi c645960PVi = C645960PVi.LIZ;
            Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(this);
            c645960PVi.getClass();
            C645960PVi.LIZJ(this, fragmentLIZLLL, c19egLIZIZ);
            if (C07DY.LIZ()) {
                CopyOnWriteArrayList<CopyOnWriteArrayList<C646080PVu>> copyOnWriteArrayList = C646070PVt.LIZ;
                C646070PVt.LJII(this, C651580Ph6.LIZLLL(this));
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C645200PSk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public C645200PSk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
