package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import njp.a;

/* JADX INFO: renamed from: X.09XV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$updatePostedDraftEntrance$2", f = "DraftViewModel.kt", l = {}, m = "invokeSuspend")
public final class C09XV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C553680Lna LL;
    public final /* synthetic */ DraftViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09XV(C553680Lna c553680Lna, DraftViewModel draftViewModel, InterfaceC1364105Vn<? super C09XV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c553680Lna;
        this.LLILLJJLI = draftViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09XV(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftViewModel@38a5.updatePostedDraftEntrance$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C553680Lna c553680Lna = this.LL;
        int i = c553680Lna.LIZ;
        AwemeDraft awemeDraft = c553680Lna.LIZIZ;
        if (awemeDraft == null) {
            if (ListProtector.get(this.LLILLJJLI.LLILZ, 1) instanceof C0M3P) {
                C19719612Di.LJJIIJ(this.LLILLJJLI.LLILZ, AFwS231S0000000_3.get$arr$(265), true);
                if (this.LLILLJJLI.DQ2()) {
                    ((ArrayList) this.LLILLJJLI.LLILZ).clear();
                }
                DraftViewModel draftViewModel = this.LLILLJJLI;
                draftViewModel.LLJLIL.LJIIJ(draftViewModel.LLILZ);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftViewModel@38a5.updatePostedDraftEntrance$2");
            return unit;
        }
        String strLIZ = awemeDraft.LIZ();
        String str = awemeDraft.LJJJJIZL.videoCoverPath;
        if (str == null) {
            str = "";
        }
        C0M3P c0m3p = new C0M3P(strLIZ, str, i);
        if (!(ListProtector.get(this.LLILLJJLI.LLILZ, 1) instanceof C0M3P)) {
            ListProtector.add(this.LLILLJJLI.LLILZ, 1, c0m3p);
        } else {
            ListProtector.set(this.LLILLJJLI.LLILZ, 1, c0m3p);
        }
        DraftViewModel draftViewModel2 = this.LLILLJJLI;
        draftViewModel2.LLJLIL.LJIIJ(draftViewModel2.LLILZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftViewModel@38a5.updatePostedDraftEntrance$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
