package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.DetailSettingDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jsl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505930Jsl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ DetailSettingDialogFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505930Jsl(DetailSettingDialogFragment detailSettingDialogFragment) {
        super(0);
        this.LL = detailSettingDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SpacePost spacePost;
        C504880Jr4 c504880Jr4 = this.LL.LLIZ;
        C766270U4b.LJIIJJI(C497740JfY.LJIJI((c504880Jr4 == null || !c504880Jr4.LLJJJ) ? 2131844297 : 2131856644));
        DetailSettingDialogFragment detailSettingDialogFragment = this.LL;
        C504880Jr4 c504880Jr42 = detailSettingDialogFragment.LLIZ;
        if (c504880Jr42 != null && (spacePost = c504880Jr42.LLILLL) != null) {
            spacePost.isPinned = false;
        }
        detailSettingDialogFragment.dismissAllowingStateLoss();
        return Unit.LIZ;
    }
}
