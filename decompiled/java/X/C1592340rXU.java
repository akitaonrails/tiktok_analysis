package X;

import android.view.ViewOutlineProvider;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.ITabletBottomControlBar;
import kotlin.jvm.internal.AwS425S0200000_24;

/* JADX INFO: renamed from: X.0rXU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592340rXU {
    public final C1591930rWp LIZ;
    public final C01GW LIZIZ;

    public final C1592370rXX LIZJ() {
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLIIII()) {
            return C1395900mQe.LIZ(this.LIZ);
        }
        return null;
    }

    public final boolean LIZLLL() {
        C19EG c19egLIZIZ;
        C1592370rXX c1592370rXXLIZJ = LIZJ();
        return (c1592370rXXLIZJ == null || (c19egLIZIZ = C1388190mED.LIZIZ(c1592370rXXLIZJ.getContext())) == null || C20589915hZ.LIZIZ(c19egLIZIZ).LIZ >= ((float) C20590215hc.LIZLLL.LIZ)) ? false : true;
    }

    public final void LIZ(int i) {
        C1592370rXX c1592370rXXLIZJ = LIZJ();
        if (c1592370rXXLIZJ != null) {
            C1591930rWp c1591930rWp = c1592370rXXLIZJ.LLILZIL;
            if (c1591930rWp != null) {
                EnumC1592360rXW enumC1592360rXW = c1592370rXXLIZJ.LLIZLLLIL;
                EnumC1592360rXW enumC1592360rXW2 = EnumC1592360rXW.FLOAT;
                if (enumC1592360rXW == enumC1592360rXW2) {
                    if (enumC1592360rXW == enumC1592360rXW2) {
                        int iLJIIL = C2441009hQ.LJIIL(5066061, C814420VxA.LIZIZ(127.5f));
                        c1592370rXXLIZJ.LL.setCornerRadius(C418440Gaw.LIZIZ(26));
                        c1592370rXXLIZJ.LL.setColor(iLJIIL);
                        c1592370rXXLIZJ.LL.setStroke(0, 0);
                        C786410Ut5.U4(c1592370rXXLIZJ.LLILLJJLI, 1.0f);
                        c1592370rXXLIZJ.LLILLJJLI.invalidateOutline();
                        c1592370rXXLIZJ.LLILLJJLI.invalidate();
                    }
                    c1591930rWp.setBackgroundColor(0);
                    return;
                }
                c1591930rWp.setBackgroundColor(i);
                return;
            }
            return;
        }
        this.LIZ.setBackgroundColor(i);
    }

    public final void LIZIZ(EnumC1592360rXW enumC1592360rXW) {
        ITabletBottomControlBar iTabletBottomControlBarInvoke;
        C1D0G c1d0gLIZ;
        C1592370rXX c1592370rXXLIZJ = LIZJ();
        if (c1592370rXXLIZJ == null) {
            return;
        }
        if (c1592370rXXLIZJ.LLIZLLLIL == enumC1592360rXW) {
            c1592370rXXLIZJ.LIZ();
        } else {
            c1592370rXXLIZJ.LLIZLLLIL = enumC1592360rXW;
            int i = C1592350rXV.LIZ[enumC1592360rXW.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    c1592370rXXLIZJ.LLILLJJLI.setBackground(c1592370rXXLIZJ.LL);
                    c1592370rXXLIZJ.LLILLJJLI.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                    c1592370rXXLIZJ.LLILLJJLI.setClipToOutline(false);
                    c1592370rXXLIZJ.LLILLJJLI.setElevation(0.0f);
                    c1592370rXXLIZJ.LLILLJJLI.setTranslationZ(0.0f);
                    c1592370rXXLIZJ.LLILLJJLI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), 0);
                    C786410Ut5.LJZ(0, c1592370rXXLIZJ.LLILLJJLI);
                } else {
                    throw new C1954807lC();
                }
            } else {
                c1592370rXXLIZJ.LLILLJJLI.setBackground(null);
                c1592370rXXLIZJ.LLILLJJLI.setClipToOutline(false);
                c1592370rXXLIZJ.LLILLJJLI.setElevation(0.0f);
                c1592370rXXLIZJ.LLILLJJLI.setTranslationZ(0.0f);
                c1592370rXXLIZJ.LLILLJJLI.setPadding(0, 0, 0, 0);
                c1592370rXXLIZJ.LLILZLL = null;
                c1592370rXXLIZJ.LLIZ = null;
                C786410Ut5.LJJJJIZL(c1592370rXXLIZJ.LLILLL);
                C786410Ut5.LJJJJIZL(c1592370rXXLIZJ.LLILZ);
                C786410Ut5.LJZ(8, c1592370rXXLIZJ.LLILLL);
                C786410Ut5.LJZ(8, c1592370rXXLIZJ.LLILZ);
                C786410Ut5.LJZ(0, c1592370rXXLIZJ.LLILLJJLI);
            }
            c1592370rXXLIZJ.LIZJ();
            c1592370rXXLIZJ.LIZ();
        }
        C1395870mQb c1395870mQb = (C1395870mQb) this.LIZIZ.getValue();
        c1395870mQb.getClass();
        if (!C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJIZ()) {
            c1395870mQb.LIZIZ();
            return;
        }
        if (enumC1592360rXW != EnumC1592360rXW.FLOAT) {
            c1395870mQb.LIZIZ();
            return;
        }
        InterfaceC1395860mQa interfaceC1395860mQa = c1395870mQb.LIZJ;
        InterfaceC1395860mQa interfaceC1395860mQa2 = interfaceC1395860mQa;
        if (interfaceC1395860mQa == null) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(c1395870mQb.LIZ.getContext());
            if (c19egLIZIZ != null && (iTabletBottomControlBarInvoke = c1395870mQb.LIZIZ.invoke()) != null && (c1d0gLIZ = iTabletBottomControlBarInvoke.LIZ(c19egLIZIZ)) != null) {
                c1395870mQb.LIZJ = c1d0gLIZ;
                c1d0gLIZ.LJ(new C1395880mQc(c1395870mQb));
                interfaceC1395860mQa2 = c1d0gLIZ;
            } else {
                c1395870mQb.LJ();
                C1592370rXX c1592370rXXLIZ = C1395900mQe.LIZ(c1395870mQb.LIZ);
                if (c1592370rXXLIZ == null) {
                    return;
                }
                c1592370rXXLIZ.LLILZLL = null;
                c1592370rXXLIZ.LLIZ = null;
                C786410Ut5.LJJJJIZL(c1592370rXXLIZ.LLILLL);
                C786410Ut5.LJJJJIZL(c1592370rXXLIZ.LLILZ);
                C786410Ut5.LJZ(8, c1592370rXXLIZ.LLILLL);
                C786410Ut5.LJZ(8, c1592370rXXLIZ.LLILZ);
                return;
            }
        }
        interfaceC1395860mQa2.LIZJ();
    }

    public C1592340rXU(C1591930rWp c1591930rWp, C1592320rXS c1592320rXS) {
        this.LIZ = c1591930rWp;
        this.LIZIZ = C452501pT.LIZIZ(new AwS425S0200000_24(this, c1592320rXS, 53));
    }
}
