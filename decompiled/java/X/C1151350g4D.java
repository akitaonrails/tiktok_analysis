package X;

import android.content.Context;
import com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.recharge.RechargeBtnViewModel;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tracking.TrackingEventV3Data;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS453S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import njp.a;

/* JADX INFO: renamed from: X.0g4D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.recharge.RechargeBtnViewModel$recharge$1", f = "RechargeBtnViewModel.kt", l = {99}, m = "invokeSuspend")
public final class C1151350g4D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ RechargeBtnViewModel LLILLL;
    public final /* synthetic */ RechargePanelInputParams LLILZ;
    public final /* synthetic */ C1151400g4I LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1151350g4D(RechargeBtnViewModel rechargeBtnViewModel, RechargePanelInputParams rechargePanelInputParams, C1151400g4I c1151400g4I, Context context, Map<String, String> map, InterfaceC1364105Vn<? super C1151350g4D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = rechargeBtnViewModel;
        this.LLILZ = rechargePanelInputParams;
        this.LLILZIL = c1151400g4I;
        this.LLILZLL = context;
        this.LLIZ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1151350g4D c1151350g4D = new C1151350g4D(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1151350g4D.LLILLJJLI = obj;
        return c1151350g4D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Long lLJFF;
        C1804840x4E c1804840x4EUD1;
        String strIv0;
        String strLJIIIIZZ;
        int i2;
        Boolean boolValueOf;
        int iLJJJI;
        Integer numLJIL;
        C1804820x4C c1804820x4C;
        C1804820x4C c1804820x4C2;
        Object objLJI = obj;
        C1C7U.LIZ("RechargeBtnViewModel@27e9.recharge$1");
        Object objLJFF = C099R.LJFF();
        int i3 = this.LL;
        HashMap<String, Object> mapUB2 = null;
        if (i3 != 0) {
            if (i3 == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            Object obj2 = this.LLILLJJLI;
            this.LLILLL.setState(new AwS596S0100000_17(this.LLILZIL, 555));
            if (C1149560g1K.LIZLLL(this.LLILZ)) {
                i = 1;
            } else {
                i = 2;
            }
            C1151400g4I c1151400g4I = this.LLILZIL;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C1151390g4H(i, c1151400g4I, null));
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("RechargeBtnViewModel@27e9.recharge$1");
                return objLJFF;
            }
        }
        Diamond diamond = (Diamond) objLJI;
        if (diamond == null) {
            this.LLILLL.setState(new AwS596S0100000_17(this.LLILZIL, 556));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RechargeBtnViewModel@27e9.recharge$1");
            return unit;
        }
        RechargeRequestParams rechargeRequestParamsLIZ = C1151360g4E.LIZ(this.LLILZ, diamond);
        C1148670fzt.LIZ().getRechargeService().LJIILL(true);
        Context context = this.LLILZLL;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI != null) {
            lLJFF = C2286608xc.LJFF(roomLJJLI.getId());
        } else {
            lLJFF = null;
        }
        RechargePanelInputParams rechargePanelInputParams = this.LLILZ;
        PackageListAbility packageListAbility = this.LLILLL.LLILLL;
        if (packageListAbility != null) {
            mapUB2 = packageListAbility.UB2(null);
        }
        AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this.LLILLL, 509);
        AwS561S0100000_17 awS561S0100000_172 = new AwS561S0100000_17(this.LLILLL, 510);
        AwS383S0200000_17 awS383S0200000_17 = new AwS383S0200000_17(this.LLILLL, this.LLILZIL, 98);
        AwS453S0200000_17 awS453S0200000_17 = new AwS453S0200000_17(this.LLILLL, this.LLILZIL, 0);
        boolean z = this.LLILZIL.LLJ;
        Map<String, String> map = this.LLIZ;
        String str = rechargeRequestParamsLIZ.requestPage;
        String str2 = rechargeRequestParamsLIZ.chargeReason;
        PackageListAbility packageListAbility2 = this.LLILLL.LLILLL;
        if (packageListAbility2 != null) {
            c1804840x4EUD1 = packageListAbility2.uD1();
        } else {
            c1804840x4EUD1 = null;
        }
        PackageListAbility packageListAbility3 = this.LLILLL.LLILLL;
        if (packageListAbility3 != null) {
            strIv0 = packageListAbility3.Iv0();
        } else {
            strIv0 = null;
        }
        if (c1804840x4EUD1 == null || (strLJIIIIZZ = c1804840x4EUD1.LJIIIIZZ()) == null) {
            strLJIIIIZZ = "tiktok";
        }
        if (strIv0 == null) {
            i2 = 0;
        } else {
            strLJIIIIZZ = strIv0;
            i2 = 1;
        }
        boolean z2 = c1804840x4EUD1 instanceof C1804820x4C;
        if (z2 && (c1804820x4C2 = (C1804820x4C) c1804840x4EUD1) != null) {
            boolValueOf = Boolean.valueOf(c1804820x4C2.LJJ());
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C176600m4.LIZIZ(boolValueOf)));
        String strLJ = C1151360g4E.LJ(strLJIIIIZZ, c1804840x4EUD1);
        int iLJFF = C1151360g4E.LJFF();
        if (C1148670fzt.LIZ().walletCenter().JE1()) {
            iLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1148670fzt.LIZ().walletCenter().kb()));
        } else {
            iLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1133940fc8.LIZIZ.kb()));
        }
        if (z2 && (c1804820x4C = (C1804820x4C) c1804840x4EUD1) != null) {
            numLJIL = c1804820x4C.LJIL();
        } else {
            numLJIL = null;
        }
        C1151360g4E.LIZIZ(context, diamond, lLJFF, rechargeRequestParamsLIZ, rechargePanelInputParams, mapUB2, awS561S0100000_17, awS561S0100000_172, awS383S0200000_17, awS453S0200000_17, null, z, map, C1516000pYM.LIZJ(new TrackingEventV3Data(zLJJJI ? 1 : 0, strLJ, i2, strLJIIIIZZ, "normal", str, null, null, str2, iLJFF, iLJJJI, null, numLJIL)));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RechargeBtnViewModel@27e9.recharge$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
