package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0lPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1356940lPo {
    public final C1356950lPp LL;
    public String LLILLJJLI = "";
    public Aweme LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final C1356990lPt LLILZLL;

    public abstract boolean LIZJ();

    public abstract void LIZLLL(InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn, C331340Cyq c331340Cyq);

    public abstract void LJ(InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn);

    public abstract void LJI();

    public abstract boolean LJII();

    public void LIZIZ() {
        this.LLILLJJLI = "";
        this.LLILZIL = false;
        C1356950lPp c1356950lPp = this.LL;
        c1356950lPp.LJJIIZI();
        c1356950lPp.LLJLIL = -1;
        c1356950lPp.LLJL = c1356950lPp.getFirstDataPositionInState();
        c1356950lPp.LLJLILLLLZIIL = false;
        c1356950lPp.LLIZ = false;
        C786410Ut5.t(c1356950lPp, 4);
        c1356950lPp.LJJIJIIJIL();
        c1356950lPp.scrollToPosition(0);
        c1356950lPp.LLJJIJIIJIL = null;
        c1356950lPp.getState().LJFF(null);
        c1356950lPp.LLJ.clear();
        c1356950lPp.LLJJJIL = false;
        c1356950lPp.LJJIJ();
    }

    public final void LJFF() {
        LIZIZ();
        Aweme aweme = this.LLILLL;
        if (aweme != null) {
            LIZ(aweme);
        }
    }

    public void LIZ(Aweme aweme) {
        InterfaceC1361890lXn<C331340Cyq> operator;
        this.LLILLJJLI = aweme.getAid();
        if (this.LL.getState().LJIIIIZZ() > 0) {
            C786410Ut5.t(this.LL, 0);
        }
        this.LLILZIL = true;
        C1356990lPt c1356990lPt = this.LLILZLL;
        if (c1356990lPt != null && (operator = c1356990lPt.getOperator()) != null) {
            operator.refresh();
        }
        this.LLILLL = aweme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Cw3, X.0lPt] */
    public AbstractC1356940lPo(C1356950lPp c1356950lPp, boolean z) {
        this.LL = c1356950lPp;
        if (z) {
            final C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZ = 10;
            c20603715jn.LIZJ = false;
            ?? r0 = new AbstractC329610Cw3<C331340Cyq>(c20603715jn) { // from class: X.0lPt
                @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
                public final void onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn) {
                    this.LIZIZ.LJ(interfaceC1364105Vn);
                }

                @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
                public final void onLoadMore(InterfaceC1364105Vn interfaceC1364105Vn, Object obj) {
                    this.LIZIZ.LIZLLL(interfaceC1364105Vn, (C331340Cyq) obj);
                }
            };
            c1356950lPp.LJIIL(r0);
            this.LLILZLL = r0;
            LJI();
        }
    }
}
