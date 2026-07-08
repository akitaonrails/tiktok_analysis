package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.profile.business.ur.school.addschool.SelectSchoolPageAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0CxC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.addschool.SelectSchoolPageAssem$onViewCreated$2", f = "SelectSchoolPageAssem.kt", l = {289}, m = "invokeSuspend")
public final class C330320CxC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SelectSchoolPageAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330320CxC(SelectSchoolPageAssem selectSchoolPageAssem, InterfaceC1364105Vn<? super C330320CxC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = selectSchoolPageAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330320CxC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectSchoolPageAssem@2721.onViewCreated$2");
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
            SelectSchoolPageAssem selectSchoolPageAssem = this.LLILLJJLI;
            AssemVMLazy assemVMLazy = selectSchoolPageAssem.LLJJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SelectSchoolPageAssem.LLLJ;
            AssemViewModel value = assemVMLazy.getValue();
            C330330CxD c330330CxD = new C2217381BqS() { // from class: X.0CxD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    C326320Cqk c326320Cqk = (C326320Cqk) obj2;
                    c326320Cqk.getClass();
                    return C627260Oiy.LIZLLL(c326320Cqk);
                }
            };
            C330280Cx8 c330280Cx8 = new C2217381BqS() { // from class: X.0Cx8
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C326320Cqk) obj2).LL;
                }
            };
            C330340CxE c330340CxE = new C2217381BqS() { // from class: X.0CxE
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    C326320Cqk c326320Cqk = (C326320Cqk) obj2;
                    c326320Cqk.getClass();
                    return C627260Oiy.LIZ(c326320Cqk);
                }
            };
            C1770850wBP c1770850wBP = new C1770850wBP();
            c1770850wBP.LIZIZ = AFwS287S0000000_4.get$arr$(20);
            b bVarLJ = C09IC.LJ(new C1205630hTl(selectSchoolPageAssem, value, c330330CxD, c330280Cx8, c330340CxE, c1770850wBP, null));
            C330260Cx6 c330260Cx6 = new C330260Cx6(this.LLILLJJLI, null);
            this.LL = 1;
            if (C09IC.LJII(bVarLJ, this, c330260Cx6) == objLJFF) {
                C1C7U.LIZIZ("SelectSchoolPageAssem@2721.onViewCreated$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SelectSchoolPageAssem@2721.onViewCreated$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
