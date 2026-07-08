package X;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vyC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762660vyC extends AbstractC1763170vz1 {
    public final Object LL;
    public final C1765590w2v LLILLJJLI;
    public C1508390pM5 LLILLL;
    public Aweme LLILZ;
    public boolean LLILZIL;
    public InterfaceC1763420vzQ LLILZLL;

    @Override // X.AbstractC1763170vz1
    public final void onViewAttachedToWindow() {
        this.LLILLJJLI.LJ();
        C1508390pM5 c1508390pM5 = this.LLILLL;
        if (c1508390pM5 == null) {
            c1508390pM5 = null;
        }
        c1508390pM5.LIZJ(this.LLILLJJLI);
    }

    @Override // X.AbstractC1763170vz1
    public final void onViewDetachedFromWindow() {
        C1508390pM5 c1508390pM5 = this.LLILLL;
        if (c1508390pM5 == null) {
            c1508390pM5 = null;
        }
        c1508390pM5.pause();
        C1508390pM5 c1508390pM52 = this.LLILLL;
        (c1508390pM52 != null ? c1508390pM52 : null).LJIIIZ(this.LLILLJJLI);
    }

    @Override // X.AbstractC1763170vz1
    public final void I5(AbstractC1763110vyv abstractC1763110vyv) {
        C1508390pM5 c1508390pM5;
        C1508390pM5 c1508390pM52;
        C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.player_view));
        C1762710vyH c1762710vyH = (C1762710vyH) abstractC1763110vyv;
        Aweme awemeLIZJ = c1762710vyH.LIZJ();
        this.LLILZ = awemeLIZJ;
        C1508390pM5 c1508390pM53 = c1762710vyH.LJIIIZ;
        if (c1508390pM53 == null) {
            return;
        }
        this.LLILLL = c1508390pM53;
        Video video = awemeLIZJ.getVideo();
        if (video != null) {
            C1765590w2v c1765590w2v = this.LLILLJJLI;
            c1765590w2v.setVideoSize(new C0JSE(video.getWidth(), video.getHeight()));
            c1765590w2v.setVideoLength(video.getVideoLength());
            C1508390pM5 c1508390pM54 = this.LLILLL;
            if (c1508390pM54 == null) {
                c1508390pM54 = null;
            }
            c1765590w2v.setPlayer(c1508390pM54);
            C1508390pM5 c1508390pM55 = this.LLILLL;
            if (c1508390pM55 == null) {
                c1508390pM5 = null;
            } else {
                c1508390pM5 = c1508390pM55;
            }
            if (c1508390pM5.LJ == null) {
                if (c1508390pM55 == null) {
                    c1508390pM52 = null;
                } else {
                    c1508390pM52 = c1508390pM55;
                }
                c1508390pM52.LJ = video;
                c1508390pM52.LJFF = 0;
                if (c1508390pM55 == null) {
                    c1508390pM55 = null;
                }
                Aweme aweme = this.LLILZ;
                InterfaceC1508380pM4 interfaceC1508380pM4 = c1508390pM55.LJII;
                if (interfaceC1508380pM4 != null) {
                    interfaceC1508380pM4.LIZIZ(aweme);
                }
            }
            InterfaceC1763420vzQ interfaceC1763420vzQ = this.LLILZLL;
            if (interfaceC1763420vzQ != null) {
                this.LLILLJJLI.setPlayerLogListener(interfaceC1763420vzQ);
            }
            this.LLILLJJLI.getVideoSurfaceFromXml().setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.0vyB
                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    C1508390pM5 c1508390pM56;
                    C1508390pM5 c1508390pM57 = this.LL.LLILLL;
                    if (c1508390pM57 == null) {
                        c1508390pM56 = null;
                    } else {
                        c1508390pM56 = c1508390pM57;
                    }
                    if (c1508390pM56.LIZJ != null) {
                        if (c1508390pM57 == null) {
                            c1508390pM57 = null;
                        }
                        if (!C1508390pM5.LJIILIIL(c1508390pM57.LIZJ)) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
                @Override // android.view.TextureView.SurfaceTextureListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r6, int r7, int r8) {
                    /*
                        r5 = this;
                        X.0vyC r2 = r5.LL
                        X.0pM5 r1 = r2.LLILLL
                        r4 = 0
                        if (r1 != 0) goto L9e
                        r0 = r4
                    L8:
                        android.graphics.SurfaceTexture r0 = r0.LIZJ
                        r3 = 0
                        if (r0 == 0) goto L83
                        boolean r0 = r2.LLILZIL
                        if (r0 != 0) goto L83
                        if (r1 != 0) goto L14
                        r1 = r4
                    L14:
                        android.graphics.SurfaceTexture r0 = r1.LIZJ
                        boolean r0 = X.C1508390pM5.LJIILIIL(r0)
                        if (r0 != 0) goto L83
                        X.0vyC r2 = r5.LL
                        X.0pM5 r0 = r2.LLILLL
                        if (r0 != 0) goto L23
                        r0 = r4
                    L23:
                        android.graphics.SurfaceTexture r1 = r0.LIZJ
                        if (r1 == 0) goto L40
                        X.0w2v r0 = r2.LLILLJJLI
                        android.view.TextureView r0 = r0.getVideoSurfaceFromXml()
                        android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 != 0) goto L40
                        X.0w2v r0 = r2.LLILLJJLI
                        android.view.TextureView r0 = r0.getVideoSurfaceFromXml()
                        r0.setSurfaceTexture(r1)
                    L40:
                        X.0vyC r0 = r5.LL
                        X.0pM5 r1 = r0.LLILLL
                        if (r1 != 0) goto L47
                        r1 = r4
                    L47:
                        android.view.View r0 = r0.itemView
                        r0.getContext()
                        r1.getClass()
                        X.0vyC r0 = r5.LL
                        X.0pM5 r2 = r0.LLILLL
                        if (r2 != 0) goto L81
                        r0 = r4
                    L56:
                        X.0pMz r0 = r0.LJIILLIIL
                        X.0pMz r1 = X.EnumC1508950pMz.PLAYER_IDLE
                        if (r0 != r1) goto L5d
                        r3 = 1
                    L5d:
                        if (r2 != 0) goto L60
                        r2 = r4
                    L60:
                        X.0pMz r0 = r2.LJIILLIIL
                        if (r0 != r1) goto L7d
                        r2.LJIIJJI()
                    L67:
                        X.0vyC r0 = r5.LL
                        X.0pM5 r1 = r0.LLILLL
                        if (r1 != 0) goto L7b
                        r0 = r4
                    L6e:
                        boolean r0 = r0.LJIJ
                        if (r0 != 0) goto L74
                        if (r3 == 0) goto L7a
                    L74:
                        if (r1 == 0) goto L77
                        r4 = r1
                    L77:
                        r4.pause()
                    L7a:
                        return
                    L7b:
                        r0 = r1
                        goto L6e
                    L7d:
                        r2.resume()
                        goto L67
                    L81:
                        r0 = r2
                        goto L56
                    L83:
                        X.0vyC r0 = r5.LL
                        X.0pM5 r1 = r0.LLILLL
                        if (r1 != 0) goto L8a
                        r1 = r4
                    L8a:
                        android.view.Surface r0 = new android.view.Surface
                        r0.<init>(r6)
                        X.C1508390pM5.LJIIJ(r1, r0)
                        X.0vyC r1 = r5.LL
                        X.0pM5 r0 = r1.LLILLL
                        if (r0 != 0) goto L99
                        r0 = r4
                    L99:
                        r0.LIZJ = r6
                        r1.LLILZIL = r3
                        goto L40
                    L9e:
                        r0 = r1
                        goto L8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.TextureViewSurfaceTextureListenerC1762650vyB.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
                }
            });
            if (c1762710vyH.LJIIJ != null) {
                C1765590w2v c1765590w2v2 = this.LLILLJJLI;
                if (c1765590w2v2.LLJL == null) {
                    c1765590w2v2.LLJL = new TuxTextView(c1765590w2v2.getContext(), null, 6, 0);
                    TuxTextView tuxTextView = c1765590w2v2.LLJL;
                    if (tuxTextView != null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 80);
                        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(74));
                        C786410Ut5.R6(tuxTextView, layoutParams);
                        c1765590w2v2.addView(tuxTextView);
                        C03DZ.LIZ(tuxTextView);
                    }
                }
                C1765590w2v c1765590w2v3 = this.LLILLJJLI;
                ECRichText eCRichText = c1762710vyH.LJIIJ;
                TuxTextView tuxTextView2 = c1765590w2v3.LLJL;
                if (tuxTextView2 != null) {
                    if (eCRichText == null) {
                        C03DZ.LIZ(tuxTextView2);
                    } else {
                        C03B0 c03b0 = new C03B0(tuxTextView2, "pdp_carousel_disclaimer_label");
                        C03B0.LIZ(c03b0, eCRichText, null, null, false, null, null, 126);
                        tuxTextView2.setText(c03b0.LIZJ);
                        TuxTextView tuxTextView3 = c1765590w2v3.LLJL;
                        if (tuxTextView3 != null) {
                            C03DZ.LIZJ(tuxTextView3);
                        }
                    }
                }
            } else {
                TuxTextView disclaimerTextView = this.LLILLJJLI.getDisclaimerTextView();
                if (disclaimerTextView != null) {
                    C03DZ.LIZ(disclaimerTextView);
                }
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(video.getCover()));
            c1331670kl3LJIIIIZZ.LJJIJL(this.itemView.getContext());
            c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIIZZ.LJJII(new C1775640wJ8(this, 1));
        }
    }

    public C1762660vyC(C21649519o5 c21649519o5, Object obj) {
        super(c21649519o5);
        this.LL = obj;
        this.LLILLJJLI = c21649519o5.getPlayerViewV2FromXml();
        this.LLILZIL = true;
    }
}
