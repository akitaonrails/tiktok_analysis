package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.experiment.FypLocationPopUpCertCheckOpt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS32S0001000_18;

/* JADX INFO: renamed from: X.0hWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@InterfaceC20647615qs("location")
public final class C1207600hWw extends AbstractC20660815t0 {
    public static String LLILZIL = "";
    public static Aweme LLILZLL;
    public final boolean LL;
    public final Function1<C20656615sK, Unit> LLILLJJLI;
    public String LLILLL;
    public final int LLILZ;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        if (!FypLocationPopUpCertCheckOpt.INSTANCE.enable()) {
            LLILZLL = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(LLILZIL);
        }
        Aweme aweme = LLILZLL;
        if (aweme == null || aweme.isAd()) {
            this.LLILLL = "104_1";
            return false;
        }
        Aweme aweme2 = LLILZLL;
        if (aweme2 == null || !AwemeBizExtKt.isRecBigCardFakeAweme(aweme2)) {
            this.LLILLL = null;
            return super.canShow();
        }
        this.LLILLL = "104_2";
        return false;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZ;
    }

    public C1207600hWw(InterfaceC20660615sy interfaceC20660615sy, Function1 function1) {
        super(interfaceC20660615sy);
        this.LL = true;
        this.LLILLJJLI = function1;
        this.LLILZ = 210;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        this.LLILLJJLI.invoke(c20656615sK);
    }

    @Override // X.AbstractC20656215sG
    public final void showPopupFailed(int i, String str) {
        String strValueOf;
        if (this.LL) {
            if (i != 104 || (strValueOf = this.LLILLL) == null) {
                strValueOf = String.valueOf(i);
            }
            C1207400hWc c1207400hWc = C1207400hWc.LIZ;
            String token = C1207610hWx.LIZ().getToken();
            c1207400hWc.getClass();
            C1207400hWc.LJII(0, "homepage_hot", token, "main_framework_reject", strValueOf);
        }
        C1207640hX0 c1207640hX0 = C1207640hX0.LIZ;
        c1207640hX0.getClass();
        c1207640hX0.LIZJ("popup_fail_reason_dispersion", new AwS32S0001000_18(i, 12));
    }
}
