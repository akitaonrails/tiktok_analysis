package X;

import Y.ALAdapterS24S0100000_29;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.10uo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19398010uo extends RecyclerView.ViewHolder {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    public final RemoteImageView I5() {
        return (RemoteImageView) this.LLILLL.getValue();
    }

    public final void L5() {
        Drawable background = ((View) this.LLILZIL.getValue()).getBackground();
        if (((View) this.LLILZ.getValue()).getVisibility() == 8) {
            C786410Ut5.Pd(ObjectAnimator.ofArgb(this.LLILLJJLI.getValue(), "textColor", this.itemView.getResources().getColor(R.color.dg), this.itemView.getResources().getColor(R.color.f569bc)).setDuration(150L));
            C786410Ut5.Pd(ObjectAnimator.ofArgb(this.LL.getValue(), "textColor", this.itemView.getResources().getColor(R.color.da), this.itemView.getResources().getColor(R.color.f569bc)).setDuration(150L));
            C786410Ut5.Pd(ObjectAnimator.ofArgb(background, "color", 0, ColorProtector.parseColor(((View) this.LLILZIL.getValue()).getTag().toString())).setDuration(150L));
            C786410Ut5.LJZI(0, (ImageView) this.LLILZ.getValue());
            C786410Ut5.Pd(ObjectAnimator.ofFloat(this.LLILZ.getValue(), "alpha", 0.0f, 1.0f).setDuration(150L));
            ObjectAnimator duration = ObjectAnimator.ofFloat(I5(), "alpha", 1.0f, 0.0f).setDuration(150L);
            duration.addListener(new ALAdapterS24S0100000_29(this, 34));
            C786410Ut5.Pd(duration);
            return;
        }
        C786410Ut5.Pd(ObjectAnimator.ofArgb(this.LLILLJJLI.getValue(), "textColor", this.itemView.getResources().getColor(R.color.f569bc), this.itemView.getResources().getColor(R.color.dg)).setDuration(150L));
        C786410Ut5.Pd(ObjectAnimator.ofArgb(this.LL.getValue(), "textColor", this.itemView.getResources().getColor(R.color.f569bc), this.itemView.getResources().getColor(R.color.da)).setDuration(150L));
        C786410Ut5.Pd(ObjectAnimator.ofArgb(background, "color", ColorProtector.parseColor(((View) this.LLILZIL.getValue()).getTag().toString()), 0).setDuration(150L));
        C786410Ut5.l(I5(), 0);
        C786410Ut5.Pd(ObjectAnimator.ofFloat(I5(), "alpha", 0.0f, 1.0f).setDuration(150L));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LLILZ.getValue(), "alpha", 1.0f, 0.0f).setDuration(150L);
        duration2.addListener(new ALAdapterS24S0100000_29(this, 35));
        C786410Ut5.Pd(duration2);
    }

    public C19398010uo(View view) {
        super(view);
        this.LL = C452501pT.LIZIZ(new AwS573S0100000_29(view, 1149));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS573S0100000_29(view, 1148));
        this.LLILLL = C452501pT.LIZIZ(new AwS573S0100000_29(view, 1146));
        this.LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(view, 1147));
        this.LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(view, 1145));
    }
}
