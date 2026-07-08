package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lk8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder$queryAwemeDraft$2", f = "DraftBoxTaskItemViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C551540Lk8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft>, Object> {
    public final /* synthetic */ DraftBoxTaskItemViewHolder LL;
    public final /* synthetic */ C0M0P LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C551540Lk8(DraftBoxTaskItemViewHolder draftBoxTaskItemViewHolder, C0M0P c0m0p, InterfaceC1364105Vn<? super C551540Lk8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftBoxTaskItemViewHolder;
        this.LLILLJJLI = c0m0p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C551540Lk8(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxTaskItemViewHolder@8ae8.queryAwemeDraft$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwemeDraft awemeDraftLJ = this.LL.R5().LJ(this.LLILLJJLI.LJ);
        C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.queryAwemeDraft$2");
        return awemeDraftLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
