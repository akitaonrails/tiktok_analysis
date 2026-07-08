package X;

/* JADX INFO: renamed from: X.0Jdi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.cell.InteractionCell", f = "InteractionCell.kt", l = {99}, m = "onRequestDataLegacy")
public final class C496600Jdi extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C496610Jdj LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496600Jdi(C496610Jdj c496610Jdj, InterfaceC1364105Vn<? super C496600Jdi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c496610Jdj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InteractionCell@c995.onRequestDataLegacy$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILLJJLI.LJIILJJIL(null, this);
        C1C7U.LIZIZ("InteractionCell@c995.onRequestDataLegacy$1");
        return objLJIILJJIL;
    }
}
