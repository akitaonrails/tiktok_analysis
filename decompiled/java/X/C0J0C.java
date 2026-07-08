package X;

import com.bytedance.android.live.dynamicstrategy.refactor.model.SceneConfig;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livesdk.signal.LiveEpiExpandLifecycleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J0C, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J0C {
    public static final List<SceneConfig> LIZ = new ArrayList();
    public static final Object LIZIZ = new Object();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(333));

    public static List LIZIZ(String str) {
        Object next;
        List arrayList;
        List<C0J0E> features;
        synchronized (LIZIZ) {
            try {
                Iterator it2 = ((ArrayList) LIZ).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((SceneConfig) next).getSceneName(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                SceneConfig sceneConfig = (SceneConfig) next;
                if (sceneConfig != null && (features = sceneConfig.getFeatures()) != null) {
                    arrayList = new ArrayList(features);
                } else {
                    arrayList = C13BV.INSTANCE;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    public static void LIZ(String str, Map map) {
        String string;
        Object obj;
        List<String> list;
        if (LiveEpiExpandLifecycleSetting.INSTANCE.getValue()) {
            synchronized (LIZIZ) {
                try {
                    if (((ArrayList) LIZ).isEmpty() && (list = (List) LIZJ.getValue()) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : list) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("sceneConfig = ");
                            sbLIZ.append(str2);
                            C0J6C.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                            try {
                                SceneConfig sceneConfig = (SceneConfig) C19748512Ol.LIZJ.LJII(str2, SceneConfig.class);
                                if (sceneConfig != null) {
                                    arrayList.add(sceneConfig);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        ((ArrayList) LIZ).addAll(arrayList);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            for (C0J0E c0j0e : LIZIZ(str)) {
                c0j0e.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c0j0e.LIZIZ);
                sbLIZ2.append('$');
                sbLIZ2.append(c0j0e.LIZJ);
                sbLIZ2.append('.');
                sbLIZ2.append(c0j0e.LIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
                C1094620eai c1094620eai = EnumC1094630eaj.Companion;
                String str3 = c0j0e.LIZIZ;
                c1094620eai.getClass();
                C1090000eTG c1090000eTGO3 = iLiveDecisionService.O3(C1094620eai.LIZ(str3), c0j0e.LIZJ, c0j0e.LIZ);
                if (c1090000eTGO3 == null || (obj = c1090000eTGO3.LIZJ) == null || (string = obj.toString()) == null) {
                    string = "";
                }
                map.put(strLIZIZ, string);
            }
        }
    }
}
