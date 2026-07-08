package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0tqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", l = {}, m = "invokeSuspend")
public final class C1681220tqq extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1681200tqo LL;
    public final /* synthetic */ C1294720jnS LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681220tqq(C1681200tqo c1681200tqo, C1294720jnS c1294720jnS, float f, int i, boolean z, InterfaceC1364105Vn<? super C1681220tqq> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = c1681200tqo;
        this.LLILLJJLI = c1294720jnS;
        this.LLILLL = f;
        this.LLILZ = i;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1681220tqq(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LottieAnimatableImpl@d59c.snapTo$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1681200tqo c1681200tqo = this.LL;
        ((C13FE) c1681200tqo.LLJ).setValue(this.LLILLJJLI);
        this.LL.LJIIZILJ(this.LLILLL);
        this.LL.LJIILIIL(this.LLILZ);
        this.LL.LJIILLIIL(false);
        if (this.LLILZIL) {
            ((C13FE) this.LL.LLJILJIL).setValue(Long.MIN_VALUE);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LottieAnimatableImpl@d59c.snapTo$2");
        return unit;
    }
}
