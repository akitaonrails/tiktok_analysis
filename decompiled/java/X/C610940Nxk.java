package X;

/* JADX INFO: renamed from: X.0Nxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dc.core.LayeredDiskCache", f = "LayeredDiskCache.kt", l = {32, 35, 47, 61, 76, 94}, m = "fullSave")
public final class C610940Nxk extends AbstractC23140094w {
    public Object LL;
    public C610900Nxg LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C610900Nxg LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610940Nxk(C610900Nxg c610900Nxg, InterfaceC1364105Vn<? super C610940Nxk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c610900Nxg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LayeredDiskCache@f330.fullSave$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLIZ.LIZJ(null, this);
        C1C7U.LIZIZ("LayeredDiskCache@f330.fullSave$1");
        return objLIZJ;
    }
}
