package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208201Bbe {
    public static final C2208201Bbe LIZ = new C2208201Bbe();
    public static final int LIZIZ;
    public static final ConcurrentHashMap<Integer, C2208241Bbi> LIZJ;
    public static final ConcurrentHashMap<Integer, C2208261Bbk> LIZLLL;

    static {
        SettingsManager.LIZLLL().getClass();
        LIZIZ = SettingsManager.LJ("comment_image_upload_threshold", 3) * 1024 * 1024;
        LIZJ = new ConcurrentHashMap<>();
        LIZLLL = new ConcurrentHashMap<>();
    }

    public static long LIZ(long j) {
        if (j <= 0) {
            return 0L;
        }
        return (j + 1023) / 1024;
    }

    public static boolean LJ(CommentImageModel commentImageModel) {
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

    public static long LJFF(String str) {
        if (str != null && str.length() != 0) {
            return LIZ(new C0VSJ(str).length());
        }
        return 0L;
    }

    public static long LJIIIZ(CommentImageModel commentImageModel) {
        String str;
        String strLIZ = null;
        if (commentImageModel.isCompressed()) {
            strLIZ = commentImageModel.getCompressedFilePath();
        } else if (C703302op.LIZ(commentImageModel.getEditedImagePath())) {
            strLIZ = commentImageModel.getEditedImagePath();
        } else {
            List<String> urlList = commentImageModel.getUrlList();
            if (urlList != null && (str = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
                C844470XAv.LIZ.getClass();
                strLIZ = C09N5.LIZ(C844470XAv.LIZ(), UriProtector.parse(str));
            }
        }
        Long lValueOf = Long.valueOf(LJFF(strLIZ));
        if (lValueOf.longValue() > 0) {
            return lValueOf.longValue();
        }
        return LIZ(commentImageModel.getSize());
    }

    public static long LJIIJ(CommentImageModel commentImageModel) {
        Long lValueOf = Long.valueOf(LJFF(commentImageModel.getCompressedVideoPath()));
        if (lValueOf.longValue() > 0) {
            return lValueOf.longValue();
        }
        return LJFF(commentImageModel.getVideoPath());
    }

    public static void LJIIL(CommentImageModel commentImageModel) {
        C2208261Bbk c2208261Bbk = LIZLLL.get(Integer.valueOf(System.identityHashCode(commentImageModel)));
        if (c2208261Bbk == null) {
            return;
        }
        synchronized (c2208261Bbk) {
            try {
                if (c2208261Bbk.LJIIJ) {
                    return;
                }
                c2208261Bbk.LJ = System.currentTimeMillis();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static long LJIILIIL(CommentImageModel commentImageModel) {
        C2208241Bbi c2208241Bbi = LIZJ.get(Integer.valueOf(System.identityHashCode(commentImageModel)));
        if (c2208241Bbi == null) {
            return 0L;
        }
        return System.currentTimeMillis() - c2208241Bbi.LIZ;
    }

    public static void LJIILJJIL(C2208251Bbj c2208251Bbj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("perf_phase", c2208251Bbj.LIZ);
        jSONObject.put(Scene.SCENE_SERVICE, c2208251Bbj.LIZIZ);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c2208251Bbj.LIZJ);
        jSONObject.put("fail_stage", c2208251Bbj.LIZLLL);
        jSONObject.put("fail_reason", C13LN.LJZL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, c2208251Bbj.LJ));
        jSONObject.put("error_code", c2208251Bbj.LJFF);
        jSONObject.put("error_domain", c2208251Bbj.LJI);
        long j = c2208251Bbj.LJII;
        long j2 = 0;
        if (j < 0) {
            j = 0;
        }
        jSONObject.put("total_ms", j);
        long j3 = c2208251Bbj.LJIIIIZZ;
        if (j3 < 0) {
            j3 = 0;
        }
        jSONObject.put("still_ms", j3);
        long j4 = c2208251Bbj.LJIIIZ;
        if (j4 < 0) {
            j4 = 0;
        }
        jSONObject.put("motion_ms", j4);
        long j5 = c2208251Bbj.LJIIJ;
        if (j5 < 0) {
            j5 = 0;
        }
        jSONObject.put("still_size_kb", j5);
        long j6 = c2208251Bbj.LJIIJJI;
        if (j6 >= 0) {
            j2 = j6;
        }
        jSONObject.put("motion_size_kb", j2);
        C20684815ws.LJIJ("comment_live_photo_perf", jSONObject);
    }

    public static boolean LJIILLIIL(CommentImageModel commentImageModel) {
        if (commentImageModel.getLivePhotoInfo() != null) {
            return true;
        }
        String videoPath = commentImageModel.getVideoPath();
        if (videoPath != null && videoPath.length() != 0) {
            return true;
        }
        String compressedVideoPath = commentImageModel.getCompressedVideoPath();
        if (compressedVideoPath != null && compressedVideoPath.length() != 0) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(CommentImageModel commentImageModel, String str) {
        boolean z;
        long jLJIIIZ;
        long jLJIIJ;
        if (commentImageModel != null && C294440BgQ.LIZ() != 0 && LJIILLIIL(commentImageModel)) {
            int iIdentityHashCode = System.identityHashCode(commentImageModel);
            ConcurrentHashMap<Integer, C2208241Bbi> concurrentHashMap = LIZJ;
            C2208241Bbi c2208241Bbi = concurrentHashMap.get(Integer.valueOf(iIdentityHashCode));
            if (c2208241Bbi == null) {
                return;
            }
            synchronized (c2208241Bbi) {
                try {
                    if (c2208241Bbi.LJIILIIL) {
                        return;
                    }
                    c2208241Bbi.LJIILIIL = true;
                    concurrentHashMap.remove(Integer.valueOf(iIdentityHashCode));
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C2208201Bbe c2208201Bbe = LIZ;
                    long j = jCurrentTimeMillis - c2208241Bbi.LIZ;
                    long j2 = c2208241Bbi.LJIIIIZZ;
                    long j3 = c2208241Bbi.LJIIIZ;
                    Long lValueOf = Long.valueOf(c2208241Bbi.LJIIJ);
                    if (lValueOf.longValue() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        jLJIIIZ = lValueOf.longValue();
                    } else {
                        c2208201Bbe.getClass();
                        jLJIIIZ = LJIIIZ(commentImageModel);
                    }
                    Long lValueOf2 = Long.valueOf(c2208241Bbi.LJIIJJI);
                    if (lValueOf2.longValue() > 0) {
                        jLJIIJ = lValueOf2.longValue();
                    } else {
                        c2208201Bbe.getClass();
                        jLJIIJ = LJIIJ(commentImageModel);
                    }
                    C2208251Bbj c2208251Bbj = new C2208251Bbj("produce", "produce_album", -1, "cancelled", str, 0L, "CommentLivePhotoPerfTracker", j, j2, j3, jLJIIIZ, jLJIIJ);
                    c2208201Bbe.getClass();
                    LJIILJJIL(c2208251Bbj);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void LJIIJJI(C2208201Bbe c2208201Bbe, CommentImageModel commentImageModel) {
        c2208201Bbe.getClass();
        C2208261Bbk c2208261Bbk = LIZLLL.get(Integer.valueOf(System.identityHashCode(commentImageModel)));
        if (c2208261Bbk != null) {
            synchronized (c2208261Bbk) {
                try {
                    if (c2208261Bbk.LJIIJ) {
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    c2208261Bbk.LIZLLL = jCurrentTimeMillis;
                    c2208261Bbk.LJI = jCurrentTimeMillis - c2208261Bbk.LIZ;
                    C2208201Bbe c2208201Bbe2 = LIZ;
                    c2208201Bbe2.getClass();
                    c2208261Bbk.LJIIIIZZ = LJIIIZ(commentImageModel);
                    if (c2208261Bbk.LIZJ) {
                        c2208261Bbk.LJ = jCurrentTimeMillis;
                    } else {
                        c2208201Bbe2.getClass();
                        LJII(commentImageModel, c2208261Bbk, 1, "none", "", 0L, "");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void LJIILL(CommentImageModel commentImageModel, C2208241Bbi c2208241Bbi) {
        String str;
        String str2;
        String compressedVideoPath;
        if (c2208241Bbi.LJIIL) {
            return;
        }
        if (c2208241Bbi.LJ != -1 && (!c2208241Bbi.LIZIZ || !c2208241Bbi.LIZJ)) {
            return;
        }
        c2208241Bbi.LJIIL = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = c2208241Bbi.LJ;
        if (i == 1) {
            str = "none";
        } else {
            str = "produce_error";
        }
        if (i == 1) {
            if (c2208241Bbi.LIZLLL) {
                str2 = "success_still_and_motion";
            } else {
                String videoPath = commentImageModel.getVideoPath();
                if ((videoPath == null || videoPath.length() == 0) && ((compressedVideoPath = commentImageModel.getCompressedVideoPath()) == null || compressedVideoPath.length() == 0)) {
                    str2 = "success_still_only_live_photo_request_nil";
                } else {
                    str2 = "success_still_only";
                }
            }
        } else {
            str2 = c2208241Bbi.LJFF;
        }
        LJIILJJIL(new C2208251Bbj("produce", "produce_album", i, str, str2, c2208241Bbi.LJI, c2208241Bbi.LJII, jCurrentTimeMillis - c2208241Bbi.LIZ, c2208241Bbi.LJIIIIZZ, c2208241Bbi.LJIIIZ, c2208241Bbi.LJIIJ, c2208241Bbi.LJIIJJI));
    }

    public static void LJI(CommentImageModel commentImageModel, String str, String str2, long j, String str3) {
        C2208261Bbk c2208261Bbk = LIZLLL.get(Integer.valueOf(System.identityHashCode(commentImageModel)));
        if (c2208261Bbk == null) {
            return;
        }
        synchronized (c2208261Bbk) {
            try {
                if (c2208261Bbk.LJIIJ) {
                    return;
                }
                LIZ.getClass();
                LJII(commentImageModel, c2208261Bbk, -1, str, str2, j, str3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJII(CommentImageModel commentImageModel, C2208261Bbk c2208261Bbk, int i, String str, String str2, long j, String str3) {
        String str4;
        boolean z;
        long jLJIIIZ;
        long jLJIIJ;
        String str5 = str;
        c2208261Bbk.LJIIJ = true;
        LIZLLL.remove(Integer.valueOf(System.identityHashCode(commentImageModel)));
        if (i == 1 && commentImageModel != null) {
            LIZJ.remove(Integer.valueOf(System.identityHashCode(commentImageModel)));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c2208261Bbk.LJI <= 0) {
            long j2 = c2208261Bbk.LIZLLL;
            if (j2 > 0) {
                c2208261Bbk.LJI = j2 - c2208261Bbk.LIZ;
            } else if (i == -1) {
                c2208261Bbk.LJI = jCurrentTimeMillis - c2208261Bbk.LIZ;
            }
        }
        if (c2208261Bbk.LIZIZ) {
            str4 = "upload_retry";
        } else {
            str4 = "upload_initial";
        }
        if (i == 1) {
            str5 = "none";
        }
        long j3 = jCurrentTimeMillis - c2208261Bbk.LIZ;
        long j4 = c2208261Bbk.LJI;
        long j5 = c2208261Bbk.LJII;
        Long lValueOf = Long.valueOf(c2208261Bbk.LJIIIIZZ);
        if (lValueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jLJIIIZ = lValueOf.longValue();
        } else {
            jLJIIIZ = LJIIIZ(commentImageModel);
        }
        Long lValueOf2 = Long.valueOf(c2208261Bbk.LJIIIZ);
        if (lValueOf2.longValue() > 0) {
            jLJIIJ = lValueOf2.longValue();
        } else {
            jLJIIJ = LJIIJ(commentImageModel);
        }
        LJIILJJIL(new C2208251Bbj("upload", str4, i, str5, str2, j, str3, j3, j4, j5, jLJIIIZ, jLJIIJ));
    }

    public static void LIZJ(C2208201Bbe c2208201Bbe, CommentImageModel commentImageModel, int i, long j, long j2, String str, long j3, String str2, int i2) {
        if ((i2 & 8) != 0) {
            j2 = 0;
        }
        if ((i2 & 16) != 0) {
            str = "";
        }
        if ((i2 & 32) != 0) {
            j3 = 0;
        }
        if ((i2 & 64) != 0) {
            str2 = "";
        }
        c2208201Bbe.getClass();
        C2208241Bbi c2208241Bbi = LIZJ.get(Integer.valueOf(System.identityHashCode(commentImageModel)));
        if (c2208241Bbi != null) {
            synchronized (c2208241Bbi) {
                try {
                    if (c2208241Bbi.LJIIL) {
                        return;
                    }
                    c2208241Bbi.LIZIZ = true;
                    c2208241Bbi.LJIIIIZZ = j;
                    c2208241Bbi.LJIIJ = j2;
                    if (i == -1) {
                        c2208241Bbi.LJ = i;
                        c2208241Bbi.LJFF = str;
                        c2208241Bbi.LJI = j3;
                        c2208241Bbi.LJII = str2;
                    }
                    LIZ.getClass();
                    LJIILL(commentImageModel, c2208241Bbi);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void LIZLLL(C2208201Bbe c2208201Bbe, CommentImageModel commentImageModel, int i, long j, long j2, String str, long j3, String str2, int i2) {
        if ((i2 & 8) != 0) {
            j2 = 0;
        }
        if ((i2 & 16) != 0) {
            str = "";
        }
        if ((i2 & 32) != 0) {
            j3 = 0;
        }
        if ((i2 & 64) != 0) {
            str2 = "";
        }
        c2208201Bbe.getClass();
        C2208241Bbi c2208241Bbi = LIZJ.get(Integer.valueOf(System.identityHashCode(commentImageModel)));
        if (c2208241Bbi != null) {
            synchronized (c2208241Bbi) {
                try {
                    if (c2208241Bbi.LJIIL) {
                        return;
                    }
                    c2208241Bbi.LIZJ = true;
                    c2208241Bbi.LJIIIZ = j;
                    c2208241Bbi.LJIIJJI = j2;
                    if (i == -1) {
                        c2208241Bbi.LJ = i;
                        c2208241Bbi.LJFF = str;
                        c2208241Bbi.LJI = j3;
                        c2208241Bbi.LJII = str2;
                    }
                    LIZ.getClass();
                    LJIILL(commentImageModel, c2208241Bbi);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
