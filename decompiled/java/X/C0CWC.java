package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.EntityIntro;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$fetchEntityWordInfo$1", f = "MessageViewModel.kt", l = {4073}, m = "invokeSuspend")
public final class C0CWC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function1<TakoSug, Unit> LLILZLL;
    public final /* synthetic */ Function1<EntityIntro, Unit> LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0CWC(MessageViewModel messageViewModel, long j, String str, String str2, Function1<? super TakoSug, Unit> function1, Function1<? super EntityIntro, Unit> function12, Integer num, InterfaceC1364105Vn<? super C0CWC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
        this.LLILLL = j;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = function1;
        this.LLIZ = function12;
        this.LLIZLLLIL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CWC(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageViewModel@9229.fetchEntityWordInfo$1");
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
            C1863380yae c1863380yae = this.LLILLJJLI.LLJJJJ;
            if (c1863380yae != null) {
                long j = this.LLILLL;
                String str = this.LLILZ;
                String str2 = this.LLILZIL;
                Function1<TakoSug, Unit> function1 = this.LLILZLL;
                Function1<EntityIntro, Unit> function12 = this.LLIZ;
                Integer num = this.LLIZLLLIL;
                this.LL = 1;
                if (c1863380yae.LJIIJJI(j, str, str2, function1, function12, num, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageViewModel@9229.fetchEntityWordInfo$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.fetchEntityWordInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
