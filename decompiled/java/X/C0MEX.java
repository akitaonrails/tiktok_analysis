package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.zhiliaoapp.musically.R;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MEX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MEX extends i<InterfaceC564810MDf, C0MEY, C0MEW, C565030MEb> implements InterfaceC564810MDf, InterfaceC379610EuV {
    public static final C565040MEc LLJJIJIIJIL = new Object() { // from class: X.0MEc
    };
    public static final int LLJJIJIL = 8;
    public final C1DRG LLJILJILJ;
    public final C19A3 LLJILLL;
    public final C01GW LLJJ;
    public final Function0<C0MEY> LLJJI;
    public final Function0<C0MEW> LLJJIII;
    public final Function0<C565030MEb> LLJJIJI;

    public final String getSource() {
        return (String) this.LLJJ.getValue();
    }

    public final void F4() {
        i3(new AwS587S0100000_8(C0LXU.LIZ(getSource(), true), 372));
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        F4();
    }

    @Override // ge.i
    public Function0<C0MEY> E3() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0MEW> o2() {
        return this.LLJJIII;
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C565030MEb> w2() {
        return this.LLJJIJI;
    }

    public final void H4(View view) {
        int iIntValue;
        SpannableString spannableString = new SpannableString(C0MED.LIZ(C0MEB.POST_TOOLTIP_TRIES, new Object[0]));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.z_, C1664590tQ1.LJIIIZ(this));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), 0, spannableString.length(), 33);
        C450720Hlu c450720Hlu = new C450720Hlu(C1664590tQ1.LJIIIZ(this));
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
        c450720Hlu.LLILZ = spannableString;
        c450720Hlu.LJII(R.attr.acd);
        c450720Hlu.LLILLJJLI.LJII = 3000L;
        c450720Hlu.LIZIZ().show();
    }

    public C0MEX(C1DRG c1drg, C19A3 c19a3) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c19a3;
        this.LLJJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(268));
        this.LLJJI = AFwS194S0000000_8.get$arr$(267);
        this.LLJJIII = new AwS552S0100000_8(this, 579);
        this.LLJJIJI = new AwS552S0100000_8(this, 580);
    }
}
