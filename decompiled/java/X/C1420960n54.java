package X;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.download.StickPointMusicAlgFileDownload;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0n54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420960n54 {
    public static final C1420960n54 LIZ = new C1420960n54();

    public static void LIZLLL(final IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
        if (!C1444820nhY.LIZIZ) {
            iFetchResourcesListener.onFailed(null);
        } else {
            ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).fetchResourcesNeededByRequirements(new String[]{"VideoMontage"}, new IFoundationAVService.IFetchResourcesListener() { // from class: X.0n57
                @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                public final void onFailed(Exception exc) {
                    boolean z = C1444820nhY.LIZ;
                    C1444820nhY.LIZ = false;
                    IFoundationAVService.IFetchResourcesListener iFetchResourcesListener2 = iFetchResourcesListener;
                    if (iFetchResourcesListener2 != null) {
                        iFetchResourcesListener2.onFailed(exc);
                    }
                }

                @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
                public final void onSuccess(String[] strArr) {
                    boolean z = C1444820nhY.LIZ;
                    C1444820nhY.LIZ = true;
                    IFoundationAVService.IFetchResourcesListener iFetchResourcesListener2 = iFetchResourcesListener;
                    if (iFetchResourcesListener2 != null) {
                        iFetchResourcesListener2.onSuccess(strArr);
                    }
                }
            });
        }
    }

    public static void LJ(AVMusic aVMusic, C1420820n4q c1420820n4q) {
        final String defaultLocalPath;
        final String strLJFF = C1444820nhY.LJFF(aVMusic);
        if (aVMusic != null && aVMusic.getStickPointMusicAlg() != null) {
            defaultLocalPath = aVMusic.getStickPointMusicAlg().getDefaultLocalPath();
        } else {
            defaultLocalPath = "";
        }
        if (aVMusic == null || aVMusic.musicType != 0 ? C2354709Kn.LIZIZ(strLJFF) : TEVideoUtils.nativeCheckAudioFile(strLJFF) == 0) {
            if (TextUtils.isEmpty(defaultLocalPath)) {
                c1420820n4q.LIZLLL(aVMusic, false);
                return;
            } else {
                C15O7.LIZJ(new Callable() { // from class: X.0n4p
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("StickPointDownloadHelper@e94d.getDefaultMusicAlg$1");
                        Boolean boolValueOf = Boolean.valueOf(VEUtils.getMusicDefaultAlgorithm(strLJFF, defaultLocalPath) == 0);
                        C1C7U.LIZIZ("StickPointDownloadHelper@e94d.getDefaultMusicAlg$1");
                        return boolValueOf;
                    }
                }).LJ(new C1466860oH6(aVMusic, c1420820n4q, 16), C15O7.LJIIIIZZ, null);
                return;
            }
        }
        c1420820n4q.LIZLLL(aVMusic, false);
    }

    public static final void LIZIZ(C013C c013c, InterfaceC1364105Vn<? super Pair<Boolean, ? extends AVMusic>> interfaceC1364105Vn, Pair<Boolean, ? extends AVMusic> pair) {
        if (c013c.element) {
            return;
        }
        c013c.element = true;
        C189200o6.m2constructorimpl(pair);
        interfaceC1364105Vn.resumeWith(pair);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.0n4q, X.0n4v] */
    public static void LIZJ(final Context context, final AVMusic aVMusic, final InterfaceC1420890n4x interfaceC1420890n4x) {
        Application applicationLIZ = null;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_sound_sync_music_beats_concurrent_request", true, false)) {
            interfaceC1420890n4x.LIZIZ();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1420830n4r(interfaceC1420890n4x, context, aVMusic, null), 3);
            return;
        }
        final ?? r3 = new C1420820n4q() { // from class: X.0n4v
            @Override // X.C1420820n4q, X.InterfaceC1420890n4x
            public final void LIZIZ() {
                InterfaceC1420890n4x interfaceC1420890n4x2 = interfaceC1420890n4x;
                if (interfaceC1420890n4x2 != null) {
                    interfaceC1420890n4x2.LIZIZ();
                }
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [X.0n4q, X.0n4w] */
            @Override // X.C1420820n4q, X.InterfaceC1420890n4x
            public final void LIZJ(final AVMusic aVMusic2, boolean z) {
                InterfaceC1420860n4u stickPointMusicAlgFileDownload;
                if (z) {
                    InterfaceC1420890n4x interfaceC1420890n4x2 = interfaceC1420890n4x;
                    if (interfaceC1420890n4x2 != null) {
                        interfaceC1420890n4x2.LIZJ(aVMusic2, true);
                    }
                    InterfaceC1420890n4x interfaceC1420890n4x3 = interfaceC1420890n4x;
                    if (interfaceC1420890n4x3 != null) {
                        interfaceC1420890n4x3.LIZ();
                    }
                    C1420960n54 c1420960n54 = C1420960n54.LIZ;
                    Context context2 = context;
                    final InterfaceC1420890n4x interfaceC1420890n4x4 = interfaceC1420890n4x;
                    final ?? r32 = new C1420820n4q() { // from class: X.0n4w
                        @Override // X.C1420820n4q, X.InterfaceC1420890n4x
                        public final void LIZLLL(AVMusic aVMusic3, boolean z2) {
                            InterfaceC1420890n4x interfaceC1420890n4x5 = interfaceC1420890n4x4;
                            if (interfaceC1420890n4x5 != null) {
                                interfaceC1420890n4x5.LIZLLL(aVMusic3, z2);
                            }
                        }
                    };
                    c1420960n54.getClass();
                    if (context2 != null && aVMusic2 != null && aVMusic2.getStickPointMusicAlg() != null) {
                        if (C0C64.LJIILLIIL().LJIIIZ(31744, "stick_point_music_alg_file_download_parallel", true, false)) {
                            stickPointMusicAlgFileDownload = new C1421070n5F();
                        } else {
                            stickPointMusicAlgFileDownload = new StickPointMusicAlgFileDownload();
                        }
                        stickPointMusicAlgFileDownload.LIZ(new C0NM2() { // from class: X.0n4z
                            /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
                            @Override // X.C0NM2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZ(com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg r6, boolean r7) {
                                /*
                                    r5 = this;
                                    if (r7 == 0) goto L6d
                                    boolean r0 = X.C1420940n52.LIZIZ()
                                    r3 = 1
                                    r4 = 0
                                    if (r0 == 0) goto L22
                                    if (r6 == 0) goto L22
                                    boolean r0 = com.ss.android.ugc.aweme.music.model.StickPointBeanUtil.existMusicSyncAlgFile(r6)
                                    if (r0 == r3) goto L18
                                    boolean r0 = com.ss.android.ugc.aweme.music.model.StickPointBeanUtil.existOnSetAlgFile(r6)
                                    if (r0 != r3) goto L22
                                L18:
                                    X.0n4x r1 = r1
                                    if (r1 == 0) goto L21
                                    com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r2
                                    r1.LIZLLL(r0, r3)
                                L21:
                                    return
                                L22:
                                    X.0C64 r2 = X.C0C64.LJIILLIIL()
                                    r1 = 31744(0x7c00, float:4.4483E-41)
                                    java.lang.String r0 = "stick_point_new_alg_rule"
                                    int r1 = r2.LJIJ(r1, r4, r0, r3)
                                    r0 = 2
                                    if (r1 != r0) goto L49
                                    if (r6 == 0) goto L5b
                                    boolean r0 = com.ss.android.ugc.aweme.music.model.StickPointBeanUtil.existBeatsTrackerAlgFile(r6)
                                    if (r0 == r3) goto L3f
                                    boolean r0 = com.ss.android.ugc.aweme.music.model.StickPointBeanUtil.existOnSetAlgFile(r6)
                                    if (r0 != r3) goto L4b
                                L3f:
                                    X.0n4x r1 = r1
                                    if (r1 == 0) goto L48
                                    com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r2
                                    r1.LIZLLL(r0, r3)
                                L48:
                                    return
                                L49:
                                    if (r6 == 0) goto L5b
                                L4b:
                                    boolean r0 = com.ss.android.ugc.aweme.music.model.StickPointBeanUtil.existOnSetAlgFile(r6)
                                    if (r0 != r3) goto L5b
                                    X.0n4x r1 = r1
                                    if (r1 == 0) goto L5a
                                    com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r2
                                    r1.LIZLLL(r0, r3)
                                L5a:
                                    return
                                L5b:
                                    X.0n54 r3 = X.C1420960n54.LIZ
                                    com.ss.android.ugc.aweme.creative.model.music.AVMusic r2 = r2
                                    X.0n4y r1 = new X.0n4y
                                    X.0n4x r0 = r1
                                    r1.<init>()
                                    r3.getClass()
                                    X.C1420960n54.LJ(r2, r1)
                                    return
                                L6d:
                                    X.0n54 r3 = X.C1420960n54.LIZ
                                    com.ss.android.ugc.aweme.creative.model.music.AVMusic r2 = r2
                                    X.0n51 r1 = new X.0n51
                                    X.0n4x r0 = r1
                                    r1.<init>()
                                    r3.getClass()
                                    X.C1420960n54.LJ(r2, r1)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1420910n4z.LIZ(com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg, boolean):void");
                            }
                        });
                        stickPointMusicAlgFileDownload.LIZIZ(context2, aVMusic2.getMusicId(), aVMusic2.getStickPointMusicAlg());
                        return;
                    }
                    r32.LIZLLL(aVMusic2, false);
                    return;
                }
                InterfaceC1420890n4x interfaceC1420890n4x5 = interfaceC1420890n4x;
                if (interfaceC1420890n4x5 == null) {
                    return;
                }
                interfaceC1420890n4x5.LIZJ(aVMusic2, false);
            }
        };
        r3.LIZIZ();
        if (context != null && aVMusic != null && !TextUtils.isEmpty(aVMusic.getPath())) {
            final String strLJFF = C1444820nhY.LJFF(aVMusic);
            try {
                ((C19221910Hx) ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService()).getClass();
                applicationLIZ = C1BWL.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJIIL("ServiceManager fail, no context and local music load fail");
            }
            if (C2486109oh.LIZLLL(applicationLIZ, strLJFF)) {
                C201955140j.LIZJ(C201962140q.LIZIZ, "StickPointMusic, local music file exist, music id: " + aVMusic.getMusicId());
                r3.LIZJ(aVMusic, true);
                return;
            }
            LIZ(applicationLIZ, C141Q.LIZ(aVMusic), strLJFF, new C1421000n58() { // from class: X.0n56
                @Override // X.C1421000n58, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    if (!C2354709Kn.LIZIZ(strLJFF)) {
                        InterfaceC1420890n4x interfaceC1420890n4x2 = r3;
                        if (interfaceC1420890n4x2 != null) {
                            interfaceC1420890n4x2.LIZJ(aVMusic, false);
                        }
                        C1441170nbf c1441170nbf = C1441170nbf.LIZ;
                        AVMusic aVMusic2 = aVMusic;
                        c1441170nbf.getClass();
                        C1441170nbf.LIZLLL(false, aVMusic2, null);
                        return;
                    }
                    InterfaceC1420890n4x interfaceC1420890n4x3 = r3;
                    if (interfaceC1420890n4x3 != null) {
                        interfaceC1420890n4x3.LIZJ(aVMusic, true);
                    }
                    C1441170nbf c1441170nbf2 = C1441170nbf.LIZ;
                    AVMusic aVMusic3 = aVMusic;
                    c1441170nbf2.getClass();
                    C1441170nbf.LIZLLL(true, aVMusic3, null);
                }

                @Override // X.C1421000n58, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    InterfaceC1420890n4x interfaceC1420890n4x2 = r3;
                    if (interfaceC1420890n4x2 != null) {
                        interfaceC1420890n4x2.LIZJ(aVMusic, false);
                    }
                    C1441170nbf c1441170nbf = C1441170nbf.LIZ;
                    AVMusic aVMusic2 = aVMusic;
                    c1441170nbf.getClass();
                    C1441170nbf.LIZLLL(false, aVMusic2, baseException);
                }
            });
            return;
        }
        r3.LIZJ(aVMusic, false);
    }

    public static void LIZ(Context context, String str, String str2, C1421000n58 c1421000n58) {
        if (context != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            if (C2354709Kn.LIZIZ(str2)) {
                c1421000n58.onSuccessed(new DownloadInfo((Cursor) null));
                return;
            }
            C0VSJ c0vsj = new C0VSJ(str2);
            DownloadTask downloadTaskWith = C2200151B8z.with(context);
            downloadTaskWith.url(str);
            downloadTaskWith.ignoreDataVerify(true);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0vsj.getParent());
            sbLIZ.append(File.separator);
            downloadTaskWith.savePath(C2188811AlT.LIZIZ(sbLIZ));
            downloadTaskWith.name(c0vsj.getName());
            downloadTaskWith.mainThreadListener(c1421000n58);
            downloadTaskWith.autoRemoveCallback(C0BNF.LIZ());
            downloadTaskWith.download();
            return;
        }
        c1421000n58.onFailed(new DownloadInfo((Cursor) null), new BaseException());
    }
}
