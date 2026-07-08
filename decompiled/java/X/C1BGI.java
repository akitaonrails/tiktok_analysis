package X;

/* JADX INFO: renamed from: X.1BGI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactManager", f = "IMContactManager.kt", l = {527, 529}, m = "clearUnlockedBubbleIdsForDebug")
public final class C1BGI extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1BG1 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BGI(C1BG1 c1bg1, InterfaceC1364105Vn<? super C1BGI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1bg1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactManager@fb8a.clearUnlockedBubbleIdsForDebug$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(0L, this);
        C1C7U.LIZIZ("IMContactManager@fb8a.clearUnlockedBubbleIdsForDebug$1");
        return objLIZJ;
    }
}
