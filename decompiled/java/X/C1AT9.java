package X;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.journey.step.swipeup.WelcomeVideoWidget;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.video.local.LocalVideoUrlModel;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1AT9, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.swipeup.WelcomeVideoWidget$onBindView$1", f = "WelcomeVideoWidget.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C1AT9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public WelcomeVideoWidget LL;
    public int LLILLJJLI;
    public final /* synthetic */ WelcomeVideoWidget LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AT9(WelcomeVideoWidget welcomeVideoWidget, View view, InterfaceC1364105Vn<? super C1AT9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = welcomeVideoWidget;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1AT9(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        WelcomeVideoWidget welcomeVideoWidget;
        UrlModel originCover;
        Video video;
        C1C7U.LIZ("WelcomeVideoWidget@634e.onBindView$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        RemoteImageView remoteImageView = null;
        C1ATA c1ata = null;
        if (i != 0) {
            if (i == 1) {
                welcomeVideoWidget = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            welcomeVideoWidget = this.LLILLL;
            this.LL = welcomeVideoWidget;
            this.LLILLJJLI = 1;
            welcomeVideoWidget.getClass();
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            if (TextUtils.isEmpty(welcomeVideoWidget.LLJJIJIIJIL)) {
                C189200o6.m2constructorimpl(false);
                c23260099m.resumeWith(false);
            } else {
                C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
                C1ATD c1atd = C1ATD.MB;
                c2137908Zd.LIZIZ.getClass();
                long jLJIIIIZZ = C2354709Kn.LJIIIIZZ(C1948707kD.LIZ().getApplicationContext());
                int i2 = C1ATC.LIZ[c1atd.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                long j = 1024;
                                jLJIIIIZZ = ((jLJIIIIZZ / j) / j) / j;
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            long j2 = 1024;
                            jLJIIIIZZ = (jLJIIIIZZ / j2) / j2;
                        }
                    } else {
                        jLJIIIIZZ /= (long) 1024;
                    }
                }
                if (jLJIIIIZZ > welcomeVideoWidget.LLJILLL) {
                    C23250099c.LIZLLL(C817503Hh.LL, null, null, new C2137808Zc(welcomeVideoWidget, c23260099m, null), 3);
                } else {
                    C189200o6.m2constructorimpl(false);
                    c23260099m.resumeWith(false);
                }
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("WelcomeVideoWidget@634e.onBindView$1");
                return objLJFF;
            }
        }
        welcomeVideoWidget.LLJJIJIL = ((Boolean) obj).booleanValue();
        WelcomeVideoWidget welcomeVideoWidget2 = this.LLILLL;
        if (welcomeVideoWidget2.LLJJIJIL) {
            welcomeVideoWidget2.LLJJI = this.LLILZ.findViewById(R.id.video_container);
            View view = welcomeVideoWidget2.LLJJI;
            if (view == null) {
                view = null;
            }
            final C1ATA c1ata2 = new C1ATA(view, welcomeVideoWidget2, welcomeVideoWidget2.LLJILJIL, welcomeVideoWidget2.LLJILJILJ);
            welcomeVideoWidget2.LLJJIII = c1ata2;
            String str = welcomeVideoWidget2.LLJJIJIIJIL;
            Aweme aweme = new Aweme();
            Video video2 = new Video();
            LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel();
            localVideoUrlModel.setSourceId(str);
            localVideoUrlModel.setUri(str);
            localVideoUrlModel.setUrlList(new ArrayList());
            localVideoUrlModel.getUrlList().add(localVideoUrlModel.getUri());
            localVideoUrlModel.setUrlKey(str);
            video2.setPlayAddr(localVideoUrlModel);
            video2.setPlayAddrBytevc1(video2.getPlayAddr());
            aweme.setVideo(video2);
            aweme.setAid(str);
            C1477920oYw.LIZJ.add(str);
            Integer num = welcomeVideoWidget2.LLJ;
            final boolean z = welcomeVideoWidget2.LLJI;
            final float f = welcomeVideoWidget2.LLJIJIL;
            C1911410zq7.LIZ("WelcomeVideoViewHolder", "on bind:");
            c1ata2.LJIIIZ = true;
            c1ata2.LJIIIIZZ = aweme;
            if (c1ata2.LJI.LIZ == 2) {
                C1ATF c1atf = c1ata2.LJFF;
                if (c1atf == null) {
                    c1atf = null;
                }
                c1atf.LIZ.pause();
            }
            c1ata2.LJI.LIZ = 0;
            C1ATF c1atf2 = c1ata2.LJFF;
            if (c1atf2 == null) {
                c1atf2 = null;
            }
            c1atf2.LIZJ = aweme;
            Aweme aweme2 = c1ata2.LJIIIIZZ;
            if (aweme2 != null && aweme2.getVideo() != null) {
                VideoViewComponent videoViewComponent = c1ata2.LIZLLL;
                if (videoViewComponent == null) {
                    videoViewComponent = null;
                }
                if (videoViewComponent.LLILLL.getView() instanceof TextureView) {
                    VideoViewComponent videoViewComponent2 = c1ata2.LIZLLL;
                    if (videoViewComponent2 == null) {
                        videoViewComponent2 = null;
                    }
                    videoViewComponent2.LLILLL.Dn(new InterfaceC1473950oSX() { // from class: X.1AMK
                        @Override // X.InterfaceC1473950oSX
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC1473950oSX
                        public final /* synthetic */ void LLF(int i3, int i4) {
                        }

                        @Override // X.InterfaceC1473950oSX
                        public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                        }

                        @Override // X.InterfaceC1473950oSX
                        public final void LLILLIZIL(int i3, int i4) {
                            if (z) {
                                C1ATA c1ata3 = c1ata2;
                                VideoViewComponent videoViewComponent3 = c1ata3.LIZLLL;
                                if (videoViewComponent3 == null) {
                                    videoViewComponent3 = null;
                                }
                                TextureView textureView = (TextureView) videoViewComponent3.LLILLL.getView();
                                float f2 = f;
                                c1ata3.getClass();
                                float f3 = i4 / i3;
                                int i5 = i3 / 2;
                                float f4 = 1.0f;
                                float f5 = f2 / f3;
                                if (f3 > f2) {
                                    f4 = f5;
                                    f5 = 1.0f;
                                }
                                if (textureView != null) {
                                    Matrix matrix = new Matrix();
                                    matrix.setScale(f4, f5, i5, 0.0f);
                                    textureView.setTransform(matrix);
                                }
                            }
                        }
                    });
                }
                VideoViewComponent videoViewComponent3 = c1ata2.LIZLLL;
                if (videoViewComponent3 == null) {
                    videoViewComponent3 = null;
                }
                if (videoViewComponent3.LLILLL.getView() instanceof SurfaceView) {
                    VideoViewComponent videoViewComponent4 = c1ata2.LIZLLL;
                    if (videoViewComponent4 == null) {
                        videoViewComponent4 = null;
                    }
                    ((SurfaceView) videoViewComponent4.LLILLL.getView()).getHolder().addCallback(new SurfaceHolder.Callback() { // from class: X.1ATG
                        @Override // android.view.SurfaceHolder.Callback
                        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
                        }

                        @Override // android.view.SurfaceHolder.Callback
                        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                        }

                        @Override // android.view.SurfaceHolder.Callback
                        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                        }
                    });
                }
            }
            if (c1ata2.LJIIIZ) {
                if (num != null) {
                    int iIntValue = num.intValue();
                    RemoteImageView remoteImageView2 = c1ata2.LJ;
                    if (remoteImageView2 == null) {
                        remoteImageView2 = null;
                    }
                    C1324840ka2.LIZ(remoteImageView2, iIntValue);
                }
            } else {
                RemoteImageView remoteImageView3 = c1ata2.LJ;
                if (remoteImageView3 == null) {
                    remoteImageView3 = null;
                }
                Aweme aweme3 = c1ata2.LJIIIIZZ;
                if (aweme3 != null && (video = aweme3.getVideo()) != null) {
                    originCover = video.getOriginCover();
                } else {
                    originCover = null;
                }
                C1324840ka2.LJFF(remoteImageView3, originCover);
            }
            RemoteImageView remoteImageView4 = c1ata2.LJ;
            if (remoteImageView4 == null) {
                remoteImageView4 = null;
            }
            C786410Ut5.l(remoteImageView4, 0);
            C1ATA c1ata3 = welcomeVideoWidget2.LLJJIII;
            if (c1ata3 != null) {
                c1ata = c1ata3;
            }
            c1ata.LIZJ();
        } else {
            View view2 = this.LLILZ;
            Integer num2 = welcomeVideoWidget2.LLJ;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                RemoteImageView remoteImageView5 = (RemoteImageView) view2.findViewById(R.id.w0e);
                welcomeVideoWidget2.LLJJ = remoteImageView5;
                if (remoteImageView5 == null) {
                    remoteImageView5 = null;
                }
                C786410Ut5.l(remoteImageView5, 0);
                RemoteImageView remoteImageView6 = welcomeVideoWidget2.LLJJ;
                if (remoteImageView6 != null) {
                    remoteImageView = remoteImageView6;
                }
                C1324840ka2.LIZ(remoteImageView, iIntValue2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WelcomeVideoWidget@634e.onBindView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
