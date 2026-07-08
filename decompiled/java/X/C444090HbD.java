package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0HbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C444090HbD<DATA> extends RecyclerView.ViewHolder {
    public void I5(int i, Object obj) {
    }

    public void N5() {
    }

    public void L5() {
        this.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: X.0HbF
            public final /* synthetic */ float LL = 0.5f;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1 && action != 3) {
                        return false;
                    }
                    C444130HbH.LIZ(this.LL, view, false);
                    return false;
                }
                C444130HbH.LIZ(this.LL, view, true);
                return false;
            }
        });
    }

    public C444090HbD(View view) {
        super(view);
        N5();
        L5();
    }
}
