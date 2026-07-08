package X;

import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0xYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823700xYe extends C09AY implements Function1<C1823670xYb, C1823670xYb> {
    public final /* synthetic */ SMBOptInQualificationResponse.ResponseData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823700xYe(SMBOptInQualificationResponse.ResponseData responseData) {
        super(1);
        this.LL = responseData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1823670xYb invoke(C1823670xYb c1823670xYb) {
        C1823670xYb c1823670xYb2 = c1823670xYb;
        EnumC1823680xYc enumC1823680xYc = EnumC1823680xYc.LOAD_SUCCESS;
        SMBOptInQualificationResponse.ResponseData responseData = this.LL;
        Throwable th = c1823670xYb2.LLILLL;
        c1823670xYb2.getClass();
        return new C1823670xYb(enumC1823680xYc, responseData, th);
    }
}
