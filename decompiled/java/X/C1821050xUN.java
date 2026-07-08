package X;

import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBSetupInfoResponse;

/* JADX INFO: renamed from: X.0xUN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821050xUN extends C09AY implements Function1<C1820790xTx, C1820790xTx> {
    public final /* synthetic */ SMBSetupInfoResponse.ResponseData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821050xUN(SMBSetupInfoResponse.ResponseData responseData) {
        super(1);
        this.LL = responseData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1820790xTx invoke(C1820790xTx c1820790xTx) {
        return C1820790xTx.LIZ(c1820790xTx, null, false, false, false, null, this.LL.LIZ, null, null, 223);
    }
}
