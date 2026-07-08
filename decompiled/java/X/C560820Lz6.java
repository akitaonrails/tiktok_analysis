package X;

import Y.ACListenerS143S0100000_8;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS587S0100000_8;
import nv7.c0;

/* JADX INFO: renamed from: X.0Lz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560820Lz6 extends AbstractC1664490tPr<C560660Lyq, C560840Lz8> {
    public C363200ELu LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public C1287400jbe LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 970));

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C1287400jbe c1287400jbe = this.LLJJL;
        if (c1287400jbe != null) {
            c1287400jbe.onPause();
        }
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C1287400jbe c1287400jbe = this.LLJJL;
        if (c1287400jbe != null) {
            c1287400jbe.onResume();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        final int iLIZIZ;
        FrameLayout frameLayout;
        TuxIconView tuxIconView;
        View viewFindViewById;
        C1287400jbe c1287400jbe;
        TuxIconView tuxIconView2;
        TuxTextView tuxTextView;
        C363200ELu c363200ELu;
        super.onActivityCreated(bundle);
        View view = this.mView;
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Lz9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        if (C1462920oAk.LIZLLL()) {
            c0.LIZ.getClass();
            C1660590tJZ c1660590tJZ = c0.LJFF;
            if (c1660590tJZ != null) {
                iLIZIZ = c1660590tJZ.LIZIZ();
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
            }
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        }
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        if (iLIZIZ < iLIZIZ2) {
            iLIZIZ = iLIZIZ2;
        }
        int statusBarHeight = ScreenUtils.getStatusBarHeight(requireSceneContext());
        View view2 = this.mView;
        if (view2 != null) {
            frameLayout = (FrameLayout) view2.findViewById(R.id.bww);
        } else {
            frameLayout = null;
        }
        this.LLJJJJLIIL = frameLayout;
        if (frameLayout != null) {
            C1447470nlp.LIZIZ(frameLayout, C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
        }
        FrameLayout frameLayout2 = this.LLJJJJLIIL;
        if (frameLayout2 != null) {
            C426750GoL.LJIIIZ(frameLayout2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)) + statusBarHeight), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) + iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), false, 21);
        }
        View view3 = this.mView;
        if (view3 != null) {
            tuxIconView = (TuxIconView) view3.findViewById(R.id.f4q);
        } else {
            tuxIconView = null;
        }
        this.LLJJLIIIJLLLLLLLZ = tuxIconView;
        View view4 = this.mView;
        if (view4 != null) {
            viewFindViewById = view4.findViewById(R.id.f4r);
        } else {
            viewFindViewById = null;
        }
        this.LLJL = viewFindViewById;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zc, (Context) this.LLJLIL.getValue());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            View view5 = this.LLJL;
            if (view5 != null) {
                view5.setBackgroundColor(iIntValue);
            }
        }
        View view6 = this.mView;
        if (view6 != null) {
            c1287400jbe = (C1287400jbe) view6.findViewById(R.id.z13);
        } else {
            c1287400jbe = null;
        }
        this.LLJJL = c1287400jbe;
        if (c1287400jbe != null) {
            c1287400jbe.LIZIZ(C08E3.LIZ(R.raw.hexagon_vert, requireSceneContext()), C08E3.LIZ(R.raw.hexagon_frag, requireSceneContext()), true, new C1287390jbd(1.0f, 0.0f, 0.0f, (List<Float>) C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f)), (List<Float>) C1697810uHb.LJIIJJI(Float.valueOf(1.3f), Float.valueOf(1.3f)), Color.rgb(75, 183, 219), Color.rgb(0, 0, 0), Color.rgb(32, 154, 93), Color.rgb(0, 0, 0), Color.rgb(0, 0, 0), 1.0f, 0.5f));
        }
        C1287400jbe c1287400jbe2 = this.LLJJL;
        if (c1287400jbe2 != null) {
            C1447470nlp.LIZIZ(c1287400jbe2, C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
        }
        C1287400jbe c1287400jbe3 = this.LLJJL;
        if (c1287400jbe3 != null) {
            c1287400jbe3.LIZJ();
        }
        View view7 = this.mView;
        if (view7 != null) {
            tuxIconView2 = (TuxIconView) view7.findViewById(R.id.bn2);
        } else {
            tuxIconView2 = null;
        }
        this.LLJJJJJIL = tuxIconView2;
        if (tuxIconView2 != null) {
            C426750GoL.LJIIIZ(tuxIconView2, null, Integer.valueOf(statusBarHeight + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22))), null, null, false, 29);
        }
        TuxIconView tuxIconView3 = this.LLJJJJJIL;
        if (tuxIconView3 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_left_ltr;
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ee, (Context) this.LLJLIL.getValue());
            tuxIconView3.setTuxIcon(c419910GdJ);
        }
        View view8 = this.mView;
        if (view8 != null) {
            tuxTextView = (TuxTextView) view8.findViewById(R.id.g5n);
        } else {
            tuxTextView = null;
        }
        this.LLJJJJ = tuxTextView;
        if (tuxTextView != null) {
            C1447470nlp.LIZIZ(tuxTextView, C418440Gaw.LIZIZ(22));
        }
        TuxTextView tuxTextView2 = this.LLJJJJ;
        if (tuxTextView2 != null) {
            C427690Gpr.LJ(tuxTextView2, C418440Gaw.LIZIZ(22));
        }
        TuxTextView tuxTextView3 = this.LLJJJJ;
        if (tuxTextView3 != null) {
            C426750GoL.LJIIIZ(tuxTextView3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(iLIZIZ), false, 18);
        }
        View view9 = this.mView;
        if (view9 != null) {
            if (view9.isLaidOut() && !view9.isLayoutRequested()) {
                View view10 = this.mView;
                if (view10 != null && C1415610mwR.LIZ() == view10.getMeasuredHeight()) {
                    int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(requireSceneContext());
                    TuxTextView tuxTextView4 = this.LLJJJJ;
                    if (tuxTextView4 != null) {
                        C426750GoL.LJIIIZ(tuxTextView4, null, null, null, Integer.valueOf(iLIZIZ + iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight), false, 23);
                    }
                    FrameLayout frameLayout3 = this.LLJJJJLIIL;
                    if (frameLayout3 != null) {
                        C426750GoL.LJIIIZ(frameLayout3, null, null, null, Integer.valueOf(iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight), false, 23);
                    }
                }
            } else {
                view9.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0EMf
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view11, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        view11.removeOnLayoutChangeListener(this);
                        View view12 = this.LL.mView;
                        if (view12 != null && C1415610mwR.LIZ() == view12.getMeasuredHeight()) {
                            int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight2 = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LL.requireSceneContext());
                            TuxTextView tuxTextView5 = this.LL.LLJJJJ;
                            if (tuxTextView5 != null) {
                                C426750GoL.LJIIIZ(tuxTextView5, null, null, null, Integer.valueOf(iLIZIZ + iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight2), false, 23);
                            }
                            FrameLayout frameLayout4 = this.LL.LLJJJJLIIL;
                            if (frameLayout4 != null) {
                                C426750GoL.LJIIIZ(frameLayout4, null, null, null, Integer.valueOf(iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight2), false, 23);
                            }
                        }
                    }
                });
            }
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0o, (Context) this.LLJLIL.getValue());
        if (numLIZJ2 != null) {
            int iIntValue2 = numLIZJ2.intValue();
            TuxTextView tuxTextView5 = this.LLJJJJ;
            if (tuxTextView5 != null) {
                tuxTextView5.setTextColor(iIntValue2);
            }
        }
        View view11 = this.mView;
        if (view11 != null) {
            c363200ELu = (C363200ELu) view11.findViewById(R.id.nnp);
        } else {
            c363200ELu = null;
        }
        this.LLJJJIL = c363200ELu;
        if (c363200ELu != null) {
            C786410Ut5.LJLLLLLL(4, c363200ELu.LLILZIL);
        }
        C363200ELu c363200ELu2 = this.LLJJJIL;
        if (c363200ELu2 != null) {
            c363200ELu2.setUIConfig(new C363210ELv(null, C20642515q3.LJI(2131829699), new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))), 1, 1));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Lyr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C560660Lyq) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 966));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Lz0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C560660Lyq) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 658));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Lz7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C560660Lyq) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 659));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Lyt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C560660Lyq) obj).LJFF;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 967));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Lys
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C560660Lyq) obj).LJI);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 965));
        TuxTextView tuxTextView6 = this.LLJJJJ;
        if (tuxTextView6 != null) {
            C786410Ut5.h9(tuxTextView6, new ACListenerS143S0100000_8(this, 131));
        }
        TuxIconView tuxIconView4 = this.LLJJJJJIL;
        if (tuxIconView4 != null) {
            C786410Ut5.a9(tuxIconView4, new ACListenerS143S0100000_8(this, 132));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.mw, viewGroup, false);
    }
}
