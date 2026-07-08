package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011060cPw extends C1010590cPB implements InterfaceC656050PoJ {
    public final InterfaceC1010250cOd LLJ;
    public C0Q18 LLJI;
    public InterfaceC1011460cQa LLJIJIL;
    public EnumC658110Prd LLJILJIL;
    public C1011580cQm LLJILJILJ;
    public final SearchAdEventLogger LLJILLL;
    public final C01GW LLJJ;
    public boolean LLJJI;
    public C1011360cQQ LLJJIII;

    @Override // X.C1010600cPC, X.C0PPF
    public final void onDestroy() {
        if (this.LLJJI) {
            onViewDetachedFromWindow();
        }
        C0Q18 c0q18 = this.LLJI;
        if (c0q18 != null) {
            c0q18.onDestroy();
        }
        this.LLJJI = false;
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void onViewAttachedToWindow() {
        if (this.LLJJI) {
            return;
        }
        super.onViewAttachedToWindow();
        C0Q18 c0q18 = this.LLJI;
        if (c0q18 != null) {
            c0q18.onViewAttachedToWindow();
        }
        if (this.LLJILJIL == EnumC658110Prd.OLE_PAC_SUB_VIDEO) {
            SearchAdEventLogger searchAdEventLogger = this.LLJILLL;
            if (searchAdEventLogger != null) {
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger.logAd((InterfaceC1023400cjq) C1009980cOC.LLIIII.getValue());
            }
        } else {
            SearchAdEventLogger searchAdEventLogger2 = this.LLJILLL;
            if (searchAdEventLogger2 != null) {
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger2.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LJLLJ.getValue(), new AwS595S0100000_16(this, 390));
            }
        }
        this.LLJJI = true;
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void onViewDetachedFromWindow() {
        if (this.LLJJI) {
            super.onViewDetachedFromWindow();
            C0Q18 c0q18 = this.LLJI;
            if (c0q18 != null) {
                c0q18.onViewDetachedFromWindow();
            }
            this.LLJJI = false;
        }
    }

    @Override // X.C1010600cPC, X.C0PPF
    public final void bind() {
        Context context;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" MixedSubVideo bind aweme aid: ");
        Aweme aweme = this.LLJ.getAweme();
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        C2188811AlT.LIZIZ(sbLIZ);
        super.bind();
        InterfaceC1011460cQa interfaceC1011460cQa = this.LLJIJIL;
        ViewGroup itemView = interfaceC1011460cQa != null ? interfaceC1011460cQa.getItemView() : null;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C19EG c19egLIZIZ = (itemView == null || (context = itemView.getContext()) == null) ? null : C1388190mED.LIZIZ(context);
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(itemView, c19egLIZIZ);
        this.LLJILJILJ = lifecycleOwnerLJIJI != null ? new C1011580cQm(lifecycleOwnerLJIJI) : null;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        C0Q18 c0q18LIZIZ = interfaceC657510PqfLIZLLL != null ? interfaceC657510PqfLIZLLL.LIZIZ(this.LLJ.getAweme(), null, false, false) : null;
        this.LLJI = c0q18LIZIZ;
        if (c0q18LIZIZ != null) {
            c0q18LIZIZ.Jt2(new C1010460cOy(this.LLJ.getAweme(), this.LLJ.getContext(), new C1009920cO6(this.LLJ.getAweme(), this.LLJILLL, null), new InterfaceC1003440cDe() { // from class: X.0cQ0
                @Override // X.InterfaceC1003440cDe
                public final View LIZIZ() {
                    return null;
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
                public final void LJI(View view) {
                }

                @Override // X.InterfaceC1003440cDe
                public final Function0<Unit> LJII() {
                    return new AwS560S0100000_16(this.LIZ, 922);
                }

                @Override // X.InterfaceC1003440cDe
                public final void LIZJ(View view, Integer num, Integer num2) {
                    Aweme aweme2;
                    C423340Giq.LIZIZ(view, num, num2);
                    InterfaceC1010140cOS interfaceC1010140cOSLJIIIIZZ = C0R12.LIZIZ.LJIIIIZZ();
                    InterfaceC1010250cOd interfaceC1010250cOd = this.LIZ.LLJ;
                    if (interfaceC1010250cOd != null) {
                        aweme2 = interfaceC1010250cOd.getAweme();
                    } else {
                        aweme2 = null;
                    }
                    interfaceC1010140cOSLJIIIIZZ.LIZLLL(3, aweme2);
                    C1004580cFU c1004580cFU = this.LIZ.LLILZ;
                    if (c1004580cFU != null) {
                        c1004580cFU.LIZ = 3;
                    }
                }
            }, itemView, null, 32));
        }
        C0Q18 c0q18 = this.LLJI;
        if (c0q18 != null) {
            c0q18.bind();
        }
        Aweme aweme2 = this.LLJ.getAweme();
        if (C1010120cOQ.LJJIIZI(aweme2 != null ? aweme2.getAwemeRawAd() : null)) {
            this.LLJILJIL = EnumC658110Prd.OLE_PAC_SUB_VIDEO;
        } else {
            this.LLJILJIL = EnumC658110Prd.MIXED_CREATIVE_SUB_VIDEO;
        }
        SearchAdEventLogger searchAdEventLogger = this.LLJILLL;
        EnumC658110Prd enumC658110Prd = this.LLJILJIL;
        this.LLJJIII = new C1011360cQQ(searchAdEventLogger);
        if (enumC658110Prd != EnumC658110Prd.OLE_PAC_SUB_VIDEO) {
            InterfaceC1011460cQa interfaceC1011460cQa2 = this.LLJIJIL;
            C1010580cPA c1010580cPA = new C1010580cPA(interfaceC1011460cQa2 != null ? interfaceC1011460cQa2.getItemView() : null, null, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLILZ, this.LLJ);
            InterfaceC1011460cQa interfaceC1011460cQa3 = this.LLJIJIL;
            final C1010580cPA c1010580cPALIZ = C1010580cPA.LIZ(c1010580cPA, interfaceC1011460cQa3 != null ? interfaceC1011460cQa3.LIZLLL() : null);
            AbstractC1010700cPM abstractC1010700cPM = new AbstractC1010700cPM(c1010580cPALIZ) { // from class: X.0cPP
                public final ViewGroup LLILZIL;
                public ViewGroup LLILZLL;

                @Override // X.AbstractC1010700cPM
                public final void LIZIZ() {
                    ArrayList arrayList = (ArrayList) this.LLILLL;
                    arrayList.add(new C1010510cP3(this.LL));
                    arrayList.add(new C1010970cPn(this.LL));
                }

                @Override // X.AbstractC1010700cPM
                public final void LIZJ() {
                    ViewGroup viewGroup = this.LLILZIL;
                    if (viewGroup != null) {
                        C1009940cO8.LJI(viewGroup);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(" param.slotView = ");
                        sbLIZ2.append(this.LL.LIZIZ);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        int i = C2510609se.LIZ;
                        View viewLIZJ = C1009940cO8.LIZJ(viewGroup.getContext(), viewGroup);
                        this.LLILZLL = viewLIZJ instanceof ViewGroup ? (ViewGroup) viewLIZJ : null;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("inflate bottom componentGroupView = ");
                        sbLIZ3.append(this.LLILZLL);
                        C2188811AlT.LIZIZ(sbLIZ3);
                    }
                }

                @Override // X.AbstractC1010700cPM, X.C0PPF
                public final void bind() {
                    super.bind();
                }

                {
                    super(c1010580cPALIZ);
                    this.LLILZIL = c1010580cPALIZ.LIZIZ;
                }
            };
            List<AbstractC1010700cPM> list = this.LLILLL;
            if (list != null) {
                ((ArrayList) list).add(abstractC1010700cPM);
            }
            abstractC1010700cPM.bind();
            InterfaceC1011460cQa interfaceC1011460cQa4 = this.LLJIJIL;
            C1011090cPz c1011090cPz = new C1011090cPz(C1010580cPA.LIZ(c1010580cPA, interfaceC1011460cQa4 != null ? interfaceC1011460cQa4.LIZIZ() : null));
            List<AbstractC1010700cPM> list2 = this.LLILLL;
            if (list2 != null) {
                ((ArrayList) list2).add(c1011090cPz);
            }
            c1011090cPz.bind();
            C1011580cQm c1011580cQm = this.LLJILJILJ;
            if (c1011580cQm != null) {
                c1011580cQm.LIZLLL(EnumC1011130cQ3.MASK_CTA_CLICK, new AwS560S0100000_16(this, 923));
            }
            C1011580cQm c1011580cQm2 = this.LLJILJILJ;
            if (c1011580cQm2 != null) {
                c1011580cQm2.LIZLLL(EnumC1011130cQ3.MASK_SHOW, new AwS560S0100000_16(this, 924));
            }
            C1011580cQm c1011580cQm3 = this.LLJILJILJ;
            if (c1011580cQm3 != null) {
                c1011580cQm3.LIZLLL(EnumC1011130cQ3.MASK_HIDE, new AwS560S0100000_16(this, 925));
            }
            C1011580cQm c1011580cQm4 = this.LLJILJILJ;
            if (c1011580cQm4 != null) {
                c1011580cQm4.LIZLLL(EnumC1011130cQ3.MASK_CTA_CLICK, new AwS560S0100000_16(this, 926));
            }
        }
        if (this.LLJJI) {
            onViewDetachedFromWindow();
        }
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
        return this.LLJILJILJ;
    }

    public C1011060cPw(C1011520cQg c1011520cQg) {
        AwemeRawAd awemeRawAdLJIIIIZZ;
        super(c1011520cQg);
        this.LLJ = c1011520cQg;
        this.LLJILJIL = EnumC658110Prd.MIXED_CREATIVE_SUB_VIDEO;
        Object[] objArr = new Object[2];
        Aweme aweme = c1011520cQg.LIZ;
        objArr[0] = aweme;
        if (aweme != null) {
            awemeRawAdLJIIIIZZ = C1010120cOQ.LJIIIIZZ(aweme);
        } else {
            awemeRawAdLJIIIIZZ = null;
        }
        objArr[1] = awemeRawAdLJIIIIZZ;
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(objArr);
        this.LLJILLL = searchAdEventLogger;
        this.LLJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1284));
        this.LLJJIII = new C1011360cQQ(searchAdEventLogger);
    }

    @Override // X.C0Q70
    public final <T extends InterfaceC656540Pp6> void LIZJ(T t) {
        if (t instanceof InterfaceC1011460cQa) {
            this.LLJIJIL = (InterfaceC1011460cQa) t;
        }
    }

    @Override // X.C1010590cPB, X.C1010600cPC, X.InterfaceC1002830cCf
    public final void LJFF(String str) {
        super.LJFF(str);
        this.LLJJIII.LIZIZ();
        C0Q18 c0q18 = this.LLJI;
        if (c0q18 != null) {
            c0q18.LJFF(str);
        }
    }

    public final void LJJIII(boolean z) {
        ViewGroup viewGroupLIZLLL;
        ViewGroup viewGroupLIZLLL2;
        if (z) {
            InterfaceC1011460cQa interfaceC1011460cQa = this.LLJIJIL;
            if (interfaceC1011460cQa != null && (viewGroupLIZLLL2 = interfaceC1011460cQa.LIZLLL()) != null) {
                C786410Ut5.LJLZ(0, viewGroupLIZLLL2);
                return;
            }
            return;
        }
        InterfaceC1011460cQa interfaceC1011460cQa2 = this.LLJIJIL;
        if (interfaceC1011460cQa2 == null || (viewGroupLIZLLL = interfaceC1011460cQa2.LIZLLL()) == null) {
            return;
        }
        C786410Ut5.LJLZ(8, viewGroupLIZLLL);
    }

    @Override // X.C1010600cPC, X.InterfaceC658610PsR
    public final void Ms(InterfaceC1010450cOx interfaceC1010450cOx) {
        super.Ms(interfaceC1010450cOx);
        C0Q18 c0q18 = this.LLJI;
        if (c0q18 != null) {
            c0q18.Ms(interfaceC1010450cOx);
        }
    }

    @Override // X.InterfaceC656050PoJ
    public final void Ze2(C0Q1G c0q1g) {
        int i = C0Q1N.LIZ[c0q1g.ordinal()];
        if (i != 1) {
            if (i != 2) {
                AwemeRawAd awemeRawAd = null;
                if (i != 3) {
                    if (i == 4) {
                        Aweme aweme = this.LLJ.getAweme();
                        if (aweme != null) {
                            awemeRawAd = aweme.getAwemeRawAd();
                        }
                        if (C1010120cOQ.LIZIZ(80, awemeRawAd)) {
                            LJIJJ(80);
                            C1004580cFU c1004580cFU = this.LLILZ;
                            c1004580cFU.LJIIIIZZ = false;
                            c1004580cFU.LJII = new AwS595S0100000_16(this, 389);
                        } else {
                            SearchAdEventLogger searchAdEventLogger = this.LLJILLL;
                            C1009980cOC.LIZ.getClass();
                            searchAdEventLogger.logAd((InterfaceC1023400cjq) C1009980cOC.LLIIIL.getValue());
                        }
                    }
                } else {
                    Aweme aweme2 = this.LLJ.getAweme();
                    if (aweme2 != null) {
                        awemeRawAd = aweme2.getAwemeRawAd();
                    }
                    if (C1010120cOQ.LIZIZ(80, awemeRawAd)) {
                        LJIJJ(80);
                    } else {
                        SearchAdEventLogger searchAdEventLogger2 = this.LLJILLL;
                        C1009980cOC.LIZ.getClass();
                        searchAdEventLogger2.logAd(C1009980cOC.LJII, new AwS595S0100000_16(this, 388));
                    }
                }
            } else {
                LJIJJ(54);
                InterfaceC1011460cQa interfaceC1011460cQa = this.LLJIJIL;
                if (interfaceC1011460cQa != null) {
                    interfaceC1011460cQa.LIZJ();
                }
            }
        } else {
            LJIJJ(53);
            InterfaceC1011460cQa interfaceC1011460cQa2 = this.LLJIJIL;
            if (interfaceC1011460cQa2 != null) {
                interfaceC1011460cQa2.LIZJ();
            }
        }
        this.LLJJIII.LIZ();
    }
}
