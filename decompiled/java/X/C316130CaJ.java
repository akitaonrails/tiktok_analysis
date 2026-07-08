package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData;
import com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CaJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel$editClick$1", f = "FailedReviewViewModel.kt", l = {207, 209, 211}, m = "invokeSuspend")
public final class C316130CaJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FailedReviewViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316130CaJ(FailedReviewViewModel failedReviewViewModel, InterfaceC1364105Vn<? super C316130CaJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = failedReviewViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316130CaJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        CKEDraftInfo cKEDraftInfo;
        String str3;
        C1C7U.LIZ("FailedReviewViewModel@9b63.editClick$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FailedReviewViewModel@9b63.editClick$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            FailedReviewViewModel failedReviewViewModel = this.LLILLJJLI;
            FailedReviewPageInitData failedReviewPageInitData = failedReviewViewModel.LL;
            if (failedReviewPageInitData != null && failedReviewPageInitData.effectSource == 1) {
                C2252331DDr c2252331DDr = failedReviewViewModel.LLJJI;
                Integer numLJ = C2286608xc.LJ(2131850941);
                this.LL = 1;
                if (c2252331DDr.emit(numLJ, this) == objLJFF) {
                    C1C7U.LIZIZ("FailedReviewViewModel@9b63.editClick$1");
                    return objLJFF;
                }
            } else {
                C2252331DDr c2252331DDr2 = failedReviewViewModel.LLJILJILJ;
                C1737170vJ5 c1737170vJ5 = new C1737170vJ5();
                c1737170vJ5.LIZIZ = "personal_homepage";
                c1737170vJ5.LJFF = "prop_personal_homepage_reject";
                c1737170vJ5.LIZJ = "personal_homepage";
                c1737170vJ5.LIZLLL = "ame_editor";
                c1737170vJ5.LJ = C0DMI.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                String str4 = "";
                sbLIZ.append("");
                sbLIZ.append(4);
                c1737170vJ5.LJIIZILJ = C2188811AlT.LIZIZ(sbLIZ);
                C315940Ca0 c315940Ca0 = (C315940Ca0) failedReviewViewModel.LLJILJIL.getValue();
                CKEDraftInfo cKEDraftInfo2 = null;
                if (c315940Ca0 != null) {
                    cKEDraftInfo2 = c315940Ca0.LIZ;
                }
                c1737170vJ5.LJIIIIZZ = cKEDraftInfo2;
                C315940Ca0 c315940Ca02 = (C315940Ca0) failedReviewViewModel.LLJILJIL.getValue();
                if (c315940Ca02 == null || (str = c315940Ca02.LIZIZ) == null) {
                    str = "";
                }
                c1737170vJ5.LJIILL = str;
                C315940Ca0 c315940Ca03 = (C315940Ca0) failedReviewViewModel.LLJILJIL.getValue();
                if (c315940Ca03 == null || (str2 = c315940Ca03.LIZJ) == null) {
                    str2 = "";
                }
                c1737170vJ5.LJIILJJIL = str2;
                FailedReviewPageInitData failedReviewPageInitData2 = failedReviewViewModel.LL;
                if (failedReviewPageInitData2 != null && (str3 = failedReviewPageInitData2.effectId) != null) {
                    str4 = str3;
                }
                c1737170vJ5.LJIILLIIL = str4;
                C315940Ca0 c315940Ca04 = (C315940Ca0) failedReviewViewModel.LLJILJIL.getValue();
                if (c315940Ca04 != null && (cKEDraftInfo = c315940Ca04.LIZ) != null && cKEDraftInfo.isAigcEffect()) {
                    c1737170vJ5.LJI = "ame_aigc_draft";
                }
                this.LL = 2;
                if (c2252331DDr2.emit(c1737170vJ5, this) == objLJFF) {
                    C1C7U.LIZIZ("FailedReviewViewModel@9b63.editClick$1");
                    return objLJFF;
                }
            }
        }
        C2252321DDq c2252321DDq = this.LLILLJJLI.LLJI;
        C1683930tvD c1683930tvDLIZ = C1683930tvD.LIZ((C1683930tvD) c2252321DDq.getValue(), false);
        this.LL = 3;
        c2252321DDq.setValue(c1683930tvDLIZ);
        if (Unit.LIZ == objLJFF) {
            C1C7U.LIZIZ("FailedReviewViewModel@9b63.editClick$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FailedReviewViewModel@9b63.editClick$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
