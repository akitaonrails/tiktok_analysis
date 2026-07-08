package X;

import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AwS418S0200000_17;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0g4W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151540g4W extends LynxViewClient {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void LJFF$1(C1151540g4W c1151540g4W, LynxError lynxError) {
    }

    @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
    public final void LJFF(LynxError lynxError) {
        switch (this.$t) {
            case 0:
                LJFF$0(this, lynxError);
                break;
            case 1:
                LJFF$1(this, lynxError);
                break;
            default:
                super.LJFF(lynxError);
                break;
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJ() {
        switch (this.$t) {
            case 0:
                LJIIJ$0(this);
                break;
            case 1:
                LJIIJ$1(this);
                break;
            default:
                super.LJIIJ();
                break;
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILJJIL() {
        switch (this.$t) {
            case 0:
                LJIILJJIL$0(this);
                break;
            case 1:
                LJIILJJIL$1(this);
                break;
            default:
                super.LJIILJJIL();
                break;
        }
    }

    public static final void LJIIJ$0(C1151540g4W c1151540g4W) {
        C1141320fo2 c1141320fo2 = ((C1141170fnn) c1151540g4W.l0).LLJ;
        if (c1141320fo2 != null) {
            c1141320fo2.LJ = C1141320fo2.LIZ();
            c1141320fo2.LJI = 5;
        }
    }

    public static final void LJIIJ$1(C1151540g4W c1151540g4W) {
        C1105870esr c1105870esr = (C1105870esr) c1151540g4W.l0;
        C1105880ess c1105880ess = c1105870esr.LLJ;
        if (c1105880ess != null) {
            String str = c1105870esr.LLIZ;
            c1105870esr.getClass();
            if (c1105880ess.LIZIZ != 0) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                long jCurrentTimeMillis = System.currentTimeMillis() - c1105880ess.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - c1105880ess.LIZIZ;
                C0K04.LJFF("event_name", "first_screen_show", jSONObject);
                C0K04.LJ("event_duration", jCurrentTimeMillis2, jSONObject2);
                C0K04.LJ("event_duration_all", jCurrentTimeMillis, jSONObject2);
                C0K04.LJ("event_duration", jCurrentTimeMillis2, jSONObject3);
                C0K04.LJ("event_duration_all", jCurrentTimeMillis, jSONObject3);
                c1105880ess.LIZ(jSONObject3);
                C0K04.LIZLLL(0, "is_precreate", jSONObject3);
                if (!TextUtils.isEmpty(str)) {
                    C0K04.LJFF("lynx_url", str, jSONObject3);
                }
                C0K04.LJII("extra", jSONObject4, jSONObject3);
                C1CC2.LJ("ttlive_ranklist_lynx_show", jSONObject, jSONObject2, jSONObject4);
            }
        }
    }

    public static final void LJIILJJIL$0(C1151540g4W c1151540g4W) {
        C1075770e6J c1075770e6J;
        Set<? extends InterfaceC1063710dmr> set;
        C1141320fo2 c1141320fo2 = ((C1141170fnn) c1151540g4W.l0).LLJ;
        if (c1141320fo2 != null) {
            c1141320fo2.LIZJ = C1141320fo2.LIZ();
            c1141320fo2.LJI = 3;
        }
        SparkContext sparkContext = (SparkContext) c1151540g4W.l1;
        if (sparkContext != null && (c1075770e6J = (C1075770e6J) sparkContext.LJFF(C1075770e6J.class)) != null && (set = ((C1141170fnn) c1151540g4W.l0).LLJILJIL) != null) {
            for (InterfaceC1063710dmr interfaceC1063710dmr : set) {
                C1543410qGZ c1543410qGZLJIIJ = c1075770e6J.LJIIJ();
                if (c1543410qGZLJIIJ != null) {
                    InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
                    c1543410qGZLJIIJ.LJ(interfaceC1063710dmr, EnumC1063300dmC.ALL);
                }
            }
        }
        C1141320fo2 c1141320fo22 = ((C1141170fnn) c1151540g4W.l0).LLJ;
        if (c1141320fo22 != null) {
            c1141320fo22.LIZLLL = C1141320fo2.LIZ();
            c1141320fo22.LJI = 4;
        }
    }

    public static final void LJIILJJIL$1(C1151540g4W c1151540g4W) {
        SparkContext sparkContext;
        C1075770e6J c1075770e6J;
        if (!C1544000qHW.LJIIZILJ && (sparkContext = (SparkContext) c1151540g4W.l1) != null && (c1075770e6J = (C1075770e6J) sparkContext.LJFF(C1075770e6J.class)) != null) {
            Iterator it2 = new ArrayList().iterator();
            while (it2.hasNext()) {
                c1075770e6J.LJIILJJIL((C650250Pex) it2.next());
            }
        }
    }

    public static final void LJFF$0(C1151540g4W c1151540g4W, LynxError lynxError) {
        if (lynxError == null) {
            return;
        }
        C1141290fnz.LJFF(new AwS418S0200000_17(lynxError, (C1141170fnn) c1151540g4W.l0, 125));
    }

    public C1151540g4W(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
