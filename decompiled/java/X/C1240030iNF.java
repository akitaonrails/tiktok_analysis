package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iNF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240030iNF extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C1239960iN8 LLILLJJLI;
    public final /* synthetic */ BaseLoginMethod LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240030iNF(int i, C1239960iN8 c1239960iN8, BaseLoginMethod baseLoginMethod, String str, boolean z, Context context) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c1239960iN8;
        this.LLILLL = baseLoginMethod;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        String str;
        C19EG c19eg;
        if (this.LL >= 0) {
            C1239960iN8 c1239960iN8 = this.LLILLJJLI;
            BaseLoginMethod baseLoginMethod = this.LLILLL;
            c1239960iN8.getClass();
            long time = baseLoginMethod.safeExpires().getTime() - 31536000000L;
            Long lastActiveTime = baseLoginMethod.getLastActiveTime();
            if (lastActiveTime != null) {
                long jLongValue = lastActiveTime.longValue();
                if (jLongValue < 0) {
                    time = jLongValue;
                }
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("user_id", baseLoginMethod.getUid());
            c2344009Gk.LJIIIIZZ("last_active", C1240010iND.LIZ(time));
            c2344009Gk.LJIIIIZZ("platform", C849680XUw.LJFF(baseLoginMethod));
            c2344009Gk.LIZJ(c1239960iN8.LL.size(), "user_cnt");
            C20684815ws.LJIILLIIL("login_notify_remove_account_confirm", c2344009Gk.LIZ);
            C0XWJ c0xwj = C0XWJ.LIZ;
            int size = this.LLILLJJLI.LL.size();
            String str2 = this.LLILZ;
            if (this.LLILZIL) {
                str = "ocl";
            } else {
                str = "hl";
            }
            c0xwj.getClass();
            C0XWJ.LJIIJ(size, "click_remove", str2, str);
            this.LLILLJJLI.LL.remove(this.LLILLL);
            ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LIZ(this.LLILLL.getUid());
            C1239960iN8 c1239960iN82 = this.LLILLJJLI;
            c1239960iN82.getClass();
            String str3 = LoginMethodListFragment._pnsPageId;
            c1239960iN82.LL = C1240060iNI.LIZ();
            c1239960iN82.notifyDataSetChanged();
            if (this.LLILLJJLI.LL.isEmpty()) {
                Activity activityLIZ = C1388190mED.LIZ(this.LLILZLL);
                if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                    C0D5L.LIZIZ(c19eg);
                }
            }
        }
        return Unit.LIZ;
    }
}
