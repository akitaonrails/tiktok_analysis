package X;

import Y.ACListenerS140S0100000_5;
import Y.ATListenerS439S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388050FJj extends AbstractC388060FJk {
    public final boolean LLILZLL;
    public final AppCompatImageView LLIZ;
    public final View LLIZLLLIL;
    public C388080FJm LLJ;

    @Override // X.AbstractC388060FJk
    public final C388080FJm L5() {
        return this.LLJ;
    }

    @Override // X.AbstractC388060FJk
    public final void I5(C388080FJm c388080FJm) {
        int i;
        this.LLJ = c388080FJm;
        if (this.LLILZLL) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (C387980FJc.LIZ(this.itemView.getContext())) {
                i = AbstractC388060FJk.LLILLL;
            } else {
                i = AbstractC388060FJk.LLILZ;
            }
            layoutParams.height = i;
        }
        if (C387980FJc.LIZ(this.itemView.getContext())) {
            ViewGroup.LayoutParams layoutParams2 = this.LLIZ.getLayoutParams();
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            C426750GoL.LJIIIZ(this.LLIZ, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, false, 29);
            C426750GoL.LJIIIZ(this.LLIZLLLIL, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13))), null, null, false, 29);
        }
        C337180DJs.LIZJ(this.LLIZ);
        this.itemView.setOnTouchListener(new ATListenerS439S0100000_5(this, 10));
        C786410Ut5.I7(new ACListenerS140S0100000_5(this, 161), this.itemView);
        View view = this.LLIZLLLIL;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
        c384050F3z.LIZJ = Float.valueOf(C1919207fS.LJI());
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        if (((C388020FJg) this.LLJ).LJIIJJI) {
            C337180DJs.LIZJ(this.LLIZLLLIL);
        } else {
            C337180DJs.LIZ(this.LLIZLLLIL);
        }
    }

    public C388050FJj(FrameLayout frameLayout, boolean z, InterfaceC388110FJp interfaceC388110FJp) {
        super(frameLayout, interfaceC388110FJp);
        this.LLILZLL = z;
        this.LLIZ = (AppCompatImageView) frameLayout.findViewById(R.id.e8h);
        this.LLIZLLLIL = frameLayout.findViewById(R.id.e8i);
        this.LLJ = new C388080FJm(0, 0, 0, false, 0, 0, 0, 2047);
    }
}
