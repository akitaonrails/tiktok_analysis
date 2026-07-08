package X;

/* JADX INFO: renamed from: X.0P34, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.repository.VibeFeedDetailOperator", f = "VibeFeedDetailOperator.kt", l = {67}, m = "canShowRedDot")
public final class C0P34 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0P32 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0P34(C0P32 c0p32, InterfaceC1364105Vn<? super C0P34> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0p32;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VibeFeedDetailOperator@bd0.canShowRedDot$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJLIIIJILLIZJL = this.LLILLL.LJJLIIIJILLIZJL(null, null, null, null, null, this);
        C1C7U.LIZIZ("VibeFeedDetailOperator@bd0.canShowRedDot$1");
        return objLJJLIIIJILLIZJL;
    }
}
