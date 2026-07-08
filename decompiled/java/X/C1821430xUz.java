package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicesku.PcsServiceSkuDialog;
import com.bytedance.android.livesdkapi.host.user.IHostPad;

/* JADX INFO: renamed from: X.0xUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821430xUz {
    public static void LIZ(C1822010xVv c1822010xVv) {
        FragmentManager fragmentManagerLIZJ = C507500JvI.LIZJ((Context) C507500JvI.LIZIZ().get());
        PcsServiceSkuDialog pcsServiceSkuDialog = new PcsServiceSkuDialog();
        pcsServiceSkuDialog.LLJZIJLIL = c1822010xVv;
        C19322110iZ.LJ(fragmentManagerLIZJ, pcsServiceSkuDialog, null, "service_plus_sku", null, C467770IVz.LIZ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)), null);
    }
}
