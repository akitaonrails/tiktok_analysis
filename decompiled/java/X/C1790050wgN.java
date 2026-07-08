package X;

/* JADX INFO: renamed from: X.0wgN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.ui.legacy.widgets.GenericDialogUI", f = "GenericDialogUI.kt", l = {23}, m = "process")
public final class C1790050wgN extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1790070wgP LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1790050wgN(C1790070wgP c1790070wgP, InterfaceC1364105Vn<? super C1790050wgN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1790070wgP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GenericDialogUI@a76e.process$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("GenericDialogUI@a76e.process$1");
        return objLIZ;
    }
}
