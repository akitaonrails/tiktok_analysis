package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00oI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C190400oI {
    public final C1128600fTW LIZ;
    public final Function0<Boolean> LIZIZ;
    public final Map<Long, AnonymousClass0035> LIZJ;

    public C190400oI(C1128600fTW c1128600fTW) {
        AnonymousClass0206 anonymousClass0206 = AnonymousClass0206.get$arr$(500);
        this.LIZ = c1128600fTW;
        this.LIZIZ = anonymousClass0206;
        this.LIZJ = new LinkedHashMap();
    }

    public final void LIZ(int i, List<Long> list, Map<Long, ? extends List<C190500oJ>> map) throws JSONException {
        JSONObject jSONObject;
        boolean z;
        ConcurrentHashMap<Long, String> concurrentHashMapPutIfAbsent;
        if (this.LIZIZ.invoke().booleanValue() && i == 1) {
            int i2 = 0;
            for (Long l : list) {
                final int i3 = i2 + 1;
                final String strLIZIZ = null;
                if (i2 >= 0) {
                    long jLongValue = l.longValue();
                    Map<String, String> map2 = C1129450fUt.LIZ;
                    List<C190500oJ> list2 = (List) ((LinkedHashMap) map).get(Long.valueOf(jLongValue));
                    if (list2 == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C190500oJ c190500oJ : list2) {
                        String str = C1129450fUt.LIZ.get(c190500oJ.LIZ);
                        if (str != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append(c190500oJ.LIZIZ);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                            if (strLIZIZ2 != null) {
                                arrayList.add(strLIZIZ2);
                            }
                        }
                    }
                    final String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                    if (strLJJLIIIJ.length() == 0) {
                        strLJJLIIIJ = "N";
                    }
                    C157100iv c157100iv = this.LIZ.LIZJ;
                    if (jLongValue <= 0) {
                        c157100iv.getClass();
                    } else if (!c157100iv.LIZIZ.containsKey(Long.valueOf(jLongValue))) {
                        Integer num = c157100iv.LIZJ.get(Long.valueOf(jLongValue));
                        if (num != null) {
                            int iIntValue = num.intValue();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("PT");
                            sbLIZ2.append(iIntValue);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                    } else {
                        Integer num2 = c157100iv.LIZ.get(Long.valueOf(jLongValue));
                        if (num2 != null) {
                            int iIntValue2 = num2.intValue();
                            Integer num3 = c157100iv.LIZIZ.get(Long.valueOf(jLongValue));
                            if (num3 != null) {
                                int iIntValue3 = num3.intValue();
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("OO");
                                sbLIZ3.append(iIntValue2);
                                sbLIZ3.append(",IT");
                                sbLIZ3.append(iIntValue3);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            }
                        }
                    }
                    Object obj = new Object(strLJJLIIIJ, i3, strLIZIZ) { // from class: X.0035
                        public final String LIZ;
                        public final int LIZIZ;
                        public final String LIZJ;

                        public final boolean equals(Object obj2) {
                            if (this == obj2) {
                                return true;
                            }
                            if (!(obj2 instanceof AnonymousClass0035)) {
                                return false;
                            }
                            AnonymousClass0035 anonymousClass0035 = (AnonymousClass0035) obj2;
                            return Intrinsics.LJFF(this.LIZ, anonymousClass0035.LIZ) && this.LIZIZ == anonymousClass0035.LIZIZ && Intrinsics.LJFF(this.LIZJ, anonymousClass0035.LIZJ);
                        }

                        public final int hashCode() {
                            int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
                            String str2 = this.LIZJ;
                            return iHashCode + (str2 == null ? 0 : str2.hashCode());
                        }

                        public final String toString() {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("LastClientTags(ct=");
                            sbLIZ4.append(this.LIZ);
                            sbLIZ4.append(", cfr=");
                            sbLIZ4.append(this.LIZIZ);
                            sbLIZ4.append(", st=");
                            sbLIZ4.append(this.LIZJ);
                            sbLIZ4.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ4);
                        }

                        {
                            this.LIZ = strLJJLIIIJ;
                            this.LIZIZ = i3;
                            this.LIZJ = strLIZIZ;
                        }
                    };
                    if (!Intrinsics.LJFF(((LinkedHashMap) this.LIZJ).get(Long.valueOf(jLongValue)), obj)) {
                        C1128600fTW c1128600fTW = this.LIZ;
                        if (jLongValue <= 0) {
                            c1128600fTW.getClass();
                        } else {
                            ConcurrentHashMap<Integer, ConcurrentHashMap<Long, String>> concurrentHashMap = c1128600fTW.LIZ;
                            Integer numValueOf = Integer.valueOf(i);
                            ConcurrentHashMap<Long, String> concurrentHashMap2 = concurrentHashMap.get(numValueOf);
                            if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
                                concurrentHashMap2 = concurrentHashMapPutIfAbsent;
                            }
                            ConcurrentHashMap<Long, String> concurrentHashMap3 = concurrentHashMap2;
                            String strLIZ = c1128600fTW.LIZ(i, jLongValue);
                            if (strLIZ == null) {
                                strLIZ = "";
                            }
                            try {
                                jSONObject = new JSONObject(strLIZ);
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                                jSONObject = new JSONObject();
                            }
                            jSONObject.put("ct", strLJJLIIIJ);
                            jSONObject.put("cfr", i3);
                            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                jSONObject.remove("st");
                            } else {
                                jSONObject.put("st", strLIZIZ);
                            }
                            concurrentHashMap3.put(Long.valueOf(jLongValue), C786410Ut5.J3(jSONObject));
                            this.LIZJ.put(Long.valueOf(jLongValue), (AnonymousClass0035) obj);
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
