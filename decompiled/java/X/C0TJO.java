package X;

import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.widget.ImageView;
import com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneCameraScannerFragment;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;

/* JADX INFO: renamed from: X.0TJO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TJO implements SurfaceHolder.Callback {
    public final /* synthetic */ GamePhoneCameraScannerFragment LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ SurfaceHolder LLILLL;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_phone_camera_connect_page_action");
        c474500IjALIZ.LJJII("show", "action");
        c474500IjALIZ.LJJII(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId(), "device_id");
        c474500IjALIZ.LJJII("wireless", "show_page");
        c474500IjALIZ.LIZ();
        GamePhoneCameraScannerFragment gamePhoneCameraScannerFragment = this.LL;
        C0TJN c0tjn = gamePhoneCameraScannerFragment.LLILLJJLI;
        if (c0tjn != null) {
            if (gamePhoneCameraScannerFragment.LLJIJIL) {
                gamePhoneCameraScannerFragment.NR();
                return;
            } else {
                ((C19287310cx) c0tjn).LIZ();
                this.LL.NR();
                return;
            }
        }
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        C0TJN c0tjnInitGameScanner = null;
        String string = null;
        if (iHostAppContext != null) {
            Context context = this.LLILLJJLI;
            SurfaceHolder surfaceHolder2 = this.LLILLL;
            final GamePhoneCameraScannerFragment gamePhoneCameraScannerFragment2 = this.LL;
            InterfaceC19289210dG interfaceC19289210dG = new InterfaceC19289210dG() { // from class: X.0TJP
                @Override // X.InterfaceC19289210dG
                public final void LIZ() {
                    C19EG activity = gamePhoneCameraScannerFragment2.getActivity();
                    if (activity != null) {
                        activity.runOnUiThread(new ARunnableS112S0100000_12(gamePhoneCameraScannerFragment2, 129));
                    }
                }

                @Override // X.InterfaceC19289210dG
                public final void onInit() {
                    C0TJO c0tjo = this.LIZ;
                    GamePhoneCameraScannerFragment gamePhoneCameraScannerFragment3 = c0tjo.LL;
                    if (gamePhoneCameraScannerFragment3.LLJIJIL) {
                        gamePhoneCameraScannerFragment3.NR();
                    } else {
                        C0TJN c0tjn2 = gamePhoneCameraScannerFragment3.LLILLJJLI;
                        if (c0tjn2 != null) {
                            ((C19287310cx) c0tjn2).LIZ();
                        }
                        c0tjo.LL.NR();
                    }
                    GamePhoneCameraScannerFragment gamePhoneCameraScannerFragment4 = gamePhoneCameraScannerFragment2;
                    synchronized (this) {
                        try {
                            gamePhoneCameraScannerFragment4.LLILZLL = true;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }

                @Override // X.InterfaceC19289210dG
                public final void onSuccess() {
                    C19EG activity = gamePhoneCameraScannerFragment2.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            };
            Bundle arguments = gamePhoneCameraScannerFragment2.getArguments();
            if (arguments != null) {
                string = arguments.getString("enter_from");
            }
            c0tjnInitGameScanner = iHostAppContext.initGameScanner(context, surfaceHolder2, interfaceC19289210dG, string);
        }
        gamePhoneCameraScannerFragment.LLILLJJLI = c0tjnInitGameScanner;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        IQRCodeScanner iQRCodeScanner;
        ImageView imageView = this.LL.LLILLL;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        GamePhoneCameraScannerFragment gamePhoneCameraScannerFragment = this.LL;
        synchronized (this) {
            try {
                C0TJN c0tjn = gamePhoneCameraScannerFragment.LLILLJJLI;
                if (c0tjn != null && (iQRCodeScanner = ((C19287310cx) c0tjn).LIZIZ) != null) {
                    iQRCodeScanner.stopVE();
                }
                C0TJN c0tjn2 = gamePhoneCameraScannerFragment.LLILLJJLI;
                if (c0tjn2 != null) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C313900CSe((C19287310cx) c0tjn2, null), 3);
                }
                gamePhoneCameraScannerFragment.LLILZLL = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ImageView imageView2 = this.LL.LLILLL;
        if (imageView2 != null) {
            imageView2.clearAnimation();
        }
    }

    public C0TJO(GamePhoneCameraScannerFragment gamePhoneCameraScannerFragment, Context context, SurfaceHolder surfaceHolder) {
        this.LL = gamePhoneCameraScannerFragment;
        this.LLILLJJLI = context;
        this.LLILLL = surfaceHolder;
    }
}
