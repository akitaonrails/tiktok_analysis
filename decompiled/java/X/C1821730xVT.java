package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkHeaderAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xVT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821730xVT extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ PcsThirdPartyLinkHeaderAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821730xVT(PcsThirdPartyLinkHeaderAssem pcsThirdPartyLinkHeaderAssem) {
        super(0);
        this.LL = pcsThirdPartyLinkHeaderAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1821500xV6.LIZIZ("click", "refresh", false, this.LL.ip().wQ2());
        C1821860xVg c1821860xVg = this.LL.ip().LLIZ;
        if (c1821860xVg != null) {
            c1821860xVg.invoke();
        }
        return Boolean.TRUE;
    }
}
