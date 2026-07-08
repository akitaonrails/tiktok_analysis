package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileAITheaterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileAITheaterViewModel$refreshCameoInfo$1", f = "EditProfileAITheaterViewModel.kt", l = {61, 68}, m = "invokeSuspend")
public final class C317380CcK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ EditProfileAITheaterViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317380CcK(EditProfileAITheaterViewModel editProfileAITheaterViewModel, InterfaceC1364105Vn<? super C317380CcK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = editProfileAITheaterViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317380CcK(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String currentUserID;
        InterfaceC550750Lir interfaceC550750LirG9;
        Object objLJIILIIL;
        C1C7U.LIZ("EditProfileAITheaterViewModel@2219.refreshCameoInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    objLJIILIIL = this.LL;
                    C155000ia.LIZIZ(obj);
                    C189200o6.m1boximpl(objLJIILIIL);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EditProfileAITheaterViewModel@2219.refreshCameoInfo$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            objLJIILIIL = ((C189200o6) obj).m10unboximpl();
        } else {
            C155000ia.LIZIZ(obj);
            IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if (iUserService != null && (currentUserID = iUserService.getCurrentUserID()) != null) {
                this.LLILLL.getClass();
                AITheaterProfileService.LIZ.getClass();
                AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
                if (aITheaterProfileServiceLIZ != null && (interfaceC550750LirG9 = aITheaterProfileServiceLIZ.g9()) != null) {
                    InterfaceC497601wk assemVMScope = this.LLILLL.getAssemVMScope();
                    this.LLILLJJLI = 1;
                    objLJIILIIL = interfaceC550750LirG9.LJIILIIL(currentUserID, true, assemVMScope, this);
                    if (objLJIILIIL == objLJFF) {
                        C1C7U.LIZIZ("EditProfileAITheaterViewModel@2219.refreshCameoInfo$1");
                        return objLJFF;
                    }
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("EditProfileAITheaterViewModel@2219.refreshCameoInfo$1");
                return unit2;
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("EditProfileAITheaterViewModel@2219.refreshCameoInfo$1");
            return unit3;
        }
        EditProfileAITheaterViewModel editProfileAITheaterViewModel = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(objLJIILIIL) && !((Boolean) objLJIILIIL).booleanValue()) {
            editProfileAITheaterViewModel.LL.getValue();
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLJIILIIL);
        if (thM5exceptionOrNullimpl != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C437901n7 c437901n7 = new C437901n7(thM5exceptionOrNullimpl, null);
            this.LL = objLJIILIIL;
            this.LLILLJJLI = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c437901n7) == objLJFF) {
                C1C7U.LIZIZ("EditProfileAITheaterViewModel@2219.refreshCameoInfo$1");
                return objLJFF;
            }
        }
        C189200o6.m1boximpl(objLJIILIIL);
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("EditProfileAITheaterViewModel@2219.refreshCameoInfo$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
