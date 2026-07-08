package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492560JTi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ FragmentManager LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C507650JvX LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492560JTi(Context context, FragmentManager fragmentManager, int i, C507650JvX c507650JvX, Function0<Unit> function0) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = fragmentManager;
        this.LLILLL = i;
        this.LLILZ = c507650JvX;
        this.LLILZIL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.LL;
        FragmentManager fragmentManager = this.LLILLJJLI;
        int i = this.LLILLL;
        User user = this.LLILZ.LLILZ.anchorDetail;
        C0JS0.LIZ(fragmentManager, new C0JS1(EnumC492180JRw.SUB_ONLY_VIDEO_PAGE, EnumC492200JRy.OPEN, "sub_privilege_page", user, Boolean.TRUE, Integer.valueOf(i), new SubOnlyVideoOpenParams("privilege_page_sov_section", EnumC492500JTc.PRIVILEGE_PAGE, i), 32), UserService.getInstance().user().LJIJJLI(), C497820Jfg.LIZ(context), this.LLILZIL);
        return Unit.LIZ;
    }
}
