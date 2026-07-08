package X;

import Y.ACListenerS143S0100000_8;
import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import fyo.e;
import java.util.Map;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LG5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LG5 extends Scene {
    public final boolean LLJI;
    public final C385670FAf<Boolean> LLJIJIL;
    public final String LLJILJIL;
    public final C0LG8 LLJILJILJ;
    public final C539750LEv LLJILLL;
    public Surface LLJJ;
    public View LLJJIJIL;
    public C197039127h LLJJJ;
    public TTVideoEngine LLJJJJ;
    public boolean LLJJJJJIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 187));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS552S0100000_8(this, 185));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 189));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 186));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 188));

    public final C1322110kVd LLLII() {
        return (C1322110kVd) this.LLJJIII.getValue();
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        TTVideoEngine tTVideoEngine = this.LLJJJJ;
        if (tTVideoEngine != null) {
            tTVideoEngine.release();
            Surface surface = this.LLJJ;
            if (surface != null) {
                surface.release();
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        if (this.LLJI && this.LLJJJJJIL) {
            TTVideoEngine tTVideoEngine = this.LLJJJJ;
            if (tTVideoEngine == null) {
                tTVideoEngine = null;
            }
            tTVideoEngine.pause();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (this.LLJI) {
            if (!this.LLJJJJJIL) {
                C786410Ut5.LLZZLLIL((C1322110kVd) this.LLJJIJI.getValue(), 0);
                C786410Ut5.E1((C1688850u39) this.LLJJIJIIJIL.getValue(), 0);
                return;
            }
            C786410Ut5.LLZZLLIL((C1322110kVd) this.LLJJIJI.getValue(), 8);
            C786410Ut5.E1((C1688850u39) this.LLJJIJIIJIL.getValue(), 8);
            TTVideoEngine tTVideoEngine = this.LLJJJJ;
            if (tTVideoEngine == null) {
                tTVideoEngine = null;
            }
            tTVideoEngine.play();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ShortVideoContext shortVideoContext;
        ViewStub viewStub;
        View viewLJLLLL;
        super.onActivityCreated(bundle);
        ShortVideoContext shortVideoContext2 = null;
        TTVideoEngine tTVideoEngine = null;
        if (C0LG7.LIZ[this.LLJILJILJ.ordinal()] == 1) {
            View viewRequireViewById = requireViewById(R.id.atj);
            if ((viewRequireViewById instanceof ViewStub) && (viewStub = (ViewStub) viewRequireViewById) != null && (viewLJLLLL = C786410Ut5.LJLLLL(viewStub)) != null) {
                this.LLJJJ = (C197039127h) viewLJLLLL.findViewById(R.id.wpx);
                this.LLJJIJIL = viewLJLLLL.findViewById(R.id.rpa);
                Activity activity = this.mActivity;
                if (activity != null) {
                    int screenWidth = (ScreenUtils.getScreenWidth(activity) - ((int) C0JAI.LIZ(40.0f, activity))) / 2;
                    View view = this.LLJJIJIL;
                    if (view != null) {
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.width = screenWidth;
                        } else {
                            layoutParams2 = null;
                        }
                        C786410Ut5.W5(view, layoutParams2);
                    }
                    View view2 = this.LLJJIJIL;
                    if (view2 != null) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e9);
                        view2.setBackground(c384050F3z.LIZ(activity));
                    }
                    ((TuxTextView) this.LLJJIJIL).setTextColorRes(R.attr.ee);
                    C197039127h c197039127h = this.LLJJJ;
                    if (c197039127h != null) {
                        ViewGroup.LayoutParams layoutParams3 = c197039127h.getLayoutParams();
                        if (layoutParams3 != null) {
                            layoutParams3.width = screenWidth;
                        } else {
                            layoutParams3 = null;
                        }
                        C786410Ut5.J6(c197039127h, layoutParams3);
                    }
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            this.LLJJJ = (C197039127h) requireViewById(R.id.p8l);
            this.LLJJIJIL = requireViewById(R.id.oyq);
            if (this.LLJIJIL.LIZJ().booleanValue()) {
                View view3 = this.LLJJIJIL;
                if (view3 != null) {
                    layoutParams = view3.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = ScreenUtils.getStatusBarHeight(this.mActivity) + getResources().getDimensionPixelSize(R.dimen.adk);
                View view4 = this.LLJJIJIL;
                if (view4 != null) {
                    C786410Ut5.W5(view4, marginLayoutParams);
                }
            }
        }
        C197039127h c197039127h2 = this.LLJJJ;
        if (c197039127h2 != null) {
            C786410Ut5.LLLLLLJ(c197039127h2, 0);
        }
        View view5 = this.LLJJIJIL;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
        }
        C786410Ut5.LLZZLLIL((C1322110kVd) this.LLJJIJI.getValue(), 8);
        C786410Ut5.E1((C1688850u39) this.LLJJIJIIJIL.getValue(), 8);
        C786410Ut5.LLZZLLIL(LLLII(), 8);
        C786410Ut5.LLIIIILZ((TextureView) this.LLJJJIL.getValue(), 8);
        View view6 = this.LLJJIJIL;
        if (view6 != null) {
            C786410Ut5.I7(new ACListenerS143S0100000_8(this, 28), view6);
        }
        C197039127h c197039127h3 = this.LLJJJ;
        if (c197039127h3 != null) {
            C786410Ut5.U8(c197039127h3, new ACListenerS143S0100000_8(this, 29));
        }
        if (this.LLJI) {
            C786410Ut5.LLZZLLIL(LLLII(), 8);
            C786410Ut5.LLIIIILZ((TextureView) this.LLJJJIL.getValue(), 0);
            TTVideoEngine tTVideoEngine2 = new TTVideoEngine(getApplicationContext(), 0);
            this.LLJJJJ = tTVideoEngine2;
            tTVideoEngine2.LLILZIL("preview");
            TTVideoEngine tTVideoEngine3 = this.LLJJJJ;
            if (tTVideoEngine3 == null) {
                tTVideoEngine3 = null;
            }
            tTVideoEngine3.setLooping(true);
            TTVideoEngine tTVideoEngine4 = this.LLJJJJ;
            if (tTVideoEngine4 == null) {
                tTVideoEngine4 = null;
            }
            tTVideoEngine4.LJIJ(this.LLJILJIL);
            TTVideoEngine tTVideoEngine5 = this.LLJJJJ;
            if (tTVideoEngine5 != null) {
                tTVideoEngine = tTVideoEngine5;
            }
            tTVideoEngine.LLJILLL(new InterfaceC1469360oL8() { // from class: X.0LG6
                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine6) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine6, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJI(e eVar) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine6) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine6) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIJJI(TTVideoEngine tTVideoEngine6, int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine6, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIILL(TTVideoEngine tTVideoEngine6) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJ(TTVideoEngine tTVideoEngine6, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine6, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJJ(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIJJLI(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine6, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJII(int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJIIJ(int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJIJ(Map map) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine6, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine6, int i, long j, long j2, Map map) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine6) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJLIIL(int i, int i2, int i3) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine6, int i, C1467860oIi c1467860oIi) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJL(e eVar, String str) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIIJ(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine6) {
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJ(TTVideoEngine tTVideoEngine6) {
                    C786410Ut5.LLZZLLIL((C1322110kVd) this.LL.LLJJIJI.getValue(), 8);
                    C786410Ut5.E1((C1688850u39) this.LL.LLJJIJIIJIL.getValue(), 8);
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJIILIIL(TTVideoEngine tTVideoEngine6) {
                    C0LG5 c0lg5 = this.LL;
                    c0lg5.LLJJJJJIL = true;
                    TTVideoEngine tTVideoEngine7 = c0lg5.LLJJJJ;
                    TTVideoEngine tTVideoEngine8 = null;
                    if (tTVideoEngine7 == null) {
                        tTVideoEngine7 = null;
                    }
                    int iLJJLJ = tTVideoEngine7.LJJLJ();
                    TTVideoEngine tTVideoEngine9 = this.LL.LLJJJJ;
                    if (tTVideoEngine9 != null) {
                        tTVideoEngine8 = tTVideoEngine9;
                    }
                    c0lg5.LLLIIIIL(iLJJLJ, tTVideoEngine8.LJJLIIIJLLLLLLLZ(), (View) this.LL.LLJJJIL.getValue());
                }
            });
            ((TextureView) this.LLJJJIL.getValue()).setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0LG9
                @Override // android.view.TextureView.SurfaceTextureListener
                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    return true;
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    C0LG5 c0lg5 = this.LL;
                    if (c0lg5.LLJJJJ != null && c0lg5.LLJJ == null) {
                        c0lg5.LLJJ = new Surface(surfaceTexture);
                        C0LG5 c0lg52 = this.LL;
                        TTVideoEngine tTVideoEngine6 = c0lg52.LLJJJJ;
                        TTVideoEngine tTVideoEngine7 = null;
                        if (tTVideoEngine6 == null) {
                            tTVideoEngine6 = null;
                        }
                        tTVideoEngine6.setSurface(c0lg52.LLJJ);
                        TTVideoEngine tTVideoEngine8 = this.LL.LLJJJJ;
                        if (tTVideoEngine8 != null) {
                            tTVideoEngine7 = tTVideoEngine8;
                        }
                        tTVideoEngine7.play();
                    }
                }
            });
            return;
        }
        C1324750kZt.LJIIIZ(LLLII(), C2471909mP.LJIILIIL(this.LLJILJIL).toString(), -1, -1);
        C786410Ut5.LLZZLLIL(LLLII(), 0);
        C786410Ut5.LLZZLLIL((C1322110kVd) this.LLJJIJI.getValue(), 8);
        C786410Ut5.E1((C1688850u39) this.LLJJIJIIJIL.getValue(), 8);
        C786410Ut5.LLIIIILZ((TextureView) this.LLJJJIL.getValue(), 8);
        ShortVideoContext shortVideoContext3 = this.LLJILLL.LIZ;
        if (shortVideoContext3 != null) {
            shortVideoContext = shortVideoContext3;
        } else {
            shortVideoContext = null;
        }
        int i = shortVideoContext.cameraComponentModel.mVideoWidth;
        if (shortVideoContext3 != null) {
            shortVideoContext2 = shortVideoContext3;
        }
        LLLIIIIL(i, shortVideoContext2.cameraComponentModel.mVideoHeight, LLLII());
        C1447470nlp.LIZIZ(LLLII(), C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
    }

    public final void LLLIIIIL(int i, int i2, View view) {
        if (i > 0 && i2 > 0) {
            FrameLayout.LayoutParams layoutParamsT2 = ((BaseScreenAdaptScene) C372650EjH.LIZIZ(this)).LLLLLILLIL().t2(i, i2);
            C0JAI.LJII(layoutParamsT2.width, layoutParamsT2.height, view);
            C426750GoL.LJIIIZ(view, null, Integer.valueOf(layoutParamsT2.topMargin), null, null, false, 29);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.c5w, viewGroup, false);
    }

    public C0LG5(boolean z, C385670FAf<Boolean> c385670FAf, String str, C0LG8 c0lg8, C539750LEv c539750LEv) {
        this.LLJI = z;
        this.LLJIJIL = c385670FAf;
        this.LLJILJIL = str;
        this.LLJILJILJ = c0lg8;
        this.LLJILLL = c539750LEv;
    }
}
