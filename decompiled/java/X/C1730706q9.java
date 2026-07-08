package X;

/* JADX INFO: renamed from: X.06q9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.processor.preload.task.CameraEnvPreloadTask", f = "CameraEnvPreloadTask.kt", l = {15}, m = "afterUserEnterInbox")
public final class C1730706q9 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1730806qA LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1730706q9(C1730806qA c1730806qA, InterfaceC1364105Vn<? super C1730706q9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1730806qA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CameraEnvPreloadTask@1367.afterUserEnterInbox$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(this);
        C1C7U.LIZIZ("CameraEnvPreloadTask@1367.afterUserEnterInbox$1");
        return objLJ;
    }
}
