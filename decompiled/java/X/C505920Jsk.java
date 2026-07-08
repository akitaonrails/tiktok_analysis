package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.DetailSettingDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jsk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505920Jsk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ DetailSettingDialogFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505920Jsk(DetailSettingDialogFragment detailSettingDialogFragment) {
        super(0);
        this.LL = detailSettingDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SpacePost spacePost;
        DetailSettingDialogFragment detailSettingDialogFragment = this.LL;
        C504880Jr4 c504880Jr4 = detailSettingDialogFragment.LLIZ;
        if (c504880Jr4 != null && (spacePost = c504880Jr4.LLILLL) != null) {
            spacePost.isPinned = true;
        }
        C19EG activity = detailSettingDialogFragment.getActivity();
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            C504880Jr4 c504880Jr42 = detailSettingDialogFragment.LLIZ;
            c1389890mGx.LJIIJ(C497740JfY.LJIJI((c504880Jr42 == null || !c504880Jr42.LLJJJ) ? 2131844298 : 2131856645));
            c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
            c1389890mGx.LJII(R.attr.eu1);
            c1389890mGx.LJIIJJI();
        }
        this.LL.dismissAllowingStateLoss();
        return Unit.LIZ;
    }
}
