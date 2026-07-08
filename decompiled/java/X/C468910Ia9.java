package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel;

/* JADX INFO: renamed from: X.0Ia9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel", f = "BulletinAccountEditViewModel.kt", l = {271}, m = "sendCreateRequest")
public final class C468910Ia9 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinBoardEditViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C468910Ia9(BulletinBoardEditViewModel bulletinBoardEditViewModel, InterfaceC1364105Vn<? super C468910Ia9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bulletinBoardEditViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardEditViewModel@acc0.sendCreateRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(null, null, this);
        C1C7U.LIZIZ("BulletinBoardEditViewModel@acc0.sendCreateRequest$1");
        return objWQ2;
    }
}
