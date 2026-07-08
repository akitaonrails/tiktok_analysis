package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.Action;
import com.ss.android.ugc.aweme.model.CommonLogParams;
import com.ss.android.ugc.aweme.model.ViewObject;
import com.ss.android.ugc.aweme.model.ViewObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01BJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01BJ implements InterfaceC655060Pmi, InterfaceC293701Bv {
    public final Context LIZ;
    public final C01BK LIZIZ;
    public final C14QT LIZJ = new C14QT(this);
    public final C041800Cy LIZLLL = new C041800Cy();
    public final Map<C13IQ<?>, List<C01BL>> LJ = new LinkedHashMap();

    @Override // X.InterfaceC655060Pmi
    public final void release() {
        ((LinkedHashMap) this.LJ).clear();
        C041800Cy c041800Cy = this.LIZLLL;
        c041800Cy.LIZ = 0L;
        ((LinkedHashMap) c041800Cy.LIZIZ).clear();
        ((LinkedHashMap) c041800Cy.LIZJ).clear();
        ((ArrayList) c041800Cy.LIZLLL).clear();
    }

    @Override // X.InterfaceC655060Pmi
    public final View LIZ(ViewObjectWrapper viewObjectWrapper) {
        View viewLJ;
        long jElapsedRealtime;
        ((LinkedHashMap) this.LJ).clear();
        C041800Cy c041800Cy = this.LIZLLL;
        c041800Cy.LIZ = 0L;
        ((LinkedHashMap) c041800Cy.LIZIZ).clear();
        ((LinkedHashMap) c041800Cy.LIZJ).clear();
        ((ArrayList) c041800Cy.LIZLLL).clear();
        c041800Cy.LIZ = SystemClock.elapsedRealtime();
        try {
            viewLJ = LJ(viewObjectWrapper);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C041800Cy c041800Cy2 = this.LIZLLL;
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            ((ArrayList) c041800Cy2.LIZLLL).add(new C041700Cx("root", message));
            viewLJ = null;
        }
        this.LIZLLL.getClass();
        if (viewLJ != null) {
            C041800Cy c041800Cy3 = this.LIZLLL;
            if (c041800Cy3.LIZ > 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime() - c041800Cy3.LIZ;
            } else {
                jElapsedRealtime = 0;
            }
            Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(c041800Cy3.LIZJ);
            List<C041700Cx> listLLIIII = C13LP.LLIIII(c041800Cy3.LIZLLL);
            if (jElapsedRealtime > 0) {
                Pair[] pairArr = new Pair[5];
                pairArr[0] = new Pair("eventName", "rd_search_dynamic_render_monitor");
                pairArr[1] = new Pair("total_duration_ms", String.valueOf(jElapsedRealtime));
                pairArr[2] = new Pair("component_durations", C786410Ut5.J3(new JSONObject(mapLJIIZILJ)));
                pairArr[3] = new Pair("error_count", String.valueOf(listLLIIII.size()));
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
                for (C041700Cx c041700Cx : listLLIIII) {
                    arrayList.add(C2097608Jq.LJIIIIZZ(new Pair("component", c041700Cx.LIZ), new Pair("message", c041700Cx.LIZIZ)));
                }
                pairArr[4] = new Pair("errors", new JSONArray((Collection) arrayList).toString());
                Action action = new Action("reportTrack", C2097608Jq.LJIIIIZZ(pairArr), null, null, null, 28, null);
                C01BK c01bk = this.LIZIZ;
                if (c01bk != null) {
                    c01bk.LIZ(viewLJ, action);
                }
            }
        }
        if (viewLJ == null) {
            return null;
        }
        C786410Ut5.W5(viewLJ, new ViewGroup.LayoutParams(-1, -2));
        return viewLJ;
    }

    @Override // X.InterfaceC655060Pmi
    public final List LIZIZ(C19719912Dl c19719912Dl) {
        List list = (List) ((LinkedHashMap) this.LJ).get(c19719912Dl);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if ((obj instanceof C01BL) && obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC655060Pmi
    public final C01BL LIZJ(C19719912Dl c19719912Dl) {
        List list = (List) ((LinkedHashMap) this.LJ).get(c19719912Dl);
        if (list == null) {
            return null;
        }
        Object objLJJJLL = C13LP.LJJJLL(list);
        if (!(objLJJJLL instanceof C01BL)) {
            return null;
        }
        return (C01BL) objLJJJLL;
    }

    public final View LJ(ViewObjectWrapper viewObjectWrapper) {
        String str;
        long jLongValue;
        ViewObject viewObject;
        CommonLogParams commonLogParams;
        ViewObject viewObject2;
        if (viewObjectWrapper == null || (viewObject2 = viewObjectWrapper.renderInfo) == null || (str = viewObject2.name) == null) {
            str = "unknown";
        }
        this.LIZLLL.LIZIZ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        View viewLIZ = null;
        try {
            C14QT c14qt = this.LIZJ;
            Context context = this.LIZ;
            if (viewObjectWrapper != null) {
                viewObject = viewObjectWrapper.renderInfo;
            } else {
                viewObject = null;
            }
            if (viewObjectWrapper == null) {
                commonLogParams = null;
            } else {
                commonLogParams = viewObjectWrapper.commonLogParams;
            }
            viewLIZ = c14qt.LIZ(context, viewObject, commonLogParams, this.LIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C041800Cy c041800Cy = this.LIZLLL;
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            ((ArrayList) c041800Cy.LIZLLL).add(new C041700Cx(str, message));
        }
        C041800Cy c041800Cy2 = this.LIZLLL;
        Long lRemove = c041800Cy2.LIZIZ.remove(str);
        if (lRemove != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - lRemove.longValue();
            Map<String, Long> map = c041800Cy2.LIZJ;
            Long l = (Long) ((LinkedHashMap) map).get(str);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            map.put(str, Long.valueOf(jLongValue + jElapsedRealtime));
        }
        return viewLIZ;
    }

    public C01BJ(Context context, C01BK c01bk) {
        this.LIZ = context;
        this.LIZIZ = c01bk;
    }

    @Override // X.InterfaceC293701Bv
    public final void LIZLLL(C19719912Dl c19719912Dl, C01BL c01bl) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJ;
        Object arrayList = linkedHashMap.get(c19719912Dl);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(c19719912Dl, arrayList);
        }
        ((List) arrayList).add(c01bl);
    }
}
