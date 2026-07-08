package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchGradeEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.QueryGradeEffectsByIdResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0UDQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UDQ {
    public final EffectManager LIZ = ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).LLJILJILJ();

    public final Object LIZIZ(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        EffectManager effectManager = this.LIZ;
        if (effectManager != null) {
            effectManager.checkPanelIsUpdate(str, new ICheckChannelListener() { // from class: X.0UDU
                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelFailed(ExceptionResult exceptionResult) {
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn2.resumeWith(bool);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelSuccess(boolean z) {
                    Boolean boolValueOf = Boolean.valueOf(z);
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(boolValueOf);
                    interfaceC1364105Vn2.resumeWith(boolValueOf);
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final Object LIZJ(Effect effect, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        EffectManager effectManager = this.LIZ;
        if (effectManager != null) {
            effectManager.fetchEffect(effect, new C1768206wC(c23260099m, 4));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final Object LJI(String str, AbstractC23140094w abstractC23140094w) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        EffectManager effectManager = this.LIZ;
        if (effectManager != null) {
            effectManager.fetchEffectListFromCache(str, new C2500309qz(c23260099m, 2));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }

    public final Object LJIIIIZZ(String str, InterfaceC1364105Vn<? super EffectChannelResponse> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        EffectManager effectManager = this.LIZ;
        if (effectManager != null) {
            effectManager.fetchEffectListFromCache(str, new C786140Use(c23260099m, 1));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final Object LJIIJ(List list, AbstractC23140094w abstractC23140094w) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        EffectManager effectManager = this.LIZ;
        if (effectManager != null) {
            effectManager.fetchGradeEffectList(list, null, new IFetchGradeEffectListByIdsListener() { // from class: X.0U8R
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchGradeEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                    Exception exception;
                    InterfaceC1364105Vn<C771050UMl<Throwable, Map<String, ? extends List<? extends LiveEffect>>>> interfaceC1364105Vn = c23260099m;
                    if (exceptionResult != null) {
                        exception = exceptionResult.getException();
                    } else {
                        exception = null;
                    }
                    C771050UMl c771050UMl = new C771050UMl(exception, null);
                    C189200o6.m2constructorimpl(c771050UMl);
                    interfaceC1364105Vn.resumeWith(c771050UMl);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(QueryGradeEffectsByIdResponse queryGradeEffectsByIdResponse) {
                    Map<String, List<Effect>> data;
                    QueryGradeEffectsByIdResponse queryGradeEffectsByIdResponse2 = queryGradeEffectsByIdResponse;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (queryGradeEffectsByIdResponse2 != null && (data = queryGradeEffectsByIdResponse2.getData()) != null) {
                        for (Map.Entry<String, List<Effect>> entry : data.entrySet()) {
                            String key = entry.getKey();
                            List<Effect> value = entry.getValue();
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(value, 10));
                            Iterator<T> it2 = value.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(C0UEO.LIZLLL((Effect) it2.next()));
                            }
                            linkedHashMap.put(key, arrayList);
                        }
                    }
                    InterfaceC1364105Vn<C771050UMl<Throwable, Map<String, ? extends List<? extends LiveEffect>>>> interfaceC1364105Vn = c23260099m;
                    C771050UMl c771050UMl = new C771050UMl(null, linkedHashMap);
                    C189200o6.m2constructorimpl(c771050UMl);
                    interfaceC1364105Vn.resumeWith(c771050UMl);
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }

    public final Object LJIIL(String str, AbstractC23140094w abstractC23140094w) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        EffectManager effectManager = this.LIZ;
        if (effectManager != null) {
            effectManager.fetchPanelInfoFromCache(str, false, "", 0, 0, 0, new IFetchPanelInfoListener() { // from class: X.091o
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
                public final void onFail(ExceptionResult exceptionResult) {
                    InterfaceC1364105Vn<PanelInfoModel> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn.resumeWith(null);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(PanelInfoModel panelInfoModel) {
                    InterfaceC1364105Vn<PanelInfoModel> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(panelInfoModel);
                    interfaceC1364105Vn.resumeWith(panelInfoModel);
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }

    public final Object LIZ(String str, String str2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        EffectManager effectManager = this.LIZ;
        if (effectManager != null) {
            effectManager.checkCategoryIsUpdate(str, str2, null, new ICheckChannelListener() { // from class: X.0U8d
                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelFailed(ExceptionResult exceptionResult) {
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn2.resumeWith(bool);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelSuccess(boolean z) {
                    Boolean boolValueOf = Boolean.valueOf(z);
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(boolValueOf);
                    interfaceC1364105Vn2.resumeWith(boolValueOf);
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final Object LJ(String str, String str2, AbstractC23140094w abstractC23140094w) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        EffectManager effectManager = this.LIZ;
        if (effectManager != null) {
            effectManager.fetchCategoryEffectFromCache(str, str2, 0, 0, 0, CardStruct.IStatusCode.DEFAULT, new IFetchCategoryEffectListener() { // from class: X.0UDY
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    InterfaceC1364105Vn<CategoryPageModel> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn.resumeWith(null);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel) {
                    InterfaceC1364105Vn<CategoryPageModel> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(categoryPageModel);
                    interfaceC1364105Vn.resumeWith(categoryPageModel);
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }

    public final Object LJFF(String str, Map map, AbstractC23140094w abstractC23140094w) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        EffectManager effectManager = this.LIZ;
        if (effectManager != null) {
            effectManager.fetchEffectList(str, false, (Map<String, String>) map, (IFetchEffectChannelListener) new C786140Use(c23260099m, 0));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }

    public final Object LJII(Map map, List list, AbstractC23140094w abstractC23140094w) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        EffectManager effectManager = this.LIZ;
        if (effectManager != null) {
            effectManager.fetchEffectList((List<String>) list, (Map<String, String>) map, new IFetchEffectListByIdsListener() { // from class: X.05XR
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
                public final void onFail(ExceptionResult exceptionResult) {
                    Integer numValueOf;
                    String msg;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onFail: ");
                    if (exceptionResult != null) {
                        numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    sbLIZ.append(", ");
                    if (exceptionResult != null) {
                        msg = exceptionResult.getMsg();
                    } else {
                        msg = null;
                    }
                    sbLIZ.append(msg);
                    C20441214yg.LIZIZ("EffectMonitor#resReq", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1364105Vn<Pair<? extends List<Effect>, String>> interfaceC1364105Vn = c23260099m;
                    Pair pair = new Pair(null, "");
                    C189200o6.m2constructorimpl(pair);
                    interfaceC1364105Vn.resumeWith(pair);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[PHI: r2
                  0x0032: PHI (r2v1 java.util.ArrayList) = (r2v0 java.util.ArrayList), (r2v3 java.util.ArrayList), (r2v3 java.util.ArrayList) binds: [B:15:0x0041, B:8:0x002a, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse r5) {
                    /*
                        r4 = this;
                        com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse r5 = (com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse) r5
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "onSuc: "
                        r1.append(r0)
                        r1.append(r5)
                        java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                        java.lang.String r0 = "EffectMonitor#resReq"
                        X.C20441214yg.LIZIZ(r0, r1)
                        X.05Vn<kotlin.Pair<? extends java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect>, java.lang.String>> r3 = r1
                        if (r5 == 0) goto L40
                        java.util.List r0 = r5.getData()
                        if (r0 == 0) goto L40
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>(r0)
                    L26:
                        java.util.List r0 = r5.getUrl_prefix()
                        if (r0 == 0) goto L32
                        java.lang.Object r1 = X.C13LP.LJJJLL(r0)
                        if (r1 != 0) goto L34
                    L32:
                        java.lang.String r1 = ""
                    L34:
                        kotlin.Pair r0 = new kotlin.Pair
                        r0.<init>(r2, r1)
                        X.C189200o6.m2constructorimpl(r0)
                        r3.resumeWith(r0)
                        return
                    L40:
                        r2 = 0
                        if (r5 == 0) goto L32
                        goto L26
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C05XR.onSuccess(java.lang.Object):void");
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }

    public final Object LJIIIZ(String str, Map map, AbstractC23140094w abstractC23140094w) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        EffectManager effectManager = this.LIZ;
        if (effectManager != null) {
            effectManager.fetchFavoriteList(str, map, new IFetchFavoriteList() { // from class: X.0UDW
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList
                public final void onFailed(ExceptionResult exceptionResult) {
                    InterfaceC1364105Vn<Pair<? extends FetchFavoriteListResponse, ? extends ExceptionResult>> interfaceC1364105Vn = c23260099m;
                    Pair pair = new Pair(null, exceptionResult);
                    C189200o6.m2constructorimpl(pair);
                    interfaceC1364105Vn.resumeWith(pair);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(FetchFavoriteListResponse fetchFavoriteListResponse) {
                    InterfaceC1364105Vn<Pair<? extends FetchFavoriteListResponse, ? extends ExceptionResult>> interfaceC1364105Vn = c23260099m;
                    Pair pair = new Pair(fetchFavoriteListResponse, null);
                    C189200o6.m2constructorimpl(pair);
                    interfaceC1364105Vn.resumeWith(pair);
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }

    public final Object LJIIJJI(String str, Map map, AbstractC23140094w abstractC23140094w) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        EffectManager effectManager = this.LIZ;
        if (effectManager != null) {
            effectManager.fetchPanelInfo(str, false, "", 0, 0, 0, map, new IFetchPanelInfoListener() { // from class: X.0UDX
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
                public final void onFail(ExceptionResult exceptionResult) {
                    InterfaceC1364105Vn<Pair<? extends PanelInfoModel, ? extends ExceptionResult>> interfaceC1364105Vn = c23260099m;
                    Pair pair = new Pair(null, exceptionResult);
                    C189200o6.m2constructorimpl(pair);
                    interfaceC1364105Vn.resumeWith(pair);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(PanelInfoModel panelInfoModel) {
                    InterfaceC1364105Vn<Pair<? extends PanelInfoModel, ? extends ExceptionResult>> interfaceC1364105Vn = c23260099m;
                    Pair pair = new Pair(panelInfoModel, null);
                    C189200o6.m2constructorimpl(pair);
                    interfaceC1364105Vn.resumeWith(pair);
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.lang.String r7, java.lang.String r8, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C0UDR
            if (r0 == 0) goto L74
            r5 = r9
            X.0UDR r5 = (X.C0UDR) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L12:
            java.lang.Object r0 = r5.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILZLL
            r3 = 2
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 == r2) goto L49
            if (r1 != r3) goto L7a
            X.00zU r1 = r5.LLILLJJLI
            java.lang.Object r2 = r5.LL
            X.00zU r2 = (X.C259800zU) r2
            X.C155000ia.LIZIZ(r0)
        L2b:
            r1.element = r0
        L2d:
            T r0 = r2.element
            return r0
        L30:
            X.C155000ia.LIZIZ(r0)
            X.00zU r1 = new X.00zU
            r1.<init>()
            r5.LL = r7
            r5.LLILLJJLI = r1
            r5.LLILLL = r1
            r5.LLILZLL = r2
            java.lang.Object r0 = r6.LJIILL(r7, r8, r5)
            if (r0 != r4) goto L47
            return r4
        L47:
            r2 = r1
            goto L54
        L49:
            X.00zU r1 = r5.LLILLL
            X.00zU r2 = r5.LLILLJJLI
            java.lang.Object r7 = r5.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r0)
        L54:
            r1.element = r0
            T r0 = r2.element
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r0
            if (r0 == 0) goto L2d
            java.lang.String r1 = r0.LLILII()
            if (r1 == 0) goto L2d
            r5.LL = r2
            r5.LLILLJJLI = r2
            r0 = 0
            r5.LLILLL = r0
            r5.LLILZLL = r3
            java.lang.Object r0 = r6.LJIILL(r7, r1, r5)
            if (r0 != r4) goto L72
            return r4
        L72:
            r1 = r2
            goto L2b
        L74:
            X.0UDR r5 = new X.0UDR
            r5.<init>(r6, r9)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UDQ.LJIILIIL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(java.lang.String r9, java.lang.String r10, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r11) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UDQ.LJIILL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(com.bytedance.android.livesdkapi.depend.model.LiveEffect r6, java.lang.String r7, java.util.List r8, X.InterfaceC1364105Vn r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C0UDS
            if (r0 == 0) goto L6b
            r4 = r9
            X.0UDS r4 = (X.C0UDS) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L53
            if (r0 != r2) goto L77
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r6 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            kotlin.Pair r1 = (kotlin.Pair) r1
            if (r1 == 0) goto L76
            java.lang.Object r1 = r1.getFirst()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L76
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = X.C0UEO.LIZLLL(r0)
            r2.add(r0)
            goto L3f
        L53:
            X.C155000ia.LIZIZ(r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r0 = "panel"
            r1.put(r0, r7)
            r4.LL = r6
            r4.LLILZ = r2
            java.lang.Object r1 = r5.LJII(r1, r8, r4)
            if (r1 != r3) goto L24
            return r3
        L6b:
            X.0UDS r4 = new X.0UDS
            r4.<init>(r5, r9)
            goto L12
        L71:
            if (r6 == 0) goto L76
            r6.LLD(r2)
        L76:
            return r6
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UDQ.LJIILJJIL(com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    public final Object LIZLLL(String str, String str2, int i, int i2, int i3, String str3, Map map, AbstractC23140094w abstractC23140094w) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(abstractC23140094w));
        EffectManager effectManager = this.LIZ;
        if (effectManager != null) {
            effectManager.fetchCategoryEffect(str, str2, i, i2, i3, str3, map, new IFetchCategoryEffectListener() { // from class: X.0UDV
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                    InterfaceC1364105Vn<Pair<? extends CategoryPageModel, ? extends ExceptionResult>> interfaceC1364105Vn = c23260099m;
                    Pair pair = new Pair(null, exceptionResult);
                    C189200o6.m2constructorimpl(pair);
                    interfaceC1364105Vn.resumeWith(pair);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel) {
                    InterfaceC1364105Vn<Pair<? extends CategoryPageModel, ? extends ExceptionResult>> interfaceC1364105Vn = c23260099m;
                    Pair pair = new Pair(categoryPageModel, null);
                    C189200o6.m2constructorimpl(pair);
                    interfaceC1364105Vn.resumeWith(pair);
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLIZ;
    }
}
