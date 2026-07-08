package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1CzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248351CzJ {
    public final View LIZ;
    public final View LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public final FrameLayout.LayoutParams LJFF;
    public int LJI;
    public boolean LJII = true;

    public C2248351CzJ(Fragment fragment) {
        View view = fragment.getView();
        if (view == null) {
            return;
        }
        this.LIZIZ = view.getRootView().findViewById(R.id.eqx);
        this.LIZ = view;
        C786410Ut5.x3(view.getViewTreeObserver(), new C1D16(this, 0));
        this.LJFF = (FrameLayout.LayoutParams) view.getLayoutParams();
    }
}
