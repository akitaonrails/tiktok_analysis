package X;

import com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.api.DMRiskyKeywordsService;

/* JADX INFO: renamed from: X.0Z5E, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.api.DMRiskyKeywordsService", f = "DMRiskyKeywordsService.kt", l = {74}, m = "getKeywords")
public final class C0Z5E extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ DMRiskyKeywordsService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z5E(DMRiskyKeywordsService dMRiskyKeywordsService, InterfaceC1364105Vn<? super C0Z5E> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = dMRiskyKeywordsService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMRiskyKeywordsService@59f5.getKeywords$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("DMRiskyKeywordsService@59f5.getKeywords$1");
        return objLIZIZ;
    }
}
