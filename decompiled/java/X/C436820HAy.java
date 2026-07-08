package X;

import Y.AgS197S0200000_6;
import com.bytedance.android.live.aireply.IAIReplyAnchorManagerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer$initAIReply$1$1$1", f = "BasePreviewSettingMainFragmentSheetInitializer.kt", l = {1454}, m = "invokeSuspend")
public final class C436820HAy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C16F5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436820HAy(C013C c013c, C16F5 c16f5, InterfaceC1364105Vn<? super C436820HAy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c013c;
        this.LLILLL = c16f5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436820HAy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.initAIReply$1$1$1");
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
            AgS197S0200000_6 agS197S0200000_6 = new AgS197S0200000_6(this.LLILLJJLI, this.LLILLL, 0);
            this.LL = 1;
            if (switchStateFlow.collect(agS197S0200000_6, this) == objLJFF) {
                C1C7U.LIZIZ("BasePreviewSettingMainFragmentSheetInitializer@5293.initAIReply$1$1$1");
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
