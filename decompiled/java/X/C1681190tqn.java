package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0tqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", l = {269}, m = "invokeSuspend")
public final class C1681190tqn extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1681200tqo LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ AbstractC1670470tZV LLIZ;
    public final /* synthetic */ C1294720jnS LLIZLLLIL;
    public final /* synthetic */ float LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ EnumC1681150tqj LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681190tqn(C1681200tqo c1681200tqo, int i, int i2, boolean z, float f, AbstractC1670470tZV abstractC1670470tZV, C1294720jnS c1294720jnS, float f2, boolean z2, boolean z3, EnumC1681150tqj enumC1681150tqj, InterfaceC1364105Vn<? super C1681190tqn> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1681200tqo;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = z;
        this.LLILZLL = f;
        this.LLIZ = abstractC1670470tZV;
        this.LLIZLLLIL = c1294720jnS;
        this.LLJ = f2;
        this.LLJI = z2;
        this.LLJIJIL = z3;
        this.LLJILJIL = enumC1681150tqj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1681190tqn(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CoroutineContext coroutineContext;
        C1C7U.LIZ("LottieAnimatableImpl@d59c.animate$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                this.LLILLJJLI.LJIILIIL(this.LLILLL);
                C1681200tqo c1681200tqo = this.LLILLJJLI;
                int i2 = this.LLILZ;
                ((C13FE) c1681200tqo.LLILLL).setValue(Integer.valueOf(i2));
                C1681200tqo c1681200tqo2 = this.LLILLJJLI;
                boolean z = this.LLILZIL;
                ((C13FE) c1681200tqo2.LLILZ).setValue(Boolean.valueOf(z));
                C1681200tqo c1681200tqo3 = this.LLILLJJLI;
                float f = this.LLILZLL;
                ((C13FE) c1681200tqo3.LLILZLL).setValue(Float.valueOf(f));
                C1681200tqo c1681200tqo4 = this.LLILLJJLI;
                ((C13FE) c1681200tqo4.LLILZIL).setValue(this.LLIZ);
                C1681200tqo c1681200tqo5 = this.LLILLJJLI;
                ((C13FE) c1681200tqo5.LLJ).setValue(this.LLIZLLLIL);
                this.LLILLJJLI.LJIIZILJ(this.LLJ);
                C1681200tqo c1681200tqo6 = this.LLILLJJLI;
                boolean z2 = this.LLJI;
                ((C13FE) c1681200tqo6.LLIZ).setValue(Boolean.valueOf(z2));
                if (!this.LLJIJIL) {
                    ((C13FE) this.LLILLJJLI.LLJILJIL).setValue(Long.MIN_VALUE);
                }
                if (this.LLIZLLLIL == null) {
                    this.LLILLJJLI.LJIILLIIL(false);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LottieAnimatableImpl@d59c.animate$2");
                    return unit;
                }
                if (Float.isInfinite(this.LLILZLL)) {
                    C1681200tqo c1681200tqo7 = this.LLILLJJLI;
                    c1681200tqo7.LJIIZILJ(((Number) c1681200tqo7.LLJILJILJ.getValue()).floatValue());
                    this.LLILLJJLI.LJIILLIIL(false);
                    this.LLILLJJLI.LJIILIIL(this.LLILZ);
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("LottieAnimatableImpl@d59c.animate$2");
                    return unit2;
                }
                this.LLILLJJLI.LJIILLIIL(true);
                int i3 = C1681160tqk.LIZ[this.LLJILJIL.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new C1954807lC();
                    }
                    coroutineContext = C23271099x.INSTANCE;
                } else {
                    coroutineContext = C09AM.LL;
                }
                C1681180tqm c1681180tqm = new C1681180tqm(this.LLJILJIL, C23118094a.LJII(getContext()), this.LLILZ, this.LLILLL, this.LLILLJJLI, null);
                this.LL = 1;
                if (C23250099c.LJI(this, coroutineContext, c1681180tqm) == objLJFF) {
                    C1C7U.LIZIZ("LottieAnimatableImpl@d59c.animate$2");
                    return objLJFF;
                }
            }
            C23118094a.LJI(getContext());
            this.LLILLJJLI.LJIILLIIL(false);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("LottieAnimatableImpl@d59c.animate$2");
            return unit3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LJIILLIIL(false);
            throw th;
        }
    }
}
