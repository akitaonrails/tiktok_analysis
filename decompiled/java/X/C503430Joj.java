package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SubSpaceFeedAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Joj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503430Joj extends C09AY implements Function2<UIAssem, C291001Au<? extends SpacePost>, Unit> {
    public final /* synthetic */ SubSpaceFeedAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503430Joj(SubSpaceFeedAssem subSpaceFeedAssem) {
        super(2);
        this.LL = subSpaceFeedAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends SpacePost> c291001Au) {
        SpacePost spacePost;
        FragmentManager childFragmentManager;
        UIAssem uIAssem2 = uIAssem;
        C291001Au<? extends SpacePost> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (spacePost = (SpacePost) c291001Au2.LIZ) != null) {
            SubSpaceFeedAssem subSpaceFeedAssem = this.LL;
            Fragment fragmentLJI = C724240Sb0.LJI(uIAssem2);
            if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
                C504510JqT c504510JqTIp = subSpaceFeedAssem.ip();
                if (c504510JqTIp != null) {
                    c504510JqTIp.LLIZ = Long.valueOf(spacePost.postId);
                }
                ((ICommentService) C1161920gLG.LIZJ(ICommentService.class)).su2(childFragmentManager, subSpaceFeedAssem.kp(), C0IJR.LIZ(ViewModelProviders.of(fragmentLJI), fragmentLJI), null, spacePost, 0, subSpaceFeedAssem.kp().DQ2());
            }
        }
        return Unit.LIZ;
    }
}
