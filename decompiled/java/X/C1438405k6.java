package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05k6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.view.AliveButtonView$setCountdown$1", f = "AliveButtonView.kt", l = {212}, m = "invokeSuspend")
public final class C1438405k6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C440750HQb LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C440750HQb LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1438405k6(int i, C440750HQb c440750HQb, InterfaceC1364105Vn<? super C1438405k6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = i;
        this.LLILZIL = c440750HQb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1438405k6(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C440750HQb c440750HQb;
        Iterator it2;
        C1C7U.LIZ("AliveButtonView@476a.setCountdown$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LLILLJJLI;
                c440750HQb = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1846520y9S c1846520y9SLJIIIZ = C13LZ.LJIIIZ(this.LLILZ, 0);
            c440750HQb = this.LLILZIL;
            it2 = c1846520y9SLJIIIZ.iterator();
        }
        while (it2.hasNext()) {
            int iNextInt = ((AbstractC2098408Jy) it2).nextInt();
            if (iNextInt > 90) {
                c440750HQb.getToggleTrackText().setText(c440750HQb.getContext().getString(2131837301, C2286608xc.LJ(2)));
            } else if (iNextInt >= 1) {
                c440750HQb.getToggleTrackText().setText(c440750HQb.getContext().getString(2131833914, C2286608xc.LJ(iNextInt)));
            }
            this.LL = c440750HQb;
            this.LLILLJJLI = it2;
            this.LLILLL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("AliveButtonView@476a.setCountdown$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AliveButtonView@476a.setCountdown$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
