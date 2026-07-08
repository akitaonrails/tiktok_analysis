package X;

import Y.ARunnableS119S0100000_19;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.minis.model.SafeArea;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS79S0500000_19;

/* JADX INFO: renamed from: X.0hi6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1214520hi6 {
    public SafeArea LIZ;

    public final void LIZ(View view, C1836680xta c1836680xta, InterfaceC1214530hi7 interfaceC1214530hi7) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("computeSafeArea, sparkView:");
        sbLIZ.append(view);
        sbLIZ.append(", operationPanelRlt:");
        sbLIZ.append(c1836680xta);
        C2188811AlT.LIZIZ(sbLIZ);
        AwS79S0500000_19 awS79S0500000_19 = new AwS79S0500000_19(new AtomicInteger(0), this, view, c1836680xta, interfaceC1214530hi7, 43);
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS119S0100000_19((Object) awS79S0500000_19, 215));
        }
        if (c1836680xta != null) {
            HandlerHook.viewPost(c1836680xta, new ARunnableS119S0100000_19((Object) awS79S0500000_19, 215));
        }
    }
}
