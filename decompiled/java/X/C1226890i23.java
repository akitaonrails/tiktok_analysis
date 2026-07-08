package X;

/* JADX INFO: renamed from: X.0i23, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.visiblescope.SelectLiveVisibleConversationDataSourceProtocol", f = "SelectLiveVisibleConversationDataSourceProtocol.kt", l = {124, 124}, m = "onRefresh")
public final class C1226890i23 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1226860i20 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226890i23(C1226860i20 c1226860i20, InterfaceC1364105Vn<? super C1226890i23> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1226860i20;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectLiveVisibleConversationDataSourceProtocol@bae0.onRefresh$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJIL = this.LLILZ.LJJIL(this);
        C1C7U.LIZIZ("SelectLiveVisibleConversationDataSourceProtocol@bae0.onRefresh$1");
        return objLJJIL;
    }
}
