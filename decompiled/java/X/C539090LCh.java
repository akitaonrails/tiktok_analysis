package X;

import android.content.Context;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaUtil;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLETemplateJNI;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.cut_reportor_interface.ICutReporter;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModelKt;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LCh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.CCTemplateAssetDownloaderKt$requestNLETemplateModel$1", f = "CCTemplateAssetDownloader.kt", l = {311}, m = "invokeSuspend")
public final class C539090LCh extends C09AX implements Function2<C094D<? super Pair<? extends Integer, ? extends NLETemplateModel>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1415940mwy LLILLL;
    public final /* synthetic */ Asset LLILZ;
    public final /* synthetic */ Integer LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539090LCh(C1415940mwy c1415940mwy, Asset asset, Integer num, InterfaceC1364105Vn<? super C539090LCh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1415940mwy;
        this.LLILZ = asset;
        this.LLILZIL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C539090LCh c539090LCh = new C539090LCh(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c539090LCh.LLILLJJLI = obj;
        return c539090LCh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC539100LCi enumC539100LCi;
        boolean z;
        boolean z2;
        EnumC1412640mre enumC1412640mreLIZLLL;
        C1C7U.LIZ("CCTemplateAssetDownloaderKt@f9f7.requestNLETemplateModel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            final C118300cf c118300cf = new C118300cf();
            c118300cf.element = -1;
            CutsameDataItem cutsameDataItemLIZ = this.LLILLL.LIZJ.LIZ(this.LLILZ);
            if (cutsameDataItemLIZ != null) {
                final CutsameDataItem cutsameDataItem = cutsameDataItemLIZ;
                C1415940mwy c1415940mwy = this.LLILLL;
                ITemplateResourceService iTemplateResourceService = c1415940mwy.LIZIZ;
                Context context = c1415940mwy.LIZ;
                String str = cutsameDataItem.templateUrl;
                String str2 = cutsameDataItem.md5;
                if (!C1413080msM.LIZIZ(this.LLILZ) && this.LLILZ.getAsset_type() != AssetType.SGT.getValue()) {
                    enumC539100LCi = EnumC539100LCi.CUTSAME;
                } else {
                    enumC539100LCi = EnumC539100LCi.UGC;
                }
                if (!C1416120mxG.LIZ(this.LLILZ) && !C1416120mxG.LIZJ(this.LLILZ)) {
                    z = false;
                } else {
                    z = true;
                }
                if (this.LLILZ.getAsset_type() == AssetType.SGT.getValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C1419810n3D c1419810n3D = C1419810n3D.LIZ;
                AssetType assetType = AssetPanelModelKt.toAssetType(this.LLILZ.getAsset_type());
                if (assetType == null || (enumC1412640mreLIZLLL = C1412660mrg.LIZLLL(assetType)) == null) {
                    enumC1412640mreLIZLLL = EnumC1412640mre.CUT_SAME;
                }
                int value = enumC1412640mreLIZLLL.getValue();
                c1419810n3D.getClass();
                NLEModelDownloader nLEModelDownloaderLIZIZ = C1419810n3D.LIZIZ(value);
                BinderC532620Kui binderC532620Kui = new BinderC532620Kui("wangp", cutsameDataItem.templateId, 4);
                final Asset asset = this.LLILZ;
                iTemplateResourceService.LJIIIZ(context, str, new C1428840nHm(str2, (Boolean) null, z, nLEModelDownloaderLIZIZ, enumC539100LCi, (ICutReporter) binderC532620Kui, false, z2, new NLEPrepareListener() { // from class: X.0LCg
                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                        if (nLETemplateModel == null) {
                            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("requestNLETemplateModel onPreSuccess: model is null, assetId=");
                            sbLIZ.append(asset.getAsset_id());
                            sbLIZ.append(", templateId=");
                            sbLIZ.append(cutsameDataItem.templateId);
                            C201955140j.LJIJI(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
                            return;
                        }
                        C0MJ8 c0mj82 = C0MJ8.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("requestNLETemplateModel onPreSuccess: assetId=");
                        sbLIZ2.append(asset.getAsset_id());
                        sbLIZ2.append(", templateId=");
                        sbLIZ2.append(cutsameDataItem.templateId);
                        sbLIZ2.append(", isPugc=");
                        sbLIZ2.append(C1413080msM.LIZIZ(asset));
                        C201955140j.LIZJ(c0mj82, C2188811AlT.LIZIZ(sbLIZ2));
                        if (C1413080msM.LIZIZ(asset)) {
                            C0EK3 c0ek3 = new C0EK3();
                            c0ek3.LIZJ(nLETemplateModel);
                            c0ek3.LIZ();
                            C0EK3.LIZIZ(nLETemplateModel);
                        }
                    }

                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onSuccess(NLETemplateModel nLETemplateModel) {
                        if (nLETemplateModel != null) {
                            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("[MixEditDl] NLEPrepareListener.onSuccess t=");
                            sbLIZ.append(System.currentTimeMillis());
                            sbLIZ.append(" assetId=");
                            sbLIZ.append(asset.getAsset_id());
                            sbLIZ.append(" templateId=");
                            sbLIZ.append(cutsameDataItem.templateId);
                            sbLIZ.append(" isPugc=");
                            sbLIZ.append(C1413080msM.LIZIZ(asset));
                            C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
                            VecNLEResourceNodeSPtr allResources = nLETemplateModel.getAllResources();
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(allResources, 10));
                            Iterator<NLEResourceNode> it2 = allResources.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(it2.next().getResourceFile());
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (C123100dR.LIZ((String) obj2)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                NLEMediaUtil.getMediaVideoInfo((String) it3.next());
                            }
                            c094d.LJIIIIZZ(new Pair<>(100, nLETemplateModel));
                        } else {
                            C0MJ8 c0mj82 = C0MJ8.LIZIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("requestNLETemplateModel onSuccess: model is null, assetId=");
                            sbLIZ2.append(asset.getAsset_id());
                            sbLIZ2.append(", templateId=");
                            sbLIZ2.append(cutsameDataItem.templateId);
                            C201955140j.LJIJI(c0mj82, C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        c094d.LJIIJJI(null);
                    }

                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onError(int i2, String str3) {
                        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("requestNLETemplateModel onError: assetId=");
                        sbLIZ.append(asset.getAsset_id());
                        sbLIZ.append(", templateId=");
                        sbLIZ.append(cutsameDataItem.templateId);
                        sbLIZ.append(", code=");
                        sbLIZ.append(i2);
                        sbLIZ.append(", message=");
                        sbLIZ.append(str3);
                        sbLIZ.append(", sdkSupportFeatures=");
                        sbLIZ.append(NLETemplateJNI.NLETemplateModel_getSupportFeatureList());
                        sbLIZ.append(", templateUrl=");
                        sbLIZ.append(cutsameDataItem.templateUrl);
                        C201955140j.LJII(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
                        c094d.LJIIJJI(new RuntimeException("request nle model of CC failed"));
                    }

                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onProgress(float f, String str3) {
                        int iLJ = C13LZ.LJ((int) (10.0f * f), 0, 10);
                        C118300cf c118300cf2 = c118300cf;
                        if (iLJ != c118300cf2.element) {
                            c118300cf2.element = iLJ;
                            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("requestNLETemplateModel onProgress: assetId=");
                            sbLIZ.append(asset.getAsset_id());
                            sbLIZ.append(", templateId=");
                            sbLIZ.append(cutsameDataItem.templateId);
                            sbLIZ.append(", progress=");
                            sbLIZ.append(f);
                            sbLIZ.append(", ~");
                            sbLIZ.append(iLJ * 10);
                            sbLIZ.append("%, message=");
                            sbLIZ.append(str3);
                            C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
                        }
                        c094d.LJIIIIZZ(new Pair<>(Integer.valueOf((int) (f * 100)), null));
                    }
                }, 138), null, this.LLILZIL);
                AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(520);
                this.LL = 1;
                if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                    C1C7U.LIZIZ("CCTemplateAssetDownloaderKt@f9f7.requestNLETemplateModel$1");
                    return objLJFF;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CCTemplateAssetDownloaderKt@f9f7.requestNLETemplateModel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Pair<? extends Integer, ? extends NLETemplateModel>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
