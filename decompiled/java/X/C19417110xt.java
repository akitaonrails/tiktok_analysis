package X;

import Y.AUListenerS231S0200000_29;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.10xt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19417110xt extends RecyclerView.ViewHolder {
    public final View LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C19670811xi LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public VoiceCloneReadTextEffectBean LLJILJIL;
    public InterfaceC19417310xv LLJILJILJ;
    public final C01GW LLJILLL;

    public final boolean L5() {
        return ((Boolean) this.LLJILLL.getValue()).booleanValue();
    }

    public C19417110xt(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.vop_item_img_view);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.vop_item_text_view);
        this.LLILZ = (C19670811xi) view.findViewById(R.id.vop_item_loading_v2);
        this.LLILZIL = view.findViewById(R.id.vop_item_selected_view);
        this.LLILZLL = view.findViewById(R.id.c9c);
        this.LLIZ = view.findViewById(R.id.ii4);
        this.LLIZLLLIL = view.findViewById(R.id.vop_item_plus_view);
        this.LLJ = -1;
        this.LLJILLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(378));
    }

    public final void N5(boolean z) {
        this.LLJI = z;
        int i = 0;
        if (L5()) {
            if (z) {
                View view = this.LLIZ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                View view2 = this.LLILZLL;
                if (view2 != null) {
                    int iLIZ = C960203pA.LIZ(R.attr.ee, this.LL.getContext());
                    Drawable drawable = view2.getContext().getDrawable(R.drawable.a9q);
                    ((GradientDrawable) drawable).setStroke((int) C12ES.LIZJ(2.0f, view2.getContext()), iLIZ);
                    view2.setBackground(drawable);
                    return;
                }
                return;
            }
            View view3 = this.LLIZ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            View view4 = this.LLILZLL;
            if (view4 == null) {
                return;
            }
            view4.setBackground(null);
            return;
        }
        View view5 = this.LLILZIL;
        if (!z) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view5);
    }

    public final void I5(int i, boolean z) {
        this.LLJ = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                } else {
                    C786410Ut5.G1(this.LLILZ, 0);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 80.0f);
                    valueAnimatorOfFloat.setDuration(300L);
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS231S0200000_29(valueAnimatorOfFloat, this, 6));
                    valueAnimatorOfFloat.start();
                    return;
                }
            } else {
                this.LLILZ.setProgressIfCircle(100.0f);
                C786410Ut5.G1(this.LLILZ, 8);
                if (!z) {
                    return;
                }
                N5(true);
                return;
            }
        }
        this.LLILZ.setProgressIfCircle(100.0f);
        C786410Ut5.G1(this.LLILZ, 8);
    }
}
