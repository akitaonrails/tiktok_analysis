package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetPanelInfo;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.AssetCondition;
import com.ss.android.ugc.effectmanager.effect.model.AssetItemModel;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModel;
import com.ss.android.ugc.effectmanager.effect.model.AssetUtilsKt;
import com.ss.android.ugc.effectmanager.effect.model.BusinessExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.MixedItemAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.NleInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS171S1100000_22;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nA7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1424090nA7 {
    public boolean LIZ;
    public final InterfaceC1635410sex LIZIZ;
    public final HashMap<C1424130nAB, AssetPanelModel> LIZJ;
    public final HashMap<C1424130nAB, AssetCategoryModel> LIZLLL;
    public final HashMap<String, Effect> LJ;
    public final HashMap<C1424120nAA, C1424140nAC> LJFF;

    public C1424090nA7() {
        this.LIZIZ = C297340Bl6.LIZIZ() ? C1633850scR.LIZ(C0CHQ.LIZ, null) : C1633850scR.LIZ(C0CHQ.LIZ, AFwS261S0000000_22.get$arr$(319));
        this.LIZJ = new HashMap<>();
        this.LIZLLL = new HashMap<>();
        this.LJ = new HashMap<>();
        this.LJFF = new HashMap<>();
    }

    public static String LIZLLL(String str) {
        n nVar = new n();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "tt_photo_template_enable_ai_template", true, false)) {
            nVar.LJJIII(Integer.valueOf(C0BSV.LIZ), "total_templates");
            nVar.LJJIIJ("img_tos_url", str);
            nVar.LJJIII(1, "image_template_strategy");
        }
        return nVar.toString();
    }

    public final C11KS LIZ(final Asset asset, final boolean z) {
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloadResource for ");
            sbLIZ.append(asset);
            C385200F8k.LIZ("PhotoTemplateRepo", C2188811AlT.LIZIZ(sbLIZ));
        }
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0nA8
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<Effect> interfaceC2329309At) {
                Effect effect = this.LL.LJ.get(asset.getResource_id());
                if (effect != null) {
                    if (!z) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("downloadResource hit cache for: ");
                        sbLIZ2.append(asset.getResource_id());
                        C385200F8k.LIZ("PhotoTemplateRepo", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    interfaceC2329309At.onSuccess(effect);
                    return;
                }
                InterfaceC1635410sex interfaceC1635410sex = this.LL.LIZIZ;
                Effect effectConvertAssetToEffect = AssetUtilsKt.convertAssetToEffect(asset, null);
                effectConvertAssetToEffect.setId(asset.getAsset_id());
                interfaceC1635410sex.LJIIL(effectConvertAssetToEffect, new C1466750oGv(this.LL, (C11KT) interfaceC2329309At, 1));
            }
        });
    }

    public final C11KS LIZJ(final String str, final Pair pair, final boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchPanel, ignoreCache:");
        sbLIZ.append(z);
        sbLIZ.append(", path:");
        sbLIZ.append("");
        sbLIZ.append(", imageUrl:");
        sbLIZ.append(str);
        C385200F8k.LIZ("PhotoTemplateRepo", C2188811AlT.LIZIZ(sbLIZ));
        final C1424130nAB c1424130nAB = new C1424130nAB("", str);
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0nA5
            public final /* synthetic */ String LLILZ = "";

            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<AssetPanelModel> interfaceC2329309At) {
                AssetPanelModel assetPanelModel = this.LL.LIZJ.get(c1424130nAB);
                if (assetPanelModel != null && !z) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("fetchPanel hit cache for path: ");
                    sbLIZ2.append(this.LLILZ);
                    C385200F8k.LIZ("PhotoTemplateRepo", C2188811AlT.LIZIZ(sbLIZ2));
                    interfaceC2329309At.onSuccess(assetPanelModel);
                    return;
                }
                InterfaceC1635410sex interfaceC1635410sex = this.LL.LIZIZ;
                int i = C0BSV.LIZ;
                IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
                if (iToolsDebugGpService != null) {
                    iToolsDebugGpService.isOpen();
                }
                MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo = new MixedAssetsRequestBodyInfo("photomode_template", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AwS171S1100000_22(this.LL, str, 12), null, null, "", "", "", null, null, null, null, Boolean.FALSE, null, "", null);
                Pair<String, String> pair2 = pair;
                C1429050nI7.LIZ.getClass();
                Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
                MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters = new MixedAssetsQueryAdditionalParameters(pair2, "2", null, null, null, false, null, null, false);
                final C1424090nA7 c1424090nA7 = this.LL;
                final C1424130nAB c1424130nAB2 = c1424130nAB;
                final C11KT c11kt = (C11KT) interfaceC2329309At;
                interfaceC1635410sex.LJJI(mixedAssetsQueryAdditionalParameters, "photomode_template", i, mixedAssetsRequestBodyInfo, new IFetchAssetPanelInfo() { // from class: X.0nA0
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetPanelInfo
                    public final void onFailed(ExceptionResult exceptionResult) {
                        Exception runtimeException;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("fetchPanel failed: ");
                        sbLIZ3.append(exceptionResult);
                        C385200F8k.LIZ("PhotoTemplateRepo", C2188811AlT.LIZIZ(sbLIZ3));
                        InterfaceC2329309At<AssetPanelModel> interfaceC2329309At2 = c11kt;
                        if (exceptionResult == null || (runtimeException = exceptionResult.getException()) == null) {
                            runtimeException = new RuntimeException("fetchPanel onFailed: null exception");
                        }
                        interfaceC2329309At2.onError(runtimeException);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.net.AssetPanelResponse r15) {
                        /*
                            Method dump skipped, instruction units count: 257
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1424020nA0.onSuccess(java.lang.Object):void");
                    }
                });
            }
        });
    }

    public static AbstractC19484711Kz LIZIZ(final C1424090nA7 c1424090nA7, final PhotoTemplateAsset photoTemplateAsset, final int i, final int i2, final String str) {
        final boolean z = false;
        c1424090nA7.getClass();
        final Asset asset = photoTemplateAsset.getAsset();
        if (asset == null) {
            return AbstractC19484711Kz.LJIILLIIL(new RuntimeException("fetchItemAsset: null asset", new RuntimeException(String.valueOf(EnumC358710E4n.FETCH_AI_ASSET_FAIL.getValue()))));
        }
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0nA3
            /* JADX WARN: Type inference failed for: r1v0, types: [X.0nAA, java.lang.Object] */
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
                String asset_id;
                Long lLJIILIIL;
                final ?? r1 = new Object(asset.getAsset_id(), str) { // from class: X.0nAA
                    public final String LIZ;
                    public final String LIZIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1424120nAA)) {
                            return false;
                        }
                        C1424120nAA c1424120nAA = (C1424120nAA) obj;
                        return Intrinsics.LJFF(this.LIZ, c1424120nAA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1424120nAA.LIZIZ);
                    }

                    public final int hashCode() {
                        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
                    }

                    {
                        this.LIZ = str;
                        this.LIZIZ = str;
                    }
                };
                C1424140nAC c1424140nAC = c1424090nA7.LJFF.get(r1);
                if (c1424140nAC != null && !z) {
                    C385200F8k.LIZ("PhotoTemplateRepo", "fetchItemAsset: hit cache");
                    asset.setAsset_type(c1424140nAC.LIZIZ);
                    interfaceC2329309At.onSuccess(c1424140nAC.LIZ);
                    return;
                }
                InterfaceC1635410sex interfaceC1635410sex = c1424090nA7.LIZIZ;
                C1429050nI7 c1429050nI7 = C1429050nI7.LIZ;
                TemplateScene templateScene = TemplateScene.PHOTO_TEMPLATE;
                c1429050nI7.getClass();
                Pair pairLIZJ = C1429050nI7.LIZJ(templateScene);
                Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
                MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters = new MixedAssetsQueryAdditionalParameters(pairLIZJ, "2", null, "photomode_template", null, false, "item", "photomode_template", false);
                if (C296620Bjw.LIZ()) {
                    asset_id = null;
                } else {
                    asset_id = asset.getAsset_id();
                }
                if (C296620Bjw.LIZ()) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(asset.getAsset_id());
                } else {
                    lLJIILIIL = null;
                }
                List listSingletonList = Collections.singletonList(new AssetCondition(asset_id, lLJIILIIL, "photomode_template", Integer.valueOf(asset.getAsset_type()), null, null));
                IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
                if (iToolsDebugGpService != null) {
                    iToolsDebugGpService.isOpen();
                }
                List listLJIIJJI = C1697810uHb.LJIIJJI(0, 1);
                n nVar = new n();
                PhotoTemplateAsset photoTemplateAsset2 = photoTemplateAsset;
                int i3 = i;
                nVar.LJJIIJ("photo_template_ai_task_id", photoTemplateAsset2.getAiTaskId());
                nVar.LJJIIJ("photo_template_operation_task_id", photoTemplateAsset2.getOperationTaskId());
                nVar.LJJIII(Integer.valueOf(i3 + 1), "template_index");
                MixedItemAssetsRequestBodyInfo mixedItemAssetsRequestBodyInfo = new MixedItemAssetsRequestBodyInfo(listSingletonList, null, listLJIIJJI, null, nVar.toString(), "", null, null, null, "", null);
                final int i4 = i2;
                final C1424090nA7 c1424090nA72 = c1424090nA7;
                final Asset asset2 = asset;
                final PhotoTemplateAsset photoTemplateAsset3 = photoTemplateAsset;
                final int i5 = i;
                final String str2 = str;
                final C11KT c11kt = (C11KT) interfaceC2329309At;
                interfaceC1635410sex.LJJIL(mixedAssetsQueryAdditionalParameters, mixedItemAssetsRequestBodyInfo, new IFetchAssetItemInfo() { // from class: X.0nA4
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo
                    public final void onFailed(ExceptionResult exceptionResult) {
                        Exception runtimeException;
                        InterfaceC2329309At<String> interfaceC2329309At2 = c11kt;
                        if (exceptionResult == null || (runtimeException = exceptionResult.getException()) == null) {
                            runtimeException = new RuntimeException("fetchItemAsset: failed with null exception", new RuntimeException(String.valueOf(EnumC358710E4n.FETCH_AI_ASSET_FAIL.getValue())));
                        }
                        interfaceC2329309At2.onError(runtimeException);
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(AssetItemResponse assetItemResponse) {
                        BusinessExtra business_extra;
                        String nle_summary;
                        BusinessExtra business_extra2;
                        NleInfo nle_info;
                        AssetItemModel data;
                        List<Asset> list;
                        AssetItemModel data2;
                        List<Asset> list2;
                        Asset asset3;
                        String extra;
                        AssetItemResponse assetItemResponse2 = assetItemResponse;
                        final int i6 = i4 - 1;
                        Asset asset4 = null;
                        if (i6 >= 1) {
                            c1424090nA72.getClass();
                            int status = EnumC995360c0c.NOT_FOUND.getStatus();
                            if (assetItemResponse2 != null && (data2 = assetItemResponse2.getData()) != null && (list2 = data2.asset_list) != null && (asset3 = (Asset) C13LP.LJJJLL(list2)) != null && (extra = asset3.getExtra()) != null) {
                                try {
                                    status = new JSONObject(extra).optInt("photo_template_task_status", status);
                                } catch (JSONException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            if (status != EnumC995360c0c.SUCCESS.getStatus()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("fetchItemAsset: dont have AI Template restTryCnt ");
                                sbLIZ.append(i6);
                                C385200F8k.LIZ("PhotoTemplateRepo", C2188811AlT.LIZIZ(sbLIZ));
                                C11I1 c11i1LJJIJL = AbstractC19484711Kz.LJJIJL(1L, TimeUnit.SECONDS);
                                final C1424090nA7 c1424090nA73 = c1424090nA72;
                                final PhotoTemplateAsset photoTemplateAsset4 = photoTemplateAsset3;
                                final int i7 = i5;
                                final String str3 = str2;
                                C19480011Je c19480011JeLJIIZILJ = c11i1LJJIJL.LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.0nA9
                                    @Override // X.InterfaceC1487280oo2
                                    public final Object apply(Object obj) {
                                        C385200F8k.LIZ("PhotoTemplateRepo", "fetchItemAsset: fetch again");
                                        return C1424090nA7.LIZIZ(c1424090nA73, photoTemplateAsset4, i7, i6, str3);
                                    }
                                });
                                InterfaceC2329309At<String> interfaceC2329309At2 = c11kt;
                                c19480011JeLJIIZILJ.LJJIIZ(new C516201zk(interfaceC2329309At2, 285), new C516201zk(interfaceC2329309At2, 286));
                                return;
                            }
                        }
                        if (assetItemResponse2 != null && (data = assetItemResponse2.getData()) != null && (list = data.asset_list) != null) {
                            asset4 = (Asset) C13LP.LJJJLL(list);
                        }
                        if (C296620Bjw.LIZ()) {
                            if (asset4 != null && (business_extra2 = asset4.getBusiness_extra()) != null && (nle_info = business_extra2.getNle_info()) != null) {
                                nle_summary = nle_info.getNle_summary();
                                if (nle_summary != null && asset4 != null) {
                                    asset2.setAsset_type(asset4.getAsset_type());
                                    c1424090nA72.LJFF.put(r1, new C1424140nAC(nle_summary, asset4.getAsset_type()));
                                    c11kt.onSuccess(nle_summary);
                                    return;
                                }
                            }
                        } else if (asset4 != null && (business_extra = asset4.getBusiness_extra()) != null) {
                            nle_summary = business_extra.getNle_summary();
                            if (nle_summary != null) {
                                asset2.setAsset_type(asset4.getAsset_type());
                                c1424090nA72.LJFF.put(r1, new C1424140nAC(nle_summary, asset4.getAsset_type()));
                                c11kt.onSuccess(nle_summary);
                                return;
                            }
                        }
                        c11kt.onError(new RuntimeException("fetchItemAsset: failed with null asset", new RuntimeException(String.valueOf(EnumC358710E4n.FETCH_AI_ASSET_FAIL.getValue()))));
                    }
                });
            }
        });
    }
}
