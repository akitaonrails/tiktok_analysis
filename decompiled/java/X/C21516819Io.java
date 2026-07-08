package X;

import Y.ACListenerS166S0100000_32;
import Y.ARunnableS116S0100000_16;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS611S0100000_32;
import wh6.AbS711S0100000_32;

/* JADX INFO: renamed from: X.19Io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21516819Io extends AbstractC1664490tPr<C559320Lwg, C21516919Ip> {
    public int LLJJJJ;
    public C1397510mTF LLJJJJLIIL;
    public CountDownTimer LLJJL;
    public final int LLJJJIL = 3;
    public final SafeHandler LLJJJJJIL = new SafeHandler(this);
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 368));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 360));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 363));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 362));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 365));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 364));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 367));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 366));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 361));

    public final ViewGroup LLLLLJIL() {
        return (ViewGroup) this.LLJLLL.getValue();
    }

    public final ConstraintLayout LLLLLJLJLL() {
        return (ConstraintLayout) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final void LLLLLL() {
        LLLLIL().LIZLLL.invoke();
        C1397580mTM c1397580mTM = new C1397580mTM(requireActivity());
        c1397580mTM.LIZ(2131825635);
        C985403tE.LIZ(c1397580mTM, new AwS611S0100000_32(this, 186));
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        this.LLJJJJLIIL = c1397510mTF;
        c1397510mTF.LIZLLL();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        if (LLLLLJIL().getVisibility() == 0) {
            C786410Ut5.LJLZ(8, LLLLLJIL());
            LLLLIL().LJ.invoke(Boolean.FALSE, Integer.valueOf(this.LLJJJJ));
        }
    }

    public final void LLLLLLIL(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = LLLLLJLJLL().getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = i;
            C786410Ut5.m6(LLLLLJLJLL(), marginLayoutParams);
            if (C1462920oAk.LIZLLL()) {
                LLLLLJLJLL().setPadding(LLLLLJLJLL().getPaddingLeft(), 0, LLLLLJLJLL().getPaddingRight(), LLLLLJLJLL().getPaddingBottom());
                C1462920oAk.LIZJ(LLLLLJLJLL(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
            }
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Integer num = C1450870nrJ.LJI;
        if (num != null) {
            LLLLLLIL(num.intValue());
        }
        ((C1295960jpS) this.LLJZIJLIL.getValue()).setAnimation(R.raw.tux_lottie_common_creation_ailoading_hex_large);
        ((C1295960jpS) this.LLJZIJLIL.getValue()).setRepeatCount(-1);
        HandlerHook.viewPostDelay((View) this.LLJZIJLIL.getValue(), new ARunnableS116S0100000_16(this, 84), 200L);
        C786410Ut5.I7(new AbS711S0100000_32(this, 0), (View) this.LLJZ.getValue());
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.19Iq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }, (View) this.LLJLL.getValue());
        C786410Ut5.Ua((C418740GbQ) this.LLJL.getValue(), new ACListenerS166S0100000_32(this, 42));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Lwk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C559320Lwg) obj).LIZ;
            }
        }, new AwS611S0100000_32(this, 190));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Lwl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C559320Lwg) obj).LIZIZ;
            }
        }, new AwS595S0100000_16(this, 156));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Lwh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C559320Lwg) obj).LIZLLL;
            }
        }, new AwS595S0100000_16(this, 155));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Lwi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C559320Lwg) obj).LJ;
            }
        }, new AwS611S0100000_32(this, 185));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0Lwj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C559320Lwg) obj).LJFF;
            }
        }, new AwS611S0100000_32(this, 189));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.fs5, viewGroup, false);
    }
}
