package X;

/* JADX INFO: renamed from: X.0EXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.datasync.EDADataSyncEngine", f = "EDADataSyncEngine.kt", l = {414}, m = "onEPCancelEdit")
public final class C366190EXh extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0EXU LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C366190EXh(C0EXU c0exu, InterfaceC1364105Vn<? super C366190EXh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0exu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EDADataSyncEngine@8a7.onEPCancelEdit$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objYE = this.LLILLJJLI.YE(this);
        C1C7U.LIZIZ("EDADataSyncEngine@8a7.onEPCancelEdit$1");
        return objYE;
    }
}
