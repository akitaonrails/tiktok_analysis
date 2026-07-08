package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lnf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder$queryAwemeDraft$2", f = "DraftBoxNormalItemViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C553730Lnf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft>, Object> {
    public final /* synthetic */ DraftBoxNormalItemViewHolder LL;
    public final /* synthetic */ C0M0P LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553730Lnf(DraftBoxNormalItemViewHolder draftBoxNormalItemViewHolder, C0M0P c0m0p, InterfaceC1364105Vn<? super C553730Lnf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftBoxNormalItemViewHolder;
        this.LLILLJJLI = c0m0p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C553730Lnf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxNormalItemViewHolder@feeb.queryAwemeDraft$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwemeDraft awemeDraftLJ = this.LL.R5().LJ(this.LLILLJJLI.LJ);
        C1C7U.LIZIZ("DraftBoxNormalItemViewHolder@feeb.queryAwemeDraft$2");
        return awemeDraftLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
