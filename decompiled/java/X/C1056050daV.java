package X;

import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;

/* JADX INFO: renamed from: X.0daV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM", f = "FindFriendsPageVM.kt", l = {241}, m = "awaitFacebookUploadResult")
public final class C1056050daV extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ FindFriendsPageVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056050daV(FindFriendsPageVM findFriendsPageVM, InterfaceC1364105Vn<? super C1056050daV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = findFriendsPageVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindFriendsPageVM@4a7b.awaitFacebookUploadResult$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLL.wQ2(null, this, null);
        C1C7U.LIZIZ("FindFriendsPageVM@4a7b.awaitFacebookUploadResult$1");
        return objWQ2;
    }
}
