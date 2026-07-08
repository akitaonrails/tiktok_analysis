package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBSetupInfoResponse;

/* JADX INFO: renamed from: X.0xUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821210xUd extends C09AY implements Function1<SMBSetupInfoResponse.ResponseData, Unit> {
    public final /* synthetic */ C09AJ<C470590Icr<SMBSetupInfoResponse.ResponseData>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821210xUd(C19482611Ke c19482611Ke) {
        super(1);
        this.LL = c19482611Ke;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, webcast.api.sub.SMBSetupInfoResponse$ResponseData] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SMBSetupInfoResponse.ResponseData responseData) {
        SMBSetupInfoResponse.ResponseData responseData2 = responseData;
        C470590Icr<SMBSetupInfoResponse.ResponseData> c470590Icr = new C470590Icr<>();
        c470590Icr.data = responseData2;
        responseData2.LIZ = true;
        c470590Icr.statusCode = 0;
        this.LL.onNext(c470590Icr);
        this.LL.onComplete();
        return Unit.LIZ;
    }
}
