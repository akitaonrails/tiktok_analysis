package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.BusinessExtra;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416490mxr implements InterfaceC1416020mx6<C1412860ms0> {
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;
    public final C1415940mwy LLILLL;
    public final Function0<VideoPublishEditModel> LLILZ;

    @Override // X.InterfaceC1416020mx6
    public final boolean LIZ(C1412860ms0 c1412860ms0) {
        C1412870ms1 c1412870ms1 = C1412870ms1.LIZ;
        Asset asset = c1412860ms0.LIZ;
        c1412870ms1.getClass();
        if (C1412870ms1.LIZJ(asset) == MixEditingMaterialType.AUTO_PICK_TEMPLATE) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1416020mx6
    public final /* bridge */ /* synthetic */ boolean LIZLLL(C1412860ms0 c1412860ms0) {
        return false;
    }

    @Override // X.InterfaceC1416020mx6
    public final /* bridge */ /* synthetic */ void LIZIZ(C1412860ms0 c1412860ms0) {
    }

    @Override // X.InterfaceC1416020mx6
    public final void LIZJ(C1412860ms0 c1412860ms0, boolean z, InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz) {
        String nle_summary;
        C1412860ms0 c1412860ms02 = c1412860ms0;
        Asset asset = c1412860ms02.LIZ;
        String asset_id = asset.getAsset_id();
        String music_id = asset.getBusiness_extra().getMusic_id();
        if (music_id == null) {
            music_id = "";
        }
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickTemplateAssetDownloader -> downloadData ENTRY assetId=");
        sbLIZ.append(asset_id);
        sbLIZ.append(", musicId=");
        sbLIZ.append(music_id);
        sbLIZ.append(", highPriority=");
        sbLIZ.append(z);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        BusinessExtra business_extra = asset.getBusiness_extra();
        boolean z2 = true;
        if (business_extra == null || (nle_summary = business_extra.getNle_summary()) == null || !(!a0.LJJJIL(nle_summary))) {
            nle_summary = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AutoPickTemplateAssetDownloader -> downloadData: assetId=");
        sbLIZ2.append(asset_id);
        sbLIZ2.append(", musicId=");
        sbLIZ2.append(music_id);
        sbLIZ2.append(", hasNleSummary=");
        if (nle_summary == null) {
            z2 = false;
        }
        sbLIZ2.append(z2);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ2));
        if (nle_summary == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("AutoPickTemplateAssetDownloader -> nleSummary is null or blank, cannot proceed assetId=");
            sbLIZ3.append(asset_id);
            C201955140j.LJII(c0mj8, C2188811AlT.LIZIZ(sbLIZ3));
            interfaceC1437705jz.LIZ(new RuntimeException("AutoPick template requires nleSummary but it's null"));
            return;
        }
        C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI), new C2501109r7(new C1428705iX(asset_id, interfaceC1437705jz, null), C09IC.LJIL(new C23036090w(new C094V(new C861640Xr8(new C1437805k0(asset_id, asset, interfaceC1437705jz, c1412860ms02, null), C1416120mxG.LIZLLL(new C1466840oH4(new C861640Xr8(new C1428405iU(asset_id, null), new C05RH(new C516501zn(C1414150mu5.LIZIZ(asset), 1))), 6), new C414301jJ(new C2325381G0q(new C1428305iT(asset_id, null), new C861640Xr8(new C1428505iV(asset_id, null), C09IC.LJ(new C0LB7(nle_summary, this, null))), 0), new C2325381G0q(new C1428205iS(asset_id, music_id, null), new C861640Xr8(new C1428605iW(asset_id, music_id, null), C09IC.LJIL(C09IC.LJ(new C533420Kw0(music_id, this.LL, null)), C0PEM.LIZJ)), 0), new C1428805iY(interfaceC1437705jz, null)))), C19990313Jl.LJII(10, EnumC19990213Jk.SECONDS), null)), C2107308Nj.LIZ), 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1416490mxr(Context context, LifecycleOwner lifecycleOwner, C1415940mwy c1415940mwy, Function0<? extends VideoPublishEditModel> function0) {
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = c1415940mwy;
        this.LLILZ = function0;
    }
}
