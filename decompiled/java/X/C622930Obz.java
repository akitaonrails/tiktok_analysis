package X;

/* JADX INFO: renamed from: X.0Obz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.repository.BulletinRepository$_operator$1", f = "BulletinRepository.kt", l = {364}, m = "checkAwemeIsShared")
public final class C622930Obz extends AbstractC23140094w {
    public Object LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C622900Obw LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C622930Obz(C622900Obw c622900Obw, InterfaceC1364105Vn<? super C622930Obz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c622900Obw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinRepository@27da._operator$1$checkAwemeIsShared$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objCheckAwemeIsShared = this.LLILZ.checkAwemeIsShared(null, 0L, this);
        C1C7U.LIZIZ("BulletinRepository@27da._operator$1$checkAwemeIsShared$1");
        return objCheckAwemeIsShared;
    }
}
