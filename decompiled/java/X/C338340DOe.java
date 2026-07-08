package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SearchSchoolMembersAssem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SearchSchoolMembersViewModel;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import njp.a;

/* JADX INFO: renamed from: X.0DOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SearchSchoolMembersAssem$onCreateView$2$2$1", f = "SearchSchoolMembersAssem.kt", l = {117}, m = "invokeSuspend")
public final class C338340DOe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchSchoolMembersAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C338340DOe(SearchSchoolMembersAssem searchSchoolMembersAssem, InterfaceC1364105Vn<? super C338340DOe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchSchoolMembersAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C338340DOe(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C20600815jK<InterfaceC1891350zJl> state;
        C1C7U.LIZ("SearchSchoolMembersAssem@f4f6.onCreateView$2$2$1");
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
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLJJJJJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SearchSchoolMembersAssem.LLJLIL;
            CampusFlowViewModel campusFlowViewModel = (CampusFlowViewModel) assemVMLazy.getValue();
            this.LL = 1;
            if (campusFlowViewModel.DQ2(this) == objLJFF) {
                C1C7U.LIZIZ("SearchSchoolMembersAssem@f4f6.onCreateView$2$2$1");
                return objLJFF;
            }
        }
        C0ZP4 c0zp4 = this.LLILLJJLI.LLJJJJLIIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        SearchSchoolMembersAssem searchSchoolMembersAssem = this.LLILLJJLI;
        searchSchoolMembersAssem.LLJJJJLIIL = null;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = searchSchoolMembersAssem.LLJJJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJFF(null);
        }
        SearchSchoolMembersViewModel searchSchoolMembersViewModelIp = this.LLILLJJLI.ip();
        C11JF c11jf = searchSchoolMembersViewModelIp.LL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        searchSchoolMembersViewModelIp.setState(AFwS232S0000000_4.get$arr$(166));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchSchoolMembersAssem@f4f6.onCreateView$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
