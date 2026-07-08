package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessNewStartDialogV2;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartDialogV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JFL, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JFL {
    public static final C0JFL LIZ = new C0JFL();
    public static Function0<Unit> LIZIZ;
    public static boolean LIZJ;

    public static final void LIZJ() {
        LIZIZ = null;
        LIZJ = false;
    }

    public static final void LIZIZ(DataChannel dataChannel) {
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        C488910JFh.LIZ(dataChannel);
        if (C0JFQ.LIZ(dataChannel)) {
            if (dataChannel != null && (fragmentManager2 = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                C19322110iZ.LJFF(fragmentManager2, LIZ(false, false), "draw_and_guess", null, 0);
                return;
            }
            return;
        }
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return;
        }
        C19322110iZ.LJFF(fragmentManager, new DrawGuessStartDialogV2(), "draw_and_guess", null, 0);
    }

    public static DrawGuessNewStartDialogV2 LIZ(boolean z, boolean z2) {
        Function0<Unit> function0;
        if (!LIZJ && (function0 = LIZIZ) != null) {
            LIZJ = true;
            function0.invoke();
        }
        DrawGuessNewStartDialogV2 drawGuessNewStartDialogV2 = new DrawGuessNewStartDialogV2();
        Bundle bundle = new Bundle();
        bundle.putBoolean("argument_is_from_round_summary", z);
        bundle.putBoolean("argument_is_custom_next_word", z2);
        drawGuessNewStartDialogV2.setArguments(bundle);
        return drawGuessNewStartDialogV2;
    }
}
