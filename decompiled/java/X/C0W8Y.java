package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;

/* JADX INFO: renamed from: X.0W8Y, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W8Y {
    public static void LIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", str);
        C20684815ws.LJIILLIIL("shortcut_click", c2344009Gk.LIZ);
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJ().LJI(EnumC19261510Xd.SHORTCUT, str);
    }
}
