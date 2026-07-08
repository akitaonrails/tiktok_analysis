package X;

import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0mot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410930mot extends C09AY implements Function1<C1411350mpZ, C1411350mpZ> {
    public final /* synthetic */ SMBOptInQualificationResponse.ResponseData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410930mot(SMBOptInQualificationResponse.ResponseData responseData) {
        super(1);
        this.LL = responseData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1411350mpZ invoke(C1411350mpZ c1411350mpZ) {
        return C1411350mpZ.LIZ(c1411350mpZ, null, this.LL, null, false, null, null, null, null, null, null, 1021);
    }
}
