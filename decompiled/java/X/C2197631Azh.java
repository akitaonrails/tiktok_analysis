package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.minis.payment.subscription.data.MinisSubscriptionSheetParams;
import com.ss.android.ugc.aweme.minis.payment.subscription.page.MinisSubscriptionFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Azh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197631Azh extends C09AY implements Function1<MinisSubscriptionSheetParams, Unit> {
    public final /* synthetic */ C2197541AzY LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ EnumC19366410pi LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2197631Azh(C2197541AzY c2197541AzY, Activity activity, EnumC19366410pi enumC19366410pi, String str, String str2) {
        super(1);
        this.LL = c2197541AzY;
        this.LLILLJJLI = activity;
        this.LLILLL = enumC19366410pi;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MinisSubscriptionSheetParams minisSubscriptionSheetParams) {
        boolean z;
        C197039127h c197039127h;
        MinisSubscriptionSheetParams minisSubscriptionSheetParams2 = minisSubscriptionSheetParams;
        C786410Ut5.J4(this.LL.LJI);
        MinisSubscriptionFragment minisSubscriptionFragment = this.LL.LJIIIIZZ;
        if (minisSubscriptionFragment != null && (c197039127h = minisSubscriptionFragment.LLJJIJI) != null) {
            c197039127h.setLoading(true);
        }
        C2197541AzY c2197541AzY = this.LL;
        C2197491AzT c2197491AzT = c2197541AzY.LJ;
        MinisSubscriptionFragment minisSubscriptionFragment2 = c2197541AzY.LJIIIIZZ;
        if (minisSubscriptionFragment2 != null) {
            if (minisSubscriptionFragment2.LLJLIL == EnumC1841230y0v.WEB) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = c2197541AzY.LJIIJ;
        }
        c2197491AzT.LJIJ = z;
        c2197541AzY.LJIIL = true;
        this.LL.LJIIIIZZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, minisSubscriptionSheetParams2.tradeOrderId, minisSubscriptionSheetParams2.skuId, minisSubscriptionSheetParams2.basePlanId, minisSubscriptionSheetParams2.offerId, this.LLILZIL);
        C2197491AzT c2197491AzT2 = this.LL.LJ;
        String str = c2197491AzT2.LJ;
        String str2 = c2197491AzT2.LIZJ;
        int i = C19366510pj.LIZ[this.LLILLL.ordinal()];
        String string = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C2197671Azl.LJFF(C2197731Azr.LJIIIZ, str, str2);
                } else {
                    throw new C1954807lC();
                }
            } else {
                C1232850iBf c1232850iBf = C2197731Azr.LJIIIZ;
                String strLIZ = C2195221Avo.LIZ();
                Map mapLIZ = C2197671Azl.LIZ(str, str2);
                C1232830iBd c1232830iBd = C1232830iBd.LIZ;
                String strValueOf = String.valueOf(c1232850iBf.LIZ);
                Integer num = c1232850iBf.LIZJ;
                if (num != null) {
                    string = num.toString();
                }
                EnumC1236600iHi enumC1236600iHi = c1232850iBf.LJFF;
                EnumC21632119lH enumC21632119lH = c1232850iBf.LJI;
                EnumC19415410xc enumC19415410xc = c1232850iBf.LJII;
                c1232830iBd.getClass();
                C1232830iBd.LIZ(strLIZ, "minis_subscribe_change_click", strValueOf, string, null, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onMinisPayUserClick, errorCodeScene:");
                sbLIZ.append(c1232850iBf);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } else {
            C1232850iBf c1232850iBf2 = C2197731Azr.LJIIIZ;
            String strLIZ2 = C2195221Avo.LIZ();
            Map mapLIZ2 = C2197671Azl.LIZ(str, str2);
            C1232830iBd c1232830iBd2 = C1232830iBd.LIZ;
            String strValueOf2 = String.valueOf(c1232850iBf2.LIZ);
            Integer num2 = c1232850iBf2.LIZJ;
            if (num2 != null) {
                string = num2.toString();
            }
            EnumC1236600iHi enumC1236600iHi2 = c1232850iBf2.LJFF;
            EnumC21632119lH enumC21632119lH2 = c1232850iBf2.LJI;
            EnumC19415410xc enumC19415410xc2 = c1232850iBf2.LJII;
            c1232830iBd2.getClass();
            C1232830iBd.LIZ(strLIZ2, "minis_subscribe_create_click", strValueOf2, string, null, mapLIZ2, enumC1236600iHi2, enumC21632119lH2, enumC19415410xc2);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onMinisPayUserClick, errorCodeScene:");
            sbLIZ2.append(c1232850iBf2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        return Unit.LIZ;
    }
}
