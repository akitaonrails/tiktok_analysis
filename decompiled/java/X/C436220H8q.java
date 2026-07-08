package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder$refactoredBindVideo$2", f = "SearchVideoHolder.kt", l = {1843}, m = "invokeSuspend")
public final class C436220H8q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchVideoHolder LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ Aweme LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ InterfaceC660500PvU LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436220H8q(SearchVideoHolder searchVideoHolder, String str, int i, Aweme aweme, boolean z, boolean z2, boolean z3, boolean z4, Aweme aweme2, boolean z5, boolean z6, InterfaceC660500PvU interfaceC660500PvU, InterfaceC1364105Vn<? super C436220H8q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchVideoHolder;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = aweme;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = z3;
        this.LLJ = z4;
        this.LLJI = aweme2;
        this.LLJIJIL = z5;
        this.LLJILJIL = z6;
        this.LLJILJILJ = interfaceC660500PvU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436220H8q(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchVideoHolder@6f53.refactoredBindVideo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                String str = (String) ((Function1) this.LLILLJJLI.LLZLI.getValue()).invoke(this.LLILLJJLI.LL);
                C653660PkS c653660PkSL3 = this.LLILLJJLI.l3();
                c653660PkSL3.LJJLI = (Function1) this.LLILLJJLI.LLZLI.getValue();
                if (str != null) {
                    c653660PkSL3.LJIJI = str;
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C659330Ptb c659330Ptb = new C659330Ptb(this.LLILZIL, this.LLILLJJLI, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c659330Ptb) == objLJFF) {
                    C1C7U.LIZIZ("SearchVideoHolder@6f53.refactoredBindVideo$2");
                    return objLJFF;
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchVideoHolder@6f53.refactoredBindVideo$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
