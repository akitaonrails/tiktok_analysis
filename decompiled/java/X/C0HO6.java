package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HO6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel$onPrepared$1", f = "MixStudioBaseViewModel.kt", l = {155, 164}, m = "invokeSuspend")
public final class C0HO6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MixStudioBaseViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HO6(MixStudioBaseViewModel mixStudioBaseViewModel, InterfaceC1364105Vn<? super C0HO6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = mixStudioBaseViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HO6 c0ho6 = new C0HO6(this.LLILLL, interfaceC1364105Vn);
        c0ho6.LLILLJJLI = obj;
        return c0ho6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MixStudioStatusRepository mixStudioStatusRepository;
        C1C7U.LIZ("MixStudioBaseViewModel@9c39.onPrepared$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.onPrepared$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mixStudioStatusRepository = (MixStudioStatusRepository) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            mixStudioStatusRepository = (MixStudioStatusRepository) this.LLILLL.LLILLJJLI.getValue();
            if (mixStudioStatusRepository == null) {
                this.LLILLL.xQ2(EnumC440890HQp.HOME_ERROR);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.onPrepared$1");
                return unit2;
            }
            MixStudioBaseViewModel mixStudioBaseViewModel = this.LLILLL;
            AbstractC440540HPg value = mixStudioStatusRepository.getTaskStatus().getValue();
            int size = mixStudioStatusRepository.LJFF().getValue().size();
            this.LLILLJJLI = mixStudioStatusRepository;
            this.LL = 1;
            if (mixStudioBaseViewModel.yQ2(value, size, true, this) == objLJFF) {
                C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.onPrepared$1");
                return objLJFF;
            }
        }
        if (!this.LLILLL.LLILZIL.compareAndSet(false, true)) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.onPrepared$1");
            return unit3;
        }
        C1629806Zs c1629806Zs = new C1629806Zs(new C414301jJ(mixStudioStatusRepository.getTaskStatus(), mixStudioStatusRepository.LJFF(), new C0HO4(null)));
        C0HO5 c0ho5 = new C0HO5(this.LLILLL, null);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (C09IC.LJII(c1629806Zs, this, c0ho5) == objLJFF) {
            C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.onPrepared$1");
            return objLJFF;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.onPrepared$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
