package X;

import android.view.View;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.DraftMigrateState;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Lne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder$onBind$3$1", f = "DraftBoxTaskItemViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C553720Lne extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftBoxTaskItemViewHolder LL;
    public final /* synthetic */ AwemeDraft LLILLJJLI;
    public final /* synthetic */ DraftMigrateState LLILLL;
    public final /* synthetic */ C0M0P LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553720Lne(DraftBoxTaskItemViewHolder draftBoxTaskItemViewHolder, AwemeDraft awemeDraft, DraftMigrateState draftMigrateState, C0M0P c0m0p, InterfaceC1364105Vn<? super C553720Lne> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftBoxTaskItemViewHolder;
        this.LLILLJJLI = awemeDraft;
        this.LLILLL = draftMigrateState;
        this.LLILZ = c0m0p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C553720Lne(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxTaskItemViewHolder@8ae8.onBind$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (Intrinsics.LJFF(this.LL.u6().getTag(R.id.g56), this.LLILLJJLI.LIZ())) {
            if (!this.LL.c6(this.LLILLL)) {
                View viewE6 = this.LL.e6();
                if (viewE6 != null) {
                    C786410Ut5.LJLLLLLL(8, viewE6);
                }
                C0M0H c0m0h = C0M0H.LIZ;
                AwemeDraft awemeDraft = this.LLILLJJLI;
                c0m0h.getClass();
                int iLIZ = C0M0H.LIZ(awemeDraft);
                this.LLILZ.LJIJ = C2286608xc.LJ(iLIZ);
                this.LLILZ.LJJIFFI = C0M0H.LIZIZ(this.LLILLJJLI);
                this.LLILZ.LJJI = false;
                View viewE62 = this.LL.e6();
                if (viewE62 != null) {
                    viewE62.setTag(R.id.g57, false);
                }
                Boolean.valueOf(this.LL.d6(this.LLILZ));
            } else {
                C0M0P c0m0p = this.LLILZ;
                c0m0p.LJJI = true;
                c0m0p.LJJIFFI = false;
                View viewE63 = this.LL.e6();
                if (viewE63 != null) {
                    viewE63.setTag(R.id.g57, true);
                }
                View viewE64 = this.LL.e6();
                if (viewE64 != null) {
                    C786410Ut5.LJLLLLLL(0, viewE64);
                }
                C786410Ut5.LJLLLLLL(8, this.LL.q6());
                View view = (View) this.LL.LLJJJIL.getValue();
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                this.LLILZ.LJIJ = C2286608xc.LJ(0);
            }
        }
        C561130Lzb c561130LzbR5 = this.LL.R5();
        C0M0P c0m0p2 = this.LLILZ;
        c561130LzbR5.LIZIZ(c0m0p2.LJ, c0m0p2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.onBind$3$1");
        return unit;
    }
}
