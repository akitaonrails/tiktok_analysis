package X;

import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.AnchorLiveJourneyReceiveRewardReq;
import tikcast.api.anchor.AnchorLiveJourneyReceiveRewardResp;

/* JADX INFO: renamed from: X.0Th4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.journey.LiveJourneyViewHolder$claimReward$2", f = "LiveJourneyViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C753480Th4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends Boolean>>, Object> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C753480Th4(int i, InterfaceC1364105Vn<? super C753480Th4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C753480Th4(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        List<Long> list;
        C1C7U.LIZ("LiveJourneyViewHolder@6290.claimReward$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            AnchorLiveJourneyReceiveRewardReq anchorLiveJourneyReceiveRewardReq = new AnchorLiveJourneyReceiveRewardReq();
            boolean z = true;
            anchorLiveJourneyReceiveRewardReq.levelList = C1697810uHb.LJIILJJIL(C2286608xc.LJFF(this.LL));
            C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
            C470590Icr c470590Icr = (C470590Icr) C01QD.LIZ().LIZLLL().claimJourneyRewards(anchorLiveJourneyReceiveRewardReq).LJIILIIL(C0J1R.LIZJ(LiveCenterApi.class)).LIZLLL();
            Integer numLJ = C2286608xc.LJ(this.LL);
            AnchorLiveJourneyReceiveRewardResp.Data data = (AnchorLiveJourneyReceiveRewardResp.Data) c470590Icr.data;
            if (data == null || (list = data.successLevelList) == null || list.size() <= 0) {
                z = false;
            }
            pair = new Pair(numLJ, Boolean.valueOf(z));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            pair = new Pair(C2286608xc.LJ(this.LL), false);
        }
        C1C7U.LIZIZ("LiveJourneyViewHolder@6290.claimReward$2");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Integer, ? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
