package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS98S0200000_29;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.119e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194540119e extends AbstractC2255721DQs<InterfaceC1456070nzh> implements InterfaceC1456070nzh, InterfaceC379610EuV {
    public static final int LLIZ = 8;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1126));
    public final C560530Lyd<Unit> LLILZIL;
    public final LiveEvent<Unit> LLILZLL;

    public InterfaceC1456070nzh W1() {
        return this;
    }

    private final C119Y X1() {
        return (C119Y) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1456070nzh
    public void c4() {
        final C119Y c119yX1 = X1();
        C19A3 c19a3 = (C19A3) c119yX1.mParentScene;
        if (c19a3 != null) {
            c19a3.show(c119yX1);
        }
        c119yX1.LLJJJ = ((InterfaceC1455860nzM) c119yX1.LLJJJJLIIL.getValue()).g().getValue();
        FrameLayout frameLayout = c119yX1.LLJJJIL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C786410Ut5.LJJJJIZL(frameLayout);
        Context contextLIZIZ = C545820Lau.LIZIZ(c119yX1);
        FrameLayout frameLayout2 = c119yX1.LLJJJIL;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        if (c119yX1.LLJIJIL == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(contextLIZIZ), R.layout.vj, frameLayout2, false);
            c119yX1.LLJIJIL = viewTd;
            if (viewTd != null) {
                viewTd.findViewById(R.id.zjo);
            }
            View view = c119yX1.LLJIJIL;
            c119yX1.LLJJIJIL = new C194544119i(view != null ? (FrameLayout) view.findViewById(R.id.me5) : null);
            c119yX1.LLJILJIL = c119yX1.LLJIJIL.findViewById(R.id.voice_conversion_bottom_sheet);
            C786410Ut5.I7(new ACListenerS163S0100000_29(c119yX1, 319), c119yX1.LLJIJIL.findViewById(R.id.voice_touch_outside));
            c119yX1.LLJILJILJ = (RecyclerView) c119yX1.LLJIJIL.findViewById(R.id.voice_list);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(C545820Lau.LIZIZ(c119yX1), 0, false);
            c119yX1.LLJJIII = linearLayoutManager;
            RecyclerView recyclerView = c119yX1.LLJILJILJ;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(linearLayoutManager);
            }
            C119J c119j = new C119J(C372650EjH.LIZIZ(c119yX1), c119yX1.LLJJJ, c119yX1.LLLII(), c119yX1.LLLII().getVeAudioEffectParam(), (InterfaceC1455860nzM) c119yX1.LLJJJJLIIL.getValue());
            c119yX1.LLJJI = c119j;
            c119j.LLJILJIL = c119yX1;
            RecyclerView recyclerView2 = c119yX1.LLJILJILJ;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(c119j);
            }
            c119yX1.LLLIILIL(C1446160nji.LIZ(), false);
            C2296208zA.LIZ().LIZIZ(new InterfaceC2247808rM() { // from class: X.119d
                @Override // X.InterfaceC2247808rM
                public final void LIZJ() {
                }

                @Override // X.InterfaceC2247808rM
                public final void LIZLLL(List<? extends List<? extends Effect>> list) {
                }

                @Override // X.InterfaceC2247808rM
                public final void LIZ(CategoryPageModel categoryPageModel) {
                    boolean z;
                    CategoryEffectModel categoryEffects;
                    List<Effect> effects;
                    C119Y c119y = c119yX1;
                    RecyclerView recyclerView3 = c119y.LLJILJILJ;
                    if (recyclerView3 != null) {
                        HandlerHook.viewPost(recyclerView3, new ARunnableS98S0200000_29(c119y, categoryPageModel, 78));
                    }
                    if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null && !effects.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C2281251EQx.LIZ.LJII("changer_voice", "", "", true);
                    } else {
                        C2281251EQx.LIZ.LJII("changer_voice", "", "", false);
                    }
                }

                @Override // X.InterfaceC2247808rM
                public final void LIZIZ(int i, String str) {
                    C2281251EQx.LIZ.LJII("changer_voice", "", "", false);
                }
            });
            C19510111Ut c19510111Ut = new C19510111Ut(c119yX1.LLJIJIL, c119yX1.LLJILJIL, frameLayout2);
            c119yX1.LLJILLL = c19510111Ut;
            c19510111Ut.LIZ = new C194551119p() { // from class: X.119o
                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LIZ() {
                    c119yX1.getClass();
                    C194549119n c194549119n = c119yX1.LLJJ;
                    if (c194549119n != null) {
                        c194549119n.LIZ();
                    }
                }

                @Override // X.C194551119p, X.InterfaceC19510211Uu
                public final void LJI() {
                    c119yX1.getClass();
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
            c119yX1.LLLIILIL(C1446160nji.LIZ(), false);
            C2296208zA.LIZ().LIZIZ(new InterfaceC2247808rM() { // from class: X.119d
                @Override // X.InterfaceC2247808rM
                public final void LIZJ() {
                }

                @Override // X.InterfaceC2247808rM
                public final void LIZLLL(List<? extends List<? extends Effect>> list) {
                }

                @Override // X.InterfaceC2247808rM
                public final void LIZ(CategoryPageModel categoryPageModel) {
                    boolean z;
                    CategoryEffectModel categoryEffects;
                    List<Effect> effects;
                    C119Y c119y = c119yX1;
                    RecyclerView recyclerView3 = c119y.LLJILJILJ;
                    if (recyclerView3 != null) {
                        HandlerHook.viewPost(recyclerView3, new ARunnableS98S0200000_29(c119y, categoryPageModel, 78));
                    }
                    if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null && !effects.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C2281251EQx.LIZ.LJII("changer_voice", "", "", true);
                    } else {
                        C2281251EQx.LIZ.LJII("changer_voice", "", "", false);
                    }
                }

                @Override // X.InterfaceC2247808rM
                public final void LIZIZ(int i, String str) {
                    C2281251EQx.LIZ.LJII("changer_voice", "", "", false);
                }
            });
        }
        View view2 = c119yX1.LLJIJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(4, view2);
        }
        C19510111Ut c19510111Ut2 = c119yX1.LLJILLL;
        if (c19510111Ut2 != null) {
            c19510111Ut2.LIZJ(new C19510311Uv() { // from class: X.119h
                @Override // X.C19510311Uv, X.InterfaceC19510211Uu
                public final void LJI() {
                    View view3 = c119yX1.LLJIJIL;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(0, view3);
                    }
                    C119Y c119y = c119yX1;
                    LinearLayoutManager linearLayoutManager2 = c119y.LLJJIII;
                    if (linearLayoutManager2 != null) {
                        linearLayoutManager2.scrollToPositionWithOffset(c119y.LLJJIJI, c119y.LLJJIJIIJIL);
                    }
                }
            });
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1456070nzh
    public LiveEvent<Unit> jj2() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1456070nzh
    public void ij(InterfaceC1455860nzM interfaceC1455860nzM, VideoPublishEditModel videoPublishEditModel) {
        interfaceC1455860nzM.tH1(C364410EQl.LIZIZ());
        C1446160nji.LIZLLL(videoPublishEditModel);
        this.LLILZIL.LJIIJ(Unit.LIZ);
    }

    public C194540119e(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LLILZIL = c560530Lyd;
        this.LLILZLL = c560530Lyd;
    }
}
