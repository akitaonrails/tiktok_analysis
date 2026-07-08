package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveLynxMatchInviteeTimeOutDurationSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0bVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.lynx.TwoMatchInviteeLynxPage$onInit$1", f = "TwoMatchInviteeLynxPage.kt", l = {71}, m = "invokeSuspend")
public final class C976270bVp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C976260bVo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C976270bVp(C976260bVo c976260bVo, InterfaceC1364105Vn<? super C976270bVp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c976260bVo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C976270bVp(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TwoMatchInviteeLynxPage@39a5.onInit$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long value = LiveLynxMatchInviteeTimeOutDurationSetting.INSTANCE.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFallback waiting for ");
            sbLIZ.append(value);
            sbLIZ.append(" ms");
            C20441214yg.LIZIZ("LynxPage", C2188811AlT.LIZIZ(sbLIZ));
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(value, this) == objLJFF) {
                C1C7U.LIZIZ("TwoMatchInviteeLynxPage@39a5.onInit$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.getClass();
        C976260bVo.LJZI(0, "timeout");
        this.LLILLJJLI.LLJJ.invoke();
        C976260bVo c976260bVo = this.LLILLJJLI;
        c976260bVo.getClass();
        AbstractC970950bNF.LJZ(c976260bVo, "match_invitee_dismiss_invitation_panel", true);
        C20441214yg.LIZIZ("LynxPage", "onFallback called.");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TwoMatchInviteeLynxPage@39a5.onInit$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
