package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03uQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C992803uQ extends C040Q implements InterfaceC1164530gPT {
    public DeliveryPanelStarter.PackedDeliverySelectResult LLJIJIL;

    @Override // X.C040Q
    public final void LJ(Bundle bundle) {
    }

    @Override // X.C040Q
    public final void LJI(DialogInterface dialogInterface) {
    }

    @Override // X.C040Q
    public final void LJIIJ(Dialog dialog) {
    }

    @Override // X.C040Q
    public final void LJIIJJI() {
    }

    @Override // X.C040Q
    public final void LJIIIZ() {
        DeliveryPanelStarter deliveryPanelStarter = DeliveryPanelStarter.LIZ;
        DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = this.LLJIJIL;
        deliveryPanelStarter.getClass();
        C23260099m c23260099m = DeliveryPanelStarter.LIZIZ;
        if (c23260099m != null) {
            C189200o6.m2constructorimpl(packedDeliverySelectResult);
            c23260099m.resumeWith(packedDeliverySelectResult);
        }
        DeliveryPanelStarter.LIZIZ = null;
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_delivery_panel_close", this);
    }

    @Override // X.C040Q
    public final void LJII(Bundle bundle) {
        new C04CH("DeliveryH5Strategy").LIZJ(false);
    }

    public C992803uQ(Fragment fragment, DeliveryPanelViewModel deliveryPanelViewModel) {
        super(fragment, deliveryPanelViewModel);
        this.LLILZLL = false;
        this.LLJIJIL = new DeliveryPanelStarter.PackedDeliverySelectResult(null, null, null, null, null, null, Boolean.FALSE, null, null);
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Type type;
        if (Intrinsics.LJFF(str, "ec_delivery_panel_close")) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJ(DeliveryPanelStarter.PackedDeliverySelectResult.class));
                } else {
                    type = new TypeToken<DeliveryPanelStarter.PackedDeliverySelectResult>() { // from class: X.03uR
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                if (!(objFromJson instanceof DeliveryPanelStarter.PackedDeliverySelectResult)) {
                    objFromJson = null;
                }
                DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = (DeliveryPanelStarter.PackedDeliverySelectResult) objFromJson;
                if (packedDeliverySelectResult == null) {
                    return;
                }
                this.LLJIJIL = packedDeliverySelectResult;
                Fragment fragment = this.LLJ;
                if (fragment instanceof DialogFragment) {
                    ((DialogFragment) fragment).dismiss();
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.C040Q
    public final View LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_delivery_panel_close", this);
        if (this.LLJ.getActivity() != null) {
            AbstractC1743840vTq abstractC1743840vTqLIZ = LIZ();
            Fragment fragment = this.LLJ;
            if ((fragment instanceof BottomSheetDialogFragment) && abstractC1743840vTqLIZ != null) {
                abstractC1743840vTqLIZ.LIZLLL((BottomSheetDialogFragment) fragment);
            }
            return abstractC1743840vTqLIZ;
        }
        return null;
    }
}
