package X;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446160nji {
    /* JADX WARN: Multi-variable type inference failed */
    public static CategoryPageModel LIZ() {
        List listLJIIJJI = C1697810uHb.LJIIJJI("chipmunk", "baritone");
        Application application = C0CHQ.LIZ;
        int i = 0;
        List listLJIIJJI2 = C1697810uHb.LJIIJJI(application.getString(2131826990), application.getString(2131826989));
        List listLJIIJJI3 = C1697810uHb.LJIIJJI("default_1", "default_2");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI2, 10));
        Iterator it2 = listLJIIJJI2.iterator();
        int i2 = -1;
        while (it2.hasNext()) {
            it2.next();
            int i3 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            long j = 0;
            int i4 = -1;
            Effect effect = new Effect(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, j, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i4, i4, 15, 0 == true ? 1 : 0);
            effect.setEffectId(String.valueOf(i2));
            effect.setName((String) ListProtector.get(listLJIIJJI2, i));
            effect.setUnzipPath(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJ((String) ListProtector.get(listLJIIJJI, i)));
            effect.setTags(Collections.singletonList(ListProtector.get(listLJIIJJI3, i)));
            arrayList.add(effect);
            i = i3;
            i2--;
        }
        CategoryPageModel categoryPageModel = new CategoryPageModel(null, new ArrayList(), null);
        CategoryEffectModel categoryEffectModel = new CategoryEffectModel("", "", false, 0, 0, new ArrayList(), new ArrayList(), new ArrayList(), 0);
        categoryEffectModel.setEffects(arrayList);
        categoryPageModel.setCategoryEffects(categoryEffectModel);
        return categoryPageModel;
    }

    public static void LIZJ() {
        File[] fileArrListFiles;
        C1446170njj c1446170njj = new C1446170njj(C0CHQ.LIZ);
        C0CHQ.LIZ().getApplicationService().getClass();
        C844470XAv.LIZ.getClass();
        int iLIZLLL = (int) C844470XAv.LIZLLL();
        if (iLIZLLL != c1446170njj.LIZ(0) || (fileArrListFiles = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJ("")).listFiles()) == null || fileArrListFiles.length == 0) {
            C0CHQ.LIZ().LJJIL().LJI();
            C15O7.LIZJ(new Callable() { // from class: X.08pQ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("AudioEffectHelper@252.copyInternalAudioResources$1");
                    Application application = C0CHQ.LIZ;
                    C08SA.LIZLLL(application, R.raw.baritone, C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJ(""));
                    C08SA.LIZLLL(application, R.raw.chipmunk, C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJ(""));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AudioEffectHelper@252.copyInternalAudioResources$1");
                    return unit;
                }
            });
            ((SharedPreferences) c1446170njj.LIZ.getValue()).edit().putInt("resource_version", iLIZLLL).apply();
        }
    }

    public static final String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String uploadId;
        AudioEffectParam veAudioEffectParam = videoPublishEditModel.getVeAudioEffectParam();
        if (veAudioEffectParam == null || (uploadId = veAudioEffectParam.getUploadId()) == null) {
            return "";
        }
        return uploadId;
    }

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        AudioEffectParam veAudioEffectParam;
        if (videoPublishEditModel != null && (veAudioEffectParam = videoPublishEditModel.getVeAudioEffectParam()) != null) {
            LJ(videoPublishEditModel, veAudioEffectParam.getChallenge());
            Iterator<AVChallenge> it2 = veAudioEffectParam.getChallenges().iterator();
            while (it2.hasNext()) {
                LJ(videoPublishEditModel, it2.next());
            }
        }
    }

    public static void LJ(VideoPublishEditModel videoPublishEditModel, AVChallenge aVChallenge) {
        AVChallenge next;
        List<AVChallenge> recordStickerChallengeList;
        if (aVChallenge != null && videoPublishEditModel.challenges != null) {
            StickerChallenge stickerChallenge = videoPublishEditModel.getStickerChallenge();
            Object obj = null;
            if (stickerChallenge != null && (recordStickerChallengeList = stickerChallenge.getRecordStickerChallengeList()) != null) {
                Iterator<AVChallenge> it2 = recordStickerChallengeList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(aVChallenge.challengeName, next.challengeName)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
            } else {
                next = null;
            }
            List<AVChallenge> list = C1443030nef.LJII().LIZ;
            if (list != null) {
                Iterator it3 = ((ArrayList) list).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (Intrinsics.LJFF(((AVChallenge) next2).challengeName, aVChallenge.challengeName)) {
                        obj = next2;
                        break;
                    }
                }
            }
            if (next == null && obj == null) {
                videoPublishEditModel.challenges.remove(aVChallenge);
                videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(aVChallenge);
            }
        }
    }
}
