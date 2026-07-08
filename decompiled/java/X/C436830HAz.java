package X;

import Y.AgS287S0100000_6;
import com.bytedance.android.live.aireply.IAIReplyAnchorManagerService;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewSettingWidget$onShow$5", f = "PreviewSettingWidget.kt", l = {404}, m = "invokeSuspend")
public final class C436830HAz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PreviewSettingWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436830HAz(PreviewSettingWidget previewSettingWidget, InterfaceC1364105Vn<? super C436830HAz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = previewSettingWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436830HAz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreviewSettingWidget@ad1d.onShow$5");
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
            C05YD<Boolean> hasPermission = C445870He5.LIZ().getHasPermission();
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLJJLI, 2);
            this.LL = 1;
            if (hasPermission.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("PreviewSettingWidget@ad1d.onShow$5");
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
