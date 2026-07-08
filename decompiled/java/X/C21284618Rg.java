package X;

import X.C21285518Rp;
import X.InterfaceC21284718Rh;
import Y.ACListenerS134S0200000_32;
import android.app.Activity;
import android.app.Dialog;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS147S1200000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Rg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21284618Rg<T extends InterfaceC21284718Rh, S extends C21285518Rp> extends AbstractC1066890drz {
    public final C01GW LLJ = C452501pT.LIZIZ(new C21285218Rm(this));
    public S LLJI;

    @Override // X.AbstractC1066890drz, X.InterfaceC1392520mLC
    public final String LJIIJ() {
        return "app_page";
    }

    public void LJJIJIIJI(S s) {
        throw null;
    }

    @Override // X.AbstractC1066890drz
    public C1400390mXt LJIILL() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String strCf = interfaceC1392640mLO.Cf();
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        Aweme awemeLJJLIIIJJIZ = (interfaceC1392640mLO2 != null ? interfaceC1392640mLO2 : null).LJJLIIIJJIZ();
        return new C1400390mXt(new AwS147S1200000_32((C21284618Rg) this, strCf, (String) awemeLJJLIIIJJIZ, (Aweme) 9), new AwS147S1200000_32((C21284618Rg) this, strCf, (String) awemeLJJLIIIJJIZ, (Aweme) 10), new AwS147S1200000_32((C21284618Rg) this, strCf, (String) awemeLJJLIIIJJIZ, (Aweme) 11), null, null, 24);
    }

    public final T LJJIJIL() {
        return (T) this.LLJ.getValue();
    }

    public final void LJJIJL() {
        S s = this.LLJI;
        if (s != null) {
            LJJIJIL().LJIILL(this.LLIZ, s.getId(), s.LLIZ);
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final CharSequence LJJIZ() {
        AnchorCommonStruct anchorCommonStruct;
        String strLJJIJIIJIL;
        if (!C264720AZa.LIZJ || (anchorCommonStruct = this.LLIZ) == null || (strLJJIJIIJIL = LJJIJIIJIL(anchorCommonStruct)) == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("* ");
        sbLIZ.append(strLJJIJIIJIL);
        spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_star_fill;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ny);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ((interfaceC1392640mLO != null ? interfaceC1392640mLO : null).LIZIZ());
        tuxIconDrawableLIZ.setBounds(0, 0, iLIZIZ, iLIZIZ);
        C786410Ut5.q2(spannableStringBuilder, new C419890GdH(tuxIconDrawableLIZ, 2), 0, 1, 33);
        return spannableStringBuilder;
    }

    public static String LJJIJIIJIL(AnchorCommonStruct anchorCommonStruct) {
        boolean z;
        String strValueOf = null;
        try {
            Double dValueOf = Double.valueOf(new JSONObject(anchorCommonStruct.getExtra()).optDouble("topic_rating"));
            double dDoubleValue = dValueOf.doubleValue();
            boolean z2 = false;
            if (!Double.isNaN(dDoubleValue)) {
                if (dDoubleValue == 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = true;
                }
            }
            if (!z2) {
                dValueOf = null;
            }
            if (dValueOf != null) {
                strValueOf = String.valueOf(((double) C814420VxA.LIZ(dValueOf.doubleValue() * ((double) 10))) / 10.0d);
                return strValueOf;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return strValueOf;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        InterfaceC21284718Rh interfaceC21284718RhLJJIJIL = LJJIJIL();
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        interfaceC21284718RhLJJIJIL.LIZJ(c2344009Gk, interfaceC1392640mLO.Cf(), LJIIZILJ());
        LJJIIJ(c2344009Gk);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public void p1(C2344009Gk c2344009Gk) {
        InterfaceC21284718Rh interfaceC21284718RhLJJIJIL = LJJIJIL();
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        LJJIIJZLJL(interfaceC21284718RhLJJIJIL.LJ(c2344009Gk, interfaceC1392640mLO.Cf(), LJIIZILJ()));
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public void LJJJLL(View view, C2344009Gk c2344009Gk) {
        C2344009Gk c2344009GkLJI = LJJIJIL().LJI(c2344009Gk, LJIJJLI(), LJIIZILJ(), LJIJJ(), this.LLIZ);
        LJJII(c2344009GkLJI, true, true);
        LJJIJIL().LJIIJJI(LJIILJJIL(), this.LLIZ, LJIJJLI(), c2344009GkLJI);
        InterfaceC21284718Rh interfaceC21284718RhLJJIJIL = LJJIJIL();
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        interfaceC21284718RhLJJIJIL.LJIIJ(interfaceC1392640mLO.Cf(), LJIIZILJ(), this.LLIZ);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public void yg(Activity activity, Dialog dialog) {
        if (Intrinsics.LJFF(LJIILJJIL().getLocalClassName(), activity.getLocalClassName())) {
            LJJIJIL().LIZIZ();
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void It(View view, Aweme aweme, boolean z) {
        if (aweme != null) {
            LJJIJIL().LIZLLL(aweme);
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        S s = (S) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cyv, null, false);
        this.LLJI = s;
        LJJIJIIJI(s);
        s.setButtonOnClickListener(new AwS433S0200000_32(viewGroup, (ViewGroup) this, 47));
        C786410Ut5.I7(new ACListenerS134S0200000_32(this, c2344009Gk, 16), s);
        viewGroup.addView(s);
        return s;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLIIL(C712520RxC c712520RxC, Dialog dialog, boolean z, boolean z2, boolean z3) {
        List<AnchorCommonStruct> anchors;
        InterfaceC21284718Rh interfaceC21284718RhLJJIJIL = LJJIJIL();
        Aweme awemeLJIIZILJ = LJIIZILJ();
        boolean z4 = false;
        if (awemeLJIIZILJ != null && (anchors = awemeLJIIZILJ.getAnchors()) != null) {
            if (!anchors.isEmpty()) {
                Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getType() != type()) {
                        break;
                    }
                }
                z4 = true;
            } else {
                z4 = true;
            }
        }
        interfaceC21284718RhLJJIJIL.LJFF(LJIIZILJ(), z4);
    }
}
