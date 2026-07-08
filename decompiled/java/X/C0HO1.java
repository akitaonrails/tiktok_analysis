package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HO1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageViewModel$onPrepared$1", f = "MixStudioHomePageViewModel.kt", l = {226}, m = "invokeSuspend")
public final class C0HO1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioStatusRepository LLILLJJLI;
    public final /* synthetic */ MixStudioHomePageViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HO1(MixStudioStatusRepository mixStudioStatusRepository, MixStudioHomePageViewModel mixStudioHomePageViewModel, InterfaceC1364105Vn<? super C0HO1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioStatusRepository;
        this.LLILLL = mixStudioHomePageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HO1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioHomePageViewModel@b729.onPrepared$1");
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
            C05YD<AbstractC440540HPg> taskStatus = this.LLILLJJLI.getTaskStatus();
            C05YD<List<C440830HQj>> c05ydLJFF = this.LLILLJJLI.LJFF();
            InterfaceC346201Wa c516501zn = (InterfaceC346201Wa) this.LLILLL.LLILZ.getValue();
            if (c516501zn == null) {
                c516501zn = new C516501zn(new C437560HDu(null, 1023), 1);
            }
            C515901zh c515901zhLJIIIIZZ = C09IC.LJIIIIZZ(taskStatus, c05ydLJFF, c516501zn, new C0HO2(this.LLILLJJLI, null));
            AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 92);
            this.LL = 1;
            if (c515901zhLJIIIIZZ.collect(agS287S0100000_6, this) == objLJFF) {
                C1C7U.LIZIZ("MixStudioHomePageViewModel@b729.onPrepared$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioHomePageViewModel@b729.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
