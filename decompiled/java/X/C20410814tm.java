package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14tm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20410814tm extends AbstractC960470b6L<C20410414ti> {
    public final InterfaceC20410614tk LL;
    public final TextView LLILLJJLI;

    public C20410814tm(C20743416Fc c20743416Fc, InterfaceC20410614tk interfaceC20410614tk) {
        super(c20743416Fc);
        this.LL = interfaceC20410614tk;
        this.LLILLJJLI = c20743416Fc;
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        int i2;
        final C20410414ti c20410414ti = (C20410414ti) obj;
        if (C960203pA.LIZIZ(this.itemView.getContext())) {
            TextView textView = this.LLILLJJLI;
            if (textView != null) {
                textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, this.itemView.getContext()));
            }
        } else {
            TextView textView2 = this.LLILLJJLI;
            if (textView2 != null) {
                textView2.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, this.itemView.getContext()));
            }
        }
        Context context = this.itemView.getContext();
        if (C960203pA.LIZIZ(this.itemView.getContext())) {
            i2 = R.drawable.e3a;
        } else {
            i2 = R.drawable.e3b;
        }
        Drawable drawable = context.getDrawable(i2);
        if (drawable instanceof GradientDrawable) {
            if (c20410414ti.LIZIZ) {
                if (C960203pA.LIZIZ(this.itemView.getContext())) {
                    ((GradientDrawable) drawable).setStroke(C439101nJ.LIZ(1), C20736316Cj.LIZIZ(R.attr.ewy, this.itemView.getContext()));
                } else {
                    ((GradientDrawable) drawable).setStroke(C439101nJ.LIZ(1), C20736316Cj.LIZIZ(R.attr.ey7, this.itemView.getContext()));
                }
            } else if (C960203pA.LIZIZ(this.itemView.getContext())) {
                ((GradientDrawable) drawable).setStroke(C439101nJ.LIZ(1), C20736316Cj.LIZIZ(R.attr.esa, this.itemView.getContext()));
            } else {
                ((GradientDrawable) drawable).setStroke(C439101nJ.LIZ(1), C20736316Cj.LIZIZ(R.attr.ey9, this.itemView.getContext()));
            }
        }
        TextView textView3 = this.LLILLJJLI;
        if (textView3 != null) {
            textView3.setBackground(drawable);
        }
        TextView textView4 = this.LLILLJJLI;
        if (textView4 != null) {
            textView4.setText(c20410414ti.LIZ.LIZIZ);
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.14tl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20410414ti c20410414ti2 = c20410414ti;
                if (c20410414ti2.LIZIZ) {
                    return;
                }
                this.LL.Y7(c20410414ti2);
            }
        }, this.itemView);
    }
}
