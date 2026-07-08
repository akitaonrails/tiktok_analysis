package X;

import Y.ARunnableS105S0100000_5;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ig8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472620Ig8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C472620Ig8(View view, User user, long j, Long l, Long l2, int i, int i2) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = user;
        this.LLILLL = j;
        this.LLILZ = l;
        this.LLILZIL = l2;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Long l;
        this.LL.animate().scaleX(0.9f).scaleY(0.9f).setDuration(100L).withEndAction(new ARunnableS105S0100000_5(this.LL, 105)).start();
        Long l2 = this.LLILLJJLI.followStatus;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(((l2 == null || l2.longValue() != 1) && ((l = this.LLILLJJLI.followStatus) == null || l.longValue() != 2)) ? "livesdk_follow" : "livesdk_unfollow");
        c474500IjALIZ.LJJII("live_merge", "enter_from_merge");
        c474500IjALIZ.LJJII("toplive_live_cover", "enter_method");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII("skylight_maf_icon", "click_user_position");
        c474500IjALIZ.LJJII("live_audience_c_anchor", "request_page");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLILLL), "to_user_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLILLL), "anchor_id");
        c474500IjALIZ.LJJII(this.LLILZ, "room_id");
        c474500IjALIZ.LJJII(this.LLILZIL, "follow_status");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZLL), "is_maf");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLIZ), "is_frequently_watched");
        c474500IjALIZ.LJJII(1, "is_from_live_cover");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
