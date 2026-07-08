package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo;
import com.ss.android.ugc.aweme.internalshare.impl.datamgr.reverse.IQuickShareReverseService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS15S1001000_3;
import kotlin.jvm.internal.AwS33S1101000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0leZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366090leZ implements InterfaceC883330Yl1, InterfaceC1366120lec, InterfaceC1366150lef {
    public static final C01GW<C1366090leZ> LLJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(511));
    public final /* synthetic */ C1366840lfm LL;
    public final /* synthetic */ C1366130led LLILLJJLI;
    public final /* synthetic */ C789060UxM LLILLL;
    public final /* synthetic */ C1366110leb LLILZ;
    public final C1382360m4o LLILZIL;
    public final C1366770lff LLILZLL;
    public final C054G LLIZ;
    public final ConcurrentHashMap<String, List<SharePanelItemInfo>> LLIZLLLIL;
    public volatile boolean LLJ;

    @Override // X.InterfaceC1366150lef
    public final List<SharePanelItemInfo> LIZ(String str) {
        return this.LL.LIZ(str);
    }

    @Override // X.InterfaceC1366120lec
    public final List<C0Y8T> LIZIZ() {
        return this.LLILZIL.LIZIZ();
    }

    @Override // X.InterfaceC1366150lef
    public final List<SharePanelItemInfo> LIZJ(String str) {
        return this.LL.LIZJ(str);
    }

    public final Object LJI(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        return this.LL.LJI(i, str, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0leb] */
    public C1366090leZ() {
        C1382360m4o c1382360m4o = new C1382360m4o();
        C1366770lff c1366770lff = new C1366770lff();
        this.LL = new C1366840lfm(c1382360m4o);
        this.LLILLJJLI = new C1366130led();
        this.LLILLL = new C789060UxM();
        this.LLILZ = new Object() { // from class: X.0leb
        };
        this.LLILZIL = c1382360m4o;
        this.LLILZLL = c1366770lff;
        this.LLIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        this.LLIZLLLIL = new ConcurrentHashMap<>();
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        C883250Ykt.LIZIZ(this);
    }

    public static String LJIIJJI(String str) {
        if (str == null || str.length() == 0) {
            return "default";
        }
        return str;
    }

    public final void LJIIIIZZ(String str) {
        C789040UxK c789040UxKRemove = this.LLILLL.LIZ.remove(str);
        if (c789040UxKRemove != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
            c2344009Gk.LIZ((System.currentTimeMillis() - c789040UxKRemove.LIZ) / 1000.0d, "latency");
            c2344009Gk.LIZJ(c789040UxKRemove.LIZIZ ? 1 : 0, "from_local");
            C20684815ws.LJIILLIIL("ci_sorted_list_consume_latency", c2344009Gk.LIZ);
        }
    }

    @Override // X.InterfaceC883330Yl1
    public final void LJII(EnumC883280Ykw enumC883280Ykw, C883460YlE c883460YlE) {
        this.LLIZLLLIL.clear();
        this.LLILLL.LIZ.clear();
        C1366770lff c1366770lff = this.LLILZLL;
        c1366770lff.LL.clear();
        c1366770lff.LLILLJJLI.clear();
        IQuickShareReverseService iQuickShareReverseService = (IQuickShareReverseService) PluggableExtentionKt.pluggableSpiForReal(IQuickShareReverseService.class);
        if (iQuickShareReverseService != null) {
            iQuickShareReverseService.LIZ();
        }
    }

    public final List<SharePanelItemInfo> LJFF(String str, int i, InterfaceC1366180lei interfaceC1366180lei) {
        List<SharePanelItemInfo> listLJFF;
        if (interfaceC1366180lei != null) {
            interfaceC1366180lei.LIZIZ("start_local_data");
        }
        String strLJIIJJI = LJIIJJI(str);
        List<SharePanelItemInfo> list = this.LLIZLLLIL.get(strLJIIJJI);
        if (list != null) {
            LJIIIIZZ(strLJIIJJI);
            listLJFF = new ArrayList<>(list);
        } else {
            C1720006oQ.LIZLLL(new AwS15S1001000_3(strLJIIJJI, i, 1), false);
            listLJFF = this.LL.LJFF(i, strLJIIJJI);
            C1720006oQ.LIZLLL(new AwS33S1101000_3(strLJIIJJI, (String) i, (int) listLJFF, (List<SharePanelItemInfo>) 0), false);
            this.LLIZLLLIL.put(strLJIIJJI, C13LP.LLIIII(listLJFF));
            C1366840lfm c1366840lfm = this.LL;
            c1366840lfm.getClass();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            long j = c1366840lfm.LJ().getLong(C1366840lfm.LJII(i, strLJIIJJI, curUserId), 0L);
            C789060UxM c789060UxM = this.LLILLL;
            if (j <= 0) {
                c789060UxM.getClass();
            } else {
                c789060UxM.LIZ.put(strLJIIJJI, new C789040UxK(j, true));
            }
            LJIIIIZZ(strLJIIJJI);
        }
        if (interfaceC1366180lei != null) {
            interfaceC1366180lei.LIZIZ("end_local_data");
        }
        return listLJFF;
    }

    public final void LJIIIZ(int i, String str, List list) {
        getClass();
        if (Intrinsics.LJFF(str, "default")) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((SharePanelItemInfo) obj).idType == EnumC1473605pm.SHARE_PANEL_ID_TYPE_USER.getValue()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Long l = ((SharePanelItemInfo) it2.next()).uid;
                if (l != null) {
                    arrayList2.add(l);
                }
            }
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null) {
                iLiveOuterService.LLZZLLIL(i, arrayList2);
            }
        }
    }

    public final void LJIIJ(int i, InterfaceC1366080leY interfaceC1366080leY, String str, String str2) {
        C1720006oQ.LIZLLL(new AwS15S1001000_3(str, i, 0), false);
        C23250099c.LIZLLL(this.LLIZ, null, null, new C1366070leX(this, str, str2, i, interfaceC1366080leY, null), 3);
    }

    public final void LJIIL(int i, int i2, String str, List list) {
        C1366840lfm c1366840lfm = this.LL;
        c1366840lfm.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        String strLIZIZ = "";
        if (curUserId == null) {
            curUserId = "";
        }
        if (i2 != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("internal_share_sort_new");
            sbLIZ.append(i);
            sbLIZ.append("+_");
            sbLIZ.append(curUserId);
            sbLIZ.append("_fetch_failed");
            c1366840lfm.LJ().storeBoolean(C1366840lfm.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str), true);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("internal_share_sort_new");
            sbLIZ2.append(i);
            sbLIZ2.append("+_");
            sbLIZ2.append(curUserId);
            sbLIZ2.append("_fetch_failed");
            c1366840lfm.LJ().storeBoolean(C1366840lfm.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), str), false);
        }
        String strLIZIZ2 = C2093608Ic.LIZIZ(C051M.LJ(list, false));
        if (i == EnumC1364450lbv.SOURCE_ACTION_MINIS_PANEL.getValue()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('_');
            sbLIZ3.append(i);
            sbLIZ3.append("+_");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("internal_share_sort_new");
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append(curUserId);
        c1366840lfm.LJ().storeString(C1366840lfm.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4), str), strLIZIZ2);
        if (i2 == 0) {
            c1366840lfm.LJ().storeLong(C1366840lfm.LJII(i, str, curUserId), System.currentTimeMillis());
        }
    }
}
