package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0g57, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151910g57 extends AbstractC1539010q9T {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
        switch (this.$t) {
            case 0:
                LJJJLL$0(this, interfaceC1531560pxS);
                break;
            case 1:
                LJJJLL$1(this, interfaceC1531560pxS);
                break;
            case 2:
                LJJJLL$2(this, interfaceC1531560pxS);
                break;
            case 3:
                LJJJLL$3(this, interfaceC1531560pxS);
                break;
            case 4:
                LJJJLL$4(this, interfaceC1531560pxS);
                break;
            case 5:
                LJJJLL$5(this, interfaceC1531560pxS);
                break;
            case 6:
                LJJJLL$6(this, interfaceC1531560pxS);
                break;
            default:
                super.LJJJLL(interfaceC1531560pxS);
                break;
        }
    }

    public C1151910g57(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJJLL$0(C1151910g57 c1151910g57, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (C1095690ecR.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1) {
            ((C1537910q7h) interfaceC1531560pxS).LJIJJ = TemplateData.LJII(C2097608Jq.LJIIZILJ((Map) c1151910g57.l0));
        }
    }

    public static final void LJJJLL$1(C1151910g57 c1151910g57, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        if (C1095720ecU.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1 && (interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            SparkContext sparkContext = (SparkContext) c1151910g57.l0;
            C1523400pkI.LL.getClass();
            c1537910q7h.LJIIIIZZ(new C1554360qYE(sparkContext, 1));
        }
    }

    public static final void LJJJLL$2(C1151910g57 c1151910g57, InterfaceC1531560pxS interfaceC1531560pxS) {
        LynxViewClient lynxViewClient;
        if ((interfaceC1531560pxS instanceof C1537910q7h) && (lynxViewClient = (LynxViewClient) c1151910g57.l0) != null) {
            ((C1537910q7h) interfaceC1531560pxS).LJIIIIZZ(lynxViewClient);
        }
    }

    public static final void LJJJLL$3(C1151910g57 c1151910g57, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (interfaceC1531560pxS instanceof C1537910q7h) {
            C1091210eVD c1091210eVD = (C1091210eVD) c1151910g57.l0;
            C1537910q7h c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
            c1091210eVD.getClass();
            CopyOnWriteArrayList<LynxViewClient> copyOnWriteArrayList = c1537910q7h.LJJJIL;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.contains(c1091210eVD.LLIZ)) {
                c1537910q7h.LJIIIIZZ(c1091210eVD.LLIZ);
            }
        }
    }

    public static final void LJJJLL$4(C1151910g57 c1151910g57, InterfaceC1531560pxS interfaceC1531560pxS) {
        int i;
        if (C1095620ecK.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1 && (interfaceC1531560pxS instanceof C1537910q7h)) {
            C1095610ecJ c1095610ecJ = (C1095610ecJ) c1151910g57.l0;
            C1537910q7h c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
            C1067460dsu c1067460dsuLIZIZ = C1067320dsg.LIZIZ("");
            c1067460dsuLIZIZ.LIZ("initial_data", c1095610ecJ.LIZIZ());
            C1095630ecL c1095630ecL = c1095610ecJ.LJ;
            if (c1095630ecL != null) {
                i = c1095630ecL.LIZIZ;
            } else {
                i = 0;
            }
            c1067460dsuLIZIZ.LIZ("preload_status", Integer.valueOf(i));
            c1067460dsuLIZIZ.LIZ("mock_data_status", Integer.valueOf(c1095610ecJ.LIZJ()));
            c1067460dsuLIZIZ.LIZ("data_source_type", "open_schema");
            c1537910q7h.LJIJJLI(c1067460dsuLIZIZ);
        }
    }

    public static final void LJJJLL$5(C1151910g57 c1151910g57, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1537910q7h c1537910q7h;
        if (C1095730ecV.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1 && (interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIJJ = TemplateData.LJII(C2097608Jq.LJIIZILJ((Map) c1151910g57.l0));
        }
    }

    public static final void LJJJLL$6(C1151910g57 c1151910g57, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (interfaceC1531560pxS instanceof C1537910q7h) {
            ((C1537910q7h) interfaceC1531560pxS).LJIIIIZZ((LynxViewClient) c1151910g57.l0);
        }
    }
}
