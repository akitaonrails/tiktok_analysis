package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS118S0400000_22;

/* JADX INFO: renamed from: X.0nhR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444750nhR {
    public static final C1444750nhR LIZ = new C1444750nhR();

    /* JADX WARN: Type inference failed for: r2v2, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public static final void LIZ(PermissionConfigure permissionConfigure, C19EG c19eg, Function1 function1, Function0 function0, DialogInterface.OnDismissListener onDismissListener, C1DRG c1drg) {
        int i;
        C1DRG c1drgLJFF;
        InterfaceC1445380niS interfaceC1445380niS;
        PostBtnConfigure postBtnConfigure;
        C259800zU c259800zU = new C259800zU();
        AwS118S0400000_22 awS118S0400000_22 = new AwS118S0400000_22(function1, (Function1<? super Integer, Unit>) function0, (Function0<Unit>) permissionConfigure, (PermissionConfigure) c259800zU, (C259800zU<TuxSheet>) 3);
        if (permissionConfigure.getPostBtnConfigure() == null) {
            if (function0 != null) {
                postBtnConfigure = new PostBtnConfigure(true, "");
            } else {
                postBtnConfigure = null;
            }
            permissionConfigure.setPostBtnConfigure(postBtnConfigure);
        }
        if (C1444380ngq.LIZ() && ((c1drg != null && (interfaceC1445380niS = (InterfaceC1445380niS) c1drg.LJIIL(null, InterfaceC1445380niS.class)) != null) || ((c1drgLJFF = C1664600tQ2.LIZLLL(c19eg).LJFF()) != null && (interfaceC1445380niS = (InterfaceC1445380niS) c1drgLJFF.LJIIL(null, InterfaceC1445380niS.class)) != null))) {
            interfaceC1445380niS.kW0(permissionConfigure.getPostBtnConfigure(), awS118S0400000_22, function0, onDismissListener);
            C20684815ws.LJIILLIIL("video_privacy_setting_viewer_range_click", C2097908Jt.LIZJ(new Pair("enter_method", permissionConfigure.getEnterMethod())));
            return;
        }
        PublishDefaultPermissionFragment publishDefaultPermissionFragment = new PublishDefaultPermissionFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "extra_permission_configure", permissionConfigure);
        bundle.putBoolean("is_auto_pop", false);
        publishDefaultPermissionFragment.setArguments(bundle);
        publishDefaultPermissionFragment.LLJILJIL = awS118S0400000_22;
        publishDefaultPermissionFragment.LLJILJILJ = function0;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = publishDefaultPermissionFragment;
        if (C10BZ.LIZ()) {
            i = R.attr.a1b;
        } else {
            i = R.attr.zp;
        }
        c1390920mIc.LIZ.LLJI = C1308910kAL.LIZJ(i, c19eg);
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLILLJJLI = new DialogInterfaceOnDismissListenerC1466670oGn(publishDefaultPermissionFragment, onDismissListener, 2);
        if (C10BZ.LIZ()) {
            c1390920mIc.LIZJ(true);
        }
        ?? r2 = c1390920mIc.LIZ;
        c259800zU.element = r2;
        r2.show(c19eg.getSupportFragmentManager(), "PublishPermissionSheet");
        C20684815ws.LJIILLIIL("video_privacy_setting_viewer_range_click", C2097908Jt.LIZJ(new Pair("enter_method", permissionConfigure.getEnterMethod())));
    }
}
