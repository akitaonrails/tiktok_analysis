package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0F0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383030F0b extends AbstractC1664490tPr<C382650EzP, C0F0H> implements InterfaceC484050IyZ {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 275));
    public C383070F0f LLJJJJ;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        InterfaceC524950KiL interfaceC524950KiL;
        super.onActivityCreated(bundle);
        C128Y c128yLIZIZ = C372650EjH.LIZIZ(this);
        if ((c128yLIZIZ instanceof InterfaceC524950KiL) && (interfaceC524950KiL = (InterfaceC524950KiL) c128yLIZIZ) != null) {
            interfaceC524950KiL.Qh(this);
        }
        C383070F0f c383070F0f = new C383070F0f(this.mView, LLLLIL().LJFF, LLLLIL().LJI, LLLLIL().LJII);
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0F0P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382650EzP) obj).LIZIZ;
            }
        }), new AwS584S0100000_5(c383070F0f, 271));
        c383070F0f.LJ = new InterfaceC383170F0p() { // from class: X.0F0I
            @Override // X.InterfaceC383170F0p
            public final void LIZ(List<C379170Etn> list) {
                C376260Ep6 c376260Ep6;
                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                ViewPropertyAnimator viewPropertyAnimatorAlpha;
                ViewPropertyAnimator duration;
                C376260Ep6 c376260Ep62;
                ViewPropertyAnimator viewPropertyAnimatorAnimate2;
                ViewPropertyAnimator viewPropertyAnimatorAlpha2;
                ViewPropertyAnimator duration2;
                this.LIZ.LLLLIL().LIZJ.invoke(list);
                if (list.isEmpty()) {
                    Scene scene = this.LIZ.mParentScene;
                    if ((scene instanceof C376260Ep6) && (c376260Ep62 = (C376260Ep6) scene) != null && c376260Ep62.LLLF) {
                        c376260Ep62.LLLF = false;
                        View view = (View) c376260Ep62.LLJJLIIIJLLLLLLLZ.getValue();
                        if (view != null && (viewPropertyAnimatorAnimate2 = view.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(0.8f)) != null && (duration2 = viewPropertyAnimatorAlpha2.setDuration(1000L)) != null) {
                            duration2.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                Scene scene2 = this.LIZ.mParentScene;
                if (!(scene2 instanceof C376260Ep6) || (c376260Ep6 = (C376260Ep6) scene2) == null || c376260Ep6.LLLF) {
                    return;
                }
                c376260Ep6.LLLF = true;
                View view2 = (View) c376260Ep6.LLJJLIIIJLLLLLLLZ.getValue();
                if (view2 == null || (viewPropertyAnimatorAnimate = view2.animate()) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(1000L)) == null) {
                    return;
                }
                duration.start();
            }

            @Override // X.InterfaceC383170F0p
            public final void LIZJ(int i) {
                this.LIZ.LLLLIL().LIZ.invoke(Integer.valueOf(i));
            }

            @Override // X.InterfaceC383170F0p
            public final Object LIZIZ(List<String> list, InterfaceC1364105Vn<? super List<C378700Et2>> interfaceC1364105Vn) {
                return this.LIZ.LLLLIL().LIZLLL.invoke(list, interfaceC1364105Vn);
            }
        };
        c383070F0f.LJFF = new InterfaceC383270F0z() { // from class: X.0F0d
            @Override // X.InterfaceC383270F0z
            public final void LIZ(String str) {
                this.LIZ.LLLLIL().LIZIZ.invoke(str);
            }
        };
        boolean z = !LLLLILI().LIZ.LJIIIIZZ;
        C383080F0g c383080F0g = c383070F0f.LJIIIZ;
        C383650F2l c383650F2l = c383080F0g.LIZLLL;
        c383650F2l.LIZIZ().setClickable(z);
        c383650F2l.LIZIZ().setFocusable(z);
        C383640F2k c383640F2k = c383080F0g.LJ;
        c383640F2k.LIZIZ().setClickable(z);
        c383640F2k.LIZIZ().setFocusable(z);
        this.LLJJJJ = c383070F0f;
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0F0Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382650EzP) obj).LIZLLL;
            }
        }, new AwS584S0100000_5(this, 274));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0F0Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382650EzP) obj).LJ;
            }
        }, new AwS584S0100000_5(this, 275));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0F0a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C382650EzP) obj).LJFF;
            }
        }, new AwS584S0100000_5(this, 276));
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0F0X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382650EzP) obj).LJII);
            }
        }), new AwS584S0100000_5(this, 277));
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0F0e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382650EzP) obj).LJIIIIZZ);
            }
        }), new AwS584S0100000_5(this, 272));
        LLLLJ(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0F0W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C382650EzP) obj).LJIIIZ);
            }
        }), new AwS584S0100000_5(this, 273));
    }

    @Override // X.InterfaceC484050IyZ
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        boolean z;
        if (i != 10008) {
            return false;
        }
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("key_ep_aigc_selected_image");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        } else {
            stringExtra = "";
        }
        if (stringExtra.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        LLLLIL().LJ.invoke();
        if (!z) {
            return false;
        }
        C383070F0f c383070F0f = this.LLJJJJ;
        if (c383070F0f != null) {
            c383070F0f.LIZ(C379220Ets.LIZ(stringExtra), LLLLILI().LIZ.LIZ);
        }
        return true;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c1n, viewGroup, false);
    }
}
