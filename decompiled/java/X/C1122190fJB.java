package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0fJB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.smbstate.SmbApiClient", f = "SmbApiClient.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "fetchQualification")
public final class C1122190fJB extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1122160fJ8 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122190fJB(C1122160fJ8 c1122160fJ8, InterfaceC1364105Vn<? super C1122190fJB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1122160fJ8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmbApiClient@c6a0.fetchQualification$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("SmbApiClient@c6a0.fetchQualification$1");
        return objLIZ;
    }
}
