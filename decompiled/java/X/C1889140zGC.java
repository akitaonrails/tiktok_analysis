package X;

import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidgetContainer;
import com.ss.android.ugc.aweme.inbox.widget.v2.inbox.InboxFragmentWidgetInjectProtocol;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS271S0000000_28;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0zGC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1889140zGC implements InterfaceC1889260zGO {
    public static final C1889140zGC LIZ;
    public static volatile Map<AbstractC1865990yer, C1889180zGG> LIZIZ;
    public static volatile Map<AbstractC1865990yer, C1889180zGG> LIZJ;
    public static C1889160zGE LIZLLL;
    public static final EnumC1889240zGM LJ;
    public static final String LJFF;

    public final synchronized Map<AbstractC1865990yer, C1889180zGG> LJFF() {
        Map<AbstractC1865990yer, C1889180zGG> mapLJ;
        if (LIZIZ == null) {
            LIZIZ = LIZLLL();
        }
        mapLJ = LIZIZ;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return mapLJ;
    }

    static {
        C1889140zGC c1889140zGC = new C1889140zGC();
        LIZ = c1889140zGC;
        EventBus.LIZLLL().LJIJJ(c1889140zGC);
        LIZIZ = LIZLLL();
        LJ = EnumC1889240zGM.INBOX;
        LJFF = "inbox_first_page";
    }

    public static Map LIZLLL() {
        List<InboxFragmentWidgetInjectProtocol> listLIZ = C1554680qYk.LIZ.LIZ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
        for (InboxFragmentWidgetInjectProtocol inboxFragmentWidgetInjectProtocol : listLIZ) {
            arrayList.add(new C1889180zGG(inboxFragmentWidgetInjectProtocol.j0(), inboxFragmentWidgetInjectProtocol.z0(), inboxFragmentWidgetInjectProtocol.identity(), inboxFragmentWidgetInjectProtocol.enable()));
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : arrayList) {
            linkedHashMap.put(((C1889180zGG) obj).LIZJ, obj);
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC1889260zGO
    public final Map<AbstractC1865990yer, Integer> LIZJ() {
        C1889160zGE c1889160zGE = LIZLLL;
        if (c1889160zGE == null) {
            return C2097608Jq.LJ();
        }
        HashMap map = new HashMap();
        List<C1889180zGG> list = c1889160zGE.LIZJ;
        if (list == null) {
            return map;
        }
        int i = 0;
        for (Object obj : (ArrayList) list) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            map.put(((C1889180zGG) obj).LIZJ, Integer.valueOf(i));
            i = i2;
        }
        return map;
    }

    @Override // X.InterfaceC1889260zGO
    public final EnumC1889240zGM LIZ() {
        return LJ;
    }

    @Override // X.InterfaceC1889260zGO
    public final String LIZIZ() {
        return LJFF;
    }

    public static C1889160zGE LJ(Map map) {
        if (LIZLLL == null) {
            C1889160zGE c1889160zGE = new C1889160zGE();
            c1889160zGE.LIZ = map;
            c1889160zGE.LIZIZ.getClass();
            ArrayList arrayList = new ArrayList();
            C1889150zGD.LIZ(C1866000yes.LIZIZ, arrayList, map, AFwS271S0000000_28.get$arr$(275));
            C1889150zGD.LIZ(C1866070yez.LIZIZ, arrayList, map, AFwS271S0000000_28.get$arr$(275));
            C1889150zGD.LIZ(C1866100yf2.LIZIZ, arrayList, map, AFwS271S0000000_28.get$arr$(271));
            C1889150zGD.LIZ(C1866060yey.LIZIZ, arrayList, map, AFwS271S0000000_28.get$arr$(275));
            C1889150zGD.LIZ(C1866020yeu.LIZIZ, arrayList, map, AFwS271S0000000_28.get$arr$(275));
            C1889150zGD.LIZ(C1866120yf4.LIZIZ, arrayList, map, AFwS271S0000000_28.get$arr$(272));
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "inbox_widget_container_optimize", true) == 1) {
                C1889150zGD.LIZ(C1866130yf5.LIZIZ, arrayList, map, AFwS271S0000000_28.get$arr$(273));
            } else {
                C1889150zGD.LIZ(C1866110yf3.LIZIZ, arrayList, map, AFwS271S0000000_28.get$arr$(274));
            }
            C1889150zGD.LIZ(C0Z3K.LIZIZ, arrayList, map, AFwS271S0000000_28.get$arr$(275));
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "inbox_widget_container_optimize", true) == 1) {
                C1889150zGD.LIZ(C1866080yf0.LIZIZ, arrayList, map, AFwS271S0000000_28.get$arr$(275));
            } else {
                C1889150zGD.LIZ(C1866010yet.LIZIZ, arrayList, map, AFwS271S0000000_28.get$arr$(275));
            }
            c1889160zGE.LIZJ = arrayList;
            LIZLLL = c1889160zGE;
        }
        return LIZLLL;
    }

    public final synchronized Map LJI(InboxWidgetContainer inboxWidgetContainer) {
        Map<AbstractC1865990yer, C1889180zGG> mapLJ;
        LinkedHashMap linkedHashMap;
        if (LIZJ == null) {
            List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(inboxWidgetContainer), InboxFragmentWidgetInjectProtocol.class, false);
            if (listLIZIZ != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
                for (InboxFragmentWidgetInjectProtocol inboxFragmentWidgetInjectProtocol : (ArrayList) listLIZIZ) {
                    arrayList.add(new C1889180zGG(inboxFragmentWidgetInjectProtocol.j0(), inboxFragmentWidgetInjectProtocol.z0(), inboxFragmentWidgetInjectProtocol.identity(), inboxFragmentWidgetInjectProtocol.enable()));
                }
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (Object obj : arrayList) {
                    linkedHashMap.put(((C1889180zGG) obj).LIZJ, obj);
                }
            } else {
                linkedHashMap = null;
            }
            LIZJ = linkedHashMap;
        }
        mapLJ = LIZJ;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return mapLJ;
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onLoginStateChangeEvent(C486550J6f c486550J6f) {
        LIZIZ = null;
    }
}
