package X;

import android.content.Context;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.13lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20107413lw {
    public static AbstractC20111213mY LIZJ;
    public static Executor LIZLLL;
    public static C443120HZe<String, Long, ? extends C20109213mE> LJ;
    public static C1540210qBP LJFF;
    public static Runnable LJI;
    public static final C20107413lw LIZ = new C20107413lw();
    public static final Map<String, InterfaceC20108013m2> LIZIZ = new LinkedHashMap();
    public static final C20107313lv LJII = new InterfaceC2373409Rs() { // from class: X.13lv
        @Override // X.InterfaceC2373409Rs
        public final void LIZ(C20109213mE c20109213mE) {
            synchronized (C20107413lw.LIZ) {
                try {
                    C443120HZe<String, Long, ? extends C20109213mE> c443120HZe = C20107413lw.LJ;
                    if (c443120HZe != null) {
                        C20107413lw.LJ = new C443120HZe<>(c443120HZe.getFirst(), c443120HZe.getSecond(), c20109213mE);
                    }
                    Runnable runnable = C20107413lw.LJI;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // X.InterfaceC2373409Rs
        public final void LIZIZ(Throwable th) {
            synchronized (C20107413lw.LIZ) {
                try {
                    Runnable runnable = C20107413lw.LJI;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    };

    public static InterfaceC20108013m2 LIZIZ(String str) {
        String strLIZ;
        InterfaceC20108013m2 interfaceC20108013m2;
        try {
            strLIZ = C1946707jt.LIZ(UriProtector.parse(str), "prefetch_business");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (strLIZ != null && (interfaceC20108013m2 = (InterfaceC20108013m2) ((LinkedHashMap) LIZIZ).get(strLIZ)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Get Processor: ");
            sbLIZ.append(interfaceC20108013m2);
            sbLIZ.append(" For Url: ");
            sbLIZ.append(str);
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
            return interfaceC20108013m2;
        }
        C189200o6.m2constructorimpl(null);
        return LIZJ;
    }

    public static AbstractC20111213mY LIZ(Context context, final C0VSJ c0vsj, final Map map, C2373809Rw c2373809Rw) {
        AbstractC20109813mK<C20110913mV> abstractC20109813mK = new AbstractC20109813mK<C20110913mV>() { // from class: X.13mS
            @Override // X.AbstractC20109813mK
            public final AbstractC20111213mY LIZIZ(String str, C20110313mP c20110313mP, C20110013mM c20110013mM) {
                C20110913mV c20110913mV = new C20110913mV(str, c20110313mP, c20110013mM);
                if (Intrinsics.LJFF(str, "default_business")) {
                    C20110913mV.LIZIZ = c20110913mV;
                }
                return c20110913mV;
            }
        };
        abstractC20109813mK.LJI = false;
        abstractC20109813mK.LIZIZ = LIZLLL;
        abstractC20109813mK.LIZ = new C0TKJ(context, "spark_prefetch_store");
        abstractC20109813mK.LIZJ = c2373809Rw;
        abstractC20109813mK.LIZLLL = new InterfaceC1888707aX() { // from class: X.0X8H
            @Override // X.InterfaceC1888707aX
            public final List<String> LIZ() {
                C1533790q13 c1533790q13LIZIZ;
                File fileLJIIJ;
                ArrayList arrayList = new ArrayList();
                for (String str : map.keySet()) {
                    C0VSJ c0vsj2 = new C0VSJ(c0vsj, str);
                    if (c0vsj2.exists()) {
                        for (String str2 : map.get(str)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str2);
                            sbLIZ.append(File.separator);
                            sbLIZ.append("prefetch.json");
                            C0VSJ c0vsj3 = new C0VSJ(c0vsj2, C2188811AlT.LIZIZ(sbLIZ));
                            if (c0vsj3.exists()) {
                                try {
                                    arrayList.add(C08KC.LIZJ(new BufferedReader(new C0VSF(c0vsj3))));
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        }
                        try {
                            JSONArray jSONArray = C1533710q0v.LIZ;
                            IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
                            if (iResourceServiceXLIZIZ != null) {
                                RequestParams requestParams = new RequestParams(null, 1, null);
                                requestParams.channel = "gecko_hybrid_prefetch_config";
                                requestParams.bundle = "prefetch.json";
                                requestParams.consumeType = File.class;
                                C1533910q1F c1533910q1FCreateSyncRequest = iResourceServiceXLIZIZ.createSyncRequest("", requestParams);
                                if (c1533910q1FCreateSyncRequest != null && (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) != null && (fileLJIIJ = C1533790q13.LJIIJ(c1533790q13LIZIZ)) != null) {
                                    arrayList.add(C08KC.LIZJ(new BufferedReader(new C0VSF(fileLJIIJ))));
                                }
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                }
                return arrayList;
            }
        };
        return abstractC20109813mK.LIZ();
    }

    public final void LIZJ(Context context, Executor executor, C0VSJ c0vsj, Map map, C2373809Rw c2373809Rw) {
        if (c0vsj.exists() && LIZLLL == null) {
            synchronized (this) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = executor;
                        LIZJ = LIZ(context, c0vsj, map, c2373809Rw);
                        C1062300dka.LIZLLL(C20107613ly.class, null, "Spark", 2);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
