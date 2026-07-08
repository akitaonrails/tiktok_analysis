package X;

import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CSQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.usercommunication.PNSVideoPlayerListener$onPlayerControllerRenderFrameVideoCounter$1", f = "PNSVideoPlayerListener.kt", l = {198}, m = "invokeSuspend")
public final class C0CSQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1916800zyo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CSQ(C1916800zyo c1916800zyo, InterfaceC1364105Vn<? super C0CSQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1916800zyo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CSQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSVideoPlayerListener@961f.onPlayerControllerRenderFrameVideoCounter$1");
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
            SettingsManager.LIZLLL().getClass();
            long jLJFF = SettingsManager.LJFF("user_notice_delay", 500L);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLJFF, this) == objLJFF) {
                C1C7U.LIZIZ("PNSVideoPlayerListener@961f.onPlayerControllerRenderFrameVideoCounter$1");
                return objLJFF;
            }
        }
        IGatekeeperService iGatekeeperService = (IGatekeeperService) this.LLILLJJLI.LLJI.getValue();
        if (iGatekeeperService != null) {
            iGatekeeperService.LJIIIIZZ("FeedReadyForNoticeSignal", new Bundle(), null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PNSVideoPlayerListener@961f.onPlayerControllerRenderFrameVideoCounter$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
