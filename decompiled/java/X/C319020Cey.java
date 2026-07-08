package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS583S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0Cey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$reloadCurrentConversationHistory$2", f = "MessageViewModel.kt", l = {839}, m = "invokeSuspend")
public final class C319020Cey extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1863380yae LLILLJJLI;
    public final /* synthetic */ MessageViewModel LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319020Cey(C1863380yae c1863380yae, MessageViewModel messageViewModel, long j, int i, String str, InterfaceC1364105Vn<? super C319020Cey> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1863380yae;
        this.LLILLL = messageViewModel;
        this.LLILZ = j;
        this.LLILZIL = i;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319020Cey(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIJJ = obj;
        C1C7U.LIZ("MessageViewModel@9229.reloadCurrentConversationHistory$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJIJJ);
            } else {
                C155000ia.LIZIZ(objLJIJJ);
                C1E8R c1e8r = new C1E8R(new AwS583S0100000_4(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, 5), new AwS583S0100000_4(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, 6));
                C1863380yae c1863380yae = this.LLILLJJLI;
                this.LL = 1;
                objLJIJJ = C1863380yae.LJIJJ(c1863380yae, true, false, false, 2, null, true, c1e8r, this, 41);
                if (objLJIJJ == objLJFF) {
                    C1C7U.LIZIZ("MessageViewModel@9229.reloadCurrentConversationHistory$2");
                    return objLJFF;
                }
            }
            ((Boolean) objLJIJJ).booleanValue();
            this.LLILLL.LLJI.set(false);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MessageViewModel@9229.reloadCurrentConversationHistory$2");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.LLJI.set(false);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
