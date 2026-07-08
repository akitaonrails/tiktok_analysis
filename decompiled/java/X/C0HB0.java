package X;

import android.view.View;
import com.bytedance.android.live.aireply.IAIReplyAnchorManagerService;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HB0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveAdminSettingGuideAdapter$initAiReplayAssistant$1", f = "LiveAdminSettingGuideAdapter.kt", l = {483}, m = "invokeSuspend")
public final class C0HB0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ LiveAdminSettingGuideAdapter LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ C16F5 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HB0(View view, LiveAdminSettingGuideAdapter liveAdminSettingGuideAdapter, View view2, C16F5 c16f5, InterfaceC1364105Vn<? super C0HB0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = view;
        this.LLILZ = liveAdminSettingGuideAdapter;
        this.LLILZIL = view2;
        this.LLILZLL = c16f5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HB0 c0hb0 = new C0HB0(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0hb0.LLILLJJLI = obj;
        return c0hb0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveAdminSettingGuideAdapter@ff9f.initAiReplayAssistant$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            IAIReplyAnchorManagerService.Companion.getClass();
            C05YD<Boolean> hasPermission = C445870He5.LIZ().getHasPermission();
            C0HB3 c0hb3 = new C0HB3(this.LLILLL, interfaceC497601wk, this.LLILZ, this.LLILZIL, this.LLILZLL);
            this.LL = 1;
            if (hasPermission.collect(c0hb3, this) == objLJFF) {
                C1C7U.LIZIZ("LiveAdminSettingGuideAdapter@ff9f.initAiReplayAssistant$1");
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
