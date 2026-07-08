package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.FusedMusic;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.MusicInfo;
import com.ss.android.ugc.aweme.creative.model.UgcTemplateData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536310L1p {
    public static final C536310L1p LIZ = new C536310L1p();

    public static boolean LIZJ(NLETemplateModel nLETemplateModel) {
        VecNLETrackSPtr tracks;
        if (nLETemplateModel == null || (tracks = nLETemplateModel.getTracks()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
            if (nLETrackSlot.getFeatureList().contains("UGC_ASYNC_I2V")) {
                C354260Dui.LIZ.getClass();
                if (C354260Dui.LJFF(nLETrackSlot) != null) {
                    arrayList2.add(obj);
                }
            }
        }
        if (!(!arrayList2.isEmpty())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3, java.util.List r4) {
        /*
            r2 = 0
            if (r3 == 0) goto L48
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.creative.model.UgcTemplateData r1 = r0.ugcTemplateData
        L9:
            java.lang.String r0 = r3.shootWay
        Lb:
            boolean r0 = LJFF(r1, r0)
            if (r0 == 0) goto L4e
            if (r3 == 0) goto L4d
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.creative.model.UgcTemplateData r0 = r0.ugcTemplateData
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.creative.model.MusicInfo r0 = r0.awemeMusicInfo
            if (r0 == 0) goto L4d
            java.util.List r1 = r0.getFusedMusics()
            if (r1 == 0) goto L4d
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L34:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.creative.model.FusedMusic r0 = (com.ss.android.ugc.aweme.creative.model.FusedMusic) r0
            java.lang.String r0 = r0.getMusicId()
            r2.add(r0)
            goto L34
        L48:
            r1 = r2
            if (r3 != 0) goto L9
            r0 = r2
            goto Lb
        L4d:
            return r2
        L4e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C536310L1p.LIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.util.List):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3, java.lang.String r4) {
        /*
            r2 = 0
            if (r3 == 0) goto L12
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
            if (r0 == 0) goto L12
            com.ss.android.ugc.aweme.creative.model.UgcTemplateData r1 = r0.ugcTemplateData
        L9:
            java.lang.String r0 = r3.shootWay
        Lb:
            boolean r0 = LJFF(r1, r0)
            if (r0 == 0) goto L17
            return r2
        L12:
            r1 = r2
            if (r3 != 0) goto L9
            r0 = r2
            goto Lb
        L17:
            if (r3 == 0) goto L3a
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
            if (r0 == 0) goto L3a
            com.ss.android.ugc.aweme.creative.model.UgcTemplateData r1 = r0.ugcTemplateData
        L1f:
            java.lang.String r0 = r3.shootWay
        L21:
            boolean r0 = LJII(r1, r0)
            if (r0 == 0) goto L3f
            if (r3 == 0) goto L39
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r3.creativeModel
            if (r0 == 0) goto L39
            com.ss.android.ugc.aweme.creative.model.UgcTemplateData r0 = r0.ugcTemplateData
            if (r0 == 0) goto L39
            com.ss.android.ugc.aweme.creative.model.MusicInfo r0 = r0.awemeMusicInfo
            if (r0 == 0) goto L39
            java.lang.String r2 = r0.getMusicId()
        L39:
            return r2
        L3a:
            r1 = r2
            if (r3 != 0) goto L1f
            r0 = r2
            goto L21
        L3f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C536310L1p.LIZIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.String):java.lang.String");
    }

    public static boolean LIZLLL(MusicInfo musicInfo, MusicInfo musicInfo2) {
        if (musicInfo == null || musicInfo2 == null) {
            return false;
        }
        if (musicInfo2.getFusedMusics() != null && (!r0.isEmpty())) {
            List<FusedMusic> fusedMusics = musicInfo2.getFusedMusics();
            List<FusedMusic> fusedMusics2 = musicInfo.getFusedMusics();
            if (fusedMusics.size() != fusedMusics2.size()) {
                return false;
            }
            int i = 0;
            for (FusedMusic fusedMusic : fusedMusics) {
                int i2 = i + 1;
                if (i >= 0) {
                    FusedMusic fusedMusic2 = fusedMusic;
                    FusedMusic fusedMusic3 = (FusedMusic) C13LP.LJJJLZIJ(i, fusedMusics2);
                    if (fusedMusic3 != null && Intrinsics.LJFF(fusedMusic3.getMusicId(), fusedMusic2.getMusicId())) {
                        C536310L1p c536310L1p = LIZ;
                        long startTimeInMs = fusedMusic3.getStartTimeInMs();
                        long startTimeInMs2 = fusedMusic2.getStartTimeInMs();
                        c536310L1p.getClass();
                        if (LJ(startTimeInMs, startTimeInMs2) && LJ(fusedMusic3.getEndTimeInMs(), fusedMusic2.getEndTimeInMs()) && LJ(fusedMusic3.getPlayStartTimeInMs(), fusedMusic2.getPlayStartTimeInMs())) {
                            i = i2;
                        }
                    }
                    return false;
                }
                C1697810uHb.LJIJI();
                throw null;
            }
            return true;
        }
        if (!Intrinsics.LJFF(musicInfo.getMusicId(), musicInfo2.getMusicId()) || !LJ(musicInfo.getMusicStart(), musicInfo2.getMusicStart())) {
            return false;
        }
        return true;
    }

    public static boolean LJ(long j, long j2) {
        if (Math.abs(j - j2) < 1000) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(UgcTemplateData ugcTemplateData, String str) {
        if (ugcTemplateData == null || !LJI(ugcTemplateData, str) || LIZLLL(ugcTemplateData.templateMusicInfo, ugcTemplateData.awemeMusicInfo)) {
            return false;
        }
        return true;
    }

    public static boolean LJI(UgcTemplateData ugcTemplateData, String str) {
        MusicInfo musicInfo;
        List<FusedMusic> fusedMusics;
        MusicInfo musicInfo2;
        List<FusedMusic> fusedMusics2;
        String templateId;
        if (ugcTemplateData == null) {
            return false;
        }
        if (!C0B7R.LIZ() && !Intrinsics.LJFF(str, "mdp_square")) {
            MDPRecommendTemplateInfo mDPRecommendTemplateInfo = ugcTemplateData.mdpRecommendTemplateInfo;
            if (mDPRecommendTemplateInfo != null) {
                templateId = mDPRecommendTemplateInfo.getTemplateId();
            } else {
                templateId = null;
            }
            if (!C1533950q1J.LJ(templateId)) {
                return false;
            }
        }
        ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null);
        if (iCommerceMediaService == null || iCommerceMediaService.LIZLLL() || (musicInfo = ugcTemplateData.awemeMusicInfo) == null || (fusedMusics = musicInfo.getFusedMusics()) == null || !(!fusedMusics.isEmpty()) || (musicInfo2 = ugcTemplateData.awemeMusicInfo) == null || (fusedMusics2 = musicInfo2.getFusedMusics()) == null || fusedMusics2.isEmpty()) {
            return false;
        }
        Iterator<FusedMusic> it2 = fusedMusics2.iterator();
        while (it2.hasNext()) {
            if (!Intrinsics.LIZIZ(it2.next().getVolume(), 0.0d)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJII(UgcTemplateData ugcTemplateData, String str) {
        if (ugcTemplateData == null) {
            return false;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSameMusic = ");
        sbLIZ.append(LIZLLL(ugcTemplateData.templateMusicInfo, ugcTemplateData.awemeMusicInfo));
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (!LJIIIIZZ(ugcTemplateData, str) || LIZLLL(ugcTemplateData.templateMusicInfo, ugcTemplateData.awemeMusicInfo)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(UgcTemplateData ugcTemplateData, String str) {
        String musicId;
        List<FusedMusic> fusedMusics;
        String templateId;
        if (ugcTemplateData == null) {
            return false;
        }
        Float fValueOf = null;
        if (!C0B7R.LIZ() && !Intrinsics.LJFF(str, "mdp_square")) {
            MDPRecommendTemplateInfo mDPRecommendTemplateInfo = ugcTemplateData.mdpRecommendTemplateInfo;
            if (mDPRecommendTemplateInfo != null) {
                templateId = mDPRecommendTemplateInfo.getTemplateId();
            } else {
                templateId = null;
            }
            if (!C1533950q1J.LJ(templateId)) {
                return false;
            }
        }
        ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null);
        if (iCommerceMediaService == null || iCommerceMediaService.LIZLLL()) {
            return false;
        }
        MusicInfo musicInfo = ugcTemplateData.awemeMusicInfo;
        if (musicInfo != null) {
            musicId = musicInfo.getMusicId();
        } else {
            musicId = null;
        }
        if (!C1533950q1J.LJ(musicId)) {
            return false;
        }
        MusicInfo musicInfo2 = ugcTemplateData.awemeMusicInfo;
        if (musicInfo2 != null && (fusedMusics = musicInfo2.getFusedMusics()) != null && !fusedMusics.isEmpty()) {
            return false;
        }
        MusicInfo musicInfo3 = ugcTemplateData.awemeMusicInfo;
        if (musicInfo3 != null) {
            fValueOf = Float.valueOf(musicInfo3.getMusicVolume());
        }
        if (Intrinsics.LIZLLL(fValueOf, 0.0f)) {
            return false;
        }
        return true;
    }
}
