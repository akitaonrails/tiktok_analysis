package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import kotlinx.coroutines.flow.b;

/* JADX INFO: renamed from: X.0mxq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416480mxq implements InterfaceC1416020mx6<C1412860ms0> {
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;
    public final InterfaceC1635410sex LLILLL;
    public final C1415940mwy LLILZ;

    @Override // X.InterfaceC1416020mx6
    public final boolean LIZ(C1412860ms0 c1412860ms0) {
        C1412870ms1 c1412870ms1 = C1412870ms1.LIZ;
        Asset asset = c1412860ms0.LIZ;
        c1412870ms1.getClass();
        if (C1412870ms1.LIZJ(asset) == MixEditingMaterialType.AI_TEMPLATE) {
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
        C1412860ms0 c1412860ms02 = c1412860ms0;
        Asset asset = c1412860ms02.LIZ;
        String asset_id = asset.getAsset_id();
        String str = this.LLILZ.LJIIIZ;
        C1466840oH4 c1466840oH4 = new C1466840oH4(new C05RH(new C516501zn(C1414150mu5.LIZIZ(asset), 1)), 2);
        b bVarLJ = C09IC.LJ(new C1416410mxj(this.LLILZ, this, asset.getBusiness_extra().getTemplate_group_id(), asset.getBusiness_extra().getTemplate_type(), asset.getBusiness_extra().getMusic_id(), asset_id, str, null));
        C1DFB c1dfb = C0PEM.LIZJ;
        C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI), new C2501109r7(new C1430005ik(interfaceC1437705jz, null), C09IC.LJIL(new C861640Xr8(new C1437905k1(interfaceC1437705jz, asset, c1412860ms02, null), C1416120mxG.LIZLLL(c1466840oH4, new C414301jJ(C09IC.LJIJJLI(new C1416780myK(this, asset_id, null), C09IC.LJIL(bVarLJ, c1dfb)), C09IC.LJIL(C09IC.LJ(new C533420Kw0(asset_id, this.LL, null)), c1dfb), new C1429905ij(interfaceC1437705jz, null)))), C2107308Nj.LIZ), 0));
    }

    public C1416480mxq(Context context, LifecycleOwner lifecycleOwner, InterfaceC1635410sex interfaceC1635410sex, C1415940mwy c1415940mwy) {
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = interfaceC1635410sex;
        this.LLILZ = c1415940mwy;
    }
}
