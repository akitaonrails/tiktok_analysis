package X;

import Y.ACListenerS163S0100000_29;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.112V, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C112V extends RecyclerView.ViewHolder {
    public final C19470511Fn LL;
    public final C424190GkD LLILLJJLI;
    public ObjectAnimator LLILLL;
    public final ImageView LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C112U LLILZLL;

    public final void I5() {
        ObjectAnimator objectAnimator = this.LLILLL;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.LLILLL.cancel();
        }
        C424190GkD c424190GkD = this.LLILLJJLI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424190GkD);
        c424190GkD.setRotation(0.0f);
        this.LLILLJJLI.setImageResource(R.drawable.a_y);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C112V(C112U c112u, View view) {
        super(view);
        this.LLILZLL = c112u;
        this.LLILZIL = 1;
        C19470511Fn c19470511Fn = (C19470511Fn) view.findViewById(R.id.w65);
        this.LL = c19470511Fn;
        this.LLILLJJLI = (C424190GkD) view.findViewById(R.id.lfk);
        this.LLILZ = (ImageView) view.findViewById(R.id.lfb);
        View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 44);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS163S0100000_29) : aCListenerS163S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c19470511Fn);
        }
        c19470511Fn.setOnClickListener(aVar);
        c19470511Fn.setOnTouchListener(new ViewOnTouchListenerC1657570tEh(1.1f, 100L, c19470511Fn));
    }
}
