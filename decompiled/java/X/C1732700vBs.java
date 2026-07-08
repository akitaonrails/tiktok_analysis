package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.BaseECBillboardWidget$displayBillboard$1", f = "BaseECBillboardWidget.kt", l = {}, m = "invokeSuspend")
public final class C1732700vBs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Number LL;
    public final /* synthetic */ AbstractC1732690vBr LLILLJJLI;
    public final /* synthetic */ List<ECBillboard> LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;
    public final /* synthetic */ InterfaceC1731950vAf LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732700vBs(Number number, AbstractC1732690vBr abstractC1732690vBr, List<ECBillboard> list, Map<String, ? extends Object> map, InterfaceC1731950vAf interfaceC1731950vAf, InterfaceC1364105Vn<? super C1732700vBs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = number;
        this.LLILLJJLI = abstractC1732690vBr;
        this.LLILLL = list;
        this.LLILZ = map;
        this.LLILZIL = interfaceC1731950vAf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1732700vBs(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseECBillboardWidget@a7b6.displayBillboard$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (Intrinsics.LJFF(this.LL, C2286608xc.LJ(0))) {
            final long jLIZ = this.LLILLJJLI.LLIZ.LIZ();
            final AbstractC1732690vBr abstractC1732690vBr = this.LLILLJJLI;
            C1733020vCO c1733020vCO = abstractC1732690vBr.LLIZ;
            final List<ECBillboard> list = this.LLILLL;
            final Map<String, Object> map = this.LLILZ;
            final InterfaceC1731950vAf interfaceC1731950vAf = this.LLILZIL;
            InterfaceC1731950vAf interfaceC1731950vAf2 = new InterfaceC1731950vAf() { // from class: X.0vBw
                @Override // X.InterfaceC1731950vAf
                public final void onSuccess() {
                    abstractC1732690vBr.LJJIJIIJI(jLIZ, list, map, false);
                    interfaceC1731950vAf.onSuccess();
                }

                @Override // X.InterfaceC1731950vAf
                public final void LIZ(String str) {
                    interfaceC1731950vAf.LIZ(str);
                }
            };
            Map<String, ? extends Object> map2 = this.LLILZ;
            C1733010vCN c1733010vCN = c1733020vCO.LL;
            if (c1733010vCN != null) {
                c1733010vCN.LIZ(list, interfaceC1731950vAf2, map2);
            }
        } else {
            this.LLILLJJLI.LJJIFFI(this.LLILLL, this.LL, this.LLILZIL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseECBillboardWidget@a7b6.displayBillboard$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
