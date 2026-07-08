package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.logic.SoundEffectTabModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11ei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19553011ei extends AbstractC1664490tPr<C19553411em, InterfaceC19552911eh> {
    public Pair<Integer, Integer> LLJJJJJIL;
    public C19553511en LLJJLIIIJLLLLLLLZ;
    public C19561611g6 LLJLIL;
    public ViewPager LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public FrameLayout LLJLLL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(286));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(285));
    public int LLJJJJLIIL = 1;
    public final ArrayList<SoundEffectTabModel> LLJJL = new ArrayList<>();
    public final C19552811eg LLJL = new InterfaceC19556411fG() { // from class: X.11eg
        @Override // X.InterfaceC19556411fG
        public final void LIZIZ(Pair pair, C19556311fF c19556311fF) {
            int iIntValue = ((Number) pair.getFirst()).intValue();
            C19553011ei c19553011ei = this.LIZ;
            if (iIntValue != c19553011ei.LLJJJJLIIL) {
                return;
            }
            C19552511ed c19552511ed = (C19552511ed) c19553011ei.LLJJJIL.getValue();
            String strLIZ = C356670Dyb.LIZ(c19556311fF.LIZ);
            AwS273S0300000_29 awS273S0300000_29 = new AwS273S0300000_29(pair, (Pair<Integer, Integer>) c19556311fF, (C19556311fF) this.LIZ, (C19553011ei) 12);
            if (!c19552511ed.LIZLLL.contains(strLIZ)) {
                c19552511ed.LIZLLL.add(strLIZ);
                awS273S0300000_29.invoke();
            }
        }

        @Override // X.InterfaceC19556411fG
        public final void LIZ(Pair pair, EnumC19554011es enumC19554011es, C19556311fF c19556311fF) {
            String str;
            if (c19556311fF == null) {
                return;
            }
            SoundEffectTabModel soundEffectTabModel = (SoundEffectTabModel) C13LP.LJJJLZIJ(((Number) pair.getFirst()).intValue(), this.LIZ.LLJJL);
            if (soundEffectTabModel == null || (str = soundEffectTabModel.name) == null) {
                str = "";
            }
            int i = C19553911er.LIZ[enumC19554011es.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.LIZ.LLLLIL().LJII(pair, c19556311fF);
                            return;
                        }
                        throw new C1954807lC();
                    }
                    this.LIZ.LLLLIL().LIZLLL(pair, c19556311fF, str);
                    return;
                }
                this.LIZ.LLLLIL().LIZ(pair, c19556311fF, str);
                return;
            }
            C19553011ei c19553011ei = this.LIZ;
            c19553011ei.LLLLIL().LJI(c19553011ei.LLJJJJJIL, pair, c19556311fF, str);
            this.LIZ.LLJJJJJIL = pair;
        }
    };
    public final C01GW LLJZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(284));

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C19553511en c19553511en = this.LLJJLIIIJLLLLLLLZ;
        if (c19553511en != null) {
            int size = c19553511en.LLILZLL.size();
            for (int i = 0; i < size; i++) {
                C19554311ev c19554311evValueAt = c19553511en.LLILZLL.valueAt(i);
                c19554311evValueAt.LJFF.dispose();
                c19554311evValueAt.LJ.release();
            }
        }
        ((C19552511ed) this.LLJJJIL.getValue()).LJFF = null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numLIZJ;
        ViewGroup.MarginLayoutParams marginLayoutParamsLJI;
        C0E55 player;
        ViewGroup.MarginLayoutParams marginLayoutParamsLJI2;
        super.onViewCreated(view, bundle);
        C19561611g6 c19561611g6 = (C19561611g6) requireViewById(R.id.wz8);
        this.LLJLIL = c19561611g6;
        if (c19561611g6 != null) {
            c19561611g6.setSupportCustomIndicator(false);
        }
        this.LLJLILLLLZIIL = (ViewPager) requireViewById(R.id.viewpager);
        this.LLJLL = requireViewById(R.id.pp3);
        this.LLJLLL = (FrameLayout) requireViewById(R.id.pp_);
        View viewRequireViewById = requireViewById(R.id.vv6);
        this.LLJLLIL = viewRequireViewById;
        if (viewRequireViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewRequireViewById);
        }
        Context contextLIZIZ = C545820Lau.LIZIZ(this);
        if (contextLIZIZ != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bn, contextLIZIZ)) != null) {
            int iIntValue = numLIZJ.intValue();
            if (((Boolean) this.LLJZ.getValue()).booleanValue()) {
                FrameLayout frameLayout = this.LLJLLL;
                if (frameLayout != null) {
                    C0EG9.LIZ(frameLayout, new AwS573S0100000_29(this, 710));
                }
                View view2 = this.LLJLL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                FrameLayout frameLayout2 = this.LLJLLL;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(0, frameLayout2);
                }
                C19561611g6 c19561611g62 = this.LLJLIL;
                if (c19561611g62 != null && (marginLayoutParamsLJI2 = C1383370m6R.LJI(c19561611g62)) != null) {
                    marginLayoutParamsLJI2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                }
            } else {
                requireViewById(R.id.volume_panel_layout_content).setBackgroundColor(iIntValue);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{iIntValue, 0});
                gradientDrawable.setShape(0);
                View view3 = this.LLJLL;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
                FrameLayout frameLayout3 = this.LLJLLL;
                if (frameLayout3 != null) {
                    C786410Ut5.LJZ(8, frameLayout3);
                }
                View view4 = this.LLJLL;
                if (view4 != null) {
                    view4.setBackground(gradientDrawable);
                }
                View view5 = this.LLJLL;
                if (view5 != null) {
                    C786410Ut5.I7(new ACListenerS163S0100000_29(this, 150), view5);
                }
                C19561611g6 c19561611g63 = this.LLJLIL;
                if (c19561611g63 != null && (marginLayoutParamsLJI = C1383370m6R.LJI(c19561611g63)) != null) {
                    marginLayoutParamsLJI.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
                }
            }
            C1428470nHB.LJIILL((VideoPublishEditModel) this.LLJJJJ.getValue());
            LLLLIL().LIZJ();
            C0E48 c0e48LIZIZ = LLLLIL().LIZIZ();
            if (c0e48LIZIZ != null && (player = c0e48LIZIZ.getPlayer()) != null) {
                player.pause(false);
            }
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11el
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19553411em) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 431));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11ej
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19553411em) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 432));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11ek
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19553411em) obj).LIZIZ;
            }
        }, new AwS584S0100000_5(this, 343));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (((Boolean) this.LLJZ.getValue()).booleanValue()) {
            i = R.layout.c2b;
        } else {
            i = R.layout.c2a;
        }
        return (ViewGroup) C786410Ut5.Sd(i, layoutInflater, null);
    }
}
