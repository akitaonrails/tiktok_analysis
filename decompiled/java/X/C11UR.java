package X;

import Y.ACListenerS131S0200000_29;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;
import mf.a;

/* JADX INFO: renamed from: X.11UR, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11UR extends RecyclerView.ViewHolder {
    public final C1662870tNF LL;
    public final ImageView LLILLJJLI;
    public C11US LLILLL;
    public final C01GW LLILZ;
    public final /* synthetic */ C11UQ LLILZIL;

    public final void I5() {
        ((ValueAnimator) this.LLILZ.getValue()).cancel();
        C786410Ut5.Cb(this.LLILLJJLI, 0.0f);
        this.LLILLJJLI.setImageResource(R.drawable.byl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11UR(C11UQ c11uq, View view) {
        super(view);
        this.LLILZIL = c11uq;
        C1662870tNF c1662870tNF = (C1662870tNF) view.findViewById(R.id.lge);
        this.LL = c1662870tNF;
        this.LLILLJJLI = (ImageView) view.findViewById(R.id.lgd);
        this.LLILLL = C11US.NOT_DOWNLOAD;
        this.LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 798));
        View.OnClickListener aCListenerS131S0200000_29 = new ACListenerS131S0200000_29(this, c11uq, 19);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS131S0200000_29) : aCListenerS131S0200000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1662870tNF);
        }
        c1662870tNF.setOnClickListener(aVar);
    }
}
