package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.09nv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2481309nv {
    public final Toast LIZ;

    public C2481309nv(Context context, int i, String str) {
        Toast toast = new Toast(context);
        this.LIZ = toast;
        View viewSd = C786410Ut5.Sd(R.layout.f75, (LayoutInflater) C786410Ut5.H2(context, "layout_inflater"), null);
        ((TextView) viewSd.findViewById(R.id.o8v)).setText(str);
        toast.setView(viewSd);
        toast.setGravity(55, 0, 0);
        toast.setDuration(i);
    }
}
