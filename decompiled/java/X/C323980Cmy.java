package X;

import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData;
import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0Cmy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel$getReplayVideoInfosForBBFans$1", f = "LiveHighlightViewModel.kt", l = {124}, m = "invokeSuspend")
public final class C323980Cmy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveHighlightViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323980Cmy(LiveHighlightViewModel liveHighlightViewModel, String str, InterfaceC1364105Vn<? super C323980Cmy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveHighlightViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323980Cmy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnchorReplayInfoData anchorReplayInfoData;
        C1C7U.LIZ("LiveHighlightViewModel@9d4.getReplayVideoInfosForBBFans$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C323990Cmz c323990Cmz = this.LLILLJJLI.LL.LLILLJJLI;
                String str = this.LLILLL;
                this.LL = 1;
                obj = c323990Cmz.LL.LIZ().getReplayVideoInfosForBBFans(str, 1, 5, Boolean.TRUE, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveHighlightViewModel@9d4.getReplayVideoInfosForBBFans$1");
                    return objLJFF;
                }
            }
            C470590Icr c470590Icr = (C470590Icr) obj;
            if (c470590Icr != null) {
                anchorReplayInfoData = (AnchorReplayInfoData) c470590Icr.data;
            } else {
                anchorReplayInfoData = null;
            }
            if (anchorReplayInfoData == null) {
                this.LLILLJJLI.setState(AFwS232S0000000_4.get$arr$(243));
            } else {
                RoomReplay roomReplay = (RoomReplay) C13LP.LJJJLL(anchorReplayInfoData.replays);
                if (roomReplay != null) {
                    this.LLILLJJLI.setState(new AwS583S0100000_4(roomReplay, 321));
                } else {
                    this.LLILLJJLI.setState(AFwS232S0000000_4.get$arr$(244));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.setState(AFwS232S0000000_4.get$arr$(245));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveHighlightViewModel@9d4.getReplayVideoInfosForBBFans$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
