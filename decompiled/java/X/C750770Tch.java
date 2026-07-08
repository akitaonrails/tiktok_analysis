package X;

import com.bytedance.android.live.LiveAddHotCommentMuteRuleEvent;
import com.bytedance.android.livesdk.adminsetting.LiveAddHotCommentMuteRuleSheet;
import com.bytedance.android.livesdk.function.MuteRuleApi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveAddHotCommentMuteRuleSheet$onCreateBottomFunction$1$1$1", f = "LiveAddHotCommentMuteRuleSheet.kt", l = {144}, m = "invokeSuspend")
public final class C750770Tch extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveAddHotCommentMuteRuleSheet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750770Tch(LiveAddHotCommentMuteRuleSheet liveAddHotCommentMuteRuleSheet, InterfaceC1364105Vn<? super C750770Tch> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveAddHotCommentMuteRuleSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750770Tch(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveAddHotCommentMuteRuleSheet@468b.onCreateBottomFunction$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C480460Ism.LIZ().getClass();
                MuteRuleApi muteRuleApi = (MuteRuleApi) C480460Ism.LIZLLL(MuteRuleApi.class);
                long jLIZIZ = C500260Jjc.LIZIZ(C475510Ikn.LJ(this.LLILLJJLI));
                long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this.LLILLJJLI));
                String str = (String) this.LLILLJJLI.LLJZIJLIL.getValue();
                long j = this.LLILLJJLI.LLJZ;
                this.LL = 1;
                if (muteRuleApi.addMuteRule(jLIZIZ, jLJJLIIIJ, str, 0L, j, this) == objLJFF) {
                    C1C7U.LIZIZ("LiveAddHotCommentMuteRuleSheet@468b.onCreateBottomFunction$1$1$1");
                    return objLJFF;
                }
            }
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131821723, String.valueOf(((Number) this.LLILLJJLI.LLL.getValue()).intValue()), C0TYC.LIZIZ(new C745220TLc(this.LLILLJJLI.LLJZ))));
            DataChannel dataChannelLJ = C475510Ikn.LJ(this.LLILLJJLI);
            if (dataChannelLJ != null) {
                dataChannelLJ.LC0(LiveAddHotCommentMuteRuleEvent.class, C2286608xc.LJFF(((Number) this.LLILLJJLI.LLLF.getValue()).longValue()));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C766270U4b.LIZLLL(2131837817);
        }
        this.LLILLJJLI.close(1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveAddHotCommentMuteRuleSheet@468b.onCreateBottomFunction$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
