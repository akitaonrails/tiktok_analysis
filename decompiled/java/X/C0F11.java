package X;

import Y.ACListenerS140S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0F11, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F11 extends AbstractC1664490tPr<C382840Ezi, C0F0B> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 207));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 212));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 209));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 210));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 211));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 213));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 223));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 222));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 224));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 214));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 215));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 216));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 217));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 218));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 206));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 208));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 205));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 225));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 203));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 226));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 204));

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        C786410Ut5.T4(this.mView, 0.0f);
        HandlerHook.viewPost(this.mView, new ARunnableS105S0100000_5(this, 27));
    }

    public final void LLLLLJIL() {
        C382840Ezi c382840Ezi = LLLLILI().LIZ;
        LinearLayout linearLayout = (LinearLayout) this.LLJL.getValue();
        int i = 8;
        if (!c382840Ezi.LJIJ && c382840Ezi.LJIILLIIL) {
            i = 0;
        }
        C786410Ut5.LJZL(i, linearLayout);
    }

    public final void LLLLLJLJLL() {
        C382840Ezi c382840Ezi = LLLLILI().LIZ;
        if (C381050Ewp.LIZ[c382840Ezi.LIZ.ordinal()] != 2) {
            C786410Ut5.LL(8, (ConstraintLayout) this.LLLII.getValue());
        } else if (c382840Ezi.LIZIZ || ((View) this.LLLI.getValue()).getVisibility() != 0) {
            C786410Ut5.LL(8, (ConstraintLayout) this.LLLII.getValue());
        } else {
            C786410Ut5.LL(c382840Ezi.LJIJJ ? 8 : 0, (ConstraintLayout) this.LLLII.getValue());
        }
    }

    public final void LLLLLL() {
        String string;
        if (!LLLLILI().LIZ.LJIJI) {
            LLLLLLJ((View) this.LLJJJIL.getValue(), (ConstraintLayout) this.LLJJLIIIJLLLLLLLZ.getValue(), (TuxIconView) this.LLJJJJJIL.getValue(), (C1826510xdB) this.LLJJJJLIIL.getValue(), (TuxTextView) this.LLJJL.getValue(), new AwS549S0100000_5(this, 219), new AwS584S0100000_5(this, 228), new AwS549S0100000_5(this, 220), EnumC381060Ewq.LLILLJJLI, 96, true);
            LLLLLJIL();
            return;
        }
        C786410Ut5.LJZL(0, (LinearLayout) this.LLJJJIL.getValue());
        C786410Ut5.LL(0, (ConstraintLayout) this.LLJJLIIIJLLLLLLLZ.getValue());
        C786410Ut5.LLLLZLL((TuxTextView) this.LLJJJJ.getValue(), 0);
        ((C1826510xdB) this.LLJJJJLIIL.getValue()).LIZJ();
        C786410Ut5.x1((C1826510xdB) this.LLJJJJLIIL.getValue(), 8);
        C786410Ut5.LLLLZLL((TuxTextView) this.LLJJL.getValue(), 0);
        TextView textView = (TextView) this.LLJJL.getValue();
        Context sceneContext = getSceneContext();
        if (sceneContext == null || (string = sceneContext.getString(2131825349)) == null) {
            string = "Keep as Original";
        }
        textView.setText(string);
        C786410Ut5.LLLLLLZZ((TuxIconView) this.LLJJJJJIL.getValue(), 8);
        C786410Ut5.Y7((ConstraintLayout) this.LLJJLIIIJLLLLLLLZ.getValue(), null);
        LLLLLJIL();
    }

    public final void LLLLLLIL() {
        Context sceneContext = getSceneContext();
        if (sceneContext != null) {
            LLLLLLJ((View) this.LLJLL.getValue(), (ConstraintLayout) this.LLJZIJLIL.getValue(), (TuxIconView) this.LLJLLIL.getValue(), (C1826510xdB) this.LLJLLL.getValue(), (TuxTextView) this.LLJZ.getValue(), new AwS406S0200000_5(sceneContext, this, 34), new AwS584S0100000_5(this, 229), new AwS549S0100000_5(this, 221), EnumC381060Ewq.LL, null, true);
        }
    }

    public final void LLLLLLLLLL() {
        Integer numValueOf;
        String string;
        C1782390wU1 c1782390wU1;
        String str;
        String string2;
        C1782390wU1 c1782390wU12;
        String str2;
        Context sceneContext = getSceneContext();
        if (sceneContext == null) {
            return;
        }
        List<Integer> list = LLLLILI().LIZ.LJJ;
        if (list.isEmpty()) {
            return;
        }
        Integer num = LLLLILI().LIZ.LJJIFFI;
        String str3 = null;
        if (num == null || num.intValue() <= 0) {
            Integer num2 = LLLLILI().LIZ.LJIIL;
            if (num2 == null) {
                return;
            } else {
                numValueOf = (Integer) C13LP.LJJJLZIJ(num2.intValue(), list);
            }
        } else {
            numValueOf = Integer.valueOf(num.intValue() / LSPassThroughRecordSizeConfig.DEFAULT);
        }
        if (numValueOf != null) {
            numValueOf.intValue();
            List listLJFF = C379370Eu7.LJFF(sceneContext, list);
            Integer numValueOf2 = Integer.valueOf(list.indexOf(numValueOf));
            if (numValueOf2.intValue() < 0 || (c1782390wU12 = (C1782390wU1) C13LP.LJJJLZIJ(numValueOf2.intValue(), listLJFF)) == null || (str2 = c1782390wU12.LIZ) == null || (string = a0.LJLIIIL(str2).toString()) == null || string.length() <= 0) {
                string = null;
            }
            Integer num3 = LLLLILI().LIZ.LJIIL;
            if (num3 != null && (c1782390wU1 = (C1782390wU1) C13LP.LJJJLZIJ(num3.intValue(), listLJFF)) != null && (str = c1782390wU1.LIZ) != null && (string2 = a0.LJLIIIL(str).toString()) != null && string2.length() > 0) {
                str3 = string2;
            }
            if (string == null) {
                if (str3 == null) {
                    return;
                } else {
                    string = str3;
                }
            }
            ((C1826510xdB) this.LLJLLL.getValue()).LJI(string);
        }
    }

    public final void LLLLLLL(Integer num) {
        String string;
        Context sceneContext;
        String string2;
        if (!LLLLILI().LIZ.LJIJI && num != null) {
            int iIntValue = num.intValue();
            List<String> listLIZJ = LLLLILI().LIZ.LJIL;
            if (listLIZJ.isEmpty()) {
                listLIZJ = C379370Eu7.LIZJ();
            }
            String str = (String) C13LP.LJJJLZIJ(iIntValue, listLIZJ);
            if (str != null) {
                string = a0.LJLIIIL(str).toString();
            } else {
                string = null;
            }
            TextView textView = (TextView) this.LLJJL.getValue();
            if (string != null && string.length() != 0) {
                if (Intrinsics.LJFF(string, "keep_ratio") && (sceneContext = getSceneContext()) != null && (string2 = sceneContext.getString(2131825349)) != null) {
                    string = string2;
                }
            } else {
                string = "";
            }
            textView.setText(string);
        }
    }

    public final void LLLLLLLLL(Integer num) {
        String str;
        C1782390wU1 c1782390wU1;
        if (num != null) {
            int iIntValue = num.intValue();
            List<Integer> list = LLLLILI().LIZ.LJJ;
            TextView textView = (TextView) this.LLJZ.getValue();
            Context sceneContext = getSceneContext();
            if (sceneContext == null || (c1782390wU1 = (C1782390wU1) C13LP.LJJJLZIJ(iIntValue, C379370Eu7.LJFF(sceneContext, list))) == null || (str = c1782390wU1.LIZ) == null) {
                str = "";
            }
            textView.setText(str);
            Integer num2 = (Integer) C13LP.LJJJLZIJ(iIntValue, list);
            if (num2 != null) {
                num2.intValue();
            }
        }
    }

    public final void LLLLLLLZIL(EnumC378720Et4 enumC378720Et4) {
        int i = C381050Ewp.LIZ[enumC378720Et4.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                C786410Ut5.LJZL(0, (LinearLayout) this.LLJLL.getValue());
                C786410Ut5.LJZL(8, (LinearLayout) this.LLL.getValue());
                LinearLayout linearLayout = (LinearLayout) this.LLLI.getValue();
                if (LLLLILI().LIZ.LIZIZ) {
                    i2 = 8;
                }
                C786410Ut5.LJZL(i2, linearLayout);
            }
        } else {
            C786410Ut5.LJZL(8, (LinearLayout) this.LLJLL.getValue());
            LinearLayout linearLayout2 = (LinearLayout) this.LLL.getValue();
            if (!LLLLILI().LIZ.LJIIJJI) {
                i2 = 8;
            }
            C786410Ut5.LJZL(i2, linearLayout2);
            C786410Ut5.LJZL(8, (LinearLayout) this.LLLI.getValue());
        }
        LLLLLJLJLL();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = this.mView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zg);
        view.setBackground(c384050F3z.LIZ(requireSceneContext()));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ezo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382840Ezi) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 225));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F13
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382840Ezi) obj).LJIIJJI);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 227));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F14
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382840Ezi) obj).LJIJ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 230));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F15
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382840Ezi) obj).LJIJI);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 232));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F17
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382840Ezi) obj).LJIJJ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 231));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F16
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382840Ezi) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 233));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Ezz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382840Ezi) obj).LJI;
            }
        }, new AwS584S0100000_5(this, 234));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F1B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382840Ezi) obj).LJIL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 235));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F1C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382840Ezi) obj).LJJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 236));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F19
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382840Ezi) obj).LJFF;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 237));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F1A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382840Ezi) obj).LJIIL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 238));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F18
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382840Ezi) obj).LJJIFFI;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 218));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ezp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382840Ezi) obj).LJIILIIL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 221));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F00
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382840Ezi) obj).LJIIIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 224));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Ezq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382840Ezi) obj).LJIILJJIL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 226));
        LLLLLL();
        LLLLLLIL();
        C786410Ut5.R7((LinearLayout) this.LLJLIL.getValue(), new ACListenerS140S0100000_5(this, 13));
        C786410Ut5.R7((LinearLayout) this.LLLFF.getValue(), new ACListenerS140S0100000_5(this, 14));
        C786410Ut5.R7((LinearLayout) this.LLLFFI.getValue(), new ACListenerS140S0100000_5(this, 15));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c4f, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLLLLLJ(android.view.View r6, androidx.constraintlayout.widget.ConstraintLayout r7, com.bytedance.tux.icon.TuxIconView r8, X.C1826510xdB r9, com.bytedance.tux.input.TuxTextView r10, kotlin.jvm.functions.Function0 r11, final kotlin.jvm.functions.Function1 r12, kotlin.jvm.functions.Function0 r13, X.EnumC381060Ewq r14, java.lang.Integer r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F11.LLLLLLJ(android.view.View, androidx.constraintlayout.widget.ConstraintLayout, com.bytedance.tux.icon.TuxIconView, X.0xdB, com.bytedance.tux.input.TuxTextView, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, X.0Ewq, java.lang.Integer, boolean):void");
    }
}
