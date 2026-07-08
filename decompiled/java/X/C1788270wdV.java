package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0wdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.ProcessPaymentUIAction", f = "ProcessPaymentUIAction.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "perform")
public final class C1788270wdV extends AbstractC23140094w {
    public C1787770wch LL;
    public C1787830wcn LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1788240wdS LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1788270wdV(C1788240wdS c1788240wdS, InterfaceC1364105Vn<? super C1788270wdV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1788240wdS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProcessPaymentUIAction@e169.perform$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZ(null, this);
        C1C7U.LIZIZ("ProcessPaymentUIAction@e169.perform$1");
        return objLIZIZ;
    }
}
