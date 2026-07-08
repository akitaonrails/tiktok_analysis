package X;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.preloader.model.ECPreloadApiData;
import java.io.ByteArrayOutputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS247S0300000_3;
import kotlin.jvm.internal.AwS652S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.080X, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C080X {
    public final InterfaceC1631620sYq<List<ECPreloadApiData>, Map<String, ? extends Object>, String, Unit> LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1282));

    public final ArrayList<String> LIZIZ() {
        return (ArrayList) this.LIZIZ.getValue();
    }

    public C080X(AwS652S0100000_3 awS652S0100000_3) {
        this.LIZ = awS652S0100000_3;
    }

    public static HashMap LIZJ(String str) {
        HashMap map = new HashMap();
        try {
            String strDecode = URLDecoder.decode(str, StandardCharsets.UTF_8.name());
            Unit unit = null;
            if (!C770702zh.LIZIZ(strDecode)) {
                strDecode = null;
            }
            if (strDecode != null) {
                Iterator it2 = a0.LJJLIIIJILLIZJL(strDecode, new String[]{"&"}, 0, 6).iterator();
                while (it2.hasNext()) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                    map.put(listLJJLIIIJILLIZJL.get(0), listLJJLIIIJILLIZJL.get(1));
                }
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
            return map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [T, java.lang.String] */
    public static ArrayList LIZ(Request request, String str) {
        TypedOutput body;
        String strMimeType;
        HashMap<String, Object> mapLJIIJ;
        Set<String> setLJJIJIL;
        TypedOutput body2;
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListLIZ = C2131308Wp.LIZ();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayListLIZ.iterator();
        while (true) {
            boolean z2 = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            ECPreloadApiData eCPreloadApiData = (ECPreloadApiData) next;
            if (!Intrinsics.LJFF(eCPreloadApiData.api, str) || eCPreloadApiData.requestParam != null) {
                z2 = false;
            }
            if (z2) {
                arrayList2.add(next);
            }
        }
        arrayList.addAll(arrayList2);
        ArrayList arrayListLIZ2 = C2131308Wp.LIZ();
        ArrayList<ECPreloadApiData> arrayList3 = new ArrayList();
        for (Object obj : arrayListLIZ2) {
            ECPreloadApiData eCPreloadApiData2 = (ECPreloadApiData) obj;
            if (Intrinsics.LJFF(eCPreloadApiData2.api, str) && eCPreloadApiData2.requestParam != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                String strMimeType2 = null;
                if (request == null) {
                    body = null;
                } else {
                    body = request.getBody();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("request outputStream mimeType = ");
                if (body == null) {
                    strMimeType = null;
                } else {
                    strMimeType = body.mimeType();
                }
                sbLIZ.append(strMimeType);
                C2188811AlT.LIZIZ(sbLIZ);
                if (body != null) {
                    body.writeTo(byteArrayOutputStream);
                }
                C259800zU c259800zU = new C259800zU();
                C1505950pI9.LIZJ(C1743690vTb.LIZLLL(new AwS247S0300000_3(body, (TypedOutput) byteArrayOutputStream, (ByteArrayOutputStream) c259800zU, (C259800zU<String>) 6)), "p_request_decompress", str);
                if (c259800zU.element == 0) {
                    c259800zU.element = byteArrayOutputStream.toString();
                }
                if (request != null && (body2 = request.getBody()) != null) {
                    strMimeType2 = body2.mimeType();
                }
                if (Intrinsics.LJFF(strMimeType2, "application/x-www-form-urlencoded")) {
                    mapLJIIJ = LIZJ((String) c259800zU.element);
                } else {
                    mapLJIIJ = C1741890vQh.LJIIJ((String) c259800zU.element);
                }
                try {
                    byteArrayOutputStream.close();
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (mapLJIIJ != null) {
                    C1741890vQh.LJIIIIZZ(mapLJIIJ);
                }
                if (mapLJIIJ != null) {
                    for (ECPreloadApiData eCPreloadApiData3 : arrayList3) {
                        n nVar = eCPreloadApiData3.requestParam;
                        Pair pairLIZLLL = LIZLLL(mapLJIIJ, nVar);
                        List list = (List) pairLIZLLL.getFirst();
                        boolean zBooleanValue = ((Boolean) pairLIZLLL.getSecond()).booleanValue();
                        if (zBooleanValue && nVar != null && (setLJJIJIL = nVar.LJJIJIL()) != null) {
                            for (String str2 : setLJJIJIL) {
                                if (!list.contains(str2) && !Intrinsics.LJFF(nVar.LJJIIZ(str2).LJIL(), String.valueOf(mapLJIIJ.get(str2)))) {
                                    zBooleanValue = false;
                                }
                            }
                        }
                        if (zBooleanValue) {
                            arrayList4.add(eCPreloadApiData3);
                        }
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        arrayList.addAll(arrayList4);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZLLL(java.util.HashMap r9, com.google.gson.n r10) {
        /*
            r3 = 0
            java.lang.String r2 = "cursor"
            if (r10 == 0) goto L9
            com.google.gson.k r3 = r10.LJJIIZ(r2)
        L9:
            r8 = 0
            r7 = 1
            if (r3 == 0) goto L25
            java.lang.Object r0 = r9.get(r2)
            if (r0 == 0) goto L7f
            java.lang.String r0 = r0.toString()
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            java.lang.String r0 = r3.toString()
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            if (r1 > r0) goto L7f
        L25:
            r6 = 1
        L26:
            java.lang.String r4 = "request_occasion"
            if (r10 == 0) goto L57
            com.google.gson.k r5 = r10.LJJIIZ(r4)
            if (r5 == 0) goto L57
            java.lang.Object r3 = r9.get(r4)
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6f
            if (r3 == 0) goto L57
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 != 0) goto L57
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L6f
        L57:
            r3 = 1
        L58:
            java.lang.String[] r0 = new java.lang.String[]{r2, r4}
            java.util.List r2 = X.C1697810uHb.LJIIJJI(r0)
            kotlin.Pair r1 = new kotlin.Pair
            if (r6 == 0) goto L67
            if (r3 == 0) goto L67
            r8 = 1
        L67:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r1.<init>(r2, r0)
            return r1
        L6f:
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = java.lang.String.valueOf(r3)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L57
            r3 = 0
            goto L58
        L7f:
            r6 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C080X.LIZLLL(java.util.HashMap, com.google.gson.n):kotlin.Pair");
    }
}
