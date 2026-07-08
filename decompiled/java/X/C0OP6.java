package X;

import com.ss.android.ugc.aweme.notification.service.BulletinBoardServiceImpl;

/* JADX INFO: renamed from: X.0OP6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.service.BulletinBoardServiceImpl", f = "BulletinBoardServiceImpl.kt", l = {186}, m = "getPhotoUploadConfig")
public final class C0OP6 extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BulletinBoardServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OP6(BulletinBoardServiceImpl bulletinBoardServiceImpl, InterfaceC1364105Vn<? super C0OP6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = bulletinBoardServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardServiceImpl@5a4d.getPhotoUploadConfig$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(0, this);
        C1C7U.LIZIZ("BulletinBoardServiceImpl@5a4d.getPhotoUploadConfig$1");
        return objLIZLLL;
    }
}
