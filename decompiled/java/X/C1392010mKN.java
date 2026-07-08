package X;

import Y.AfS190S0100000_21;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckQcpxResponse;
import com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponAssem;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mKN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponAssem$showSurfacePopupHandler$2$1$1$1", f = "MinisCouponAssem.kt", l = {}, m = "invokeSuspend")
public final class C1392010mKN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TiktokMinisMonetizationCheckQcpxResponse LL;
    public final /* synthetic */ MinisCouponAssem LLILLJJLI;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1392010mKN(TiktokMinisMonetizationCheckQcpxResponse tiktokMinisMonetizationCheckQcpxResponse, MinisCouponAssem minisCouponAssem, Function2<? super Boolean, ? super String, Unit> function2, InterfaceC1364105Vn<? super C1392010mKN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = tiktokMinisMonetizationCheckQcpxResponse;
        this.LLILLJJLI = minisCouponAssem;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1392010mKN(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        FragmentManager supportFragmentManager;
        Map<String, String> mapLJ;
        C1C7U.LIZ("MinisCouponAssem@34fb.showSurfacePopupHandler$2$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TiktokMinisMonetizationCheckQcpxResponse tiktokMinisMonetizationCheckQcpxResponse = this.LL;
        if (tiktokMinisMonetizationCheckQcpxResponse.isValid && (str = tiktokMinisMonetizationCheckQcpxResponse.discountRate) != null && str.length() != 0) {
            C1392020mKO c1392020mKO = (C1392020mKO) this.LLILLJJLI.LL.getValue();
            if (c1392020mKO != null) {
                c1392020mKO.LIZ(this.LL.discountRate);
            }
            MinisCouponAssem minisCouponAssem = this.LLILLJJLI;
            Context context = minisCouponAssem.getContext();
            String str2 = this.LL.discountRate;
            if (context != null) {
                C1391960mKI c1391960mKI = new C1391960mKI();
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.os;
                c1391960mKI.LIZLLL = c0hti.LIZ(context);
                c1391960mKI.LJI = 1;
                c1391960mKI.LIZ = false;
                c1391960mKI.LJII = C786410Ut5.j4(C555520LqY.LIZIZ(2131857199), Arrays.copyOf(new Object[]{str2}, 1));
                c1391960mKI.LJIIIIZZ = C555520LqY.LIZIZ(2131857196);
                c1391960mKI.LJIIJJI = (C1391990mKL) minisCouponAssem.LLILZLL.getValue();
                TuxPanel tuxPanel = minisCouponAssem.LLILZIL;
                if (tuxPanel != null) {
                    tuxPanel.dismissAllowingStateLoss();
                }
                TuxPanel tuxPanel2 = c1391960mKI.LIZ().LIZ;
                tuxPanel2.LLJI = false;
                tuxPanel2.LLILZIL = new DialogInterfaceOnDismissListenerC1402040maY(minisCouponAssem, 6);
                minisCouponAssem.LLILZIL = tuxPanel2;
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                    tuxPanel2.show(supportFragmentManager, "minis-CouponPanelManager");
                    SchemaParserData schemaParserData = C2195221Avo.LJII;
                    if (schemaParserData != null) {
                        mapLJ = schemaParserData.LIZLLL();
                    } else {
                        mapLJ = C2097608Jq.LJ();
                    }
                    C0I0B.LJFF.LIZIZ();
                    C20684815ws.LJIILLIIL("tm_coupon_panel_show", mapLJ);
                    C11JF c11jf = minisCouponAssem.LLILZ;
                    if (c11jf != null) {
                        c11jf.dispose();
                    }
                    minisCouponAssem.LLILZ = (C11JF) C11NZ.LJJJJLI(1L, TimeUnit.SECONDS).LJLIIL(5L).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS190S0100000_21(minisCouponAssem, 24));
                }
            }
        }
        Function2<Boolean, String, Unit> function2 = this.LLILLL;
        String str3 = this.LL.discountRate;
        if (str3 == null) {
            str3 = "";
        }
        function2.invoke(true, str3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisCouponAssem@34fb.showSurfacePopupHandler$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
