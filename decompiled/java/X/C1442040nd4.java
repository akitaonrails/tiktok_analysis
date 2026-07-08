package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0nd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442040nd4 {
    public static final List<String> LIZ = Collections.singletonList("duet");

    public static final long LIZJ(AVMusic aVMusic, ShortVideoContext shortVideoContext) {
        int duration;
        if (aVMusic != null && shortVideoContext != null) {
            if (aVMusic.getPresenterDuration() > 0) {
                duration = aVMusic.getPresenterDuration();
            } else {
                duration = aVMusic.getDuration();
            }
            long j = duration;
            if (C579130MnX.LIZ() && aVMusic.isNeedReuse()) {
                return Math.min(j, aVMusic.getTrimmedMusicDuration());
            }
            return j;
        }
        return 0L;
    }

    @InterfaceC1294060jmO
    public static final int LIZ(ShortVideoContext shortVideoContext, int i, AVMusic aVMusic) {
        int shootDuration;
        boolean zIsUnlimitedMusic;
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        MusicObject musicObject;
        if (aVMusic == null) {
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null && (musicObject = musicBuzModel.music) != null) {
                aVMusic = MusicBeanUtilKt.extractAVMusic(musicObject);
            } else {
                aVMusic = null;
            }
        }
        if (C1458070o2v.LJFF()) {
            shootDuration = C1458070o2v.LIZLLL();
        } else if (aVMusic != null) {
            shootDuration = aVMusic.getShootDuration();
        } else {
            shootDuration = 0;
        }
        if (i <= 0) {
            if (shortVideoContext != null) {
                i = (int) shortVideoContext.cameraComponentModel.mMaxDuration;
            } else {
                i = 0;
            }
        }
        if (aVMusic != null) {
            zIsUnlimitedMusic = aVMusic.isUnlimitedMusic();
        } else {
            zIsUnlimitedMusic = false;
        }
        if (!C1458070o2v.LJFF()) {
            return 0;
        }
        if (zIsUnlimitedMusic) {
            return i;
        }
        int iLIZJ = (int) LIZJ(aVMusic, shortVideoContext);
        if (iLIZJ > shootDuration) {
            return Math.min(i, iLIZJ);
        }
        if (shortVideoContext != null && (shortVideoContext.shootMode == 16 || shortVideoContext.shootMode == 29)) {
            return Math.min(i, Math.min(iLIZJ, shootDuration));
        }
        return Math.min(i, shootDuration);
    }

    public static final int LIZLLL(ShortVideoContext shortVideoContext, int i, AVMusic aVMusic) {
        int iLIZ;
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        MusicBuzModel musicBuzModel2;
        CreativeModel creativeModel2;
        if (aVMusic == null) {
            if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null) {
                musicBuzModel2 = creativeModel2.musicBuzModel;
            } else {
                musicBuzModel2 = null;
            }
            aVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel2);
        }
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null && C1458070o2v.LJ(musicBuzModel) && aVMusic != null && aVMusic.isUnlimitedMusic()) {
            if (i <= 0) {
                return (int) shortVideoContext.cameraComponentModel.mMaxDuration;
            }
            return i;
        }
        int iLIZ2 = LIZ(shortVideoContext, i, aVMusic);
        if (aVMusic != null && (iLIZ = C1465190oEP.LIZ(aVMusic, Integer.valueOf(aVMusic.getShootDuration()))) > iLIZ2) {
            return Math.min(iLIZ, i);
        }
        return iLIZ2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce A[PHI: r5
      0x00ce: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v3 java.lang.String) binds: [B:22:0x0033, B:20:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.util.LinkedHashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1446200njm LJFF(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r18, long r19, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.util.Map r24, boolean r25, int r26) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1442040nd4.LJFF(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, long, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean, int):X.0njm");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0186 A[PHI: r15
      0x0186: PHI (r15v2 java.lang.String) = (r15v0 java.lang.String), (r15v3 java.lang.String) binds: [B:34:0x0053, B:32:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b5 A[PHI: r2
      0x02b5: PHI (r2v4 java.lang.String) = 
      (r2v3 java.lang.String)
      (r2v20 java.lang.String)
      (r2v20 java.lang.String)
      (r2v20 java.lang.String)
      (r2v20 java.lang.String)
      (r2v20 java.lang.String)
     binds: [B:177:0x0285, B:187:0x029b, B:189:0x029f, B:191:0x02a3, B:193:0x02ab, B:195:0x02b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ca A[PHI: r1 r2
      0x02ca: PHI (r1v16 java.lang.String) = 
      (r1v15 java.lang.String)
      (r1v77 java.lang.String)
      (r1v77 java.lang.String)
      (r1v77 java.lang.String)
      (r1v77 java.lang.String)
     binds: [B:197:0x02b6, B:199:0x02ba, B:201:0x02be, B:203:0x02c2, B:205:0x02c8] A[DONT_GENERATE, DONT_INLINE]
      0x02ca: PHI (r2v6 java.lang.String) = 
      (r2v5 java.lang.String)
      (r2v19 java.lang.String)
      (r2v19 java.lang.String)
      (r2v19 java.lang.String)
      (r2v19 java.lang.String)
     binds: [B:197:0x02b6, B:199:0x02ba, B:201:0x02be, B:203:0x02c2, B:205:0x02c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x041d A[LOOP:5: B:290:0x0417->B:292:0x041d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129 A[PHI: r34
      0x0129: PHI (r34v4 java.lang.String) = (r34v1 java.lang.String), (r34v5 java.lang.String) binds: [B:85:0x00f2, B:83:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v100, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v106, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v109, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v26, types: [X.0XED] */
    /* JADX WARN: Type inference failed for: r1v99, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1446210njn LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r33, long r34, boolean r36, java.lang.Long r37, java.lang.Long r38, boolean r39, long r40, boolean r42, java.util.Map r43, kotlin.jvm.internal.AwS566S0100000_22 r44, boolean r45, int r46) {
        /*
            Method dump skipped, instruction units count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1442040nd4.LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, long, boolean, java.lang.Long, java.lang.Long, boolean, long, boolean, java.util.Map, kotlin.jvm.internal.AwS566S0100000_22, boolean, int):X.0njn");
    }
}
