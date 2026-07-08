package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06by, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.ui.sheet.SettingDMSheet$onDismiss$1", f = "SettingDMSheet.kt", l = {}, m = "invokeSuspend")
public final class C1642806by extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ViewOnClickListenerC1643106c1 LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1642806by(ViewOnClickListenerC1643106c1 viewOnClickListenerC1643106c1, C259800zU<String> c259800zU, InterfaceC1364105Vn<? super C1642806by> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = viewOnClickListenerC1643106c1;
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1642806by(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SettingDMSheet@1983.onDismiss$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            int i = C1642906bz.LIZ[this.LL.LLILZLL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C19296410eQ.LIZIZ.batchSetPushSettingItems("im_push", 0, false, null, null);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    this.LLILLJJLI.element = "friends";
                    C19296410eQ.LIZIZ.batchSetPushSettingItems("im_push,im_push_select", 1, false, null, null);
                }
            } else {
                C19296410eQ.LIZIZ.batchSetPushSettingItems("im_push", 1, false, null, null);
                this.LLILLJJLI.element = "on";
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LIZ(e);
        }
        C19328310jZ.LIZIZ.LIZIZ(((IPushSettingService) ServiceManager.get().getService(IPushSettingService.class)).LJII());
        if (this.LL.LLILZLL != EnumC1643006c0.NO_ONE) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("from_status", "off");
            c2344009Gk.LJIIIIZZ("label", "im_push");
            c2344009Gk.LJIIIIZZ("to_status", this.LLILLJJLI.element);
            C20684815ws.LJIILLIIL("notification_switch", c2344009Gk.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SettingDMSheet@1983.onDismiss$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
