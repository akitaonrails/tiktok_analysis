package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0x7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807050x7n extends AbstractC1807100x7s<C1806640x78> {
    public final ViewGroup LL;
    public final C1806860x7U LLILLJJLI;
    public final Drawable LLILLL;
    public final Drawable LLILZ;
    public final Drawable LLILZIL;

    public C1807050x7n(ViewGroup viewGroup, C1806860x7U c1806860x7U) {
        super(R.layout.hkp, viewGroup);
        this.LL = viewGroup;
        this.LLILLJJLI = c1806860x7U;
        Drawable drawableLIZIZ = C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.er4);
        Drawable drawable = null;
        if (drawableLIZIZ != null) {
            int i = C1807210x83.LIZ;
            int i2 = C1807210x83.LIZ;
            drawableLIZIZ.setBounds(0, 0, i2, i2);
            drawableLIZIZ.setTint(C20736316Cj.LIZIZ(R.attr.ewy, this.itemView.getContext()));
        } else {
            drawableLIZIZ = null;
        }
        this.LLILLL = drawableLIZIZ;
        Drawable drawableLIZIZ2 = C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.er5);
        if (drawableLIZIZ2 != null) {
            int i3 = C1807210x83.LIZ;
            int i4 = C1807210x83.LIZ;
            drawableLIZIZ2.setBounds(0, 0, i4, i4);
            drawableLIZIZ2.setTint(C20736316Cj.LIZIZ(R.attr.ewy, this.itemView.getContext()));
        } else {
            drawableLIZIZ2 = null;
        }
        this.LLILZ = drawableLIZIZ2;
        Drawable drawableLIZIZ3 = C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.er6);
        if (drawableLIZIZ3 != null) {
            int i5 = C1807210x83.LIZ;
            int i6 = C1807210x83.LIZIZ;
            drawableLIZIZ3.setBounds(0, 0, i6, i6);
            drawableLIZIZ3.setTint(C20736316Cj.LIZIZ(R.attr.ewy, this.itemView.getContext()));
            drawable = drawableLIZIZ3;
        }
        this.LLILZIL = drawable;
    }
}
