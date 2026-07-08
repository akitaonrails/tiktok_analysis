package X;

import Y.AObjectS108S0000000_2;
import Y.ARunnableS28S1100000_23;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.tiktok.forestx.RequestParamsX;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.0pvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530540pvo implements InterfaceC2203861BNg, InterfaceC1542530qF9, InterfaceC1534950q2v {
    public final IResourceServiceX LIZIZ;
    public final C1537480q70 LIZJ;
    public final String LIZLLL;
    public final ConcurrentSkipListSet<String> LJ = new ConcurrentSkipListSet<>();
    public final ConcurrentSkipListSet<String> LJFF = new ConcurrentSkipListSet<>();
    public InterfaceC1530550pvp<C1530560pvq> LJI;

    @Override // X.InterfaceC1534950q2v
    public final void LJ(RequestParams requestParams) {
    }

    @Override // X.InterfaceC1542530qF9
    public final void release() {
        C1490740otc.LIZIZ(C1490740otc.LIZ, "[Preload] release preloader.", null, "PiaCore", 2);
        C1534490q2B.LIZ.remove(this);
    }

    @Override // X.InterfaceC2203861BNg
    public final void LIZ(Map map) {
        C1533020pzo c1533020pzoLJIILJJIL;
        C1537480q70 c1537480q70 = this.LIZJ;
        if (c1537480q70 != null) {
            C1530570pvr.LJFF(c1537480q70, EnumC1537150q6T.OPT_PIA_PRELOAD_STATUS, 1);
        }
        C08QT c08qt = new C08QT(C09RB.LJIJI(C09RB.LJIIIZ(C09R4.LIZLLL(C09RB.LJIJI(C13LQ.LJIIJJI(new String[]{"css", "script", "font", "image", "other"}), new C5183020f(map, (Map<String, String>) 375)), new AObjectS108S0000000_2(0)), new Function1<Object, Boolean>() { // from class: X.04aJ
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof Map);
            }
        }), AFwS231S0000000_3.get$arr$(298)));
        while (c08qt.hasNext()) {
            String str = (String) c08qt.next();
            C1537480q70 c1537480q702 = this.LIZJ;
            if (c1537480q702 != null && (c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(c1537480q702, false, null, 3)) != null) {
                RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.WEB_CHILD_RESOURCE, InputStream.class);
                requestParamsX.disableAssets = true;
                requestParamsX.groupId = this.LIZLLL;
                requestParamsX.source = "PIA_Preloader";
                requestParamsX.customParams = C2097608Jq.LJIIJ(new Pair("hybrid_channel", "PIA_Preloader"));
                c1533020pzoLJIILJJIL.LIZJ(str, requestParamsX, null);
            } else {
                IResourceServiceX iResourceServiceX = this.LIZIZ;
                if (iResourceServiceX instanceof C1533840q18) {
                    RequestParams requestParams = new RequestParams(EnumC1533980q1M.WEB_CHILD_RESOURCE);
                    requestParams.source = "pia-preload";
                    requestParams.disableBuiltin = true;
                    requestParams.needLocalFile = Boolean.FALSE;
                    requestParams.parallelLoading = true;
                    requestParams.enableCDNCache = Boolean.TRUE;
                    requestParams.netWorker = EnumC825980Wai.TTNet;
                    requestParams.customParams.put("hybrid_channel", "PIA_Preloader");
                    iResourceServiceX.preload(str, requestParams, null);
                } else {
                    this.LJ.add(str);
                    ExecutorService executorService = C2281108wj.LIZ;
                    C2281108wj.LIZIZ(EnumC2281308wl.Blocked, true, new ARunnableS28S1100000_23(this, str, 68));
                }
            }
        }
    }

    @Override // X.InterfaceC2203861BNg
    public final void LIZIZ(C2203851BNf c2203851BNf) {
        C1534490q2B.LIZ.add(this);
        this.LJI = c2203851BNf;
    }

    public final void LIZJ(String str) {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Block preload resource, url = ");
        sbLIZ.append(str);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "PiaCore", 2);
        this.LJFF.add(str);
    }

    @Override // X.InterfaceC1534950q2v
    public final void LJFF(C1533790q13 c1533790q13) {
        long jLongValue;
        long jLongValue2;
        String str = c1533790q13.LIZ.LJJJJIZL;
        if (this.LJ.contains(str)) {
            Long l = c1533790q13.LIZJ.LIZJ.get("res_load_start");
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Long l2 = c1533790q13.LIZJ.LIZJ.get("res_load_finish");
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            InterfaceC1530550pvp<C1530560pvq> interfaceC1530550pvp = this.LJI;
            if (interfaceC1530550pvp != null) {
                interfaceC1530550pvp.accept(new C1530560pvq(str, jLongValue, jLongValue2));
            }
            this.LJ.remove(str);
        }
    }

    public C1530540pvo(C1537480q70 c1537480q70, IResourceServiceX iResourceServiceX, String str) {
        this.LIZIZ = iResourceServiceX;
        this.LIZJ = c1537480q70;
        this.LIZLLL = str;
    }
}
