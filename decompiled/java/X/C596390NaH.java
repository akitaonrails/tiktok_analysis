package X;

/* JADX INFO: renamed from: X.0NaH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinBoardAutoShareDataManager", f = "BulletinBoardAutoShareDataManager.kt", l = {157}, m = "updateAutoShareIsChecked")
public final class C596390NaH extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C604750Nnl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596390NaH(C604750Nnl c604750Nnl, InterfaceC1364105Vn<? super C596390NaH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c604750Nnl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinBoardAutoShareDataManager@f5bc.updateAutoShareIsChecked$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLL.LJII(false, this);
        C1C7U.LIZIZ("BulletinBoardAutoShareDataManager@f5bc.updateAutoShareIsChecked$1");
        return objLJII;
    }
}
