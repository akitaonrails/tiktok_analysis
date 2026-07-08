package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0K0X, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K0X extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ FragmentManager LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C0K0S LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K0X(Context context, FragmentManager fragmentManager, int i, C0K0S c0k0s, Function0<Unit> function0) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = i;
        this.LLILZ = c0k0s;
        this.LLILZIL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.LL;
        FragmentManager fragmentManager = this.LLILLJJLI;
        int i = this.LLILLL;
        User user = this.LLILZ.LIZLLL.anchorDetail;
        Function0<Unit> function0 = this.LLILZIL;
        SubOnlyVideoOpenParams subOnlyVideoOpenParams = new SubOnlyVideoOpenParams("privilege_page_sov_section", EnumC492500JTc.PRIVILEGE_PAGE, i);
        C0K1Z c0k1z = C0K1Z.LIZ;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        User userLJ = C15WP.LJ(iUserService != null ? iUserService.getCurrentUser() : null);
        int iLIZ = C497820Jfg.LIZ(context);
        Boolean bool = Boolean.TRUE;
        c0k1z.getClass();
        C0K1Z.LIZ(fragmentManager, user, userLJ, iLIZ, bool, subOnlyVideoOpenParams, function0);
        return Unit.LIZ;
    }
}
