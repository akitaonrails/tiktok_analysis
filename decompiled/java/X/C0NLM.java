package X;

/* JADX INFO: renamed from: X.0NLM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hometab.base.tabicon.iconfile.IconFileManager", f = "IconFileManager.kt", l = {96}, m = "preloadIcons")
public final class C0NLM extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0NLJ LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NLM(C0NLJ c0nlj, InterfaceC1364105Vn<? super C0NLM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0nlj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IconFileManager@af01.preloadIcons$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLL.LJI(null, this);
        C1C7U.LIZIZ("IconFileManager@af01.preloadIcons$1");
        return objLJI;
    }
}
