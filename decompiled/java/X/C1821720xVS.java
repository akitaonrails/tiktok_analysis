package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkHeaderAssem;
import com.bytedance.android.livesdk.livesetting.pcs.PcsThirdPartyReportSchemaSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xVS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821720xVS extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ PcsThirdPartyLinkHeaderAssem LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1821720xVS(PcsThirdPartyLinkHeaderAssem pcsThirdPartyLinkHeaderAssem, Context context) {
        super(0);
        this.LL = pcsThirdPartyLinkHeaderAssem;
        this.LLILLJJLI = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C1821500xV6.LIZIZ("click", "report", false, this.LL.ip().wQ2());
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LLILLJJLI, PcsThirdPartyReportSchemaSetting.INSTANCE.getValue().getBiolinkReportSchema());
        return Boolean.TRUE;
    }
}
