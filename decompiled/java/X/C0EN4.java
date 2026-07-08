package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectReuseDetails;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0EN4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EN4 {
    public final int[] LIZ = C0EZ3.LIZ();

    public final boolean LIZ(EditEffectReuseDetails editEffectReuseDetails, Effect effect, int i, NLEModel nLEModel, int i2, C0EYJ c0eyj, VideoPublishEditModel videoPublishEditModel, boolean z) {
        long j;
        long j2;
        String strLJJLIIIJ;
        long j3;
        videoPublishEditModel.creativeModel.editEffectModel.defaultEffectList.add(effect);
        C348380DlE c348380DlE = new C348380DlE();
        long j4 = 0;
        if (z) {
            j = 0;
        } else {
            j = editEffectReuseDetails.startTime;
        }
        c348380DlE.LIZIZ = j;
        if (z) {
            j2 = i2;
        } else {
            j2 = editEffectReuseDetails.endTime;
            long j5 = i2;
            if (j2 > j5) {
                j2 = j5;
            }
        }
        c348380DlE.LIZJ = j2;
        c348380DlE.LIZLLL = effect.getUnzipPath();
        c348380DlE.LJFF = effect.getEffect_id();
        c348380DlE.LJII = effect.getName();
        int[] iArr = this.LIZ;
        c348380DlE.LJIIIIZZ = iArr[i % iArr.length];
        c348380DlE.LJIIIZ = 1;
        c348380DlE.LJIIJ = "";
        c348380DlE.LJ = effect.getExtra();
        List<String> challenge = effect.getChallenge();
        String strLJJLIIIJ2 = null;
        if (challenge != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(challenge, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        c348380DlE.LJIILLIIL = String.valueOf(strLJJLIIIJ);
        c348380DlE.LJIIJJI = C348400DlG.LIZ(nLEModel) + 1;
        c348380DlE.LJIIL = effect.getResource_id();
        C348380DlE c348380DlE2 = c348380DlE;
        if (C123100dR.LIZ(effect.getExtra())) {
            C1446130njf.LIZ.getClass();
            boolean zLIZIZ = C1446130njf.LIZIZ(effect, "if_capcut", false);
            String strLIZ = C369900Eeq.LIZ(effect);
            c348380DlE2 = c348380DlE;
            c348380DlE2 = c348380DlE;
            if (zLIZIZ && strLIZ != null) {
                C348320Dl8 c348320Dl8 = new C348320Dl8();
                c348320Dl8.LJJIIJ = new JSONObject(strLIZ);
                if (!z) {
                    j4 = editEffectReuseDetails.startTime;
                }
                c348320Dl8.LIZIZ = j4;
                if (z) {
                    j3 = i2;
                } else {
                    j3 = editEffectReuseDetails.endTime;
                    long j6 = i2;
                    if (j3 > j6) {
                        j3 = j6;
                    }
                }
                c348320Dl8.LIZJ = j3;
                c348320Dl8.LIZLLL = effect.getUnzipPath();
                c348320Dl8.LJFF = effect.getEffect_id();
                c348320Dl8.LJII = effect.getName();
                int[] iArr2 = this.LIZ;
                c348320Dl8.LJIIIIZZ = iArr2[i % iArr2.length];
                c348320Dl8.LJIIIZ = 1;
                c348320Dl8.LJIIJ = "";
                List<String> challenge2 = effect.getChallenge();
                if (challenge2 != null) {
                    strLJJLIIIJ2 = C13LP.LJJLIIIJ(challenge2, ",", null, null, 0, null, null, 62);
                }
                c348320Dl8.LJIILLIIL = String.valueOf(strLJJLIIIJ2);
                c348320Dl8.LJ = effect.getExtra();
                c348320Dl8.LJIIJJI = C348400DlG.LIZ(nLEModel) + 1;
                c348320Dl8.LJIIL = effect.getResource_id();
                c348380DlE2 = c348320Dl8;
            }
        }
        EffectPointModel effectPointModelLIZ = C363510EMz.LIZ(c348380DlE2, false, i2);
        effectPointModelLIZ.setUuid(c0eyj.LIZJ(c348380DlE2));
        effectPointModelLIZ.setSelectFrom(videoPublishEditModel.mShootWay);
        effectPointModelLIZ.setEntrancePoint("null");
        effectPointModelLIZ.setIndex(-1);
        return videoPublishEditModel.getEditEffectModel().effectList.add(effectPointModelLIZ);
    }
}
