package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06jw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1692206jw implements C06OA {
    public final /* synthetic */ C06ME LL;
    public final Context LLILLJJLI;
    public final PrivacySettingsFeature LLILLL;
    public final C01GW LLILZ;
    public TuxSheet LLILZIL;

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    public final boolean LIZ() {
        return C1095204Qc.LIZ() && C902250ZaR.LIZ() && (((Keva) this.LLILZ.getValue()).getBoolean(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID(), false) ^ true) && !this.LLILLL.LJIIZILJ() && !C1693106k5.LIZIZ();
    }

    public C1692206jw(Context context) {
        PrivacySettingsFeature imPrivacySettings = C1336205Ku.LIZ(false).getImPrivacySettings();
        this.LL = new C06ME();
        this.LLILLJJLI = context;
        this.LLILLL = imPrivacySettings;
        this.LLILZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(981));
    }
}
