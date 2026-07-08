package X;

import com.bytedance.android.commercialize.track.dynamic.ext.DynamicExecuteResultContext;
import com.bytedance.android.commercialize.track.dynamic.ext.ParamExecuteResultContext;
import com.bytedance.android.commercialize.track.dynamic.rule.EventDynamicParamRule;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023240cja {
    public final C1023140cjQ LIZ;
    public final Map<String, C1023310cjh> LIZIZ = Collections.synchronizedMap(new LinkedHashMap());

    public C1023240cja(C1023140cjQ c1023140cjQ) {
        this.LIZ = c1023140cjQ;
    }

    public final void LIZ(List<EventDynamicParamRule> list) {
        Map<String, C1023310cjh> map = this.LIZIZ;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (EventDynamicParamRule eventDynamicParamRule : list) {
            String str = eventDynamicParamRule.paramName;
            if (str == null) {
                str = "";
            }
            Pair pair = new Pair(str, new C1023310cjh(eventDynamicParamRule));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        map.putAll(linkedHashMap);
    }

    public final Map<String, Object> LIZIZ(C1022420ciG c1022420ciG) throws Throwable {
        boolean z;
        Object objLIZ;
        String str;
        double dLJIJI;
        double dLJIJI2;
        Object objLIZ2;
        Object objInvoke;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z2 = c1022420ciG.LIZ;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C1302050jzH.LIZ.getClass();
        long jLIZ = C1302050jzH.LIZ();
        synchronized (this.LIZIZ) {
            try {
                for (Map.Entry<String, C1023310cjh> entry : this.LIZIZ.entrySet()) {
                    try {
                        String key = entry.getKey();
                        C1023310cjh value = entry.getValue();
                        C1302050jzH.LIZ.getClass();
                        long jLIZ2 = C1302050jzH.LIZ();
                        EventDynamicParamRule eventDynamicParamRule = value.LIZ;
                        String str2 = eventDynamicParamRule.bizScene;
                        if (str2 != null) {
                            boolean zLJFF = Intrinsics.LJFF(eventDynamicParamRule.analyticDataSource, Boolean.TRUE);
                            boolean z3 = true;
                            if (!zLJFF && z2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!zLJFF || z2) {
                                z3 = false;
                            }
                            Object obj = null;
                            if (z) {
                                String str3 = eventDynamicParamRule.bizParamKey;
                                if (str3 != null) {
                                    Iterator it2 = C1023060cjI.LIZLLL(C1023100cjM.LIZ(str2), c1022420ciG).iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            C1023070cjJ c1023070cjJ = (C1023070cjJ) it2.next();
                                            Function1<AbstractC1023200cjW, Object> function1 = c1023070cjJ.LIZLLL.get(str3);
                                            if (function1 != null) {
                                                objInvoke = function1.invoke(c1023070cjJ.LIZIZ);
                                            } else {
                                                objInvoke = null;
                                            }
                                            if (objInvoke == null) {
                                                objInvoke = c1023070cjJ.LIZJ.get(str3);
                                            }
                                            if (objInvoke != null) {
                                                break;
                                            }
                                        } else {
                                            objInvoke = null;
                                            break;
                                        }
                                    }
                                    objLIZ = C1093820eZQ.LIZ(objInvoke, eventDynamicParamRule.paramType);
                                }
                            } else {
                                objLIZ = null;
                            }
                            if (z3) {
                                List listLIZJ = C1023060cjI.LIZJ(C1023100cjM.LIZ(str2));
                                String str4 = eventDynamicParamRule.attributeHierarchy;
                                if (str4 != null) {
                                    Iterator it3 = listLIZJ.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        Iterator<JSONObject> it4 = ((AbstractC1023200cjW) it3.next()).LIZJ(C1023210cjX.LIZ(eventDynamicParamRule.dataSource), c1022420ciG).iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                objLIZ2 = C196600pI.LIZ(str4, it4.next());
                                                if (objLIZ2 != null) {
                                                    break;
                                                }
                                            } else {
                                                objLIZ2 = null;
                                                break;
                                            }
                                        }
                                        Object objLIZ3 = C1093820eZQ.LIZ(objLIZ2, eventDynamicParamRule.paramType);
                                        if (objLIZ3 != null) {
                                            obj = objLIZ3;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (objLIZ == null) {
                                objLIZ = obj;
                            }
                            linkedHashMap.put(key, objLIZ);
                            long jLIZJ = C1302080jzK.LIZJ(jLIZ2);
                            if (objLIZ != null) {
                                str = "1";
                            } else {
                                str = CardStruct.IStatusCode.DEFAULT;
                            }
                            EnumC19990213Jk enumC19990213Jk = EnumC19990213Jk.MICROSECONDS;
                            Double dValueOf = Double.valueOf(C19990113Jj.LJIJI(jLIZJ, enumC19990213Jk) / 1000.0d);
                            if (!zLJFF) {
                                dLJIJI = C19990113Jj.LJIJI(jLIZJ, enumC19990213Jk) / 1000.0d;
                            } else {
                                dLJIJI = 0.0d;
                            }
                            Double dValueOf2 = Double.valueOf(dLJIJI);
                            if (zLJFF) {
                                dLJIJI2 = C19990113Jj.LJIJI(jLIZJ, enumC19990213Jk) / 1000.0d;
                            } else {
                                dLJIJI2 = 0.0d;
                            }
                            linkedHashMap2.put(key, new ParamExecuteResultContext(str, objLIZ, dValueOf, dValueOf2, Double.valueOf(dLJIJI2), ""));
                        }
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                DynamicExecuteResultContext dynamicExecuteResultContext = new DynamicExecuteResultContext(this.LIZ.LIZLLL, Double.valueOf(C19990113Jj.LJIJI(C1302080jzK.LIZJ(jLIZ), EnumC19990213Jk.MICROSECONDS) / 1000.0d), linkedHashMap2);
                C1023340cjk c1023340cjk = new C1023340cjk();
                c1023340cjk.withContext(dynamicExecuteResultContext);
                c1023340cjk.log(C1023320cji.LIZJ);
                return linkedHashMap;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
