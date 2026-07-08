package X;

import Y.ACallableS30S1000000_28;
import Y.ACallableS431S0100000_28;
import Y.ARunnableS47S0110000_28;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.os.Vibrator;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.commercialize.qrcode.ICQrcodeService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.anydoor.entry.IAnydoorEntryService;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.10aK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19271010aK implements InterfaceC19271910aT {
    public BaseActivity LIZ;
    public InterfaceC19271810aS LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public boolean LJFF;
    public C1909590znB LJI;
    public boolean LJIIIIZZ;
    public final Long LJIIJJI;
    public InterfaceC19272010aU LJIILIIL;
    public List<InterfaceC19271510aP> LJIILJJIL;
    public List<InterfaceC19271510aP> LJIILL;
    public String LJ = "default";
    public final C19289310dH LJIIL = new C19289310dH("QRCodeScanPresenter");
    public final C19271710aR LJIIIZ = new Object() { // from class: X.10aR
    };
    public final C19271610aQ LJII = new Object() { // from class: X.10aQ
    };
    public final QrCodeScanService LJIIJ = (QrCodeScanService) ServiceManager.get().getService(QrCodeScanService.class);

    public final void LIZJ(boolean z) {
        BaseActivity baseActivity = this.LIZ;
        if (baseActivity != null && !baseActivity.isDestroyed()) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS47S0110000_28(this, z, 0));
            if (z) {
                ((ScanQRCodeActivityV2) this.LIZIZ).LLLZLZ();
            }
        }
    }

    public final void LJ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("scan_duration", String.valueOf(System.currentTimeMillis() - this.LJIIJJI.longValue()));
        c2344009Gk.LJIIIIZZ("scanned_uid", str);
        C20684815ws.LJIILLIIL("qr_code_scan_success", c2344009Gk.LIZ);
    }

    public final void LJI(String str) {
        BaseActivity baseActivity = this.LIZ;
        if (baseActivity != null && !baseActivity.isDestroyed() && !TextUtils.isEmpty(str)) {
            this.LJIIIIZZ = true;
            this.LJIIJ.LIZ(str, this.LIZ, new InterfaceC1389750mGj() { // from class: X.10aN
                @Override // X.InterfaceC1389750mGj
                public final void doAfterDownLoad(int i, Boolean bool) {
                    C19271010aK c19271010aK = this.LIZ;
                    if (c19271010aK.LIZIZ != null) {
                        if (bool.booleanValue()) {
                            ((ScanQRCodeActivityV2) c19271010aK.LIZIZ).LLLLZIL();
                            ((ScanQRCodeActivityV2) c19271010aK.LIZIZ).LLLZZIL();
                            ((ScanQRCodeActivityV2) c19271010aK.LIZIZ).LLJJJ.clearAnimation();
                            return;
                        }
                        ((ScanQRCodeActivityV2) c19271010aK.LIZIZ).LLLZZIL();
                        if (i == 0) {
                            ((ScanQRCodeActivityV2) c19271010aK.LIZIZ).LLLLZLL(200);
                        } else if (i == -1) {
                            ((ScanQRCodeActivityV2) c19271010aK.LIZIZ).LLLLZLL(0);
                        } else {
                            ((ScanQRCodeActivityV2) c19271010aK.LIZIZ).LLLLZLL(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.10aR] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.10aQ] */
    public C19271010aK(BaseActivity baseActivity, InterfaceC19271810aS interfaceC19271810aS) {
        this.LJIIJJI = 0L;
        this.LIZ = baseActivity;
        this.LIZIZ = interfaceC19271810aS;
        this.LJIIJJI = Long.valueOf(System.currentTimeMillis());
    }

    public final void LJFF(String str, String str2) {
        BaseActivity baseActivity = this.LIZ;
        if (baseActivity != null && !baseActivity.isDestroyed()) {
            this.LJIIIIZZ = true;
            try {
                this.LJIIJ.downloadStickerHelper(str, str2, this.LIZ, ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera(), new IMainService.DownLoadFinishListener() { // from class: X.10aM
                    @Override // com.ss.android.ugc.aweme.services.IMainService.DownLoadFinishListener
                    public final void doAfterDownLoad(int i, Boolean bool) {
                        C19271010aK c19271010aK = this.LIZ;
                        if (c19271010aK.LIZIZ != null) {
                            if (bool.booleanValue()) {
                                ((ScanQRCodeActivityV2) c19271010aK.LIZIZ).LLLLZIL();
                                ((ScanQRCodeActivityV2) c19271010aK.LIZIZ).LLLZZIL();
                                ((ScanQRCodeActivityV2) c19271010aK.LIZIZ).LLJJJ.clearAnimation();
                                return;
                            }
                            ((ScanQRCodeActivityV2) c19271010aK.LIZIZ).LLLZZIL();
                            if (i == 0) {
                                ((ScanQRCodeActivityV2) c19271010aK.LIZIZ).LLLLZLL(200);
                            } else if (i == -1) {
                                ((ScanQRCodeActivityV2) c19271010aK.LIZIZ).LLLLZLL(0);
                            } else {
                                ((ScanQRCodeActivityV2) c19271010aK.LIZIZ).LLLLZLL(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                            }
                        }
                    }
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZIZ(String str, String str2, String str3, boolean z) {
        String str4;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "scan");
        if (z) {
            str4 = "scan_album";
        } else {
            str4 = "scan_cam";
        }
        c2344009Gk.LJIIIIZZ("enter_method", str4);
        c2344009Gk.LJIIIIZZ(str2, str3);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public final void LIZ(final int i, final int i2, final String str, final String str2, final boolean z) {
        this.LIZJ = z;
        C1893790zNh.LIZ.getClass();
        if (C1893790zNh.LIZIZ(str2)) {
            C1893790zNh.LJIIIZ(C2222691Bz1.LIZIZ().toLowerCase(), new InterfaceC1893800zNi() { // from class: X.07oE
                @Override // X.InterfaceC1893800zNi
                public final boolean isDebug() {
                    C844470XAv.LIZ.getClass();
                    return C844470XAv.LJIILL.equals("local_test");
                }

                @Override // X.InterfaceC1893800zNi
                public final void LIZ(String str3, Map<String, String> map) {
                    C20684815ws.LJIILLIIL(str3, map);
                }
            });
            C1893790zNh.LJIIIIZZ(str2, "", "scan_code", C1514430pVp.LIZLLL().booleanValue(), false);
            C1893790zNh.LJIIJ("inc_activity_start", str2, new HashMap());
        }
        try {
            if (C036E.LIZ.LIZIZ()) {
                ACallableS431S0100000_28 aCallableS431S0100000_28 = new ACallableS431S0100000_28(this, 0);
                ExecutorC2206508kh executorC2206508kh = C15O7.LJIIIIZZ;
                C15O7.LIZIZ(aCallableS431S0100000_28, executorC2206508kh, null).LJ(new InterfaceC2385309Wh<String, C19270910aJ>(str2, str, i2) { // from class: X.10aI
                    public final /* synthetic */ String LIZ;
                    public final /* synthetic */ String LIZIZ;

                    @Override // X.InterfaceC2385309Wh
                    public final C19270910aJ then(C15O7<String> c15o7) {
                        C19270910aJ c19270910aJ;
                        C1C7U.LIZ("QRCodeScanPresenter@e78f.handleScanSuccessAfterIntercept$3");
                        if (this.LIZ.isEmpty()) {
                            C19271610aQ c19271610aQ = this.LIZJ.LJII;
                            String strLIZIZ = this.LIZIZ;
                            c19271610aQ.getClass();
                            if (C0WR3.LIZ(strLIZIZ)) {
                                strLIZIZ = C10Z0.LIZIZ(strLIZIZ);
                            }
                            c19270910aJ = new C19270910aJ(strLIZIZ);
                        } else {
                            c19270910aJ = new C19270910aJ(this.LIZ);
                        }
                        C1C7U.LIZIZ("QRCodeScanPresenter@e78f.handleScanSuccessAfterIntercept$3");
                        return c19270910aJ;
                    }
                }, C15O7.LJI, null).LJ(new InterfaceC2385309Wh<C19270910aJ, String>() { // from class: X.10aL
                    /* JADX WARN: Removed duplicated region for block: B:70:0x0220  */
                    @Override // X.InterfaceC2385309Wh
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.String then(X.C15O7<X.C19270910aJ> r14) {
                        /*
                            Method dump skipped, instruction units count: 547
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C19271110aL.then(X.15O7):java.lang.Object");
                    }
                }, executorC2206508kh, null);
                Vibrator vibrator = (Vibrator) this.LIZ.getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
        this.LJIIL.LJIIIZ("handleScanSuccessAfterIntercept: network not available");
    }

    public final void LIZLLL(final boolean z, final int i, final String str, final int i2, final C10ZE c10ze) {
        IAnydoorEntryService iAnydoorEntryService;
        this.LJIIL.LJIIIZ("onScanSuccess: " + str);
        if (this.LIZ.isDestroyed()) {
            return;
        }
        if (C19273010ae.LIZIZ() && (iAnydoorEntryService = (IAnydoorEntryService) ServiceManager.get().getService(IAnydoorEntryService.class, false, false)) != null) {
            iAnydoorEntryService.LIZ();
        }
        if (!TextUtils.isEmpty(str) && URLUtil.isValidUrl(str)) {
            Uri uri = UriProtector.parse(str);
            if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ttam_open_outside"), "true")) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                BaseActivity baseActivity = this.LIZ;
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(baseActivity, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, baseActivity);
                C2204961BRm.LLLJ(baseActivity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPu6YJDK2XxwYXemD0rlH0bI4SvUoB0l5PTNgCnlB0DkLBcBRCxUCPTi", null));
                return;
            }
        }
        final ICQrcodeService iCQrcodeService = (ICQrcodeService) PluggableExtentionKt.pluggableSpi(ICQrcodeService.class);
        if (iCQrcodeService != null && iCQrcodeService.LIZ()) {
            C15O7.LIZIZ(new ACallableS30S1000000_28(str, 0), C15O7.LJI, null).LJ(new InterfaceC2385309Wh<String, Object>() { // from class: X.10ZD
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7<String> c15o7) throws Throwable {
                    C1C7U.LIZ("QRCodeScanPresenter@e78f.onScanSuccess$1");
                    String strLJIIL = c15o7.LJIIL();
                    if (!TextUtils.isEmpty(strLJIIL) && strLJIIL.startsWith("tt_deeplink:")) {
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(UriProtector.parse(strLJIIL.replace("tt_deeplink:", "")));
                        if (C2162308dZ.LJ(this.LJI.LIZ, intent2)) {
                            BaseActivity baseActivity2 = this.LJI.LIZ;
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(baseActivity2, intent2, "Context_startActivity_1");
                            C1701330uNH.LIZ(intent2, baseActivity2);
                            C2204961BRm.LLLJ(baseActivity2, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPu6YJDK2XxwYXemD0rlH0bI4SvUoB0l5PTNgCnlB0DkLBcBRCxUCPTi", null));
                            C20684815ws.onEventV3("deeplink_preview_success");
                        } else {
                            C20684815ws.onEventV3("deeplink_preview_error_toast_show");
                            iCQrcodeService.LIZIZ(this.LJI.LIZ);
                            this.LJI.LIZ.finish();
                        }
                        C1C7U.LIZIZ("QRCodeScanPresenter@e78f.onScanSuccess$1");
                        return null;
                    }
                    try {
                        C10ZE c10ze2 = c10ze;
                        if (c10ze2 != null) {
                            c10ze2.LIZ(UriProtector.parse(strLJIIL));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C19271010aK c19271010aK = this.LJI;
                    boolean z2 = z;
                    c19271010aK.LIZ(i, i2, str, strLJIIL, z2);
                    C1C7U.LIZIZ("QRCodeScanPresenter@e78f.onScanSuccess$1");
                    return null;
                }
            }, C15O7.LJIIIIZZ, null);
            return;
        }
        if (c10ze != null) {
            try {
                c10ze.LIZ(UriProtector.parse(str));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LIZ(i, i2, str, "", z);
    }
}
