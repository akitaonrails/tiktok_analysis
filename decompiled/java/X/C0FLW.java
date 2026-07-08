package X;

import Y.ACListenerS140S0100000_5;
import Y.ALAdapterS2S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0FLW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FLW extends C0FKW {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public final ViewGroup LIZIZ;
    public final C388200FJy LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public final List<AddYoursStickerTopicRepoApi.AddYoursAutoSuggestTopicForText> LJIIIZ;
    public final C388620FLo LJIIJ;
    public final FrameLayout LJIIJJI;
    public boolean LJIIL;
    public C054G LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public AnimatorSet LJIILLIIL;

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() {
        this.LJIIL = false;
        this.LJIILJJIL = false;
        C2296808zG.LIZLLL(this.LJIILIIL, "");
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() {
        this.LJIIIIZZ = false;
        this.LJIIL = false;
        this.LJIILJJIL = false;
        this.LIZJ.LJIILLIIL = true;
    }

    @Override // X.C0FKW
    public final void LJIIJ() {
        this.LJIIIIZZ = true;
    }

    @Override // X.C0FKW
    public final void LJIIJJI() {
        this.LJIILJJIL = true;
        this.LJIIL = false;
    }

    @Override // X.C0FKW
    public final void LJIIIZ() {
        this.LIZJ.LJIIJ.LIZLLL(new AwS584S0100000_5(C0FHM.GONE, 1107), true);
    }

    @Override // X.C0FKW
    public final void LJIIL() {
        C0FKN c0fkn;
        InterfaceC388500FLc interfaceC388500FLc;
        InterfaceC388160FJu interfaceC388160FJuLJIIJ;
        if (!(Keva.getRepo("text_suggest_ay").getInt("count", 0) >= 10) || this.LIZJ.LJIIIZ.LJJ.LJ) {
            C388200FJy c388200FJy = this.LIZJ;
            if (!c388200FJy.LJIIZILJ && !c388200FJy.LJIJ) {
                C0FF8 c0ff8 = c388200FJy.LJFF;
                EnumC388580FLk enumC388580FLkS4 = (c0ff8 == null || (interfaceC388160FJuLJIIJ = c0ff8.LJIIJ()) == null) ? null : interfaceC388160FJuLJIIJ.S4();
                if (enumC388580FLkS4 != EnumC388580FLk.PANEL_EDITOR && enumC388580FLkS4 != EnumC388580FLk.ONLY_PANEL && C0F8Y.LJIILIIL(this.LIZJ.LJ.LIZ) && this.LIZJ.LJIILLIIL && ((c0fkn = (C0FKN) LJII(C13LE.LIZ(C0FKN.class))) == null || !c0fkn.LJIIJ() || this.LIZJ.LJIIIZ.LJJ.LJ)) {
                    Object objInvoke = C390410FSl.LIZ(this.LIZJ.LIZ).LIZLLL.invoke(EnumC1466150oFx.ADD_YOURS);
                    if ((objInvoke instanceof InterfaceC388500FLc) && (interfaceC388500FLc = (InterfaceC388500FLc) objInvoke) != null && interfaceC388500FLc.LLIIII()) {
                        this.LJIIIIZZ = true;
                        LJIIIZ();
                        return;
                    }
                    if (this.LJIIL || (!this.LJIILJJIL && this.LIZJ.LJIIIZ.LJJ.LJ)) {
                        this.LJIIIIZZ = true;
                        LJIIIZ();
                        return;
                    }
                    String strInvoke = this.LIZJ.LJIIL.LJIIJJI.invoke();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("TextEditAddYoursListAbility show, currentText: ");
                    sbLIZ.append(strInvoke);
                    C388320FKk.LIZ.i(C2188811AlT.LIZIZ(sbLIZ));
                    if (this.LIZJ.LJIIIZ.LJJ.LJ && this.LJIILJJIL && (strInvoke.length() == 0 || a0.LJJJIL(strInvoke))) {
                        LJIILIIL(strInvoke);
                        return;
                    }
                    if ((strInvoke.length() == 0) || a0.LJJJIL(strInvoke)) {
                        this.LJII = "";
                        C2296808zG.LIZLLL(this.LJIILIIL, "");
                        LJIIIZ();
                        return;
                    }
                    if (Intrinsics.LJFF(strInvoke, this.LJII) && (!((ArrayList) this.LJIIIZ).isEmpty())) {
                        LJIILJJIL();
                        return;
                    }
                    String str = this.LJII;
                    if (this.LIZIZ.getVisibility() != 0 && (!((ArrayList) this.LJIIIZ).isEmpty()) && (true ^ a0.LJJJIL(str))) {
                        LJIILJJIL();
                    }
                    this.LJII = strInvoke;
                    InterfaceC390170FRn interfaceC390170FRn = this.LIZJ.LJI;
                    if (interfaceC390170FRn != null) {
                        interfaceC390170FRn.LJFF();
                    }
                    C2296808zG.LIZLLL(this.LJIILIIL, "");
                    C1DFH c1dfh = C0PEM.LIZ;
                    C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ);
                    this.LJIILIIL = c054gLIZ;
                    C23250099c.LIZLLL(c054gLIZ, null, null, new C0FLX(this, strInvoke, str, null), 3);
                    return;
                }
            }
        }
        LJIIIZ();
    }

    public final void LJIILJJIL() {
        if (this.LIZJ.LJIIJ.LIZ(new C2217381BqS() { // from class: X.0FLZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387990FJd) obj).LIZ;
            }
        }).LIZJ() != C0FHM.VISIBLE) {
            return;
        }
        if (this.LJIILL) {
            this.LIZIZ.animate().cancel();
        }
        if (this.LIZIZ.getVisibility() == 0) {
            return;
        }
        C388490FLb.LIZ(this.LIZIZ);
        C786410Ut5.LJLZ(0, this.LIZIZ);
        int iLJFF = C1919207fS.LJFF();
        C786410Ut5.R4(0.0f, this.LIZIZ);
        C786410Ut5.bd(iLJFF, this.LIZIZ);
        this.LIZIZ.animate().alpha(1.0f).translationY(0.0f).setDuration(200L).setInterpolator(C1619980sG4.LJIILIIL()).setListener(null).start();
    }

    public final void LJIILL() {
        View view;
        Object parent = this.LIZIZ.getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return;
        }
        AnimatorSet animatorSet = this.LJIILLIIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LJIILLIIL = null;
        C786410Ut5.T4(view, 0.0f);
        C786410Ut5.ed(view, C418440Gaw.LIZIZ(48));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, C418440Gaw.LIZIZ(48), 0.0f);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJ());
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet2.addListener(new ALAdapterS2S0100000_5(view, 32));
        this.LJIILLIIL = animatorSet2;
        C786410Ut5.LJLZ(0, this.LIZIZ);
        AnimatorSet animatorSet3 = this.LJIILLIIL;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    @Override // X.C0FKW
    public final boolean LJIIIIZZ() {
        return this.LJIILJJIL;
    }

    public final void LJIILIIL(String str) {
        if (!((ArrayList) this.LJIIIZ).isEmpty()) {
            LJIILL();
            return;
        }
        C388320FKk.LIZ.d("showRecommendTopicWhenTextEmpty");
        this.LJII = str;
        InterfaceC390170FRn interfaceC390170FRn = this.LIZJ.LJI;
        if (interfaceC390170FRn != null) {
            interfaceC390170FRn.LJFF();
        }
        C2296808zG.LIZLLL(this.LJIILIIL, "");
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        this.LJIILIIL = c054gLIZ;
        C23250099c.LIZLLL(c054gLIZ, null, null, new C0FLY(this, str, null), 3);
    }

    public C0FLW(ViewGroup viewGroup, C388200FJy c388200FJy) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(c388200FJy);
        this.LIZIZ = viewGroup;
        this.LIZJ = c388200FJy;
        this.LIZLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1567));
        this.LJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1570));
        this.LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1569));
        this.LJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1566));
        this.LJII = "";
        ArrayList arrayList = new ArrayList();
        this.LJIIIZ = arrayList;
        C388620FLo c388620FLo = (C388620FLo) viewGroup.findViewById(R.id.xm3);
        this.LJIIJ = c388620FLo;
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.db1);
        this.LJIIJJI = frameLayout;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJIILIIL = C2296808zG.LIZ(C2107308Nj.LIZ);
        C388980FMy c388980FMy = C388980FMy.LIZ;
        C390130FRj c390130FRj = new C390130FRj(this);
        c388980FMy.getClass();
        C388980FMy.LIZ(arrayList, c388620FLo, c390130FRj, true);
        if (c388200FJy.LJIIIZ.LJJ.LJ) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.X5(marginLayoutParams, this.LIZIZ);
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C1919207fS.LJIIJJI());
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e4);
        frameLayout.setBackground(c384050F3z.LIZ(frameLayout.getContext()));
        TuxIconView tuxIconView = new TuxIconView(frameLayout.getContext(), null, 0, 6, null);
        C01GW c01gw = C1919207fS.LJIIJJI;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(((Number) c01gw.getValue()).intValue(), ((Number) c01gw.getValue()).intValue());
        layoutParams2.gravity = 17;
        C786410Ut5.M6(tuxIconView, layoutParams2);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_x_mark;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        tuxIconView.setTuxIcon(c419910GdJ);
        frameLayout.addView(tuxIconView);
        C786410Ut5.O7(frameLayout, new ACListenerS140S0100000_5(this, 148));
        c388200FJy.LJIIJ.LIZ(new C2217381BqS() { // from class: X.0FLa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387990FJd) obj).LIZ;
            }
        }).LJIIIZ(c388200FJy.LIZLLL, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1114));
    }
}
