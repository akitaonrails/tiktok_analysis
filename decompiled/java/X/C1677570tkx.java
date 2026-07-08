package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS120S0400000_25;
import njp.a;

/* JADX INFO: renamed from: X.0tkx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {305}, m = "invokeSuspend")
public final class C1677570tkx extends C09AX implements Function1<InterfaceC1364105Vn<? super C1677600tl0<Object, AbstractC1677260tkS>>, Object> {
    public C1677580tky LL;
    public C013C LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C1677480tko<Object, AbstractC1677260tkS> LLILZ;
    public final /* synthetic */ Object LLILZIL;
    public final /* synthetic */ InterfaceC1677860tlQ<Object, AbstractC1677260tkS> LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ Function1<C1677480tko<Object, AbstractC1677260tkS>, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1677570tkx(C1677480tko<Object, AbstractC1677260tkS> c1677480tko, Object obj, InterfaceC1677860tlQ<Object, AbstractC1677260tkS> interfaceC1677860tlQ, long j, Function1<? super C1677480tko<Object, AbstractC1677260tkS>, Unit> function1, InterfaceC1364105Vn<? super C1677570tkx> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILZ = c1677480tko;
        this.LLILZIL = obj;
        this.LLILZLL = interfaceC1677860tlQ;
        this.LLIZ = j;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1677570tkx(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C1677600tl0<Object, AbstractC1677260tkS>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C013C c013c;
        C1677580tky c1677580tky;
        EnumC993030bwr enumC993030bwr;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    c013c = this.LLILLJJLI;
                    c1677580tky = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C1677480tko<Object, AbstractC1677260tkS> c1677480tko = this.LLILZ;
                c1677480tko.LIZJ.LLILLL = (V) c1677480tko.LIZ.LIZ().invoke(this.LLILZIL);
                C1677480tko<Object, AbstractC1677260tkS> c1677480tko2 = this.LLILZ;
                ((C13FE) c1677480tko2.LJ).setValue(this.LLILZLL.LJFF());
                ((C13FE) this.LLILZ.LIZLLL).setValue(Boolean.TRUE);
                C1677580tky<Object, V> c1677580tky2 = this.LLILZ.LIZJ;
                C1677580tky c1677580tky3 = new C1677580tky(c1677580tky2.LL, c1677580tky2.getValue(), C1677250tkR.LIZ(c1677580tky2.LLILLL), c1677580tky2.LLILZ, Long.MIN_VALUE, c1677580tky2.LLILZLL);
                c013c = new C013C();
                InterfaceC1677860tlQ<Object, AbstractC1677260tkS> interfaceC1677860tlQ = this.LLILZLL;
                long j = this.LLIZ;
                AwS120S0400000_25 awS120S0400000_25 = new AwS120S0400000_25((C1677480tko) this.LLILZ, (C1677480tko<Object, AbstractC1677260tkS>) c1677580tky3, (C1677580tky<Object, AbstractC1677260tkS>) this.LLIZLLLIL, (Function1<? super C1677480tko<Object, AbstractC1677260tkS>, Unit>) c013c, (C013C) 22);
                this.LL = c1677580tky3;
                this.LLILLJJLI = c013c;
                this.LLILLL = 1;
                c1677580tky = c1677580tky3;
                if (C1677810tlL.LIZIZ(c1677580tky, interfaceC1677860tlQ, j, awS120S0400000_25, this) == objLJFF) {
                    return objLJFF;
                }
            }
            if (c013c.element) {
                enumC993030bwr = EnumC993030bwr.BoundReached;
            } else {
                enumC993030bwr = EnumC993030bwr.Finished;
            }
            C1677480tko.LIZIZ(this.LLILZ);
            return new C1677600tl0(c1677580tky, enumC993030bwr);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            C1677480tko.LIZIZ(this.LLILZ);
            throw e;
        }
    }
}
