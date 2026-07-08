package X;

import Y.ACListenerS142S0100000_7;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartDialog;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0JFK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0JFK extends C2217421BqW implements Function1<Long, Unit> {
    public C0JFK(Object obj) {
        super(1, obj, DrawGuessStartDialog.class, "initView", "initView(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        DrawGuessStartDialog drawGuessStartDialog = (DrawGuessStartDialog) this.receiver;
        if (!drawGuessStartDialog.LLILZIL) {
            drawGuessStartDialog.LLILZIL = true;
            int i = (int) (jLongValue / ((long) 60));
            View viewFindViewById = drawGuessStartDialog.LLILLJJLI;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View view = drawGuessStartDialog.getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.jc4);
                } else {
                    viewFindViewById = null;
                }
                drawGuessStartDialog.LLILLJJLI = (C16F5) viewFindViewById;
            }
            ((TextView) viewFindViewById).setText(C497740JfY.LJIIL(2131755513, i, Integer.valueOf(i)));
            DrawGuessWord drawGuessWordLIZIZ = C488910JFh.LJ;
            if (drawGuessWordLIZIZ == null) {
                drawGuessWordLIZIZ = C488910JFh.LIZIZ();
            }
            drawGuessStartDialog.OR(drawGuessWordLIZIZ);
            View view2 = drawGuessStartDialog.LLILLL;
            if (view2 == null) {
                View view3 = drawGuessStartDialog.getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.dnh);
                }
                drawGuessStartDialog.LLILLL = (C16F5) viewFindViewById2;
                view2 = viewFindViewById2;
            }
            C500260Jjc.LJLIIIL(500L, view2, new AwS586S0100000_7(drawGuessStartDialog, 579));
            C786410Ut5.h8(drawGuessStartDialog.MR(), new ACListenerS142S0100000_7(drawGuessStartDialog, 325));
        }
        return Unit.LIZ;
    }
}
