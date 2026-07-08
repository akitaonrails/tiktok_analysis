package X;

import android.content.Context;
import com.bytedance.poplayer.core.PopupManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0e3R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073990e3R {
    public static void LIZ(Context context, Function0 function0, Function0 function02, Function0 function03) {
        if (C1073980e3Q.LLILZIL) {
            return;
        }
        AwS417S0200000_16 awS417S0200000_16 = new AwS417S0200000_16(function0, (Function0<Unit>) function02, (Function0<Unit>) 115);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(function0, (Function0<Unit>) 966);
        C1073980e3Q.LLILZIL = true;
        PopupManager.LJIIZILJ(new C1073980e3Q(context, new AwS560S0100000_16(awS417S0200000_16, 964), new AwS560S0100000_16(awS560S0100000_16, 965)), new C1668306g5("m10n_auto_jump_app_pop_up"));
        function03.invoke();
    }
}
