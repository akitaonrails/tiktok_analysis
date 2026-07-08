package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicColorConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1D2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249451D2p {
    public final InterfaceC1773310wFN LIZ;
    public final C21316218bQ LIZIZ;
    public final Function1<String, Unit> LIZJ;
    public final C2249441D2o LIZLLL;
    public final C2249461D2q LJ;
    public C2249371D2h LJFF;

    public final void LIZ(C2249371D2h c2249371D2h) {
        this.LIZLLL.LJ(c2249371D2h.LIZ);
        this.LIZLLL.LIZJ(c2249371D2h.LIZIZ);
        this.LIZLLL.LIZ(c2249371D2h.LIZJ);
        C2249441D2o c2249441D2o = this.LIZLLL;
        List<DynamicColorConfig> listLLIIII = C13LP.LLIIII(c2249371D2h.LIZLLL.values());
        c2249441D2o.getClass();
        for (DynamicColorConfig dynamicColorConfig : listLLIIII) {
            String str = dynamicColorConfig.itemId;
            if (str != null) {
                View viewLIZ = c2249441D2o.LIZIZ.LIZ(str);
                if (viewLIZ == null) {
                    Function1<String, Unit> function1 = c2249441D2o.LIZLLL;
                    if (function1 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("applyItemBackgrounds skipped, itemView not found, itemId=");
                        sbLIZ.append(str);
                        function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    c2249441D2o.LIZLLL(viewLIZ, dynamicColorConfig);
                }
            }
        }
        this.LJFF = c2249371D2h;
    }

    public C2249451D2p(InterfaceC1773310wFN interfaceC1773310wFN, C21316218bQ c21316218bQ, AwS614S0100000_35 awS614S0100000_35) {
        this.LIZ = interfaceC1773310wFN;
        this.LIZIZ = c21316218bQ;
        this.LIZJ = awS614S0100000_35;
        C19508511Ud c19508511Ud = new C19508511Ud();
        C2249441D2o c2249441D2o = new C2249441D2o(interfaceC1773310wFN, c21316218bQ, c19508511Ud, awS614S0100000_35);
        this.LIZLLL = c2249441D2o;
        this.LJ = new C2249461D2q(interfaceC1773310wFN, c21316218bQ, c2249441D2o, c19508511Ud, awS614S0100000_35);
        this.LJFF = new C2249371D2h(null, null, null, C2097608Jq.LJ());
    }
}
