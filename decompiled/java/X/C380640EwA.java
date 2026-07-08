package X;

import Y.ACListenerS140S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0EwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380640EwA extends AbstractC1664490tPr<C380590Ew5, C380620Ew8> {
    public C380650EwB LLJJJJJIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 258));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 259));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 256));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 257));
    public C357590E0f LLJJLIIIJLLLLLLLZ = new C357590E0f(null, null, null, null, null, null, null, 127);
    public C357590E0f LLJL = new C357590E0f(null, null, null, null, null, null, null, 127);
    public List<C357590E0f> LLJLIL = C13BV.INSTANCE;

    public final View LLLLLJIL() {
        return (View) this.LLJJJJLIIL.getValue();
    }

    public final View LLLLLJLJLL() {
        return (View) this.LLJJL.getValue();
    }

    public final C362510EJd LLLLLL() {
        return (C362510EJd) this.LLJJJIL.getValue();
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        View view = this.mView;
        if (view == null) {
            return;
        }
        LLLLLJLJLL().animate().cancel();
        HandlerHook.viewPost(view, new ARunnableS105S0100000_5(this, 32));
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        LLLLLJLJLL().animate().cancel();
        C786410Ut5.LJLLLLLL(8, LLLLLJIL());
        C786410Ut5.T4(LLLLLJIL(), 0.0f);
        C786410Ut5.LJLLLLLL(4, LLLLLJLJLL());
        C786410Ut5.ed(LLLLLJLJLL(), LLLLLJLJLL().getHeight());
    }

    public final void LLLLLLIL(EnumC378720Et4 enumC378720Et4) {
        this.LLJLILLLLZIIL = true;
        if (enumC378720Et4 != null && C379500EuK.LIZ[enumC378720Et4.ordinal()] == 1) {
            LLLLLL().LIZJ(this.LLJL);
        } else {
            LLLLLL().LIZJ(this.LLJJLIIIJLLLLLLLZ);
        }
        this.LLJLILLLLZIIL = false;
    }

    public final void LLLLLLJ(List<C380190EvR> list) {
        int i;
        String str;
        C380650EwB c380650EwB;
        C380190EvR c380190EvRLIZ;
        ArrayList<C380190EvR> arrayList = new ArrayList();
        Iterator<C380190EvR> it2 = list.iterator();
        while (true) {
            i = 1;
            if (!it2.hasNext()) {
                break;
            }
            C380190EvR next = it2.next();
            if (next.LJIIJ != null) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C380190EvR c380190EvR : list) {
            if (c380190EvR.LJIIIZ != null) {
                arrayList2.add(c380190EvR);
            }
        }
        if (C307460C3k.LIZIZ()) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (C380190EvR c380190EvR2 : arrayList) {
                if (c380190EvR2.LJII) {
                    c380190EvRLIZ = C380190EvR.LIZ(c380190EvR2, (String) C2505909rt.LIZ.getValue(), 0, 0, 4093);
                } else {
                    c380190EvRLIZ = C380190EvR.LIZ(c380190EvR2, (String) C2506109rv.LIZ.getValue(), 0, 0, 4093);
                }
                arrayList3.add(c380190EvRLIZ);
            }
            arrayList = arrayList3;
        }
        this.LLJJJJJIL = new C380650EwB(C786410Ut5.N3(((View) this.LLJJJJ.getValue()).getContext()), C1697810uHb.LJIIJJI(new C380660EwC(this.LLJJLIIIJLLLLLLLZ, arrayList), new C380660EwC(this.LLJL, arrayList2)), new AwS619S0100000_5(this, 10));
        C380190EvR c380190EvR3 = LLLLILI().LIZ.LIZIZ;
        if (c380190EvR3 != null && (str = c380190EvR3.LIZJ) != null && (c380650EwB = this.LLJJJJJIL) != null) {
            c380650EwB.LJJIJIL(str);
        }
        this.LLJLILLLLZIIL = true;
        ((ViewPager) this.LLJJJJ.getValue()).setAdapter(this.LLJJJJJIL);
        ViewPager viewPager = (ViewPager) this.LLJJJJ.getValue();
        EnumC378720Et4 enumC378720Et4 = LLLLILI().LIZ.LIZLLL;
        if (enumC378720Et4 == null || C379500EuK.LIZ[enumC378720Et4.ordinal()] != 1) {
            i = 0;
        }
        viewPager.setCurrentItem(i);
        LLLLLL().LJ((ViewPager) this.LLJJJJ.getValue(), this.LLJLIL);
        this.LLJLILLLLZIIL = false;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        super.onActivityCreated(bundle);
        C362490EJb c362490EJb = new C362490EJb(null, false, 0, null, 0, 0, 0, null, 0, null, 0, false, false, false, null, false, false, false, false, null, 1073741823);
        C362510EJd c362510EJdLLLLLL = LLLLLL();
        c362510EJdLLLLLL.LLILZ = c362490EJb;
        if (!c362510EJdLLLLLL.LLILLL) {
            ConstraintLayout tabContainerFromXml = c362510EJdLLLLLL.getTabContainerFromXml();
            if (tabContainerFromXml != null && (layoutParams = tabContainerFromXml.getLayoutParams()) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c362510EJdLLLLLL.LLILZ.LJI)));
            }
            c362510EJdLLLLLL.LLILLL = true;
        }
        this.LLJJLIIIJLLLLLLLZ = new C357590E0f(getString(2131825420), "aiCreate_models_tab_createVideo", null, null, null, null, null, 124);
        C357590E0f c357590E0f = new C357590E0f(getString(2131825419), "aiCreate_models_tab_createImage", null, null, null, null, null, 124);
        this.LLJL = c357590E0f;
        this.LLJLIL = C1697810uHb.LJIIJJI(this.LLJJLIIIJLLLLLLLZ, c357590E0f);
        LLLLLL().setOnTabSelected(null);
        LLLLLLJ(LLLLILI().LIZ.LIZJ);
        LLLLLLIL(LLLLILI().LIZ.LIZLLL);
        LLLLLL().setOnTabSelected(new AwS584S0100000_5(this, 261));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EwF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C380590Ew5) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 258));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EwD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C380590Ew5) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 259));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EwE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C380590Ew5) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 260));
        C786410Ut5.I7(new ACListenerS140S0100000_5(this, 20), LLLLLJIL());
        C786410Ut5.LJLLLLLL(8, LLLLLJIL());
        C786410Ut5.T4(LLLLLJIL(), 0.0f);
        C786410Ut5.LJLLLLLL(4, LLLLLJLJLL());
        if (LLLLLJLJLL().getParent() != null) {
            HandlerHook.viewPost(LLLLLJLJLL(), new ARunnableS105S0100000_5(this, 31));
        }
        View viewLLLLLJLJLL = LLLLLJLJLL();
        C384050F3z c384050F3z = new C384050F3z();
        float fLIZIZ = C418440Gaw.LIZIZ(16);
        c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zn);
        viewLLLLLJLJLL.setBackground(c384050F3z.LIZ(requireSceneContext()));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c4g, viewGroup, false);
    }
}
