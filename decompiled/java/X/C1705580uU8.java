package X;

import com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0uU8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705580uU8 implements InterfaceC1705630uUD {
    public final Map<String, AnonymousClass0957<AssetsLibData.AssetsLibCategory>> LIZ = new LinkedHashMap();

    @Override // X.InterfaceC1705630uUD
    public final void preload() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1705540uU4(this, null), 3);
    }

    public static Object LIZJ(boolean z, C1705610uUB c1705610uUB) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c1705610uUB));
        if (z) {
            C1706380uVQ.LIZ().LJII("effecttoolsticker", new AbstractC1705810uUV<AssetsLibData>() { // from class: X.0uUd
                @Override // X.AbstractC1705810uUV
                public final AssetsLibData LJ(PanelInfoModel panelInfoModel) {
                    ArrayList arrayList = new ArrayList();
                    if (panelInfoModel != null && !panelInfoModel.getCategoryList().isEmpty()) {
                        for (EffectCategoryModel effectCategoryModel : panelInfoModel.getCategoryList()) {
                            String extra = effectCategoryModel.getExtra();
                            if (extra == null) {
                                extra = "";
                            }
                            arrayList.add(new AssetsLibData.AssetsLibCategory(extra, effectCategoryModel.getName(), effectCategoryModel.getKey(), C13BV.INSTANCE, effectCategoryModel.getId(), null, null, false, 0, 0, C1286430ja5.LIZIZ(effectCategoryModel.getExtra()), C1286430ja5.LIZ(effectCategoryModel.getExtra()), 992));
                        }
                        return new AssetsLibData(arrayList);
                    }
                    return new AssetsLibData(arrayList);
                }
            }, new InterfaceC1705380uTo<AssetsLibData>(c23260099m) { // from class: X.0uU2
                public final InterfaceC1364105Vn<AssetsLibData> LIZ;

                {
                    this.LIZ = c23260099m;
                }

                @Override // X.InterfaceC1705380uTo
                public final void LIZ(Integer num, String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchStickerCategory failed errorCode: ");
                    sbLIZ.append(num);
                    sbLIZ.append(" errorMsg:");
                    sbLIZ.append(str);
                    C1706630uVp.LIZJ("StickerResProvider", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1364105Vn<AssetsLibData> interfaceC1364105Vn = this.LIZ;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn.resumeWith(null);
                }

                @Override // X.InterfaceC1705380uTo
                public final void LIZIZ(AssetsLibData assetsLibData, boolean z2) {
                    Integer numValueOf;
                    List<AssetsLibData.AssetsLibCategory> list;
                    AssetsLibData assetsLibData2 = assetsLibData;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchStickerCategory success size: ");
                    if (assetsLibData2 != null && (list = assetsLibData2.categories) != null) {
                        numValueOf = Integer.valueOf(list.size());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    C1706630uVp.LIZ("StickerResProvider", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1364105Vn<AssetsLibData> interfaceC1364105Vn = this.LIZ;
                    C189200o6.m2constructorimpl(assetsLibData2);
                    interfaceC1364105Vn.resumeWith(assetsLibData2);
                }
            });
        } else {
            C1706380uVQ.LIZ().LJIILL("effecttoolsticker", new AbstractC1705810uUV<AssetsLibData>() { // from class: X.0uUd
                @Override // X.AbstractC1705810uUV
                public final AssetsLibData LJ(PanelInfoModel panelInfoModel) {
                    ArrayList arrayList = new ArrayList();
                    if (panelInfoModel != null && !panelInfoModel.getCategoryList().isEmpty()) {
                        for (EffectCategoryModel effectCategoryModel : panelInfoModel.getCategoryList()) {
                            String extra = effectCategoryModel.getExtra();
                            if (extra == null) {
                                extra = "";
                            }
                            arrayList.add(new AssetsLibData.AssetsLibCategory(extra, effectCategoryModel.getName(), effectCategoryModel.getKey(), C13BV.INSTANCE, effectCategoryModel.getId(), null, null, false, 0, 0, C1286430ja5.LIZIZ(effectCategoryModel.getExtra()), C1286430ja5.LIZ(effectCategoryModel.getExtra()), 992));
                        }
                        return new AssetsLibData(arrayList);
                    }
                    return new AssetsLibData(arrayList);
                }
            }, new InterfaceC1705380uTo<AssetsLibData>(c23260099m) { // from class: X.0uU2
                public final InterfaceC1364105Vn<AssetsLibData> LIZ;

                {
                    this.LIZ = c23260099m;
                }

                @Override // X.InterfaceC1705380uTo
                public final void LIZ(Integer num, String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchStickerCategory failed errorCode: ");
                    sbLIZ.append(num);
                    sbLIZ.append(" errorMsg:");
                    sbLIZ.append(str);
                    C1706630uVp.LIZJ("StickerResProvider", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1364105Vn<AssetsLibData> interfaceC1364105Vn = this.LIZ;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn.resumeWith(null);
                }

                @Override // X.InterfaceC1705380uTo
                public final void LIZIZ(AssetsLibData assetsLibData, boolean z2) {
                    Integer numValueOf;
                    List<AssetsLibData.AssetsLibCategory> list;
                    AssetsLibData assetsLibData2 = assetsLibData;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchStickerCategory success size: ");
                    if (assetsLibData2 != null && (list = assetsLibData2.categories) != null) {
                        numValueOf = Integer.valueOf(list.size());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    C1706630uVp.LIZ("StickerResProvider", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1364105Vn<AssetsLibData> interfaceC1364105Vn = this.LIZ;
                    C189200o6.m2constructorimpl(assetsLibData2);
                    interfaceC1364105Vn.resumeWith(assetsLibData2);
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c1705610uUB);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[RETURN] */
    @Override // X.InterfaceC1705630uUD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(boolean r10, X.InterfaceC1364105Vn<? super com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C1705610uUB
            if (r0 == 0) goto L56
            r7 = r11
            X.0uUB r7 = (X.C1705610uUB) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r6 = 0
            java.lang.String r5 = "StickerResProvider"
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 == r2) goto L64
            if (r0 == r3) goto L84
            if (r0 != r4) goto L5c
            X.C155000ia.LIZIZ(r1)
        L2b:
            return r1
        L2c:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fetchStickerCategory, fromCache "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1706630uVp.LIZ(r5, r0)
            if (r10 == 0) goto L4d
            r7.LLILLL = r2
            java.lang.Object r1 = LIZJ(r2, r7)
            if (r1 != r8) goto L67
            return r8
        L4d:
            r7.LLILLL = r4
            java.lang.Object r1 = LIZJ(r6, r7)
            if (r1 != r8) goto L2b
            return r8
        L56:
            X.0uUB r7 = new X.0uUB
            r7.<init>(r9, r11)
            goto L12
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L64:
            X.C155000ia.LIZIZ(r1)
        L67:
            com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData r1 = (com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData) r1
            if (r1 == 0) goto L7b
            java.util.List<com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData$AssetsLibCategory> r0 = r1.categories
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L7b
            java.lang.String r0 = "fetchStickerCategory has cache return cache category"
            X.C1706630uVp.LIZ(r5, r0)
            return r1
        L7b:
            r7.LLILLL = r3
            java.lang.Object r1 = LIZJ(r6, r7)
            if (r1 != r8) goto L87
            return r8
        L84:
            X.C155000ia.LIZIZ(r1)
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1705580uU8.LIZIZ(boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    @Override // X.InterfaceC1705630uUD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r12, java.lang.String r13, java.lang.String r14, X.InterfaceC1364105Vn r15) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1705580uU8.LIZ(int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(int r8, java.lang.String r9, java.lang.String r10, X.InterfaceC1364105Vn r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C1705600uUA
            if (r0 == 0) goto L90
            r4 = r11
            X.0uUA r4 = (X.C1705600uUA) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r6 = r4.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r4.LLILZLL
            r0 = 1
            r3 = 2
            if (r1 == 0) goto L26
            if (r1 == r0) goto L38
            if (r1 != r3) goto L97
            X.C155000ia.LIZIZ(r6)
        L25:
            return r6
        L26:
            X.C155000ia.LIZIZ(r6)
            r4.LL = r9
            r4.LLILLJJLI = r10
            r4.LLILLL = r8
            r4.LLILZLL = r0
            java.lang.Object r6 = LIZLLL(r9, r10, r8, r0, r4)
            if (r6 != r5) goto L45
            return r5
        L38:
            int r8 = r4.LLILLL
            java.lang.Object r10 = r4.LLILLJJLI
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r4.LL
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r6)
        L45:
            com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData$AssetsLibCategory r6 = (com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData.AssetsLibCategory) r6
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "handleFetchStickerList "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", cacheStickerList "
            r1.append(r0)
            r2 = 0
            if (r6 == 0) goto L80
            java.util.List<com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData$AssetsItemData> r0 = r6.items
            if (r0 == 0) goto L80
            int r0 = r0.size()
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
        L67:
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "StickerResProvider"
            X.C1706630uVp.LJFF(r0, r1)
            if (r6 == 0) goto L82
            java.util.List<com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData$AssetsItemData> r0 = r6.items
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L82
            return r6
        L80:
            r0 = r2
            goto L67
        L82:
            r4.LL = r2
            r4.LLILLJJLI = r2
            r4.LLILZLL = r3
            r0 = 0
            java.lang.Object r6 = LIZLLL(r9, r10, r8, r0, r4)
            if (r6 != r5) goto L25
            return r5
        L90:
            X.0uUA r4 = new X.0uUA
            r4.<init>(r7, r11)
            goto L12
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1705580uU8.LJ(int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0uUc] */
    public static Object LIZLLL(String str, String str2, int i, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C1706380uVQ.LIZ().LJIILJJIL(z, str, i, str2, new IFetchCategoryEffectListener(c2252611DEt) { // from class: X.0uUc
            public final InterfaceC20236714Gf<AssetsLibData.AssetsLibCategory> LIZ;

            {
                this.LIZ = c2252611DEt;
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                Integer numValueOf;
                String msg;
                String logId;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchStickerList failed errorCode:");
                if (exceptionResult != null) {
                    numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(" msg:");
                if (exceptionResult != null) {
                    msg = exceptionResult.getMsg();
                } else {
                    msg = null;
                }
                sbLIZ.append(msg);
                sbLIZ.append(" logId:");
                if (exceptionResult != null) {
                    logId = exceptionResult.getLogId();
                } else {
                    logId = null;
                }
                sbLIZ.append(logId);
                C1706630uVp.LIZJ("StickerResProvider", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC20236714Gf<AssetsLibData.AssetsLibCategory> interfaceC20236714Gf = this.LIZ;
                C189200o6.m2constructorimpl(null);
                interfaceC20236714Gf.resumeWith(null);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                CategoryPageModel categoryPageModel2 = categoryPageModel;
                InterfaceC20236714Gf<AssetsLibData.AssetsLibCategory> interfaceC20236714Gf = this.LIZ;
                if (categoryPageModel2 == null) {
                    C189200o6.m2constructorimpl(null);
                    interfaceC20236714Gf.resumeWith(null);
                    return;
                }
                CategoryEffectModel categoryEffects = categoryPageModel2.getCategoryEffects();
                if (categoryEffects == null) {
                    C189200o6.m2constructorimpl(null);
                    interfaceC20236714Gf.resumeWith(null);
                    return;
                }
                List<Effect> category_effects = categoryEffects.getCategory_effects();
                ArrayList arrayList = new ArrayList();
                if (category_effects != null) {
                    for (Effect effect : category_effects) {
                        String effect_id = effect.getEffect_id();
                        String str3 = (String) C13LP.LJJJLL(effect.getIcon_url().getUrlList());
                        String str4 = "";
                        if (str3 == null) {
                            str3 = "";
                        }
                        String name = effect.getName();
                        String extra = effect.getExtra();
                        if (extra == null) {
                            extra = "";
                        }
                        String extra2 = effect.getExtra();
                        if (extra2 != null) {
                            str4 = extra2;
                        }
                        arrayList.add(new AssetsLibData.AssetsItemData(effect_id, "", str3, name, extra, str4, effect.getUnzipPath(), C1706380uVQ.LIZ().LIZLLL().getEffectPlatform().LJIJI(effect), C1706490uVb.LIZJ(effect.getExtra(), "capabilities"), C1706490uVb.LIZIZ(effect.getExtra()), effect.getResourceId(), 0, 0, null, null, null, null, C1286430ja5.LIZIZ(effect.getExtra()), null, C1286430ja5.LIZ(effect.getExtra()), effect, 391168));
                    }
                }
                AssetsLibData.AssetsLibCategory assetsLibCategory = new AssetsLibData.AssetsLibCategory("", "", categoryEffects.getCategoryKey(), arrayList, categoryEffects.getCategoryKey(), "", categoryEffects.getVersion(), categoryEffects.getHasMore(), categoryEffects.getCursor(), categoryEffects.getSortingPosition(), null, false, 3072);
                C189200o6.m2constructorimpl(assetsLibCategory);
                interfaceC20236714Gf.resumeWith(assetsLibCategory);
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}
