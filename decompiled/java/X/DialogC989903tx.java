package X;

import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03tx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogC989903tx extends DialogC19728412Gs {
    public boolean LL;

    public DialogC989903tx(C19EG c19eg) {
        super(new C1361400lX0(c19eg, C987503tZ.LIZ(c19eg, true)));
        setCanceledOnTouchOutside(false);
        boolean z = this.LL;
        this.LL = z;
        if (z) {
            Window window = getWindow();
            if (window != null) {
                window.setDimAmount(0.5f);
            }
        } else {
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setDimAmount(0.0f);
            }
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(R.layout.ann);
        findViewById(R.id.tqz);
    }
}
