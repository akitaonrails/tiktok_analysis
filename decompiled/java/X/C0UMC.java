package X;

import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor_tool.CategoryEffectsResponse;
import tikcast.api.anchor_tool.EffectListResponse;
import tikcast.api.anchor_tool.PanelInfoResponse;
import webcast.data.CategoryEffects;
import webcast.data.DefaultEffectListItemStruct;
import webcast.data.EffectStruct;
import webcast.data.UrlDataStruct;

/* JADX INFO: renamed from: X.0UMC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UMC {
    public final String LIZ = ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).getEPAccessKey();
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public final String LIZJ = ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).getEPVersion();

    public static void LIZ(CategoryEffectsResponse.Data data) {
        List<EffectStruct> list;
        List<EffectStruct> list2;
        for (String str : data.urlPrefix) {
            CategoryEffects categoryEffects = data.categoryEffects;
            if (categoryEffects != null && (list2 = categoryEffects.effects) != null) {
                Iterator<EffectStruct> it2 = list2.iterator();
                while (it2.hasNext()) {
                    LIZLLL(it2.next(), str);
                }
            }
            CategoryEffects categoryEffects2 = data.categoryEffects;
            if (categoryEffects2 != null && (list = categoryEffects2.collection) != null) {
                Iterator<EffectStruct> it3 = list.iterator();
                while (it3.hasNext()) {
                    LIZLLL(it3.next(), str);
                }
            }
        }
    }

    public static void LIZIZ(EffectListResponse.Data data) {
        for (String str : data.urlPrefix) {
            Iterator<EffectStruct> it2 = data.effects.iterator();
            while (it2.hasNext()) {
                LIZLLL(it2.next(), str);
            }
            Iterator<EffectStruct> it3 = data.collection.iterator();
            while (it3.hasNext()) {
                LIZLLL(it3.next(), str);
            }
        }
    }

    public static void LIZJ(DefaultEffectListItemStruct defaultEffectListItemStruct) {
        for (String str : defaultEffectListItemStruct.urlPrefix) {
            Iterator<EffectStruct> it2 = defaultEffectListItemStruct.effects.iterator();
            while (it2.hasNext()) {
                LIZLLL(it2.next(), str);
            }
            Iterator<EffectStruct> it3 = defaultEffectListItemStruct.collection.iterator();
            while (it3.hasNext()) {
                LIZLLL(it3.next(), str);
            }
        }
    }

    public final C771050UMl<Throwable, EffectListResponse.Data> LJIIJ(String str) {
        Object c098200Yq;
        EffectListResponse.Data data;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchEffectList-");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            EffectListResponse effectListResponse = (EffectListResponse) C2355009Kq.LJIILIIL(-1, EffectListResponse.class, strLIZIZ);
            if (effectListResponse != null) {
                EffectListResponse.Data data2 = effectListResponse.data;
                if (data2 != null) {
                    data2.LIZ = str;
                    LIZIZ(data2);
                    this.LIZIZ.put(strLIZIZ, data2.version);
                } else if (Intrinsics.LJFF(str, C0UD4.LJFF)) {
                    InterfaceC766480U4w.LJLIIL.LJFF(-1);
                    InterfaceC766480U4w.LJLIL.LJFF(-1);
                }
                data = effectListResponse.data;
            } else {
                data = null;
            }
            c098200Yq = new C771050UMl(null, data);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = new C771050UMl(thM5exceptionOrNullimpl, null, 2);
        }
        return (C771050UMl) c098200Yq;
    }

    public final C771050UMl<Throwable, PanelInfoResponse.Data> LJIILIIL(String str) {
        Object c098200Yq;
        PanelInfoResponse.Data data;
        String str2;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchPanelInfo-");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            PanelInfoResponse panelInfoResponse = (PanelInfoResponse) C2355009Kq.LJIILIIL(-1, PanelInfoResponse.class, strLIZIZ);
            if (panelInfoResponse != null) {
                ConcurrentHashMap<String, String> concurrentHashMap = this.LIZIZ;
                PanelInfoResponse.Data data2 = panelInfoResponse.data;
                if (data2 == null || (str2 = data2.version) == null) {
                    str2 = "";
                }
                concurrentHashMap.put(strLIZIZ, str2);
                data = panelInfoResponse.data;
            } else {
                data = null;
            }
            c098200Yq = new C771050UMl(null, data, 1);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c098200Yq = new C771050UMl(thM5exceptionOrNullimpl, null, 2);
        }
        return (C771050UMl) c098200Yq;
    }

    public static void LIZLLL(EffectStruct effectStruct, String str) {
        UrlDataStruct urlDataStruct = effectStruct.iconUrl;
        if (urlDataStruct != null && urlDataStruct.urlList.isEmpty()) {
            List<String> list = urlDataStruct.urlList;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(urlDataStruct.uri);
            list.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        UrlDataStruct urlDataStruct2 = effectStruct.fileUrl;
        if (urlDataStruct2 != null && urlDataStruct2.urlList.isEmpty()) {
            List<String> list2 = urlDataStruct2.urlList;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(urlDataStruct2.uri);
            list2.add(C2188811AlT.LIZIZ(sbLIZ2));
        }
        UrlDataStruct urlDataStruct3 = effectStruct.transFileUrl;
        if (urlDataStruct3 != null && urlDataStruct3.urlList.isEmpty()) {
            List<String> list3 = urlDataStruct3.urlList;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append(urlDataStruct3.uri);
            list3.add(C2188811AlT.LIZIZ(sbLIZ3));
        }
        UrlDataStruct urlDataStruct4 = effectStruct.hintIcon;
        if (urlDataStruct4 != null && urlDataStruct4.urlList.isEmpty()) {
            List<String> list4 = urlDataStruct4.urlList;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append(urlDataStruct4.uri);
            list4.add(C2188811AlT.LIZIZ(sbLIZ4));
        }
        UrlDataStruct urlDataStruct5 = effectStruct.hintFile;
        if (urlDataStruct5 != null && urlDataStruct5.urlList.isEmpty()) {
            List<String> list5 = urlDataStruct5.urlList;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(str);
            sbLIZ5.append(urlDataStruct5.uri);
            list5.add(C2188811AlT.LIZIZ(sbLIZ5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C771160UMw
            if (r0 == 0) goto L20
            r6 = r9
            X.0UMw r6 = (X.C771160UMw) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L63
        L20:
            X.0UMw r6 = new X.0UMw
            r6.<init>(r7, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fetchEffectList-"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L7a
            java.lang.Class<com.bytedance.android.live.effect.api.EffectRelatedApi> r0 = com.bytedance.android.live.effect.api.EffectRelatedApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Throwable -> L7a
            com.bytedance.android.live.effect.api.EffectRelatedApi r2 = (com.bytedance.android.live.effect.api.EffectRelatedApi) r2     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r7.LIZ     // Catch: java.lang.Throwable -> L7a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r7.LIZIZ     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L7a
            r6.LLILLL = r4     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = r2.checkEffectListIsUpdate(r1, r8, r0, r6)     // Catch: java.lang.Throwable -> L7a
            if (r1 != r5) goto L66
            return r5
        L63:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7a
        L66:
            tikcast.api.anchor_tool.CheckUpdateResponse r1 = (tikcast.api.anchor_tool.CheckUpdateResponse) r1     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L78
            tikcast.api.anchor_tool.CheckUpdateResponse$Data r0 = r1.data     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L78
            boolean r0 = r0.updated     // Catch: java.lang.Throwable -> L7a
        L70:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L7a
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L7a
            goto L86
        L78:
            r0 = 1
            goto L70
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L86:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto L90
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMC.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C771170UMx
            if (r0 == 0) goto L20
            r6 = r9
            X.0UMx r6 = (X.C771170UMx) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L63
        L20:
            X.0UMx r6 = new X.0UMx
            r6.<init>(r7, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fetchPanelInfo-"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L7a
            java.lang.Class<com.bytedance.android.live.effect.api.EffectRelatedApi> r0 = com.bytedance.android.live.effect.api.EffectRelatedApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Throwable -> L7a
            com.bytedance.android.live.effect.api.EffectRelatedApi r2 = (com.bytedance.android.live.effect.api.EffectRelatedApi) r2     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r7.LIZ     // Catch: java.lang.Throwable -> L7a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r7.LIZIZ     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L7a
            r6.LLILLL = r4     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = r2.checkPanelIsUpdate(r1, r8, r0, r6)     // Catch: java.lang.Throwable -> L7a
            if (r1 != r5) goto L66
            return r5
        L63:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7a
        L66:
            tikcast.api.anchor_tool.PanelCheckResponse r1 = (tikcast.api.anchor_tool.PanelCheckResponse) r1     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L78
            tikcast.api.anchor_tool.PanelCheckResponse$Data r0 = r1.data     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L78
            boolean r0 = r0.updated     // Catch: java.lang.Throwable -> L7a
        L70:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L7a
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L7a
            goto L86
        L78:
            r0 = 1
            goto L70
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L86:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto L90
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMC.LJI(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r12, java.lang.String r13, X.InterfaceC1364105Vn<? super java.lang.Boolean> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C771150UMv
            if (r0 == 0) goto L20
            r10 = r14
            X.0UMv r10 = (X.C771150UMv) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r1 = r10.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L6d
        L20:
            X.0UMv r10 = new X.0UMv
            r10.<init>(r11, r14)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fetchCategoryEffectList-"
            r1.append(r0)
            r7 = r12
            r1.append(r7)
            r0 = 45
            r1.append(r0)
            r8 = r13
            r1.append(r8)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L84
            java.lang.Class<com.bytedance.android.live.effect.api.EffectRelatedApi> r0 = com.bytedance.android.live.effect.api.EffectRelatedApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r5 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Throwable -> L84
            com.bytedance.android.live.effect.api.EffectRelatedApi r5 = (com.bytedance.android.live.effect.api.EffectRelatedApi) r5     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = r11.LIZ     // Catch: java.lang.Throwable -> L84
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r11.LIZIZ     // Catch: java.lang.Throwable -> L84
            java.lang.Object r9 = r0.get(r3)     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L84
            r10.LLILLL = r2     // Catch: java.lang.Throwable -> L84
            java.lang.Object r1 = r5.checkCategoryIsUpdate(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L84
            if (r1 != r4) goto L70
            return r4
        L6d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L84
        L70:
            tikcast.api.anchor_tool.CategoryCheckResponse r1 = (tikcast.api.anchor_tool.CategoryCheckResponse) r1     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L82
            tikcast.api.anchor_tool.CategoryCheckResponse$Data r0 = r1.data     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L82
            boolean r0 = r0.updated     // Catch: java.lang.Throwable -> L84
        L7a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L84
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L84
            goto L90
        L82:
            r0 = 1
            goto L7a
        L84:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L90:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto L9a
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMC.LJ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15, X.InterfaceC1364105Vn<? super X.C771050UMl<java.lang.Throwable, tikcast.api.anchor_tool.EffectListResponse.Data>> r16) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMC.LJIIIZ(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, X.InterfaceC1364105Vn<? super X.C771050UMl<java.lang.Throwable, webcast.data.DefaultEffectListItemStruct>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C770980UMe
            if (r0 == 0) goto L23
            r10 = r14
            X.0UMe r10 = (X.C770980UMe) r10
            int r2 = r10.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r10.LLILZ = r2
        L12:
            java.lang.Object r1 = r10.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LLILZ
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L31
            if (r0 != r4) goto L29
            X.0UMC r2 = r10.LL
            goto L59
        L23:
            X.0UMe r10 = new X.0UMe
            r10.<init>(r11, r14)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L84
            java.lang.Class<com.bytedance.android.live.effect.api.EffectRelatedApi> r0 = com.bytedance.android.live.effect.api.EffectRelatedApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r5 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Throwable -> L84
            com.bytedance.android.live.effect.api.EffectRelatedApi r5 = (com.bytedance.android.live.effect.api.EffectRelatedApi) r5     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = r11.LIZ     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r11.LIZJ     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = X.C2348809Ig.LJIIIIZZ(r13)     // Catch: java.lang.Throwable -> L84
            r10.LL = r11     // Catch: java.lang.Throwable -> L84
            r10.LLILZ = r4     // Catch: java.lang.Throwable -> L84
            r7 = r12
            java.lang.Object r1 = r5.fetchFavoriteList(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L84
            if (r1 != r2) goto L57
            return r2
        L57:
            r2 = r11
            goto L5c
        L59:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L84
        L5c:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L82
            T r0 = r1.data     // Catch: java.lang.Throwable -> L84
            tikcast.api.anchor_tool.EffectUserFavouriteEffectsResponse$Data r0 = (tikcast.api.anchor_tool.EffectUserFavouriteEffectsResponse.Data) r0     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L82
            java.util.List<webcast.data.DefaultEffectListItemStruct> r1 = r0.listItem     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L82
            r0 = 0
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)     // Catch: java.lang.Throwable -> L84
            webcast.data.DefaultEffectListItemStruct r0 = (webcast.data.DefaultEffectListItemStruct) r0     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L82
            r2.getClass()     // Catch: java.lang.Throwable -> L84
            LIZJ(r0)     // Catch: java.lang.Throwable -> L84
        L79:
            X.0UMl r2 = new X.0UMl     // Catch: java.lang.Throwable -> L84
            r2.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> L84
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L84
            goto L90
        L82:
            r0 = r3
            goto L79
        L84:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L90:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r1 == 0) goto L9c
            X.0UMl r2 = new X.0UMl
            r0 = 2
            r2.<init>(r1, r3, r0)
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMC.LJIIJJI(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15, X.InterfaceC1364105Vn<? super X.C771050UMl<java.lang.Throwable, tikcast.api.anchor_tool.PanelInfoResponse.Data>> r16) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMC.LJIIL(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, X.InterfaceC1364105Vn<? super X.C771050UMl<java.lang.Throwable, webcast.data.DefaultEffectListItemStruct>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C770990UMf
            if (r0 == 0) goto L23
            r10 = r14
            X.0UMf r10 = (X.C770990UMf) r10
            int r2 = r10.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r10.LLILZ = r2
        L12:
            java.lang.Object r1 = r10.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LLILZ
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L31
            if (r0 != r4) goto L29
            X.0UMC r2 = r10.LL
            goto L59
        L23:
            X.0UMf r10 = new X.0UMf
            r10.<init>(r11, r14)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L84
            java.lang.Class<com.bytedance.android.live.effect.api.EffectRelatedApi> r0 = com.bytedance.android.live.effect.api.EffectRelatedApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r5 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Throwable -> L84
            com.bytedance.android.live.effect.api.EffectRelatedApi r5 = (com.bytedance.android.live.effect.api.EffectRelatedApi) r5     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = r11.LIZ     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r11.LIZJ     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = X.C2348809Ig.LJIIIIZZ(r13)     // Catch: java.lang.Throwable -> L84
            r10.LL = r11     // Catch: java.lang.Throwable -> L84
            r10.LLILZ = r4     // Catch: java.lang.Throwable -> L84
            r7 = r12
            java.lang.Object r1 = r5.fetchRecentUsedEffect(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L84
            if (r1 != r2) goto L57
            return r2
        L57:
            r2 = r11
            goto L5c
        L59:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L84
        L5c:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L82
            T r0 = r1.data     // Catch: java.lang.Throwable -> L84
            tikcast.api.anchor_tool.EffectUserUsedEffectsResponse$Data r0 = (tikcast.api.anchor_tool.EffectUserUsedEffectsResponse.Data) r0     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L82
            java.util.List<webcast.data.DefaultEffectListItemStruct> r1 = r0.listItem     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L82
            r0 = 0
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)     // Catch: java.lang.Throwable -> L84
            webcast.data.DefaultEffectListItemStruct r0 = (webcast.data.DefaultEffectListItemStruct) r0     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L82
            r2.getClass()     // Catch: java.lang.Throwable -> L84
            LIZJ(r0)     // Catch: java.lang.Throwable -> L84
        L79:
            X.0UMl r2 = new X.0UMl     // Catch: java.lang.Throwable -> L84
            r2.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> L84
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L84
            goto L90
        L82:
            r0 = r3
            goto L79
        L84:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L90:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r1 == 0) goto L9c
            X.0UMl r2 = new X.0UMl
            r0 = 2
            r2.<init>(r1, r3, r0)
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMC.LJIILJJIL(java.lang.String, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(java.lang.String r14, int r15, java.util.Map r16, X.InterfaceC1364105Vn r17) {
        /*
            r13 = this;
            r8 = 0
            r3 = r17
            boolean r0 = r3 instanceof X.C771080UMo
            if (r0 == 0) goto L24
            r12 = r3
            X.0UMo r12 = (X.C771080UMo) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r12.LLILLL = r2
        L15:
            java.lang.Object r1 = r12.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r12.LLILLL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            goto L57
        L24:
            X.0UMo r12 = new X.0UMo
            r12.<init>(r13, r3)
            goto L15
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L68
            java.lang.Class<com.bytedance.android.live.effect.api.EffectRelatedApi> r0 = com.bytedance.android.live.effect.api.EffectRelatedApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r5 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Throwable -> L68
            com.bytedance.android.live.effect.api.EffectRelatedApi r5 = (com.bytedance.android.live.effect.api.EffectRelatedApi) r5     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = r13.LIZ     // Catch: java.lang.Throwable -> L68
            java.lang.String r10 = X.C2348809Ig.LJIIIIZZ(r16)     // Catch: java.lang.Throwable -> L68
            java.lang.String r11 = r13.LIZJ     // Catch: java.lang.Throwable -> L68
            r12.LLILLL = r2     // Catch: java.lang.Throwable -> L68
            r9 = r15
            r7 = r14
            java.lang.Object r1 = r5.fetchRewardList(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L68
            if (r1 != r4) goto L5a
            return r4
        L57:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L68
        L5a:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L66
            T r1 = r1.data     // Catch: java.lang.Throwable -> L68
            tikcast.api.anchor_tool.EffectRewardResponse$Data r1 = (tikcast.api.anchor_tool.EffectRewardResponse.Data) r1     // Catch: java.lang.Throwable -> L68
        L62:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L68
            goto L74
        L66:
            r1 = r3
            goto L62
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L74:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L7b
            return r1
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMC.LJIILL(java.lang.String, int, java.util.Map, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(java.lang.String r12, java.lang.String r13, boolean r14, X.InterfaceC1364105Vn<? super java.lang.Boolean> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof X.C771180UMy
            if (r0 == 0) goto L20
            r10 = r15
            X.0UMy r10 = (X.C771180UMy) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r1 = r10.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L65
        L20:
            X.0UMy r10 = new X.0UMy
            r10.<init>(r11, r15)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L70
            java.lang.Class<com.bytedance.android.live.effect.api.EffectRelatedApi> r0 = com.bytedance.android.live.effect.api.EffectRelatedApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L70
            java.lang.Object r4 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Throwable -> L70
            com.bytedance.android.live.effect.api.EffectRelatedApi r4 = (com.bytedance.android.live.effect.api.EffectRelatedApi) r4     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = r11.LIZ     // Catch: java.lang.Throwable -> L70
            java.lang.String r7 = r11.LIZJ     // Catch: java.lang.Throwable -> L70
            com.google.gson.Gson r1 = X.C19748512Ol.LIZIZ     // Catch: java.lang.Throwable -> L70
            java.util.List r0 = java.util.Collections.singletonList(r13)     // Catch: java.lang.Throwable -> L70
            java.lang.String r8 = r1.LJIILL(r0)     // Catch: java.lang.Throwable -> L70
            if (r14 == 0) goto L52
            r0 = 1
            goto L53
        L52:
            r0 = 0
        L53:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L70
            boolean r9 = X.C500260Jjc.LJJJI(r0)     // Catch: java.lang.Throwable -> L70
            r10.LLILLL = r2     // Catch: java.lang.Throwable -> L70
            r6 = r12
            java.lang.Object r0 = r4.modifyFavoriteList(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L70
            if (r0 != r3) goto L68
            return r3
        L65:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L70
        L68:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L70
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L70
            goto L7c
        L70:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L7c:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto L87
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMC.LJIILLIIL(java.lang.String, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(java.lang.String r13, java.lang.String r14, X.InterfaceC1364105Vn r15, boolean r16) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.C771190UMz
            if (r0 == 0) goto L20
            r11 = r15
            X.0UMz r11 = (X.C771190UMz) r11
            int r2 = r11.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r11.LLILLL = r2
        L12:
            java.lang.Object r1 = r11.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r11.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L6b
        L20:
            X.0UMz r11 = new X.0UMz
            r11.<init>(r12, r15)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Throwable -> L76
            java.lang.Class<com.bytedance.android.live.effect.api.EffectRelatedApi> r0 = com.bytedance.android.live.effect.api.EffectRelatedApi.class
            r1.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.Object r4 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Throwable -> L76
            com.bytedance.android.live.effect.api.EffectRelatedApi r4 = (com.bytedance.android.live.effect.api.EffectRelatedApi) r4     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = r12.LIZ     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = r12.LIZJ     // Catch: java.lang.Throwable -> L76
            com.google.gson.Gson r1 = X.C19748512Ol.LIZIZ     // Catch: java.lang.Throwable -> L76
            java.util.List r0 = java.util.Collections.singletonList(r14)     // Catch: java.lang.Throwable -> L76
            java.lang.String r8 = r1.LJIILL(r0)     // Catch: java.lang.Throwable -> L76
            if (r16 == 0) goto L52
            r0 = 1
            goto L53
        L52:
            r0 = 0
        L53:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L76
            boolean r9 = X.C500260Jjc.LJJJI(r0)     // Catch: java.lang.Throwable -> L76
            r0 = 0
            java.lang.Long r10 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Throwable -> L76
            r11.LLILLL = r2     // Catch: java.lang.Throwable -> L76
            r6 = r13
            java.lang.Object r0 = r4.updateUsedEffect(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L76
            if (r0 != r3) goto L6e
            return r3
        L6b:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L76
        L6e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L76
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L76
            goto L82
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L82:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto L8d
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMC.LJIIZILJ(java.lang.String, java.lang.String, X.05Vn, boolean):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0151 A[PHI: r6
      0x0151: PHI (r6v9 int) = (r6v6 int), (r6v12 int) binds: [B:53:0x0150, B:51:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.lang.String r24, java.lang.String r25, int r26, int r27, int r28, java.util.Map<java.lang.String, java.lang.String> r29, boolean r30, java.lang.String r31, X.InterfaceC1364105Vn<? super X.C771050UMl<java.lang.Throwable, tikcast.api.anchor_tool.CategoryEffectsResponse.Data>> r32) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UMC.LJII(java.lang.String, java.lang.String, int, int, int, java.util.Map, boolean, java.lang.String, X.05Vn):java.lang.Object");
    }
}
