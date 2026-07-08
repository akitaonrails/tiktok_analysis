package X;

import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.model.EcFeedSuggestWordList;
import com.ss.android.ugc.aweme.ecommerce.model.EcSuggestWordStruct;
import com.ss.android.ugc.aweme.ecommerce.model.EcWordStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qa3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672690Qa3 {
    public static C672770QaB LIZIZ(VideoItemParams videoItemParams) {
        List<EcSuggestWordStruct> suggestWords;
        String word;
        String wordId;
        EcWordStruct ecWordStruct;
        EcWordStruct ecWordStruct2;
        String word2;
        EcWordStruct ecWordStruct3;
        C672770QaB c672770QaB = new C672770QaB();
        EcFeedSuggestWordList ecFeedSuggestWordList = videoItemParams.getAweme().getEcFeedSuggestWordList();
        if (ecFeedSuggestWordList != null && (suggestWords = ecFeedSuggestWordList.getSuggestWords()) != null) {
            for (EcSuggestWordStruct ecSuggestWordStruct : suggestWords) {
                if (ecSuggestWordStruct != null && Intrinsics.LJFF("feed_bar", ecSuggestWordStruct.getScene())) {
                    if (Intrinsics.LJFF("1", ecSuggestWordStruct.getQrecVirtualEnable())) {
                        C1ER1 c1er1 = C1ER1.LIZIZ;
                        c1er1.G(videoItemParams.getAweme().getAid(), true);
                        List<EcWordStruct> words = ecSuggestWordStruct.getWords();
                        if (words != null && (ecWordStruct3 = (EcWordStruct) ListProtector.get(words, 0)) != null) {
                            word2 = ecWordStruct3.getWord();
                        } else {
                            word2 = null;
                        }
                        c1er1.LLII(word2, videoItemParams.getAweme().getAid());
                    }
                    List<EcWordStruct> words2 = ecSuggestWordStruct.getWords();
                    String str = "";
                    if (words2 == null || (ecWordStruct2 = (EcWordStruct) ListProtector.get(words2, 0)) == null || (word = ecWordStruct2.getWord()) == null) {
                        word = "";
                    }
                    c672770QaB.LIZ = word;
                    List<EcWordStruct> words3 = ecSuggestWordStruct.getWords();
                    if (words3 == null || (ecWordStruct = (EcWordStruct) ListProtector.get(words3, 0)) == null || (wordId = ecWordStruct.getWordId()) == null) {
                        wordId = "";
                    }
                    c672770QaB.LIZIZ = wordId;
                    String qrecVirtualEnable = ecSuggestWordStruct.getQrecVirtualEnable();
                    if (qrecVirtualEnable != null) {
                        str = qrecVirtualEnable;
                    }
                    c672770QaB.LIZJ = str;
                    Integer redirectPage = ecSuggestWordStruct.getRedirectPage();
                    if (redirectPage != null) {
                        int iIntValue = redirectPage.intValue();
                        EnumC672720Qa6.Companion.getClass();
                        EnumC672720Qa6 enumC672720Qa6 = EnumC672720Qa6.MAP.get(Integer.valueOf(iIntValue));
                        if (enumC672720Qa6 != null) {
                            c672770QaB.LIZLLL = enumC672720Qa6;
                        }
                    }
                }
            }
        }
        return c672770QaB;
    }

    public static boolean LIZ(VideoItemParams videoItemParams, C672770QaB c672770QaB) {
        C19EG activity;
        IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
        String str = c672770QaB.LIZ;
        String str2 = c672770QaB.LIZJ;
        Fragment fragment = videoItemParams.fragment;
        if (fragment != null) {
            activity = fragment.getActivity();
        } else {
            activity = null;
        }
        return iEcomSearchService.LJJIIJZLJL(activity, str, str2);
    }
}
