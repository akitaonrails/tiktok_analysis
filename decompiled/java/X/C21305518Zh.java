package X;

import Y.ARunnableS10S0102000_23;
import Y.ARunnableS92S0200000_23;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import cxo.a4;
import fyo.e;
import java.util.HashMap;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.AwS611S0100000_32;
import wh6.AbS690S0100000_8;

/* JADX INFO: renamed from: X.18Zh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21305518Zh extends AbstractC1664490tPr<C551480Lk2, C551490Lk3> {
    public static final int LLJLILLLLZIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public C21305818Zk LLJJJJ;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 94));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 97));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 93));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 95));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 96));

    public final TTVideoEngine LLLLLJIL() {
        return (TTVideoEngine) this.LLJLIL.getValue();
    }

    public final boolean LLLLLJLJLL() {
        return LLLLILI().LIZ.LIZLLL.length() > 0;
    }

    public final void LLLLLLIL() {
        String strLJFF;
        if (LLLLLJLJLL()) {
            FrameLayout frameLayout = (FrameLayout) this.LLJJJIL.getValue();
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
            CardView cardView = (CardView) this.LLJJJJLIIL.getValue();
            if (cardView != null) {
                C786410Ut5.LLILLL(cardView, 0);
                return;
            }
            return;
        }
        CardView cardView2 = (CardView) this.LLJJJJLIIL.getValue();
        if (cardView2 != null) {
            C786410Ut5.LLILLL(cardView2, 8);
        }
        if (LLLLILI().LIZ.LIZJ.LIZ.isEmpty() && ((strLJFF = LLLLILI().LIZ.LIZIZ.LJFF()) == null || strLJFF.length() == 0)) {
            FrameLayout frameLayout2 = (FrameLayout) this.LLJJJIL.getValue();
            if (frameLayout2 != null) {
                C786410Ut5.LJZ(8, frameLayout2);
                return;
            }
            return;
        }
        FrameLayout frameLayout3 = (FrameLayout) this.LLJJJIL.getValue();
        if (frameLayout3 != null) {
            C786410Ut5.LJZ(0, frameLayout3);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        LLLLLJIL().release();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        if (LLLLLJLJLL() && LLLLLJIL().LJJLIIIJILLIZJL() == 1) {
            LLLLLJIL().pause();
        }
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (LLLLLJLJLL() && LLLLLJIL().LJJZZIII() && LLLLLJIL().LJJLIIIJILLIZJL() == 2) {
            LLLLLJIL().play();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        float fLIZIZ;
        super.onActivityCreated(bundle);
        LLLLLLIL();
        this.mView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1554380qYG(this, 0));
        LLLLLL(9, 16);
        ViewGroup viewGroup = (ViewGroup) this.LLJJJIL.getValue();
        if (viewGroup != null) {
            C21305818Zk c21305818Zk = new C21305818Zk();
            new C0DV5<C21304718Yz>() { // from class: X.18Yz
                @Override // X.C0DV5
                public C21304718Yz build() {
                    return this;
                }

                @Override // X.C0DV5
                public /* bridge */ /* synthetic */ C0DV5 build() {
                    build();
                    return this;
                }
            }.build();
            viewGroup.getContext();
            this.LLJJJJ = c21305818Zk;
            C0H6X c0h6x = new C0H6X(viewGroup.getContext());
            c21305818Zk.LIZ = c0h6x;
            viewGroup.addView(c0h6x);
        }
        FrameLayout frameLayout = (FrameLayout) this.LLJJJJJIL.getValue();
        if (frameLayout != null) {
            if (C426750GoL.LIZLLL(frameLayout.getContext())) {
                fLIZIZ = -C418440Gaw.LIZIZ(13);
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(13);
            }
            C786410Ut5.Kc(frameLayout, fLIZIZ);
            C786410Ut5.I7(new AbS690S0100000_8(this, 0, 42), frameLayout);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0MFW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C551480Lk2) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 46));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18Zi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C551480Lk2) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS611S0100000_32(this, 47));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.18Zj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C551480Lk2) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS602S0100000_23(this, 26));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Lk4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C551480Lk2) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS602S0100000_23(this, 27));
        LLLLLJIL().LLILZIL("AICreationPreviewScene");
        LLLLLJIL().setLooping(true);
        LLLLLJIL().LIZJ(199, 1);
        LLLLLJIL().LIZJ(4, 0);
        LLLLLJIL().LJ(true);
        LLLLLJIL().LLI(new a4() { // from class: X.0oml
            @Override // cxo.a4
            public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // cxo.a4
            public final void LIZJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // cxo.a4
            public final void LJ(TTVideoEngine tTVideoEngine) {
            }

            @Override // cxo.a4
            public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // cxo.a4
            public final void LJIIIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // cxo.a4
            public final void LJIIL(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // cxo.a4
            public final void LJIILL(TTVideoEngine tTVideoEngine) {
            }

            @Override // cxo.a4
            public final void LJIJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // cxo.a4
            public final void LJIJI(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // cxo.a4
            public final void LJIJJLI(int i) {
            }

            @Override // cxo.a4
            public final void LJI(e eVar) {
                HashMap mapLJI;
                C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("load video error: ");
                if (eVar != null) {
                    mapLJI = eVar.LJI();
                } else {
                    mapLJI = null;
                }
                sbLIZ.append(mapLJI);
                c547140Ld2.LIZIZ("AICreationPreviewScene", C2188811AlT.LIZIZ(sbLIZ), null);
            }

            @Override // cxo.a4
            @InterfaceC1294060jmO
            public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
                if (tTVideoEngine != null) {
                    C21305518Zh c21305518Zh = this.LL;
                    View view = (View) c21305518Zh.LLJJJJLIIL.getValue();
                    if (view != null) {
                        HandlerHook.viewPost(view, new ARunnableS92S0200000_23(c21305518Zh, tTVideoEngine, 18));
                    }
                    c21305518Zh.LLJJLIIIJLLLLLLLZ = true;
                    if (c21305518Zh.LLJL) {
                        View view2 = (View) c21305518Zh.LLJJJJJIL.getValue();
                        if (view2 != null) {
                            C786410Ut5.LJLLLLLL(0, view2);
                            return;
                        }
                        return;
                    }
                    View view3 = (View) c21305518Zh.LLJJJJJIL.getValue();
                    if (view3 == null) {
                        return;
                    }
                    C786410Ut5.LJLLLLLL(8, view3);
                }
            }

            @Override // cxo.a4
            @InterfaceC1294060jmO
            public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
                View view = (View) this.LL.LLJJJJLIIL.getValue();
                if (view != null) {
                    HandlerHook.viewPost(view, new ARunnableS10S0102000_23(this.LL, i, i2, 2));
                }
            }
        });
    }

    public final void LLLLLL(int i, int i2) {
        CardView cardView;
        Context sceneContext;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        int height;
        int i4;
        int i5;
        if (i <= 0 || i2 <= 0 || (cardView = (CardView) this.LLJJJJLIIL.getValue()) == null || (sceneContext = getSceneContext()) == null) {
            return;
        }
        int i6 = sceneContext.getResources().getDisplayMetrics().widthPixels;
        float f = sceneContext.getResources().getDisplayMetrics().density;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i7 = 0;
        if (marginLayoutParams != null) {
            i3 = marginLayoutParams.topMargin;
            i7 = marginLayoutParams.bottomMargin;
        } else {
            i3 = 0;
        }
        int i8 = i3 + i7;
        View view = this.mView;
        if ((view instanceof ViewGroup) && view != null) {
            height = view.getHeight();
        } else {
            height = (int) (DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL * f);
        }
        int i9 = height - i8;
        int i10 = i6 - (LLJLILLLLZIIL * 2);
        float f2 = i / i2;
        float f3 = i9;
        if (f2 > i6 / f3) {
            i5 = (int) (i10 / f2);
            i4 = i10;
        } else {
            i4 = (int) (f3 * f2);
            i5 = i9;
        }
        if (i5 <= i9) {
            i9 = i5;
        }
        if (i4 <= i10) {
            i10 = i4;
        }
        ViewGroup.LayoutParams layoutParams2 = cardView.getLayoutParams();
        if (layoutParams2.width != i10 || layoutParams2.height != i9) {
            layoutParams2.width = i10;
            layoutParams2.height = i9;
            C786410Ut5.j6(cardView, layoutParams2);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ny, viewGroup, false);
    }
}
