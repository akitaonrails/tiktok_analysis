package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0wat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.ConsumeAction", f = "ConsumeAction.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "perform")
public final class C1786650wat extends AbstractC23140094w {
    public C1787830wcn LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1786640was LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1786650wat(C1786640was c1786640was, InterfaceC1364105Vn<? super C1786650wat> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1786640was;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConsumeAction@7e5.perform$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, this);
        C1C7U.LIZIZ("ConsumeAction@7e5.perform$1");
        return objLIZ;
    }
}
