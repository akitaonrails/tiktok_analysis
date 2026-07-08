package X;

import Y.ACListenerS131S0200000_29;
import Y.ATListenerS348S0200000_29;
import android.animation.ObjectAnimator;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.112X, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C112X extends RecyclerView.ViewHolder {
    public final C424190GkD LL;
    public final C19471411Fw LLILLJJLI;
    public final C1324800kZy LLILLL;
    public final ImageView LLILZ;
    public ObjectAnimator LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C112W LLIZ;

    public final void I5() {
        ObjectAnimator objectAnimator = this.LLILZIL;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.LLILZIL.cancel();
        }
        C424190GkD c424190GkD = this.LL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424190GkD);
        c424190GkD.setRotation(0.0f);
        this.LL.setImageResource(R.drawable.a_y);
    }

    public final void L5(boolean z) {
        int i;
        if (!z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.LLILLL.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            i = R.color.bh;
        } else {
            this.LLILLL.setColorFilter((ColorFilter) null);
            i = R.color.f569bc;
        }
        C19471411Fw c19471411Fw = this.LLILLJJLI;
        c19471411Fw.setTextColor(c19471411Fw.getResources().getColor(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C112X(C112W c112w, View view) {
        super(view);
        this.LLIZ = c112w;
        this.LLILZLL = 1;
        C1324800kZy c1324800kZy = (C1324800kZy) view.findViewById(R.id.w65);
        this.LLILLL = c1324800kZy;
        c1324800kZy.LLJILJIL = true;
        if (C0F4Z.LIZ()) {
            c1324800kZy.setRectFRadius(C12ES.LIZJ(8.0f, c1324800kZy.getContext()));
            int i = C1324800kZy.LLJILLL;
            c1324800kZy.setClipStyle(1);
        }
        C19471411Fw c19471411Fw = (C19471411Fw) view.findViewById(R.id.w7k);
        this.LLILLJJLI = c19471411Fw;
        c19471411Fw.LJJJI();
        c19471411Fw.setHorizontalFadingEdgeEnabled(true);
        c19471411Fw.setFadingEdgeLength((int) C12ES.LIZJ(4.0f, c19471411Fw.getContext()));
        this.LL = (C424190GkD) view.findViewById(R.id.lfk);
        this.LLILZ = (ImageView) view.findViewById(R.id.lfb);
        c1324800kZy.setOnTouchListener(new ATListenerS348S0200000_29(this, view, 1));
        C786410Ut5.Ka(c1324800kZy, new ACListenerS131S0200000_29(this, view, 8));
    }
}
