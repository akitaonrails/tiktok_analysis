package X;

import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0wYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel$firstTabRenderFlow$1", f = "CreatorRankingPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1785450wYx extends C09AX implements InterfaceC1631630sYr<C1785480wZ0, C1785470wYz, InterfaceC1781190wS5, InterfaceC1364105Vn<? super C1785510wZ3>, Object> {
    public /* synthetic */ C1785480wZ0 LL;
    public /* synthetic */ C1785470wYz LLILLJJLI;
    public /* synthetic */ InterfaceC1781190wS5 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ CreatorRankingPageViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785450wYx(int i, CreatorRankingPageViewModel creatorRankingPageViewModel, InterfaceC1364105Vn<? super C1785450wYx> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILZ = i;
        this.LLILZIL = creatorRankingPageViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1785300wYi c1785300wYi;
        C1777910wMn c1777910wMn;
        C1C7U.LIZ("CreatorRankingPageViewModel@3458.firstTabRenderFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1785480wZ0 c1785480wZ0 = this.LL;
        C1785470wYz c1785470wYz = this.LLILLJJLI;
        InterfaceC1781190wS5 interfaceC1781190wS5 = this.LLILLL;
        C1779500wPM c1779500wPM = (C1779500wPM) C13LP.LJJJLZIJ(c1785480wZ0.LIZIZ, c1785480wZ0.LIZ);
        C1785510wZ3 c1785510wZ3 = null;
        c1777410wLz = null;
        c1777410wLz = null;
        C1777410wLz c1777410wLz = null;
        c1785510wZ3 = null;
        if (c1779500wPM != null) {
            numLJ = C2286608xc.LJ(c1779500wPM.LIZ);
        } else {
            numLJ = null;
        }
        int i = this.LLILZ;
        if (numLJ != null && numLJ.intValue() == i) {
            C1785320wYk c1785320wYk = ((C1785460wYy) this.LLILZIL.LLILLJJLI.getValue()).LJ;
            if (c1785320wYk != null && (c1785300wYi = c1785320wYk.LIZLLL) != null && (c1777910wMn = c1785300wYi.LJ) != null) {
                c1777410wLz = c1777910wMn.LIZJ;
            }
            c1785510wZ3 = new C1785510wZ3(c1785470wYz, interfaceC1781190wS5, c1777410wLz);
        }
        C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.firstTabRenderFlow$1");
        return c1785510wZ3;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(C1785480wZ0 c1785480wZ0, C1785470wYz c1785470wYz, InterfaceC1781190wS5 interfaceC1781190wS5, InterfaceC1364105Vn<? super C1785510wZ3> interfaceC1364105Vn) {
        C1785450wYx c1785450wYx = new C1785450wYx(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1785450wYx.LL = c1785480wZ0;
        c1785450wYx.LLILLJJLI = c1785470wYz;
        c1785450wYx.LLILLL = interfaceC1781190wS5;
        return c1785450wYx.invokeSuspend(Unit.LIZ);
    }
}
