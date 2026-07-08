package X;

import Y.ACListenerS163S0100000_29;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11fE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19556211fE extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLJJ = 0;
    public final int LL;
    public final View LLILLJJLI;
    public final InterfaceC19556411fG LLILLL;
    public final C19552511ed LLILZ;
    public LinearLayout LLILZIL;
    public C19556311fF LLILZLL;
    public View LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public C197039127h LLJIJIL;
    public TuxIconView LLJILJIL;
    public C1295960jpS LLJILJILJ;
    public ObjectAnimator LLJILLL;

    public final C197039127h I5() {
        C197039127h c197039127h = this.LLJIJIL;
        if (c197039127h != null) {
            return c197039127h;
        }
        return null;
    }

    public final void L5(boolean z) {
        if (z) {
            if (I5().getVisibility() == 0) {
                return;
            }
            C786410Ut5.LLLLLLJ(I5(), 0);
            ObjectAnimator objectAnimator = this.LLJILLL;
            if (objectAnimator == null) {
                objectAnimator = null;
            }
            C786410Ut5.Pd(objectAnimator);
            return;
        }
        C786410Ut5.LLLLLLJ(I5(), 8);
    }

    public C19556211fE(int i, View view, InterfaceC19556411fG interfaceC19556411fG, C19552511ed c19552511ed) {
        super(view);
        this.LL = i;
        this.LLILLJJLI = view;
        this.LLILLL = interfaceC19556411fG;
        this.LLILZ = c19552511ed;
        this.LLIZ = view.findViewById(R.id.u3w);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.u3u);
        this.LLIZLLLIL = tuxIconView;
        (tuxIconView == null ? null : tuxIconView).setIconRes(R.raw.icon_music_note_single);
        this.LLJILJILJ = (C1295960jpS) view.findViewById(R.id.u3x);
        this.LLJ = (TuxTextView) view.findViewById(R.id.u3y);
        this.LLJI = (TuxTextView) view.findViewById(R.id.u3z);
        this.LLILZIL = (LinearLayout) view.findViewById(R.id.u3v);
        this.LLJIJIL = (C197039127h) view.findViewById(R.id.u40);
        C197039127h c197039127hI5 = I5();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
        c197039127hI5.setBackground(c384050F3z.LIZ(I5().getContext()));
        this.LLJILJIL = (TuxIconView) view.findViewById(R.id.u3t);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(I5(), "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.LLJILLL = objectAnimatorOfFloat;
        C786410Ut5.U8(I5(), new ACListenerS163S0100000_29(this, 151));
        TuxIconView tuxIconView2 = this.LLJILJIL;
        C786410Ut5.a9(tuxIconView2 == null ? null : tuxIconView2, new ACListenerS163S0100000_29(this, 152));
        if (C293810BfP.LIZ()) {
            TuxIconView tuxIconView3 = this.LLJILJIL;
            tuxIconView3 = tuxIconView3 == null ? null : tuxIconView3;
            ViewGroup.LayoutParams layoutParams = tuxIconView3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                C786410Ut5.W5(tuxIconView3, layoutParams);
                TuxIconView tuxIconView4 = this.LLJILJIL;
                C426750GoL.LJIIIZ(tuxIconView4 == null ? null : tuxIconView4, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
                TuxIconView tuxIconView5 = this.LLJILJIL;
                C426750GoL.LJIIL(tuxIconView5 == null ? null : tuxIconView5, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
                LinearLayout linearLayout = this.LLILZIL;
                if (linearLayout != null) {
                    C426750GoL.LJIIL(linearLayout, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))), null, 27);
                }
                C426750GoL.LJIIIZ(I5(), null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, false, 27);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        View view2 = this.LLIZ;
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 153), view2 != null ? view2 : null);
    }
}
