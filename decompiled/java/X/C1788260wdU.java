package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0wdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.external.LaunchExternalPayment", f = "LaunchExternalPayment.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT, 40}, m = "perform")
public final class C1788260wdU extends AbstractC23140094w {
    public C1787830wcn LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1788250wdT LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1788260wdU(C1788250wdT c1788250wdT, InterfaceC1364105Vn<? super C1788260wdU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1788250wdT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C1786910wbJ {
        C1C7U.LIZ("LaunchExternalPayment@f9bd.perform$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(null, this);
        C1C7U.LIZIZ("LaunchExternalPayment@f9bd.perform$1");
        return objLIZ;
    }
}
