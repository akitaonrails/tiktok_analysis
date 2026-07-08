package X;

/* JADX INFO: renamed from: X.0Ct3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.TextSegmentHelper", f = "TextSegmentHelper.kt", l = {35}, m = "measure")
public final class C327750Ct3 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C327760Ct4 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327750Ct3(C327760Ct4 c327760Ct4, InterfaceC1364105Vn<? super C327750Ct3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c327760Ct4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextSegmentHelper@3990.measure$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("TextSegmentHelper@3990.measure$1");
        return objLIZJ;
    }
}
