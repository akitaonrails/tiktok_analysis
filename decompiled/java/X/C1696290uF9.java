package X;

import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.internal.AwS426S0200000_25;
import p2.j1;

/* JADX INFO: renamed from: X.0uF9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696290uF9 extends AbstractC20055413dY implements InterfaceC1696300uFA {
    public ViewGroup LLJJ;

    public C1696290uF9(AndroidComposeView androidComposeView) {
        this.LLJJ = androidComposeView;
    }

    @Override // X.InterfaceC1696300uFA
    public final Object LJJJJJ(j1 j1Var, AwS426S0200000_25 awS426S0200000_25, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1683130ttv c1683130ttvLJIIIZ;
        long jLJ = C1692940u9k.LJ(j1Var);
        C1683130ttv c1683130ttv = (C1683130ttv) awS426S0200000_25.invoke();
        if (c1683130ttv != null && (c1683130ttvLJIIIZ = c1683130ttv.LJIIIZ(jLJ)) != null) {
            this.LLJJ.requestRectangleOnScreen(C1681300tqy.LIZIZ(c1683130ttvLJIIIZ), false);
        }
        return Unit.LIZ;
    }
}
