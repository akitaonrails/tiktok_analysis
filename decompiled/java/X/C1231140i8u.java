package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.fangroup.fragment.FanGroupJoinPanelFragment;
import com.ss.android.ugc.aweme.fangroup.model.GroupJoinResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.fangroup.utils.FanGroupJoinDowngradeImpl$tryJoinGroup$3$1", f = "FanGroupJoinServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1231140i8u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C1231150i8v LLILLJJLI;
    public final /* synthetic */ GroupJoinResponse LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1231140i8u(Context context, C1231150i8v c1231150i8v, GroupJoinResponse groupJoinResponse, InterfaceC1364105Vn<? super C1231140i8u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = c1231150i8v;
        this.LLILLL = groupJoinResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1231140i8u(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FragmentManager supportFragmentManager;
        C1C7U.LIZ("FanGroupJoinDowngradeImpl@b193.tryJoinGroup$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = FanGroupJoinPanelFragment._pnsPageId;
        Context context = this.LL;
        C1231150i8v c1231150i8v = this.LLILLJJLI;
        GroupJoinResponse groupJoinResponse = this.LLILLL;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            FanGroupJoinPanelFragment fanGroupJoinPanelFragment = new FanGroupJoinPanelFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "join_panel_params", c1231150i8v);
            C786410Ut5.LJJIJL(bundle, "join_panel_join_group_resp", groupJoinResponse);
            fanGroupJoinPanelFragment.setArguments(bundle);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJI = fanGroupJoinPanelFragment;
            tuxSheet.LLJJIJIIJIL = true;
            tuxSheet.LLJLILLLLZIIL = false;
            c1390920mIc.LJIIIIZZ(1);
            DialogInterfaceOnDismissListenerC1231220i92 dialogInterfaceOnDismissListenerC1231220i92 = new DialogInterface.OnDismissListener() { // from class: X.0i92
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                }
            };
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLILLJJLI = dialogInterfaceOnDismissListenerC1231220i92;
            tuxSheet2.show(supportFragmentManager, "FanGroupJoinPanelFragment");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FanGroupJoinDowngradeImpl@b193.tryJoinGroup$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
