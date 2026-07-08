package X;

import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0moo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410880moo extends C09AY implements Function1<C1411350mpZ, C1411350mpZ> {
    public final /* synthetic */ SMBOptInQualificationResponse.ResponseData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410880moo(SMBOptInQualificationResponse.ResponseData responseData) {
        super(1);
        this.LL = responseData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1411350mpZ invoke(C1411350mpZ c1411350mpZ) {
        boolean z;
        C1411350mpZ c1411350mpZ2 = c1411350mpZ;
        C1410940mou c1410940mou = C1410940mou.LIZ;
        SMBOptInQualificationResponse.ResponseData responseData = this.LL;
        if (responseData != null) {
            z = responseData.canEveryoneSendDm;
        } else {
            z = false;
        }
        return C1411350mpZ.LIZ(c1411350mpZ2, c1410940mou, responseData, null, z, null, null, null, null, null, null, 1012);
    }
}
