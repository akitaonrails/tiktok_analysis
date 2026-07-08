package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS98S0200000_29;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectViewModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.119f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194541119f extends AbstractC1643610ssB<FTCEditAudioEffectViewModel> implements InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final int LLJ = R.id.mhi;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1119));
    public final AwS573S0100000_29 LLJIJIL = new AwS573S0100000_29(this, 1120);

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        C19A3 c19a3;
        final C119X c119x = (C119X) this.LLJI.getValue();
        Scene scene = c119x.mParentScene;
        if ((scene instanceof C19A3) && (c19a3 = (C19A3) scene) != null) {
            c19a3.show(c119x);
        }
        c119x.LLJJJ = ((InterfaceC1455860nzM) c119x.LLJJJJLIIL.getValue()).g().getValue();
        FrameLayout frameLayout = c119x.LLJJJIL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C786410Ut5.LJJJJIZL(frameLayout);
        Activity activity = c119x.mActivity;
        FrameLayout frameLayout2 = c119x.LLJJJIL;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        if (c119x.LLJIJIL == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(activity), R.layout.uz, frameLayout2, false);
            c119x.LLJIJIL = viewTd;
            if (viewTd != null) {
                viewTd.findViewById(R.id.zjo);
            }
            View view = c119x.LLJIJIL;
            c119x.LLJJIJIL = new C194544119i(view != null ? (FrameLayout) view.findViewById(R.id.me5) : null);
            c119x.LLJILJIL = c119x.LLJIJIL.findViewById(R.id.voice_conversion_bottom_sheet);
            C786410Ut5.I7(new ACListenerS163S0100000_29(c119x, 317), c119x.LLJIJIL.findViewById(R.id.voice_touch_outside));
            c119x.LLJILJILJ = (RecyclerView) c119x.LLJIJIL.findViewById(R.id.voice_list);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(c119x.mActivity, 0, false);
            c119x.LLJJIII = linearLayoutManager;
            RecyclerView recyclerView = c119x.LLJILJILJ;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(linearLayoutManager);
            }
            C119K c119k = new C119K((C19GS) c119x.mActivity, c119x.LLJJJ, c119x.LLLII(), c119x.LLLII().getVeAudioEffectParam(), (InterfaceC1455860nzM) c119x.LLJJJJLIIL.getValue());
            c119x.LLJJI = c119k;
            c119k.LLJILJIL = c119x;
            RecyclerView recyclerView2 = c119x.LLJILJILJ;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(c119k);
            }
            c119x.LLLIILIL(C1446160nji.LIZ(), false);
            C2296208zA.LIZ().LIZIZ(new InterfaceC2247808rM() { // from class: X.119c
                @Override // X.InterfaceC2247808rM
                public final void LIZIZ(int i, String str) {
                }

                @Override // X.InterfaceC2247808rM
                public final void LIZJ() {
                }

                @Override // X.InterfaceC2247808rM
                public final void LIZLLL(List<? extends List<? extends Effect>> list) {
                }

                @Override // X.InterfaceC2247808rM
                public final void LIZ(CategoryPageModel categoryPageModel) {
                    C119X c119x2 = c119x;
                    RecyclerView recyclerView3 = c119x2.LLJILJILJ;
                    if (recyclerView3 != null) {
                        HandlerHook.viewPost(recyclerView3, new ARunnableS98S0200000_29(c119x2, categoryPageModel, 76));
                    }
                }
            });
            C19510111Ut c19510111Ut = new C19510111Ut(c119x.LLJIJIL, c119x.LLJILJIL, frameLayout2);
            c119x.LLJILLL = c19510111Ut;
            c19510111Ut.LIZ = new C194551119p() { // from class: X.119l
                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LIZ() {
                    c119x.getClass();
                    C194548119m c194548119m = c119x.LLJJ;
                    if (c194548119m != null) {
                        c194548119m.LIZ();
                    }
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LJI() {
                    c119x.getClass();
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LIZIZ() {
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LJII() {
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LJ(float f, int i, int i2) {
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LJIIIIZZ(float f, int i, int i2) {
                }
            };
        } else {
            c119x.LLLIILIL(C1446160nji.LIZ(), false);
            C2296208zA.LIZ().LIZIZ(new InterfaceC2247808rM() { // from class: X.119c
                @Override // X.InterfaceC2247808rM
                public final void LIZIZ(int i, String str) {
                }

                @Override // X.InterfaceC2247808rM
                public final void LIZJ() {
                }

                @Override // X.InterfaceC2247808rM
                public final void LIZLLL(List<? extends List<? extends Effect>> list) {
                }

                @Override // X.InterfaceC2247808rM
                public final void LIZ(CategoryPageModel categoryPageModel) {
                    C119X c119x2 = c119x;
                    RecyclerView recyclerView3 = c119x2.LLJILJILJ;
                    if (recyclerView3 != null) {
                        HandlerHook.viewPost(recyclerView3, new ARunnableS98S0200000_29(c119x2, categoryPageModel, 76));
                    }
                }
            });
        }
        View view2 = c119x.LLJIJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(4, view2);
        }
        C19510111Ut c19510111Ut2 = c119x.LLJILLL;
        if (c19510111Ut2 != null) {
            c19510111Ut2.LIZJ(new C19510311Uv() { // from class: X.119g
                @Override // X.C19510311Uv, X.InterfaceC19510211Uu
                public final void LJI() {
                    View view3 = c119x.LLJIJIL;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(0, view3);
                    }
                    C119X c119x2 = c119x;
                    LinearLayoutManager linearLayoutManager2 = c119x2.LLJJIII;
                    if (linearLayoutManager2 != null) {
                        linearLayoutManager2.scrollToPositionWithOffset(c119x2.LLJJIJI, c119x2.LLJJIJIIJIL);
                    }
                }
            });
        }
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<FTCEditAudioEffectViewModel> W1() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C194541119f(C1DRG c1drg, C19A3 c19a3) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
    }
}
