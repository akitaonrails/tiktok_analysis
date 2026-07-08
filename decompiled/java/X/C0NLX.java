package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NLX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hometab.base.tabicon.time.TabIconTimeChecker$submitCountdownTask$1$job$1", f = "TabIconTimeChecker.kt", l = {BaseNotice.CREATOR, 64}, m = "invokeSuspend")
public final class C0NLX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C0NLU LLILLL;
    public final /* synthetic */ C592350NLd LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NLX(long j, C0NLU c0nlu, C592350NLd c592350NLd, InterfaceC1364105Vn<? super C0NLX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c0nlu;
        this.LLILZ = c592350NLd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NLX(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabIconTimeChecker@3388.submitCountdownTask$1$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILLL.LIZLLL.remove(this.LLILZ.LIZIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TabIconTimeChecker@3388.submitCountdownTask$1$job$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("TabIconTimeChecker@3388.submitCountdownTask$1$job$1");
                return objLJFF;
            }
        }
        C0NLU c0nlu = this.LLILLL;
        C592330NLb c592330NLb = this.LLILZ.LIZ;
        this.LL = 2;
        if (c0nlu.LIZJ(c592330NLb, this) == objLJFF) {
            C1C7U.LIZIZ("TabIconTimeChecker@3388.submitCountdownTask$1$job$1");
            return objLJFF;
        }
        this.LLILLL.LIZLLL.remove(this.LLILZ.LIZIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TabIconTimeChecker@3388.submitCountdownTask$1$job$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
