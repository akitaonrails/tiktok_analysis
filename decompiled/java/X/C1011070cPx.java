package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011070cPx extends C1010620cPE implements InterfaceC656520Pp4 {
    public final InterfaceC1010250cOd LLILZ;
    public C0Q18 LLILZIL;
    public C0QB6 LLILZLL;
    public final List<View> LLIZ;
    public final SearchAdEventLogger LLIZLLLIL;
    public final C01GW LLJ;
    public C0Q1G LLJI;

    @Override // X.InterfaceC656550Pp7
    public final List<View> LJIIJ() {
        return null;
    }

    @Override // X.InterfaceC656520Pp4
    public final void LI1() {
        this.LLJI = C0Q1G.LIVE_COVER;
        SearchAdEventLogger searchAdEventLogger = this.LLIZLLLIL;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LJIILLIIL);
    }

    @Override // X.InterfaceC656520Pp4
    public final void Tu() {
        C1009960cOA c1009960cOA = (C1009960cOA) this.LLJ.getValue();
        if (c1009960cOA == null || c1009960cOA.LIZIZ) {
            return;
        }
        SearchAdEventLogger searchAdEventLogger = this.LLIZLLLIL;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LJJLIIIJ);
        C1009960cOA c1009960cOA2 = (C1009960cOA) this.LLJ.getValue();
        if (c1009960cOA2 != null) {
            c1009960cOA2.LIZIZ = true;
        }
    }

    @Override // X.C1010620cPE, X.C0PPF
    public final void bind() {
        C655610Pnb c655610Pnb = C655610Pnb.LIZIZ;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = c655610Pnb.LIZLLL();
        C0Q18 c0q18LIZIZ = interfaceC657510PqfLIZLLL != null ? interfaceC657510PqfLIZLLL.LIZIZ(this.LLILZ.getAweme(), null, false, false) : null;
        this.LLILZIL = c0q18LIZIZ;
        if (c0q18LIZIZ != null) {
            Aweme aweme = this.LLILZ.getAweme();
            Context context = this.LLILZ.getContext();
            Aweme aweme2 = this.LLILZ.getAweme();
            this.LLILZ.getContext();
            c0q18LIZIZ.Jt2(new C1010460cOy(aweme, context, new C1009930cO7(new AwS595S0100000_16(this, 212), new SearchAdEventLogger(aweme2), aweme2), new InterfaceC1003440cDe() { // from class: X.0cQG
                @Override // X.InterfaceC1003440cDe
                public final View LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC1003440cDe
                public final void LIZJ(View view, Integer num, Integer num2) {
                }

                @Override // X.InterfaceC1003440cDe
                public final boolean LIZLLL() {
                    return true;
                }

                @Override // X.InterfaceC1003440cDe
                public final void LJ(View view) {
                }

                @Override // X.InterfaceC1003440cDe
                public final Function0<Unit> LJII() {
                    return AFwS204S0000000_16.get$arr$(156);
                }

                @Override // X.InterfaceC1003440cDe
                public final void LJFF(String str) {
                    C0QB6 c0qb6 = this.LIZ.LLILZLL;
                    if (c0qb6 != null) {
                        c0qb6.LJ(str);
                    }
                }

                @Override // X.InterfaceC1003440cDe
                public final void LJI(View view) {
                    if (view != null) {
                        ((ArrayList) this.LIZ.LLIZ).add(view);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SearchAdTopVideoSingleCardModule [registerFeedBackLongPressView]， view = ");
                        sbLIZ.append(view);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }, null, null, 48));
        }
        C0Q18 c0q18 = this.LLILZIL;
        if (c0q18 != null) {
            c0q18.bind();
        }
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL2 = c655610Pnb.LIZLLL();
        if (interfaceC657510PqfLIZLLL2 != null) {
            interfaceC657510PqfLIZLLL2.LJIJJ(this);
        }
    }

    @Override // X.C1010620cPE, X.C0PPF
    public final void onDestroy() {
        C0Q18 c0q18 = this.LLILZIL;
        if (c0q18 != null) {
            c0q18.onDestroy();
        }
    }

    @Override // X.C1010620cPE, X.C0PPF
    public final void onViewAttachedToWindow() {
        C0Q18 c0q18 = this.LLILZIL;
        if (c0q18 != null) {
            c0q18.onViewAttachedToWindow();
        }
        SearchAdEventLogger searchAdEventLogger = this.LLIZLLLIL;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LIZIZ);
    }

    @Override // X.C1010620cPE, X.C0PPF
    public final void onViewDetachedFromWindow() {
        C0Q18 c0q18 = this.LLILZIL;
        if (c0q18 != null) {
            c0q18.onViewDetachedFromWindow();
        }
        C1009960cOA c1009960cOA = (C1009960cOA) this.LLJ.getValue();
        if (c1009960cOA != null) {
            c1009960cOA.LIZIZ = false;
        }
        SearchAdEventLogger searchAdEventLogger = this.LLIZLLLIL;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LIZJ);
    }

    @Override // X.InterfaceC656550Pp7
    public final C0Q18 LIZ() {
        return this.LLILZIL;
    }

    @Override // X.C1010620cPE
    /* JADX INFO: renamed from: LJIIIZ */
    public final InterfaceC1010250cOd Mh() {
        return this.LLILZ;
    }

    @Override // X.C1010620cPE, X.InterfaceC1010530cP5
    public final InterfaceC1010250cOd Mh() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC655290Pn5
    public final C0Q1G getClickType() {
        return this.LLJI;
    }

    public C1011070cPx(C1011420cQW c1011420cQW) {
        super(c1011420cQW);
        this.LLILZ = c1011420cQW;
        this.LLIZ = new ArrayList();
        this.LLIZLLLIL = new SearchAdEventLogger(c1011420cQW.LIZ);
        this.LLJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 675));
        this.LLJI = C0Q1G.OTHER;
    }

    @Override // X.C0Q70
    public final <T extends InterfaceC656540Pp6> void LIZJ(T t) {
        if (t instanceof C0QB6) {
            this.LLILZLL = (C0QB6) t;
        }
    }
}
