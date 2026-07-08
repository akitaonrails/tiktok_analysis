package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SourceFromEntities;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Qq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682660Qq8 {
    public static <T extends InterfaceC682670Qq9> SourceFromEntities LIZ(InterfaceC682650Qq7<T> interfaceC682650Qq7) {
        T next;
        List<T> fusionBlockList = interfaceC682650Qq7.getFusionBlockList();
        if (fusionBlockList == null) {
            return null;
        }
        Iterator<T> it2 = fusionBlockList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Integer type = next.getType();
                if (type != null && type.intValue() == 7) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        T t = next;
        if (t == null) {
            return null;
        }
        return t.getSummarySource();
    }

    public static <T extends InterfaceC682670Qq9> boolean LIZIZ(InterfaceC682650Qq7<T> interfaceC682650Qq7, EnumC682700QqC enumC682700QqC) {
        int i = C682690QqB.LIZ[enumC682700QqC.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                List<T> fusionBlockList = interfaceC682650Qq7.getFusionBlockList();
                if (fusionBlockList != null && !fusionBlockList.isEmpty()) {
                    Iterator<T> it2 = fusionBlockList.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().getShortAnswerFormat() != null) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }
            throw new C1954807lC();
        }
        List<T> landingPageBlockList = interfaceC682650Qq7.getLandingPageBlockList();
        if (landingPageBlockList != null && !landingPageBlockList.isEmpty()) {
            Iterator<T> it3 = landingPageBlockList.iterator();
            while (it3.hasNext()) {
                if (it3.next().getLandingPageShortAnswerFormat() != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static <T extends InterfaceC682670Qq9> void LIZJ(InterfaceC682650Qq7<T> interfaceC682650Qq7, String str) {
        List<T> fusionBlockList = interfaceC682650Qq7.getFusionBlockList();
        if (fusionBlockList == null) {
            fusionBlockList = C13BV.INSTANCE;
        }
        List<T> landingPageBlockList = interfaceC682650Qq7.getLandingPageBlockList();
        if (landingPageBlockList == null) {
            landingPageBlockList = C13BV.INSTANCE;
        }
        for (InterfaceC682670Qq9 interfaceC682670Qq9 : C13LP.LJLIL(landingPageBlockList, fusionBlockList)) {
            List<Aweme> subVideos = interfaceC682670Qq9.getSubVideos();
            if (subVideos != null) {
                int i = 0;
                for (Aweme aweme : subVideos) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        Aweme aweme2 = aweme;
                        AwemeExtKt.appendExtraParamUseInSearch(aweme2, "multi_summary_sub_title", interfaceC682670Qq9.getSubTitle());
                        AwemeExtKt.appendExtraParamUseInSearch(aweme2, "multi_summary_sub_index", String.valueOf(i));
                        AwemeExtKt.appendExtraParamUseInSearch(aweme2, "avoid_click_sug", "1");
                        if (str != null) {
                            AwemeExtKt.appendExtraParamUseInSearch(aweme2, "token_type", str);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    }
}
