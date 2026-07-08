package X;

/* JADX INFO: renamed from: X.0EXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.datasync.EDADataSyncEngine", f = "EDADataSyncEngine.kt", l = {272, 671, 278}, m = "beforeLeaveEPCheck")
public final class C366160EXe extends AbstractC23140094w {
    public boolean LL;
    public boolean LLILLJJLI;
    public DialogC1389620mGW LLILLL;
    public InterfaceC383701eN LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0EXU LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C366160EXe(C0EXU c0exu, InterfaceC1364105Vn<? super C366160EXe> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0exu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EDADataSyncEngine@8a7.beforeLeaveEPCheck$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objW1 = this.LLILZLL.W1(false, false, this);
        C1C7U.LIZIZ("EDADataSyncEngine@8a7.beforeLeaveEPCheck$1");
        return objW1;
    }
}
