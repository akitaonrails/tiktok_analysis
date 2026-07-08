package X;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0qPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549030qPd {
    public static void LIZ(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        Uri uriLIZ;
        EnumC1549040qPe enumC1549040qPe;
        View viewE1 = interfaceC1541990qEH.e1();
        if (viewE1 != null) {
            InterfaceC1531560pxS interfaceC1531560pxS = interfaceC1541990qEH.getHybridContext().hybridParams;
            String queryParameter = null;
            if (interfaceC1531560pxS != null) {
                uriLIZ = interfaceC1531560pxS.LIZ();
            } else {
                uriLIZ = null;
            }
            if (uriLIZ == null || (queryParameter = UriProtector.getQueryParameter(uriLIZ, "source_btm_token")) == null || queryParameter.length() == 0) {
                try {
                    queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "source_btm_token");
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            if (queryParameter != null && queryParameter.length() != 0) {
                C1545850qKV.LLILLJJLI.put(viewE1, queryParameter);
            }
            Object objLJFF = interfaceC1541990qEH.getHybridContext().LJFF(InterfaceC1059280dfi.class);
            if (objLJFF instanceof Activity) {
                enumC1549040qPe = EnumC1549040qPe.Activity;
            } else if (objLJFF instanceof DialogFragment) {
                enumC1549040qPe = EnumC1549040qPe.DialogFragment;
            } else {
                enumC1549040qPe = EnumC1549040qPe.View;
            }
            BtmSDK.INSTANCE.getOnHybridContainerLoadSchemaCallback().LIZ(String.valueOf(uriLIZ), viewE1, "", queryParameter, enumC1549040qPe);
        }
    }
}
