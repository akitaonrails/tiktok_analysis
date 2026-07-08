package X;

/* JADX INFO: renamed from: X.0CSc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.linkcore.tracker.TrackerImpl", f = "TrackerImpl.kt", l = {76}, m = "initializeInternal")
public final class C313880CSc extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1304610k3P LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C313880CSc(C1304610k3P c1304610k3P, InterfaceC1364105Vn<? super C313880CSc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1304610k3P;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TrackerImpl@989c.initializeInternal$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(this);
        C1C7U.LIZIZ("TrackerImpl@989c.initializeInternal$1");
        return objLIZLLL;
    }
}
