package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386650FDz extends RecyclerView.ViewHolder {
    public final View LL;
    public final C383710F2r LLILLJJLI;
    public final View LLILLL;
    public final TuxIconView LLILZ;
    public final C19671011xk LLILZIL;

    public C386650FDz(View view, Drawable drawable, int i, Drawable drawable2, Integer num) {
        super(view);
        this.LL = view;
        C383710F2r c383710F2r = (C383710F2r) view.findViewById(R.id.k1_);
        c383710F2r.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        if (num != null) {
            c383710F2r.setBGColor(num.intValue());
        }
        this.LLILLJJLI = c383710F2r;
        View viewFindViewById = view.findViewById(R.id.c96);
        viewFindViewById.setBackground(drawable2);
        this.LLILLL = viewFindViewById;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.tep);
        tuxIconView.setBackground(drawable);
        this.LLILZ = tuxIconView;
        C19671011xk c19671011xk = (C19671011xk) view.findViewById(R.id.lns);
        c19671011xk.setBackgroundPaintColor(i);
        this.LLILZIL = c19671011xk;
    }
}
