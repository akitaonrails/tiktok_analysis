package X;

import Y.AfS103S0300000_7;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.RefreshMoreRedDotEvent;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameFloatWindowTipsDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JkK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.bgbroadcast.permission.OverlayPermissionController$initToolbarButton$behavior$1$clickInterval$1", f = "OverlayPermissionController.kt", l = {158}, m = "invokeSuspend")
public final class C500700JkK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C500730JkN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C500700JkK(C500730JkN c500730JkN, InterfaceC1364105Vn<? super C500700JkK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c500730JkN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C500700JkK(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OverlayPermissionController@3298.initToolbarButton$behavior$1$clickInterval$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C500730JkN c500730JkN = this.LLILLJJLI;
            this.LL = 1;
            c500730JkN.getClass();
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            if (C0W78.LJFF(c500730JkN.LL.getActivity())) {
                C189200o6.m2constructorimpl(true);
                c23260099m.resumeWith(true);
            } else {
                FragmentManager fragmentManagerLJJI = C520010KaN.LJJI(c500730JkN.LL, false);
                if (fragmentManagerLJJI == null) {
                    C189200o6.m2constructorimpl(false);
                    c23260099m.resumeWith(false);
                } else {
                    C19489311Mt c19489311Mt = new C19489311Mt();
                    GameFloatWindowTipsDialog gameFloatWindowTipsDialogNs1 = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).ns1("in_live");
                    if (gameFloatWindowTipsDialogNs1 != null) {
                        gameFloatWindowTipsDialogNs1.setOnDismissListener(new DialogInterfaceOnDismissListenerC521770KdD(c19489311Mt, 8));
                    }
                    C013C c013c = new C013C();
                    c013c.element = true;
                    ((InterfaceC500100JjM) c19489311Mt.LJIIJ(new C521870KdN(((C0J1N) C11RB.LIZIZ(c500730JkN.LL).LIZIZ.LIZJ(C11RD.LIZLLL(c500730JkN.LL))).LIZJ(new AfS103S0300000_7(c013c, c500730JkN, gameFloatWindowTipsDialogNs1, 16)), c500730JkN, c23260099m, 2)).LIZLLL(C11RD.LIZLLL(c500730JkN.LL))).subscribe();
                    if (gameFloatWindowTipsDialogNs1 != null) {
                        gameFloatWindowTipsDialogNs1.show(fragmentManagerLJJI, "GameFloatWindowTipsDialog");
                    }
                    c500730JkN.LJII();
                }
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OverlayPermissionController@3298.initToolbarButton$behavior$1$clickInterval$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.LLILLJJLI.LLILLL.LIZJ("in_app", "full");
        }
        this.LLILLJJLI.LLILLJJLI.FQ2(RefreshMoreRedDotEvent.class);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OverlayPermissionController@3298.initToolbarButton$behavior$1$clickInterval$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
