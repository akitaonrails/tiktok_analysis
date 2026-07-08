package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vCA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.SeaLiveBillboardContentView$handelBillboard$2", f = "SeaLiveBillboardContentView.kt", l = {}, m = "invokeSuspend")
public final class C1732880vCA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Integer LL;
    public final /* synthetic */ C1733170vCd LLILLJJLI;
    public final /* synthetic */ EnumC1732850vC7 LLILLL;
    public final /* synthetic */ Object LLILZ;
    public final /* synthetic */ InterfaceC1732650vBn LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732880vCA(Integer num, C1733170vCd c1733170vCd, EnumC1732850vC7 enumC1732850vC7, Object obj, InterfaceC1732650vBn interfaceC1732650vBn, InterfaceC1364105Vn<? super C1732880vCA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = num;
        this.LLILLJJLI = c1733170vCd;
        this.LLILLL = enumC1732850vC7;
        this.LLILZ = obj;
        this.LLILZIL = interfaceC1732650vBn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1732880vCA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1760360vuU c1760360vuU;
        C1C7U.LIZ("SeaLiveBillboardContentView@7802.handelBillboard$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer num = this.LL;
        if (num != null && num.intValue() == 3 && (c1760360vuU = this.LLILLJJLI.LLIZ) != null) {
            c1760360vuU.LIZJ(C1733170vCd.LIZJ(C2286608xc.LJ(this.LLILLL.getValue()), this.LLILZ));
        }
        this.LLILLJJLI.LIZIZ();
        InterfaceC1732650vBn interfaceC1732650vBn = this.LLILZIL;
        if (interfaceC1732650vBn != null) {
            interfaceC1732650vBn.onSuccess();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaLiveBillboardContentView@7802.handelBillboard$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
