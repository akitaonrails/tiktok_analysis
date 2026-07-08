package X;

import Y.AObjectS246S0100000_25;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import iyl.i3;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import nv7.c0;
import oyl.d0;

/* JADX INFO: renamed from: X.0tEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657710tEv extends Scene implements InterfaceC1651760t5K {
    public final InterfaceC1651800t5O LLJI;
    public final LiveEvent<Boolean> LLJIJIL;
    public final ShortVideoContext LLJILJIL;
    public final C385670FAf<Boolean> LLJILJILJ;
    public EnumC1651870t5V LLJILLL;
    public final LiveEvent<Pair<Boolean, Boolean>> LLJJ;
    public final LiveEvent<Boolean> LLJJI;
    public final LiveEvent<Boolean> LLJJIII;
    public final List<View> LLJJIJI;
    public final C385670FAf<Boolean> LLJJIJIIJIL;
    public final LiveEvent<C1662100tM0> LLJJIJIL;
    public final LiveEvent<Pair<EnumC1651790t5N, Boolean>> LLJJJ;
    public final LiveEvent<C443120HZe<Boolean, Boolean, Boolean>> LLJJJIL;
    public final boolean LLJJJJ;
    public final Function0<Unit> LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public Pair<Integer, Integer> LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public d0 LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public AnonymousClass0956 LLJZIJLIL;

    public C1657710tEv() {
        throw null;
    }

    @Override // X.InterfaceC1651760t5K
    public final Scene LJI() {
        return this;
    }

    @Override // X.InterfaceC1651760t5K
    public final boolean Nq() {
        return false;
    }

    @Override // X.InterfaceC1651760t5K
    public final void vv() {
    }

    public final C1651890t5X LLLIIIIL() {
        return (C1651890t5X) this.LLJLLIL.getValue();
    }

    public final int LLLIILIL() {
        c0.LIZ.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        Context contextRequireSceneContext = requireSceneContext();
        if (C1462920oAk.LIZLLL() && c1660590tJZ != null && getSceneContext() != null) {
            return c1660590tJZ.LJ(contextRequireSceneContext).topMargin + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + (c1660590tJZ.LJI() ? ScreenUtils.getStatusBarHeight(contextRequireSceneContext) : 0);
        }
        int i = C1428160nGg.LIZ;
        return C1428160nGg.LIZ + ScreenUtils.getStatusBarHeight(contextRequireSceneContext);
    }

    @Override // X.InterfaceC1651760t5K
    public final boolean j5() {
        d0 d0Var = this.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        if (!d0Var.LJIILIIL()) {
            return false;
        }
        d0 d0Var2 = this.LLJLL;
        (d0Var2 != null ? d0Var2 : null).LIZJ();
        return true;
    }

    @Override // X.InterfaceC1651760t5K
    public final void Av() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1652130t5v(this, null), 3);
    }

    public final int LLLII() {
        return ((ScreenUtils.getFullScreenHeight(requireSceneContext()) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(requireSceneContext())) - this.LLJLIL) - this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC1651760t5K
    public final void notifyDataSetChanged() {
        LLLIIIIL().LJ();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = false;
    }

    @Override // X.InterfaceC1651760t5K
    public final void A2(int i) {
        if (this.LLJJJJ) {
            return;
        }
        this.LLJLIL = i;
        C426750GoL.LJIIL(this.mView, null, Integer.valueOf(i), null, null, 29);
        d0 d0Var = this.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        d0Var.setMaxHeight(LLLII());
    }

    @Override // X.InterfaceC1651760t5K
    public final void Bv(EnumC1651870t5V enumC1651870t5V) {
        this.LLJILLL = enumC1651870t5V;
    }

    @Override // X.InterfaceC1651760t5K
    public final C1654400t9a Cv(InterfaceC1651320t4c<?> interfaceC1651320t4c) {
        d0 d0Var = this.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        return d0Var.LJIIIZ(interfaceC1651320t4c.getKey());
    }

    public final void LLLIL(boolean z) {
        AnonymousClass0956 anonymousClass0956 = this.LLJZIJLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        d0 d0Var = this.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        d0Var.setShowingTextGuideFlag(new C1657800tF4(false, false));
        d0 d0Var2 = this.LLJLL;
        if (d0Var2 == null) {
            d0Var2 = null;
        }
        if (!d0Var2.LJIILIIL()) {
            d0 d0Var3 = this.LLJLL;
            if (d0Var3 == null) {
                d0Var3 = null;
            }
            d0Var3.setBackground(null);
            List<i3> list = LLLIIIIL().LLILZ;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (i3 i3VarLJIIIZ : (ArrayList) list) {
                    if (i3VarLJIIIZ.LLJLILLLLZIIL == EnumC1651310t4b.SLIDE) {
                        i3VarLJIIIZ = i3.LJIIIZ(i3VarLJIIIZ, 0, 0, 0, null, 0, false, false, false, false, false, null, null, 0, null, null, null, false, null, false, 0.0f, null, 268434431);
                    }
                    arrayList.add(i3VarLJIIIZ);
                }
                LLLIIIIL().LIZJ(arrayList, false, null);
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1657820tF6.LIZ.getClass();
        if (C1657820tF6.LIZJ() != -1) {
            d0 d0Var = this.LLJLL;
            if (d0Var == null) {
                d0Var = null;
            }
            d0Var.setMaxCollapseSlideFixTotalCnt(C1657820tF6.LIZJ());
        }
        d0 d0Var2 = this.LLJLL;
        if (d0Var2 == null) {
            d0Var2 = null;
        }
        d0Var2.LIZ(new InterfaceC1657870tFB() { // from class: X.0tEw
            @Override // X.InterfaceC1657870tFB
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1657870tFB
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1657870tFB
            public final void LIZLLL(List<i3> list, List<i3> list2) {
            }

            @Override // X.InterfaceC1657870tFB
            public final void LLLFFI() {
            }

            @Override // X.InterfaceC1657870tFB
            public final void LLLFZ() {
                C1657710tEv c1657710tEv = this.LIZ;
                AnonymousClass0956 anonymousClass0956 = c1657710tEv.LLJZIJLIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                    c1657710tEv.LLJZIJLIL = null;
                }
                ((C1662030tLt) this.LIZ.LLJLLL.getValue()).LIZLLL(false, true, false);
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", this.LIZ.LLJILJIL.getCreationId());
                c0lab.LJ("enter_from", "video_shoot_page");
                c0lab.LJ("shoot_way", this.LIZ.LLJILJIL.shootWay);
                C20684815ws.LJIILLIIL("click_expand_button", c0lab.LIZ);
            }

            @Override // X.InterfaceC1657870tFB
            public final void LIZ(int i) {
                if (i == 0) {
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("creation_id", this.LIZ.LLJILJIL.getCreationId());
                    c0lab.LJ("enter_from", "video_shoot_page");
                    c0lab.LJ("shoot_way", this.LIZ.LLJILJIL.shootWay);
                    C20684815ws.LJIILLIIL("scroll_tool_bar", c0lab.LIZ);
                }
            }
        });
        d0 d0Var3 = this.LLJLL;
        if (d0Var3 == null) {
            d0Var3 = null;
        }
        d0Var3.LJIJJ(LLLIIIIL(), null);
        this.LLJI.LJ((InterfaceC1652150t5x) this.LLJZ.getValue());
        C1651440t4o.LIZ.getClass();
        C1651440t4o.LIZ();
        C385670FAf<Boolean> c385670FAf = this.LLJJIJIIJIL;
        if (c385670FAf != null) {
            c385670FAf.LIZ(this, new AObjectS246S0100000_25(this, 311));
        }
        this.LLJIJIL.LIZ(this, new AObjectS246S0100000_25(this, 312));
        this.LLJILJILJ.LIZ(this, new AObjectS246S0100000_25(this, 313));
        LiveEvent<C1662100tM0> liveEvent = this.LLJJIJIL;
        if (liveEvent != null) {
            liveEvent.LIZ(this, new AObjectS246S0100000_25(this, 314));
        }
        LiveEvent<C443120HZe<Boolean, Boolean, Boolean>> liveEvent2 = this.LLJJJIL;
        if (liveEvent2 != null) {
            liveEvent2.LIZ(this, new AObjectS246S0100000_25(this, 315));
        }
        LiveEvent<Boolean> liveEvent3 = this.LLJJI;
        if (liveEvent3 != null) {
            liveEvent3.LIZ(this, new AObjectS246S0100000_25(this, 316));
        }
        LiveEvent<Pair<EnumC1651790t5N, Boolean>> liveEvent4 = this.LLJJJ;
        if (liveEvent4 != null) {
            liveEvent4.LIZ(this, new AObjectS246S0100000_25(this, 317));
        }
        this.LLJJIII.LJII(this, Lifecycle.State.CREATED, new AObjectS246S0100000_25(this, 318));
        this.LLJJ.LIZ(this, new AObjectS246S0100000_25(this, 310));
    }

    @Override // X.InterfaceC1651760t5K
    public final View wv(InterfaceC1651320t4c<?> interfaceC1651320t4c) {
        d0 d0Var = this.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        return d0Var.LJIIL(interfaceC1651320t4c.getKey());
    }

    @Override // X.InterfaceC1651760t5K
    public final C1650980t44 xv(int i) {
        return this.LLJI.LIZJ(i);
    }

    @Override // X.InterfaceC1651760t5K
    public final void yv(final Function0<Unit> function0, final Function0<Boolean> function02) {
        final GestureDetector gestureDetector = new GestureDetector(getSceneContext(), new C1698440uIc(this, 1));
        d0 d0Var = this.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        ((ArrayList) d0Var.LLJJJJ).add(new InterfaceC1657910tFF() { // from class: X.0tEu
            public final C01GW LIZ;

            @Override // X.InterfaceC1657910tFF
            public final boolean LJJJJ(MotionEvent motionEvent) {
                if (!function02.invoke().booleanValue()) {
                    return false;
                }
                if (motionEvent.getAction() == 2 && this.LIZIZ.LLJJLIIIJLLLLLLLZ) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && this.LIZIZ.LLJJLIIIJLLLLLLLZ) {
                    return true;
                }
                gestureDetector.onTouchEvent(motionEvent);
                return false;
            }

            @Override // X.InterfaceC1657910tFF
            public final void onTouchEvent(MotionEvent motionEvent) {
                InterfaceC1657650tEp interfaceC1657650tEp;
                C1650980t44 c1650980t44Xv;
                InterfaceC1657650tEp interfaceC1657650tEp2;
                gestureDetector.onTouchEvent(motionEvent);
                this.LIZIZ.LLJJJJJIL.invoke();
                if (motionEvent.getAction() == 2) {
                    C1657710tEv c1657710tEv = this.LIZIZ;
                    if (c1657710tEv.LLJJLIIIJLLLLLLLZ) {
                        if (c1657710tEv.wv(EnumC1651770t5L.SPEED) == null) {
                            return;
                        }
                        float x = motionEvent.getX() - this.LIZIZ.LLJL.getFirst().floatValue();
                        float y = motionEvent.getY() - this.LIZIZ.LLJL.getSecond().floatValue();
                        if (y > 88.0f || y < -88.0f) {
                            C1650980t44 c1650980t44Xv2 = this.LIZIZ.xv(1);
                            if (c1650980t44Xv2 != null && (interfaceC1657650tEp = c1650980t44Xv2.LLJILJIL) != null) {
                                interfaceC1657650tEp.LIZIZ((int) motionEvent.getX(), (int) ((motionEvent.getY() - r9.getTop()) - ((Rect) this.LIZ.getValue()).top), (int) x, (int) y);
                            }
                            this.LIZIZ.LLJL = new Pair<>(Integer.valueOf((int) motionEvent.getX()), Integer.valueOf((int) motionEvent.getY()));
                        }
                        Rect rect = new Rect();
                        d0 d0Var2 = this.LIZIZ.LLJLL;
                        if (d0Var2 == null) {
                            d0Var2 = null;
                        }
                        d0Var2.getLocalVisibleRect(rect);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (c1650980t44Xv = this.LIZIZ.xv(1)) != null && (interfaceC1657650tEp2 = c1650980t44Xv.LLJILJIL) != null) {
                            interfaceC1657650tEp2.LIZJ((int) motionEvent.getX(), (int) ((motionEvent.getY() - r9.getTop()) - ((Rect) this.LIZ.getValue()).top));
                        }
                    }
                }
                if (motionEvent.getAction() == 1 && this.LIZIZ.LLJJLIIIJLLLLLLLZ) {
                    function0.invoke();
                    C1657710tEv c1657710tEv2 = this.LIZIZ;
                    c1657710tEv2.LLJJL = false;
                    c1657710tEv2.LLJJLIIIJLLLLLLLZ = false;
                }
            }

            {
                this.LIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this.LIZIZ, 474));
            }
        });
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.LLJJJJ) {
            d0 d0Var = new d0(requireSceneContext());
            this.LLJLL = d0Var;
            d0Var.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150)));
            d0Var.setOrientation(1);
            int iLIZ = C1461700o8m.LIZ(C786410Ut5.N3(d0Var.getContext()));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, ScreenUtils.getScreenWidth(d0Var.getContext()));
            layoutParams.gravity = 8388613;
            layoutParams.topMargin = iLIZ;
            C786410Ut5.t7(d0Var, layoutParams);
            d0Var.setGravity(16);
            return d0Var;
        }
        d0 d0Var2 = new d0(requireSceneContext());
        this.LLJLL = d0Var2;
        d0Var2.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150)));
        C426750GoL.LJIIL(d0Var2, null, Integer.valueOf(LLLIILIL()), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(210))), 21);
        d0Var2.setOrientation(1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 8388613;
        C786410Ut5.t7(d0Var2, layoutParams2);
        return d0Var2;
    }

    public C1657710tEv(InterfaceC1651800t5O interfaceC1651800t5O, C560530Lyd c560530Lyd, ShortVideoContext shortVideoContext, C385670FAf c385670FAf, EnumC1651870t5V enumC1651870t5V, C560530Lyd c560530Lyd2, LiveEvent liveEvent, List list, C560530Lyd c560530Lyd3, C560530Lyd c560530Lyd4, boolean z, Function0 function0, int i) {
        list = (i & 256) != 0 ? null : list;
        c560530Lyd3 = (i & 1024) != 0 ? null : c560530Lyd3;
        c560530Lyd4 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : c560530Lyd4;
        boolean z2 = false;
        z = (i & 8192) != 0 ? false : z;
        this.LLJI = interfaceC1651800t5O;
        this.LLJIJIL = c560530Lyd;
        this.LLJILJIL = shortVideoContext;
        this.LLJILJILJ = c385670FAf;
        this.LLJILLL = enumC1651870t5V;
        this.LLJJ = c560530Lyd2;
        this.LLJJI = null;
        this.LLJJIII = liveEvent;
        this.LLJJIJI = list;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = c560530Lyd3;
        this.LLJJJ = c560530Lyd4;
        this.LLJJJIL = null;
        this.LLJJJJ = z;
        this.LLJJJJJIL = function0;
        if (!C295280Bhm.LIZ() && !shortVideoContext.creativeModel.initialModel.dmCameraModel.enterFromDM) {
            z2 = true;
        }
        this.LLJJJJLIIL = z2;
        this.LLJL = new Pair<>(0, 0);
        this.LLJLIL = C1428160nGg.LIZ;
        this.LLJLILLLLZIIL = C1428160nGg.LIZIZ;
        this.LLJLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 481));
        this.LLJLLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(252));
        this.LLJZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 484));
    }
}
