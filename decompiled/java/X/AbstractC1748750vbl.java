package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vbl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1748750vbl extends AbstractC1748790vbp {
    public static final ConcurrentHashMap<AbstractC1748750vbl, StringBuilder> LJIIJ = new ConcurrentHashMap<>();
    public boolean LJ;
    public final LaneParams LJFF;
    public InterfaceC1748810vbr LJI;
    public View LJII;
    public String LJIIIIZZ;
    public PageFinder LJIIIZ;

    public void LJFF(LaneParams laneParams) {
    }

    public void LJI(LaneParams laneParams) {
    }

    public void LJII(LaneParams laneParams, LaneParams laneParams2) {
    }

    public static void LIZLLL(AbstractC1748750vbl abstractC1748750vbl) {
        InterfaceC1748860vbw interfaceC1748860vbw;
        abstractC1748750vbl.getClass();
        C1748770vbn c1748770vbn = new C1748770vbn();
        c1748770vbn.LIZ = abstractC1748750vbl;
        c1748770vbn.LIZIZ.put(abstractC1748750vbl.LIZIZ, abstractC1748750vbl.LJFF);
        if (C1748830vbt.LIZ) {
            LJIIJ.put(abstractC1748750vbl, new StringBuilder());
            StringBuilder sb = LJIIJ.get(abstractC1748750vbl);
            if (sb != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("back fill trace: \n *********** EVENT ");
                sbLIZ.append(abstractC1748750vbl.LIZ);
                sbLIZ.append(" BACK FILL START *********** \n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        InterfaceC1748810vbr interfaceC1748810vbr = abstractC1748750vbl.LJI;
        if (interfaceC1748810vbr != null) {
            C1748760vbm.LIZ(interfaceC1748810vbr, c1748770vbn, false, null);
        }
        View view = abstractC1748750vbl.LJII;
        if (view != null) {
            Object tag = view.getTag(R.id.gia);
            if ((tag instanceof InterfaceC1748860vbw) && (interfaceC1748860vbw = (InterfaceC1748860vbw) tag) != null) {
                interfaceC1748860vbw.Q3(c1748770vbn);
            }
        }
    }

    public final LaneParams LIZIZ(LaneParams laneParams) {
        EnumC550960LjC enumC550960LjC;
        if (this.LJ) {
            return laneParams;
        }
        LaneParams laneParams2 = new LaneParams();
        laneParams2.putAll(laneParams.getNotCheckParams());
        ArrayList arrayList = new ArrayList();
        for (C1748840vbu c1748840vbu : (C1748840vbu[]) this.LIZJ.getValue()) {
            C1747940vaS[] c1747940vaSArr = c1748840vbu.LIZIZ;
            if (c1747940vaSArr.length == 0) {
                enumC550960LjC = EnumC550960LjC.NEEDED;
            } else {
                enumC550960LjC = EnumC550960LjC.NO_NEED;
                for (C1747940vaS c1747940vaS : c1747940vaSArr) {
                    enumC550960LjC = EnumC550960LjC.NO_NEED;
                    for (C1748000vaY c1748000vaY : c1747940vaS.LIZ) {
                        if (Intrinsics.LJFF(c1748000vaY.LIZ, "")) {
                            enumC550960LjC = EnumC550960LjC.TAKE_IF_EXIST;
                        } else if (Intrinsics.LJFF(String.valueOf(laneParams.get((Object) c1748000vaY.LIZ)), c1748000vaY.LIZIZ) || (Intrinsics.LJFF(c1748000vaY.LIZIZ, "******") && laneParams.get((Object) c1748000vaY.LIZ) != null)) {
                            if (enumC550960LjC == EnumC550960LjC.NO_NEED) {
                                enumC550960LjC = EnumC550960LjC.NEEDED;
                            }
                        } else {
                            enumC550960LjC = EnumC550960LjC.NO_NEED;
                            break;
                        }
                    }
                    if (enumC550960LjC != EnumC550960LjC.NO_NEED) {
                        break;
                    }
                }
            }
            if (enumC550960LjC != EnumC550960LjC.NO_NEED) {
                Object obj = laneParams.get((Object) c1748840vbu.LIZ);
                if (obj != null) {
                    laneParams2.put(c1748840vbu.LIZ, obj);
                } else if (enumC550960LjC == EnumC550960LjC.NEEDED) {
                    arrayList.add(c1748840vbu.LIZ);
                }
            }
        }
        for (C1748840vbu c1748840vbu2 : AbstractC1748790vbp.LIZLLL.getValue()) {
            Object obj2 = laneParams.get((Object) c1748840vbu2.LIZ);
            if (obj2 != null) {
                laneParams2.put(c1748840vbu2.LIZ, obj2);
            }
        }
        if ((!arrayList.isEmpty()) && C1748830vbt.LIZ) {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS268S0000000_26.get$arr$(746), 30);
            HashMap map = new HashMap();
            map.put("exist", laneParams2);
            map.put("lack", strLJJLIIIJ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("event ");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" LACK of params: ");
            sbLIZ.append(strLJJLIIIJ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ.LLIILII(), null, new C03LB(strLIZIZ, null), 2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("event ");
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(" LACK of params:");
            sbLIZ2.append(strLJJLIIIJ);
            sbLIZ2.append("\n\rexist:");
            sbLIZ2.append(laneParams2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        return laneParams2;
    }

    public final void LIZJ(boolean z) {
        StringBuilder sb;
        if (z) {
            try {
                LIZLLL(this);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("slark: failed to send event ");
                sbLIZ.append(this.LIZ);
                C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        if (C1748830vbt.LIZ && (sb = LJIIJ.get(this)) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" *********** EVENT ");
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(" BACK FILL END *********** \n");
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        ConcurrentHashMap<AbstractC1748750vbl, StringBuilder> concurrentHashMap = LJIIJ;
        if (concurrentHashMap.get(this) != null) {
            concurrentHashMap.remove(this);
        }
        new AwS570S0100000_26(this, 1583).invoke();
    }

    public final void LJIIIIZZ(Function1 function1) {
        StringBuilder sb;
        LaneParams laneParams = new LaneParams();
        if (function1 != null) {
            function1.invoke(laneParams);
        }
        if (C1748830vbt.LIZ && (sb = LJIIJ.get(this)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("self params:\n");
            sbLIZ.append(C1010603xI.LIZIZ(laneParams));
            sbLIZ.append('\n');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        LJII(laneParams, this.LJFF);
        this.LJFF.withNotCheckParams(laneParams.getNotCheckParams());
        this.LJFF.putAll(laneParams);
    }

    public AbstractC1748750vbl(String str, String str2) {
        super(str, str2);
        this.LJFF = new LaneParams();
    }

    public final void LJ(View view, Function1<? super LaneParams, Unit> function1, String str, PageFinder pageFinder) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        IECommerceHostService iECommerceHostService2;
        boolean z2;
        String name;
        String name2 = null;
        if (view.getParent() == null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name3 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService2).isDebug()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("slark, event ");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", parent is null");
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(view);
        if (interfaceC1748810vbrLIZ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("slark, event ");
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(", node is null");
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name2 = iECommerceHostService.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("event ");
                sbLIZ3.append(this.LIZ);
                sbLIZ3.append(", node is null");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        this.LJI = interfaceC1748810vbrLIZ;
        this.LJIIIIZZ = str;
        this.LJIIIZ = pageFinder;
        this.LJII = view;
        LIZLLL(this);
        LJIIIIZZ(function1);
        LIZJ(false);
    }
}
