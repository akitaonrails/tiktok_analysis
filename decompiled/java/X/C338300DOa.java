package X;

import Y.AgS285S0100000_4;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileSchoolViewModel;
import com.ss.android.ugc.ur.school.service.UserCampusService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DOa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileSchoolViewModel$onPrepared$1", f = "EditProfileSchoolViewModel.kt", l = {45, 45}, m = "invokeSuspend")
public final class C338300DOa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EditProfileSchoolViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C338300DOa(EditProfileSchoolViewModel editProfileSchoolViewModel, InterfaceC1364105Vn<? super C338300DOa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = editProfileSchoolViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C338300DOa c338300DOa = new C338300DOa(this.LLILLL, interfaceC1364105Vn);
        c338300DOa.LLILLJJLI = obj;
        return c338300DOa;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EditProfileSchoolViewModel editProfileSchoolViewModel;
        C1C7U.LIZ("EditProfileSchoolViewModel@900f.onPrepared$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                throw new C2197108jB();
            }
            editProfileSchoolViewModel = (EditProfileSchoolViewModel) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            String str = (String) this.LLILLL.LLILLJJLI.getValue();
            if (str != null) {
                editProfileSchoolViewModel = this.LLILLL;
                UserCampusService userCampusService = (UserCampusService) editProfileSchoolViewModel.LL.getValue();
                this.LLILLJJLI = editProfileSchoolViewModel;
                this.LL = 1;
                obj = userCampusService.LJI(str, interfaceC497601wk, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EditProfileSchoolViewModel@900f.onPrepared$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EditProfileSchoolViewModel@900f.onPrepared$1");
                return unit;
            }
        }
        AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(editProfileSchoolViewModel, 37);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (((C01S9) obj).collect(agS285S0100000_4, this) == objLJFF) {
            C1C7U.LIZIZ("EditProfileSchoolViewModel@900f.onPrepared$1");
            return objLJFF;
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
