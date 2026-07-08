package X;

import Y.AgS18S1400000_9;
import com.bytedance.mota.storage.motacache.IMotaCache;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O5T, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.state.base.OperationalStateAgent$motaRequest$2", f = "OperationalStateAgent.kt", l = {104}, m = "invokeSuspend")
public final class C0O5T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    /* JADX INFO: Incorrect field signature: TM; */
    public final /* synthetic */ InterfaceC613720O5i LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C613690O5f LLILZ;

    /* JADX INFO: Incorrect field signature: TD; */
    public final /* synthetic */ C0O3E LLILZIL;
    public final /* synthetic */ Function1<C613670O5d<D>, C613670O5d<D>> LLILZLL;
    public final /* synthetic */ InterfaceC1631620sYq<String, C0O3E, Boolean, List<IMotaCache>> LLIZ;
    public final /* synthetic */ Function2<String, Throwable, Unit> LLIZLLLIL;
    public final /* synthetic */ C0O5V<S> LLJ;
    public final /* synthetic */ Function2<String, Throwable, Unit> LLJI;
    public final /* synthetic */ Function2<String, Boolean, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TM;Ljava/lang/String;LX/0O5f;TD;Lkotlin/jvm/functions/Function1<-LX/0O5d<TD;>;LX/0O5d<TD;>;>;LX/0sYq<-Ljava/lang/String;-LX/0O3E;-Ljava/lang/Boolean;+Ljava/util/List<+Lcom/bytedance/mota/storage/motacache/IMotaCache;>;>;Lkotlin/jvm/functions/Function2<-Ljava/lang/String;-Ljava/lang/Throwable;Lkotlin/Unit;>;LX/0O5V<TS;>;Lkotlin/jvm/functions/Function2<-Ljava/lang/String;-Ljava/lang/Throwable;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function2<-Ljava/lang/String;-Ljava/lang/Boolean;Lkotlin/Unit;>;LX/05Vn<-LX/0O5T;>;)V */
    public C0O5T(InterfaceC613720O5i interfaceC613720O5i, String str, C613690O5f c613690O5f, C0O3E c0o3e, Function1 function1, InterfaceC1631620sYq interfaceC1631620sYq, Function2 function2, C0O5V c0o5v, Function2 function22, Function2 function23, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC613720O5i;
        this.LLILLL = str;
        this.LLILZ = c613690O5f;
        this.LLILZIL = c0o3e;
        this.LLILZLL = function1;
        this.LLIZ = interfaceC1631620sYq;
        this.LLIZLLLIL = function2;
        this.LLJ = c0o5v;
        this.LLJI = function22;
        this.LLJIJIL = function23;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O5T(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OperationalStateAgent@2972.motaRequest$2");
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
            C613960O6g c613960O6gLIZ = C613940O6e.LIZ().LIZ(this.LLILLJJLI);
            final String str = this.LLILLL;
            C0O7F.LIZ(c613960O6gLIZ, new AbstractC614210O7f(str) { // from class: X.0O7a
                public final String LIZIZ;
                public final C614260O7k LIZJ;

                @Override // X.InterfaceC614350O7t
                public final String LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.AbstractC614210O7f
                public final AbstractC614250O7j LIZIZ() {
                    return this.LIZJ;
                }

                {
                    this.LIZIZ = str;
                    C614260O7k c614260O7k = C614260O7k.LIZIZ;
                    c614260O7k.LIZ = C614270O7l.LIZIZ.LIZ | c614260O7k.LIZ;
                    this.LIZJ = c614260O7k;
                }
            });
            C613690O5f c613690O5f = this.LLILZ;
            C0O3E c0o3e = this.LLILZIL;
            final Function1<C613670O5d<D>, C613670O5d<D>> function1 = this.LLILZLL;
            if (c613690O5f != null) {
                C0O7F.LJII(c613960O6gLIZ, c613690O5f);
            }
            if (c0o3e != null) {
                C0O7F.LJFF(c613960O6gLIZ, c0o3e);
            }
            if (function1 != 0) {
                C0O7F.LJ(c613960O6gLIZ, new InterfaceC613660O5c<D>() { // from class: X.0O5U
                    @Override // X.InterfaceC613660O5c
                    public final C613670O5d<D> LIZ(C613670O5d<D> c613670O5d) {
                        return function1.invoke(c613670O5d);
                    }
                });
            }
            C20099713kh c20099713khLJJIJL = C09IC.LJJIJL(c613960O6gLIZ.LIZIZ(), 2);
            AgS18S1400000_9 agS18S1400000_9 = new AgS18S1400000_9(this.LLIZLLLIL, this.LLILLL, this.LLJ, this.LLJI, this.LLJIJIL, 1);
            this.LL = 1;
            if (c20099713khLJJIJL.collect(agS18S1400000_9, this) == objLJFF) {
                C1C7U.LIZIZ("OperationalStateAgent@2972.motaRequest$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OperationalStateAgent@2972.motaRequest$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
