package X;

import Y.ACListenerS159S0100000_25;
import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.SimplifyCameraPermissionExperiment;
import com.ss.android.ugc.aweme.experiment.SimplifyCameraPermissionExperimentV2Gif;
import com.ss.android.ugc.aweme.experiment.SimplifyPermissionFixKillSwitch;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.FirstPhotoViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import nv7.c0;

/* JADX INFO: renamed from: X.0tMM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1662320tMM extends AbstractC1664490tPr<C1662500tMe, C1662570tMl> implements InterfaceC523020KfE {
    public final C1664690tQB<C1662500tMe> LLJJJIL;
    public final C385670FAf<Boolean> LLJJJJ;
    public final C385670FAf<Boolean> LLJJJJJIL;
    public final ShortVideoContext LLJJJJLIIL;
    public TuxIconView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public ViewGroup LLJLILLLLZIIL;
    public FrameLayout LLJLL;
    public TuxTextView LLJLLIL;
    public TuxIconView LLJLLL;
    public TuxTextView LLJZ;
    public View LLJZIJLIL;
    public ViewGroup LLL;
    public FrameLayout LLLF;
    public C0GSN LLLFF;
    public ViewGroup LLLFFI;
    public C1642110spl LLLFZ;
    public ViewGroup LLLI;
    public ViewGroup LLLII;
    public ViewGroup LLLIIII;
    public TuxTextView LLLIIIIL;
    public ConstraintLayout LLLIIIL;
    public final int LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public AutoDismissPermissionDialog LLLILZ;
    public boolean LLLILZJ;
    public Boolean LLLILZLLLI;

    public boolean LLLLLJLJLL() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLL() {
        /*
            r4 = this;
            nv7.c0 r0 = nv7.c0.LIZ
            r0.getClass()
            X.0tJZ r1 = nv7.c0.LJFF
            boolean r0 = X.C1462920oAk.LIZLLL()
            if (r0 == 0) goto L7a
            if (r1 == 0) goto L7a
            boolean r0 = r1.LJII()
            if (r0 == 0) goto L78
            r0 = 37
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r3 = X.C814420VxA.LIZIZ(r0)
            int r0 = X.C1660590tJZ.LJFF()
        L27:
            int r3 = r3 - r0
        L28:
            android.view.ViewGroup r0 = r4.LLLII
            r2 = 0
            if (r0 == 0) goto L76
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        L31:
            boolean r0 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto L74
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            if (r1 == 0) goto L3b
            r1.bottomMargin = r3
        L3b:
            android.view.ViewGroup r0 = r4.LLLII
            if (r0 == 0) goto L42
            X.C786410Ut5.X5(r1, r0)
        L42:
            boolean r0 = com.ss.android.ugc.aweme.experiment.SimplifyCameraPermissionExperimentV2Gif.isEnabled()
            if (r0 == 0) goto L71
            android.view.ViewGroup r0 = r4.LLLIIII
            if (r0 == 0) goto L72
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        L50:
            boolean r0 = r1 instanceof X.C19ME
            if (r0 == 0) goto L6a
            r2 = r1
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r2 == 0) goto L6a
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            int r3 = r3 + r0
            r2.bottomMargin = r3
        L6a:
            android.view.ViewGroup r0 = r4.LLLIIII
            if (r0 == 0) goto L71
            X.C786410Ut5.X5(r2, r0)
        L71:
            return
        L72:
            r1 = r2
            goto L50
        L74:
            r1 = r2
            goto L3b
        L76:
            r1 = r2
            goto L31
        L78:
            r3 = 0
            goto L28
        L7a:
            java.lang.Object r0 = r4.LLLLIL()
            X.0tMl r0 = (X.C1662570tMl) r0
            kotlin.jvm.functions.Function0<java.lang.Integer> r0 = r0.LJI
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            int r0 = X.C0LEO.LIZIZ()
            int r3 = r3 - r0
            int r0 = r4.LLLIIL
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1662320tMM.LLLLLL():void");
    }

    public final void LLLLLLIL() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        FrameLayout frameLayout = this.LLLF;
        if (frameLayout == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        c0.LIZ.getClass();
        C1660590tJZ c1660590tJZ = c0.LJFF;
        C1662520tMg c1662520tMg = this.LLJJJIL.LIZ.LJIIL;
        ViewGroup.MarginLayoutParams marginLayoutParams5 = null;
        if (c1662520tMg != null ? Intrinsics.LJFF(c1662520tMg.LIZJ, Boolean.TRUE) : false) {
            FrameLayout frameLayout2 = this.LLLF;
            CameraComponentModel cameraComponentModel = this.LLJJJJLIIL.cameraComponentModel;
            C537820L7k.LIZIZ(frameLayout2, cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight);
            FrameLayout frameLayout3 = this.LLLF;
            if (frameLayout3 != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    int scaleY = (int) (marginLayoutParams3.height * frameLayout3.getScaleY());
                    int i = marginLayoutParams3.topMargin;
                    C786410Ut5.Pb(frameLayout3, 1.0f);
                    C786410Ut5.qc(frameLayout3, 1.0f);
                    marginLayoutParams3.width = -1;
                    int i2 = marginLayoutParams3.height;
                    marginLayoutParams3.height = i2 + ((scaleY - i2) / 2) + i;
                    marginLayoutParams3.topMargin = 0;
                    marginLayoutParams3.bottomMargin = 0;
                    marginLayoutParams3.leftMargin = 0;
                    marginLayoutParams3.rightMargin = 0;
                    marginLayoutParams3.setMarginStart(0);
                    marginLayoutParams3.setMarginEnd(0);
                    C786410Ut5.a6(frameLayout3, marginLayoutParams3);
                }
            }
        } else if (!C1462920oAk.LIZLLL() || c1660590tJZ == null || getSceneContext() == null) {
            marginLayoutParams4.bottomMargin = C0LEO.LIZIZ();
        } else {
            FrameLayout.LayoutParams layoutParamsLJ = c1660590tJZ.LJ(requireSceneContext());
            if (c1660590tJZ.LJII()) {
                layoutParamsLJ.bottomMargin += C1660590tJZ.LJFF();
                layoutParamsLJ.height -= C1660590tJZ.LJFF();
            }
            ViewGroup viewGroup = this.LLLFFI;
            if (viewGroup != null) {
                C786410Ut5.X5(new FrameLayout.LayoutParams(layoutParamsLJ), viewGroup);
            }
            layoutParamsLJ.leftMargin = 0;
            layoutParamsLJ.rightMargin = 0;
            layoutParamsLJ.setMarginStart(0);
            layoutParamsLJ.setMarginEnd(0);
            layoutParamsLJ.width = -1;
            FrameLayout frameLayout4 = this.LLLF;
            if (frameLayout4 != null) {
                C786410Ut5.a6(frameLayout4, layoutParamsLJ);
            }
        }
        if (SimplifyCameraPermissionExperiment.isEnabled() || SimplifyCameraPermissionExperimentV2Gif.isEnabled()) {
            C0GSN c0gsn = this.LLLFF;
            if (c0gsn != null) {
                ViewGroup.LayoutParams layoutParams2 = c0gsn.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                    marginLayoutParams.bottomMargin = ((!(layoutParams3 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams3) == null) ? C0LEO.LIZIZ() : marginLayoutParams5.bottomMargin) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    marginLayoutParams.topMargin = marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0;
                    marginLayoutParams.height = marginLayoutParams5 != null ? marginLayoutParams5.height : 0;
                    marginLayoutParams5 = marginLayoutParams;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gsn);
                c0gsn.setLayoutParams(marginLayoutParams5);
            }
        } else {
            C0GSN c0gsn2 = this.LLLFF;
            if (c0gsn2 != null) {
                ViewGroup.LayoutParams layoutParams4 = c0gsn2.getLayoutParams();
                if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                    ViewGroup.LayoutParams layoutParams5 = frameLayout.getLayoutParams();
                    marginLayoutParams2.bottomMargin = (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5) == null) ? C0LEO.LIZIZ() : marginLayoutParams5.bottomMargin;
                    marginLayoutParams2.topMargin = marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0;
                    marginLayoutParams2.height = marginLayoutParams5 != null ? marginLayoutParams5.height : 0;
                    marginLayoutParams5 = marginLayoutParams2;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gsn2);
                c0gsn2.setLayoutParams(marginLayoutParams5);
            }
        }
        LLLLLL();
    }

    public final void LLLLLJIL(boolean z) {
        CharSequence text;
        CharSequence text2;
        CharSequence text3;
        CharSequence text4;
        if (!SimplifyCameraPermissionExperiment.isEnabled() && !SimplifyCameraPermissionExperimentV2Gif.isEnabled()) {
            CharSequence charSequence = "";
            if (z) {
                Context sceneContext = getSceneContext();
                if (sceneContext != null) {
                    TuxTextView tuxTextView = this.LLJLLIL;
                    if (tuxTextView != null) {
                        Resources resources = sceneContext.getResources();
                        if (resources == null || (text4 = resources.getText(2131846422)) == null) {
                            text4 = "";
                        }
                        tuxTextView.setText(text4);
                    }
                    TuxTextView tuxTextView2 = this.LLLIIIIL;
                    if (tuxTextView2 != null) {
                        Resources resources2 = sceneContext.getResources();
                        if (resources2 != null && (text3 = resources2.getText(2131846421)) != null) {
                            charSequence = text3;
                        }
                        tuxTextView2.setText(charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
            Context sceneContext2 = getSceneContext();
            if (sceneContext2 == null) {
                return;
            }
            TuxTextView tuxTextView3 = this.LLJLLIL;
            if (tuxTextView3 != null) {
                Resources resources3 = sceneContext2.getResources();
                if (resources3 == null || (text2 = resources3.getText(2131846420)) == null) {
                    text2 = "";
                }
                tuxTextView3.setText(text2);
            }
            TuxTextView tuxTextView4 = this.LLLIIIIL;
            if (tuxTextView4 == null) {
                return;
            }
            Resources resources4 = sceneContext2.getResources();
            if (resources4 != null && (text = resources4.getText(2131846423)) != null) {
                charSequence = text;
            }
            tuxTextView4.setText(charSequence);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJJJ.LIZ(this, new AObjectS246S0100000_25(this, 219));
        LLLLJ(this.LLJJJJJIL, new AwS604S0100000_25(this, 195));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tMT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1662500tMe) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 196));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tMO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1662500tMe) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 197));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tMS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1662500tMe) obj).LJIIIZ);
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 198));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0tMU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1662500tMe) obj).LJIIJJI;
            }
        }, new AwS604S0100000_25(this, 191));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tMP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1662500tMe) obj).LJIIL;
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 192));
        int iLIZ = C522630Keb.LIZ();
        if (iLIZ == 2 || iLIZ == 3 || iLIZ == 4) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            c384050F3z.LJ = C1308910kAL.LIZJ(R.attr.zi, (Context) this.LLLIILIL.getValue());
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            Drawable drawableLIZ = c384050F3z.LIZ((Context) this.LLLIILIL.getValue());
            C1642110spl c1642110spl = this.LLLFZ;
            if (c1642110spl != null) {
                c1642110spl.setBgBorderDrawable(drawableLIZ);
            }
            C1642110spl c1642110spl2 = this.LLLFZ;
            if (c1642110spl2 != null) {
                c1642110spl2.LIZJ(true);
            }
        }
        boolean zLIZ = C525780Kjg.LIZ(this.LLJJJJLIIL);
        C1642110spl c1642110spl3 = this.LLLFZ;
        if (c1642110spl3 != null) {
            c1642110spl3.LIZLLL("default", zLIZ);
        }
        ((FirstPhotoViewModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(FirstPhotoViewModel.class)).LL.observe(this, new AObserverS227S0100000_25(this, 27));
        if (SimplifyPermissionFixKillSwitch.INSTANCE.enable()) {
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tMQ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1662500tMe) obj).LJIIL;
                }
            }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 193));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tMR
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1662500tMe) obj).LJIILJJIL;
                }
            }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 194));
        }
    }

    public void LLLLLLJ(boolean z, boolean z2) {
        int i;
        C0GSN c0gsn;
        if (!z2) {
            ViewGroup viewGroup = this.LLL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
            }
            C0GSN c0gsn2 = this.LLLFF;
            if (c0gsn2 != null) {
                c0gsn2.setNeedLinearBackground(false);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        if (z) {
            ViewGroup viewGroup3 = this.LLL;
            if (viewGroup3 != null) {
                viewGroup3.setClickable(true);
            }
            Context sceneContext = getSceneContext();
            if (sceneContext != null) {
                TuxTextView tuxTextView = this.LLJZ;
                if (tuxTextView != null) {
                    tuxTextView.setTextColor(sceneContext.getResources().getColor(R.color.f569bc));
                }
                TuxTextView tuxTextView2 = this.LLJZ;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTuxFont(32);
                }
                C419910GdJ c419910GdJ = new C419910GdJ();
                if (LLLLLJLJLL()) {
                    i = R.raw.icon_now_setting;
                } else {
                    i = R.raw.icon_camera_fill;
                }
                c419910GdJ.LIZ = i;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                TuxIconView tuxIconView = this.LLJLLL;
                if (tuxIconView != null) {
                    tuxIconView.setTuxIcon(c419910GdJ);
                }
                if (!LLLLLJLJLL() && (c0gsn = this.LLLFF) != null) {
                    c0gsn.setNeedLinearBackground(true);
                    return;
                }
                return;
            }
            return;
        }
        ViewGroup viewGroup4 = this.LLL;
        if (viewGroup4 != null) {
            viewGroup4.setClickable(false);
        }
        Context sceneContext2 = getSceneContext();
        if (sceneContext2 == null) {
            return;
        }
        TuxTextView tuxTextView3 = this.LLJZ;
        if (tuxTextView3 != null) {
            tuxTextView3.setTextColor(sceneContext2.getResources().getColor(R.color.be));
        }
        TuxTextView tuxTextView4 = this.LLJZ;
        if (tuxTextView4 != null) {
            tuxTextView4.setTuxFont(31);
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_tick_fill;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a0i);
        TuxIconView tuxIconView2 = this.LLJLLL;
        if (tuxIconView2 != null) {
            tuxIconView2.setTuxIcon(c419910GdJ2);
        }
        C0GSN c0gsn3 = this.LLLFF;
        if (c0gsn3 == null) {
            return;
        }
        c0gsn3.setNeedLinearBackground(false);
    }

    public final void LLLLLLL(boolean z, boolean z2, boolean z3) {
        int i;
        if (!z2) {
            ViewGroup viewGroup = this.LLJLILLLLZIIL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
            }
            FrameLayout frameLayout = this.LLJLL;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLJLILLLLZIIL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        if (z) {
            ViewGroup viewGroup3 = this.LLJLILLLLZIIL;
            if (viewGroup3 != null) {
                viewGroup3.setClickable(true);
            }
            Context sceneContext = getSceneContext();
            if (sceneContext != null) {
                TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView != null) {
                    tuxTextView.setTextColor(sceneContext.getResources().getColor(R.color.f569bc));
                }
                TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTuxFont(32);
                }
                C419910GdJ c419910GdJ = new C419910GdJ();
                if (LLLLLJLJLL()) {
                    i = R.raw.icon_now_setting;
                } else {
                    i = R.raw.icon_microphone_fill;
                }
                c419910GdJ.LIZ = i;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                TuxIconView tuxIconView = this.LLJJL;
                if (tuxIconView != null) {
                    tuxIconView.setTuxIcon(c419910GdJ);
                }
            }
        } else {
            ViewGroup viewGroup4 = this.LLJLILLLLZIIL;
            if (viewGroup4 != null) {
                viewGroup4.setClickable(false);
            }
            Context sceneContext2 = getSceneContext();
            if (sceneContext2 != null) {
                TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView3 != null) {
                    tuxTextView3.setTextColor(sceneContext2.getResources().getColor(R.color.be));
                }
                TuxTextView tuxTextView4 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView4 != null) {
                    tuxTextView4.setTuxFont(31);
                }
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_tick_fill;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a0i);
                TuxIconView tuxIconView2 = this.LLJJL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setTuxIcon(c419910GdJ2);
                }
            }
        }
        if (z3) {
            FrameLayout frameLayout2 = this.LLJLL;
            if (frameLayout2 != null) {
                C786410Ut5.LJZ(0, frameLayout2);
                return;
            }
            return;
        }
        FrameLayout frameLayout3 = this.LLJLL;
        if (frameLayout3 == null) {
            return;
        }
        C786410Ut5.LJZ(8, frameLayout3);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TuxIconView tuxIconView;
        TuxTextView tuxTextView;
        TuxIconView tuxIconView2;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ere, viewGroup, false);
        View viewFindViewById = viewGroup3.findViewById(R.id.d9p);
        TuxTextView tuxTextView2 = null;
        if (viewFindViewById instanceof TuxIconView) {
            tuxIconView = (TuxIconView) viewFindViewById;
        } else {
            tuxIconView = null;
        }
        this.LLJLLL = tuxIconView;
        View viewFindViewById2 = viewGroup3.findViewById(R.id.d9q);
        if (viewFindViewById2 instanceof TuxTextView) {
            tuxTextView = (TuxTextView) viewFindViewById2;
        } else {
            tuxTextView = null;
        }
        this.LLJZ = tuxTextView;
        View viewFindViewById3 = viewGroup3.findViewById(R.id.oap);
        if (viewFindViewById3 instanceof TuxIconView) {
            tuxIconView2 = (TuxIconView) viewFindViewById3;
        } else {
            tuxIconView2 = null;
        }
        this.LLJJL = tuxIconView2;
        View viewFindViewById4 = viewGroup3.findViewById(R.id.oaq);
        if (viewFindViewById4 instanceof TuxTextView) {
            tuxTextView2 = (TuxTextView) viewFindViewById4;
        }
        this.LLJJLIIIJLLLLLLLZ = tuxTextView2;
        this.LLJL = viewGroup3.findViewById(R.id.v67);
        this.LLJLL = (FrameLayout) viewGroup3.findViewById(R.id.v66);
        this.LLJLIL = viewGroup3.findViewById(R.id.oc5);
        this.LLJZIJLIL = viewGroup3.findViewById(R.id.q98);
        this.LLL = (ViewGroup) viewGroup3.findViewById(R.id.d9n);
        this.LLJLILLLLZIIL = (ViewGroup) viewGroup3.findViewById(R.id.oao);
        this.LLLF = (FrameLayout) viewGroup3.findViewById(R.id.sza);
        this.LLLFF = (C0GSN) viewGroup3.findViewById(R.id.sz9);
        this.LLLFFI = (ViewGroup) viewGroup3.findViewById(R.id.sz_);
        this.LLLFZ = (C1642110spl) viewGroup3.findViewById(R.id.cwd);
        this.LLLI = (ViewGroup) viewGroup3.findViewById(R.id.q95);
        this.LLLII = (ViewGroup) viewGroup3.findViewById(R.id.tp4);
        this.LLJLLIL = (TuxTextView) viewGroup3.findViewById(R.id.q_8);
        this.LLLIIIIL = (TuxTextView) viewGroup3.findViewById(R.id.q_6);
        C0GSN c0gsn = this.LLLFF;
        if (c0gsn != null) {
            C1447470nlp.LIZIZ(c0gsn, C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
        }
        this.LLLIIIL = (ConstraintLayout) viewGroup3.findViewById(R.id.szb);
        View view = this.LLJZIJLIL;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS159S0100000_25(this, 11), view);
        }
        ViewGroup viewGroup4 = this.LLL;
        if (viewGroup4 != null) {
            C786410Ut5.K7(viewGroup4, new ACListenerS159S0100000_25(this, 12));
        }
        ViewGroup viewGroup5 = this.LLJLILLLLZIIL;
        if (viewGroup5 != null) {
            C786410Ut5.K7(viewGroup5, new ACListenerS159S0100000_25(this, 13));
        }
        FrameLayout frameLayout = this.LLJLL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS159S0100000_25(this, 14));
        }
        C1642110spl c1642110spl = this.LLLFZ;
        if (c1642110spl != null) {
            C786410Ut5.wa(c1642110spl, new ACListenerS159S0100000_25(this, 15));
        }
        C1642110spl c1642110spl2 = this.LLLFZ;
        if (c1642110spl2 != null) {
            C1546200qL4.LIZJ(49, c1642110spl2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1642110spl2.getLayoutParams();
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            marginLayoutParams.height = -2;
            c1642110spl2.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            c1642110spl2.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            C1428310nGv.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), c1642110spl2, false);
            List<String> list = C579450Mo3.LIZ;
            if (C579450Mo3.LIZIZ(this.LLJJJJLIIL) && C1627490sSB.LIZIZ() && (viewGroup2 = (ViewGroup) viewGroup3.findViewById(R.id.oh6)) != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
                layoutParams.removeRule(21);
                layoutParams.addRule(20);
                layoutParams.addRule(16, R.id.syo);
                C786410Ut5.X5(layoutParams, viewGroup2);
            }
        }
        AnonymousClass1250.LIZJ(this.LLLFZ);
        C1447800nmM.LIZIZ(this).LLLIILIL(this, new C1698360uIU(this, 2));
        ConstraintLayout constraintLayout = this.LLLIIIL;
        if (constraintLayout != null) {
            C786410Ut5.LL(4, constraintLayout);
        }
        FrameLayout frameLayout2 = this.LLLF;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(0, frameLayout2);
        }
        C0GSN c0gsn2 = this.LLLFF;
        if (c0gsn2 != null) {
            int visibility = c0gsn2.getVisibility();
            c0gsn2.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0gsn2);
        }
        return viewGroup3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1662320tMM(C1664690tQB<C1662500tMe> c1664690tQB, C1662570tMl c1662570tMl, C385670FAf<Boolean> c385670FAf, C385670FAf<Boolean> c385670FAf2, ShortVideoContext shortVideoContext) {
        int iLIZIZ;
        this.LLJJJIL = c1664690tQB;
        this.LLJJJJ = c385670FAf;
        this.LLJJJJJIL = c385670FAf2;
        this.LLJJJJLIIL = shortVideoContext;
        this.LLJJIJIIJIL = c1664690tQB;
        this.LLJJIJIL = c1662570tMl;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        if (((Boolean) C862010Xrj.LIZ.getValue()).booleanValue()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
        } else {
            iLIZIZ = 0;
        }
        this.LLLIIL = iLIZIZ2 + iLIZIZ;
        this.LLLIILIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 332));
        this.LLLIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(165));
        this.LLLILZJ = true;
    }
}
