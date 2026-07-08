package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380770EwN extends RecyclerView.ViewHolder {
    public final C383710F2r LL;
    public final TuxIconView LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final C19671011xk LLILZIL;
    public final View LLILZLL;

    public C380770EwN(Context context, View view) {
        Integer numLIZJ;
        super(view);
        C383710F2r c383710F2r = (C383710F2r) view.findViewById(R.id.l1s);
        int iLIZ = C0EGL.LIZ();
        Context context2 = c383710F2r.getContext();
        if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(iLIZ, context2)) != null) {
            c383710F2r.setBGColor(numLIZJ.intValue());
        }
        c383710F2r.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        this.LL = c383710F2r;
        this.LLILLJJLI = (TuxIconView) view.findViewById(R.id.l2a);
        this.LLILLL = view.findViewById(R.id.ulz);
        View viewFindViewById = view.findViewById(R.id.l2t);
        this.LLILZ = viewFindViewById;
        C19671011xk c19671011xk = (C19671011xk) view.findViewById(R.id.l2r);
        this.LLILZIL = c19671011xk;
        this.LLILZLL = view.findViewById(R.id.l3g);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zc, context);
        if (numLIZJ2 != null) {
            c19671011xk.setBackgroundPaintColor(numLIZJ2.intValue());
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zc);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        viewFindViewById.setBackground(c384050F3z.LIZ(context));
    }
}
