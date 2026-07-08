package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HO7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel$startObservingTaskStatus$1", f = "MixStudioBaseViewModel.kt", l = {185}, m = "invokeSuspend")
public final class C0HO7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MixStudioBaseViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HO7(MixStudioBaseViewModel mixStudioBaseViewModel, InterfaceC1364105Vn<? super C0HO7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = mixStudioBaseViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HO7 c0ho7 = new C0HO7(this.LLILLL, interfaceC1364105Vn);
        c0ho7.LLILLJJLI = obj;
        return c0ho7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioBaseViewModel@9c39.startObservingTaskStatus$1");
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
            MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) this.LLILLL.LLILLJJLI.getValue();
            if (mixStudioStatusRepository == null) {
                this.LLILLL.xQ2(EnumC440890HQp.HOME_ERROR);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.startObservingTaskStatus$1");
                return unit;
            }
            C013C c013c = new C013C();
            c013c.element = true;
            C414301jJ c414301jJ = new C414301jJ(mixStudioStatusRepository.getTaskStatus(), mixStudioStatusRepository.LJFF(), new C0HO8(null));
            C440490HPb c440490HPb = new C440490HPb(c013c, this.LLILLL, null);
            this.LL = 1;
            if (C09IC.LJII(c414301jJ, this, c440490HPb) == objLJFF) {
                C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.startObservingTaskStatus$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.startObservingTaskStatus$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
