package X;

/* JADX INFO: renamed from: X.13xn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.util.SafeBitmapManager", f = "SafeBitmapManager.kt", l = {189}, m = "recycleReference")
public final class C20180913xn extends AbstractC23140094w {
    public Object LL;
    public C1DEV LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C20180713xl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20180913xn(C20180713xl c20180713xl, InterfaceC1364105Vn<? super C20180913xn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c20180713xl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SafeBitmapManager@8e38.recycleReference$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(null, this);
        C1C7U.LIZIZ("SafeBitmapManager@8e38.recycleReference$1");
        return objLIZIZ;
    }
}
