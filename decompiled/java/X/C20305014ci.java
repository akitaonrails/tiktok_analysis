package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.14ci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.serverpush.compose.login.cell.SubPageWithSchemaPushCellKt$SubPageWithSchemaPushCell$1$1", f = "SubPageWithSchemaPushCell.kt", l = {}, m = "invokeSuspend")
public final class C20305014ci extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20694515yR LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20305014ci(C20694515yR c20694515yR, boolean z, InterfaceC1364105Vn<? super C20305014ci> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20694515yR;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20305014ci(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubPageWithSchemaPushCellKt@21f.SubPageWithSchemaPushCell$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19343410m0 c19343410m0 = C19343410m0.LIZ;
        C20694515yR c20694515yR = this.LL;
        PushItem pushItem = c20694515yR.LLJJIII;
        boolean z = c20694515yR.LLJJIJI;
        boolean z2 = this.LLILLJJLI;
        c19343410m0.getClass();
        if (z && Intrinsics.LJFF(pushItem.itemId, "sms")) {
            C1245240iVe.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("page_name", "notification_setting_page");
            c2344009Gk.LJIIIIZZ("exp_name", "sms_notification");
            C20684815ws.LJIILLIIL("show_sms_notification_setting", c2344009Gk.LIZ);
        }
        if (!z2 && z) {
            if (Intrinsics.LJFF(pushItem.itemId, "im_alert_tones")) {
                C1245240iVe.LIZ.getClass();
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("enter_from", "settings");
                C20684815ws.LJIILLIIL("msg_settings_alert_tone_show", c2344009Gk2.LIZ);
            }
            if (Intrinsics.LJFF(pushItem.itemId, "im_notification_permissions")) {
                C1245240iVe.LIZ.getClass();
                C2344009Gk c2344009Gk3 = new C2344009Gk();
                c2344009Gk3.LJIIIIZZ("enter_from", "settings");
                C20684815ws.LJIILLIIL("msg_settings_notif_permission_show", c2344009Gk3.LIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubPageWithSchemaPushCellKt@21f.SubPageWithSchemaPushCell$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
