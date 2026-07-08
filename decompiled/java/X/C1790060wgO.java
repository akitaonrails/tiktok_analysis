package X;

/* JADX INFO: renamed from: X.0wgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.ui.legacy.widgets.PendingDialogUI", f = "PendingDialogUI.kt", l = {22}, m = "process")
public final class C1790060wgO extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1790080wgQ LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1790060wgO(C1790080wgQ c1790080wgQ, InterfaceC1364105Vn<? super C1790060wgO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1790080wgQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PendingDialogUI@ec32.process$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("PendingDialogUI@ec32.process$1");
        return objLIZ;
    }
}
