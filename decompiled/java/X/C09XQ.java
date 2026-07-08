package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09XQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$updateSticker$draft$1", f = "DraftViewModel.kt", l = {}, m = "invokeSuspend")
public final class C09XQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft>, Object> {
    public final /* synthetic */ DraftViewModel LL;
    public final /* synthetic */ C0M0P LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09XQ(DraftViewModel draftViewModel, C0M0P c0m0p, InterfaceC1364105Vn<? super C09XQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftViewModel;
        this.LLILLJJLI = c0m0p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09XQ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftViewModel@38a5.updateSticker$draft$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwemeDraft awemeDraftLIZ = this.LL.LLJIJIL.LIZ(this.LLILLJJLI.LJ);
        C1C7U.LIZIZ("DraftViewModel@38a5.updateSticker$draft$1");
        return awemeDraftLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
