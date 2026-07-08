package X;

import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.095R, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.domain.SmartMovieNLEPipeline$launchCompressJob$1", f = "SmartMovieNLEPipeline.kt", l = {152}, m = "invokeSuspend")
public final class C095R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C23186096q LLILLJJLI;
    public final /* synthetic */ C095E<C096H> LLILLL;
    public final /* synthetic */ List<MetaExt> LLILZ;
    public final /* synthetic */ C05XL<Boolean> LLILZIL;
    public final /* synthetic */ Function0<C09AE> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C095R(C23186096q c23186096q, C095E<C096H> c095e, List<MetaExt> list, C05XL<Boolean> c05xl, Function0<? extends C09AE> function0, InterfaceC1364105Vn<? super C095R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c23186096q;
        this.LLILLL = c095e;
        this.LLILZ = list;
        this.LLILZIL = c05xl;
        this.LLILZLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C095R(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartMovieNLEPipeline@d86f.launchCompressJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C23186096q c23186096q = this.LLILLJJLI;
            if (c23186096q.LJIIIZ) {
                this.LLILLL.LJIIIIZZ(new C095S(1.0f));
                this.LLILLL.LJIIIIZZ(new C095T(this.LLILZ));
                this.LLILZIL.LJIIZILJ(true);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.launchCompressJob$1");
                return unit;
            }
            C2295408z2 c2295408z2 = C2295408z2.LIZ;
            String str = c23186096q.LJ;
            List<MetaExt> list = c23186096q.LIZJ;
            AwS582S0100000_3 awS582S0100000_3 = new AwS582S0100000_3(this.LLILLL, (C095E<C096H>) 106);
            this.LL = 1;
            c2295408z2.getClass();
            obj = C2296808zG.LJ(new C2285408xQ(str, list, null, awS582S0100000_3), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.launchCompressJob$1");
                return objLJFF;
            }
        }
        String str2 = (String) obj;
        if (str2 != null && str2.length() != 0) {
            this.LLILLL.LJIIIIZZ(new C096G(4, "", str2, C2097608Jq.LJ()));
            this.LLILZIL.LJIIZILJ(false);
            C09AE c09aeInvoke = this.LLILZLL.invoke();
            if (c09aeInvoke != null) {
                c09aeInvoke.LIZIZ(new CancellationException("getNLEModel compress failed"));
            }
            this.LLILLL.LJIIJJI(null);
        } else {
            this.LLILLL.LJIIIIZZ(new C095T(this.LLILZ));
            this.LLILZIL.LJIIZILJ(true);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.launchCompressJob$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
