package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.android.livesdkapi.host.IHostCompose;

/* JADX INFO: renamed from: X.13wk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20174413wk {
    public static final long LIZ(int i, InterfaceC1680500tpg interfaceC1680500tpg) {
        int iIntValue;
        interfaceC1680500tpg.LJJIIJZLJL(1099768694);
        Integer numLIZJ = C1308910kAL.LIZJ(i, (Context) interfaceC1680500tpg.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        long jLIZIZ = C1685850tyJ.LIZIZ(iIntValue);
        interfaceC1680500tpg.LJ();
        return jLIZIZ;
    }

    public static final void LIZIZ(ComposeView composeView, C19719212De c19719212De) {
        ((IHostCompose) C1161920gLG.LIZJ(IHostCompose.class)).jk2(composeView, c19719212De);
    }
}
