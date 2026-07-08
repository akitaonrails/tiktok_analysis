package X;

import com.ss.android.ugc.now.interaction.api.InteractionSyncViewModelState;
import com.ss.android.ugc.now.interaction.api.LikeState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1353770lKh extends C09AY implements Function1<InteractionSyncViewModelState, InteractionSyncViewModelState> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1353770lKh(long j, boolean z, boolean z2, String str) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InteractionSyncViewModelState invoke(InteractionSyncViewModelState interactionSyncViewModelState) {
        InteractionSyncViewModelState interactionSyncViewModelState2 = interactionSyncViewModelState;
        LikeState likeState = new LikeState(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
        interactionSyncViewModelState2.getClass();
        return interactionSyncViewModelState2.copy(likeState, null, interactionSyncViewModelState2.commentCountState, interactionSyncViewModelState2.commentPublishState, interactionSyncViewModelState2.commentDeleteState, interactionSyncViewModelState2.commentLatestState, interactionSyncViewModelState2.user, interactionSyncViewModelState2.activePost);
    }
}
