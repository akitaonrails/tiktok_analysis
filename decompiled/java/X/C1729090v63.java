package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0v63, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.BillboardLiveStatusHelper$onBillboardCancel$1", f = "BillboardLiveStatusHelper.kt", l = {}, m = "invokeSuspend")
public final class C1729090v63 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1729300v6O LL;
    public final /* synthetic */ Long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729090v63(C1729300v6O c1729300v6O, Long l, InterfaceC1364105Vn<? super C1729090v63> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1729300v6O;
        this.LLILLJJLI = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1729090v63(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BillboardLiveStatusHelper@7875.onBillboardCancel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1730290v7z.LIZ.getClass();
        String strLJIIJ = C1730290v7z.LJIIJ();
        C1729110v65 c1729110v65LJLZ = C1728940v5o.LJLZ(strLJIIJ);
        if (c1729110v65LJLZ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BillboardLiveStatusHelper@7875.onBillboardCancel$1");
            return unit;
        }
        if (Intrinsics.LJFF(c1729110v65LJLZ.LJII, this.LLILLJJLI.toString())) {
            String str2 = c1729110v65LJLZ.LJII;
            if (strLJIIJ == null) {
                str = "";
            } else {
                str = strLJIIJ;
            }
            C1729120v66.LIZIZ(str2, str, c1729110v65LJLZ.LJIIIIZZ, c1729110v65LJLZ, null, null);
        }
        C1728940v5o.LLZLLIL(null, strLJIIJ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BillboardLiveStatusHelper@7875.onBillboardCancel$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
