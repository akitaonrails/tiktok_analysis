package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel;

/* JADX INFO: renamed from: X.0ONe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel", f = "BulletinAccountEditViewModel.kt", l = {334}, m = "sendEditRequest")
public final class C618360ONe extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ BulletinBoardEditViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C618360ONe(BulletinBoardEditViewModel bulletinBoardEditViewModel, InterfaceC1364105Vn<? super C618360ONe> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = bulletinBoardEditViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardEditViewModel@acc0.sendEditRequest$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILZ.xQ2(null, null, null, this);
        C1C7U.LIZIZ("BulletinBoardEditViewModel@acc0.sendEditRequest$1");
        return objXQ2;
    }
}
