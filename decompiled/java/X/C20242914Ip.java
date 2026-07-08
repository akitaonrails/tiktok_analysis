package X;

import Y.ACListenerS164S0100000_30;
import Y.ARunnableS130S0100000_30;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: renamed from: X.14Ip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20242914Ip extends LinearLayout {
    public final C1295960jpS LL;
    public final C197039127h LLILLJJLI;
    public final C20243414Iu LLILLL;
    public final C1163304gp LLILZ;
    public final C14IJ LLILZIL;
    public final View LLILZLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LL.isAnimating()) {
            this.LL.cancelAnimation();
        }
    }

    public final void setClickConfig(Function1<? super C20243414Iu, Unit> function1) {
        function1.invoke(this.LLILLL);
    }

    public final void setShowConfig(Function1<? super C1163304gp, Unit> function1) {
        function1.invoke(this.LLILZ);
    }

    public C20242914Ip(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        C20243414Iu c20243414Iu = new C20243414Iu(0);
        this.LLILLL = c20243414Iu;
        this.LLILZ = new C1163304gp(null);
        C14IJ c14ij = new C14IJ(0);
        this.LLILZIL = c14ij;
        View viewSd = C786410Ut5.Sd(R.layout.fov, C786410Ut5.ne(context), this);
        this.LLILZLL = viewSd;
        setOrientation(1);
        C1295960jpS c1295960jpS = (C1295960jpS) viewSd.findViewById(R.id.npv);
        this.LL = c1295960jpS;
        SmartImageView smartImageView = (SmartImageView) viewSd.findViewById(R.id.npy);
        viewSd.findViewById(R.id.nq0);
        this.LLILLJJLI = (C197039127h) viewSd.findViewById(R.id.eok);
        TextView textView = (TextView) viewSd.findViewById(R.id.eu1);
        TuxIconView tuxIconView = (TuxIconView) viewSd.findViewById(R.id.bmy);
        setBackgroundColor(C1857690yRT.LJIIJ(R.attr.zp));
        C426750GoL.LJIIIZ(tuxIconView, null, Integer.valueOf(ScreenUtils.getStatusBarHeight(tuxIconView.getContext())), null, null, false, 29);
        C20243314It c20243314It = C20243314It.LIZ;
        Context context2 = getContext();
        c20243314It.getClass();
        C20243314It.LIZIZ(c1295960jpS, false, context2, true, null);
        C844350XAj c844350XAj = C844350XAj.LIZ;
        if (C960203pA.LIZIZ(smartImageView.getContext())) {
            str = "tako_onboarding_dark.png";
        } else {
            str = "tako_onboarding_light.png";
        }
        AwS617S0100000_3 awS617S0100000_3 = new AwS617S0100000_3(smartImageView, 3);
        c844350XAj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onboarding/");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c844350XAj.getClass();
        C844350XAj.LIZLLL("tikbot_bot_onboarding_resource", strLIZIZ, awS617S0100000_3, false);
        C197039127h c197039127h = this.LLILLJJLI;
        c197039127h.setText(c14ij.LIZJ);
        c197039127h.LJJJJL(AFwS236S0000000_6.get$arr$(18));
        C427690Gpr.LJ(c197039127h, C418440Gaw.LIZIZ(10));
        C786410Ut5.U8(c197039127h, new ACListenerS164S0100000_30(this, 3));
        HandlerHook.viewPost(c197039127h, new ARunnableS130S0100000_30(this, 7));
        textView.setText(c14ij.LIZIZ);
        c20243414Iu.LJ.invoke(textView, Boolean.FALSE);
        C786410Ut5.a9(tuxIconView, new ACListenerS164S0100000_30(this, 4));
    }
}
