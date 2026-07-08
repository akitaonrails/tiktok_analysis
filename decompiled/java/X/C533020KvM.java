package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0KvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.AssetHandler$assetDownloadPathFlow$1", f = "AssetHandler.kt", l = {258}, m = "invokeSuspend")
public final class C533020KvM extends C09AX implements Function2<C094D<? super String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C532980KvI LLILLL;
    public final /* synthetic */ Asset LLILZ;
    public final /* synthetic */ EffectManager LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533020KvM(C532980KvI c532980KvI, Asset asset, EffectManager effectManager, InterfaceC1364105Vn<? super C533020KvM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c532980KvI;
        this.LLILZ = asset;
        this.LLILZIL = effectManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533020KvM c533020KvM = new C533020KvM(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c533020KvM.LLILLJJLI = obj;
        return c533020KvM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AssetHandler@472b.assetDownloadPathFlow$1");
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
            C532980KvI c532980KvI = this.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloadAsset start: assetId=");
            sbLIZ.append(this.LLILZ.getAsset_id());
            sbLIZ.append(" resourceId=");
            sbLIZ.append(this.LLILZ.getResource_id());
            sbLIZ.append(" assetType=");
            sbLIZ.append(this.LLILZ.getAsset_type());
            c532980KvI.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            EffectManager effectManager = this.LLILZIL;
            final Asset asset = this.LLILZ;
            final C532980KvI c532980KvI2 = this.LLILLL;
            effectManager.downloadAsset(asset, new C13MA<String>() { // from class: X.0KvL
                @Override // X.C13MA
                public final void onSuccess(String str) {
                    String str2 = str;
                    C532980KvI c532980KvI3 = c532980KvI2;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("downloadAsset success: assetId=");
                    sbLIZ2.append(asset.getAsset_id());
                    sbLIZ2.append(" -> ");
                    sbLIZ2.append(str2);
                    c532980KvI3.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                    c094d.LJIIIIZZ(str2);
                    c094d.LJIIJJI(null);
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void preProcess(String str) {
                }

                @Override // X.C13MA
                public final void onFail(String str, C1662010tLr c1662010tLr) {
                    C532980KvI c532980KvI3 = c532980KvI2;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("downloadAsset failed: assetId=");
                    sbLIZ2.append(asset.getAsset_id());
                    sbLIZ2.append(" code=");
                    sbLIZ2.append(c1662010tLr.LIZ);
                    sbLIZ2.append(" msg=");
                    sbLIZ2.append(c1662010tLr.LIZIZ);
                    c532980KvI3.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                    C094D<String> c094d2 = c094d;
                    String str2 = c1662010tLr.LIZIZ;
                    if (str2 == null) {
                        str2 = "downloadAsset failed";
                    }
                    c094d2.LJIIJJI(new RuntimeException(str2));
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(422);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("AssetHandler@472b.assetDownloadPathFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AssetHandler@472b.assetDownloadPathFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super String> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
