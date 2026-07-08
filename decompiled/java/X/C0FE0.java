package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FE0, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FE0 extends RecyclerView.ViewHolder {
    public final View LL;
    public final View LLILLJJLI;
    public final TuxTextView LLILLL;
    public final View LLILZ;
    public final TuxIconView LLILZIL;

    public C0FE0(View view, Drawable drawable, Drawable drawable2, TuxIconDrawable tuxIconDrawable) {
        super(view);
        this.LL = view;
        View viewFindViewById = view.findViewById(R.id.c96);
        viewFindViewById.setBackground(drawable2);
        this.LLILLJJLI = viewFindViewById;
        this.LLILLL = (TuxTextView) view.findViewById(R.id.zji);
        View viewFindViewById2 = view.findViewById(R.id.l2t);
        viewFindViewById2.setBackground(drawable);
        this.LLILZ = viewFindViewById2;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.k09);
        tuxIconView.setImageDrawable(tuxIconDrawable);
        this.LLILZIL = tuxIconView;
    }
}
