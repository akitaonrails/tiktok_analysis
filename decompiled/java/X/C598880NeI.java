package X;

import Y.AgS101S1100000_9;

/* JADX INFO: renamed from: X.0NeI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.content.sea.communication.SeaContentCommunication$subscribeEvent$job$1$invokeSuspend$$inlined$filter$1$2", f = "SeaContentCommunication.kt", l = {223}, m = "emit")
public final class C598880NeI extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS101S1100000_9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598880NeI(AgS101S1100000_9 agS101S1100000_9, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS101S1100000_9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaContentCommunication@2638.subscribeEvent$job$1$invokeSuspend$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("SeaContentCommunication@2638.subscribeEvent$job$1$invokeSuspend$$inlined$filter$1$2$1");
        return objEmit;
    }
}
