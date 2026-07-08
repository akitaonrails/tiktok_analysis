package X;

import Y.AcS495S0100000_12;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.slot.IBcToggleService;
import com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveCommercialContentToggleFragmentSheet$onViewCreated$1$6$1", f = "LiveCommercialContentToggleFragmentSheet.kt", l = {}, m = "invokeSuspend")
public final class C759140TqC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveCommercialContentToggleFragmentSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C759140TqC(LiveCommercialContentToggleFragmentSheet liveCommercialContentToggleFragmentSheet, InterfaceC1364105Vn<? super C759140TqC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveCommercialContentToggleFragmentSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C759140TqC(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        int i;
        C758950Tpt c758950Tpt;
        Integer num;
        C1C7U.LIZ("LiveCommercialContentToggleFragmentSheet@5f51.onViewCreated$1$6$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveCommercialContentToggleFragmentSheet liveCommercialContentToggleFragmentSheet = this.LL;
        liveCommercialContentToggleFragmentSheet.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_commercial_pannel_save_click");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        if (liveCommercialContentToggleFragmentSheet.LLLIIL) {
            str = "live_take_page";
        } else {
            str = "live_take_detail";
        }
        c474500IjALIZ.LJIILJJIL(str);
        liveCommercialContentToggleFragmentSheet.JS(c474500IjALIZ);
        if (liveCommercialContentToggleFragmentSheet.GS().isChecked()) {
            str2 = "open";
        } else {
            str2 = "close";
        }
        c474500IjALIZ.LJJII(str2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(Integer.valueOf(liveCommercialContentToggleFragmentSheet.BS().isChecked() ? 1 : 0), "promoting_yourself");
        c474500IjALIZ.LJJII(Integer.valueOf(liveCommercialContentToggleFragmentSheet.yS().isChecked() ? 1 : 0), "promoting_third_party");
        c474500IjALIZ.LIZ();
        if (this.LL.GS().isChecked() && (this.LL.BS().isChecked() || this.LL.yS().isChecked())) {
            if (this.LL.yS().isChecked()) {
                C758920Tpq c758920Tpq = this.LL.LLLIZZ;
                if (c758920Tpq != null && (c758950Tpt = c758920Tpq.LIZJ) != null && (num = c758950Tpt.LJ) != null && num.intValue() == 1 && ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).ln() > 0 && this.LL.LLLIIL) {
                    i = 2131841058;
                } else {
                    i = 2131841057;
                }
            } else {
                i = 2131841056;
            }
            C782110Um9 c782110Um9 = new C782110Um9(this.LL.getContext());
            c782110Um9.LIZJ = C497740JfY.LJIJI(2131841060);
            c782110Um9.LJII(i);
            c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131841055), new AcS495S0100000_12(this.LL, 6));
            c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131841059), new InterfaceC743640TFa() { // from class: X.0TqD
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIILLIIL = false;
            C786410Ut5.E4(c782110Um9.LIZ());
        } else {
            IBcToggleService iBcToggleServiceLIZ = C197600pS.LIZ();
            CommercialContentToggle commercialContentToggle = new CommercialContentToggle();
            LiveCommercialContentToggleFragmentSheet liveCommercialContentToggleFragmentSheet2 = this.LL;
            commercialContentToggle.openCommercialContentToggle = liveCommercialContentToggleFragmentSheet2.GS().isChecked();
            commercialContentToggle.promoteMyself = liveCommercialContentToggleFragmentSheet2.BS().isChecked();
            commercialContentToggle.promoteThirdParty = liveCommercialContentToggleFragmentSheet2.yS().isChecked();
            iBcToggleServiceLIZ.fV1(commercialContentToggle);
            LiveCommercialContentToggleFragmentSheet liveCommercialContentToggleFragmentSheet3 = this.LL;
            C758920Tpq c758920Tpq2 = liveCommercialContentToggleFragmentSheet3.LLLIZZ;
            if (c758920Tpq2 != null) {
                c758920Tpq2.LIZLLL = true;
            }
            liveCommercialContentToggleFragmentSheet3.QS();
            this.LL.close(1);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveCommercialContentToggleFragmentSheet@5f51.onViewCreated$1$6$1");
        return unit;
    }
}
