package X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.editor.ailive.widget.VideoPlayerView;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: renamed from: X.0MFL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MFL extends LinearLayout {
    public final C0MFM LL;
    public final Lifecycle LLILLJJLI;
    public View LLILLL;
    public final C01GW LLILZ;

    private final VideoPlayerView getVideoPlayerView() {
        return (VideoPlayerView) this.LLILZ.getValue();
    }

    public final C0MFM getGuideConfig() {
        return this.LL;
    }

    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI;
    }

    public final View getRoot() {
        return this.LLILLL;
    }

    public final void setRoot(View view) {
        this.LLILLL = view;
    }

    public C0MFL(C0MFM c0mfm, Lifecycle lifecycle, View view, Context context) {
        super(context, null, 0);
        this.LL = c0mfm;
        this.LLILLJJLI = lifecycle;
        this.LLILLL = view;
        this.LLILZ = C452501pT.LIZIZ(new AwS409S0200000_8(context, this, 120));
        if (this.LLILLL == null) {
            this.LLILLL = C786410Ut5.Sd(R.layout.sz, C786410Ut5.ne(getContext()), this);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.jdx);
            if (tuxTextView != null) {
                tuxTextView.setTypeface(C1697580uHE.LIZIZ(0.0f, 900, 28.0f, 0.4f, Float.valueOf(-6.0f), 0.0f, 0, null, 224));
                tuxTextView.LJJJJI(32.0f);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                c0mfm.getClass();
                sbLIZ.append(C1383370m6R.LJIIJ(2131820708));
                sbLIZ.append(' ');
                tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            TextView textView = (TextView) view2.findViewById(R.id.jc4);
            if (textView != null) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(c0mfm.LIZJ);
            }
            TextView textView2 = (TextView) view2.findViewById(R.id.cp0);
            if (textView2 != null) {
                textView2.setText(C1383370m6R.LJIIJ(2131820702));
                C786410Ut5.I7(new AkS80S0100000_8(this, 27), textView2);
            }
            TextView textView3 = (TextView) view2.findViewById(R.id.cu1);
            if (textView3 != null) {
                textView3.setText(C1383370m6R.LJIIJ(2131820703));
                C786410Ut5.I7(new AkS80S0100000_8(this, 28), textView3);
            }
            View viewFindViewById = view2.findViewById(R.id.cov);
            if (viewFindViewById != null) {
                C786410Ut5.I7(new AkS80S0100000_8(this, 26), viewFindViewById);
            }
            getVideoPlayerView().LIZ(view2, c0mfm.LIZIZ, c0mfm.LIZ);
        }
    }
}
