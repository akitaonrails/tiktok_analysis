package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.utils.BonusAnimationUtil$preloadLottieWithUrl$1", f = "BonusAnimationUtil.kt", l = {}, m = "invokeSuspend")
public final class C434160H0s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function1<C1294720jnS, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C434160H0s(Context context, String str, Function0<Unit> function0, Function1<? super C1294720jnS, Unit> function1, InterfaceC1364105Vn<? super C434160H0s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = function0;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434160H0s(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BonusAnimationUtil@e7d2.preloadLottieWithUrl$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C990603u4.LIZJ) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BonusAnimationUtil@e7d2.preloadLottieWithUrl$1");
            return unit;
        }
        C990603u4.LIZJ = true;
        try {
            C1292030jj7<C1294720jnS> c1292030jj7LJIIL = C1294250jmh.LJIIL(this.LL, this.LLILLJJLI, null);
            c1292030jj7LJIIL.LIZIZ(new C0IE1((Function1) this.LLILZ, 5));
            c1292030jj7LJIIL.LIZ(new C0IE1(this.LLILLL, 6));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.invoke();
            C990603u4.LIZJ = false;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BonusAnimationUtil@e7d2.preloadLottieWithUrl$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
