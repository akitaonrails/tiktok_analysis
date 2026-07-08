package X;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.util.AndroidRuntimeException;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.librarian.Librarian;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.devtoolwrapper.LynxDevtoolGlobalHelper;
import com.lynx.tasm.LynxEnv;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.tiktok.forestx.RequestParamsX;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0kDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311170kDz {
    public static final C1311170kDz LIZ = new C1311170kDz();

    public static void LIZ(final C1311190kE1 c1311190kE1) throws Throwable {
        if (Intrinsics.LJFF(C1535630q41.LIZIZ("lynx_class_warmer_type"), 0)) {
            C1298790ju1.LIZ();
        }
        C0X8C c0x8c = c1311190kE1.LIZJ;
        if (c0x8c == null) {
            c0x8c = new C0X8C() { // from class: X.0jmT
                @Override // X.C0X8C
                public final void loadLibrary(String str) {
                    try {
                        LoadSoLancet.LIZJ(str);
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        Librarian.LJFF(str);
                        LoadSoLancet.LJ(jUptimeMillis, str);
                        LoadSoLancet.LIZLLL(jUptimeMillis, str);
                        LoadSoLancet.LIZIZ(str);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        String message = th.getMessage();
                        if (message != null) {
                            C1490740otc.LIZ.LIZ(message, EnumC1490770otf.E, "LynxKitEnv");
                        }
                    }
                }
            };
        }
        final C013C c013c = new C013C();
        LynxEnv lynxEnvInst = LynxEnv.inst();
        try {
            c013c.element = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            new AndroidRuntimeException("Fresco Not Found, Image will not work normally");
        }
        if (c013c.element) {
            if (!C1322200kVm.LIZLLL) {
                C1322200kVm.LIZIZ(C1202420hOa.LIZ(), null);
            }
            lynxEnvInst.setBackgroundImageLoader(new InterfaceC1311150kDx() { // from class: X.0kDy
                @Override // X.InterfaceC1311150kDx
                public final C1315730kLL LIZ(Context context, String str) {
                    return new C1315730kLL(context, str);
                }
            });
        }
        InterfaceC1962507mR interfaceC1962507mR = new InterfaceC1962507mR() { // from class: X.0kE0
            @Override // X.InterfaceC1962507mR
            public final List<C1311670kEn> create() {
                ArrayList arrayList = new ArrayList();
                C1311190kE1 c1311190kE12 = c1311190kE1;
                C013C c013c2 = c013c;
                arrayList.addAll(c1311190kE12.LJ);
                if (c013c2.element) {
                    arrayList.addAll(new InterfaceC1962507mR() { // from class: X.0kE2
                        @Override // X.InterfaceC1962507mR
                        public final List<C1311670kEn> create() {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new C1339200kxC(56));
                            arrayList2.add(new C1339200kxC(57));
                            arrayList2.add(new C1339200kxC(58));
                            return arrayList2;
                        }
                    }.create());
                }
                return arrayList;
            }
        };
        LynxEnv.inst().setResProvider(new InterfaceC846710XJl() { // from class: X.0pvd
            /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
            @Override // X.InterfaceC846710XJl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C1288950je9 r10, X.InterfaceC846700XJk r11) {
                /*
                    Method dump skipped, instruction units count: 263
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1530430pvd.LIZ(X.0je9, X.0XJk):void");
            }
        });
        LynxEnv.inst().setCheckPropsSetter(c1311190kE1.LIZ);
        LynxEnv lynxEnvInst2 = LynxEnv.inst();
        Application applicationLIZ = C1202420hOa.LIZ();
        AbstractC1310390kCj abstractC1310390kCj = c1311190kE1.LIZLLL;
        if (abstractC1310390kCj == null) {
            abstractC1310390kCj = new AbstractC1310390kCj() { // from class: X.0q69
                @Override // X.AbstractC1310390kCj
                public final void LIZ(InterfaceC1303630k1p interfaceC1303630k1p, String str) {
                    if (C1535630q41.LJJIII) {
                        C1532680pzG.LIZ.getClass();
                        C1532950pzh c1532950pzh = C1532680pzG.LJJ;
                        RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_TEMPLATE, byte[].class);
                        requestParamsX.source = "HybridKit";
                        if (C1535630q41.LJIJ) {
                            requestParamsX.allowRedirectInternally = false;
                        }
                        JSONArray jSONArray = C1533710q0v.LIZ;
                        String strLIZLLL = C1533710q0v.LIZLLL(null, requestParamsX, str);
                        C01GW<Map<String, List<String>>> c01gw = C1537710q7N.LLJJL;
                        c1532950pzh.LIZ(C1529760puY.LIZJ(strLIZLLL), requestParamsX, new C1536970q6B(this, interfaceC1303630k1p));
                        return;
                    }
                    JSONArray jSONArray2 = C1533710q0v.LIZ;
                    IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
                    if (iResourceServiceXLIZIZ == null) {
                        C086F c086f = C086F.LIZ;
                        RunnableC1303640k1q runnableC1303640k1q = new RunnableC1303640k1q(interfaceC1303630k1p, "ResourceLoader Not Found!");
                        c086f.getClass();
                        C086F.LJII(runnableC1303640k1q);
                        return;
                    }
                    RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_TEMPLATE);
                    requestParams.loadToMemory = true;
                    if (C1535630q41.LJIJ) {
                        requestParams.allowRedirectInternally = false;
                    }
                    requestParams.needLocalFile = Boolean.FALSE;
                    String strLIZLLL2 = C1533710q0v.LIZLLL(null, requestParams, str);
                    C01GW<Map<String, List<String>>> c01gw2 = C1537710q7N.LLJJL;
                    String strLIZJ = C1529760puY.LIZJ(strLIZLLL2);
                    if (!Intrinsics.LJFF(strLIZJ, str)) {
                        requestParams.customParams.put("resource_url", str);
                    }
                    iResourceServiceXLIZIZ.fetchResourceAsyncIfNeed(strLIZJ, requestParams, new C1536960q6A(this, interfaceC1303630k1p));
                }
            };
        }
        lynxEnvInst2.init(applicationLIZ, c0x8c, abstractC1310390kCj, interfaceC1962507mR, null);
        if (LynxEnv.inst().isNativeLibraryLoaded()) {
            new AbstractC1311280kEA() { // from class: X.0kE9
                {
                    try {
                        ALog.getALogSimpleWriteFuncAddr();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        new AndroidRuntimeException("Just warning log, No ALog dependency found");
                    }
                }
            };
            if (c1311190kE1.LJI != null) {
                C1202420hOa.LIZ();
            }
            LynxLog.setMinimumLoggingLevel(c1311190kE1.LJIIJ);
        }
        Iterator<T> it2 = c1311190kE1.LJFF.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            LynxEnv.inst().registerModule((String) entry.getKey(), ((C1311220kE4) entry.getValue()).LIZ, ((C1311220kE4) entry.getValue()).LIZIZ);
        }
        c1311190kE1.LJII.invoke(LynxEnv.inst());
        if (!C1202420hOa.LIZ) {
            LynxEnv.inst().enableRedBox(false);
            LynxEnv.inst().enableLynxDebug(false);
            return;
        }
        List<InterfaceC1535920q4U> list = c1311190kE1.LIZIZ;
        if (list.size() <= 0) {
            return;
        }
        LynxEnv.inst().enableLynxDebug(true);
        if (!C1202420hOa.LIZIZ) {
            LynxEnv.inst().enableDevtool(true);
        }
        LynxDevtoolGlobalHelper.getInstance().registerCardListener(C1311210kE3.LIZIZ);
        for (InterfaceC1535920q4U interfaceC1535920q4U : list) {
            List<InterfaceC1535920q4U> list2 = C1311210kE3.LIZ;
            synchronized (list2) {
                try {
                    ((ArrayList) list2).add(interfaceC1535920q4U);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
    }
}
