package X;

import Y.AfS114S0300000_22;
import Y.AfS191S0100000_22;
import android.accounts.NetworkErrorException;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.CommonRequestCallback;
import com.bytedance.ies.smartmovie.jni.ITosDelegate;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.e;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0n2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419510n2j extends ITosDelegate {
    public String LIZ;
    public boolean LIZIZ;
    public InterfaceC1419480n2g LIZJ;

    public C1419510n2j() {
        LIZ();
    }

    public final void LIZ() {
        if (C290450BZz.LIZ() || this.LIZIZ) {
            return;
        }
        String str = this.LIZ;
        if (str == null || !C123100dR.LIZ(str)) {
            this.LIZIZ = true;
            C11NZ.LJIJJLI(new C2502409rK(this, 2)).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS191S0100000_22(this, 35), new C09JN() { // from class: X.0n2k
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("AutoCutTosDelegate@4f50.preloadUpdateKey$dispose$2");
                    C1C7U.LIZIZ("AutoCutTosDelegate@4f50.preloadUpdateKey$dispose$2");
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, X.01kM] */
    @Override // com.bytedance.ies.smartmovie.jni.ITosDelegate
    public final void getTosUrl(final String str, final CommonRequestCallback commonRequestCallback) {
        if (!C0XF1.LIZLLL(C0CHQ.LIZ)) {
            if (commonRequestCallback != null) {
                commonRequestCallback.onFailure(SmartMovieErrorCode.UPLOAD_TOS_FAILURE.swigValue(), "Local Network NoAvailable", new UnorderedMapStrStr());
            }
            InterfaceC1419480n2g interfaceC1419480n2g = this.LIZJ;
            if (interfaceC1419480n2g != null) {
                interfaceC1419480n2g.LJI(SmartMovieErrorCode.UPLOAD_TOS_FAILURE.swigValue(), "Local Network NoAvailable", str, false);
            }
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutTosDelegate getTosUrl: no net");
            return;
        }
        InterfaceC1419480n2g interfaceC1419480n2g2 = this.LIZJ;
        if (interfaceC1419480n2g2 != null) {
            interfaceC1419480n2g2.LIZIZ();
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = C11NZ.LJIJJLI(new C2502409rK(this, 2)).LJJJ(new InterfaceC1487280oo2() { // from class: X.08yY
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                final String str2 = (String) obj;
                C1419510n2j c1419510n2j = this.LL;
                final String str3 = str;
                if (str3 == null) {
                    str3 = "";
                }
                c1419510n2j.getClass();
                return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.08yW
                    @Override // X.InterfaceC1478005qU
                    public final void subscribe(C09AJ<String> c09aj) {
                        UploadImageConfig uploadImageConfig;
                        C1C7U.LIZ("AutoCutTosDelegate@4f50.uploadZip$1");
                        String str4 = str2;
                        if (str4 != null && str4.length() != 0) {
                            UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) GsonProtectorUtils.fromJson(new e().LIZ(), str2, UploadAuthKeyConfig.class);
                            if (uploadAuthKeyConfig != null && (uploadImageConfig = uploadAuthKeyConfig.frameUploadConfig) != null) {
                                if (!C0CHQ.LIZ().getAccountService().isLogin()) {
                                    c09aj.tryOnError(new IllegalArgumentException("user is unLogin status"));
                                    C1C7U.LIZIZ("AutoCutTosDelegate@4f50.uploadZip$1");
                                    return;
                                }
                                final C2207811Bb1 c2207811Bb1 = new C2207811Bb1(uploadImageConfig);
                                final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                                c2207811Bb1.LJIIJ(new InterfaceC2207871Bb7() { // from class: X.08yX
                                    @Override // X.InterfaceC2207871Bb7
                                    public final void onLog(int i, int i2, String str5) {
                                    }

                                    @Override // X.InterfaceC2207871Bb7
                                    public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                                        String str5;
                                        String str6;
                                        c2207811Bb1.LJ();
                                        String str7 = "";
                                        if (i == 6) {
                                            c2207811Bb1.LIZJ();
                                            C09AJ<String> c09aj2 = c19482611Ke;
                                            if (imageUploadInfo != null && (str6 = imageUploadInfo.mImageToskey) != null) {
                                                str7 = str6;
                                            }
                                            c09aj2.onNext(str7);
                                            return;
                                        }
                                        c2207811Bb1.LJFF();
                                        if (i != 7) {
                                            return;
                                        }
                                        c2207811Bb1.LIZJ();
                                        C09AJ<String> c09aj3 = c19482611Ke;
                                        if (imageUploadInfo != null && (str5 = imageUploadInfo.mExtra) != null) {
                                            str7 = str5;
                                        }
                                        c09aj3.tryOnError(new NetworkErrorException(str7));
                                    }
                                });
                                c2207811Bb1.LJIIIZ(1, new String[]{str3});
                                try {
                                    c2207811Bb1.LJIILIIL();
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c2207811Bb1.LIZJ();
                                }
                                C1C7U.LIZIZ("AutoCutTosDelegate@4f50.uploadZip$1");
                                return;
                            }
                            c09aj.tryOnError(new IllegalArgumentException("uploadConfig isNull"));
                            C1C7U.LIZIZ("AutoCutTosDelegate@4f50.uploadZip$1");
                            return;
                        }
                        c09aj.tryOnError(new IllegalArgumentException("uploadKey isNullOrEmpty"));
                        C1C7U.LIZIZ("AutoCutTosDelegate@4f50.uploadZip$1");
                    }
                });
            }
        }, false).LJLJI(30L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJIIJ(new C1466790oGz(this, 1)).LJJLL(new AfS114S0300000_22(c259800zU, commonRequestCallback, this, 3), new C09JN() { // from class: X.0n2i
            @Override // X.C09JN
            public final void accept(Object obj) {
                String message;
                String message2;
                String message3;
                C1C7U.LIZ("AutoCutTosDelegate@4f50.getTosUrl$4");
                Throwable th = (Throwable) obj;
                InterfaceC420801kM interfaceC420801kM = c259800zU.element;
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AutoCutTosDelegate getTosUrl errorCode=UPLOAD_TOS_FAILURE-2, msg=");
                String str2 = "";
                if (th == null || (message = th.getMessage()) == null) {
                    message = "";
                }
                sbLIZ.append(message);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
                CommonRequestCallback commonRequestCallback2 = commonRequestCallback;
                if (commonRequestCallback2 != null) {
                    int iSwigValue = SmartMovieErrorCode.UPLOAD_TOS_FAILURE.swigValue();
                    if (th == null || (message3 = th.getMessage()) == null) {
                        message3 = "";
                    }
                    commonRequestCallback2.onFailure(iSwigValue, message3, new UnorderedMapStrStr());
                }
                InterfaceC1419480n2g interfaceC1419480n2g3 = this.LIZJ;
                if (interfaceC1419480n2g3 != null) {
                    int iSwigValue2 = SmartMovieErrorCode.UPLOAD_TOS_FAILURE.swigValue();
                    if (th != null && (message2 = th.getMessage()) != null) {
                        str2 = message2;
                    }
                    interfaceC1419480n2g3.LJI(iSwigValue2, str2, str, false);
                }
                C1C7U.LIZIZ("AutoCutTosDelegate@4f50.getTosUrl$4");
            }
        });
    }
}
