package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0dDH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041650dDH {
    public final View LIZ;
    public final TextView LIZIZ;
    public ViewGroup LIZJ;

    public C1041650dDH(Context context) {
        View viewSd = C786410Ut5.Sd(R.layout.d9v, C786410Ut5.ne(context), null);
        this.LIZIZ = (TextView) viewSd.findViewById(R.id.zf0);
        View viewFindViewById = viewSd.findViewById(R.id.tp_);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(R.drawable.fhv);
        }
        this.LIZ = viewSd;
    }
}
