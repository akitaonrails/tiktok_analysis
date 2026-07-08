package X;

import com.ss.android.ugc.aweme.absetting.CameraSensitivePostOptAB;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS436S0200000_35;

/* JADX INFO: renamed from: X.1DGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2252991DGf implements InterfaceC2190671AoT<C2253021DGi> {
    public final List<InterfaceC2253001DGg> LIZ = new ArrayList();

    public final void LIZ(C2253021DGi c2253021DGi) {
        String string = c2253021DGi.toString();
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SensitiveApiManagement: dispatch SensitiveApiEvent: ");
        sbLIZ.append(string);
        interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
        AwS436S0200000_35 awS436S0200000_35 = new AwS436S0200000_35(this, c2253021DGi, 3);
        if (CameraSensitivePostOptAB.isEnabled()) {
            C01TT.LIZLLL(awS436S0200000_35);
        } else {
            C01TT.LIZJ(awS436S0200000_35);
        }
    }
}
