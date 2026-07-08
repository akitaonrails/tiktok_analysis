package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS124S1100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Qj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixSparkAbility$prepareLynxViews$1", f = "MixSparkAbility.kt", l = {}, m = "invokeSuspend")
public final class C678260Qj2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C677480Qhm LL;
    public final /* synthetic */ C1540620qC4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C678260Qj2(C677480Qhm c677480Qhm, C1540620qC4 c1540620qC4, InterfaceC1364105Vn<? super C678260Qj2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c677480Qhm;
        this.LLILLJJLI = c1540620qC4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C678260Qj2(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("MixSparkAbility@64fa.prepareLynxViews$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C678710Qjl.LIZ("ec_search_mix_preload_lynx_view");
        String[] strArr = (String[]) C1228004rG.LIZIZ.getValue();
        int i = 0;
        if (strArr == null) {
            strArr = new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            C677480Qhm c677480Qhm = this.LL;
            c677480Qhm.getClass();
            if (C123100dR.LIZ(C677490Qhn.LIZJ(str))) {
                Boolean.valueOf(arrayList.add(new C679540Ql6(null, null, null, null, null, null, null, null, C677490Qhn.LIZJ(str), new AwS124S1100000_10(c677480Qhm, str, 16), 27135)));
            }
        }
        Integer num = (Integer) C215800sO.LIZ.getValue();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 2;
            C677480Qhm c677480Qhm2 = this.LL;
            String str2 = (String) C2539809xM.LIZ.getValue();
            c677480Qhm2.getClass();
            arrayList.add(new C679540Ql6(null, null, null, null, null, null, null, null, C677490Qhn.LIZJ(str2), new AwS589S0100000_10(this.LL, 426), 27135));
            i = 0 + 1;
        }
        while (i < iIntValue) {
            C677480Qhm c677480Qhm3 = this.LL;
            String str3 = (String) C2539809xM.LIZ.getValue();
            c677480Qhm3.getClass();
            arrayList.add(new C679540Ql6(null, null, null, null, null, null, null, null, C677490Qhn.LIZJ(str3), new AwS589S0100000_10(this.LL, 426), 27135));
            i++;
        }
        C1540620qC4 c1540620qC4 = this.LLILLJJLI;
        if (c1540620qC4 != null) {
            C01GW<C1537720q7O> c01gw = C1540620qC4.LJJJJIZL;
            c1540620qC4.LJIJ(arrayList, null);
        }
        C678710Qjl.LIZIZ("ec_search_mix_preload_lynx_view");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixSparkAbility@64fa.prepareLynxViews$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
