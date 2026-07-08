package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* JADX INFO: renamed from: X.0xqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834710xqP {
    public static volatile C1834710xqP LIZ;

    public static int LIZIZ(int i) {
        if (i == -7) {
            return 4;
        }
        if (i == -6) {
            return 2;
        }
        if (i == -5) {
            return 3;
        }
        if (i == -3) {
            return 2;
        }
        if (i == -2) {
            return 3;
        }
        if (i == -1) {
            return 4;
        }
        if (i != 4) {
            return i != 6 ? 0 : 2;
        }
        return 1;
    }

    public static C1834710xqP LIZJ() {
        if (LIZ == null) {
            synchronized (C1834710xqP.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1834710xqP();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static int LIZLLL(String str, String str2) {
        DownloadInfo downloadInfoLIZJ;
        if (!TextUtils.isEmpty(str2)) {
            C1836420xtA.LJFF().getClass();
            downloadInfoLIZJ = C1836420xtA.LIZLLL(str2);
        } else {
            C1836420xtA.LJFF().getClass();
            downloadInfoLIZJ = C1836420xtA.LIZJ(str);
        }
        if (downloadInfoLIZJ != null) {
            int iLIZIZ = LIZIZ(downloadInfoLIZJ.getStatus());
            if (iLIZIZ == 2 && !downloadInfoLIZJ.isDownloaded()) {
                return 0;
            }
            return iLIZIZ;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(java.lang.String r1, java.lang.String r2, X.C1835180xrA r3) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L91
            X.0xtA r0 = X.C1836420xtA.LJFF()
            r0.getClass()
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = X.C1836420xtA.LIZLLL(r2)
        L11:
            if (r2 == 0) goto L24
            int r0 = r2.getStatus()
            int r1 = LIZIZ(r0)
            r0 = 2
            if (r1 != r0) goto L5b
            boolean r0 = r2.isDownloaded()
            if (r0 != 0) goto L5d
        L24:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "registerCallback:"
            r1.append(r0)
            java.lang.String r0 = r3.LIZIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L58
            java.lang.String r0 = r3.LIZ
        L37:
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LiveReplyDownloader"
            X.C20441214yg.LIZIZ(r0, r1)
            X.0xtA r1 = X.C1836420xtA.LJFF()
            java.lang.String r0 = r3.LIZIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L55
            java.lang.String r0 = r3.LIZ
        L51:
            r1.LJIIIIZZ(r0, r3)
            return
        L55:
            java.lang.String r0 = r3.LIZIZ
            goto L51
        L58:
            java.lang.String r0 = r3.LIZIZ
            goto L37
        L5b:
            if (r2 == 0) goto L24
        L5d:
            int r1 = r2.getStatus()
            if (r3 == 0) goto L24
            r0 = -7
            if (r1 == r0) goto L88
            r0 = -6
            if (r1 == r0) goto L84
            r0 = -5
            if (r1 == r0) goto L80
            r0 = -3
            if (r1 == r0) goto L84
            r0 = -2
            if (r1 == r0) goto L80
            r0 = -1
            if (r1 == r0) goto L88
            r0 = 4
            if (r1 == r0) goto L7c
            r0 = 6
            if (r1 == r0) goto L84
            goto L24
        L7c:
            r3.onProgress(r2)
            goto L24
        L80:
            r3.onPause(r2)
            goto L24
        L84:
            r3.LIZ(r2)
            goto L24
        L88:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException
            r0.<init>()
            r3.onFailed(r2, r0)
            goto L24
        L91:
            X.0xtA r0 = X.C1836420xtA.LJFF()
            r0.getClass()
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = X.C1836420xtA.LIZJ(r1)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1834710xqP.LJ(java.lang.String, java.lang.String, X.0xrA):void");
    }

    public static void LJI(Context context, int i, String str, String str2, InterfaceC1835200xrC interfaceC1835200xrC) {
        if (interfaceC1835200xrC instanceof C1835180xrA) {
            ((C1835180xrA) interfaceC1835200xrC).LIZJ = false;
        }
        if (Build.VERSION.SDK_INT < 33 && !C202002142e.LIZJ(context, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE")) {
            if (interfaceC1835200xrC != null) {
                C20441214yg.LIZIZ("LiveReplyDownloader", "submitDownloadTaskNoRequestPermission downloadCallBack != null");
                interfaceC1835200xrC.onFailed(null, new BaseException());
                return;
            } else {
                C20441214yg.LIZIZ("LiveReplyDownloader", "submitDownloadTaskNoRequestPermission downloadCallBack else");
                return;
            }
        }
        C20441214yg.LIZIZ("LiveReplyDownloader", "submitDownloadTaskNoRequestPermission meet");
        LIZ(context, i, str, str2, "mp4", interfaceC1835200xrC);
    }

    public final void LJFF(final Context context, final int i, final String str, final String str2, final C1834680xqM c1834680xqM) {
        if (1 == i) {
            LIZ(context, 1, str, str2, "mp4", c1834680xqM);
        } else if (Build.VERSION.SDK_INT >= 33) {
            LIZ(context, i, str, str2, "mp4", c1834680xqM);
        } else {
            new C0UT9(C500260Jjc.LJ(context), TokenCert.with("bpea-bpea-submit_download_task_in_live_replay_video_player")).LIZ(new C142V() { // from class: X.0xqB
                public final /* synthetic */ String LJ = "mp4";

                @Override // X.C142V
                public final /* synthetic */ void LIZIZ(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LIZLLL(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LJ(String str3, String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LJFF(String... strArr) {
                }

                @Override // X.C142V
                public final void LIZ(String... strArr) {
                    C20441214yg.LIZIZ("LiveReplyDownloader", "onPermissionDenied");
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_photo_library_permission_cancel");
                    c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                    c474500IjALIZ.LJJII(str2, "room_id");
                    c474500IjALIZ.LJJII(1, "is_first_request");
                    c474500IjALIZ.LIZ();
                }

                @Override // X.C142V
                public final void LIZJ(String... strArr) {
                    C20441214yg.LIZIZ("LiveReplyDownloader", "onPermissionGrant");
                    C1834710xqP c1834710xqP = this.LJI;
                    Context context2 = context;
                    int i2 = i;
                    String str3 = str;
                    String str4 = str2;
                    String str5 = this.LJ;
                    InterfaceC1835200xrC interfaceC1835200xrC = c1834680xqM;
                    c1834710xqP.getClass();
                    C1834710xqP.LIZ(context2, i2, str3, str4, str5, interfaceC1835200xrC);
                }
            }, false, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r13, int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, X.InterfaceC1835200xrC r18) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1834710xqP.LIZ(android.content.Context, int, java.lang.String, java.lang.String, java.lang.String, X.0xrC):void");
    }
}
