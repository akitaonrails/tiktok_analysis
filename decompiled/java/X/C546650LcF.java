package X;

import com.ss.android.ugc.aweme.theater.model.AITheaterModel;

/* JADX INFO: renamed from: X.0LcF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.config.AITheaterDraftRestoreHandler", f = "AITheaterDraftRestoreHandler.kt", l = {110}, m = "restore")
public final class C546650LcF extends AbstractC23140094w {
    public AITheaterModel LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C546610LcB LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546650LcF(C546610LcB c546610LcB, InterfaceC1364105Vn<? super C546650LcF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c546610LcB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITheaterDraftRestoreHandler@c8f1.restore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("AITheaterDraftRestoreHandler@c8f1.restore$1");
        return objLIZ;
    }
}
