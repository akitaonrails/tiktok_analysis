package X;

/* JADX INFO: renamed from: X.0MOE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.repository.AIPortraitAlbumContentServiceImpl", f = "AIPortraitAlbumContentServiceImpl.kt", l = {38}, m = "fetchCloudAssets-0E7RQCE")
public final class C0MOE extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0MOC LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MOE(C0MOC c0moc, InterfaceC1364105Vn<? super C0MOE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0moc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitAlbumContentServiceImpl@561e.fetchCloudAssets$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(0, 0L, this);
        if (objLIZJ == C099R.LJFF()) {
            C1C7U.LIZIZ("AIPortraitAlbumContentServiceImpl@561e.fetchCloudAssets$1");
            return objLIZJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("AIPortraitAlbumContentServiceImpl@561e.fetchCloudAssets$1");
        return c189200o6M1boximpl;
    }
}
