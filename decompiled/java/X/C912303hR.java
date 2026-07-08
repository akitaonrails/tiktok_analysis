package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS100S0400000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import njp.a;

/* JADX INFO: renamed from: X.03hR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess$showTimeoutDialog$1", f = "PaymentResultProcess.kt", l = {}, m = "invokeSuspend")
public final class C912303hR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C912303hR(C19EG c19eg, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, InterfaceC1364105Vn<? super C912303hR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
        this.LLILZ = function03;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C912303hR(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentResultProcess@6ad4.showTimeoutDialog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isFinishing() && !this.LL.isDestroyed()) {
            C013C c013c = new C013C();
            C19EG c19eg = this.LL;
            C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
            c1397580mTM.LJI(c19eg.getString(2131840230));
            c1397580mTM.LIZIZ(this.LL.getString(2131840229));
            c1397580mTM.LJIIIIZZ = true;
            C1238130iKB.LIZ(c1397580mTM, new AwS100S0400000_1(this.LL, (C19EG) c013c, (C013C) this.LLILLJJLI, this.LLILLL, (Function0<Unit>) 7));
            c1397580mTM.LJII = true;
            c1397580mTM.LIZLLL(new AwS367S0200000_1(c013c, (C013C) this.LLILZ, (Function0<Unit>) 100));
            new C1397510mTF(c1397580mTM).LIZLLL();
            C907803gi.LIZ.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("popup_name", "blik_expired");
            C1018703yb.LIZIZ("tiktokec_popup_show", linkedHashMap);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PaymentResultProcess@6ad4.showTimeoutDialog$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PaymentResultProcess@6ad4.showTimeoutDialog$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
