package X;

import Y.ACallableS31S1000000_30;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi;
import com.ss.android.ugc.aweme.comment.experiment.CommentImagePublishOptExp;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.1Bbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208191Bbd {
    public static CommentImageUploadAuth LJFF() {
        C1344030l4z.LIZJ("CommentImageUploadController", "get local authConfig");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cmt_img_auth_");
        sbLIZ.append(LJI());
        String strLJ = C0TSK.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!C703302op.LIZ(strLJ)) {
            C1344030l4z.LIZJ("CommentImageUploadController", "local authConfig is null");
            return null;
        }
        try {
            return (CommentImageUploadAuth) C08JS.LIZIZ().LJII(strLJ, CommentImageUploadAuth.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1344030l4z.LIZ("CommentImageUploadController", "local authConfig parse error");
            return null;
        }
    }

    public static String LJI() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJII() {
        /*
            boolean r0 = com.ss.android.ugc.aweme.comment.experiment.CommentImagePublishOptExp.LIZ()
            r6 = 1000(0x3e8, float:1.401E-42)
            r8 = 1
            if (r0 == 0) goto L5a
            java.lang.Object r7 = X.C2208181Bbc.LJIIIIZZ
            monitor-enter(r7)
            com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth r0 = X.C2208181Bbc.LJIIIZ     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L1d
            java.lang.String r1 = "CommentImageUploadController"
            java.lang.String r0 = "authConfig is null"
            X.C1344030l4z.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L54
            com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth r0 = LJFF()     // Catch: java.lang.Throwable -> L54
            X.C2208181Bbc.LJIIIZ = r0     // Catch: java.lang.Throwable -> L54
        L1d:
            com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth r0 = X.C2208181Bbc.LJIIIZ     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L31
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L54
            long r2 = r0.getExpiredTime()     // Catch: java.lang.Throwable -> L54
            long r0 = (long) r6     // Catch: java.lang.Throwable -> L54
            long r2 = r2 * r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L31
            r3 = 0
            goto L32
        L31:
            r3 = 1
        L32:
            java.lang.String r2 = "CommentImageUploadController"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "authConfig is expired: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L54
            r1.append(r3)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L54
            X.C1344030l4z.LIZJ(r2, r0)     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L51
            com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth r0 = X.C2208181Bbc.LJIIIZ     // Catch: java.lang.Throwable -> L54
            boolean r0 = LJIIIIZZ(r0)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L52
        L51:
            r8 = 0
        L52:
            monitor-exit(r7)
            return r8
        L54:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r7)
            throw r0
        L5a:
            int r0 = X.C2208181Bbc.LJII
            com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth r0 = X.C2208181Bbc.LJIIIZ
            if (r0 != 0) goto L6d
            java.lang.String r1 = "CommentImageUploadController"
            java.lang.String r0 = "authConfig is null"
            X.C1344030l4z.LIZJ(r1, r0)
            com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth r0 = LJFF()
            X.C2208181Bbc.LJIIIZ = r0
        L6d:
            com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth r0 = X.C2208181Bbc.LJIIIZ
            if (r0 == 0) goto La1
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r0.getExpiredTime()
            long r0 = (long) r6
            long r2 = r2 * r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto La1
            r3 = 0
        L80:
            java.lang.String r2 = "CommentImageUploadController"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "authConfig is expired: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1344030l4z.LIZJ(r2, r0)
            if (r3 != 0) goto L9f
            com.ss.android.ugc.aweme.comment.model.CommentImageUploadAuth r0 = X.C2208181Bbc.LJIIIZ
            boolean r0 = LJIIIIZZ(r0)
            if (r0 == 0) goto La0
        L9f:
            r8 = 0
        La0:
            return r8
        La1:
            r3 = 1
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2208191Bbd.LJII():boolean");
    }

    public static void LJIILL() {
        if (LJII()) {
            C1344030l4z.LIZJ("CommentImageUploadController", "has valid authConfig, need not prefetch");
            if (C0BJO.LIZIZ) {
                C23250099c.LIZLLL(new C2208331Bbr().LIZ, null, null, new C2207791Baz(LJFF(), null), 3);
                return;
            }
            return;
        }
        C1344030l4z.LIZJ("CommentImageUploadController", "invalid authConfig, prefetch auth");
        C2208281Bbm.LIZ.getClass();
        C2208281Bbm.LJIIZILJ(null);
        C11J7 c11j7LJL = ((CommentApi.RealApi) CommentApi.LIZ.create(CommentApi.RealApi.class)).LIZIZ(0).LJL(C11S5.LIZ());
        if (!CommentImagePublishOptExp.LIZJ()) {
            c11j7LJL = c11j7LJL.LJJJLZIJ(C1701940uOG.LIZIZ());
        }
        c11j7LJL.LIZIZ(new C1D1D(1));
    }

    public static void LIZIZ(CommentImageModel commentImageModel) {
        if (commentImageModel == null) {
            return;
        }
        C2208181Bbc.LJIILIIL.remove(Integer.valueOf(System.identityHashCode(commentImageModel)));
    }

    public static void LIZJ(CommentImageModel commentImageModel) {
        List<String> urlList;
        LIZIZ(commentImageModel);
        if (commentImageModel != null && (urlList = commentImageModel.getUrlList()) != null && !urlList.isEmpty()) {
            if (CommentImagePublishOptExp.LIZJ()) {
                AnonymousClass0956 anonymousClass0956 = C2208181Bbc.LJIIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C2208181Bbc.LJIIL = null;
            }
            LJIILLIIL(commentImageModel.getEditedImagePath());
            if (commentImageModel.isCompressed() && commentImageModel.getCompressedStatus() == 2) {
                C1344030l4z.LIZJ("CommentImageUploadController", "delete pre-compress image file");
                LJIILLIIL(commentImageModel.getCompressedFilePath());
            } else {
                C1344030l4z.LIZJ("CommentImageUploadController", "not need delete pre-compress image file");
            }
            LIZ(commentImageModel, true);
            commentImageModel.setVideoPath(null);
            commentImageModel.setLivePhotoInfo(null);
            return;
        }
        C1344030l4z.LIZJ("CommentImageUploadController", "delete image is null!");
    }

    public static String LJ(CommentImageModel commentImageModel) {
        String str;
        if (C703302op.LIZ(commentImageModel.getEditedImagePath())) {
            return commentImageModel.getEditedImagePath();
        }
        List<String> urlList = commentImageModel.getUrlList();
        if (urlList != null && (str = (String) ListProtector.get(urlList, 0)) != null) {
            C844470XAv.LIZ.getClass();
            return C09N5.LIZ(C844470XAv.LIZ(), UriProtector.parse(str));
        }
        return null;
    }

    public static boolean LJIIIIZZ(CommentImageUploadAuth commentImageUploadAuth) {
        int i;
        CommentImagePublishOptExp.CommentImagePublishOptConfig commentImagePublishOptConfigLIZLLL = CommentImagePublishOptExp.LIZLLL();
        if (commentImagePublishOptConfigLIZLLL != null && (i = commentImagePublishOptConfigLIZLLL.authClockDriftToleranceMinutes) >= 0 && commentImageUploadAuth != null) {
            long expiredTime = ((commentImageUploadAuth.getExpiredTime() - 86400) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - System.currentTimeMillis();
            if (expiredTime > ((long) (i * 60)) * 1000) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clock drift detected: local time is ");
                sbLIZ.append(expiredTime);
                sbLIZ.append("ms behind server, tolerance=");
                sbLIZ.append(i);
                sbLIZ.append("min");
                C2188811AlT.LIZIZ(sbLIZ);
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIIZ(CommentImageModel commentImageModel) {
        String lowerCase;
        String format = commentImageModel.getFormat();
        if (format != null) {
            lowerCase = format.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isWebp format:");
        sbLIZ.append(lowerCase);
        C2188811AlT.LIZIZ(sbLIZ);
        return TextUtils.equals("webp", lowerCase);
    }

    public static boolean LJIIJ(CommentImageModel commentImageModel) {
        boolean z;
        if (commentImageModel.getSize() > C2208181Bbc.LJII) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needCompressed: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }

    public static void LJIIJJI(final CommentImageModel commentImageModel) {
        String lowerCase;
        boolean z;
        boolean z2;
        long jLJIIIZ;
        String videoPath;
        if (commentImageModel == null) {
            return;
        }
        C2208201Bbe.LIZ.getClass();
        if (C294440BgQ.LIZ() != 0 && C2208201Bbe.LJIILLIIL(commentImageModel)) {
            String format = commentImageModel.getFormat();
            if (format != null) {
                lowerCase = format.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = null;
            }
            if ((!TextUtils.equals("webp", lowerCase) || commentImageModel.getSize() > C2208201Bbe.LIZIZ) && (commentImageModel.getCompressedStatus() == 0 || commentImageModel.getCompressedStatus() == 3 || (commentImageModel.getCompressedStatus() == 2 && !C2260008tK.LJFF(commentImageModel.getCompressedFilePath())))) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJ = C2208201Bbe.LJ(commentImageModel);
            if (C2208201Bbe.LJ(commentImageModel) && (videoPath = commentImageModel.getVideoPath()) != null && videoPath.length() != 0 && (commentImageModel.getCompressedVideoStatus() == 0 || commentImageModel.getCompressedVideoStatus() == 5 || (commentImageModel.getCompressedVideoStatus() == 4 && !C2260008tK.LJFF(commentImageModel.getCompressedVideoPath())))) {
                z2 = true;
            } else {
                z2 = false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z3 = !z;
            boolean z4 = !z2;
            long jLJIIJ = 0;
            if (z) {
                jLJIIIZ = 0;
            } else {
                jLJIIIZ = C2208201Bbe.LJIIIZ(commentImageModel);
            }
            if (!z2 && zLJ) {
                jLJIIJ = C2208201Bbe.LJIIJ(commentImageModel);
            }
            C2208241Bbi c2208241Bbi = new C2208241Bbi(jCurrentTimeMillis, z3, z4, zLJ, jLJIIIZ, jLJIIJ);
            C2208201Bbe.LIZJ.put(Integer.valueOf(System.identityHashCode(commentImageModel)), c2208241Bbi);
            C2208201Bbe.LJIILL(commentImageModel, c2208241Bbi);
        }
        LJIILIIL(commentImageModel);
        if (C294440BgQ.LIZ() != 0 && LJIIZILJ(commentImageModel)) {
            C1344030l4z.LIZJ("CommentImageUploadController", "onMediaSelected: live photo selected");
            String videoPath2 = commentImageModel.getVideoPath();
            if (videoPath2 == null) {
                C1344030l4z.LIZJ("CommentImageUploadController", "pre-compress upload live photo video is null!");
                return;
            }
            if (commentImageModel.getCompressedVideoStatus() != 0 && commentImageModel.getCompressedVideoStatus() != 5 && (commentImageModel.getCompressedVideoStatus() != 4 || C2260008tK.LJFF(commentImageModel.getCompressedVideoPath()))) {
                return;
            }
            commentImageModel.setCompressedVideoStatus(1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pre-compress live photo. try to compress, isRetry: ");
            sbLIZ.append(false);
            C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ));
            C2208281Bbm.LIZ.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startCompressLivePhoto: ");
            sbLIZ2.append(commentImageModel);
            C2188811AlT.LIZIZ(sbLIZ2);
            C2208291Bbn c2208291BbnLJIIIIZZ = C2208281Bbm.LJIIIIZZ(commentImageModel, null);
            c2208291BbnLJIIIIZZ.LJIIIIZZ = true;
            c2208291BbnLJIIIIZZ.LJIIJ = System.currentTimeMillis();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("pre-compress upload file: ");
            sbLIZ3.append(videoPath2);
            C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ3));
            C19H5 c19h5 = new C19H5() { // from class: X.1Bbl
                @Override // X.C19H5
                public final void LIZJ() throws JSONException {
                    if (commentImageModel.getCompressedVideoStatus() != 1) {
                        return;
                    }
                    commentImageModel.setCompressedVideoStatus(5);
                    C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
                    CommentImageModel commentImageModel2 = commentImageModel;
                    long j = -1;
                    Long lValueOf = Long.valueOf(j);
                    c2208281Bbm.getClass();
                    C2208281Bbm.LIZIZ(commentImageModel2, -1, lValueOf, "video pre-compress completed error");
                    C2208281Bbm.LJIIJJI(c2208281Bbm, commentImageModel, -1, null, Long.valueOf(j), "video pre-compress completed error", 4);
                    C2208201Bbe c2208201Bbe = C2208201Bbe.LIZ;
                    CommentImageModel commentImageModel3 = commentImageModel;
                    c2208201Bbe.getClass();
                    C2208201Bbe.LIZLLL(c2208201Bbe, commentImageModel3, -1, C2208201Bbe.LJIILIIL(commentImageModel3), 0L, "transcode_failed", j, "LivePhotoCompressCallback", 8);
                }

                @Override // X.C19H5
                public final void LIZ(C2208311Bbp c2208311Bbp) throws JSONException {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("live photo pre-compress completed: ");
                    sbLIZ4.append(c2208311Bbp.LIZ);
                    C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ4));
                    if (commentImageModel.getCompressedVideoStatus() != 1) {
                        if (c2208311Bbp.LJII || c2208311Bbp.LJI) {
                            int i = C2208181Bbc.LJII;
                            C2208191Bbd.LJIILLIIL(c2208311Bbp.LIZ);
                            return;
                        }
                        return;
                    }
                    commentImageModel.setCompressedVideoStatus(4);
                    commentImageModel.setVideoCompressed(c2208311Bbp.LJII);
                    commentImageModel.setCompressedVideoPath(c2208311Bbp.LIZ);
                    C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
                    CommentImageModel commentImageModel2 = commentImageModel;
                    c2208281Bbm.getClass();
                    C2208281Bbm.LIZIZ(commentImageModel2, 1, null, null);
                    C2208281Bbm.LJIIJJI(c2208281Bbm, commentImageModel, 1, c2208311Bbp, null, null, 24);
                    C2208201Bbe c2208201Bbe = C2208201Bbe.LIZ;
                    CommentImageModel commentImageModel3 = commentImageModel;
                    c2208201Bbe.getClass();
                    C2208201Bbe.LIZLLL(c2208201Bbe, commentImageModel3, 1, C2208201Bbe.LJIILIIL(commentImageModel3), C2208201Bbe.LIZ(c2208311Bbp.LJFF), null, 0L, null, 112);
                }
            };
            C20182113xz.LIZ.getClass();
            C15O7.LIZJ(new ACallableS31S1000000_30(videoPath2, 1)).LJ(new C21524519Ln(c19h5, 7), C15O7.LJIIIIZZ, null);
        }
    }

    public static void LJIIL(CommentImageModel commentImageModel) {
        C2208351Bbt c2208351BbtRemove = C2208181Bbc.LJIIJ.remove(Integer.valueOf(commentImageModel.hashCode()));
        if (c2208351BbtRemove != null) {
            C1344030l4z.LIZJ("CommentImageUploadController", "find pendingInfo and start upload");
            C2208181Bbc c2208181Bbc = c2208351BbtRemove.LIZ;
            if (c2208181Bbc != null) {
                c2208181Bbc.LJIIIIZZ(commentImageModel, c2208351BbtRemove.LIZIZ, false);
                return;
            }
            return;
        }
        C1344030l4z.LIZJ("CommentImageUploadController", "no PendingInfo");
    }

    public static void LJIILIIL(CommentImageModel commentImageModel) {
        List<String> urlList;
        if (commentImageModel != null && (urlList = commentImageModel.getUrlList()) != null && !urlList.isEmpty()) {
            if (LJIIIZ(commentImageModel) && !LJIIJ(commentImageModel)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pre-compress image.size: ");
                sbLIZ.append(commentImageModel.getSize());
                sbLIZ.append(", no need to compress");
                C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ));
                C2208201Bbe c2208201Bbe = C2208201Bbe.LIZ;
                c2208201Bbe.getClass();
                C2208201Bbe.LIZJ(c2208201Bbe, commentImageModel, 1, 0L, C2208201Bbe.LJIIIZ(commentImageModel), null, 0L, null, 112);
                return;
            }
            LJIILJJIL(commentImageModel, "webp", false);
            return;
        }
        C1344030l4z.LIZJ("CommentImageUploadController", "pre-compress upload image is null!");
    }

    public static void LJIILLIIL(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1344030l4z.LIZJ("CommentImageUploadController", "delete file is null");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete file ");
        sbLIZ.append(str);
        C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ));
        C2260008tK.LJ(str);
    }

    public static boolean LJIIZILJ(CommentImageModel commentImageModel) {
        String livePhotoPreviewModeStr;
        if (C294440BgQ.LIZ() == 0) {
            return false;
        }
        LivePhotoInfo livePhotoInfo = commentImageModel.getLivePhotoInfo();
        if (livePhotoInfo != null) {
            livePhotoPreviewModeStr = livePhotoInfo.getLivePhotoPreviewModeStr();
        } else {
            livePhotoPreviewModeStr = null;
        }
        if (Intrinsics.LJFF(livePhotoPreviewModeStr, "STATIC")) {
            return false;
        }
        String videoPath = commentImageModel.getVideoPath();
        if (videoPath == null || videoPath.length() == 0) {
            String compressedVideoPath = commentImageModel.getCompressedVideoPath();
            if (compressedVideoPath == null || compressedVideoPath.length() == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void LIZ(CommentImageModel commentImageModel, boolean z) {
        if (commentImageModel == null) {
            return;
        }
        String compressedVideoPath = commentImageModel.getCompressedVideoPath();
        if (z && compressedVideoPath != null && compressedVideoPath.length() != 0 && !Intrinsics.LJFF(compressedVideoPath, commentImageModel.getVideoPath())) {
            LJIILLIIL(compressedVideoPath);
        }
        commentImageModel.setCompressedVideoPath(null);
        commentImageModel.setCompressedVideoStatus(0);
        commentImageModel.setVideoCompressed(false);
    }

    public static void LIZLLL(CommentImageModel commentImageModel, InterfaceC2207911BbB interfaceC2207911BbB, long j) {
        long jLongValue;
        int iIdentityHashCode = System.identityHashCode(commentImageModel);
        ConcurrentHashMap<Integer, Long> concurrentHashMap = C2208181Bbc.LJIILIIL;
        Long l = concurrentHashMap.get(Integer.valueOf(iIdentityHashCode));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long jMax = Math.max(jLongValue, C13LZ.LJFF(j, 0L, 99L));
        if (jMax > jLongValue) {
            concurrentHashMap.put(Integer.valueOf(iIdentityHashCode), Long.valueOf(jMax));
            interfaceC2207911BbB.onProgress(jMax);
        }
    }

    public static void LJIILJJIL(final CommentImageModel commentImageModel, final String str, final boolean z) {
        String lowerCase;
        if (commentImageModel.getCompressedStatus() == 0 || commentImageModel.getCompressedStatus() == 3 || (commentImageModel.getCompressedStatus() == 2 && !C2260008tK.LJFF(commentImageModel.getCompressedFilePath()))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pre-compress image.size: ");
            sbLIZ.append(commentImageModel.getSize());
            sbLIZ.append(", try to compress, isRetry: ");
            sbLIZ.append(z);
            C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ));
            String strLJ = LJ(commentImageModel);
            if (strLJ != null && strLJ.length() != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("pre-compress upload file: ");
                sbLIZ2.append(strLJ);
                C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ2));
                commentImageModel.setCompressedStatus(1);
                C2208281Bbm c2208281Bbm = C2208281Bbm.LIZ;
                String format = commentImageModel.getFormat();
                if (format == null || (lowerCase = format.toLowerCase(Locale.ROOT)) == null) {
                    lowerCase = "";
                }
                c2208281Bbm.getClass();
                C2208281Bbm.LJIIL(commentImageModel, lowerCase, true);
                InterfaceC19728212Gq interfaceC19728212Gq = new InterfaceC19728212Gq() { // from class: X.1Bbh
                    @Override // X.InterfaceC19728212Gq
                    public final void LIZJ() {
                        if (!z && CommentImagePublishOptExp.LIZIZ()) {
                            C1344030l4z.LIZJ("CommentImageUploadController", "pre-compress failed, retrying once");
                            commentImageModel.setCompressedStatus(3);
                            int i = C2208181Bbc.LJII;
                            C2208191Bbd.LJIILJJIL(commentImageModel, str, true);
                            return;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("pre-compress completed error, isRetry: ");
                        sbLIZ3.append(z);
                        C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ3));
                        commentImageModel.setCompressedStatus(3);
                        int i2 = C2208181Bbc.LJII;
                        C2208191Bbd.LJIIL(commentImageModel);
                        C2208281Bbm c2208281Bbm2 = C2208281Bbm.LIZ;
                        CommentImageModel commentImageModel2 = commentImageModel;
                        long j = -1;
                        Long lValueOf = Long.valueOf(j);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("pre-compress completed error, isRetry: ");
                        sbLIZ4.append(z);
                        C2208281Bbm.LIZ(c2208281Bbm2, commentImageModel2, -1, 0, 0, 0L, lValueOf, C2188811AlT.LIZIZ(sbLIZ4), 28);
                        C2208201Bbe c2208201Bbe = C2208201Bbe.LIZ;
                        CommentImageModel commentImageModel3 = commentImageModel;
                        c2208201Bbe.getClass();
                        C2208201Bbe.LIZJ(c2208201Bbe, commentImageModel3, -1, C2208201Bbe.LJIILIIL(commentImageModel3), 0L, "error_still_write", j, "ImageCompressCallback", 8);
                    }

                    @Override // X.InterfaceC19728212Gq
                    public final void LIZ(C2208361Bbu c2208361Bbu) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("pre-compress completed: ");
                        sbLIZ3.append(c2208361Bbu.LIZ);
                        sbLIZ3.append(" now image.format:{");
                        sbLIZ3.append(commentImageModel.getFormat());
                        C1344030l4z.LIZJ("CommentImageUploadController", C2188811AlT.LIZIZ(sbLIZ3));
                        commentImageModel.setFormat(str);
                        commentImageModel.setCompressed(true);
                        commentImageModel.setCompressedFilePath(c2208361Bbu.LIZ);
                        commentImageModel.setCompressedStatus(2);
                        int i = C2208181Bbc.LJII;
                        C2208191Bbd.LJIIL(commentImageModel);
                        C2208281Bbm.LIZ(C2208281Bbm.LIZ, commentImageModel, 1, c2208361Bbu.LIZIZ, c2208361Bbu.LIZJ, c2208361Bbu.LIZLLL, null, null, 96);
                        C2208201Bbe c2208201Bbe = C2208201Bbe.LIZ;
                        CommentImageModel commentImageModel2 = commentImageModel;
                        c2208201Bbe.getClass();
                        C2208201Bbe.LIZJ(c2208201Bbe, commentImageModel2, 1, C2208201Bbe.LJIILIIL(commentImageModel2), C2208201Bbe.LIZ(c2208361Bbu.LIZLLL), null, 0L, null, 112);
                    }
                };
                float size = commentImageModel.getSize() / C2208181Bbc.LJII;
                if (CommentImagePublishOptExp.LIZJ()) {
                    C20182113xz c20182113xz = C20182113xz.LIZ;
                    C054G c054g = C2208181Bbc.LJIIJJI;
                    int width = commentImageModel.getWidth();
                    int height = commentImageModel.getHeight();
                    c20182113xz.getClass();
                    C2208181Bbc.LJIIL = C20182113xz.LIZJ(c054g, strLJ, width, height, size, interfaceC19728212Gq);
                    return;
                }
                C20182113xz c20182113xz2 = C20182113xz.LIZ;
                int width2 = commentImageModel.getWidth();
                int height2 = commentImageModel.getHeight();
                c20182113xz2.getClass();
                C15O7.LIZJ(new CallableC19728112Gp(width2, height2, size, strLJ)).LJ(new C19774512Yl(interfaceC19728212Gq, 18), C15O7.LJIIIIZZ, null);
                return;
            }
            C2208201Bbe c2208201Bbe = C2208201Bbe.LIZ;
            c2208201Bbe.getClass();
            C2208201Bbe.LIZJ(c2208201Bbe, commentImageModel, -1, C2208201Bbe.LJIILIIL(commentImageModel), 0L, "error_still_write", 0L, "ImageCompressCallback", 40);
        }
    }
}
