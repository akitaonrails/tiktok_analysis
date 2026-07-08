package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.ConfigTransToRequest;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcLiveShopListFullDataConfigBean;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.17wG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21190617wG {
    public static final C21190617wG LIZ = new C21190617wG();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(2));
    public static final HashMap<String, Map<String, Object>> LIZJ = new HashMap<>();

    public static void LJFF(String str, String str2) {
        String str3;
        Type type;
        try {
            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str2);
            if (mapLJIIJ != null && !mapLJIIJ.isEmpty() && C123100dR.LIZ(str)) {
                EcLiveShopListFullDataConfigBean ecLiveShopListFullDataConfigBean = (EcLiveShopListFullDataConfigBean) LIZIZ.getValue();
                List list = null;
                if (ecLiveShopListFullDataConfigBean != null && (str3 = ecLiveShopListFullDataConfigBean.configTransToRequest) != null) {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            C13JX c13jx = KTypeProjection.LIZJ;
                            C13JW c13jwLJII = C13LE.LJII(ConfigTransToRequest.class);
                            c13jx.getClass();
                            type = C2371409Qy.LIZJ(C13LE.LJIIIIZZ(List.class, C13JX.LIZ(c13jwLJII)));
                        } else {
                            type = new TypeToken<List<? extends ConfigTransToRequest>>() { // from class: X.17w7
                            }.getType();
                        }
                        Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(str3, type);
                        if (!(objLJIIIIZZ instanceof List)) {
                            objLJIIIIZZ = null;
                        }
                        list = (List) objLJIIIIZZ;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                Map mapLIZIZ = C520170Kad.LIZIZ(list, mapLJIIJ);
                HashMap<String, Map<String, Object>> map = LIZJ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (mapLIZIZ != null) {
                    linkedHashMap.putAll(mapLIZIZ);
                }
                map.put(str, C2097608Jq.LJIIZILJ(linkedHashMap));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r18, java.lang.String r19, java.util.HashMap<java.lang.String, java.lang.String> r20, X.EnumC598510Ndh r21, X.InterfaceC1364105Vn<? super java.lang.String> r22) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21190617wG.LJ(java.lang.String, java.lang.String, java.util.HashMap, X.0Ndh, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZLLL(java.lang.String r22, java.lang.String r23, java.util.HashMap<java.lang.String, java.lang.String> r24, X.EnumC598510Ndh r25, boolean r26, long r27, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r29, X.InterfaceC1364105Vn<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21190617wG.LIZLLL(java.lang.String, java.lang.String, java.util.HashMap, X.0Ndh, boolean, long, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r22, java.lang.String r23, boolean r24, boolean r25, long r26, X.EnumC598510Ndh r28, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r29, java.util.HashMap<java.lang.String, java.lang.String> r30, X.InterfaceC1364105Vn<? super java.lang.String> r31) {
        /*
            r21 = this;
            r3 = r31
            r12 = r22
            boolean r0 = r3 instanceof X.C21190517wF
            if (r0 == 0) goto La6
            r9 = r3
            X.17wF r9 = (X.C21190517wF) r9
            int r2 = r9.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La6
            int r2 = r2 - r1
            r9.LLILZ = r2
        L16:
            java.lang.Object r1 = r9.LLILLJJLI
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r9.LLILZ
            r7 = 1
            java.lang.String r6 = "prerender_bag_assemble"
            java.lang.String r11 = ""
            if (r0 == 0) goto L3a
            if (r0 != r7) goto Lb0
            java.lang.Object r12 = r9.LL
            java.lang.String r12 = (java.lang.String) r12
            X.C155000ia.LIZIZ(r1)
        L2e:
            X.189t r0 = X.C212391189t.LIZ
            r0.getClass()
            java.lang.String r0 = X.C212391189t.LIZ(r6, r12)
            if (r0 == 0) goto Laf
            return r0
        L3a:
            X.C155000ia.LIZIZ(r1)
            r10 = 0
            if (r12 == 0) goto Lb9
            boolean r0 = kotlin.text.a0.LJJJIL(r12)
            if (r0 != 0) goto Lb9
            r13 = r23
            if (r13 == 0) goto Lb8
            int r0 = r13.length()
            if (r0 == 0) goto Lb8
            r5 = 0
            r14 = r30
            r19 = r29
            r15 = r28
            r16 = r25
            r17 = r26
            if (r24 == 0) goto L5f
            if (r16 == 0) goto L99
        L5f:
            X.189t r0 = X.C212391189t.LIZ
            r0.getClass()
            java.lang.String r4 = X.C212391189t.LIZ(r6, r12)
            if (r16 == 0) goto L81
            if (r4 == 0) goto L97
            r0 = 1
        L6d:
            kotlin.Pair[] r3 = new kotlin.Pair[r7]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "has_cached"
            r1.<init>(r0, r2)
            r3[r10] = r1
            java.lang.String r0 = "rd_tiktokec_preview_data_check"
            X.C1421105hJ.LIZLLL(r0, r3)
        L81:
            if (r4 == 0) goto L99
            if (r24 != 0) goto L99
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.0Ndg r11 = new X.0Ndg
            r20 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r19, r20)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r5, r5, r11, r0)
            return r4
        L97:
            r0 = 0
            goto L6d
        L99:
            r9.LL = r12
            r9.LLILZ = r7
            r20 = r9
            java.lang.Object r0 = LIZLLL(r12, r13, r14, r15, r16, r17, r19, r20)
            if (r0 != r8) goto L2e
            return r8
        La6:
            X.17wF r9 = new X.17wF
            r0 = r21
            r9.<init>(r0, r3)
            goto L16
        Laf:
            return r11
        Lb0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb8:
            return r11
        Lb9:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21190617wG.LIZJ(java.lang.String, java.lang.String, boolean, boolean, long, X.0Ndh, kotlin.jvm.functions.Function1, java.util.HashMap, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC497601wk r34, java.lang.String r35, java.lang.String r36, boolean r37, boolean r38, long r39, X.EnumC598510Ndh r41, kotlin.jvm.functions.Function1 r42, java.util.HashMap r43, X.InterfaceC1364105Vn r44) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21190617wG.LIZ(X.01wk, java.lang.String, java.lang.String, boolean, boolean, long, X.0Ndh, kotlin.jvm.functions.Function1, java.util.HashMap, X.05Vn):java.lang.Object");
    }
}
