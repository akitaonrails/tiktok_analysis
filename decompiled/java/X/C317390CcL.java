package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileAITheaterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileAITheaterViewModel$onPrepared$1", f = "EditProfileAITheaterViewModel.kt", l = {46}, m = "invokeSuspend")
public final class C317390CcL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EditProfileAITheaterViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317390CcL(EditProfileAITheaterViewModel editProfileAITheaterViewModel, InterfaceC1364105Vn<? super C317390CcL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = editProfileAITheaterViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317390CcL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC550750Lir interfaceC550750LirG9;
        InterfaceC346201Wa<InterfaceC549230LgP> interfaceC346201WaLJIIJJI;
        C1C7U.LIZ("EditProfileAITheaterViewModel@2219.onPrepared$1");
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
            this.LLILLJJLI.getClass();
            AITheaterProfileService.LIZ.getClass();
            AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
            if (aITheaterProfileServiceLIZ != null && (interfaceC550750LirG9 = aITheaterProfileServiceLIZ.g9()) != null && (interfaceC346201WaLJIIJJI = interfaceC550750LirG9.LJIIJJI()) != null) {
                AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILLJJLI, 36);
                this.LL = 1;
                if (interfaceC346201WaLJIIJJI.collect(agS285S0100000_4, this) == objLJFF) {
                    C1C7U.LIZIZ("EditProfileAITheaterViewModel@2219.onPrepared$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditProfileAITheaterViewModel@2219.onPrepared$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
