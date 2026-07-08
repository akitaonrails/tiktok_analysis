package X;

import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JSI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JSI {
    public static final /* synthetic */ int LJ = 0;
    public final View.OnClickListener LIZ;
    public final C16FZ LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;

    public C0JSI(Context context, ACListenerS142S0100000_7 aCListenerS142S0100000_7) {
        this.LIZ = aCListenerS142S0100000_7;
        this.LIZIZ = new C16FZ(context, null);
        View viewSd = C786410Ut5.Sd(R.layout.gxn, C786410Ut5.ne(context), null);
        if (viewSd != null) {
            C786410Ut5.I7(aCListenerS142S0100000_7, viewSd);
        }
        this.LIZJ = viewSd;
        View viewSd2 = C786410Ut5.Sd(R.layout.gxm, C786410Ut5.ne(context), null);
        if (viewSd2 != null) {
            C786410Ut5.I7(aCListenerS142S0100000_7, viewSd2);
        }
        this.LIZLLL = viewSd2;
    }
}
