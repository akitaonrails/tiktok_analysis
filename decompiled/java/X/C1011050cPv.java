package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cPv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011050cPv extends C1010590cPB implements InterfaceC657580Pqm {
    public final InterfaceC1010250cOd LLJ;
    public final EnumC658110Prd LLJI;
    public final SearchAdEventLogger LLJIJIL;
    public C0Q18 LLJILJIL;
    public final C1011360cQQ LLJILJILJ;
    public C0Q1G LLJILLL;
    public C1011580cQm LLJJ;
    public InterfaceC1011480cQc LLJJI;
    public final List<View> LLJJIII;

    @Override // X.InterfaceC657580Pqm
    public final void Vh2() {
        if (this.LLJILLL != C0Q1G.MASK_CTA) {
            Aweme aweme = this.LLJ.getAweme();
            if (C1010120cOQ.LIZIZ(80, aweme != null ? aweme.getAwemeRawAd() : null)) {
                LJIJJ(80);
            } else {
                Aweme aweme2 = this.LLJ.getAweme();
                if (aweme2 == null || !C1010120cOQ.LJJJ(aweme2)) {
                    SearchAdEventLogger searchAdEventLogger = this.LLJIJIL;
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger.logAd(C1009980cOC.LJII, new AwS595S0100000_16(this, 215));
                } else {
                    SearchAdEventLogger searchAdEventLogger2 = this.LLJIJIL;
                    C1009980cOC.LIZ.getClass();
                    searchAdEventLogger2.logAd(C1009980cOC.LJIIIIZZ, new AwS595S0100000_16(this, 214));
                }
            }
            this.LLJILLL = C0Q1G.VIDEO;
            this.LLILZ.LIZLLL = false;
        }
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void onDestroy() {
        C0Q18 c0q18 = this.LLJILJIL;
        if (c0q18 != null) {
            c0q18.onDestroy();
        }
    }

    @Override // X.C1010590cPB, X.C1010600cPC, X.InterfaceC1002830cCf
    public final void LJIJI() {
        super.LJIJI();
        C0Q1G c0q1g = this.LLJILLL;
        LJIJJ((c0q1g == null || C0Q1O.LIZ[c0q1g.ordinal()] != 1) ? this.LLILZIL : 54);
        this.LLJILJILJ.LIZ();
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void bind() {
        Context context;
        super.bind();
        InterfaceC1011480cQc interfaceC1011480cQc = this.LLJJI;
        ViewGroup itemView = interfaceC1011480cQc != null ? interfaceC1011480cQc.getItemView() : null;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG c19egLIZIZ = (itemView == null || (context = itemView.getContext()) == null) ? null : C1388190mED.LIZIZ(context);
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(itemView, c19egLIZIZ);
        this.LLJJ = lifecycleOwnerLJIJI != null ? new C1011580cQm(lifecycleOwnerLJIJI) : null;
        InterfaceC1011480cQc interfaceC1011480cQc2 = this.LLJJI;
        ViewGroup itemView2 = interfaceC1011480cQc2 != null ? interfaceC1011480cQc2.getItemView() : null;
        EnumC658110Prd enumC658110Prd = this.LLJI;
        C1011580cQm c1011580cQm = this.LLJJ;
        SearchAdEventLogger searchAdEventLogger = this.LLJIJIL;
        C1004580cFU c1004580cFU = this.LLILZ;
        InterfaceC1011480cQc interfaceC1011480cQc3 = this.LLJJI;
        C1011090cPz c1011090cPz = new C1011090cPz(new C1010580cPA(itemView2, interfaceC1011480cQc3 != null ? interfaceC1011480cQc3.LIZIZ() : null, enumC658110Prd, c1011580cQm, searchAdEventLogger, c1004580cFU, this.LLJ));
        List<AbstractC1010700cPM> list = this.LLILLL;
        if (list != null) {
            ((ArrayList) list).add(c1011090cPz);
        }
        c1011090cPz.bind();
        C1011580cQm c1011580cQm2 = this.LLJJ;
        if (c1011580cQm2 != null) {
            c1011580cQm2.LIZLLL(EnumC1011130cQ3.MASK_CTA_CLICK, new AwS560S0100000_16(this, 676));
        }
        C1011580cQm c1011580cQm3 = this.LLJJ;
        if (c1011580cQm3 != null) {
            c1011580cQm3.LIZLLL(EnumC1011130cQ3.MASK_SHOW, new AwS560S0100000_16(this, 677));
        }
        C1011580cQm c1011580cQm4 = this.LLJJ;
        if (c1011580cQm4 != null) {
            c1011580cQm4.LIZLLL(EnumC1011130cQ3.MASK_HIDE, new AwS560S0100000_16(this, 678));
        }
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        C0Q18 c0q18LIZIZ = interfaceC657510PqfLIZLLL != null ? interfaceC657510PqfLIZLLL.LIZIZ(this.LLJ.getAweme(), null, false, false) : null;
        this.LLJILJIL = c0q18LIZIZ;
        if (c0q18LIZIZ != null) {
            Aweme aweme = this.LLJ.getAweme();
            Context context2 = this.LLJ.getContext();
            Aweme aweme2 = this.LLJ.getAweme();
            this.LLJ.getContext();
            c0q18LIZIZ.Jt2(new C1010460cOy(aweme, context2, new C1009930cO7(null, new SearchAdEventLogger(aweme2), aweme2), new InterfaceC1003440cDe() { // from class: X.0cQH
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
                public final void LJFF(String str) {
                }

                @Override // X.InterfaceC1003440cDe
                public final Function0<Unit> LJII() {
                    return AFwS204S0000000_16.get$arr$(156);
                }

                @Override // X.InterfaceC1003440cDe
                public final void LJI(View view) {
                    if (view != null) {
                        ((ArrayList) this.LIZ.LLJJIII).add(view);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SearchAdTopVideoSingleCardModule [registerFeedBackLongPressView]， view = ");
                        sbLIZ.append(view);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }, null, null, 48));
        }
        C0Q18 c0q18 = this.LLJILJIL;
        if (c0q18 != null) {
            c0q18.bind();
        }
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        this.LLIZ.LIZJ(this.LLJ.getAweme(), null, null);
        C0Q18 c0q18 = this.LLJILJIL;
        if (c0q18 != null) {
            c0q18.onViewAttachedToWindow();
        }
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C0Q18 c0q18 = this.LLJILJIL;
        if (c0q18 != null) {
            c0q18.onViewDetachedFromWindow();
        }
        SearchAdEventLogger searchAdEventLogger = this.LLJIJIL;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LIZJ);
    }

    @Override // X.InterfaceC656550Pp7
    public final C0Q18 LIZ() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC656550Pp7
    public final List<View> LJIIJ() {
        return this.LLJJIII;
    }

    @Override // X.C1010590cPB, X.C1010600cPC
    public final InterfaceC1010250cOd LJJ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1010530cP5
    public final InterfaceC1010250cOd Mh() {
        return this.LLJ;
    }

    @Override // X.C1010600cPC, X.InterfaceC660150Puv
    public final InterfaceC1011430cQX vQ0() {
        return this.LLJJ;
    }

    public C1011050cPv(C1011420cQW c1011420cQW) {
        super(c1011420cQW);
        this.LLJ = c1011420cQW;
        this.LLJI = EnumC658110Prd.TOP_SINGLE_CARD_VIDEO;
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(c1011420cQW.LIZ);
        this.LLJIJIL = searchAdEventLogger;
        this.LLJILJILJ = new C1011360cQQ(searchAdEventLogger);
        this.LLJJIII = new ArrayList();
    }

    @Override // X.C0Q70
    public final <T extends InterfaceC656540Pp6> void LIZJ(T t) {
        if (t instanceof InterfaceC1011480cQc) {
            this.LLJJI = (InterfaceC1011480cQc) t;
        }
    }

    @Override // X.C1010590cPB, X.C1010600cPC, X.InterfaceC1002830cCf
    public final void LJFF(String str) {
        super.LJFF(str);
        this.LLJILJILJ.LIZIZ();
    }

    @Override // X.C1010600cPC, X.InterfaceC658610PsR
    public final void Ms(InterfaceC1010450cOx interfaceC1010450cOx) {
        super.Ms(interfaceC1010450cOx);
        this.LLJIJIL.withContext(interfaceC1010450cOx);
    }
}
