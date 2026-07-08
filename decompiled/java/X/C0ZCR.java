package X;

import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0ZCR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics", f = "IMMessageAnalytics.kt", l = {1054}, m = "addExtraB2CParams")
public final class C0ZCR extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ IMMessageAnalytics LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZCR(IMMessageAnalytics iMMessageAnalytics, InterfaceC1364105Vn<? super C0ZCR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = iMMessageAnalytics;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("IMMessageAnalytics@7084.addExtraB2CParams$5");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZ.LIZLLL(null, null, this);
        C1C7U.LIZIZ("IMMessageAnalytics@7084.addExtraB2CParams$5");
        return objLIZLLL;
    }
}
