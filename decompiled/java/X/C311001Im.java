package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: renamed from: X.01Im, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C311001Im implements InterfaceC356301Zx {
    public final /* synthetic */ BaseCountDownForAllV2Widget<VM> LIZ;

    @Override // X.InterfaceC356301Zx
    public final Map LIZ(Map map) {
        return null;
    }

    @Override // X.InterfaceC356301Zx
    public final boolean LIZJ() {
        String strA1 = this.LIZ.A1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needRefreshBannerWhenReturnForeground=");
        VM vm = this.LIZ.LL;
        sbLIZ.append(vm != 0 ? Integer.valueOf(vm.yQ2()) : null);
        C20441214yg.LIZIZ(strA1, C2188811AlT.LIZIZ(sbLIZ));
        VM vm2 = this.LIZ.LL;
        return vm2 != 0 && vm2.yQ2() == 1;
    }

    @Override // X.InterfaceC356301Zx
    public final void LIZLLL() throws JSONException {
        C20441214yg.LIZIZ(this.LIZ.A1(), "beforeSendShowEvent");
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user_type", C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI()));
        jSONObject.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJII).getSecond());
        jSONObject.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJII).getFirst());
        jSONObject.put("link_id_list", C917520Zz4.LJ());
        jSONObject.put("guest_cnt", String.valueOf(C924810aAp.LJ().LJJII));
        C389001fE.LIZ("countdown_all_banner_info", jSONObject, System.currentTimeMillis(), false);
        VM vm = this.LIZ.LL;
        if (vm != 0) {
            vm.xQ2();
        }
    }

    public C311001Im(BaseCountDownForAllV2Widget<VM> baseCountDownForAllV2Widget) {
        this.LIZ = baseCountDownForAllV2Widget;
    }

    @Override // X.InterfaceC356301Zx
    public final void LIZIZ(Function1<? super JSONObject, Unit> function1) {
        CountdownForAllContent countdownForAllContentWQ2;
        User userCQ2;
        String strDQ2;
        VM vm = this.LIZ.LL;
        if (vm != 0) {
            countdownForAllContentWQ2 = vm.wQ2();
        } else {
            countdownForAllContentWQ2 = null;
        }
        VM vm2 = this.LIZ.LL;
        if (vm2 != 0) {
            userCQ2 = vm2.CQ2();
        } else {
            userCQ2 = null;
        }
        VM vm3 = this.LIZ.LL;
        if (vm3 != 0) {
            strDQ2 = vm3.DQ2();
        } else {
            strDQ2 = null;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), C0PEM.LIZJ, null, new C01J2(strDQ2, countdownForAllContentWQ2, this.LIZ, userCQ2, function1, null), 2);
    }
}
