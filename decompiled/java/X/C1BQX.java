package X;

import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableArray;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMapKeySetIterator;
import com.bytedance.vmsdk.jsbridge.utils.ReadableType;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1BQX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BQX {
    public static final JavaOnlyArray LIZ(h hVar) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (k kVar : hVar) {
            if (kVar instanceof m) {
                javaOnlyArray.add(null);
            } else if (kVar instanceof n) {
                javaOnlyArray.add(LIZIZ((n) kVar));
            } else if (kVar instanceof h) {
                javaOnlyArray.add(LIZ((h) kVar));
            } else if (kVar instanceof q) {
                q qVar = (q) kVar;
                Object obj = qVar.LL;
                if (obj instanceof Boolean) {
                    javaOnlyArray.add(Boolean.valueOf(qVar.LJ()));
                } else if (obj instanceof String) {
                    javaOnlyArray.add(qVar.LJIL());
                } else if (obj instanceof Number) {
                    if (a0.LJJIJ(qVar.LJIJ().toString(), '.')) {
                        javaOnlyArray.add(Double.valueOf(qVar.LJIJ().doubleValue()));
                    } else {
                        javaOnlyArray.add(Long.valueOf(qVar.LJIJ().longValue()));
                    }
                }
            }
        }
        return javaOnlyArray;
    }

    public static final JavaOnlyMap LIZIZ(n nVar) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        for (String str : nVar.LJJIJIL()) {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ instanceof m) {
                javaOnlyMap.put(str, null);
            } else if (kVarLJJIIZ instanceof n) {
                javaOnlyMap.put(str, LIZIZ((n) kVarLJJIIZ));
            } else if (kVarLJJIIZ instanceof h) {
                javaOnlyMap.put(str, LIZ((h) kVarLJJIIZ));
            } else if (kVarLJJIIZ instanceof q) {
                q qVar = (q) kVarLJJIIZ;
                Object obj = qVar.LL;
                if (obj instanceof Boolean) {
                    javaOnlyMap.put(str, Boolean.valueOf(qVar.LJ()));
                } else if (obj instanceof String) {
                    javaOnlyMap.put(str, qVar.LJIL());
                } else if (obj instanceof Number) {
                    if (a0.LJJIJ(qVar.LJIJ().toString(), '.')) {
                        javaOnlyMap.put(str, Double.valueOf(qVar.LJIJ().doubleValue()));
                    } else {
                        javaOnlyMap.put(str, Long.valueOf(qVar.LJIJ().longValue()));
                    }
                }
            }
        }
        return javaOnlyMap;
    }

    public static final h LIZJ(ReadableArray readableArray) {
        k qVar;
        h hVar = new h();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableType type = readableArray.getType(i);
            if (type != null) {
                switch (C2204591BQb.LIZ[type.ordinal()]) {
                    case 1:
                        hVar.LJJIFFI(m.LL);
                        break;
                    case 2:
                        Boolean boolValueOf = Boolean.valueOf(readableArray.getBoolean(i));
                        List<k> list = hVar.LL;
                        if (boolValueOf == null) {
                            qVar = m.LL;
                        } else {
                            qVar = new q(boolValueOf);
                        }
                        ((ArrayList) list).add(qVar);
                        break;
                    case 3:
                        hVar.LJJII(Integer.valueOf(readableArray.getInt(i)));
                        break;
                    case 4:
                        hVar.LJJII(Long.valueOf(readableArray.getLong(i)));
                        break;
                    case 5:
                        hVar.LJJII(Double.valueOf(readableArray.getDouble(i)));
                        break;
                    case 6:
                        hVar.LJJIII(readableArray.getString(i));
                        break;
                    case 7:
                        hVar.LJJIFFI(LIZLLL(readableArray.getMap(i)));
                        break;
                    case 8:
                        hVar.LJJIFFI(LIZJ(readableArray.getArray(i)));
                        break;
                }
            }
        }
        return hVar;
    }

    public static final n LIZLLL(ReadableMap readableMap) {
        n nVar = new n();
        C1BQY c1bqy = new C1BQY(readableMap, nVar);
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (strNextKey != null && !a0.LJJJIL(strNextKey)) {
                c1bqy.invoke(strNextKey);
            }
        }
        return nVar;
    }
}
