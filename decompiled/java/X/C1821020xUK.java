package X;

import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBSetupInfoResponse;

/* JADX INFO: renamed from: X.0xUK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821020xUK extends C09AY implements Function1<C1820790xTx, C1820790xTx> {
    public final /* synthetic */ C1820630xTh LL;
    public final /* synthetic */ SMBSetupInfoResponse.ResponseData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821020xUK(C1820630xTh c1820630xTh, SMBSetupInfoResponse.ResponseData responseData) {
        super(1);
        this.LL = c1820630xTh;
        this.LLILLJJLI = responseData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1820790xTx invoke(C1820790xTx c1820790xTx) {
        return C1820790xTx.LIZ(c1820790xTx, new C1623606Xi(this.LL), false, false, false, null, this.LLILLJJLI.LIZ, null, null, 222);
    }
}
