package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;

/* JADX INFO: renamed from: X.0Nps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel", f = "BulletinProfileViewModel.kt", l = {776, 786}, m = "getBulletinBoardFromServer")
public final class C606060Nps extends AbstractC23140094w {
    public BulletinAccountInfoResponse LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BulletinProfileViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C606060Nps(BulletinProfileViewModel bulletinProfileViewModel, InterfaceC1364105Vn<? super C606060Nps> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = bulletinProfileViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinProfileViewModel@3b06.getBulletinBoardFromServer$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLL.BQ2(0L, this);
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.getBulletinBoardFromServer$1");
        return objBQ2;
    }
}
