package X;

import Y.ACListenerS166S0100000_32;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import avg.f;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import fyo.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mf.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21306918Zv extends FrameLayout implements Handler.Callback {
    public final TextureView LL;
    public TTVideoEngine LLILLJJLI;
    public Surface LLILLL;
    public final SmartImageView LLILZ;
    public final TuxSpinner LLILZIL;
    public final FrameLayout LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxIconView LLIZLLLIL;
    public C1845270y7R LLJ;
    public Function1<? super Float, Unit> LLJI;
    public Function1<? super C0DS7, Unit> LLJIJIL;
    public final HandlerThread LLJILJIL;
    public final BPEAHandler LLJILJILJ;
    public final BPEAHandler LLJILLL;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int iLJJJIL;
        final float f;
        int iLJJJJL;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            TTVideoEngine tTVideoEngine = this.LLILLJJLI;
                            if (tTVideoEngine != null) {
                                iLJJJIL = tTVideoEngine.LJJJIL();
                            } else {
                                iLJJJIL = 0;
                            }
                            TTVideoEngine tTVideoEngine2 = this.LLILLJJLI;
                            if (tTVideoEngine2 != null && (iLJJJJL = tTVideoEngine2.LJJJJL()) != 0) {
                                f = (iLJJJIL * 100.0f) / iLJJJJL;
                            } else {
                                f = 0.0f;
                            }
                            C786410Ut5.LJJZZIII(this.LLJILLL, new Runnable() { // from class: X.0N1j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("TakoVideoPlayerView@ccd2.handleMessage$1");
                                    try {
                                        Function1<? super Float, Unit> function1 = this.LL.LLJI;
                                        if (function1 != null) {
                                            function1.invoke(Float.valueOf(f));
                                        }
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("TakoVideoPlayerView@ccd2.handleMessage$1");
                                }
                            });
                            C786410Ut5.LJLJJI(5, 300L, this.LLJILJILJ);
                        }
                    } else {
                        TTVideoEngine tTVideoEngine3 = this.LLILLJJLI;
                        if (tTVideoEngine3 != null) {
                            tTVideoEngine3.release();
                        }
                        this.LLJILJILJ.removeCallbacksAndMessages(null);
                        this.LLJILJIL.quitSafely();
                        return false;
                    }
                } else {
                    int iIntValue = ((Integer) HandlerHook.getMessageObj(message.obj)).intValue();
                    TTVideoEngine tTVideoEngine4 = this.LLILLJJLI;
                    if (tTVideoEngine4 != null) {
                        tTVideoEngine4.LJIJJLI(iIntValue, null);
                        return false;
                    }
                }
            } else {
                TTVideoEngine tTVideoEngine5 = this.LLILLJJLI;
                if (tTVideoEngine5 != null) {
                    tTVideoEngine5.pause();
                    return false;
                }
            }
        } else {
            TTVideoEngine tTVideoEngine6 = this.LLILLJJLI;
            if (tTVideoEngine6 != null) {
                tTVideoEngine6.play();
                return false;
            }
        }
        return false;
    }

    public final void setData(C1845270y7R c1845270y7R) {
        List<String> list;
        this.LLJ = c1845270y7R;
        if (c1845270y7R != null && (list = c1845270y7R.urlList) != null) {
            SmartImageView smartImageView = this.LLILZ;
            if (smartImageView != null) {
                C786410Ut5.LLFF(0, smartImageView);
            }
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list));
            c1331670kl3LJIIJ.LJJ(this.LLILZ);
            c1331670kl3LJIIJ.LJIIJJI();
        }
        TuxSpinner tuxSpinner = this.LLILZIL;
        if (tuxSpinner != null) {
            C786410Ut5.LLZILL(tuxSpinner, 0);
        }
        Integer num = c1845270y7R.width;
        Integer num2 = c1845270y7R.height;
        if (num != null && num2 != null && num.intValue() > 0 && num2.intValue() > 0) {
            int screenWidth = ScreenUtils.getScreenWidth(getContext());
            int fullScreenHeight = ScreenUtils.getFullScreenHeight(getContext());
            float fIntValue = (screenWidth * num2.intValue()) / num.intValue();
            float f = fullScreenHeight;
            if (fIntValue >= f) {
                screenWidth = (int) ((f * num.intValue()) / num2.intValue());
            } else {
                fullScreenHeight = (int) fIntValue;
            }
            C12ES.LJIIZILJ(screenWidth, fullScreenHeight, this);
        }
        String str = null;
        if (C1004300cF2.LIZIZ(c1845270y7R.expireTime)) {
            TuxSpinner tuxSpinner2 = this.LLILZIL;
            if (tuxSpinner2 != null) {
                C786410Ut5.LLZILL(tuxSpinner2, 8);
            }
            LIZ(1, null);
            return;
        }
        HashMap map = new HashMap();
        map.put("enable_looper", Boolean.TRUE);
        map.put("handler_thread", this.LLJILJIL);
        TTVideoEngine tTVideoEngine = new TTVideoEngine(getContext(), 0, map);
        this.LLILLJJLI = tTVideoEngine;
        tTVideoEngine.LLILZIL("TakoVideoPlayerView");
        TTVideoEngine tTVideoEngine2 = this.LLILLJJLI;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.setLooping(true);
        }
        TTVideoEngine tTVideoEngine3 = this.LLILLJJLI;
        if (tTVideoEngine3 != null) {
            tTVideoEngine3.LIZJ(160, 1);
        }
        try {
            C1845270y7R c1845270y7R2 = this.LLJ;
            if (c1845270y7R2 != null) {
                str = c1845270y7R2.videoModel;
            }
            JSONObject jSONObject = new JSONObject(str);
            C1473400oRe c1473400oRe = new C1473400oRe();
            c1473400oRe.LIZJ(jSONObject);
            C1470240oMY c1470240oMY = new C1470240oMY();
            c1470240oMY.LJJIJLIJ(c1473400oRe);
            TTVideoEngine tTVideoEngine4 = this.LLILLJJLI;
            if (tTVideoEngine4 != null) {
                tTVideoEngine4.LJIL(c1470240oMY);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        TTVideoEngine tTVideoEngine5 = this.LLILLJJLI;
        if (tTVideoEngine5 != null) {
            tTVideoEngine5.LLJILLL(new InterfaceC1469360oL8() { // from class: X.18Zw
                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine6) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine6) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine6) {
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJIIJJI(TTVideoEngine tTVideoEngine6, int i, int i2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine6, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIILIIL(TTVideoEngine tTVideoEngine6) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJIILL(TTVideoEngine tTVideoEngine6) {
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
                public final /* synthetic */ void LJJIJ(Map map2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine6, int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine6, int i, long j, long j2, Map map2) {
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
                public final /* synthetic */ void LJJL(e eVar, String str2) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIIJ(int i) {
                }

                @Override // X.InterfaceC1469360oL8
                public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine6) {
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJ(TTVideoEngine tTVideoEngine6) {
                    String str2;
                    C21306918Zv c21306918Zv = this.LL;
                    SmartImageView smartImageView2 = c21306918Zv.LLILZ;
                    if (smartImageView2 != null) {
                        C786410Ut5.LLFF(8, smartImageView2);
                    }
                    Function1<? super C0DS7, Unit> function1 = c21306918Zv.LLJIJIL;
                    if (function1 != null) {
                        Long lValueOf = Long.valueOf(System.currentTimeMillis());
                        C1845270y7R c1845270y7R3 = c21306918Zv.LLJ;
                        if (c1845270y7R3 != null) {
                            str2 = c1845270y7R3.videoUrl;
                        } else {
                            str2 = null;
                        }
                        function1.invoke(new C0DS7(0, 0, lValueOf, str2, 2));
                    }
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJI(e eVar) {
                    Integer numValueOf;
                    TuxSpinner tuxSpinner3 = this.LL.LLILZIL;
                    if (tuxSpinner3 != null) {
                        C786410Ut5.LLZILL(tuxSpinner3, 8);
                    }
                    C21306918Zv c21306918Zv = this.LL;
                    if (eVar != null) {
                        numValueOf = Integer.valueOf(eVar.LIZ);
                    } else {
                        numValueOf = null;
                    }
                    c21306918Zv.LIZ(2, numValueOf);
                }

                @Override // X.InterfaceC1469360oL8
                public final void LIZJ(TTVideoEngine tTVideoEngine6, int i) {
                    if (i == 1) {
                        C786410Ut5.LJLILLLLZI(this.LL.LLJILJILJ, 5);
                    } else {
                        this.LL.LLJILJILJ.removeMessages(5);
                    }
                }

                @Override // X.InterfaceC1469360oL8
                public final void LJIJ(TTVideoEngine tTVideoEngine6, int i) {
                    TuxSpinner tuxSpinner3;
                    if (i != 1) {
                        if (i == 2 && (tuxSpinner3 = this.LL.LLILZIL) != null) {
                            C786410Ut5.LLZILL(tuxSpinner3, 0);
                            return;
                        }
                        return;
                    }
                    TuxSpinner tuxSpinner4 = this.LL.LLILZIL;
                    if (tuxSpinner4 == null) {
                        return;
                    }
                    C786410Ut5.LLZILL(tuxSpinner4, 8);
                }
            });
        }
        TextureView textureView = this.LL;
        if (textureView == null) {
            return;
        }
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.18Zx
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
                C21306918Zv c21306918Zv = this.LL;
                if (c21306918Zv.LLILLL == null) {
                    c21306918Zv.LLILLL = new Surface(surfaceTexture);
                }
                C21306918Zv c21306918Zv2 = this.LL;
                TTVideoEngine tTVideoEngine6 = c21306918Zv2.LLILLJJLI;
                if (tTVideoEngine6 != null) {
                    tTVideoEngine6.setSurface(c21306918Zv2.LLILLL);
                    C21306918Zv c21306918Zv3 = this.LL;
                    TuxIconView tuxIconView = c21306918Zv3.LLIZLLLIL;
                    if (tuxIconView != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                    }
                    C786410Ut5.LJLILLLLZI(c21306918Zv3.LLJILJILJ, 1);
                }
            }
        });
    }

    public final void setPlayResultCallback(Function1<? super C0DS7, Unit> function1) {
        this.LLJIJIL = function1;
    }

    public final void setProgressListener(Function1<? super Float, Unit> function1) {
        this.LLJI = function1;
    }

    public C21306918Zv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        HandlerThread handlerThread = new HandlerThread("tako_player_thread");
        handlerThread.start();
        this.LLJILJIL = handlerThread;
        this.LLJILJILJ = new BPEAHandler(C786410Ut5.W2(handlerThread), this);
        this.LLJILLL = new BPEAHandler(Looper.getMainLooper());
        C786410Ut5.Sd(R.layout.fry, C786410Ut5.ne(context), this);
        this.LL = (TextureView) findViewById(R.id.xry);
        this.LLILZ = (SmartImageView) findViewById(R.id.video_cover);
        this.LLILZIL = (TuxSpinner) findViewById(R.id.video_loading);
        this.LLILZLL = (FrameLayout) findViewById(R.id.video_error);
        this.LLIZ = (TuxTextView) findViewById(R.id.hc1);
        this.LLIZLLLIL = (TuxIconView) findViewById(R.id.qmu);
        View.OnClickListener aCListenerS166S0100000_32 = new ACListenerS166S0100000_32(this, 135);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS166S0100000_32) : aCListenerS166S0100000_32);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final void LIZ(int i, Integer num) {
        String string;
        String str;
        FrameLayout frameLayout = this.LLILZLL;
        int iIntValue = 0;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        if (i == 1 || i != 2) {
            string = getContext().getString(2131849912);
        } else {
            string = getContext().getString(2131849656);
        }
        TuxTextView tuxTextView = this.LLIZ;
        if (tuxTextView != null) {
            tuxTextView.setText(string);
        }
        Function1<? super C0DS7, Unit> function1 = this.LLJIJIL;
        if (function1 != null) {
            if (num != null) {
                iIntValue = num.intValue();
            }
            C1845270y7R c1845270y7R = this.LLJ;
            if (c1845270y7R != null) {
                str = c1845270y7R.videoUrl;
            } else {
                str = null;
            }
            function1.invoke(new C0DS7(i, iIntValue, null, str, 4));
        }
    }
}
