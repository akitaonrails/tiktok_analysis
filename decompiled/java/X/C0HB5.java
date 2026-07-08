package X;

import Y.AgS287S0100000_6;
import com.bytedance.android.live.aireply.IAIReplyAnchorManagerService;
import com.bytedance.android.livesdk.broadcast.aireply.LiveAIReplySettingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HB5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.aireply.LiveAIReplySettingFragment$initView$2", f = "LiveAIReplySettingFragment.kt", l = {146}, m = "invokeSuspend")
public final class C0HB5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveAIReplySettingFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HB5(LiveAIReplySettingFragment liveAIReplySettingFragment, InterfaceC1364105Vn<? super C0HB5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveAIReplySettingFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HB5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveAIReplySettingFragment@e534.initView$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IAIReplyAnchorManagerService.Companion.getClass();
            C05YD<Boolean> switchStateFlow = C445870He5.LIZ().getSwitchStateFlow();
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 108);
            this.LL = 1;
            if (switchStateFlow.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("LiveAIReplySettingFragment@e534.initView$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
