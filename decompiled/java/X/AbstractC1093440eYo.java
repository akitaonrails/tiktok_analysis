package X;

import Y.ARunnableS25S0400000_17;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.room.CustomEvent;
import webcast.api.room.StrategyAction;
import webcast.api.room.TriggerStrategy;
import webcast.api.room.WriteFeatureCentor;

/* JADX INFO: renamed from: X.0eYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1093440eYo {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C0VMZ LIZ;
    public final String LIZIZ;
    public final List<InterfaceC1093480eYs> LIZJ;

    public void LIZJ(C796430VMb c796430VMb, C473440IhS c473440IhS) {
    }

    public abstract void LJFF();

    public abstract void LJI();

    public AbstractC1093440eYo(C0VMZ c0vmz) {
        C796430VMb c796430VMb;
        this.LIZ = c0vmz;
        String string = (c0vmz == null || (c796430VMb = c0vmz.LIZJ) == null || (string = Long.valueOf(c796430VMb.LIZ).toString()) == null) ? "" : string;
        C796430VMb c796430VMb2 = c0vmz.LIZJ;
        this.LIZIZ = C0VPJ.LIZ(string, c796430VMb2.LIZIZ, c796430VMb2.LIZJ);
        this.LIZJ = new ArrayList();
    }

    public void LIZIZ(C473440IhS c473440IhS) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("event = ");
        sbLIZ.append(c473440IhS.LJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("emitEvent");
        sbLIZ2.append(", ");
        sbLIZ2.append(strLIZIZ);
        C20441214yg.LIZIZ("LiveTTMStrategyLog", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LIZLLL(List<StrategyAction> list) {
        if (list != null) {
            for (StrategyAction strategyAction : list) {
                if (strategyAction != null) {
                    List<TriggerStrategy> list2 = strategyAction.triggerStrategies;
                    if (list2 != null) {
                        for (TriggerStrategy triggerStrategy : list2) {
                            if (triggerStrategy != null) {
                                List<InterfaceC1093480eYs> list3 = this.LIZJ;
                                final String str = triggerStrategy.strategyName;
                                ((ArrayList) list3).add(new InterfaceC1093480eYs(str) { // from class: X.0eYr
                                    public final String LIZ;

                                    {
                                        this.LIZ = str;
                                    }

                                    @Override // X.InterfaceC1093480eYs
                                    public final void LIZ(C796430VMb c796430VMb, C0VMV c0vmv, C1093150eYL c1093150eYL) {
                                        C1093490eYt.LIZ(this, c796430VMb, c0vmv, c1093150eYL);
                                        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).hc2(this.LIZ, c796430VMb, c1093150eYL);
                                        C1093620eZ6.LIZ(new C1093630eZ7(c796430VMb.LIZIZ, c796430VMb.LIZJ, 3, null, this.LIZ, null, 40));
                                    }
                                });
                            }
                        }
                    }
                    final CustomEvent customEvent = strategyAction.customEvent;
                    if (customEvent != null) {
                        ((ArrayList) this.LIZJ).add(new InterfaceC1093480eYs(customEvent) { // from class: X.0eYp
                            public final CustomEvent LIZ;

                            {
                                this.LIZ = customEvent;
                            }

                            @Override // X.InterfaceC1093480eYs
                            public final void LIZ(C796430VMb c796430VMb, C0VMV c0vmv, C1093150eYL c1093150eYL) throws JSONException {
                                C1093490eYt.LIZ(this, c796430VMb, c0vmv, c1093150eYL);
                                C473440IhS c473440IhS = new C473440IhS(this.LIZ.key, EnumC1093260eYW.CUSTOM, C116500cN.LIZIZ(new JSONObject(this.LIZ.value)));
                                CustomEvent customEvent2 = this.LIZ;
                                try {
                                    C784440Upu.LIZ().LIZIZ(new C00IQ("custom_event", c796430VMb.LIZJ, null, c796430VMb.LIZIZ, null, null, null, customEvent2.key, customEvent2.value));
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                                C1093270eYX.LIZ(c473440IhS);
                                C1093620eZ6.LIZ(new C1093630eZ7(c796430VMb.LIZIZ, c796430VMb.LIZJ, 4, null, null, this.LIZ.key, 24));
                            }
                        });
                    }
                    final WriteFeatureCentor writeFeatureCentor = strategyAction.writeFeatureCentor;
                    if (writeFeatureCentor != null) {
                        ((ArrayList) this.LIZJ).add(new InterfaceC1093480eYs(writeFeatureCentor) { // from class: X.0eZ8
                            public final WriteFeatureCentor LIZ;
                            public final Type LIZIZ = new TypeToken<List<? extends String>>() { // from class: X.0eZ9
                            }.getType();
                            public final C01GW LIZJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(189));

                            {
                                this.LIZ = writeFeatureCentor;
                            }

                            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                            /* JADX WARN: Removed duplicated region for block: B:63:0x00e3  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public static java.util.Map LIZIZ(java.util.List r8, java.util.Map r9) {
                                /*
                                    Method dump skipped, instruction units count: 266
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1093640eZ8.LIZIZ(java.util.List, java.util.Map):java.util.Map");
                            }

                            @Override // X.InterfaceC1093480eYs
                            public final void LIZ(C796430VMb c796430VMb, C0VMV c0vmv, C1093150eYL c1093150eYL) {
                                boolean z;
                                Object obj;
                                Map<String, Object> map;
                                Object next;
                                long jLongValue;
                                long jLongValue2;
                                Long l;
                                Long l2;
                                Map<String, Object> map2;
                                Object obj2;
                                C1093140eYK c1093140eYK;
                                String json;
                                Object c098200Yq;
                                C1093140eYK c1093140eYK2;
                                Object obj3;
                                C1093490eYt.LIZ(this, c796430VMb, c0vmv, c1093150eYL);
                                char c = 0;
                                int i = 1;
                                if (this.LIZ.featureStorageType == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                List list4 = (List) GsonProtectorUtils.fromJson(C293501Bt.LIZ(), this.LIZ.featureInfo, this.LIZIZ);
                                if (list4 == null) {
                                    list4 = C13BV.INSTANCE;
                                }
                                long j = ((long) this.LIZ.eliminationDuration) * 1000;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("execute writeFeatureType=");
                                sbLIZ.append(this.LIZ.writeFeatureType);
                                sbLIZ.append(", featureList=");
                                sbLIZ.append(list4);
                                sbLIZ.append(", isStoreToDisk=");
                                sbLIZ.append(z);
                                sbLIZ.append(", maxAliveTime=");
                                sbLIZ.append(j);
                                sbLIZ.append(", scene=");
                                sbLIZ.append(c796430VMb.LIZIZ);
                                C227400uG.LIZ("FeatureWriteAction", C2188811AlT.LIZIZ(sbLIZ));
                                String str2 = c796430VMb.LIZIZ;
                                String str3 = c796430VMb.LIZJ;
                                String str4 = (String) C13LP.LJJJLL(list4);
                                if (str4 == null) {
                                    str4 = "";
                                }
                                C1093620eZ6.LIZ(new C1093630eZ7(str2, str3, 2, (String) C206300qr.LIZ(str4).getThird(), null, null, 48));
                                WriteFeatureCentor writeFeatureCentor2 = this.LIZ;
                                int i2 = writeFeatureCentor2.writeFeatureType;
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i2 != 3) {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("execute skip, unknown writeFeatureType=");
                                            sbLIZ2.append(this.LIZ.writeFeatureType);
                                            C227400uG.LIZ("FeatureWriteAction", C2188811AlT.LIZIZ(sbLIZ2));
                                            return;
                                        }
                                        List list5 = (List) GsonProtectorUtils.fromJson(C293501Bt.LIZ(), this.LIZ.featureInfo, this.LIZIZ);
                                        if (list5 == null) {
                                            list5 = C13BV.INSTANCE;
                                        }
                                        Iterator it2 = list5.iterator();
                                        while (it2.hasNext()) {
                                            C443120HZe c443120HZeLIZ = C206300qr.LIZ((String) it2.next());
                                            int iIntValue = ((Number) c443120HZeLIZ.getFirst()).intValue();
                                            String str5 = (String) c443120HZeLIZ.getSecond();
                                            String str6 = (String) c443120HZeLIZ.getThird();
                                            if (c1093150eYL != null && (c1093140eYK2 = c1093150eYL.LIZIZ) != null && (obj3 = c1093140eYK2.LIZJ) != null) {
                                                if (obj3 instanceof String) {
                                                    json = (String) obj3;
                                                } else {
                                                    json = GsonProtectorUtils.toJson(C293501Bt.LIZ(), obj3);
                                                }
                                            } else {
                                                json = "{}";
                                            }
                                            try {
                                                c098200Yq = new JSONObject(json);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                c098200Yq = new C098200Yq(th);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            }
                                            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                                c098200Yq = new JSONObject();
                                            }
                                            Object objOpt = ((JSONObject) c098200Yq).opt(str6);
                                            if (objOpt != null) {
                                                C1093500eYu.LIZ(c796430VMb, str5, str6, objOpt);
                                                LIZJ(iIntValue, str5, str6, objOpt, z, j);
                                                C1093500eYu.LIZ(c796430VMb, str5, str6, objOpt);
                                            }
                                        }
                                        return;
                                    }
                                    Iterator it3 = list4.iterator();
                                    while (it3.hasNext()) {
                                        C443120HZe c443120HZeLIZ2 = C206300qr.LIZ((String) it3.next());
                                        int iIntValue2 = ((Number) c443120HZeLIZ2.getFirst()).intValue();
                                        String str7 = (String) c443120HZeLIZ2.getSecond();
                                        String str8 = (String) c443120HZeLIZ2.getThird();
                                        if (c1093150eYL != null && (c1093140eYK = c1093150eYL.LIZIZ) != null) {
                                            obj2 = c1093140eYK.LIZJ;
                                        } else {
                                            obj2 = null;
                                        }
                                        C1093500eYu.LIZ(c796430VMb, str7, str8, obj2);
                                        LIZJ(iIntValue2, str7, str8, obj2, z, j);
                                        C1093500eYu.LIZ(c796430VMb, str7, str8, obj2);
                                    }
                                    return;
                                }
                                int i3 = writeFeatureCentor2.eliminationCount;
                                Iterator it4 = list4.iterator();
                                while (it4.hasNext()) {
                                    C443120HZe c443120HZeLIZ3 = C206300qr.LIZ((String) it4.next());
                                    int iIntValue3 = ((Number) c443120HZeLIZ3.getFirst()).intValue();
                                    String str9 = (String) c443120HZeLIZ3.getSecond();
                                    String str10 = (String) c443120HZeLIZ3.getThird();
                                    C1090000eTG c1090000eTGO3 = ((ILiveFeatureCenterService) this.LIZJ.getValue()).O3(EnumC1094630eaj.DEFAULT, str9, str10);
                                    if (c1090000eTGO3 != null) {
                                        obj = c1090000eTGO3.LIZJ;
                                    } else {
                                        obj = null;
                                    }
                                    if (obj == null) {
                                        if (c1093150eYL != null) {
                                            map2 = c1093150eYL.LIZLLL;
                                        } else {
                                            map2 = null;
                                        }
                                        Map mapLIZIZ = LIZIZ(this.LIZ.events, map2);
                                        if (mapLIZIZ == null) {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("skip write event feature, no valid event. group=");
                                            sbLIZ3.append(str9);
                                            sbLIZ3.append(", feature=");
                                            sbLIZ3.append(str10);
                                            C227400uG.LIZ("FeatureWriteAction", C2188811AlT.LIZIZ(sbLIZ3));
                                        } else {
                                            Map[] mapArr = new Map[i];
                                            mapArr[c] = mapLIZIZ;
                                            Object objLJIILJJIL = C1697810uHb.LJIILJJIL(mapArr);
                                            C1093500eYu.LIZ(c796430VMb, str9, str10, objLJIILJJIL);
                                            LIZJ(iIntValue3, str9, str10, objLJIILJJIL, z, j);
                                            C1093500eYu.LIZ(c796430VMb, str9, str10, objLJIILJJIL);
                                        }
                                    } else {
                                        if (c1093150eYL != null) {
                                            map = c1093150eYL.LIZLLL;
                                        } else {
                                            map = null;
                                        }
                                        Map mapLIZIZ2 = LIZIZ(this.LIZ.events, map);
                                        List listLIZIZ = C19719512Dh.LIZIZ(c1090000eTGO3.LIZJ);
                                        if (mapLIZIZ2 != null && !mapLIZIZ2.isEmpty()) {
                                            listLIZIZ.add(mapLIZIZ2);
                                            if (listLIZIZ.size() <= i3) {
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append("addWithSizeLimit success, size=");
                                                sbLIZ4.append(listLIZIZ.size());
                                                C227400uG.LIZ("FeatureWriteAction", C2188811AlT.LIZIZ(sbLIZ4));
                                            } else {
                                                C531650Kt9 it5 = C1697810uHb.LJIIIZ(listLIZIZ).iterator();
                                                if (!it5.LLILLL) {
                                                    next = null;
                                                } else {
                                                    next = it5.next();
                                                    if (it5.LLILLL) {
                                                        Object obj4 = ((Map) ListProtector.get(listLIZIZ, ((Number) next).intValue())).get("timestamp");
                                                        if ((obj4 instanceof Long) && (l2 = (Long) obj4) != null) {
                                                            jLongValue = l2.longValue();
                                                        } else {
                                                            jLongValue = Long.MAX_VALUE;
                                                        }
                                                        do {
                                                            Object next2 = it5.next();
                                                            Object obj5 = ((Map) ListProtector.get(listLIZIZ, ((Number) next2).intValue())).get("timestamp");
                                                            if ((obj5 instanceof Long) && (l = (Long) obj5) != null) {
                                                                jLongValue2 = l.longValue();
                                                            } else {
                                                                jLongValue2 = Long.MAX_VALUE;
                                                            }
                                                            if (jLongValue > jLongValue2) {
                                                                next = next2;
                                                                jLongValue = jLongValue2;
                                                            }
                                                        } while (it5.LLILLL);
                                                    }
                                                }
                                                Integer num = (Integer) next;
                                                if (num != null) {
                                                    ListProtector.remove(listLIZIZ, num.intValue());
                                                }
                                                C227400uG.LIZ("FeatureWriteAction", "addWithSizeLimit success with eviction, size=" + listLIZIZ.size());
                                            }
                                            C1093500eYu.LIZ(c796430VMb, str9, str10, listLIZIZ);
                                            LIZJ(iIntValue3, str9, str10, listLIZIZ, z, j);
                                            C1093500eYu.LIZ(c796430VMb, str9, str10, listLIZIZ);
                                        } else {
                                            C227400uG.LIZ("FeatureWriteAction", "addWithSizeLimit skip, newItem is null or empty");
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("addWithSizeLimit returned false, skip write. group=");
                                            sbLIZ5.append(str9);
                                            sbLIZ5.append(", feature=");
                                            sbLIZ5.append(str10);
                                            C227400uG.LIZ("FeatureWriteAction", C2188811AlT.LIZIZ(sbLIZ5));
                                        }
                                    }
                                    c = 0;
                                    i = 1;
                                }
                            }

                            public final void LIZJ(int i, String str2, String str3, Object obj, boolean z, long j) {
                                boolean z2;
                                C0J0Q.Companion.getClass();
                                List<Pair> listLJIIJJI = C1697810uHb.LJIIJJI(new Pair(1, C0J0Q.APP), new Pair(2, C0J0Q.LIVE), new Pair(4, C0J0Q.ROOM), new Pair(8, C0J0Q.ANCHOR));
                                ArrayList<C0J0Q> arrayList = new ArrayList();
                                for (Pair pair : listLJIIJJI) {
                                    int iIntValue = ((Number) pair.getFirst()).intValue();
                                    Object second = pair.getSecond();
                                    if ((iIntValue & i) != 0 && second != null) {
                                        arrayList.add(second);
                                    }
                                }
                                for (C0J0Q c0j0q : arrayList) {
                                    if (z && c0j0q == C0J0Q.APP) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (j > 0 && z2) {
                                        ((ILiveFeatureCenterService) this.LIZJ.getValue()).nI2(j, obj, str3, str2);
                                    } else {
                                        ((ILiveFeatureCenterService) this.LIZJ.getValue()).bg(c0j0q, str3, obj, str2, z2);
                                    }
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("writeFeatureToCenter group=");
                                sbLIZ.append(str2);
                                sbLIZ.append(", feature=");
                                sbLIZ.append(str3);
                                sbLIZ.append(", value=");
                                sbLIZ.append(obj);
                                sbLIZ.append(", storeToDisk=");
                                sbLIZ.append(z);
                                sbLIZ.append(", maxAliveTime=");
                                sbLIZ.append(j);
                                sbLIZ.append(", sessionId=");
                                sbLIZ.append(i);
                                C227400uG.LIZ("FeatureWriteAction", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        });
                    }
                    if (strategyAction.nativeRecall) {
                        ((ArrayList) this.LIZJ).add(new C1093460eYq(null));
                    }
                }
            }
        }
    }

    public final boolean LJ(String str) {
        String str2;
        C796430VMb c796430VMb;
        C796430VMb c796430VMb2 = this.LIZ.LIZJ;
        if (c796430VMb2 != null) {
            str2 = c796430VMb2.LIZIZ;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str2, str) || (c796430VMb = this.LIZ.LIZJ) == null || c796430VMb.LIZ != 0) {
            return false;
        }
        return true;
    }

    public final void LIZ(C1093150eYL c1093150eYL, C0VMV c0vmv) {
        if (c1093150eYL.LIZ) {
            for (InterfaceC1093480eYs interfaceC1093480eYs : (ArrayList) this.LIZJ) {
                if (interfaceC1093480eYs instanceof C1093460eYq) {
                    ((C1093460eYq) interfaceC1093480eYs).LIZ(this.LIZ.LIZJ, c0vmv, c1093150eYL);
                } else {
                    C823050WQl.LIZJ().submit(new ARunnableS25S0400000_17(c0vmv, this, interfaceC1093480eYs, c1093150eYL, 7));
                }
            }
        }
    }
}
