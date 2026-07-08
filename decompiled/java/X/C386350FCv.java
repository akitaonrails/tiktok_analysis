package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386350FCv {
    public static final String LIZIZ(Effect effect) {
        C1446130njf.LIZ.getClass();
        String strLJFF = C1446130njf.LJFF(effect, "from_tag");
        if (strLJFF == null) {
            return "";
        }
        return strLJFF;
    }

    public static final boolean LIZJ(Effect effect) {
        C1446130njf.LIZ.getClass();
        return C1446130njf.LIZIZ(effect, "is_voice_clone", false);
    }

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel, Effect effect) {
        ArrayList arrayList = new ArrayList();
        List<String> challenge = effect.getChallenge();
        if (challenge != null) {
            Iterator<String> it2 = challenge.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        LJ(arrayList, videoPublishEditModel);
    }

    public static final void LJ(List list, VideoPublishEditModel videoPublishEditModel) {
        List<AVChallenge> readTextChallenges;
        AVChallenge next;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            TextStickerChallenges textStickerChallenges = videoPublishEditModel.getTextStickerChallenges();
            if (textStickerChallenges != null && (readTextChallenges = textStickerChallenges.getReadTextChallenges()) != null) {
                Iterator<AVChallenge> it3 = readTextChallenges.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.LJFF(next.cid, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                AVChallenge aVChallenge = next;
                if (aVChallenge != null) {
                    videoPublishEditModel.removeTitleAndChallenge(aVChallenge);
                    linkedHashSet.add(aVChallenge);
                }
            }
            TextStickerChallenges textStickerChallenges2 = videoPublishEditModel.getTextStickerChallenges();
            if (textStickerChallenges2 != null) {
                textStickerChallenges2.removeReadTextChallenge(str, AFwS234S0000000_5.get$arr$(122));
            }
        }
        C0CHQ.LIZ().getPublishService().LJJJJZ();
        C857950XlB.LJFF(videoPublishEditModel, linkedHashSet);
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
            new C1645820svk((String) it3.next(), lifecycleOwner).LIZ(new InterfaceC1645830svl() { // from class: X.0F9c
                @Override // X.InterfaceC1645830svl
                public final void LIZ(AVChallenge aVChallenge) {
                    TextStickerChallenges textStickerChallenges = videoPublishEditModel.getTextStickerChallenges();
                    if (textStickerChallenges != null) {
                        textStickerChallenges.addReadTextChallenge(aVChallenge);
                    }
                }
            });
        }
    }
}
