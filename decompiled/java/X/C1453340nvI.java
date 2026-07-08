package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0nvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453340nvI extends RecyclerView.ViewHolder {
    public final boolean LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;

    public final void I5(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLILLJJLI;
            tuxIconView.setTintColorRes(R.attr.a0o);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a00);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
            tuxIconView.setBackground(c384050F3z.LIZ(tuxIconView.getContext()));
            return;
        }
        TuxIconView tuxIconView2 = this.LLILLJJLI;
        tuxIconView2.setTintColorRes(R.attr.a00);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        Drawable drawableLIZ = c384050F3z2.LIZ(tuxIconView2.getContext());
        drawableLIZ.setAlpha(128);
        tuxIconView2.setBackground(drawableLIZ);
    }

    public C1453340nvI(View view, boolean z) {
        int i;
        int i2;
        super(view);
        this.LL = z;
        this.LLILLJJLI = (TuxIconView) view.findViewById(R.id.ai0);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.ai1);
        this.LLILZ = view.findViewById(R.id.g39);
        this.LLILZIL = view.findViewById(R.id.moq);
        int iLIZ = C0F39.LIZ();
        float f = iLIZ;
        this.LLILZLL = (int) Math.floor(0.14f * f);
        if (iLIZ >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(375))) {
            i = 28;
        } else {
            i = 24;
        }
        this.LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        if (iLIZ >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(375))) {
            i2 = 71;
        } else {
            i2 = 91;
        }
        this.LLIZLLLIL = i2;
        this.LLJ = (int) Math.ceil(f * 0.18f);
    }
}
