package X;

import com.bytedance.android.livesdk.adminsetting.comment.filter.CommunityFlaggedManageSheetFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0TqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.comment.filter.CommunityFlaggedManageSheetFragment", f = "CommunityFlaggedManageSheetFragment.kt", l = {310}, m = "fetchFilteredComments")
public final class C759270TqP extends AbstractC23140094w {
    public Room LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CommunityFlaggedManageSheetFragment LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C759270TqP(CommunityFlaggedManageSheetFragment communityFlaggedManageSheetFragment, InterfaceC1364105Vn<? super C759270TqP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = communityFlaggedManageSheetFragment;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommunityFlaggedManageSheetFragment@2faa.fetchFilteredComments$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objUS = this.LLILLL.uS(this);
        C1C7U.LIZIZ("CommunityFlaggedManageSheetFragment@2faa.fetchFilteredComments$1");
        return objUS;
    }
}
