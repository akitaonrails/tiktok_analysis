package X;

import Y.ARunnableS128S0100000_28;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.api.IFeedModuleService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS463S0200000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10PX, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10PX implements C10H4 {
    public Fragment LIZ;
    public final /* synthetic */ C10PW LIZIZ;

    @Override // X.C10H4
    public final C19EG LIZIZ() {
        return this.LIZIZ.LL;
    }

    @Override // X.C10H4
    public final Runnable LIZLLL() {
        return new ARunnableS128S0100000_28(this.LIZIZ, 97);
    }

    @Override // X.C10H4
    public final Function2<Fragment, Boolean, Unit> LJ() {
        return new AwS463S0200000_28(this.LIZIZ, this, 11);
    }

    @Override // X.C10H4
    public final C1912560zry LJFF() {
        Object objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri data;
        Intent intent = this.LIZIZ.LLILZIL;
        if (intent == null || (data = intent.getData()) == null || (objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "awedp_require_login")) == null) {
            objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = Boolean.FALSE;
        }
        boolean zLJFF = Intrinsics.LJFF("normal", objCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        int iLIZ = this.LIZIZ.LLILLL.LIZ();
        boolean zLIZLLL = this.LIZIZ.LLILLL.LIZLLL();
        boolean zLIZIZ = this.LIZIZ.LLILLL.LIZIZ();
        C10PW c10pw = this.LIZIZ;
        Intent intent2 = c10pw.LLILZIL;
        C10NB c10nb = intent2 != null ? new C10NB(intent2, zLJFF) : null;
        c10pw.LLILLL.LIZJ();
        return new C1912560zry(zLJFF, iLIZ, zLIZLLL, zLIZIZ, c10nb);
    }

    @Override // X.C10H4
    public final C19EG LLILLIZIL() {
        return this.LIZIZ.LL;
    }

    @Override // X.C10H4
    public final void LIZJ() {
        if (C1514430pVp.LIZLLL().booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryRefreshFeed isNUJAffectFeedContent:");
            sbLIZ.append(this.LIZIZ.LLILZLL);
            C1911410zq7.LIZJ("NUJFlowAbility", C2188811AlT.LIZIZ(sbLIZ));
            C10R5 c10r5 = C10R5.LJIIIIZZ;
            C10RS.LIZ().LJFF = true;
            if (((IFeedModuleService) ServiceManager.get().getService(IFeedModuleService.class)).autoRefreshInNUJ() && this.LIZIZ.LLILZLL) {
                if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    C1570240qxq.LIZ.setValue("nuj_before_swipe_up");
                    return;
                } else {
                    C1570240qxq.LIZ.postValue("nuj_before_swipe_up");
                    return;
                }
            }
            C19245110Qv.LIZ.getClass();
            if (C19245110Qv.LIZ()) {
                return;
            }
            C1440005kM.LIZ(new C1588880rRu("nuj_refresh", true ^ this.LIZIZ.LLILZLL));
        }
    }

    @Override // X.C10H4
    public final Fragment LIZ() {
        return this.LIZ;
    }

    public C10PX(C10PW c10pw) {
        this.LIZIZ = c10pw;
    }
}
