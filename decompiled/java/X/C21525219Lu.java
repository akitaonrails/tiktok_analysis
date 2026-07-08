package X;

import Y.ARunnableS132S0100000_32;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.nimblecard.tako.component.lynx.NimbleLynxAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.lynx.TakoLynxAssem;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19Lu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21525219Lu extends AbstractC1542100qES {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 1:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJJLL(EnumC1067640dtC enumC1067640dtC) {
        switch (this.$t) {
            case 0:
                LJLJJLL$0(this, enumC1067640dtC);
                break;
            case 1:
                LJLJJLL$1(this, enumC1067640dtC);
                break;
            default:
                super.LJLJJLL(enumC1067640dtC);
                break;
        }
    }

    public C21525219Lu(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(C21525219Lu c21525219Lu, InterfaceC1541990qEH interfaceC1541990qEH) {
        View viewLJJIJL = ((NimbleLynxAssem) c21525219Lu.l0).LJJIJL();
        if (viewLJJIJL != null) {
            HandlerHook.viewPost(viewLJJIJL, new ARunnableS132S0100000_32((NimbleLynxAssem) c21525219Lu.l0, 41));
        }
    }

    public static final void LJLIIIL$1(C21525219Lu c21525219Lu, InterfaceC1541990qEH interfaceC1541990qEH) {
        View viewLJJIJL = ((TakoLynxAssem) c21525219Lu.l0).LJJIJL();
        if (viewLJJIJL != null) {
            HandlerHook.viewPost(viewLJJIJL, new ARunnableS132S0100000_32((TakoLynxAssem) c21525219Lu.l0, 50));
        }
    }

    public static final void LJLJJLL$0(C21525219Lu c21525219Lu, EnumC1067640dtC enumC1067640dtC) {
        C1537720q7O c1537720q7O = ((NimbleLynxAssem) c21525219Lu.l0).LLJJJJ;
        if (c1537720q7O != null) {
            c1537720q7O.LIZ("cardShow", new JSONObject());
        }
    }

    public static final void LJLJJLL$1(C21525219Lu c21525219Lu, EnumC1067640dtC enumC1067640dtC) {
        C1537720q7O c1537720q7O = ((TakoLynxAssem) c21525219Lu.l0).LLJJJJ;
        if (c1537720q7O != null) {
            c1537720q7O.LIZ("cardShow", new JSONObject());
        }
    }
}
