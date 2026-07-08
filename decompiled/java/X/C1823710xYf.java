package X;

import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0xYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823710xYf extends C09AY implements Function1<C1823670xYb, C1823670xYb> {
    public final /* synthetic */ Throwable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823710xYf(Throwable th) {
        super(1);
        this.LL = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1823670xYb invoke(C1823670xYb c1823670xYb) {
        EnumC1823680xYc enumC1823680xYc = EnumC1823680xYc.LOAD_FAIL;
        SMBOptInQualificationResponse.ResponseData responseData = new SMBOptInQualificationResponse.ResponseData();
        Throwable th = this.LL;
        c1823670xYb.getClass();
        return new C1823670xYb(enumC1823680xYc, responseData, th);
    }
}
