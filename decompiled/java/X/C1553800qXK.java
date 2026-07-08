package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.q;
import com.lynx.tasm.TemplateBundle;
import com.ss.android.ugc.aweme.ecommerce.mix.base.PrefetchParamsRuleItem;
import com.tiktok.forestx.RequestParamsX;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qXK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1553800qXK {
    public final Map<String, n> LIZ = new LinkedHashMap();
    public final List<InterfaceC1166350gSP> LIZIZ = new ArrayList();
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());

    public final void LIZIZ(String str) {
        if (str == null) {
            return;
        }
        C1532680pzG.LIZ.getClass();
        InterfaceC1166350gSP interfaceC1166350gSPLIZJ = C1532680pzG.LJJ.LIZJ(str, new RequestParamsX(EnumC1533980q1M.LYNX_COMPONENT, TemplateBundle.class), null);
        if (interfaceC1166350gSPLIZJ == null) {
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                ((ArrayList) this.LIZIZ).add(interfaceC1166350gSPLIZJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.gson.k[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [double[]] */
    /* JADX WARN: Type inference failed for: r5v5, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    public static void LIZ(n nVar, List list, Map map) {
        Object qVar;
        JSONArray jSONArray;
        Object obj;
        boolean[] zArr;
        n nVarLJIILIIL;
        boolean z;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                PrefetchParamsRuleItem prefetchParamsRuleItem = (PrefetchParamsRuleItem) it2.next();
                int i = 0;
                if (prefetchParamsRuleItem.name.length() > 0) {
                    String str = prefetchParamsRuleItem.type;
                    Object obj2 = ((LinkedHashMap) map).get(prefetchParamsRuleItem.query);
                    if (obj2 == null) {
                        obj2 = prefetchParamsRuleItem.f59default;
                    }
                    ?? LJIILIIL = 0;
                    LJIILIIL = 0;
                    LJIILIIL = 0;
                    LJIILIIL = 0;
                    LJIILIIL = 0;
                    LJIILIIL = 0;
                    LJIILIIL = 0;
                    if (obj2 != null) {
                        try {
                            if (Intrinsics.LJFF(str, EnumC1553810qXL.INT.getType())) {
                                LJIILIIL = C2095008Iq.LJIIJJI(obj2.toString());
                            } else if (Intrinsics.LJFF(str, EnumC1553810qXL.LONG.getType())) {
                                LJIILIIL = C2095008Iq.LJIILIIL(obj2.toString());
                            } else if (Intrinsics.LJFF(str, EnumC1553810qXL.DOUBLE.getType())) {
                                LJIILIIL = C2327809Ae.LJII(obj2.toString());
                            } else if (Intrinsics.LJFF(str, EnumC1553810qXL.STRING.getType())) {
                                LJIILIIL = obj2.toString();
                            } else if (Intrinsics.LJFF(str, EnumC1553810qXL.BOOLEAN.getType())) {
                                if (obj2 instanceof String) {
                                    if (!Intrinsics.LJFF(obj2, "1") && !Intrinsics.LJFF(obj2, "true")) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    LJIILIIL = Boolean.valueOf(z);
                                } else if (obj2 instanceof Boolean) {
                                    LJIILIIL = (Boolean) obj2;
                                }
                            } else if (Intrinsics.LJFF(str, EnumC1553810qXL.ARRAY.getType())) {
                                if ((obj2 instanceof String) && (obj = (jSONArray = new JSONArray((String) obj2)).get(0)) != null) {
                                    if (obj instanceof Integer) {
                                        int length = jSONArray.length();
                                        zArr = new int[length];
                                        for (int i2 = 0; i2 < length; i2++) {
                                            zArr[i2] = JSONArrayProtectorUtils.getInt(jSONArray, i2);
                                        }
                                    } else if (obj instanceof Long) {
                                        int length2 = jSONArray.length();
                                        zArr = new long[length2];
                                        for (int i3 = 0; i3 < length2; i3++) {
                                            zArr[i3] = JSONArrayProtectorUtils.getLong(jSONArray, i3);
                                        }
                                    } else if (obj instanceof Double) {
                                        int length3 = jSONArray.length();
                                        zArr = new double[length3];
                                        for (int i4 = 0; i4 < length3; i4++) {
                                            zArr[i4] = JSONArrayProtectorUtils.getDouble(jSONArray, i4);
                                        }
                                    } else if (obj instanceof Boolean) {
                                        int length4 = jSONArray.length();
                                        zArr = new boolean[length4];
                                        for (int i5 = 0; i5 < length4; i5++) {
                                            zArr[i5] = JSONArrayProtectorUtils.getBoolean(jSONArray, i5);
                                        }
                                    } else if (obj instanceof String) {
                                        int length5 = jSONArray.length();
                                        zArr = new String[length5];
                                        for (int i6 = 0; i6 < length5; i6++) {
                                            zArr[i6] = JSONArrayProtectorUtils.getString(jSONArray, i6);
                                        }
                                    } else {
                                        int length6 = jSONArray.length();
                                        zArr = new k[length6];
                                        for (int i7 = 0; i7 < length6; i7++) {
                                            Object obj3 = jSONArray.get(i7);
                                            if (obj3 instanceof JSONObject) {
                                                new p();
                                                nVarLJIILIIL = p.LIZJ(C786410Ut5.J3((JSONObject) obj3)).LJIILIIL();
                                            } else {
                                                nVarLJIILIIL = null;
                                            }
                                            zArr[i7] = nVarLJIILIIL;
                                        }
                                    }
                                    LJIILIIL = zArr;
                                }
                            } else if (Intrinsics.LJFF(str, EnumC1553810qXL.JSON.getType()) && (obj2 instanceof String)) {
                                new p();
                                LJIILIIL = p.LIZJ((String) obj2).LJIILIIL();
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    try {
                        if (LJIILIIL instanceof Number) {
                            nVar.LJJIII((Number) LJIILIIL, prefetchParamsRuleItem.name);
                        } else if (LJIILIIL instanceof Boolean) {
                            nVar.LJJII((Boolean) LJIILIIL, prefetchParamsRuleItem.name);
                        } else if (LJIILIIL instanceof int[]) {
                            C2399609ak.LJII(nVar, prefetchParamsRuleItem.name, (int[]) LJIILIIL);
                        } else if (LJIILIIL instanceof long[]) {
                            String str2 = prefetchParamsRuleItem.name;
                            long[] jArr = (long[]) LJIILIIL;
                            if (jArr != null && jArr.length != 0) {
                                h hVar = new h();
                                int length7 = jArr.length;
                                while (i < length7) {
                                    hVar.LJJII(Long.valueOf(jArr[i]));
                                    i++;
                                }
                                nVar.LJJIFFI(str2, hVar);
                            }
                        } else if (LJIILIIL instanceof double[]) {
                            String str3 = prefetchParamsRuleItem.name;
                            double[] dArr = (double[]) LJIILIIL;
                            if (dArr != null && dArr.length != 0) {
                                h hVar2 = new h();
                                int length8 = dArr.length;
                                while (i < length8) {
                                    hVar2.LJJII(Double.valueOf(dArr[i]));
                                    i++;
                                }
                                nVar.LJJIFFI(str3, hVar2);
                            }
                        } else if (LJIILIIL instanceof boolean[]) {
                            String str4 = prefetchParamsRuleItem.name;
                            boolean[] zArr2 = (boolean[]) LJIILIIL;
                            if (zArr2 != null && zArr2.length != 0) {
                                h hVar3 = new h();
                                int length9 = zArr2.length;
                                while (i < length9) {
                                    Boolean boolValueOf = Boolean.valueOf(zArr2[i]);
                                    List<k> list2 = hVar3.LL;
                                    if (boolValueOf == null) {
                                        qVar = m.LL;
                                    } else {
                                        qVar = new q(boolValueOf);
                                    }
                                    ((ArrayList) list2).add(qVar);
                                    i++;
                                }
                                nVar.LJJIFFI(str4, hVar3);
                            }
                        } else if (LJIILIIL instanceof Object[]) {
                            C2399609ak.LJIIIIZZ(nVar, prefetchParamsRuleItem.name, (Object[]) LJIILIIL);
                        } else if (LJIILIIL instanceof k) {
                            C2399609ak.LJ(nVar, prefetchParamsRuleItem.name, (k) LJIILIIL);
                        } else {
                            C2399609ak.LIZLLL(nVar, LJIILIIL, prefetchParamsRuleItem.name);
                        }
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        }
    }
}
