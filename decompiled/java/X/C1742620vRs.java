package X;

import com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.trending.page.ECTrendingFragment$onCreate$1", f = "ECTrendingFragment.kt", l = {}, m = "invokeSuspend")
public final class C1742620vRs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ECTrendingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1742620vRs(ECTrendingFragment eCTrendingFragment, InterfaceC1364105Vn<? super C1742620vRs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = eCTrendingFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1742620vRs(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECTrendingFragment@8b2b.onCreate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.VR().vQ2();
        ECTrendingFragment eCTrendingFragment = this.LL;
        C736680Sv4.LJIIIIZZ(eCTrendingFragment, eCTrendingFragment.VR(), new C2217381BqS() { // from class: X.0vRt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Integer.valueOf(((C1742800vSA) obj2).LLILZIL);
            }
        }, null, new AwS640S0100000_26(this.LL, 34), 6);
        ECTrendingFragment eCTrendingFragment2 = this.LL;
        C736680Sv4.LJIIIIZZ(eCTrendingFragment2, eCTrendingFragment2.VR(), new C2217381BqS() { // from class: X.0vRy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1742800vSA) obj2).LLIZ;
            }
        }, null, new AwS640S0100000_26(this.LL, 35), 6);
        ECTrendingFragment eCTrendingFragment3 = this.LL;
        C736680Sv4.LJIIIZ(eCTrendingFragment3, eCTrendingFragment3.VR(), new C2217381BqS() { // from class: X.0vRw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1742800vSA) obj2).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0vRz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1742800vSA) obj2).LLJI;
            }
        }, null, new AwS675S0100000_26(this.LL, 4), 12);
        ECTrendingFragment eCTrendingFragment4 = this.LL;
        C736680Sv4.LJIIIIZZ(eCTrendingFragment4, eCTrendingFragment4.VR(), new C2217381BqS() { // from class: X.0vRu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return Boolean.valueOf(((C1742800vSA) obj2).LLILZLL);
            }
        }, null, new AwS640S0100000_26(this.LL, 36), 6);
        ECTrendingFragment eCTrendingFragment5 = this.LL;
        C736680Sv4.LJIIIZ(eCTrendingFragment5, eCTrendingFragment5.VR(), new C2217381BqS() { // from class: X.0vRx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1742800vSA) obj2).LLIZ;
            }
        }, new C2217381BqS() { // from class: X.0vRv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1742800vSA) obj2).LLILZ;
            }
        }, null, new AwS675S0100000_26(this.LL, 3), 12);
        C1748720vbi.LIZIZ(this.LL, new C049Z(), null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECTrendingFragment@8b2b.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
