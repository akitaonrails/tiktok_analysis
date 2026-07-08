package X;

import Y.AObjectS247S0100000_29;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.FeatureAlsLogicContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11zf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19682911zf extends AbstractC1664490tPr<C19658711vl, C19683611zm> {
    public final FrameLayout LLJJJIL;
    public final FrameLayout LLJJJJ;
    public final C0FKI LLJJJJJIL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 481));
    public C388170FJv LLJJL;
    public C1DRG LLJJLIIIJLLLLLLLZ;
    public InterfaceC385890FBb LLJL;

    public final C0FWO LLLLLJIL() {
        C388170FJv c388170FJv = this.LLJJL;
        if (c388170FJv != null) {
            return c388170FJv.getApi();
        }
        return null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C385670FAf<Boolean> c385670FAfSM;
        super.onActivityCreated(bundle);
        C388170FJv c388170FJv = this.LLJJL;
        if (c388170FJv != null) {
            c388170FJv.LJIJJLI(LLLLILI().LIZ.LIZ, this.LLJJJJJIL, this);
        }
        C388170FJv c388170FJv2 = this.LLJJL;
        if (c388170FJv2 != null) {
            c388170FJv2.LJJIJIIJI(this.LLJJJIL.getLeft(), this.LLJJJJ.getRight() - this.LLJJJIL.getRight());
        }
        C1654320t9S.LIZIZ(this, AFwS283S0000000_35.get$arr$(98));
        C1664590tQ1.LIZLLL(this, null, false, AFwS273S0000000_29.get$arr$(158), 3);
        C1664600tQ2.LIZ(this, "TextEditPanelScene", new AwS608S0100000_29(this, 280));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            this.LLJJLIIIJLLLLLLLZ = c1drg;
            this.LLJL = (InterfaceC385890FBb) c1drg.LJIIL(null, InterfaceC385890FBb.class);
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11zj
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C19658711vl) obj).LIZJ;
                }
            }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 279));
            C388170FJv c388170FJv3 = this.LLJJL;
            if (c388170FJv3 != null) {
                c388170FJv3.setVisibilityChangeListener(new InterfaceC388330FKl() { // from class: X.11zg
                    @Override // X.InterfaceC388330FKl
                    public final void LJIIJJI(int i, int i2) {
                        if (i == i2) {
                            return;
                        }
                        this.LIZ.LLLLIL().LIZ.invoke(Integer.valueOf(i2));
                    }
                });
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11zl
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C19658711vl) obj).LIZ;
                }
            }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 258));
            InterfaceC385890FBb interfaceC385890FBb = this.LLJL;
            if (interfaceC385890FBb != null && (c385670FAfSM = interfaceC385890FBb.SM()) != null) {
                c385670FAfSM.LIZ(this, new AObjectS247S0100000_29(this, 63));
            }
            InterfaceC385890FBb interfaceC385890FBb2 = this.LLJL;
            if (interfaceC385890FBb2 != null) {
                interfaceC385890FBb2.GX1(new InterfaceC19682311zZ() { // from class: X.11zc
                    @Override // X.InterfaceC19682311zZ
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC19682311zZ
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC19682311zZ
                    public final void LIZ(Editable editable, boolean z) {
                        C0FPH editTextAction;
                        Function2<String, Editable, Unit> function2;
                        C0FGR c0fgrLIZJ;
                        if (z) {
                            return;
                        }
                        C0FF8 c0ff8 = (C0FF8) this.LIZ.LLJJJJLIIL.getValue();
                        if (c0ff8 != null && (c0fgrLIZJ = c0ff8.LIZJ()) != null) {
                            c0fgrLIZJ.LJIIJ(this.LIZ.LLLLILI().LIZ.LIZ);
                        }
                        C388170FJv c388170FJv4 = this.LIZ.LLJJL;
                        if (c388170FJv4 != null && (editTextAction = c388170FJv4.getEditTextAction()) != null && (function2 = editTextAction.LJIIIIZZ) != null) {
                            function2.invoke(String.valueOf(editable), editable);
                        }
                    }
                });
            }
            C388170FJv c388170FJv4 = this.LLJJL;
            if (c388170FJv4 != null) {
                c388170FJv4.setAlsOCContainer(this.LLJJLIIIJLLLLLLLZ);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public C19682911zf(FrameLayout frameLayout, FrameLayout frameLayout2, C0FKI c0fki) {
        this.LLJJJIL = frameLayout;
        this.LLJJJJ = frameLayout2;
        this.LLJJJJJIL = c0fki;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C388170FJv c388170FJv = new C388170FJv(requireSceneContext(), LLLLILI().LIZ.LIZIZ, this.LLJJJJ, this.LLJJJIL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c388170FJv);
        c388170FJv.setLayoutParams(layoutParams);
        C786410Ut5.k2(c388170FJv, 8);
        this.LLJJL = c388170FJv;
        return c388170FJv;
    }
}
