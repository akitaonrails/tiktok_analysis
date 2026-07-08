package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS161S1200000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15ZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ZQ {
    public long LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final Map<String, C20540515Zb> LIZJ = new LinkedHashMap();
    public final List<C15ZP> LIZLLL = new ArrayList();
    public C785860UsC LJ;
    public PthreadTimer LJFF;
    public boolean LJI;
    public long LJII;

    public final void LIZJ() {
        Unit unit;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.LJI) {
            InterfaceC20541115Zh interfaceC20541115ZhLIZJ = C15ZV.LIZJ();
            this.LJII = interfaceC20541115ZhLIZJ != null ? interfaceC20541115ZhLIZJ.getLong("lastUploadAlogTimeStamp") : 0L;
            this.LJI = true;
        }
        if (jCurrentTimeMillis > this.LJII + ((long) 3600000)) {
            InterfaceC20541015Zg interfaceC20541015ZgLIZIZ = C15ZV.LIZIZ();
            if (interfaceC20541015ZgLIZIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("time box : ");
                sbLIZ.append(((LinkedHashMap) this.LIZJ).keySet());
                sbLIZ.append("，: ");
                C2188811AlT.LIZIZ(sbLIZ);
                interfaceC20541015ZgLIZIZ.LIZIZ();
            }
            List<C15ZP> list = this.LIZLLL;
            ArrayList arrayList = new ArrayList();
            for (C15ZP c15zp : (ArrayList) list) {
                CopyOnWriteArrayList<C15ZW> copyOnWriteArrayList = c15zp.LIZIZ;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
                for (C15ZW c15zw : copyOnWriteArrayList) {
                    InterfaceC20541015Zg interfaceC20541015ZgLIZIZ2 = C15ZV.LIZIZ();
                    if (interfaceC20541015ZgLIZIZ2 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("triggerKey_strategyKey: ");
                        sbLIZ2.append(c15zp.LIZ);
                        sbLIZ2.append('-');
                        sbLIZ2.append(c15zw.LIZ);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        interfaceC20541015ZgLIZIZ2.LIZIZ();
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    arrayList2.add(unit);
                }
                C19719612Di.LJJI(arrayList2, arrayList);
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.LJII = jCurrentTimeMillis2;
            this.LJI = true;
            InterfaceC20541115Zh interfaceC20541115ZhLIZJ2 = C15ZV.LIZJ();
            if (interfaceC20541115ZhLIZJ2 != null) {
                interfaceC20541115ZhLIZJ2.LIZIZ("lastUploadAlogTimeStamp", jCurrentTimeMillis2);
            }
        }
        for (C20540515Zb c20540515Zb : ((LinkedHashMap) this.LIZJ).values()) {
            if (c20540515Zb.LIZIZ == EnumC1781430wST.OPENED) {
                c20540515Zb.LJ();
                c20540515Zb.LIZLLL(c20540515Zb.LIZJ() + this.LIZ);
            }
        }
        for (C15ZP c15zp2 : (ArrayList) this.LIZLLL) {
            for (C15ZW c15zw2 : c15zp2.LIZIZ) {
                if (c15zw2 instanceof C15ZY) {
                    LIZIZ((C15ZY) c15zw2, c15zp2);
                }
                if (c15zw2 instanceof C15ZH) {
                    Object obj = ((LinkedHashMap) this.LIZJ).get(c15zw2.LIZIZ);
                    if (Intrinsics.LJFF(c15zw2.LIZ, "ScheduleBreakShowStrategy")) {
                        throw null;
                    }
                    if (obj != null) {
                        throw null;
                    }
                }
            }
        }
    }

    public C15ZQ(long j) {
        this.LIZ = j;
    }

    public final void LIZ(C15ZU c15zu, C15ZP c15zp) {
        C20540515Zb c20540515Zb = (C20540515Zb) ((LinkedHashMap) this.LIZJ).get(c15zu.LIZIZ);
        if (c20540515Zb == null) {
            return;
        }
        AwS161S1200000_31 awS161S1200000_31 = c15zu.LJI;
        if (awS161S1200000_31 != null) {
            awS161S1200000_31.invoke(c20540515Zb, c15zu);
        }
        c15zu.LIZLLL = c20540515Zb.LIZJ();
        InterfaceC20541015Zg interfaceC20541015ZgLIZIZ = C15ZV.LIZIZ();
        if (interfaceC20541015ZgLIZIZ != null) {
            interfaceC20541015ZgLIZIZ.LIZ("pnsscreensdk_trigger_callback", new JSONObject().put("trigger_key", c15zp.LIZ).put("strategy_key", c15zu.LIZ).put("timerbox_key", c20540515Zb.LIZ), null);
        }
        InterfaceC20540815Ze interfaceC20540815ZeLIZ = C15ZV.LIZ();
        if (interfaceC20540815ZeLIZ != null) {
            interfaceC20540815ZeLIZ.LIZ("pnsscreensdk_trigger_callback", C2097608Jq.LJIIIIZZ(new Pair("trigger_key", c15zp.LIZ), new Pair("strategy_key", c15zu.LIZ), new Pair("timerbox_key", c20540515Zb.LIZ)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(C15ZY c15zy, C15ZP c15zp) {
        C20540515Zb c20540515Zb = (C20540515Zb) ((LinkedHashMap) this.LIZJ).get(c15zy.LIZIZ);
        if (c20540515Zb != null && c20540515Zb.LIZJ() - c15zy.LIZLLL() >= c15zy.LJ().invoke().intValue() && c15zy.LJ().invoke().intValue() > 0) {
            if (c15zy.LIZJ(c15zp)) {
                int i = c15zy.LIZLLL;
                if (i >= 0 && i < c15zy.LJ) {
                    c15zp.LJ(c15zy, EnumC992810bwV.REMOVED_BY_REACH_REPEAT);
                    return;
                }
                Object obj = ((LinkedHashMap) this.LIZJ).get(c15zy.LIZIZ);
                if (obj == null) {
                    return;
                }
                Function2<C20540515Zb, C15ZW, Unit> function2LIZ = c15zy.LIZ();
                if (function2LIZ != 0) {
                    function2LIZ.invoke(obj, c15zy);
                }
                c15zy.LJ++;
                c15zy.LJFF(c20540515Zb.LIZJ());
                InterfaceC20541015Zg interfaceC20541015ZgLIZIZ = C15ZV.LIZIZ();
                if (interfaceC20541015ZgLIZIZ != null) {
                    interfaceC20541015ZgLIZIZ.LIZ("pnsscreensdk_trigger_callback", new JSONObject().put("trigger_key", c15zp.LIZ).put("strategy_key", c15zy.LIZ).put("timerbox_key", c20540515Zb.LIZ).put("called_times", c15zy.LJ).put("repeats", c15zy.LIZLLL), null);
                }
                InterfaceC20540815Ze interfaceC20540815ZeLIZ = C15ZV.LIZ();
                if (interfaceC20540815ZeLIZ == null) {
                    return;
                }
                interfaceC20540815ZeLIZ.LIZ("pnsscreensdk_trigger_callback", C2097608Jq.LJIIIIZZ(new Pair("trigger_key", c15zp.LIZ), new Pair("strategy_key", c15zy.LIZ), new Pair("timerbox_key", c20540515Zb.LIZ)));
                return;
            }
            InterfaceC20541015Zg interfaceC20541015ZgLIZIZ2 = C15ZV.LIZIZ();
            if (interfaceC20541015ZgLIZIZ2 == null) {
                return;
            }
            interfaceC20541015ZgLIZIZ2.LIZ("pnsscreensdk_cannot_perform_callback", new JSONObject().put("trigger_key", c15zp.LIZ).put("strategy_key", c15zy.LIZ).put("timerbox_key", c20540515Zb.LIZ), null);
        }
    }
}
