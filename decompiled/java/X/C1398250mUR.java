package X;

import Y.ARunnableS90S0200000_21;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.music.ab.MdpShowSquareABSwitchConfig;
import com.ss.android.ugc.aweme.music.ui.MusicSquareViewHolder;
import com.ss.android.ugc.aweme.music.v2.viewmodel.IMDPAutoPlayAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mUR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1398250mUR extends C1398630mV3 implements InterfaceC1401180mZA {
    public static int LLLF;
    public static int LLLFF;
    public static int LLLFFI;
    public final C1473870oSP LLJLLL;
    public Aweme LLJZ;
    public volatile boolean LLJZIJLIL;
    public final C1398230mUP LLL;

    @Override // X.C1398630mV3, X.AbstractC1260080ita
    public final int[] R5() {
        return null;
    }

    public final void C6() {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        C1331070kk5 hierarchy;
        C1473870oSP c1473870oSP = this.LLJLLL;
        ViewGroup.LayoutParams layoutParams3 = c1473870oSP != null ? c1473870oSP.getLayoutParams() : null;
        if (!(layoutParams3 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams3) == null) {
            return;
        }
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, LLLFFI);
        layoutParams.height = LLLF;
        C1473870oSP c1473870oSP2 = this.LLJLLL;
        if (c1473870oSP2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1473870oSP2);
            c1473870oSP2.setLayoutParams(layoutParams);
        }
        SmartImageView smartImageView = this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams4 = smartImageView != null ? smartImageView.getLayoutParams() : null;
        if (!(layoutParams4 instanceof FrameLayout.LayoutParams) || (layoutParams2 = (FrameLayout.LayoutParams) layoutParams4) == null) {
            return;
        }
        layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, LLLFFI);
        layoutParams2.height = LLLF;
        SmartImageView smartImageView2 = this.LLILLJJLI;
        if (smartImageView2 != null) {
            C786410Ut5.G6(smartImageView2, layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams5 = this.itemView.getLayoutParams();
        layoutParams5.height = LLLFFI + LLLF;
        C786410Ut5.W5(this.itemView, layoutParams5);
        View view = this.itemView;
        if (view instanceof FixedRatioFrameLayout) {
            ((FixedRatioFrameLayout) view).setWhRatio(LLLFF / layoutParams5.height);
        }
        PointF pointF = new PointF(0.5f, 0.0f);
        SmartImageView smartImageView3 = this.LLILLJJLI;
        if (smartImageView3 != null && (hierarchy = smartImageView3.getHierarchy()) != null) {
            hierarchy.LJIILIIL(2).LJIJ(pointF);
        }
        this.itemView.requestLayout();
    }

    public final void w6() {
        IMDPAutoPlayAbility iMDPAutoPlayAbility;
        ObjectAnimator objectAnimator;
        View view;
        IMDPAutoPlayAbility iMDPAutoPlayAbility2;
        if (this.LLJZIJLIL) {
            C1473870oSP c1473870oSP = this.LLJLLL;
            if (c1473870oSP != null && (view = this.itemView) != null && (iMDPAutoPlayAbility2 = (IMDPAutoPlayAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPAutoPlayAbility.class, null)) != null) {
                iMDPAutoPlayAbility2.pu2(c1473870oSP);
            }
            MusicSquareViewHolder musicSquareViewHolder = (MusicSquareViewHolder) this;
            musicSquareViewHolder.LLLIIL = false;
            musicSquareViewHolder.LLLIIII.setTintColorRes(R.attr.zi);
            musicSquareViewHolder.LLLIIII.setIconRes(R.raw.icon_spinner_normal);
            C786410Ut5.Fb(musicSquareViewHolder.LLLIIII, 0.0f);
            ObjectAnimator objectAnimator2 = musicSquareViewHolder.LLLILZ;
            if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = musicSquareViewHolder.LLLILZ) != null) {
                objectAnimator.cancel();
            }
            musicSquareViewHolder.LLLILZ = null;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(musicSquareViewHolder.LLLIIII, "rotation", 0.0f, 360.0f);
            musicSquareViewHolder.LLLILZ = objectAnimatorOfFloat;
            if (objectAnimatorOfFloat != null) {
                objectAnimatorOfFloat.setDuration(800L);
            }
            ObjectAnimator objectAnimator3 = musicSquareViewHolder.LLLILZ;
            if (objectAnimator3 != null) {
                objectAnimator3.setRepeatMode(1);
            }
            ObjectAnimator objectAnimator4 = musicSquareViewHolder.LLLILZ;
            if (objectAnimator4 != null) {
                objectAnimator4.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator5 = musicSquareViewHolder.LLLILZ;
            if (objectAnimator5 != null) {
                C786410Ut5.Pd(objectAnimator5);
            }
            View view2 = this.itemView;
            if (view2 != null && (iMDPAutoPlayAbility = (IMDPAutoPlayAbility) C1558520qew.LIZ(C1558360qeg.LJ(view2, null), IMDPAutoPlayAbility.class, null)) != null) {
                iMDPAutoPlayAbility.ZB1(this.LLJZ, musicSquareViewHolder.LLLII.getBoolean(musicSquareViewHolder.LLLIIIL, ((MdpShowSquareABSwitchConfig) C636090OxD.LIZIZ.getValue()).videoMuted), C584710MwX.LIZ(musicSquareViewHolder.LL.getAid(), "video"));
            }
            this.LLJZIJLIL = false;
        }
    }

    @Override // X.C1398630mV3, X.InterfaceC1259900itI
    public final void M0() {
        super.M0();
    }

    @Override // X.C1398630mV3, X.AbstractC1261240ivS
    public final void a6() {
        super.a6();
    }

    @Override // X.AbstractC1620180sGO, X.InterfaceC1259900itI
    public final void LJLJJLL(boolean z) {
        IMDPAutoPlayAbility iMDPAutoPlayAbility;
        IMDPAutoPlayAbility iMDPAutoPlayAbility2;
        super.LJLJJLL(z);
        if (z) {
            View view = this.itemView;
            if (view != null && (iMDPAutoPlayAbility2 = (IMDPAutoPlayAbility) C1558520qew.LIZ(C1558360qeg.LJ(view, null), IMDPAutoPlayAbility.class, null)) != null) {
                iMDPAutoPlayAbility2.p91(this.LLL);
                return;
            }
            return;
        }
        View view2 = this.itemView;
        if (view2 == null || (iMDPAutoPlayAbility = (IMDPAutoPlayAbility) C1558520qew.LIZ(C1558360qeg.LJ(view2, null), IMDPAutoPlayAbility.class, null)) == null) {
            return;
        }
        iMDPAutoPlayAbility.KK2(this.LLL);
    }

    public void i2(int i) {
        Surface surface;
        this.LLJZIJLIL = true;
        C1473870oSP c1473870oSP = this.LLJLLL;
        if (c1473870oSP != null) {
            int visibility = c1473870oSP.getVisibility();
            c1473870oSP.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c1473870oSP);
        }
        C1473870oSP c1473870oSP2 = this.LLJLLL;
        if (c1473870oSP2 != null && (surface = c1473870oSP2.getSurface()) != null && surface.isValid()) {
            w6();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0mUP] */
    public C1398250mUR(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
        View viewTd;
        View viewTd2;
        super(view, str, interfaceC1260110itd);
        this.LLJLLL = (C1473870oSP) view.findViewById(R.id.video_view);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.hra);
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        RemoteImageView remoteImageView = this.LLJI;
        if (remoteImageView != null) {
            C786410Ut5.l(remoteImageView, 8);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.y_m);
        if (constraintLayout2 != null && (viewTd2 = C786410Ut5.Td(C786410Ut5.ne(this.itemView.getContext()), R.layout.dqg, constraintLayout2, false)) != null) {
            constraintLayout2.addView(viewTd2);
            C786410Ut5.LL(0, constraintLayout2);
        }
        ConstraintLayout constraintLayout3 = (ConstraintLayout) view.findViewById(R.id.ccl);
        if (constraintLayout3 != null && (viewTd = C786410Ut5.Td(C786410Ut5.ne(this.itemView.getContext()), R.layout.dqf, constraintLayout3, false)) != null) {
            constraintLayout3.addView(viewTd);
            C786410Ut5.LL(0, constraintLayout3);
        }
        final C1398240mUQ c1398240mUQ = (C1398240mUQ) this;
        this.LLL = new InterfaceC584700MwW() { // from class: X.0mUP
            @Override // X.InterfaceC584700MwW
            public final void LJJIJIIJI(String str2) {
            }

            @Override // X.InterfaceC584700MwW
            public final void onPlayCompleted(String str2, int i) {
            }

            @Override // X.InterfaceC584700MwW
            public final void onRelease() {
            }

            @Override // X.InterfaceC584700MwW
            public final void LIZ() {
                c1398240mUQ.getClass();
            }

            @Override // X.InterfaceC584700MwW
            public final void onFailed() {
                C786410Ut5.LLLLLLZZ(((MusicSquareViewHolder) c1398240mUQ).LLLIIII, 8);
            }

            @Override // X.InterfaceC584700MwW
            public final void m0(boolean z) {
                ObjectAnimator objectAnimator;
                MusicSquareViewHolder musicSquareViewHolder = (MusicSquareViewHolder) c1398240mUQ;
                ObjectAnimator objectAnimator2 = musicSquareViewHolder.LLLILZ;
                if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = musicSquareViewHolder.LLLILZ) != null) {
                    objectAnimator.cancel();
                }
                C786410Ut5.Fb(musicSquareViewHolder.LLLIIII, 0.0f);
                if (z) {
                    musicSquareViewHolder.LLLIIII.setIconRes(R.raw.icon_speaker_2_slash_ltr);
                } else {
                    musicSquareViewHolder.LLLIIII.setIconRes(R.raw.icon_speaker_2_ltr);
                }
                musicSquareViewHolder.LLLIIIIL = z;
            }

            @Override // X.InterfaceC584700MwW
            public final void onPause(String str2) {
                String aid;
                Aweme aweme;
                C1398240mUQ c1398240mUQ2 = (C1398240mUQ) c1398240mUQ;
                Aweme aweme2 = c1398240mUQ2.LLJZ;
                Integer numValueOf = null;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str2) && (aweme = c1398240mUQ2.LLJZ) != null && AwemeExtKt.isPhotoMode(aweme)) {
                    InterfaceC661560PxC interfaceC661560PxC = c1398240mUQ2.LLLFZ;
                    if (interfaceC661560PxC != null) {
                        numValueOf = Integer.valueOf(interfaceC661560PxC.getCurrentPosition());
                    }
                    if (C584710MwX.LIZJ.length() == 0 || !Intrinsics.LJFF(C584710MwX.LIZJ, str2)) {
                        C584710MwX.LIZIZ(numValueOf, c1398240mUQ2.LL.getAid(), "photo");
                    }
                    InterfaceC661560PxC interfaceC661560PxC2 = c1398240mUQ2.LLLFZ;
                    if (interfaceC661560PxC2 != null) {
                        interfaceC661560PxC2.LIZJ();
                    }
                }
            }

            @Override // X.InterfaceC584700MwW
            public final void LIZIZ(String str2, boolean z) {
                String aid;
                ObjectAnimator objectAnimator;
                Aweme aweme;
                InterfaceC661560PxC interfaceC661560PxC;
                MusicSquareViewHolder musicSquareViewHolder = (MusicSquareViewHolder) c1398240mUQ;
                Aweme aweme2 = musicSquareViewHolder.LLJZ;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str2) && (aweme = musicSquareViewHolder.LLJZ) != null && AwemeExtKt.isPhotoMode(aweme) && (interfaceC661560PxC = musicSquareViewHolder.LLLFZ) != null) {
                    interfaceC661560PxC.LJIIIIZZ(Integer.valueOf(C584710MwX.LIZ(musicSquareViewHolder.LL.getAid(), "photo")));
                }
                if (Intrinsics.LJFF(musicSquareViewHolder.LL.getAid(), str2)) {
                    ObjectAnimator objectAnimator2 = musicSquareViewHolder.LLLILZ;
                    if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = musicSquareViewHolder.LLLILZ) != null) {
                        objectAnimator.cancel();
                    }
                    musicSquareViewHolder.LLLIIL = true;
                    C786410Ut5.Fb(musicSquareViewHolder.LLLIIII, 0.0f);
                    C786410Ut5.LLLLLLZZ(musicSquareViewHolder.LLLIIII, 0);
                    if (z) {
                        musicSquareViewHolder.LLLIIII.setIconRes(R.raw.icon_speaker_2_slash_ltr);
                    } else {
                        musicSquareViewHolder.LLLIIII.setIconRes(R.raw.icon_speaker_2_ltr);
                    }
                }
            }
        };
    }

    public final void D6(C1473870oSP c1473870oSP, int i, int i2) {
        Video video;
        float f;
        Aweme aweme = this.LL;
        if (aweme != null && (video = aweme.getVideo()) != null && video.getWidth() > 0 && video.getHeight() > 0 && i > 0 && i2 > 0 && c1473870oSP != null) {
            float height = video.getHeight() / video.getWidth();
            if (height <= 0.0f) {
                return;
            }
            float f2 = i2 / i;
            float f3 = 1.0f;
            if (f2 > height) {
                float f4 = f2 / height;
                f = 1.0f;
                f3 = f4;
            } else {
                f = height / f2;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f3, f, i / 2, i2 / 2);
            c1473870oSP.setTransform(matrix);
        }
    }

    public void z6(Aweme aweme, final int i, boolean z, Bundle bundle) {
        ConstraintLayout constraintLayout;
        C1473870oSP c1473870oSP = this.LLJLLL;
        if (c1473870oSP != null) {
            final C1398240mUQ c1398240mUQ = (C1398240mUQ) this;
            c1473870oSP.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0mUS
                @Override // android.view.TextureView.SurfaceTextureListener
                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    return true;
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                    C1398250mUR c1398250mUR = c1398240mUQ;
                    c1398250mUR.D6(c1398250mUR.LLJLLL, i2, i3);
                    if (C584710MwX.LIZIZ == i) {
                        c1398240mUQ.w6();
                    }
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
                    C1398250mUR c1398250mUR = c1398240mUQ;
                    c1398250mUR.D6(c1398250mUR.LLJLLL, i2, i3);
                }
            });
        }
        if (LLLF != 0 && LLLFFI != 0) {
            C6();
            return;
        }
        View view = this.itemView;
        if (view != null) {
            constraintLayout = (ConstraintLayout) view.findViewById(R.id.ccl);
        } else {
            constraintLayout = null;
        }
        HandlerHook.viewPost(this.itemView, new ARunnableS90S0200000_21(constraintLayout, (C1398240mUQ) this, 61));
    }
}
