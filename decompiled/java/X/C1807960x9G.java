package X;

import Y.AAListenerS317S0100000_6;
import Y.ACListenerS161S0100000_27;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x9G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807960x9G extends AbstractC1807100x7s<C1806040x6A> {
    public final InterfaceC1806420x6m LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final C0GYV LLILZIL;
    public final C01GW LLILZLL;
    public Animator LLIZ;
    public C1806040x6A LLIZLLLIL;
    public final C1864810ycx LLJ;

    public final boolean L5() {
        InterfaceC1795200wog interfaceC1795200wog = (InterfaceC1795200wog) PluggableExtentionKt.pluggableSpi$default(InterfaceC1795200wog.class, false, false, false, 14, null);
        String curUserId = interfaceC1795200wog != null ? interfaceC1795200wog.getCurUserId() : null;
        InterfaceC1870830ymf interfaceC1870830ymfLIZ = C1323690kYB.LIZ(this.itemView.getContext());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomOptionBannerDidShowAnimation_");
        sbLIZ.append(curUserId);
        return Intrinsics.LJFF(interfaceC1870830ymfLIZ.LIZ(C2188811AlT.LIZIZ(sbLIZ)), Boolean.TRUE);
    }

    public final void N5() {
        C0GYV c0gyv = this.LLILZIL;
        ValueAnimator valueAnimator = c0gyv.LLILLJJLI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = c0gyv.LLJI;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-f, f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(c0gyv, 188));
        valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(c0gyv, 81));
        valueAnimatorOfFloat.start();
        c0gyv.LLILLJJLI = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addListener(new C1807970x9H(this, EnumC1807980x9I.ICON_SHIMMER));
    }

    public C1807960x9G(ViewGroup viewGroup, InterfaceC1806590x73 interfaceC1806590x73) {
        super(R.layout.hn_, viewGroup);
        this.LL = interfaceC1806590x73;
        this.LLILLJJLI = (TextView) this.itemView.findViewById(R.id.bse);
        this.LLILLL = (TextView) this.itemView.findViewById(R.id.bsa);
        this.LLILZ = (TextView) this.itemView.findViewById(R.id.bsf);
        this.LLILZIL = (C0GYV) this.itemView.findViewById(R.id.xuw);
        this.LLILZLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(371));
        this.LLJ = new C1864810ycx(this, 1);
        this.itemView.setOnTouchListener(new ViewOnTouchListenerC789480Uy2());
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 222), this.itemView);
    }

    public final void I5(C1806040x6A c1806040x6A, List<? extends Object> list) {
        Integer backgroundColor;
        this.LLIZLLLIL = c1806040x6A;
        if (C13LP.LJJJLL(list) instanceof InterfaceC1807440x8Q) {
            Animator animator = this.LLIZ;
            if (animator != null) {
                animator.cancel();
            }
            c1806040x6A.LIZIZ.LIZ(this.LLILLL);
            return;
        }
        c1806040x6A.LIZ.LIZ(this.LLILLJJLI);
        c1806040x6A.LIZIZ.LIZ(this.LLILLL);
        InterfaceC1806620x76 interfaceC1806620x76 = c1806040x6A.LIZJ;
        if (interfaceC1806620x76 != null) {
            TextView textView = this.LLILZ;
            textView.setText(interfaceC1806620x76.LIZIZ(textView.getContext()));
        }
        InterfaceC1806620x76 interfaceC1806620x762 = c1806040x6A.LIZJ;
        if (interfaceC1806620x762 != null && (backgroundColor = interfaceC1806620x762.getBackgroundColor()) != null) {
            this.LLILZ.setBackgroundColor(backgroundColor.intValue());
        }
        C786410Ut5.S4(1.0f, this.LLILZ);
        C500260Jjc.LLFFF(this.LLILZ);
        C0GYV c0gyv = this.LLILZIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gyv);
        c0gyv.setAlpha(0.0f);
        C1324610kZf url = ((C0JBN) this.LLILZLL.getValue()).setUrl(c1806040x6A.LIZLLL);
        url.LJIIL = this.LLJ;
        url.LJIJJ = ImageView.ScaleType.FIT_CENTER;
        url.LJJI(this.LLILZIL);
    }
}
