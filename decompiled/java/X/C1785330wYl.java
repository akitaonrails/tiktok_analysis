package X;

import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0wYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel$activateInitialFocusHighlightIfNeeded$2", f = "CreatorRankingPageViewModel.kt", l = {815}, m = "invokeSuspend")
public final class C1785330wYl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreatorRankingPageViewModel LLILLJJLI;
    public final /* synthetic */ C861890XrX LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785330wYl(CreatorRankingPageViewModel creatorRankingPageViewModel, C861890XrX c861890XrX, long j, InterfaceC1364105Vn<? super C1785330wYl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorRankingPageViewModel;
        this.LLILLL = c861890XrX;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1785330wYl(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long l;
        C1C7U.LIZ("CreatorRankingPageViewModel@3458.activateInitialFocusHighlightIfNeeded$2");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.activateInitialFocusHighlightIfNeeded$2");
                return objLJFF;
            }
        }
        CreatorRankingPageViewModel creatorRankingPageViewModel = this.LLILLJJLI;
        C861890XrX c861890XrX = this.LLILLL;
        long j = this.LLILZ;
        C1785460wYy c1785460wYy = (C1785460wYy) creatorRankingPageViewModel.LL.getValue();
        C1785320wYk c1785320wYk = c1785460wYy.LJ;
        if (c1785320wYk != null) {
            C1785310wYj c1785310wYj = c1785320wYk.LIZLLL.LIZJ;
            if (c1785310wYj.LIZLLL && Intrinsics.LJFF(c1785310wYj.LIZ, c861890XrX) && (l = c1785310wYj.LIZIZ) != null && l.longValue() == j) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clearInitialFocusHighlight key=");
                sbLIZ.append(c861890XrX);
                sbLIZ.append(" userId=");
                sbLIZ.append(j);
                C20441214yg.LIZIZ("CreatorRankingPageViewModel", C2188811AlT.LIZIZ(sbLIZ));
                creatorRankingPageViewModel.LL.setValue(C1785460wYy.LIZ(c1785460wYy, null, null, null, null, C1785320wYk.LIZ(c1785320wYk, C1785300wYi.LIZ(c1785320wYk.LIZLLL, null, new C1785310wYj(c1785310wYj.LIZ, c1785310wYj.LIZIZ, c1785310wYj.LIZJ, false), null, 27)), null, 47));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.activateInitialFocusHighlightIfNeeded$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
