package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import java.util.HashMap;
import kotlin.text.u;

/* JADX INFO: renamed from: X.141Q, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C141Q {
    public static final C141Q LIZ = new C141Q();
    public static final HashMap<String, Integer> LIZIZ = new HashMap<>();

    public static final String LIZ(AVMusic aVMusic) {
        C0XLQ c0xlqLJIIL;
        String path = aVMusic.getPath();
        if (path == null) {
            path = "";
        }
        if (aVMusic.isNeedSetCookie() && !u.LJJIIJZLJL(path, "http://", false) && (c0xlqLJIIL = C0XLQ.LJIIL(path)) != null && c0xlqLJIIL.LJIILLIIL("ss_is_p_v_ss") == null) {
            C0XLP c0xlpLJIIJ = c0xlqLJIIL.LJIIJ();
            c0xlpLJIIJ.LJIIL("ss_is_p_v_ss", "1");
            path = c0xlpLJIIJ.toString();
        }
        C0CHQ.LIZ().LJJJJL().LJIIIIZZ();
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[Catch: Exception -> 0x0056, all -> 0x0064, TRY_ENTER, TryCatch #3 {Exception -> 0x0056, blocks: (B:10:0x0017, B:14:0x0048, B:11:0x001b, B:13:0x0028), top: B:33:0x001b, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZLLL(java.lang.String r4) {
        /*
            boolean r0 = LJII(r4)
            r3 = -1
            if (r0 == 0) goto Le
            boolean r0 = X.C298180BmS.LIZ()
            if (r0 == 0) goto Le
            return r3
        Le:
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever
            r2.<init>()
            r1 = 0
            if (r4 == 0) goto L17
            goto L1b
        L17:
            r2.setDataSource(r4)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            goto L48
        L1b:
            android.net.Uri r0 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            boolean r1 = kotlin.text.u.LJJIIJZLJL(r4, r0, r1)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            r0 = 1
            if (r1 != r0) goto L17
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVServiceProxy> r0 = com.ss.android.ugc.aweme.services.IAVServiceProxy.class
            java.lang.Object r0 = r1.getService(r0)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = (com.ss.android.ugc.aweme.services.IAVServiceProxy) r0     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            X.0Epg r0 = r0.getApplicationService()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            X.10Hx r0 = (X.C19221910Hx) r0     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            r0.getClass()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            android.app.Application r1 = X.C1BWL.LIZ()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            android.net.Uri r0 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            r2.setDataSource(r1, r0)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
        L48:
            java.lang.String r0 = X.C20144413ru.LIZJ(r2)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            float r0 = r0.floatValue()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            int r3 = (int) r0     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L64
            goto L5a
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L64
        L5a:
            r2.release()     // Catch: java.lang.Exception -> L5e
            goto L63
        L5e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        L63:
            return r3
        L64:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L64
            r2.release()     // Catch: java.lang.Exception -> L6c
            throw r1
        L6c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141Q.LIZLLL(java.lang.String):int");
    }

    public static String LJ(AVMusic aVMusic) {
        if (aVMusic != null && !TextUtils.isEmpty(aVMusic.getPath())) {
            if (aVMusic.isLocalMusic()) {
                return aVMusic.path;
            }
            return C0CHQ.LIZ().LJJJJL().LJIIIZ(aVMusic);
        }
        return null;
    }

    public static boolean LJII(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (u.LJJIIJZLJL(str, "http://", false) || u.LJJIIJZLJL(str, "https://", false)) {
            return true;
        }
        return false;
    }

    public static final String LJIIIIZZ(String str) {
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
        String strLJ;
        LIZ.getClass();
        if (LJII(str) && C298180BmS.LIZ() && (interfaceC1662290tMJLIZJ = ((IMusicExternalService) ServiceManager.get().getService(IMusicExternalService.class)).LIZJ()) != null && (strLJ = interfaceC1662290tMJLIZJ.LJ(str, null)) != null) {
            return strLJ;
        }
        return str;
    }

    public static final int LIZIZ(int i, String str) {
        Integer numValueOf;
        if (str == null) {
            return 0;
        }
        HashMap<String, Integer> map = LIZIZ;
        Integer num = map.get(str);
        if (num != null && num.intValue() > 0) {
            return num.intValue();
        }
        if (i > 0) {
            return i;
        }
        String strLJIIIIZZ = LJIIIIZZ(str);
        if (strLJIIIIZZ == null || strLJIIIIZZ.length() == 0) {
            return 0;
        }
        int[] iArr = new int[10];
        int audioFileInfo = VEUtils.getAudioFileInfo(strLJIIIIZZ, iArr);
        if (audioFileInfo == 0) {
            numValueOf = Integer.valueOf(iArr[3]);
        } else {
            if (C298180BmS.LIZ()) {
                return 0;
            }
            C201962140q c201962140q = C201962140q.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MusicUtil#getMusicDuration#VEUtils.getAudioFileInfo(path, audioInfo) ret is ");
            sbLIZ.append(audioFileInfo);
            C201955140j.LIZJ(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
            numValueOf = Integer.valueOf(C1403010mc7.LIZ.getMusicService().getMusicDuration(str));
        }
        map.put(str, numValueOf);
        return numValueOf.intValue();
    }

    public static int LJFF(VideoPublishEditModel videoPublishEditModel, int i) {
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic == null) {
            return 0;
        }
        String mMusicPath = videoPublishEditModel.getMMusicPath();
        if (mMusicPath == null) {
            mMusicPath = "";
        }
        return Math.min(videoPublishEditModel.getMMusicStart() + i, videoPublishEditModel.getMMusicStart() + LJI(aVMusicExtractAVMusic, mMusicPath));
    }

    public static int LJI(AVMusic aVMusic, String str) {
        Integer numValueOf;
        int iIntValue = 0;
        if (str != null) {
            HashMap<String, Integer> map = LIZIZ;
            Integer num = map.get(str);
            if (num != null && num.intValue() > 0) {
                iIntValue = num.intValue();
            } else if (C298180BmS.LIZ() && aVMusic.getDuration() > 0) {
                iIntValue = aVMusic.getDuration();
            } else {
                String strLJIIIIZZ = LJIIIIZZ(str);
                if (strLJIIIIZZ != null && strLJIIIIZZ.length() != 0) {
                    int[] iArr = new int[10];
                    if (VEUtils.getAudioFileInfo(strLJIIIIZZ, iArr) == 0) {
                        numValueOf = Integer.valueOf(iArr[3]);
                    } else {
                        numValueOf = Integer.valueOf(aVMusic.getDuration());
                    }
                    map.put(str, numValueOf);
                    iIntValue = numValueOf.intValue();
                }
            }
        }
        int shootDuration = aVMusic.getShootDuration();
        if (shootDuration > 0 && Math.abs(iIntValue - shootDuration) >= 1000) {
            return shootDuration;
        }
        return iIntValue;
    }
}
