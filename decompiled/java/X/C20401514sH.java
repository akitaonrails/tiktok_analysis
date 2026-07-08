package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14sH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20401514sH extends AbstractC960470b6L<C20406414t4> {
    public final InterfaceC20406914t9 LL;
    public final TextView LLILLJJLI;

    public C20401514sH(View view, InterfaceC20406914t9 interfaceC20406914t9) {
        super(view);
        this.LL = interfaceC20406914t9;
        this.LLILLJJLI = (TextView) view.findViewById(R.id.tv_tag);
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        final C20406414t4 c20406414t4 = (C20406414t4) obj;
        this.LLILLJJLI.setText(c20406414t4.LIZ.tagTranslatedName);
        if (c20406414t4.LIZIZ) {
            this.LLILLJJLI.setBackgroundResource(R.drawable.f4u);
            TextView textView = this.LLILLJJLI;
            textView.setTextColor(C20736316Cj.LIZJ(R.attr.eyv, textView));
        } else {
            this.LLILLJJLI.setBackgroundResource(R.drawable.f4v);
            TextView textView2 = this.LLILLJJLI;
            textView2.setTextColor(C20736316Cj.LIZJ(R.attr.ezs, textView2));
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.14sb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20406414t4 c20406414t42 = c20406414t4;
                if (c20406414t42.LIZIZ) {
                    return;
                }
                this.LL.LIZ(c20406414t42.LIZ);
            }
        }, this.itemView);
    }
}
