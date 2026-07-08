package X;

import com.ss.android.ugc.aweme.im.saas.host.impl.airemix.IMAIRemixBridgeService;

/* JADX INFO: renamed from: X.05BV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.airemix.IMAIRemixBridgeService", f = "IMAIRemixBridgeService.kt", l = {104}, m = "checkAIRemixEntryAvailable")
public final class C05BV extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ IMAIRemixBridgeService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05BV(IMAIRemixBridgeService iMAIRemixBridgeService, InterfaceC1364105Vn<? super C05BV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = iMAIRemixBridgeService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMAIRemixBridgeService@d1fb.checkAIRemixEntryAvailable$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("IMAIRemixBridgeService@d1fb.checkAIRemixEntryAvailable$1");
        return objLIZJ;
    }
}
