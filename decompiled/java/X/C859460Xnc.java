package X;

import com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule;

/* JADX INFO: renamed from: X.0Xnc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nows.api.AICaptionNetworkModule", f = "AICaptionNetworkModule.kt", l = {64}, m = "submitImage")
public final class C859460Xnc extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AICaptionNetworkModule LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859460Xnc(AICaptionNetworkModule aICaptionNetworkModule, InterfaceC1364105Vn<? super C859460Xnc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aICaptionNetworkModule;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICaptionNetworkModule@235.submitImage$3");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, null, this);
        C1C7U.LIZIZ("AICaptionNetworkModule@235.submitImage$3");
        return objLIZIZ;
    }
}
