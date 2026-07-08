package X;

import kotlin.jvm.functions.Function1;
import webcast.api.smb.SMBVerificationInfoResponse;

/* JADX INFO: renamed from: X.0wXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784790wXt extends C09AY implements Function1<C1784660wXg, C1784660wXg> {
    public final /* synthetic */ SMBVerificationInfoResponse.Data LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784790wXt(SMBVerificationInfoResponse.Data data, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(1);
        this.LL = data;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
        this.LLILZLL = z5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1784660wXg invoke(C1784660wXg c1784660wXg) {
        return C1784660wXg.LIZ(c1784660wXg, null, null, 0L, null, 0, false, false, 0L, false, null, this.LL, null, this.LLILLJJLI, this.LLILLL, false, false, this.LLILZ, this.LLILZIL, false, this.LLILZLL, false, false, 3460095);
    }
}
