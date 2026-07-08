package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EJW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EJW extends RecyclerView.ViewHolder {
    public final C0EJV LL;

    public C0EJW(View view) {
        super(view);
        C0EJV c0ejv = (C0EJV) view.findViewById(R.id.jt3);
        this.LL = c0ejv;
        View viewFindViewById = view.findViewById(R.id.jt4);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        float fLIZIZ = C418440Gaw.LIZIZ(3);
        float fLIZIZ2 = C418440Gaw.LIZIZ(3);
        c0ejv.LLILZIL = fLIZIZ;
        c0ejv.LLILZLL = fLIZIZ2;
        c0ejv.invalidate();
        C426750GoL.LJIIIZ(c0ejv, null, 0, null, 0, false, 21);
        C0EJV c0ejv2 = this.LL;
        ViewGroup.LayoutParams layoutParams = c0ejv2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            C786410Ut5.W5(c0ejv2, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
