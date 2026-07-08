package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import njp.a;

/* JADX INFO: renamed from: X.095V, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.domain.SmartMovieNLEPipeline$fetchModelEffectsAsFlow$1", f = "SmartMovieNLEPipeline.kt", l = {134}, m = "invokeSuspend")
public final class C095V extends C09AX implements Function2<C094D<? super C096H>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C095X LLILLL;
    public final /* synthetic */ NLEModel LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C095V(C095X c095x, NLEModel nLEModel, boolean z, InterfaceC1364105Vn<? super C095V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c095x;
        this.LLILZ = nLEModel;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C095V c095v = new C095V(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c095v.LLILLJJLI = obj;
        return c095v;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartMovieNLEPipeline@d86f.fetchModelEffectsAsFlow$1");
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
            C094D c094d = (C094D) this.LLILLJJLI;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c094d, C2107308Nj.LIZ, null, new C095W(this.LLILLL, this.LLILZ, this.LLILZIL, c094d, null), 2);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, AFwS189S0000000_3.get$arr$(1330), this) == objLJFF) {
                C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.fetchModelEffectsAsFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.fetchModelEffectsAsFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C096H> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
