package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.Gift;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ee2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.firstrecharge.FirstRechargeGiftHelper$onSendLocalCurrencyGiftSuccess$1", f = "FirstRechargeGiftHelper.kt", l = {49}, m = "invokeSuspend")
public final class C1096680ee2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;

    public C1096680ee2(InterfaceC1364105Vn<? super C1096680ee2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1096680ee2(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String strLJIIL;
        C1C7U.LIZ("FirstRechargeGiftHelper@3b58.onSendLocalCurrencyGiftSuccess$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Gift giftFindGiftById = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(C1096690ee3.LIZJ);
            if (giftFindGiftById != null) {
                str = giftFindGiftById.name;
            } else {
                str = null;
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C1096700ee4 c1096700ee4 = new C1096700ee4(null);
            this.LL = str;
            this.LLILLJJLI = 1;
            obj = C23250099c.LJI(this, c1dfb, c1096700ee4);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FirstRechargeGiftHelper@3b58.onSendLocalCurrencyGiftSuccess$1");
                return objLJFF;
            }
        }
        int iMax = Math.max(((Number) obj).intValue() - C1096690ee3.LIZIZ, 0);
        if (iMax > 0 && C1096690ee3.LIZIZ > 0 && C500260Jjc.LJJIJ(str)) {
            strLJIIL = C497740JfY.LJIIL(2131755779, iMax, str, C2286608xc.LJ(C1096690ee3.LIZIZ), C2286608xc.LJ(iMax));
        } else if (C1096690ee3.LIZIZ > 0 && C500260Jjc.LJJIJ(str)) {
            strLJIIL = C497740JfY.LJIJJ(2131850996, str, C2286608xc.LJ(C1096690ee3.LIZIZ));
        } else {
            int i2 = C1096690ee3.LIZLLL;
            if (i2 > 0) {
                strLJIIL = C497740JfY.LJIIL(2131755778, i2, C2286608xc.LJ(i2));
            } else {
                strLJIIL = "";
            }
        }
        C766270U4b.LJIIJJI(strLJIIL);
        C1096690ee3.LIZIZ = 0;
        C1096690ee3.LIZJ = 0L;
        C1096690ee3.LJ = 0;
        C1096690ee3.LIZLLL = 0;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FirstRechargeGiftHelper@3b58.onSendLocalCurrencyGiftSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1096680ee2(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
