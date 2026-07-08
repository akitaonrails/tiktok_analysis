package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;

/* JADX INFO: renamed from: X.0Npr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel", f = "BulletinProfileViewModel.kt", l = {750, 770}, m = "getBulletinBoardAccountInfo")
public final class C606050Npr extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BulletinProfileViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C606050Npr(BulletinProfileViewModel bulletinProfileViewModel, InterfaceC1364105Vn<? super C606050Npr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = bulletinProfileViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinProfileViewModel@3b06.getBulletinBoardAccountInfo$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILLL.AQ2(0L, this);
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.getBulletinBoardAccountInfo$1");
        return objAQ2;
    }
}
