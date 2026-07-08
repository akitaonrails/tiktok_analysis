package X;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS300S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cQ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011190cQ9 implements InterfaceC1011540cQi {
    public Aweme LL;
    public C0Q18 LLILLJJLI;
    public InterfaceC1011390cQT LLILLL;
    public Context LLILZ;
    public boolean LLILZIL;
    public final SearchAdEventLogger LLILZLL = new SearchAdEventLogger();
    public C586140Myq LLIZ;

    @Override // X.C0PPF
    public final void onViewAttachedToWindow() {
        C0Q18 c0q18 = this.LLILLJJLI;
        if (c0q18 != null) {
            c0q18.onViewAttachedToWindow();
        }
    }

    @Override // X.C0PPF
    public final void onViewDetachedFromWindow() {
        C0Q18 c0q18 = this.LLILLJJLI;
        if (c0q18 != null) {
            c0q18.onViewDetachedFromWindow();
        }
    }

    @Override // X.C0PPF
    public final void bind() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[SearchAdAISummaryCardSubModule][bind], index = ");
        C586140Myq c586140Myq = this.LLIZ;
        sbLIZ.append(c586140Myq != null ? c586140Myq.LIZIZ : null);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZLL.withContext(this.LL);
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        C0Q18 c0q18LIZIZ = interfaceC657510PqfLIZLLL != null ? interfaceC657510PqfLIZLLL.LIZIZ(this.LL, null, true, false) : null;
        this.LLILLJJLI = c0q18LIZIZ;
        if (c0q18LIZIZ != null) {
            Aweme aweme = this.LL;
            c0q18LIZIZ.Jt2(new C1010460cOy(aweme, this.LLILZ, new C1009920cO6(aweme, null, AFwS300S0000000_16.get$arr$(67)), new InterfaceC1003440cDe() { // from class: X.0cQJ
                @Override // X.InterfaceC1003440cDe
                public final View LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC1003440cDe
                public final void LIZJ(View view, Integer num, Integer num2) {
                }

                @Override // X.InterfaceC1003440cDe
                public final void LJFF(String str) {
                }

                @Override // X.InterfaceC1003440cDe
                public final void LJI(View view) {
                }

                @Override // X.InterfaceC1003440cDe
                public final boolean LIZLLL() {
                    return this.LIZ.LLILZIL;
                }

                @Override // X.InterfaceC1003440cDe
                public final Function0<Unit> LJII() {
                    return AFwS204S0000000_16.get$arr$(156);
                }

                @Override // X.InterfaceC1003440cDe
                public final void LJ(View view) {
                    InterfaceC1631620sYq<Aweme, String, View, Unit> interfaceC1631620sYqLIZ;
                    InterfaceC1011390cQT interfaceC1011390cQT = this.LIZ.LLILLL;
                    if (interfaceC1011390cQT != null && (interfaceC1631620sYqLIZ = interfaceC1011390cQT.LIZ()) != null) {
                        interfaceC1631620sYqLIZ.invoke(this.LIZ.LL, "ads", view);
                    }
                }
            }, null, null, 48));
        }
        C0Q18 c0q18 = this.LLILLJJLI;
        if (c0q18 != null) {
            c0q18.bind();
        }
    }

    @Override // X.InterfaceC1011540cQi
    public final C0Q18 LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1011540cQi
    public final void LJIILLIIL(boolean z) {
        Integer num;
        C1007860cKm c1007860cKmLJIILIIL;
        C1009960cOA c1009960cOALIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[SearchAdAISummaryCardSubModule][trackDisPlayEvent], show = ");
        sbLIZ.append(z);
        sbLIZ.append(", index = ");
        C586140Myq c586140Myq = this.LLIZ;
        if (c586140Myq != null) {
            num = c586140Myq.LIZIZ;
        } else {
            num = null;
        }
        sbLIZ.append(num);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL != null && (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL.LJIILIIL()) != null && (c1009960cOALIZ = c1007860cKmLJIILIIL.LIZ(this.LL)) != null) {
            C238400w2 c238400w2 = new C238400w2();
            if (z) {
                if (!c1009960cOALIZ.LIZJ) {
                    SearchAdEventLogger searchAdEventLogger = this.LLILZLL;
                    if (searchAdEventLogger != null) {
                        C1009980cOC.LIZ.getClass();
                        searchAdEventLogger.logAd((InterfaceC1023400cjq) C1009980cOC.LLIIJLIL.getValue());
                    }
                    System.currentTimeMillis();
                    c1009960cOALIZ.LIZJ = true;
                    return;
                }
                return;
            }
            Aweme aweme = this.LL;
            if (aweme == null || !C1010120cOQ.LJJJJ(aweme) || c1009960cOALIZ.LIZLLL) {
                return;
            }
            SearchAdEventLogger searchAdEventLogger2 = this.LLILZLL;
            if (searchAdEventLogger2 != null) {
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger2.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LLIIL.getValue(), new AwS595S0100000_16(c238400w2, 206));
            }
            c1009960cOALIZ.LIZLLL = true;
        }
    }
}
