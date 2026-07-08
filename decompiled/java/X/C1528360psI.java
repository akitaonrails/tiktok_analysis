package X;

import android.util.SparseArray;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0psI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528360psI {
    public static final ConcurrentHashMap<String, C1528370psJ> LIZ = new ConcurrentHashMap<>();

    public static void LIZIZ(String str, JSONObject jSONObject) {
        ConcurrentHashMap<String, C1528370psJ> concurrentHashMap = LIZ;
        if (!concurrentHashMap.containsKey(str)) {
            C1528370psJ c1528370psJ = new C1528370psJ();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashMap<String, C00KU> map = c1528370psJ.LIZ;
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, next);
                SparseArray sparseArray = new SparseArray(jSONObject2.length());
                C00KU c00ku = new C00KU(sparseArray);
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    AbstractC057100Iv abstractC057100IvLIZ = C079600Rm.LIZ(next2, JSONObjectProtectorUtils.getJSONObject(jSONObject2, next2));
                    sparseArray.put(abstractC057100IvLIZ.LIZIZ, abstractC057100IvLIZ);
                }
                map.put(next, c00ku);
            }
            concurrentHashMap.put(str, c1528370psJ);
        }
    }

    public static final JSONObject LIZ(String str, String str2, String str3, byte[] bArr) throws JSONException, IOException {
        JSONObject jSONObjectLIZ;
        JSONObject jSONObjectLIZ2;
        C1528370psJ c1528370psJ = LIZ.get(str);
        if (c1528370psJ != null) {
            C1528370psJ c1528370psJ2 = c1528370psJ;
            JSONObject jSONObject = new JSONObject();
            C1516680pZS c1516680pZS = new C1516680pZS();
            c1516680pZS.LJIIL(new C1506330pIl(bArr));
            C1528390psL c1528390psL = new C1528390psL();
            long jLIZJ = c1516680pZS.LIZJ();
            while (true) {
                int iLJI = c1516680pZS.LJI();
                if (iLJI != -1) {
                    if (iLJI != 1) {
                        if (iLJI != 2) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            c1528390psL.LIZIZ = c1516680pZS.LJII();
                        }
                    } else {
                        C1528380psK c1528380psK = new C1528380psK();
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                switch (iLJI2) {
                                    case 1:
                                        c1528380psK.LIZ = (int) c1516680pZS.LJIIJJI();
                                        break;
                                    case 2:
                                        c1528380psK.LIZIZ = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 3:
                                        c1528380psK.LIZJ = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 4:
                                        c1528380psK.LIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 5:
                                        c1528380psK.LJ = c1516680pZS.LJIIJJI();
                                        break;
                                    case 6:
                                        c1528380psK.LJFF = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    default:
                                        C1516700pZU.LJ(c1516680pZS);
                                        break;
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (c1528380psK.LIZ != -1) {
                                    if (c1528380psK.LJ != -1) {
                                        c1528390psL.LIZ = c1528380psK;
                                    } else {
                                        throw new IOException("Invalid protobuf data: missing header.now!");
                                    }
                                } else {
                                    throw new IOException("Invalid protobuf data: missing header.statusCode!");
                                }
                            }
                        }
                    }
                } else {
                    c1516680pZS.LJ(jLIZJ);
                    C1528380psK c1528380psK2 = c1528390psL.LIZ;
                    if (c1528380psK2 != null) {
                        jSONObject.put("status_code", c1528380psK2.LIZ);
                        if (c1528390psL.LIZ.LIZ == 0) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("now", c1528390psL.LIZ.LJ);
                            jSONObject.put("extra", jSONObject2);
                            byte[] bArr2 = c1528390psL.LIZIZ;
                            if (bArr2 != null) {
                                c1516680pZS.LJIIL(new C1506330pIl(bArr2));
                            }
                            byte[] bArr3 = c1528390psL.LIZIZ;
                            if (bArr3 != null) {
                                c1516680pZS.LJIIL(new C1506330pIl(bArr3));
                                long jLIZJ3 = c1516680pZS.LIZJ();
                                while (true) {
                                    int iLJI3 = c1516680pZS.LJI();
                                    if (iLJI3 == -1) {
                                        c1516680pZS.LJ(jLIZJ3);
                                    } else if (iLJI3 != 1) {
                                        if (iLJI3 == 2 && str3 != null && c1528370psJ2.LIZ.containsKey(str3)) {
                                            C00KU c00ku = c1528370psJ2.LIZ.get(str3);
                                            if (c00ku == null) {
                                                jSONObjectLIZ = new JSONObject();
                                            } else {
                                                jSONObjectLIZ = c00ku.LIZ(c1516680pZS, c1528370psJ2.LIZ);
                                            }
                                            Iterator<String> itKeys = jSONObjectLIZ.keys();
                                            while (itKeys.hasNext()) {
                                                String next = itKeys.next();
                                                jSONObject2.put(next, jSONObjectLIZ.get(next));
                                            }
                                        } else {
                                            C1516700pZU.LJ(c1516680pZS);
                                        }
                                    } else {
                                        System.currentTimeMillis();
                                        C00KU c00ku2 = c1528370psJ2.LIZ.get(str2);
                                        if (c00ku2 == null) {
                                            jSONObjectLIZ2 = new JSONObject();
                                        } else {
                                            jSONObjectLIZ2 = c00ku2.LIZ(c1516680pZS, c1528370psJ2.LIZ);
                                        }
                                        jSONObject.put("data", jSONObjectLIZ2);
                                        System.currentTimeMillis();
                                    }
                                }
                            }
                        } else {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("message", c1528390psL.LIZ.LIZIZ);
                            jSONObject3.put("prompts", c1528390psL.LIZ.LIZJ);
                            jSONObject3.put("alert", c1528390psL.LIZ.LIZLLL);
                            jSONObject.put("data", jSONObject3);
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("now", c1528390psL.LIZ.LJ);
                            jSONObject.put("extra", jSONObject4);
                            String str4 = c1528390psL.LIZ.LJFF;
                            if (str3 != null && c1528370psJ2.LIZ.containsKey(str3) && str4 != null && str4.length() != 0) {
                                JSONObject jSONObject5 = new JSONObject(str4);
                                Iterator<String> itKeys2 = jSONObject5.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    jSONObject4.put(next2, jSONObject5.get(next2));
                                }
                            }
                        }
                        return jSONObject;
                    }
                    throw new IOException("Invalid protobuf data: response.header is null!");
                }
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("channel [");
            sbLIZ.append(str);
            sbLIZ.append("] Message definition not found");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
    }
}
