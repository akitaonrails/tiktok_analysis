package X;

import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupRequest;

/* JADX INFO: renamed from: X.0i7L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.invitation.repository.GroupInvitationRepository", f = "GroupInvitationRepository.kt", l = {31}, m = "fetchGroupInvitePopupResponse")
public final class C1230170i7L extends AbstractC23140094w {
    public GroupInvitePopupRequest LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1230160i7K LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1230170i7L(C1230160i7K c1230160i7K, InterfaceC1364105Vn<? super C1230170i7L> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1230160i7K;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupInvitationRepository@acf0.fetchGroupInvitePopupResponse$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("GroupInvitationRepository@acf0.fetchGroupInvitePopupResponse$1");
        return objLIZ;
    }
}
