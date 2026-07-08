package X;

import Y.ACallableS24S1000000_9;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0MvW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584080MvW {
    public static final C584080MvW LIZ = new C584080MvW();

    public static final void LIZ() {
        if (((Boolean) C261130ALf.LIZ.getValue()).booleanValue() && ((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null)) {
            C15O7.LIZIZ(new ACallableS24S1000000_9(0), C20684815ws.LJFF(), null);
        }
    }

    public static final void LIZIZ(Aweme aweme, String str, String str2) {
        String aid;
        String authorUid;
        if (!((Boolean) C261130ALf.LIZ.getValue()).booleanValue() || !((IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class)).LJII(null)) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("video_status", str);
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null) {
            str3 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str3);
        C20684815ws.LJIILLIIL("earphone_unplug", c2344009Gk.LIZ);
    }
}
