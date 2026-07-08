package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.gamora.editor.ailive.widget.VideoPlayerView;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: renamed from: X.0MFD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MFD extends LinearLayout {
    public final C0MFB LL;
    public final Lifecycle LLILLJJLI;
    public final C01GW LLILLL;

    private final VideoPlayerView getVideoPlayerView() {
        return (VideoPlayerView) this.LLILLL.getValue();
    }

    public final C0MFB getHelpCenterConfig() {
        return this.LL;
    }

    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI;
    }

    public final void LIZIZ(View view) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        if (c19egLIZIZ != null) {
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19egLIZIZ);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19egLIZIZ, immersionBarLJIILJJIL);
            tuxImmersionBar.LIZJ(false, false);
            immersionBarLJIILJJIL.LJIIL();
            tuxImmersionBar.LJ(R.attr.z_);
            tuxImmersionBar.LIZLLL();
        }
        View viewFindViewById = view.findViewById(R.id.cnb);
        if (viewFindViewById != null) {
            C426750GoL.LJIIJ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams(), getContext(), null, Integer.valueOf(ScreenUtils.getStatusBarHeight(getContext())), null, null, 58);
            C786410Ut5.I7(new AkS80S0100000_8(this, 29), viewFindViewById);
        }
        TextView textView = (TextView) view.findViewById(R.id.cp0);
        if (textView != null) {
            textView.setText(C1383370m6R.LJIIJ(2131820702));
            C786410Ut5.I7(new AkS80S0100000_8(this, 30), textView);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.cu1);
        if (textView2 != null) {
            textView2.setText(C1383370m6R.LJIIJ(2131820703));
            C786410Ut5.I7(new AkS80S0100000_8(this, 31), textView2);
        }
        TextView textView3 = (TextView) view.findViewById(R.id.jdx);
        if (textView3 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1383370m6R.LJIIJ(2131820675));
            sbLIZ.append(' ');
            textView3.setText(C2188811AlT.LIZIZ(sbLIZ));
            textView3.setTypeface(C1697580uHE.LIZIZ(0.0f, 900, 40.0f, 0.4f, Float.valueOf(-6.0f), 0.0f, 0, null, 224));
        }
        C21578619ce c21578619ce = (C21578619ce) view.findViewById(R.id.u2m);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.msd);
        linearLayout.addView(LIZ(C1383370m6R.LJIIJ(2131820698), true));
        linearLayout.addView(LIZ(C1383370m6R.LJIIJ(2131820699), true));
        linearLayout.addView(LIZ(C1383370m6R.LJIIJ(2131820700), true));
        linearLayout.addView(LIZ(C1383370m6R.LJIIJ(2131820701), false));
        C786410Ut5.x3(linearLayout.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC581010MqZ(linearLayout, c21578619ce, view, this, 1));
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.video_container);
        C786410Ut5.x3(frameLayout.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC581000MqY(frameLayout, 5));
        C0MFB c0mfb = this.LL;
        if (c0mfb != null) {
            getVideoPlayerView().LIZ(view, c0mfb.LIZIZ, c0mfb.LIZ);
        }
    }

    public final View LIZ(String str, boolean z) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        View viewLJLLJ = C786410Ut5.LJLLJ(getContext(), R.layout.gb, null);
        ImageView imageView = (ImageView) viewLJLLJ.findViewById(R.id.cy0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(iIntValue);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        imageView.setImageDrawable(c384050F3z.LIZ(imageView.getContext()));
        C786410Ut5.LJZI(0, imageView);
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.cy1);
        tuxTextView.setTuxFont(101);
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setText(str);
        tuxTextView.setTextDirection(5);
        tuxTextView.setMovementMethod(C431260Gvc.LIZ);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (z) {
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        }
        C786410Ut5.W5(viewLJLLJ, layoutParams);
        return viewLJLLJ;
    }

    public C0MFD(C0MFB c0mfb, Lifecycle lifecycle, Context context) {
        super(context, null, 0);
        this.LL = c0mfb;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = C452501pT.LIZIZ(new AwS409S0200000_8(context, this, 121));
    }
}
