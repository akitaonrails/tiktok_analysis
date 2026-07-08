package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.effectmanager.effect.model.Asset;

/* JADX INFO: renamed from: X.0mxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416540mxw implements InterfaceC1416020mx6<C1412860ms0> {
    public final Context LL;
    public final LifecycleOwner LLILLJJLI;

    @Override // X.InterfaceC1416020mx6
    public final boolean LIZ(C1412860ms0 c1412860ms0) {
        C1412870ms1 c1412870ms1 = C1412870ms1.LIZ;
        Asset asset = c1412860ms0.LIZ;
        c1412870ms1.getClass();
        if (C1412870ms1.LIZJ(asset) == MixEditingMaterialType.SOUND_SYNC) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1416020mx6
    public final void LIZIZ(C1412860ms0 c1412860ms0) {
        C1412860ms0 c1412860ms02 = c1412860ms0;
        String resource_id = c1412860ms02.LIZ.getResource_id();
        String asset_id = c1412860ms02.LIZ.getAsset_id();
        if (C123100dR.LIZ(resource_id)) {
            C1416830myP.LIZ.getClass();
            C1416830myP.LIZ(resource_id, asset_id, false);
        }
    }

    @Override // X.InterfaceC1416020mx6
    public final /* bridge */ /* synthetic */ boolean LIZLLL(C1412860ms0 c1412860ms0) {
        return true;
    }

    public C1416540mxw(Context context, LifecycleOwner lifecycleOwner) {
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
    }

    @Override // X.InterfaceC1416020mx6
    public final void LIZJ(C1412860ms0 c1412860ms0, boolean z, InterfaceC1437705jz<C1412860ms0> interfaceC1437705jz) {
        C1412860ms0 c1412860ms02 = c1412860ms0;
        C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI), new C861640Xr8(new C1437005js(interfaceC1437705jz, c1412860ms02, null), new C2501109r7(new C1429805ii(interfaceC1437705jz, null), new C414301jJ(C09IC.LJ(new C1416580my0(c1412860ms02.LIZ.getResource_id(), c1412860ms02.LIZ.getAsset_id(), this, null)), C09IC.LJ(new C1416610my3(null)), new C01NG(null)), 0)));
    }
}
