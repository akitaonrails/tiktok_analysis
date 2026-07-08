package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0njh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446150njh {
    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        AVChallenge challenge;
        List<AVChallenge> challenges;
        List<AVChallenge> challenges2;
        AudioEffectParam veAudioEffectParam = videoPublishEditModel.getVeAudioEffectParam();
        if (veAudioEffectParam != null) {
            challenge = veAudioEffectParam.getChallenge();
        } else {
            challenge = null;
        }
        videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(challenge);
        AudioEffectParam veAudioEffectParam2 = videoPublishEditModel.getVeAudioEffectParam();
        if (veAudioEffectParam2 != null) {
            veAudioEffectParam2.setChallenge(null);
        }
        AudioEffectParam veAudioEffectParam3 = videoPublishEditModel.getVeAudioEffectParam();
        if (veAudioEffectParam3 != null && (challenges2 = veAudioEffectParam3.getChallenges()) != null) {
            Iterator<AVChallenge> it2 = challenges2.iterator();
            while (it2.hasNext()) {
                videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(it2.next());
            }
        }
        AudioEffectParam veAudioEffectParam4 = videoPublishEditModel.getVeAudioEffectParam();
        if (veAudioEffectParam4 != null && (challenges = veAudioEffectParam4.getChallenges()) != null) {
            challenges.clear();
        }
        C1446160nji.LIZLLL(videoPublishEditModel);
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel, Effect effect) {
        List<AVChallenge> challenges;
        Iterator<AVChallenge> it2;
        AVChallenge challenge;
        List<String> challenge2 = effect.getChallenge();
        if (challenge2 != null) {
            for (String str : challenge2) {
                AudioEffectParam veAudioEffectParam = videoPublishEditModel.getVeAudioEffectParam();
                if (veAudioEffectParam != null && (challenge = veAudioEffectParam.getChallenge()) != null && Intrinsics.LJFF(challenge.cid, str)) {
                    videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(challenge);
                    C1446160nji.LJ(videoPublishEditModel, challenge);
                    AudioEffectParam veAudioEffectParam2 = videoPublishEditModel.getVeAudioEffectParam();
                    if (veAudioEffectParam2 != null) {
                        veAudioEffectParam2.setChallenge(null);
                    }
                }
                AudioEffectParam veAudioEffectParam3 = videoPublishEditModel.getVeAudioEffectParam();
                if (veAudioEffectParam3 == null || (challenges = veAudioEffectParam3.getChallenges()) == null || (it2 = challenges.iterator()) == null) {
                    return;
                }
                while (it2.hasNext()) {
                    AVChallenge next = it2.next();
                    if (Intrinsics.LJFF(next.cid, str)) {
                        videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(next);
                        C1446160nji.LJ(videoPublishEditModel, next);
                        it2.remove();
                    }
                }
            }
        }
    }

    public static final void LIZ(LifecycleOwner lifecycleOwner, final VideoPublishEditModel videoPublishEditModel, Effect effect) {
        ArrayList arrayList = new ArrayList();
        List<String> challenge = effect.getChallenge();
        if (challenge != null) {
            Iterator<String> it2 = challenge.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            new C1645820svk((String) it3.next(), lifecycleOwner).LIZ(new InterfaceC1645830svl() { // from class: X.0njg
                @Override // X.InterfaceC1645830svl
                public final void LIZ(AVChallenge aVChallenge) {
                    AudioEffectParam veAudioEffectParam = videoPublishEditModel.getVeAudioEffectParam();
                    if (veAudioEffectParam != null) {
                        veAudioEffectParam.setChallenge(aVChallenge);
                        if (!veAudioEffectParam.getChallenges().contains(aVChallenge)) {
                            veAudioEffectParam.getChallenges().add(aVChallenge);
                        }
                    }
                }
            });
        }
    }
}
