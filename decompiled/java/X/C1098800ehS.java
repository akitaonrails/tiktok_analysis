package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ehS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098800ehS extends AbstractC1098830ehV implements InterfaceC1059280dfi {
    public boolean LLJILLL;
    public final C1098850ehX LLJJ;
    public final InterfaceC1541990qEH LLJJI;

    @Override // X.AbstractC1098830ehV
    public final void LJIIIZ() {
        setLoadCallback(null);
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLJJI;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.LLD(true);
        }
        this.LLJJ.LIZ = null;
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
    }

    @Override // X.AbstractC1098830ehV
    public final void LJII() {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLJJI;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.onHide();
        }
    }

    @Override // X.AbstractC1098830ehV
    public final void LJIIIIZZ() {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLJJI;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.onShow();
        }
    }

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Ud(EnumC1101860emO.ID, getCardContainerId());
    }

    @Override // X.AbstractC1098830ehV
    public String getCardContainerId() {
        C1537480q70 hybridContext;
        String str;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLJJI;
        return (interfaceC1541990qEH == null || (hybridContext = interfaceC1541990qEH.getHybridContext()) == null || (str = hybridContext.containerId) == null) ? "" : str;
    }

    @Override // X.AbstractC1098830ehV
    public final void LJFF(Map<String, String> map) {
        LynxView lynxView;
        if (this.LLJILLL) {
            return;
        }
        Object obj = this.LLJJI;
        if ((obj instanceof LynxView) && (lynxView = (LynxView) obj) != null) {
            lynxView.addLynxViewClient(new C1151530g4V(map, 3));
            this.LLJILLL = true;
        }
    }

    @Override // X.AbstractC1098830ehV
    public final void LJI(String str) {
        C1537480q70 hybridContext;
        ViewParent parent;
        SparkContext sparkContext;
        C1537480q70 hybridContext2;
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLJJI;
        if (interfaceC1541990qEH != null && (hybridContext2 = interfaceC1541990qEH.getHybridContext()) != null && str != null) {
            hybridContext2.initData = str;
        }
        boolean zLJI = MethodIDManager.LJI(71820);
        InterfaceC1541990qEH interfaceC1541990qEH2 = this.LLJJI;
        View viewE1 = null;
        if (interfaceC1541990qEH2 != null) {
            hybridContext = interfaceC1541990qEH2.getHybridContext();
        } else {
            hybridContext = null;
        }
        if ((hybridContext instanceof SparkContext) && (sparkContext = (SparkContext) hybridContext) != null) {
            sparkContext.LJJJJJ(this);
        }
        InterfaceC1541990qEH interfaceC1541990qEH3 = this.LLJJI;
        if (interfaceC1541990qEH3 != null) {
            interfaceC1541990qEH3.load();
        }
        LIZIZ().LJIIIIZZ = System.currentTimeMillis();
        C1098850ehX c1098850ehX = this.LLJJ;
        C1098070egH c1098070egHLIZIZ = c1098850ehX.LIZIZ();
        AbstractC1098820ehU.LIZJ(c1098850ehX, "container_create", new HashMap(c1098070egHLIZIZ.LIZIZ()), C2097608Jq.LJIIJ(new Pair("duration", Long.valueOf(AbstractC1098820ehU.LIZ(c1098070egHLIZIZ.LJII, c1098070egHLIZIZ.LJIIIIZZ)))));
        InterfaceC1541990qEH interfaceC1541990qEH4 = this.LLJJI;
        if (interfaceC1541990qEH4 != null && (viewE1 = interfaceC1541990qEH4.e1()) != null && (parent = viewE1.getParent()) != null) {
            try {
                if (parent instanceof ViewGroup) {
                    C786410Ut5.LJJJLZIJ(viewE1, (ViewGroup) parent);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("com.bytedance.android.livesdk.container.ui.SparkCardView", e);
            }
        }
        addView(viewE1);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.AbstractC1098830ehV
    public final void LJIIJJI(Map<String, ? extends Object> map) {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLJJI;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.updateData(map);
        }
    }

    @Override // X.AbstractC1098830ehV
    public final void LJIIJ(String str, JSONObject jSONObject) {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLJJI;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.LIZ(str, jSONObject);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ehX] */
    public C1098800ehS(Context context, String str, String str2) {
        super(context);
        this.LLJJ = new AbstractC1098820ehU<C1098070egH>() { // from class: X.0ehX
        };
        this.LLJJI = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).NN(context, str, null, false, new C1098780ehQ(this, str2, str));
        setName(str2 == null ? "" : str2);
    }
}
