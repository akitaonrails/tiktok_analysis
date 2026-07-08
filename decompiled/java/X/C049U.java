package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.049U, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C049U extends View {
    public static final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
    public static final int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));

    public C049U(Context context) {
        super(context, null, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LL, LLILLJJLI);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C0H9H.LJ(LLILLL, this);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zk, context);
        if (numLIZJ != null) {
            setBackgroundColor(numLIZJ.intValue());
        }
    }
}
