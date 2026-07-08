package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel$onActivityResultDraftSaved$1", f = "FailedReviewViewModel.kt", l = {123, 125}, m = "invokeSuspend")
public final class C315800CZm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FailedReviewViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315800CZm(FailedReviewViewModel failedReviewViewModel, InterfaceC1364105Vn<? super C315800CZm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = failedReviewViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315800CZm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String draftId;
        Object objLJ;
        CKEDraftInfo cKEDraftInfo;
        C1C7U.LIZ("FailedReviewViewModel@9b63.onActivityResultDraftSaved$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FailedReviewViewModel@9b63.onActivityResultDraftSaved$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            objLJ = ((C189200o6) obj).m10unboximpl();
        } else {
            C155000ia.LIZIZ(obj);
            C315940Ca0 c315940Ca0 = (C315940Ca0) this.LLILLJJLI.LLJILJIL.getValue();
            if (c315940Ca0 != null && (cKEDraftInfo = c315940Ca0.LIZ) != null) {
                draftId = cKEDraftInfo.getDraftId();
            } else {
                draftId = null;
            }
            C315810CZn c315810CZn = new C315810CZn(draftId);
            C315860CZs c315860CZs = this.LLILLJJLI.LLILLJJLI;
            this.LL = 1;
            objLJ = c315860CZs.LJ(c315810CZn, this);
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("FailedReviewViewModel@9b63.onActivityResultDraftSaved$1");
                return objLJFF;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDraftResult = ");
        sbLIZ.append((Object) C189200o6.m9toStringimpl(objLJ));
        C318790Ceb.LIZ("FailedReviewViewModel", C2188811AlT.LIZIZ(sbLIZ));
        C2252331DDr c2252331DDr = this.LLILLJJLI.LLIZLLLIL;
        Unit unit2 = Unit.LIZ;
        this.LL = 2;
        if (c2252331DDr.emit(unit2, this) == objLJFF) {
            C1C7U.LIZIZ("FailedReviewViewModel@9b63.onActivityResultDraftSaved$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("FailedReviewViewModel@9b63.onActivityResultDraftSaved$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
