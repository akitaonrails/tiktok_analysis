package X;

import kotlin.jvm.functions.Function1;
import webcast.api.smb.SMBBookingEventResponse;

/* JADX INFO: renamed from: X.0JPC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JPC extends C09AY implements Function1<C0JPA, C0JPA> {
    public final /* synthetic */ SMBBookingEventResponse.ResponseData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JPC(SMBBookingEventResponse.ResponseData responseData) {
        super(1);
        this.LL = responseData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JPA invoke(C0JPA c0jpa) {
        return C0JPA.LIZ(c0jpa, this.LL, null, 0, 0, 0, null, null, 126);
    }
}
