package X;

import com.bytedance.android.livesdk.adminsetting.LiveMuteRulesFragmentSheet;

/* JADX INFO: renamed from: X.0Tcx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveMuteRulesFragmentSheet", f = "LiveMuteRulesFragmentSheet.kt", l = {156}, m = "refreshRulesSuspend")
public final class C750930Tcx extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveMuteRulesFragmentSheet LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750930Tcx(LiveMuteRulesFragmentSheet liveMuteRulesFragmentSheet, InterfaceC1364105Vn<? super C750930Tcx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = liveMuteRulesFragmentSheet;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveMuteRulesFragmentSheet@5c14.refreshRulesSuspend$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objZS = this.LLILLL.zS(false, this);
        C1C7U.LIZIZ("LiveMuteRulesFragmentSheet@5c14.refreshRulesSuspend$1");
        return objZS;
    }
}
