package X;

import Y.AComparatorS28S0000000_9;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.ss.android.ugc.aweme.coldcache.exp.PlayerCacheSortSetting;
import com.ss.android.ugc.aweme.localcache.database.HistoryVideoInfoStruct;
import defpackage.z0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS29S2000000_9;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NEz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC590750NEz {
    public final PlayerCacheSortSetting LIZ;
    public final ConcurrentHashMap<String, n> LIZIZ = new ConcurrentHashMap<>();
    public final C0NFB LIZJ;

    public abstract double LIZJ(int i, C590350NDl c590350NDl, List<HistoryVideoInfoStruct> list);

    public AbstractC590750NEz(PlayerCacheSortSetting playerCacheSortSetting) {
        this.LIZ = playerCacheSortSetting;
        this.LIZJ = new C0NFB(playerCacheSortSetting);
    }

    public Pair<List<String>, List<C0NGD>> LIZ(C590710NEv c590710NEv) {
        int iIntValue;
        ArrayList<C590350NDl> arrayList = c590710NEv.LIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        int i = 0;
        for (C590350NDl c590350NDl : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                C590350NDl c590350NDl2 = c590350NDl;
                this.LIZJ.LJI.clear();
                double dLIZJ = LIZJ(i, c590350NDl2, c590710NEv.LIZIZ);
                C0NDV c0ndv = C0NDV.LIZ;
                String str = c590350NDl2.LIZJ;
                float f = (float) dLIZJ;
                c0ndv.getClass();
                if (str.length() != 0 && C0NDV.LJIIJ()) {
                    C0NDV.LJIILIIL(new C0NDZ(str, f));
                }
                arrayList2.add(new C443120HZe(Integer.valueOf(i), c590350NDl2, Double.valueOf(dLIZJ)));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS28S0000000_9(30), arrayList2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i3 = 0;
        for (Object obj : listLJLLLL) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C443120HZe c443120HZe = (C443120HZe) obj;
                int iIntValue2 = ((Number) c443120HZe.getFirst()).intValue();
                C590350NDl c590350NDl3 = (C590350NDl) c443120HZe.getSecond();
                double dDoubleValue = ((Number) c443120HZe.getThird()).doubleValue();
                String str2 = c590350NDl3.LIZJ;
                Pair[] pairArr = new Pair[7];
                pairArr[0] = new Pair("origin_idx", Integer.valueOf(iIntValue2));
                pairArr[1] = new Pair("sorted_idx", Integer.valueOf(i3));
                Integer num = c590350NDl3.LJIIIIZZ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                pairArr[2] = new Pair("list_idx", Integer.valueOf(iIntValue));
                pairArr[3] = new Pair("score", Double.valueOf(dDoubleValue));
                pairArr[4] = new Pair("bitrate", Double.valueOf(c590350NDl3.LIZ()));
                pairArr[5] = new Pair("duration", Double.valueOf(c590350NDl3.LIZIZ()));
                pairArr[6] = new Pair("sorter", Integer.valueOf(((EnumC590690NEt) this.LIZ.LIZIZ.getValue()).getValue()));
                String strLIZIZ = LIZIZ(str2, C2097608Jq.LJIIJ(pairArr), true);
                arrayList3.add(str2);
                arrayList4.add(new C0NGD(str2, String.valueOf(dDoubleValue), strLIZIZ));
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return new Pair<>(arrayList3, arrayList4);
    }

    public void LIZLLL(C590710NEv c590710NEv, Function1<? super C0HAW, Unit> function1) {
        boolean z;
        this.LIZIZ.clear();
        List<String> arrayList = new ArrayList<>();
        List<C0NGD> arrayList2 = new ArrayList<>();
        if (c590710NEv != null) {
            Pair<List<String>, List<C0NGD>> pairLIZ = LIZ(c590710NEv);
            arrayList = pairLIZ.getFirst();
            arrayList2 = pairLIZ.getSecond();
            z = true;
        } else {
            z = false;
        }
        function1.invoke(new C0HAW(z, arrayList, arrayList2));
    }

    public final String LIZIZ(String str, Map<String, ? extends Object> map, boolean z) {
        n nVarPutIfAbsent;
        if (z0.LJFF || str == null || a0.LJJJIL(str)) {
            return "";
        }
        ConcurrentHashMap<String, n> concurrentHashMap = this.LIZIZ;
        n nVar = concurrentHashMap.get(str);
        if (nVar == null && (nVarPutIfAbsent = concurrentHashMap.putIfAbsent(str, (nVar = new n()))) != null) {
            nVar = nVarPutIfAbsent;
        }
        n nVar2 = nVar;
        if (nVar2 instanceof m) {
            return "";
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                nVar2.LJJIIJ(key, (String) value);
            } else if (value instanceof Number) {
                nVar2.LJJIII((Number) value, key);
            } else if (value instanceof Boolean) {
                nVar2.LJJII((Boolean) value, key);
            } else if (value instanceof k) {
                nVar2.LJJIFFI(key, (k) value);
            } else {
                nVar2.LJJIFFI(key, GsonProtectorUtils.toJsonTree(new Gson(), value));
            }
        }
        String string = nVar2.toString();
        if (z) {
            C593360NPa.LIZIZ(new AwS29S2000000_9(str, string, 3));
        }
        this.LIZIZ.put(str, nVar2);
        return string;
    }
}
