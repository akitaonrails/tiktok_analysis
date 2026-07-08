package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742280T9u extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C259800zU<Activity> LL;
    public final /* synthetic */ C1519130pdP LLILLJJLI;
    public final /* synthetic */ NetworkUniversalPopupDispatchResponse LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ IGeoBlockingService LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C742280T9u(C259800zU<Activity> c259800zU, C1519130pdP c1519130pdP, NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse, int i, String str, String str2, IGeoBlockingService iGeoBlockingService, int i2) {
        super(0);
        this.LL = c259800zU;
        this.LLILLJJLI = c1519130pdP;
        this.LLILLL = networkUniversalPopupDispatchResponse;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = iGeoBlockingService;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Bundle bundle = new Bundle();
        int i = this.LLILZ;
        String str = this.LLILZIL;
        int i2 = this.LLIZLLLIL;
        C786410Ut5.LJJJI(Scene.SCENE_SERVICE, String.valueOf(i), bundle);
        C786410Ut5.LJJJI("business", str, bundle);
        bundle.putInt("on_nuj_or_login", i2);
        AppLogNewUtils.LJ("pns_uc_popup_center_callback", bundle);
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "pns_uc_popup_use_initial_activity_for_display", true, false)) {
            Activity activity = this.LL.element;
            if (activity != null) {
                this.LLILLJJLI.LIZJ(activity, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZLLLIL);
            }
        } else {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            Activity activityLIZ = C06MM.LIZ(abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LIZIZ() : null);
            if (activityLIZ != null) {
                Bundle bundle2 = new Bundle();
                int i3 = this.LLILZ;
                String str2 = this.LLILZIL;
                int i4 = this.LLIZLLLIL;
                C786410Ut5.LJJJI(Scene.SCENE_SERVICE, String.valueOf(i3), bundle2);
                C786410Ut5.LJJJI("business", str2, bundle2);
                bundle2.putInt("entry", 0);
                bundle2.putInt("on_nuj_or_login", i4);
                AppLogNewUtils.LJ("pns_uc_popup_get_fresh_activity", bundle2);
                this.LLILLJJLI.LIZJ(activityLIZ, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZLLLIL);
            } else {
                Bundle bundle3 = new Bundle();
                int i5 = this.LLILZ;
                String str3 = this.LLILZIL;
                int i6 = this.LLIZLLLIL;
                C786410Ut5.LJJJI(Scene.SCENE_SERVICE, String.valueOf(i5), bundle3);
                C786410Ut5.LJJJI("business", str3, bundle3);
                bundle3.putInt("entry", 1);
                bundle3.putInt("on_nuj_or_login", i6);
                AppLogNewUtils.LJ("pns_uc_popup_get_fresh_activity", bundle3);
                C11O8 c11o8LJJJLZIJ = C1906580ziK.LIZJ().LJIIJ().LJL(C11S5.LIZIZ).LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ());
                final C1519130pdP c1519130pdP = this.LLILLJJLI;
                final NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse = this.LLILLL;
                final int i7 = this.LLILZ;
                final String str4 = this.LLILZIL;
                final String str5 = this.LLILZLL;
                final IGeoBlockingService iGeoBlockingService = this.LLIZ;
                final int i8 = this.LLIZLLLIL;
                c11o8LJJJLZIJ.LJJLJLI(new C09JN() { // from class: X.0T5s
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        Activity activityLIZ2;
                        C1C7U.LIZ("PopupShowAction@1ee6.executeInternal$1$popupManagerCallbackBlock$1$5");
                        Activity activityLIZIZ = ((AbstractC1387200mCc) obj).LIZIZ();
                        if (activityLIZIZ != null && (activityLIZ2 = C1388190mED.LIZ(activityLIZIZ)) != null) {
                            c1519130pdP.LIZJ(activityLIZ2, networkUniversalPopupDispatchResponse, i7, str4, str5, i8);
                        }
                        C1C7U.LIZIZ("PopupShowAction@1ee6.executeInternal$1$popupManagerCallbackBlock$1$5");
                    }
                });
            }
        }
        return Unit.LIZ;
    }
}
