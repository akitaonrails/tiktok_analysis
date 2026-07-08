package X;

import Y.ARunnableS107S0100000_7;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0JFG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0JFG extends C2217421BqW implements Function1<Long, Unit> {
    public C0JFG(Object obj) {
        super(1, obj, DrawGuessStartFragment.class, "initView", "initView(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        String str;
        long jLongValue = l.longValue();
        DrawGuessStartFragment drawGuessStartFragment = (DrawGuessStartFragment) this.receiver;
        if (!drawGuessStartFragment.LLJI) {
            drawGuessStartFragment.LLJI = true;
            int i = (int) (jLongValue / ((long) 60));
            View viewFindViewById = drawGuessStartFragment.LLILLJJLI;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View view = drawGuessStartFragment.getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.jc4);
                } else {
                    viewFindViewById = null;
                }
                drawGuessStartFragment.LLILLJJLI = (C16F5) viewFindViewById;
            }
            ((TextView) viewFindViewById).setText(C497740JfY.LJIIL(2131755513, i, Integer.valueOf(i)));
            DrawGuessWord drawGuessWordLIZIZ = C488910JFh.LJ;
            if (drawGuessWordLIZIZ != null || (drawGuessWordLIZIZ = C488910JFh.LIZIZ()) != null) {
                drawGuessStartFragment.LLJ = drawGuessWordLIZIZ;
                drawGuessStartFragment.PR().setText(drawGuessWordLIZIZ.word);
            }
            DataChannel dataChannelLJ = C475510Ikn.LJ(drawGuessStartFragment);
            DrawGuessWord drawGuessWord = drawGuessStartFragment.LLJ;
            if (drawGuessWord == null || (str = drawGuessWord.word) == null) {
                str = "";
            }
            String str2 = drawGuessStartFragment.LLJJ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_customize_panel_show");
            C0JFO.LIZIZ(c474500IjALIZ, dataChannelLJ);
            C0JFO.LIZ(c474500IjALIZ);
            c474500IjALIZ.LJJII(str, "word");
            c474500IjALIZ.LJJII(str2, "enter_from");
            c474500IjALIZ.LIZ();
            View viewFindViewById3 = drawGuessStartFragment.LLILLL;
            if (viewFindViewById3 == null) {
                View view2 = drawGuessStartFragment.getView();
                if (view2 != null) {
                    viewFindViewById3 = view2.findViewById(R.id.dnh);
                } else {
                    viewFindViewById3 = null;
                }
                drawGuessStartFragment.LLILLL = (C16F5) viewFindViewById3;
            }
            C500260Jjc.LJLIIIL(500L, viewFindViewById3, new AwS586S0100000_7(drawGuessStartFragment, 580));
            C500260Jjc.LJLIIIL(500L, drawGuessStartFragment.RR(), new AwS586S0100000_7(drawGuessStartFragment, 581));
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.dn2, drawGuessStartFragment.getContext());
            if (c20743516FdLIZLLL != null) {
                c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.0f), (int) C497740JfY.LIZIZ(14.0f));
                c20743516FdLIZLLL.setTint(C497740JfY.LJFF(R.color.a6q));
            } else {
                c20743516FdLIZLLL = null;
            }
            drawGuessStartFragment.OR().setCompoundDrawablesRelative(c20743516FdLIZLLL, null, null, null);
            drawGuessStartFragment.PR().addTextChangedListener(new C521840KdK(drawGuessStartFragment, 9));
            if (drawGuessStartFragment.LLJILLL) {
                HandlerHook.viewPostDelay(drawGuessStartFragment.PR(), new ARunnableS107S0100000_7(drawGuessStartFragment, 277), 200L);
            }
            View view3 = drawGuessStartFragment.LLILZLL;
            if (view3 == null) {
                View view4 = drawGuessStartFragment.getView();
                if (view4 != null) {
                    viewFindViewById2 = view4.findViewById(R.id.gp0);
                }
                drawGuessStartFragment.LLILZLL = viewFindViewById2;
                view3 = viewFindViewById2;
            }
            C500260Jjc.LJLIIIL(500L, view3, new AwS586S0100000_7(drawGuessStartFragment, 582));
            if (C0JGR.x2.LIZIZ().booleanValue()) {
                HandlerHook.viewPostDelay(drawGuessStartFragment.NR(), new ARunnableS107S0100000_7(drawGuessStartFragment, 278), 200L);
            }
        }
        return Unit.LIZ;
    }
}
